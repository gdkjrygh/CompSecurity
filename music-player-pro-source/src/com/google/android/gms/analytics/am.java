// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            m

class am
    implements m
{

    int CA;
    Map CB;
    String Cv;
    double Cw;
    int Cx;
    int Cy;
    int Cz;

    am()
    {
        Cw = -1D;
        Cx = -1;
        Cy = -1;
        Cz = -1;
        CA = -1;
        CB = new HashMap();
    }

    public String am(String s)
    {
        String s1 = (String)CB.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean fA()
    {
        return Cz != -1;
    }

    public boolean fB()
    {
        return Cz == 1;
    }

    public boolean fC()
    {
        return CA == 1;
    }

    public boolean ft()
    {
        return Cv != null;
    }

    public String fu()
    {
        return Cv;
    }

    public boolean fv()
    {
        return Cw >= 0.0D;
    }

    public double fw()
    {
        return Cw;
    }

    public boolean fx()
    {
        return Cx >= 0;
    }

    public boolean fy()
    {
        return Cy != -1;
    }

    public boolean fz()
    {
        return Cy == 1;
    }

    public int getSessionTimeout()
    {
        return Cx;
    }

    public String k(Activity activity)
    {
        return am(activity.getClass().getCanonicalName());
    }
}
