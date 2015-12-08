// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            v, w, aa, j

private static class 
    implements 
{

    private final w wi = new w();

    public void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            wi.wk = i;
            return;
        } else
        {
            aa.D((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void c(String s, String s1)
    {
    }

    public void c(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = wi;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.wl = i;
            return;
        } else
        {
            aa.D((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public j cB()
    {
        return cX();
    }

    public w cX()
    {
        return wi;
    }

    public void d(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            wi.tC = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            wi.tD = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            wi.wj = s1;
            return;
        } else
        {
            aa.D((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public ()
    {
    }
}
