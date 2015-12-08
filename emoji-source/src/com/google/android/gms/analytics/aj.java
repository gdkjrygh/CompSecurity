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

    int xA;
    int xB;
    int xC;
    Map xD;
    String xx;
    double xy;
    int xz;

    aj()
    {
        xy = -1D;
        xz = -1;
        xA = -1;
        xB = -1;
        xC = -1;
        xD = new HashMap();
    }

    public String T(String s)
    {
        String s1 = (String)xD.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean dE()
    {
        return xx != null;
    }

    public String dF()
    {
        return xx;
    }

    public boolean dG()
    {
        return xy >= 0.0D;
    }

    public double dH()
    {
        return xy;
    }

    public boolean dI()
    {
        return xz >= 0;
    }

    public boolean dJ()
    {
        return xA != -1;
    }

    public boolean dK()
    {
        return xA == 1;
    }

    public boolean dL()
    {
        return xB != -1;
    }

    public boolean dM()
    {
        return xB == 1;
    }

    public boolean dN()
    {
        return xC == 1;
    }

    public int getSessionTimeout()
    {
        return xz;
    }

    public String j(Activity activity)
    {
        return T(activity.getClass().getCanonicalName());
    }
}
