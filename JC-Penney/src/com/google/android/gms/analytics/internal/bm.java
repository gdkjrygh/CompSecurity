// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            ba, c, ab, j, 
//            ay

class bm
    implements ba
{

    private final ab a;
    private final c b = new c();

    public bm(ab ab1)
    {
        a = ab1;
    }

    public ay a()
    {
        return b();
    }

    public void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            b.d = i;
            return;
        } else
        {
            a.f().d("Int xml configuration name not recognized", s);
            return;
        }
    }

    public void a(String s, String s1)
    {
    }

    public void a(String s, boolean flag)
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
            a.f().d("Bool xml configuration name not recognized", s);
            return;
        }
    }

    public c b()
    {
        return b;
    }

    public void b(String s, String s1)
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
            a.f().d("String xml configuration name not recognized", s);
            return;
        }
    }
}
