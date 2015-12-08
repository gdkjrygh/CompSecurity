// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            i

class ai
    implements i
{

    String BC;
    double BD;
    int BE;
    int BF;
    int BG;
    int BH;
    Map BI;

    ai()
    {
        BD = -1D;
        BE = -1;
        BF = -1;
        BG = -1;
        BH = -1;
        BI = new HashMap();
    }

    public String am(String s)
    {
        String s1 = (String)BI.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean eZ()
    {
        return BC != null;
    }

    public String fa()
    {
        return BC;
    }

    public boolean fb()
    {
        return BD >= 0.0D;
    }

    public double fc()
    {
        return BD;
    }

    public boolean fd()
    {
        return BE >= 0;
    }

    public boolean fe()
    {
        return BF != -1;
    }

    public boolean ff()
    {
        return BF == 1;
    }

    public boolean fg()
    {
        return BG != -1;
    }

    public boolean fh()
    {
        return BG == 1;
    }

    public boolean fi()
    {
        return BH == 1;
    }

    public int getSessionTimeout()
    {
        return BE;
    }

    public String k(Activity activity)
    {
        return am(activity.getClass().getCanonicalName());
    }
}
