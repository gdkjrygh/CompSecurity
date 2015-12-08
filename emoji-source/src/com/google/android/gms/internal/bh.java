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
//            bc, et, eu, ex, 
//            cf, cj

public final class bh
    implements bc
{

    public bh()
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
                j = et.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                eu.D((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void b(ex ex1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            eu.D("Action missing from video GMSG.");
            return;
        }
        Object obj = ex1.ca();
        if (obj == null)
        {
            eu.D("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            ex1 = ex1.getContext().getResources().getDisplayMetrics();
            int i = a(ex1, map, "x", 0);
            int k = a(ex1, map, "y", 0);
            int i1 = a(ex1, map, "w", -1);
            int j1 = a(ex1, map, "h", -1);
            if (flag && ((cf) (obj)).aQ() == null)
            {
                ((cf) (obj)).c(i, k, i1, j1);
                return;
            } else
            {
                ((cf) (obj)).b(i, k, i1, j1);
                return;
            }
        }
        obj = ((cf) (obj)).aQ();
        if (obj == null)
        {
            cj.a(ex1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            ex1 = ex1.getContext().getResources().getDisplayMetrics();
            int j = a(ex1, map, "x", 0);
            int l = a(ex1, map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            ex1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((cj) (obj)).b(ex1);
            ex1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            ex1 = (String)map.get("enabled");
            if (ex1 == null)
            {
                eu.D("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((cj) (obj)).l(Boolean.parseBoolean(ex1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            ex1 = (String)map.get("time");
            if (ex1 == null)
            {
                eu.D("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((cj) (obj)).seekTo((int)(Float.parseFloat(ex1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                eu.D((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(ex1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((cj) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((cj) (obj)).ba();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((cj) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((cj) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((cj) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((cj) (obj)).o((String)map.get("src"));
            return;
        } else
        {
            eu.D((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
