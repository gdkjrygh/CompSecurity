// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            al, z, p, ak

class x extends al
{
    private static class a
        implements al.a
    {

        private final z a = new z();

        public z a()
        {
            return a;
        }

        public void a(String s, int i)
        {
            if ("ga_sessionTimeout".equals(s))
            {
                a.c = i;
                return;
            } else
            {
                p.d((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public void a(String s, String s1)
        {
            a.g.put(s, s1);
        }

        public void a(String s, boolean flag)
        {
            boolean flag1 = true;
            boolean flag2 = true;
            int i = 1;
            if ("ga_autoActivityTracking".equals(s))
            {
                s = a;
                if (!flag)
                {
                    i = 0;
                }
                s.d = i;
                return;
            }
            if ("ga_anonymizeIp".equals(s))
            {
                s = a;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                s.e = j;
                return;
            }
            if ("ga_reportUncaughtExceptions".equals(s))
            {
                s = a;
                int k;
                if (flag)
                {
                    k = ((flag2) ? 1 : 0);
                } else
                {
                    k = 0;
                }
                s.f = k;
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
            if ("ga_trackingId".equals(s))
            {
                a.a = s1;
                return;
            }
            if ("ga_sampleFrequency".equals(s))
            {
                try
                {
                    a.b = Double.parseDouble(s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    p.a((new StringBuilder()).append("Error parsing ga_sampleFrequency value: ").append(s1).toString());
                }
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


    public x(Context context)
    {
        super(context, new a());
    }
}
