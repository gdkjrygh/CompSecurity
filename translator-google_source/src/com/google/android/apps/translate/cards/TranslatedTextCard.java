// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ag;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.p;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.w;
import com.google.android.apps.translate.widget.SpeakerView;
import com.google.android.apps.translate.widget.StarButton;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.l;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.ah;
import com.google.android.libraries.translate.speech.c;

// Referenced classes of package com.google.android.apps.translate.cards:
//            AbstractCard, b, f

public class TranslatedTextCard extends AbstractCard
    implements android.view.MenuItem.OnMenuItemClickListener, android.view.View.OnClickListener, android.view.View.OnCreateContextMenuListener, l
{

    private final b a;
    private final SpeakerView b;
    private final TextView c = (TextView)findViewById(0x1020014);
    private f d;

    public TranslatedTextCard(Context context, b b1)
    {
        super(context, o.card_result);
        d = null;
        b1.h.put(1, this);
        a = b1;
        b = (SpeakerView)findViewById(m.speaker_view);
        b.setTextToPlay(b1.c.a(0), b1.f, "target");
        c.setText(b1.c.a(0));
        if (b1.g != null)
        {
            c.setTypeface(b1.g);
        }
        context = (TextView)findViewById(m.txt_lang);
        context.setText(b1.f.getLongName());
        ((StarButton)findViewById(m.btn_star)).setEntry(b1.d);
        Object obj = b1.c.a(1);
        int i;
        if (((String) (obj)).isEmpty())
        {
            findViewById(m.txt_transliteration).setVisibility(4);
        } else
        {
            a(m.txt_transliteration, ((CharSequence) (obj)));
        }
        findViewById(m.speaker_view_wrapper).setOnClickListener(this);
        if (!b.a)
        {
            context.setBackgroundColor(0);
        }
        context = findViewById(m.menu_overflow);
        obj = new ag(getContext(), context);
        a(((ag) (obj)).b);
        context.setOnClickListener(new com.google.android.apps.translate.e.l(((ag) (obj)), context));
        context = findViewById(m.ind_offline);
        if (b1.c.a())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        context.setVisibility(i);
        findViewById(m.copy_text).setOnClickListener(this);
    }

    private void a(Menu menu)
    {
        (new MenuInflater(getContext())).inflate(p.result_card_menu, menu);
        for (int i = menu.size() - 1; i >= 0; i--)
        {
            menu.getItem(i).setOnMenuItemClickListener(this);
        }

        menu.findItem(m.menu_refresh).setVisible(a.c.a());
        menu.findItem(m.menu_conv).setVisible(((c)Singleton.e.b()).a(new Language[] {
            a.e, a.f
        }));
    }

    public final void a(Object obj)
    {
        obj = (com.google.android.libraries.translate.core.m)obj;
        if (obj != null)
        {
            findViewById(m.txt_transliteration).setVisibility(0);
            a(m.txt_transliteration, ((CharSequence) (((com.google.android.libraries.translate.core.m) (obj)).a(1))));
            a.c = ((com.google.android.libraries.translate.core.m) (obj));
            a.a(getContext());
            ((StarButton)findViewById(m.btn_star)).setEntry(a.d);
        }
    }

    public final void a(String s, String s1)
    {
        Object obj = e.a(getContext());
        Language language = ((d) (obj)).b(a.f.getShortName());
        if (com.google.android.libraries.translate.languages.c.a(a.e.getShortName()))
        {
            obj = ((d) (obj)).a(getContext());
        } else
        {
            obj = ((d) (obj)).c(a.e.getShortName());
        }
        s = com.google.android.apps.translate.e.k.a(s, language, ((Language) (obj)), s1);
        s.putLong("lang_anim_delay", 0L);
        s.putBoolean("update_lang", true);
        h.a(3, s);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c.requestFocus();
    }

    public void onClick(View view)
    {
        int i = view.getId();
        if (i == m.menu_overflow)
        {
            view.showContextMenu();
        } else
        {
            if (i == m.speaker_view_wrapper)
            {
                b.a();
                Singleton.b().a(Event.RESULT_TTS, a.e.getShortName(), a.f.getShortName());
                return;
            }
            if (i == m.copy_text)
            {
                com.google.android.libraries.translate.e.o.a(getContext(), c.getText().toString());
                com.google.android.libraries.translate.e.m.a(r.msg_translation_copied, 0);
                Singleton.b().a(Event.RESULT_COPY, null, null);
                return;
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        a(contextmenu);
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        boolean flag = false;
        int i = menuitem.getItemId();
        if (i == m.menu_share)
        {
            menuitem = (new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", a.c.a(0));
            getContext().startActivity(Intent.createChooser(menuitem, getContext().getText(r.title_share_translation)));
            Singleton.b().a(Event.RESULT_SHARE, null, null);
        } else
        if (i == m.menu_fullscreen)
        {
            menuitem = new w(getContext(), a.c.a(0), a.f, Event.RESULT_FULLSCREEN);
            Activity activity = a.a;
            menuitem.b = activity;
            activity.setRequestedOrientation(6);
            menuitem.show();
        } else
        if (i == m.menu_conv)
        {
            menuitem = com.google.android.apps.translate.e.k.a(a.b, a.e, a.f, null);
            menuitem.putString("output", a.c.toString());
            h.a(12, menuitem);
            Singleton.b().a(Event.RESULT_CONV, null, null);
        } else
        {
            if (i != m.menu_swap)
            {
                continue;
            }
            a(c.getText().toString(), "source=cvttx");
            Singleton.b().a(Event.RESULT_REVERSE_TRANSLATE, null, null);
        }
        do
        {
            flag = true;
            do
            {
                return flag;
            } while (i != m.menu_refresh);
            ah.a();
            h.a(3, com.google.android.apps.translate.e.k.a(a.b, a.e, a.f, ""));
        } while (true);
    }
}
