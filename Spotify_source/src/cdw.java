// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class cdw
    implements cdi
{

    private final Map a = new WeakHashMap();

    public cdw()
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
                bfq.a();
                j = bjz.a(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                bka.e((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void a(ckw ckw1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        bka.e("Action missing from video GMSG.");
_L5:
        return;
_L2:
        if (bka.a(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            bka.a((new StringBuilder("Video GMSG: ")).append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            bka.e("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = ckw1.u();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_157;
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
            catch (ckw ckw1)
            {
                bka.e("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(ckw1, Integer.valueOf(i));
        return;
        Object obj;
        boolean flag;
        boolean flag1;
        obj = ckw1.u();
        if (obj == null)
        {
            bka.e("Could not get underlay container for a video GMSG.");
            return;
        }
        flag = "new".equals(obj1);
        flag1 = "position".equals(obj1);
        if (!flag && !flag1) goto _L4; else goto _L3
_L3:
        obj1 = ckw1.getContext();
        int j = a(((Context) (obj1)), map, "x", 0);
        int k = a(((Context) (obj1)), map, "y", 0);
        int l = a(((Context) (obj1)), map, "w", -1);
        int i1 = a(((Context) (obj1)), map, "h", -1);
        float f;
        long l1;
        try
        {
            Integer.parseInt((String)map.get("player"));
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        if (flag && ((ckv) (obj)).a() == null)
        {
            if (((ckv) (obj)).d == null)
            {
                cbg.a(((ckv) (obj)).a.w().b, ((ckv) (obj)).a.v(), new String[] {
                    "vpr"
                });
                map = cbg.a(((ckv) (obj)).a.w().b);
                obj.d = new bhw(((ckv) (obj)).b, ((ckv) (obj)).a, ((ckv) (obj)).a.w().b, map);
                ((ckv) (obj)).c.addView(((ckv) (obj)).d, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                ((ckv) (obj)).d.a(j, k, l, i1);
                ((ckv) (obj)).a.k().f = false;
            }
            if (a.containsKey(ckw1))
            {
                j = ((Integer)a.get(ckw1)).intValue();
                ckw1 = ((ckv) (obj)).a();
                ckw1.setBackgroundColor(j);
                ckw1.g();
                return;
            }
        } else
        {
            btl.b("The underlay may only be modified from the UI thread.");
            if (((ckv) (obj)).d != null)
            {
                ((ckv) (obj)).d.a(j, k, l, i1);
                return;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        obj = ((ckv) (obj)).a();
        if (obj == null)
        {
            bhw.a(ckw1);
            return;
        }
        if ("click".equals(obj1))
        {
            ckw1 = ckw1.getContext();
            j = a(((Context) (ckw1)), map, "x", 0);
            k = a(((Context) (ckw1)), map, "y", 0);
            l1 = SystemClock.uptimeMillis();
            ckw1 = MotionEvent.obtain(l1, l1, 0, j, k, 0);
            if (((bhw) (obj)).c != null)
            {
                ((bhw) (obj)).c.dispatchTouchEvent(ckw1);
            }
            ckw1.recycle();
            return;
        }
        if ("currentTime".equals(obj1))
        {
            ckw1 = (String)map.get("time");
            if (ckw1 == null)
            {
                bka.e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try
            {
                j = (int)(Float.parseFloat(ckw1) * 1000F);
                if (((bhw) (obj)).c != null)
                {
                    ((bhw) (obj)).c.a(j);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                bka.e((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(ckw1).toString());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("hide".equals(obj1))
        {
            ((bhw) (obj)).setVisibility(4);
            return;
        }
        if ("load".equals(obj1))
        {
            ((bhw) (obj)).f();
            return;
        }
        if ("mimetype".equals(obj1))
        {
            map.get("mimetype");
            return;
        }
        if ("muted".equals(obj1))
        {
            if (!Boolean.parseBoolean((String)map.get("muted")))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((bhw) (obj)).c != null)
            {
                ((bhw) (obj)).c.g();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_834;
        if (((bhw) (obj)).c == null) goto _L7; else goto _L6
_L6:
        break MISSING_BLOCK_LABEL_825;
_L7:
        break; /* Loop/switch isn't completed */
        ((bhw) (obj)).c.h();
        return;
        if ("pause".equals(obj1))
        {
            if (((bhw) (obj)).c != null)
            {
                ((bhw) (obj)).c.d();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("play".equals(obj1))
        {
            if (((bhw) (obj)).c != null)
            {
                ((bhw) (obj)).c.c();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("show".equals(obj1))
        {
            ((bhw) (obj)).setVisibility(0);
            return;
        }
        if ("src".equals(obj1))
        {
            obj.f = (String)map.get("src");
            return;
        }
        if ("volume".equals(obj1))
        {
            ckw1 = (String)map.get("volume");
            if (ckw1 == null)
            {
                bka.e("Level parameter missing from volume video GMSG.");
                return;
            }
            try
            {
                f = Float.parseFloat(ckw1);
                if (((bhw) (obj)).c != null)
                {
                    ((bhw) (obj)).c.a(f);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                bka.e((new StringBuilder("Could not parse volume parameter from volume video GMSG: ")).append(ckw1).toString());
                return;
            }
        } else
        if ("watermark".equals(obj1))
        {
            ((bhw) (obj)).g();
            return;
        } else
        {
            bka.e((new StringBuilder("Unknown video action: ")).append(((String) (obj1))).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
    }
}
