// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class kuk
    implements kuf
{

    private final Map a = new WeakHashMap();

    public kuk()
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
                j = jof.a().a(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                b.m((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(kxu kxu1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        b.m("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (b.p(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            (new StringBuilder("Video GMSG: ")).append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString();
            b.p(3);
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            b.m("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = kxu1.g();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        map = ((jov) (map)).d;
        if (map != null)
        {
            try
            {
                map.setBackgroundColor(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (kxu kxu1)
            {
                b.m("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(kxu1, Integer.valueOf(i));
        return;
        Object obj = kxu1.g();
        if (obj == null)
        {
            b.m("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        int l;
        int j1;
        int k1;
        int l1;
        if (flag || flag1)
        {
            obj1 = kxu1.getContext();
            l = a(((Context) (obj1)), map, "x", 0);
            j1 = a(((Context) (obj1)), map, "y", 0);
            k1 = a(((Context) (obj1)), map, "w", -1);
            l1 = a(((Context) (obj1)), map, "h", -1);
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
            if (!flag || ((jov) (obj)).d != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            map = ((jov) (obj)).b;
            obj1 = ((jov) (obj)).c;
            if (((ktm) (map)).a && obj1 != null)
            {
                map.a(((ktl) (obj1)), jqc.g().b(), new String[] {
                    "vpr"
                });
            }
            map = ((jov) (obj)).b.a();
            if (((jov) (obj)).d == null)
            {
                obj.d = new jpe(((jov) (obj)).a, ((jov) (obj)).e, j, ((jov) (obj)).b, map);
                ((jov) (obj)).j.addView(((jov) (obj)).d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                ((jov) (obj)).d.a(l, j1, k1, l1);
                ((jov) (obj)).e.j().i = false;
            }
            if (a.containsKey(kxu1))
            {
                j = ((Integer)a.get(kxu1)).intValue();
                ((jov) (obj)).d.setBackgroundColor(j);
                return;
            }
        } else
        {
            obj = ((jov) (obj)).d;
            if (obj == null)
            {
                jpe.a(kxu1);
                return;
            }
            if ("click".equals(obj1))
            {
                kxu1 = kxu1.getContext();
                int k = a(((Context) (kxu1)), map, "x", 0);
                int i1 = a(((Context) (kxu1)), map, "y", 0);
                long l2 = SystemClock.uptimeMillis();
                kxu1 = MotionEvent.obtain(l2, l2, 0, k, i1, 0);
                ((jpe) (obj)).d.dispatchTouchEvent(kxu1);
                kxu1.recycle();
                return;
            }
            if ("currentTime".equals(obj1))
            {
                kxu1 = (String)map.get("time");
                if (kxu1 == null)
                {
                    b.m("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    Float.parseFloat(kxu1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    b.m((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(kxu1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((jpe) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((jpe) (obj)).a();
                return;
            }
            if ("mimetype".equals(obj1))
            {
                obj.g = (String)map.get("mimetype");
                return;
            }
            if ("muted".equals(obj1))
            {
                Boolean.parseBoolean((String)map.get("muted"));
                return;
            }
            if (!"pause".equals(obj1) && !"play".equals(obj1))
            {
                if ("show".equals(obj1))
                {
                    ((jpe) (obj)).setVisibility(0);
                    return;
                }
                if ("src".equals(obj1))
                {
                    obj.h = (String)map.get("src");
                    return;
                }
                if ("volume".equals(obj1))
                {
                    kxu1 = (String)map.get("volume");
                    if (kxu1 == null)
                    {
                        b.m("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try
                    {
                        Float.parseFloat(kxu1);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        b.m((new StringBuilder("Could not parse volume parameter from volume video GMSG: ")).append(kxu1).toString());
                    }
                    return;
                }
                if ("watermark".equals(obj1))
                {
                    kxu1 = new TextView(((jpe) (obj)).d.getContext());
                    kxu1.setText((new StringBuilder("AdMob - ")).append(((jpe) (obj)).d.a()).toString());
                    kxu1.setTextColor(0xffff0000);
                    kxu1.setBackgroundColor(-256);
                    ((jpe) (obj)).b.addView(kxu1, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                    ((jpe) (obj)).b.bringChildToFront(kxu1);
                    return;
                } else
                {
                    b.m((new StringBuilder("Unknown video action: ")).append(((String) (obj1))).toString());
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (((jov) (obj)).d == null) goto _L4; else goto _L3
_L3:
        ((jov) (obj)).d.a(l, j1, k1, l1);
        return;
        if (true) goto _L4; else goto _L5
_L5:
    }
}
