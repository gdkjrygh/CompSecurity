// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            bx, ag, af

final class ab
    implements bx
{

    static ab a = new ab();
    private final Map b = new TreeMap();
    private final Map c = new TreeMap();

    private ab()
    {
        b.put("AD_MIN_SCREENTIME_SECONDS", Integer.valueOf(0));
        b.put("STANDARD_AD_REFRESH_INTERVAL_MS", Integer.valueOf(60000));
        b.put("MAX_AD_CACHE_WHILE_SUSPENDED_MILLISECONDS", Integer.valueOf(0x493e0));
        b.put("AD_VISIBILITY_SCREEN_AREA_PP", Integer.valueOf(60));
        b.put("MRAID_AD_VISIBILITY_SCREEN_AREA_PP", Integer.valueOf(0));
        b.put("DEFAULT_VIEWABLE_CHANGE_TIMER_MS", Integer.valueOf(2000));
        b.put("DEFAULT_INVISIBLE_TIME_WHILE_EXPANDING_MS", Integer.valueOf(50));
        b.put("MAX_TIME_IN_PREFETCH_CACHE_MS", Integer.valueOf(0x493e0));
        c.put("RECORD_ADS", Boolean.FALSE);
        c.put("HIDE_STATUS_BAR", Boolean.FALSE);
        c.put("webContainerEvents", Boolean.FALSE);
    }

    static bx a()
    {
        return a;
    }

    public final int a(String s)
    {
        if (ag.a().g() != null && ag.a().g().d(s))
        {
            return ag.a().g().a(s);
        } else
        {
            af.a(b.containsKey(s));
            return ((Integer)b.get(s)).intValue();
        }
    }

    public final boolean b(String s)
    {
        if (ag.a().g() != null && ag.a().g().d(s))
        {
            return ag.a().g().b(s);
        }
        if (!af.a(c.containsKey(s)))
        {
            return false;
        } else
        {
            return ((Boolean)c.get(s)).booleanValue();
        }
    }

    public final boolean c(String s)
    {
        if (c.containsKey(s))
        {
            c.put(s, Boolean.valueOf(true));
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean d(String s)
    {
        return b.containsKey(s);
    }

}
