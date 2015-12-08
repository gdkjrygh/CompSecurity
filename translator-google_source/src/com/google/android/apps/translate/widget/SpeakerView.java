// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.t;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.tts.MyTts;
import com.google.android.libraries.translate.tts.b;
import com.google.android.libraries.translate.tts.e;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ToggleImage, TintImageView

public class SpeakerView extends FrameLayout
    implements e
{

    public boolean a;
    private final View b;
    private final ToggleImage c;
    private boolean d;
    private String e;
    private Toast f;
    private String g;
    private Language h;
    private final boolean i;

    public SpeakerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        d = false;
        LayoutInflater.from(context).inflate(o.widget_speaker, this, true);
        b = findViewById(m.progress);
        c = (ToggleImage)findViewById(m.img_speaker);
        c.setLevel(0);
        context = context.obtainStyledAttributes(attributeset, t.SpeakerView);
        c.setChecked(context.getBoolean(t.SpeakerView_whitetheme, false));
        i = context.getBoolean(t.SpeakerView_greyOnDisable, false);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public final void a()
    {
        if (d)
        {
            ((MyTts)Singleton.b.b()).b();
            Singleton.b().a(Event.SPEAKERVIEW_TTS_STOPPED, null, null);
            j();
        } else
        {
            if (a)
            {
                c.setLevel(1);
                d = true;
                ((MyTts)Singleton.b.b()).a(getContext(), h, g, e, this);
                return;
            }
            if (i)
            {
                com.google.android.libraries.translate.e.m.a(r.msg_no_tts, 1);
                return;
            }
        }
    }

    public final void b(int l)
    {
        byte byte0 = 8;
        b.setVisibility(8);
        ToggleImage toggleimage = c;
        if (a)
        {
            byte0 = 0;
        }
        toggleimage.setVisibility(byte0);
        j();
        com.google.android.libraries.translate.e.m.a(com.google.android.libraries.translate.tts.b.a(l), 1);
    }

    public final void b(String s, Language language)
    {
        byte byte0 = 8;
        b.setVisibility(8);
        s = c;
        if (a)
        {
            byte0 = 0;
        }
        s.setVisibility(byte0);
        if (!((AccessibilityManager)Singleton.a.b()).isEnabled())
        {
            f = com.google.android.libraries.translate.e.m.a(getContext().getString(r.msg_speaking, new Object[] {
                language.getLongName()
            }), 0);
        }
    }

    public final void j()
    {
        d = false;
        c.setLevel(0);
        b.setVisibility(8);
        if (f != null)
        {
            f.cancel();
            f = null;
        }
    }

    public final void k()
    {
        b.setVisibility(0);
        c.setVisibility(8);
    }

    public void setTextToPlay(String s, Language language, String s1)
    {
        g = s;
        h = language;
        e = s1;
        a = ((MyTts)Singleton.b.b()).a(language);
        int l;
        if (a || i)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        setVisibility(l);
        language = c;
        if (a)
        {
            l = j.speaker_view_icon;
        } else
        {
            l = j.speaker_view_icon_disabled;
        }
        if (com.google.android.libraries.translate.e.o.g)
        {
            s = language.getContext().getTheme();
            s = language.getResources().getColorStateList(l, s);
        } else
        {
            s = language.getResources().getColorStateList(l);
        }
        language.a(s);
        j();
    }
}
