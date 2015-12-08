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

        private final aj wg = new aj();

        public void a(String s, int i)
        {
            if ("ga_sessionTimeout".equals(s))
            {
                wg.wj = i;
                return;
            } else
            {
                aa.z((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public void a(String s, String s1)
        {
            wg.wn.put(s, s1);
        }

        public void b(String s, String s1)
        {
            if ("ga_trackingId".equals(s))
            {
                wg.wh = s1;
                return;
            }
            if ("ga_sampleFrequency".equals(s))
            {
                try
                {
                    wg.wi = Double.parseDouble(s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    aa.w((new StringBuilder()).append("Error parsing ga_sampleFrequency value: ").append(s1).toString());
                }
                return;
            } else
            {
                aa.z((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public void c(String s, boolean flag)
        {
            boolean flag1 = true;
            boolean flag2 = true;
            int i = 1;
            if ("ga_autoActivityTracking".equals(s))
            {
                s = wg;
                if (!flag)
                {
                    i = 0;
                }
                s.wk = i;
                return;
            }
            if ("ga_anonymizeIp".equals(s))
            {
                s = wg;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                s.wl = j;
                return;
            }
            if ("ga_reportUncaughtExceptions".equals(s))
            {
                s = wg;
                int l;
                if (flag)
                {
                    l = ((flag2) ? 1 : 0);
                } else
                {
                    l = 0;
                }
                s.wm = l;
                return;
            } else
            {
                aa.z((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
                return;
            }
        }

        public j cg()
        {
            return di();
        }

        public aj di()
        {
            return wg;
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
