// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            aa, c, v, g, 
//            P

private static final class a
    implements a
{

    private final v a;
    private final c b = new c();

    public final P a()
    {
        return b;
    }

    public final void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            b.d = i;
            return;
        } else
        {
            a.a().c("Int xml configuration name not recognized", s);
            return;
        }
    }

    public final void a(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            b.a = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            b.b = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            b.c = s1;
            return;
        } else
        {
            a.a().c("String xml configuration name not recognized", s);
            return;
        }
    }

    public final void a(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = b;
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
            a.a().c("Bool xml configuration name not recognized", s);
            return;
        }
    }

    public (v v1)
    {
        a = v1;
    }
}
