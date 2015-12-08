// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            j

class aj
    implements j
{

    Map xA;
    String xu;
    double xv;
    int xw;
    int xx;
    int xy;
    int xz;

    aj()
    {
        xv = -1D;
        xw = -1;
        xx = -1;
        xy = -1;
        xz = -1;
        xA = new HashMap();
    }

    public String T(String s)
    {
        String s1 = (String)xA.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public String dA()
    {
        return xu;
    }

    public boolean dB()
    {
        return xv >= 0.0D;
    }

    public double dC()
    {
        return xv;
    }

    public boolean dD()
    {
        return xw >= 0;
    }

    public boolean dE()
    {
        return xx != -1;
    }

    public boolean dF()
    {
        return xx == 1;
    }

    public boolean dG()
    {
        return xy != -1;
    }

    public boolean dH()
    {
        return xy == 1;
    }

    public boolean dI()
    {
        return xz == 1;
    }

    public boolean dz()
    {
        return xu != null;
    }

    public int getSessionTimeout()
    {
        return xw;
    }

    public String j(Activity activity)
    {
        return T(activity.getClass().getCanonicalName());
    }
}
