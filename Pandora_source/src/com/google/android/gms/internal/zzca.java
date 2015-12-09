// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzgd

public final class zzca extends zzbo
{

    private final Map zztL = new WeakHashMap();

    public zzca()
    {
    }

    private static int zza(Context context, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = zzj.zzbJ().zzb(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void zzb(zzgd zzgd1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.zzb.zzan("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (com.google.android.gms.ads.internal.util.client.zzb.zzC(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Video GMSG: ").append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = zzgd1.zzfr();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        map = map.zzds();
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (zzgd zzgd1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Invalid color parameter in video GMSG.");
            }
            return;
        }
        zztL.put(zzgd1, Integer.valueOf(i));
        return;
        Object obj = zzgd1.zzfr();
        if (obj == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        if (flag || flag1)
        {
            obj1 = zzgd1.getContext();
            int j = zza(((Context) (obj1)), map, "x", 0);
            int l = zza(((Context) (obj1)), map, "y", 0);
            int j1 = zza(((Context) (obj1)), map, "w", -1);
            int k1 = zza(((Context) (obj1)), map, "h", -1);
            if (flag && ((zzc) (obj)).zzds() == null)
            {
                ((zzc) (obj)).zze(j, l, j1, k1);
                if (zztL.containsKey(zzgd1))
                {
                    j = ((Integer)zztL.get(zzgd1)).intValue();
                    ((zzc) (obj)).zzds().setBackgroundColor(j);
                    return;
                }
            } else
            {
                ((zzc) (obj)).zzd(j, l, j1, k1);
                return;
            }
        } else
        {
            obj = ((zzc) (obj)).zzds();
            if (obj == null)
            {
                zzg.zza(zzgd1, "no_video_view", null);
                return;
            }
            if ("click".equals(obj1))
            {
                zzgd1 = zzgd1.getContext();
                int k = zza(zzgd1, map, "x", 0);
                int i1 = zza(zzgd1, map, "y", 0);
                long l1 = SystemClock.uptimeMillis();
                zzgd1 = MotionEvent.obtain(l1, l1, 0, k, i1, 0);
                ((zzg) (obj)).zzb(zzgd1);
                zzgd1.recycle();
                return;
            }
            if ("controls".equals(obj1))
            {
                zzgd1 = (String)map.get("enabled");
                if (zzgd1 == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("Enabled parameter missing from controls video GMSG.");
                    return;
                } else
                {
                    ((zzg) (obj)).zzv(Boolean.parseBoolean(zzgd1));
                    return;
                }
            }
            if ("currentTime".equals(obj1))
            {
                zzgd1 = (String)map.get("time");
                if (zzgd1 == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    ((zzg) (obj)).seekTo((int)(Float.parseFloat(zzgd1) * 1000F));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(zzgd1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((zzg) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((zzg) (obj)).zzdF();
                return;
            }
            if ("muted".equals(obj1))
            {
                if (Boolean.parseBoolean((String)map.get("muted")))
                {
                    ((zzg) (obj)).zzdG();
                    return;
                } else
                {
                    ((zzg) (obj)).zzdH();
                    return;
                }
            }
            if ("pause".equals(obj1))
            {
                ((zzg) (obj)).pause();
                return;
            }
            if ("play".equals(obj1))
            {
                ((zzg) (obj)).play();
                return;
            }
            if ("show".equals(obj1))
            {
                ((zzg) (obj)).setVisibility(0);
                return;
            }
            if ("src".equals(obj1))
            {
                ((zzg) (obj)).zzT((String)map.get("src"));
                return;
            }
            if ("volume".equals(obj1))
            {
                zzgd1 = (String)map.get("volume");
                if (zzgd1 == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("Level parameter missing from volume video GMSG.");
                    return;
                }
                try
                {
                    ((zzg) (obj)).zza(Float.parseFloat(zzgd1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not parse volume parameter from volume video GMSG: ").append(zzgd1).toString());
                }
                return;
            }
            if ("watermark".equals(obj1))
            {
                ((zzg) (obj)).zzdJ();
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Unknown video action: ").append(((String) (obj1))).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
