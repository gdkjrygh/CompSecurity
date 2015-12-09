// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;

// Referenced classes of package com.google.android.gms.analytics:
//            al, k, p, ak

class av extends al
{
    private static class a
        implements al.a
    {

        private final k a = new k();

        public k a()
        {
            return a;
        }

        public void a(String s, int i)
        {
            if ("ga_dispatchPeriod".equals(s))
            {
                a.d = i;
                return;
            } else
            {
                p.d((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
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
                p.d((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public ak b()
        {
            return a();
        }

        public void b(String s, String s1)
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
                p.d((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public a()
        {
        }
    }


    public av(Context context)
    {
        super(context, new a());
    }
}
