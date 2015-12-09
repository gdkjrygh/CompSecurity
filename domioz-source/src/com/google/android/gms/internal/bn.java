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
//            bg, x, fi, fj, 
//            fl, co, cw

public final class bn
    implements bg
{

    public bn()
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
                x.a();
                j = fi.a(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                fj.e((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(fl fl1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            fj.e("Action missing from video GMSG.");
        } else
        {
            Object obj = fl1.e();
            if (obj == null)
            {
                fj.e("Could not get ad overlay for a video GMSG.");
                return;
            }
            boolean flag = "new".equalsIgnoreCase(s);
            boolean flag1 = "position".equalsIgnoreCase(s);
            if (flag || flag1)
            {
                fl1 = fl1.getContext().getResources().getDisplayMetrics();
                int i = a(((DisplayMetrics) (fl1)), map, "x", 0);
                int k = a(((DisplayMetrics) (fl1)), map, "y", 0);
                int i1 = a(((DisplayMetrics) (fl1)), map, "w", -1);
                int j1 = a(((DisplayMetrics) (fl1)), map, "h", -1);
                if (flag && ((co) (obj)).c == null)
                {
                    ((co) (obj)).b(i, k, i1, j1);
                    return;
                }
                if (((co) (obj)).c != null)
                {
                    ((co) (obj)).c.setLayoutParams(co.a(i, k, i1, j1));
                    return;
                }
            } else
            {
                obj = ((co) (obj)).c;
                if (obj == null)
                {
                    cw.a(fl1, "no_video_view", null);
                    return;
                }
                if ("click".equalsIgnoreCase(s))
                {
                    fl1 = fl1.getContext().getResources().getDisplayMetrics();
                    int j = a(((DisplayMetrics) (fl1)), map, "x", 0);
                    int l = a(((DisplayMetrics) (fl1)), map, "y", 0);
                    long l1 = SystemClock.uptimeMillis();
                    fl1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
                    ((cw) (obj)).a(fl1);
                    fl1.recycle();
                    return;
                }
                if ("controls".equalsIgnoreCase(s))
                {
                    fl1 = (String)map.get("enabled");
                    if (fl1 == null)
                    {
                        fj.e("Enabled parameter missing from controls video GMSG.");
                        return;
                    } else
                    {
                        ((cw) (obj)).a(Boolean.parseBoolean(fl1));
                        return;
                    }
                }
                if ("currentTime".equalsIgnoreCase(s))
                {
                    fl1 = (String)map.get("time");
                    if (fl1 == null)
                    {
                        fj.e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try
                    {
                        ((cw) (obj)).a((int)(Float.parseFloat(fl1) * 1000F));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        fj.e((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(fl1).toString());
                    }
                    return;
                }
                if ("hide".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).setVisibility(4);
                    return;
                }
                if ("load".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).b();
                    return;
                }
                if ("pause".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).c();
                    return;
                }
                if ("play".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).d();
                    return;
                }
                if ("show".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).setVisibility(0);
                    return;
                }
                if ("src".equalsIgnoreCase(s))
                {
                    ((cw) (obj)).a((String)map.get("src"));
                    return;
                } else
                {
                    fj.e((new StringBuilder("Unknown video action: ")).append(s).toString());
                    return;
                }
            }
        }
    }
}
