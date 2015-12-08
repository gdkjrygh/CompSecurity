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
//            ah, eh, ek, em, 
//            bp, bw

public final class aj
    implements ah
{

    public aj()
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
                j = eh.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                ek.d((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(em em1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            ek.d("Action missing from video GMSG.");
            return;
        }
        Object obj = em1.c();
        if (obj == null)
        {
            ek.d("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            em1 = em1.getContext().getResources().getDisplayMetrics();
            int i = a(((DisplayMetrics) (em1)), map, "x", 0);
            int k = a(((DisplayMetrics) (em1)), map, "y", 0);
            int i1 = a(((DisplayMetrics) (em1)), map, "w", -1);
            int j1 = a(((DisplayMetrics) (em1)), map, "h", -1);
            if (flag && ((bp) (obj)).b() == null)
            {
                ((bp) (obj)).b(i, k, i1, j1);
                return;
            } else
            {
                ((bp) (obj)).a(i, k, i1, j1);
                return;
            }
        }
        obj = ((bp) (obj)).b();
        if (obj == null)
        {
            bw.a(em1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            em1 = em1.getContext().getResources().getDisplayMetrics();
            int j = a(((DisplayMetrics) (em1)), map, "x", 0);
            int l = a(((DisplayMetrics) (em1)), map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            em1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((bw) (obj)).a(em1);
            em1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            em1 = (String)map.get("enabled");
            if (em1 == null)
            {
                ek.d("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((bw) (obj)).a(Boolean.parseBoolean(em1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            em1 = (String)map.get("time");
            if (em1 == null)
            {
                ek.d("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((bw) (obj)).a((int)(Float.parseFloat(em1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                ek.d((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(em1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((bw) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((bw) (obj)).b();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((bw) (obj)).c();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((bw) (obj)).d();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((bw) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((bw) (obj)).a((String)map.get("src"));
            return;
        } else
        {
            ek.d((new StringBuilder("Unknown video action: ")).append(s).toString());
            return;
        }
    }
}
