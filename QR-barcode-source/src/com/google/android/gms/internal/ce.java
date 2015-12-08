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
//            by, gr, gs, gv, 
//            dk, do

public final class ce
    implements by
{

    public ce()
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
                j = gr.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                gs.W((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void a(gv gv1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            gs.W("Action missing from video GMSG.");
            return;
        }
        Object obj = gv1.dt();
        if (obj == null)
        {
            gs.W("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            gv1 = gv1.getContext().getResources().getDisplayMetrics();
            int i = a(((DisplayMetrics) (gv1)), map, "x", 0);
            int k = a(((DisplayMetrics) (gv1)), map, "y", 0);
            int i1 = a(((DisplayMetrics) (gv1)), map, "w", -1);
            int j1 = a(((DisplayMetrics) (gv1)), map, "h", -1);
            if (flag && ((dk) (obj)).bV() == null)
            {
                ((dk) (obj)).c(i, k, i1, j1);
                return;
            } else
            {
                ((dk) (obj)).b(i, k, i1, j1);
                return;
            }
        }
        obj = ((dk) (obj)).bV();
        if (obj == null)
        {
            com.google.android.gms.internal.do.a(gv1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            gv1 = gv1.getContext().getResources().getDisplayMetrics();
            int j = a(((DisplayMetrics) (gv1)), map, "x", 0);
            int l = a(((DisplayMetrics) (gv1)), map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            gv1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((do) (obj)).b(gv1);
            gv1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            gv1 = (String)map.get("enabled");
            if (gv1 == null)
            {
                gs.W("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((do) (obj)).q(Boolean.parseBoolean(gv1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            gv1 = (String)map.get("time");
            if (gv1 == null)
            {
                gs.W("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((do) (obj)).seekTo((int)(Float.parseFloat(gv1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                gs.W((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(gv1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((do) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((do) (obj)).ch();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((do) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((do) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((do) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((do) (obj)).C((String)map.get("src"));
            return;
        } else
        {
            gs.W((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
