// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            z, aa, ae, m

private static class 
    implements 
{

    private final aa Bi = new aa();

    public void c(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            Bi.Bk = i;
            return;
        } else
        {
            ae.W((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void e(String s, String s1)
    {
    }

    public void e(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = Bi;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.Bl = i;
            return;
        } else
        {
            ae.W((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public aa eN()
    {
        return Bi;
    }

    public m er()
    {
        return eN();
    }

    public void f(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            Bi.ya = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            Bi.yb = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            Bi.Bj = s1;
            return;
        } else
        {
            ae.W((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public ()
    {
    }
}
