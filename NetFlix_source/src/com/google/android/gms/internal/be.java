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
//            bb, dv, dw, dz, 
//            cc, cg

public final class be
    implements bb
{

    public be()
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
                j = dv.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                dw.z((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void b(dz dz1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            dw.z("Action missing from video GMSG.");
            return;
        }
        Object obj = dz1.bH();
        if (obj == null)
        {
            dw.z("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            dz1 = dz1.getContext().getResources().getDisplayMetrics();
            int i = a(dz1, map, "x", 0);
            int k = a(dz1, map, "y", 0);
            int i1 = a(dz1, map, "w", -1);
            int j1 = a(dz1, map, "h", -1);
            if (flag && ((cc) (obj)).aK() == null)
            {
                ((cc) (obj)).c(i, k, i1, j1);
                return;
            } else
            {
                ((cc) (obj)).b(i, k, i1, j1);
                return;
            }
        }
        obj = ((cc) (obj)).aK();
        if (obj == null)
        {
            cg.a(dz1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            dz1 = dz1.getContext().getResources().getDisplayMetrics();
            int j = a(dz1, map, "x", 0);
            int l = a(dz1, map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            dz1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((cg) (obj)).b(dz1);
            dz1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            dz1 = (String)map.get("enabled");
            if (dz1 == null)
            {
                dw.z("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((cg) (obj)).k(Boolean.parseBoolean(dz1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            dz1 = (String)map.get("time");
            if (dz1 == null)
            {
                dw.z("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((cg) (obj)).seekTo((int)(Float.parseFloat(dz1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                dw.z((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(dz1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((cg) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((cg) (obj)).aU();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((cg) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((cg) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((cg) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((cg) (obj)).o((String)map.get("src"));
            return;
        } else
        {
            dw.z((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }
}
