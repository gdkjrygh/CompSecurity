// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            ai, aj, aa, j

private static class 
    implements 
{

    private final aj xw = new aj();

    public void a(String s, int i)
    {
        if ("ga_sessionTimeout".equals(s))
        {
            xw.xz = i;
            return;
        } else
        {
            aa.D((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void c(String s, String s1)
    {
        xw.xD.put(s, s1);
    }

    public void c(String s, boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        int i = 1;
        if ("ga_autoActivityTracking".equals(s))
        {
            s = xw;
            if (!flag)
            {
                i = 0;
            }
            s.xA = i;
            return;
        }
        if ("ga_anonymizeIp".equals(s))
        {
            s = xw;
            int j;
            if (flag)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            s.xB = j;
            return;
        }
        if ("ga_reportUncaughtExceptions".equals(s))
        {
            s = xw;
            int k;
            if (flag)
            {
                k = ((flag2) ? 1 : 0);
            } else
            {
                k = 0;
            }
            s.xC = k;
            return;
        } else
        {
            aa.D((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public j cB()
    {
        return dD();
    }

    public void d(String s, String s1)
    {
        if ("ga_trackingId".equals(s))
        {
            xw.xx = s1;
            return;
        }
        if ("ga_sampleFrequency".equals(s))
        {
            try
            {
                xw.xy = Double.parseDouble(s1);
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

    public aj dD()
    {
        return xw;
    }

    public ()
    {
    }
}
