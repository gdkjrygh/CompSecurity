// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            v, w, aa, j

private static class 
    implements 
{

    private final w uU = new w();

    public void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            uU.uW = i;
            return;
        } else
        {
            aa.z((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void a(String s, String s1)
    {
    }

    public void b(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            uU.so = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            uU.sp = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            uU.uV = s1;
            return;
        } else
        {
            aa.z((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void c(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = uU;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.uX = i;
            return;
        } else
        {
            aa.z((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public w cB()
    {
        return uU;
    }

    public j cg()
    {
        return cB();
    }

    public ()
    {
    }
}
