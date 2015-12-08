// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.u;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aq, cw, cv, ac, 
//            z, cx

public final class av
    implements aq
{

    private final Map a = new WeakHashMap();

    public av()
    {
    }

    private static int a(Context context, Map map, String s, int i)
    {
        map = (String)map.get(s);
        int k = i;
        if (map != null)
        {
            try
            {
                j.a();
                k = com.google.android.gms.ads.internal.util.client.a.a(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.e((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return k;
    }

    public final void a(cw cw1, Map map)
    {
        Object obj = (String)map.get("action");
        if (obj != null) goto _L2; else goto _L1
_L1:
        b.e("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (b.a(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            b.a((new StringBuilder("Video GMSG: ")).append(((String) (obj))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj))
        {
            break MISSING_BLOCK_LABEL_170;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            b.e("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = cw1.q();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        map = map.a();
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (cw cw1)
            {
                b.e("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(cw1, Integer.valueOf(i));
        return;
        Object obj1 = cw1.q();
        if (obj1 == null)
        {
            b.e("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj);
        boolean flag1 = "position".equals(obj);
        if (flag || flag1)
        {
            obj = cw1.getContext();
            int k = a(((Context) (obj)), map, "x", 0);
            int l = a(((Context) (obj)), map, "y", 0);
            int i1 = a(((Context) (obj)), map, "w", -1);
            int j1 = a(((Context) (obj)), map, "h", -1);
            long l1;
            try
            {
                Integer.parseInt((String)map.get("player"));
            }
            // Misplaced declaration of an exception variable
            catch (Map map) { }
            if (flag && ((cv) (obj1)).a() == null)
            {
                if (((cv) (obj1)).d == null)
                {
                    com.google.android.gms.internal.z.a(((cv) (obj1)).a.s().b, ((cv) (obj1)).a.r(), new String[] {
                        "vpr"
                    });
                    com.google.android.gms.internal.z.a(((cv) (obj1)).a.s().b);
                    obj1.d = new h(((cv) (obj1)).b, ((cv) (obj1)).a);
                    ((cv) (obj1)).c.addView(((cv) (obj1)).d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                    ((cv) (obj1)).d.a(k, l, i1, j1);
                    ((cv) (obj1)).a.i().i = false;
                }
                if (a.containsKey(cw1))
                {
                    k = ((Integer)a.get(cw1)).intValue();
                    cw1 = ((cv) (obj1)).a();
                    cw1.setBackgroundColor(k);
                    cw1.b();
                    return;
                }
            } else
            {
                u.b("The underlay may only be modified from the UI thread.");
                if (((cv) (obj1)).d != null)
                {
                    ((cv) (obj1)).d.a(k, l, i1, j1);
                    return;
                }
            }
        }
        while (false) 
        {
            obj1 = ((cv) (obj1)).a();
            if (obj1 == null)
            {
                h.a(cw1);
                return;
            }
            if ("click".equals(obj))
            {
                cw1 = cw1.getContext();
                k = a(((Context) (cw1)), map, "x", 0);
                l = a(((Context) (cw1)), map, "y", 0);
                l1 = SystemClock.uptimeMillis();
                cw1 = MotionEvent.obtain(l1, l1, 0, k, l, 0);
                if (((h) (obj1)).d != null)
                {
                    ((h) (obj1)).d.dispatchTouchEvent(cw1);
                }
                cw1.recycle();
                return;
            }
            if ("currentTime".equals(obj))
            {
                cw1 = (String)map.get("time");
                if (cw1 == null)
                {
                    b.e("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    Float.parseFloat(cw1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    b.e((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(cw1).toString());
                }
                return;
            }
            if ("hide".equals(obj))
            {
                ((h) (obj1)).setVisibility(4);
                return;
            }
            if ("load".equals(obj))
            {
                ((h) (obj1)).a();
                return;
            }
            if ("mimetype".equals(obj))
            {
                ((h) (obj1)).setMimeType((String)map.get("mimetype"));
                return;
            }
            if ("muted".equals(obj))
            {
                Boolean.parseBoolean((String)map.get("muted"));
                return;
            }
            if (!"pause".equals(obj) && !"play".equals(obj))
            {
                if ("show".equals(obj))
                {
                    ((h) (obj1)).setVisibility(0);
                    return;
                }
                if ("src".equals(obj))
                {
                    obj1.i = (String)map.get("src");
                    return;
                }
                if ("volume".equals(obj))
                {
                    cw1 = (String)map.get("volume");
                    if (cw1 == null)
                    {
                        b.e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try
                    {
                        Float.parseFloat(cw1);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        b.e((new StringBuilder("Could not parse volume parameter from volume video GMSG: ")).append(cw1).toString());
                    }
                    return;
                }
                if ("watermark".equals(obj))
                {
                    ((h) (obj1)).b();
                    return;
                } else
                {
                    b.e((new StringBuilder("Unknown video action: ")).append(((String) (obj))).toString());
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
