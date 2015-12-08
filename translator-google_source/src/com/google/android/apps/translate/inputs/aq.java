// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.os.Handler;
import android.text.Editable;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.apps.translate.e.c;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.e.g;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            at, as, ar

public class aq extends c
{

    public static final int a;
    public static final int b;
    public final Handler c;
    final at d;
    as e;
    private final AtomicReference f;
    private final TextView g;
    private final TextView h;
    private final HorizontalScrollView i;
    private g j;
    private String k;

    public aq(TextView textview, TextView textview1, Language language, Language language1, HorizontalScrollView horizontalscrollview)
    {
        f = new AtomicReference("");
        k = "";
        g = textview;
        h = textview1;
        d = new at(this, language, language1);
        c = new Handler();
        i = horizontalscrollview;
    }

    public aq(TextView textview, Language language, Language language1)
    {
        this(textview, null, language, language1, null);
    }

    static TextView a(aq aq1)
    {
        return aq1.g;
    }

    private void a(int l)
    {
        if (e != null)
        {
            e.a(l);
        }
    }

    static HorizontalScrollView b(aq aq1)
    {
        return aq1.i;
    }

    static AtomicReference c(aq aq1)
    {
        return aq1.f;
    }

    private void c()
    {
        if (i != null)
        {
            i.post(new ar(this));
        }
    }

    private void c(String s)
    {
        try
        {
            g.setText(s);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            e e1 = Singleton.b();
            LogParams logparams = (new LogParams()).addParam("cause", nullpointerexception.getMessage());
            int l;
            if (s == null)
            {
                l = -1;
            } else
            {
                l = s.length();
            }
            e1.a(-2001, logparams.addParam("length", Integer.valueOf(l)));
            return;
        }
    }

    private void d(String s)
    {
        if (h == null)
        {
            return;
        }
        try
        {
            h.setText(s);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            e e1 = Singleton.b();
            LogParams logparams = (new LogParams()).addParam("cause", nullpointerexception.getMessage());
            int l;
            if (s == null)
            {
                l = -1;
            } else
            {
                l = s.length();
            }
            e1.a(-2001, logparams.addParam("length", Integer.valueOf(l)));
            return;
        }
    }

    public void a()
    {
        d.start();
        d.a();
        j = com.google.android.apps.translate.e.d.a(g, at.a(d).getShortName());
    }

    public final void a(String s)
    {
        f.set(s);
    }

    protected void a(String s, com.google.android.libraries.translate.core.m m1)
    {
        if (m1 == null)
        {
            if (k.equals(s))
            {
                a(2);
            }
        } else
        {
            if (k.equals(s))
            {
                c(m1.a(0));
                g.setTag(a, k);
                g.setTag(b, m1);
                s = m1.a(1);
                if (s.length() > 0)
                {
                    d(s);
                }
                a(1);
                c();
                return;
            }
            if (k.startsWith(s))
            {
                s = String.valueOf(m1.a(0));
                c((new StringBuilder(String.valueOf(s).length() + 1)).append(s).append('\u2026').toString());
                s = m1.a(1);
                if (s.length() > 0)
                {
                    d((new StringBuilder(String.valueOf(s).length() + 1)).append(s).append('\u2026').toString());
                }
                a(0);
                c();
                return;
            }
        }
    }

    public void afterTextChanged(Editable editable)
    {
        b(editable.toString());
    }

    public void b()
    {
        e = null;
        d.quit();
        if (j != null)
        {
            j.a();
        }
    }

    public void b(String s)
    {
label0:
        {
            if (!s.equals(k))
            {
                k = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
                c("");
                g.setTag(a, "");
                g.setTag(b, null);
                d("");
                a(1);
            }
            return;
        }
        Object obj1 = g.getText();
        Object obj;
        int l;
        int i1;
        if (h != null)
        {
            obj = h.getText();
        } else
        {
            obj = "";
        }
        l = ((CharSequence) (obj1)).length();
        i1 = ((CharSequence) (obj)).length();
        if (l == 0 || ((CharSequence) (obj1)).charAt(l - 1) != '\u2026')
        {
            obj1 = String.valueOf(((CharSequence) (obj1)).toString());
            c((new StringBuilder(String.valueOf(obj1).length() + 1)).append(((String) (obj1))).append('\u2026').toString());
            if (i1 > 0)
            {
                obj = String.valueOf(((CharSequence) (obj)).toString());
                d((new StringBuilder(String.valueOf(obj).length() + 1)).append(((String) (obj))).append('\u2026').toString());
            }
            a(0);
            c();
        }
        d.a.removeMessages(1);
        d.a.sendMessage(d.a.obtainMessage(1, s));
    }

    static 
    {
        a = m.input_card;
        b = m.result_card;
    }
}
