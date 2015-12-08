// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            ad, s, b, g, 
//            ac

public final class am extends ad
{
    private static final class a
        implements ad.a
    {

        private final s a;
        private final b b = new b();

        public final ac a()
        {
            return b;
        }

        public final void a(String s1, int i)
        {
            if ("ga_dispatchPeriod".equals(s1))
            {
                b.d = i;
                return;
            } else
            {
                a.e().d("Int xml configuration name not recognized", s1);
                return;
            }
        }

        public final void a(String s1, String s2)
        {
            if ("ga_appName".equals(s1))
            {
                b.a = s2;
                return;
            }
            if ("ga_appVersion".equals(s1))
            {
                b.b = s2;
                return;
            }
            if ("ga_logLevel".equals(s1))
            {
                b.c = s2;
                return;
            } else
            {
                a.e().d("String xml configuration name not recognized", s1);
                return;
            }
        }

        public final void a(String s1, boolean flag)
        {
            if ("ga_dryRun".equals(s1))
            {
                s1 = b;
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                s1.e = i;
                return;
            } else
            {
                a.e().d("Bool xml configuration name not recognized", s1);
                return;
            }
        }

        public a(s s1)
        {
            a = s1;
        }
    }


    public am(s s)
    {
        super(s, new a(s));
    }
}
