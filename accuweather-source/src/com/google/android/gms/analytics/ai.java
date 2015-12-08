// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            k, aj, aa, j

class ai extends k
{
    private static class a
        implements k.a
    {

        private final aj xt = new aj();

        public void a(String s, int i)
        {
            if ("ga_sessionTimeout".equals(s))
            {
                xt.xw = i;
                return;
            } else
            {
                aa.D((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public void c(String s, String s1)
        {
            xt.xA.put(s, s1);
        }

        public void c(String s, boolean flag)
        {
            boolean flag1 = true;
            boolean flag2 = true;
            int i = 1;
            if ("ga_autoActivityTracking".equals(s))
            {
                s = xt;
                if (!flag)
                {
                    i = 0;
                }
                s.xx = i;
                return;
            }
            if ("ga_anonymizeIp".equals(s))
            {
                s = xt;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                s.xy = j;
                return;
            }
            if ("ga_reportUncaughtExceptions".equals(s))
            {
                s = xt;
                int l;
                if (flag)
                {
                    l = ((flag2) ? 1 : 0);
                } else
                {
                    l = 0;
                }
                s.xz = l;
                return;
            } else
            {
                aa.D((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public j cw()
        {
            return dy();
        }

        public void d(String s, String s1)
        {
            if ("ga_trackingId".equals(s))
            {
                xt.xu = s1;
                return;
            }
            if ("ga_sampleFrequency".equals(s))
            {
                try
                {
                    xt.xv = Double.parseDouble(s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    aa.A((new StringBuilder()).append("Error parsing ga_sampleFrequency value: ").append(s1).toString());
                }
                return;
            } else
            {
                aa.D((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public aj dy()
        {
            return xt;
        }

        public a()
        {
        }
    }


    public ai(Context context)
    {
        super(context, new a());
    }
}
