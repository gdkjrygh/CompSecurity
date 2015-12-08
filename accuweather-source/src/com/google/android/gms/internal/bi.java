// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, eu, ev, ey, 
//            cg, ck

public final class bi
    implements bd
{

    public bi()
    {
    }

    private static int a(DisplayMetrics displaymetrics, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = eu.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                ev.D((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void b(ey ey1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            ev.D("Action missing from video GMSG.");
            return;
        }
        Object obj = ey1.bV();
        if (obj == null)
        {
            ev.D("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            ey1 = ey1.getContext().getResources().getDisplayMetrics();
            int i = a(ey1, map, "x", 0);
            int k = a(ey1, map, "y", 0);
            int i1 = a(ey1, map, "w", -1);
            int j1 = a(ey1, map, "h", -1);
            if (flag && ((cg) (obj)).aL() == null)
            {
                ((cg) (obj)).c(i, k, i1, j1);
                return;
            } else
            {
                ((cg) (obj)).b(i, k, i1, j1);
                return;
            }
        }
        obj = ((cg) (obj)).aL();
        if (obj == null)
        {
            ck.a(ey1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            ey1 = ey1.getContext().getResources().getDisplayMetrics();
            int j = a(ey1, map, "x", 0);
            int l = a(ey1, map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            ey1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((ck) (obj)).b(ey1);
            ey1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            ey1 = (String)map.get("enabled");
            if (ey1 == null)
            {
                ev.D("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((ck) (obj)).l(Boolean.parseBoolean(ey1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            ey1 = (String)map.get("time");
            if (ey1 == null)
            {
                ev.D("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((ck) (obj)).seekTo((int)(Float.parseFloat(ey1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                ev.D((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(ey1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((ck) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((ck) (obj)).aV();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((ck) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((ck) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((ck) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((ck) (obj)).o((String)map.get("src"));
            return;
        } else
        {
            ev.D((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
