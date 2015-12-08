// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ch, hs

public final class cp
    implements ch
{

    private final Map a = new WeakHashMap();

    public cp()
    {
    }

    private static int a(Context context, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int j = i;
        if (map != null)
        {
            try
            {
                j = zzk.zzcE().zzb(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzb.zzaE((new StringBuilder()).append("Could not parse ").append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public void zza(hs hs1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        zzb.zzaE("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (zzb.zzM(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            zzb.zzaC((new StringBuilder()).append("Video GMSG: ").append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            zzb.zzaE("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = hs1.f();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        map = map.zzew();
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (hs hs1)
            {
                zzb.zzaE("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(hs1, Integer.valueOf(i));
        return;
        Object obj = hs1.f();
        if (obj == null)
        {
            zzb.zzaE("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        if (flag || flag1)
        {
            obj1 = hs1.getContext();
            int l = a(((Context) (obj1)), map, "x", 0);
            int j1 = a(((Context) (obj1)), map, "y", 0);
            int k1 = a(((Context) (obj1)), map, "w", -1);
            int l1 = a(((Context) (obj1)), map, "h", -1);
            int j;
            try
            {
                j = Integer.parseInt((String)map.get("player"));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                j = 0;
            }
            if (flag && ((zzd) (obj)).zzew() == null)
            {
                ((zzd) (obj)).zza(l, j1, k1, l1, j);
                if (a.containsKey(hs1))
                {
                    j = ((Integer)a.get(hs1)).intValue();
                    ((zzd) (obj)).zzew().setBackgroundColor(j);
                    return;
                }
            } else
            {
                ((zzd) (obj)).zzd(l, j1, k1, l1);
                return;
            }
        } else
        {
            obj = ((zzd) (obj)).zzew();
            if (obj == null)
            {
                com.google.android.gms.ads.internal.overlay.zzk.zzd(hs1);
                return;
            }
            if ("click".equals(obj1))
            {
                hs1 = hs1.getContext();
                int k = a(hs1, map, "x", 0);
                int i1 = a(hs1, map, "y", 0);
                long l2 = SystemClock.uptimeMillis();
                hs1 = MotionEvent.obtain(l2, l2, 0, k, i1, 0);
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzd(hs1);
                hs1.recycle();
                return;
            }
            if ("currentTime".equals(obj1))
            {
                hs1 = (String)map.get("time");
                if (hs1 == null)
                {
                    zzb.zzaE("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).seekTo((int)(Float.parseFloat(hs1) * 1000F));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaE((new StringBuilder()).append("Could not parse time parameter from currentTime video GMSG: ").append(hs1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzeP();
                return;
            }
            if ("mimetype".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).setMimeType((String)map.get("mimetype"));
                return;
            }
            if ("muted".equals(obj1))
            {
                if (Boolean.parseBoolean((String)map.get("muted")))
                {
                    ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzeq();
                    return;
                } else
                {
                    ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzer();
                    return;
                }
            }
            if ("pause".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).pause();
                return;
            }
            if ("play".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).play();
                return;
            }
            if ("show".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).setVisibility(0);
                return;
            }
            if ("src".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzak((String)map.get("src"));
                return;
            }
            if ("volume".equals(obj1))
            {
                hs1 = (String)map.get("volume");
                if (hs1 == null)
                {
                    zzb.zzaE("Level parameter missing from volume video GMSG.");
                    return;
                }
                try
                {
                    ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zza(Float.parseFloat(hs1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    zzb.zzaE((new StringBuilder()).append("Could not parse volume parameter from volume video GMSG: ").append(hs1).toString());
                }
                return;
            }
            if ("watermark".equals(obj1))
            {
                ((com.google.android.gms.ads.internal.overlay.zzk) (obj)).zzeQ();
                return;
            } else
            {
                zzb.zzaE((new StringBuilder()).append("Unknown video action: ").append(((String) (obj1))).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
