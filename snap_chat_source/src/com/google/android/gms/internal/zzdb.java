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
//            zzcv, zzbe, zzhw, zzhx, 
//            zzic, zzel, zzeq

public final class zzdb
    implements zzcv
{

    public zzdb()
    {
    }

    private static int zza(DisplayMetrics displaymetrics, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = zzbe.zzbD().zza(displaymetrics, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (DisplayMetrics displaymetrics)
            {
                zzhx.zzac((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void zza(zzic zzic1, Map map)
    {
        String s = (String)map.get("action");
        if (s == null)
        {
            zzhx.zzac("Action missing from video GMSG.");
            return;
        }
        Object obj = zzic1.zzeF();
        if (obj == null)
        {
            zzhx.zzac("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equalsIgnoreCase(s);
        boolean flag1 = "position".equalsIgnoreCase(s);
        if (flag || flag1)
        {
            zzic1 = zzic1.getContext().getResources().getDisplayMetrics();
            int i = zza(((DisplayMetrics) (zzic1)), map, "x", 0);
            int k = zza(((DisplayMetrics) (zzic1)), map, "y", 0);
            int i1 = zza(((DisplayMetrics) (zzic1)), map, "w", -1);
            int j1 = zza(((DisplayMetrics) (zzic1)), map, "h", -1);
            if (flag && ((zzel) (obj)).zzdb() == null)
            {
                ((zzel) (obj)).zzf(i, k, i1, j1);
                return;
            } else
            {
                ((zzel) (obj)).zze(i, k, i1, j1);
                return;
            }
        }
        obj = ((zzel) (obj)).zzdb();
        if (obj == null)
        {
            zzeq.zza(zzic1, "no_video_view", null);
            return;
        }
        if ("click".equalsIgnoreCase(s))
        {
            zzic1 = zzic1.getContext().getResources().getDisplayMetrics();
            int j = zza(((DisplayMetrics) (zzic1)), map, "x", 0);
            int l = zza(((DisplayMetrics) (zzic1)), map, "y", 0);
            long l1 = SystemClock.uptimeMillis();
            zzic1 = MotionEvent.obtain(l1, l1, 0, j, l, 0);
            ((zzeq) (obj)).zzb(zzic1);
            zzic1.recycle();
            return;
        }
        if ("controls".equalsIgnoreCase(s))
        {
            zzic1 = (String)map.get("enabled");
            if (zzic1 == null)
            {
                zzhx.zzac("Enabled parameter missing from controls video GMSG.");
                return;
            } else
            {
                ((zzeq) (obj)).zzu(Boolean.parseBoolean(zzic1));
                return;
            }
        }
        if ("currentTime".equalsIgnoreCase(s))
        {
            zzic1 = (String)map.get("time");
            if (zzic1 == null)
            {
                zzhx.zzac("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                ((zzeq) (obj)).seekTo((int)(Float.parseFloat(zzic1) * 1000F));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                zzhx.zzac((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(zzic1).toString());
            }
            return;
        }
        if ("hide".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).setVisibility(4);
            return;
        }
        if ("load".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).zzdo();
            return;
        }
        if ("pause".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).pause();
            return;
        }
        if ("play".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).play();
            return;
        }
        if ("show".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).setVisibility(0);
            return;
        }
        if ("src".equalsIgnoreCase(s))
        {
            ((zzeq) (obj)).zzK((String)map.get("src"));
            return;
        } else
        {
            zzhx.zzac((new StringBuilder("Unknown video action: ")).append(s).toString());
            return;
        }
    }
}
