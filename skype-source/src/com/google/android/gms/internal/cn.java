// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cf, hi

public final class cn
    implements cf
{

    private final Map a = new WeakHashMap();

    public cn()
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
                n.a();
                j = com.google.android.gms.ads.internal.util.client.a.a(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.c((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(hi hi1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        b.c("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (b.a(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            (new StringBuilder("Video GMSG: ")).append(((String) (obj1))).append(" ").append(jsonobject.toString());
            b.a(3);
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            b.c("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = hi1.g();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        map = map.b();
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (hi hi1)
            {
                b.c("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(hi1, Integer.valueOf(i));
        return;
        Object obj = hi1.g();
        if (obj == null)
        {
            b.c("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        if (flag || flag1)
        {
            obj1 = hi1.getContext();
            int j = a(((Context) (obj1)), map, "x", 0);
            int k = a(((Context) (obj1)), map, "y", 0);
            int l = a(((Context) (obj1)), map, "w", -1);
            int i1 = a(((Context) (obj1)), map, "h", -1);
            long l1;
            try
            {
                Integer.parseInt((String)map.get("player"));
            }
            // Misplaced declaration of an exception variable
            catch (Map map) { }
            if (flag && ((c) (obj)).b() == null)
            {
                ((c) (obj)).b(j, k, l, i1);
                if (a.containsKey(hi1))
                {
                    j = ((Integer)a.get(hi1)).intValue();
                    ((c) (obj)).b().setBackgroundColor(j);
                    return;
                }
            } else
            {
                ((c) (obj)).a(j, k, l, i1);
                return;
            }
        } else
        {
            obj = ((c) (obj)).b();
            if (obj == null)
            {
                zzk.a(hi1);
                return;
            }
            if ("click".equals(obj1))
            {
                hi1 = hi1.getContext();
                j = a(((Context) (hi1)), map, "x", 0);
                k = a(((Context) (hi1)), map, "y", 0);
                l1 = SystemClock.uptimeMillis();
                hi1 = MotionEvent.obtain(l1, l1, 0, j, k, 0);
                ((zzk) (obj)).a(hi1);
                hi1.recycle();
                return;
            }
            if ("currentTime".equals(obj1))
            {
                hi1 = (String)map.get("time");
                if (hi1 == null)
                {
                    b.c("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    ((zzk) (obj)).a((int)(Float.parseFloat(hi1) * 1000F));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    b.c((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(hi1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((zzk) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((zzk) (obj)).f();
                return;
            }
            if ("mimetype".equals(obj1))
            {
                ((zzk) (obj)).setMimeType((String)map.get("mimetype"));
                return;
            }
            if ("muted".equals(obj1))
            {
                if (Boolean.parseBoolean((String)map.get("muted")))
                {
                    ((zzk) (obj)).i();
                    return;
                } else
                {
                    ((zzk) (obj)).j();
                    return;
                }
            }
            if ("pause".equals(obj1))
            {
                ((zzk) (obj)).g();
                return;
            }
            if ("play".equals(obj1))
            {
                ((zzk) (obj)).h();
                return;
            }
            if ("show".equals(obj1))
            {
                ((zzk) (obj)).setVisibility(0);
                return;
            }
            if ("src".equals(obj1))
            {
                ((zzk) (obj)).a((String)map.get("src"));
                return;
            }
            if ("volume".equals(obj1))
            {
                hi1 = (String)map.get("volume");
                if (hi1 == null)
                {
                    b.c("Level parameter missing from volume video GMSG.");
                    return;
                }
                try
                {
                    ((zzk) (obj)).a(Float.parseFloat(hi1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    b.c((new StringBuilder("Could not parse volume parameter from volume video GMSG: ")).append(hi1).toString());
                }
                return;
            }
            if ("watermark".equals(obj1))
            {
                ((zzk) (obj)).k();
                return;
            } else
            {
                b.c((new StringBuilder("Unknown video action: ")).append(((String) (obj1))).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
