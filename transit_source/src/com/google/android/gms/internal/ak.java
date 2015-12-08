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
//            ai, cm, cn, cq, 
//            bf, bj

public final class ak
    implements ai
{

    public ak()
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
                j = cm.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                cn.q((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void a(cq cq1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            cn.q("Action missing from video GMSG.");
            return;
        }
        Object obj = cq1.au();
        if (obj == null)
        {
            cn.q("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            cq1 = cq1.getContext().getResources().getDisplayMetrics();
            int i = a(((DisplayMetrics) (cq1)), map, "x", 0);
            int k = a(((DisplayMetrics) (cq1)), map, "y", 0);
            int i1 = a(((DisplayMetrics) (cq1)), map, "w", -1);
            int j1 = a(((DisplayMetrics) (cq1)), map, "h", -1);
            if (flag && ((bf) (obj)).Q() == null)
            {
                ((bf) (obj)).c(i, k, i1, j1);
                return;
            } else
            {
                ((bf) (obj)).b(i, k, i1, j1);
                return;
            }
        }
        obj = ((bf) (obj)).Q();
        if (obj == null)
        {
            bj.a(cq1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            cq1 = cq1.getContext().getResources().getDisplayMetrics();
            int j = a(((DisplayMetrics) (cq1)), map, "x", 0);
            int l = a(((DisplayMetrics) (cq1)), map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            cq1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((bj) (obj)).b(cq1);
            cq1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            cq1 = (String)map.get("enabled");
            if (cq1 == null)
            {
                cn.q("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((bj) (obj)).f(Boolean.parseBoolean(cq1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            cq1 = (String)map.get("time");
            if (cq1 == null)
            {
                cn.q("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((bj) (obj)).seekTo((int)(Float.parseFloat(cq1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                cn.q((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(cq1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((bj) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((bj) (obj)).Z();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((bj) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((bj) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((bj) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((bj) (obj)).i((String)map.get("src"));
            return;
        } else
        {
            cn.q((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
