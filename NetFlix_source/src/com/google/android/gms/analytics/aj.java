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

    String wh;
    double wi;
    int wj;
    int wk;
    int wl;
    int wm;
    Map wn;

    aj()
    {
        wi = -1D;
        wj = -1;
        wk = -1;
        wl = -1;
        wm = -1;
        wn = new HashMap();
    }

    public String M(String s)
    {
        String s1 = (String)wn.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean dj()
    {
        return wh != null;
    }

    public String dk()
    {
        return wh;
    }

    public boolean dl()
    {
        return wi >= 0.0D;
    }

    public double dm()
    {
        return wi;
    }

    public boolean dn()
    {
        return wj >= 0;
    }

    public boolean _mthdo()
    {
        return wk != -1;
    }

    public boolean dp()
    {
        return wk == 1;
    }

    public boolean dq()
    {
        return wl != -1;
    }

    public boolean dr()
    {
        return wl == 1;
    }

    public boolean ds()
    {
        return wm == 1;
    }

    public int getSessionTimeout()
    {
        return wj;
    }

    public String h(Activity activity)
    {
        return M(activity.getClass().getCanonicalName());
    }
}
