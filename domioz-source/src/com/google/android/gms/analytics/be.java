// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ah, e, h, af

final class be
    implements ah
{

    private final e a = new e();

    public be()
    {
    }

    public final af a()
    {
        return a;
    }

    public final void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            a.d = i;
            return;
        } else
        {
            h.d((new StringBuilder("int configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }

    public final void a(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            a.a = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            a.b = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            a.c = s1;
            return;
        } else
        {
            h.d((new StringBuilder("string configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }

    public final void a(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = a;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.e = i;
            return;
        } else
        {
            h.d((new StringBuilder("bool configuration name not recognized:  ")).append(s).toString());
            return;
        }
    }
}
