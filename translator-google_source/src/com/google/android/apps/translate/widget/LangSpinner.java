// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.t;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.tts.MyTts;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ab, ad, aa, ac, 
//            ae

public class LangSpinner extends TextView
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener, j
{

    private static final Map a = Maps.b();
    private static final Map b = Maps.b();
    private final ac c;
    private final ab d;
    private ae e;
    private Language f;
    private Event g;
    private long h;
    private final boolean i;
    private final boolean j;

    public LangSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new ab(getContext());
        c = new ad(this);
        context = context.obtainStyledAttributes(attributeset, t.LangSpinner);
        i = context.getBoolean(t.LangSpinner_isForTarget, false);
        j = context.getBoolean(t.LangSpinner_disablePinButton, false);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    static int a(Language language)
    {
        String s = language.getShortName();
        if (!"auto".equals(s))
        {
            if ("en".equals(s))
            {
                return 3;
            }
            language = s;
            if (s.startsWith("zh-"))
            {
                language = "zh";
            }
            language = (Integer)a.get(language);
            if (language != null)
            {
                return language.intValue();
            }
        }
        return 0;
    }

    static ac a(LangSpinner langspinner)
    {
        return langspinner.c;
    }

    static Map a()
    {
        return a;
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            a.clear();
            b.clear();
        }
        (new aa(this)).a(new Void[0]);
    }

    static ab b(LangSpinner langspinner)
    {
        return langspinner.d;
    }

    static Map b()
    {
        return b;
    }

    static ae c(LangSpinner langspinner)
    {
        return langspinner.e;
    }

    public final void a(int l, Bundle bundle)
    {
        if (l == 19 && c != null && c.isShowing())
        {
            a(false);
        }
    }

    public long getLastOpenTime()
    {
        return h;
    }

    public Language getSelectedLanguage()
    {
        return f;
    }

    public void onClick(View view)
    {
        if (e != null)
        {
            d.clear();
            Language language;
            for (view = e.a(this).iterator(); view.hasNext(); d.add(language))
            {
                language = (Language)view.next();
            }

            a(true);
            h = System.currentTimeMillis();
            com.google.android.libraries.translate.e.h.a(this, new int[] {
                19
            });
            ((MyTts)Singleton.b.b()).b();
            view = d;
            boolean flag;
            if (!j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ab.a(view, flag);
            c.show();
            if (g != null)
            {
                Singleton.b().a(g, null, null);
            }
        }
    }

    public void onDismiss()
    {
        com.google.android.libraries.translate.e.h.a(this);
        ab.a(d, false);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName("android.widget.Spinner");
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        if (l < d.getCount())
        {
            if ((adapterview = (Language)d.getItem(l)) != null)
            {
                c.dismiss();
                view = f;
                setSelectedLang(adapterview);
                if (e != null)
                {
                    e.a(this, f, view, l);
                    d.clear();
                    return;
                }
            }
        }
    }

    protected void onSizeChanged(int l, int i1, int j1, int k1)
    {
        super.onSizeChanged(l, i1, j1, k1);
        if (c.isShowing())
        {
            c.dismiss();
        }
        l = getResources().getDimensionPixelSize(com.google.android.apps.translate.k.lang_popup_min_width);
        c.setWidth(Math.max(getWidth(), l));
    }

    public void setClickEvent(Event event)
    {
        g = event;
    }

    public void setSelectedLang(Language language)
    {
        f = language;
        setText(f.toString());
        StringBuilder stringbuilder = new StringBuilder();
        if (i)
        {
            stringbuilder.append(getContext().getString(r.label_target_lang, new Object[] {
                language.getLongName()
            }));
        } else
        {
            stringbuilder.append(getContext().getString(r.label_source_lang, new Object[] {
                language.getLongName()
            }));
        }
        setContentDescription(stringbuilder.toString());
    }

    public void setSpinnerHandler(ae ae1)
    {
        e = ae1;
    }

}
