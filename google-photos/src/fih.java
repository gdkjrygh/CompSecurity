// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Switch;
import android.widget.TextView;

public final class fih extends hgu
{

    final fij a;
    private final String b;
    private final String c;
    private final msm d;
    private boolean e;
    private boolean f;
    private Switch g;

    public fih(String s, String s1, msm msm, fij fij1)
    {
        f = true;
        b = s;
        c = s1;
        a = fij1;
        d = msm;
        if (g != null)
        {
            fij1.a(g);
        }
    }

    public final int a()
    {
        return ag.e;
    }

    public final void a(afn afn)
    {
        afn = (fik)afn;
        ((fik) (afn)).o.setText(b);
        ((fik) (afn)).p.setText(c);
        g = ((fik) (afn)).q;
        b.a(g, d);
        a.a(g);
        g.setChecked(e);
        g.setEnabled(f);
        g.setOnClickListener(new fii(this));
    }

    public final void a(boolean flag)
    {
        if (g == null)
        {
            e = flag;
            return;
        } else
        {
            g.setChecked(flag);
            return;
        }
    }

    public final long b()
    {
        String s = b;
        String s1 = c;
        return (long)(new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("\n").append(s1).toString().hashCode();
    }
}
