// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;

// Referenced classes of package com.google.android.gms.analytics:
//            j, v, z, i

class u extends j
{
    private static class a
        implements j.a
    {

        private final v Ar = new v();

        public void c(String s, int i)
        {
            if ("ga_dispatchPeriod".equals(s))
            {
                Ar.At = i;
                return;
            } else
            {
                z.W((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public void d(String s, boolean flag)
        {
            if ("ga_dryRun".equals(s))
            {
                s = Ar;
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                s.Au = i;
                return;
            } else
            {
                z.W((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public i dW()
        {
            return es();
        }

        public v es()
        {
            return Ar;
        }

        public void f(String s, String s1)
        {
        }

        public void g(String s, String s1)
        {
            if ("ga_appName".equals(s))
            {
                Ar.xL = s1;
                return;
            }
            if ("ga_appVersion".equals(s))
            {
                Ar.xM = s1;
                return;
            }
            if ("ga_logLevel".equals(s))
            {
                Ar.As = s1;
                return;
            } else
            {
                z.W((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public a()
        {
        }
    }


    public u(Context context)
    {
        super(context, new a());
    }
}
