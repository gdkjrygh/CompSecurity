// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            ah, ai, z, i

private static class 
    implements 
{

    private final ai BB = new ai();

    public void c(String s, int i)
    {
        if ("ga_sessionTimeout".equals(s))
        {
            BB.BE = i;
            return;
        } else
        {
            z.W((new StringBuilder()).append("int configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public void d(String s, boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        int i = 1;
        if ("ga_autoActivityTracking".equals(s))
        {
            s = BB;
            if (!flag)
            {
                i = 0;
            }
            s.BF = i;
            return;
        }
        if ("ga_anonymizeIp".equals(s))
        {
            s = BB;
            int j;
            if (flag)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            s.BG = j;
            return;
        }
        if ("ga_reportUncaughtExceptions".equals(s))
        {
            s = BB;
            int k;
            if (flag)
            {
                k = ((flag2) ? 1 : 0);
            } else
            {
                k = 0;
            }
            s.BH = k;
            return;
        } else
        {
            z.W((new StringBuilder()).append("bool configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public i dW()
    {
        return eY();
    }

    public ai eY()
    {
        return BB;
    }

    public void f(String s, String s1)
    {
        BB.BI.put(s, s1);
    }

    public void g(String s, String s1)
    {
        if ("ga_trackingId".equals(s))
        {
            BB.BC = s1;
            return;
        }
        if ("ga_sampleFrequency".equals(s))
        {
            try
            {
                BB.BD = Double.parseDouble(s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                z.T((new StringBuilder()).append("Error parsing ga_sampleFrequency value: ").append(s1).toString());
            }
            return;
        } else
        {
            z.W((new StringBuilder()).append("string configuration name not recognized:  ").append(s).toString());
            return;
        }
    }

    public ()
    {
    }
}
