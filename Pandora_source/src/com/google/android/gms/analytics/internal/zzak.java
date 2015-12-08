// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            f

public class zzak
    implements f
{

    public String zzEm;
    public double zzII;
    public int zzIJ;
    public int zzIK;
    public int zzIL;
    public int zzIM;
    public Map zzIN;

    public zzak()
    {
        zzII = -1D;
        zzIJ = -1;
        zzIK = -1;
        zzIL = -1;
        zzIM = -1;
        zzIN = new HashMap();
    }

    public int getSessionTimeout()
    {
        return zzIJ;
    }

    public String zzaT(String s)
    {
        String s1 = (String)zzIN.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean zzjA()
    {
        return zzIM == 1;
    }

    public boolean zzjr()
    {
        return zzEm != null;
    }

    public String zzjs()
    {
        return zzEm;
    }

    public boolean zzjt()
    {
        return zzII >= 0.0D;
    }

    public double zzju()
    {
        return zzII;
    }

    public boolean zzjv()
    {
        return zzIJ >= 0;
    }

    public boolean zzjw()
    {
        return zzIK != -1;
    }

    public boolean zzjx()
    {
        return zzIK == 1;
    }

    public boolean zzjy()
    {
        return zzIL != -1;
    }

    public boolean zzjz()
    {
        return zzIL == 1;
    }

    public String zzq(Activity activity)
    {
        return zzaT(activity.getClass().getCanonicalName());
    }
}
