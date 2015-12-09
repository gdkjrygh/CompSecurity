// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            n, y, ac, m

public static class 
{

    private final y Bg = new y();

    public void c(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            Bg.Bi = i;
            return;
        } else
        {
            ac.w((new StringBuilder("int configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }

    public void e(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = Bg;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.Bj = i;
            return;
        } else
        {
            ac.w((new StringBuilder("bool configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }

    public y eI()
    {
        return Bg;
    }

    public m en()
    {
        return eI();
    }

    public void g(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            Bg.xZ = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            Bg.ya = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            Bg.Bh = s1;
            return;
        } else
        {
            ac.w((new StringBuilder("string configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }

    public ()
    {
    }
}
