// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package me.lyft.android.analytics:
//            ITrackerExtra

public class LeanplumTrackerExtra
    implements ITrackerExtra
{

    private final String info;
    private final Map parameters;
    private final double value;

    public LeanplumTrackerExtra()
    {
        this(0.0D, "", Collections.emptyMap());
    }

    public LeanplumTrackerExtra(double d, String s)
    {
        this(d, s, Collections.emptyMap());
    }

    public LeanplumTrackerExtra(double d, String s, Map map)
    {
        value = d;
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        info = s1;
        s = map;
        if (map == null)
        {
            s = Collections.emptyMap();
        }
        parameters = s;
    }

    public String getInfo()
    {
        return info;
    }

    public Map getParameters()
    {
        return parameters;
    }

    public double getValue()
    {
        return value;
    }
}
