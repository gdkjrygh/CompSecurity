// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class adq extends acq
{

    private final Map a = new WeakHashMap();

    public adq()
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
                kx.a();
                j = oe.a(context, Integer.parseInt(map));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                of.e((new StringBuilder("Could not parse ")).append(s).append(" in a video GMSG: ").append(map).toString());
                return i;
            }
        }
        return j;
    }

    public final void b(akk akk1, Map map)
    {
        Object obj1 = (String)map.get("action");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        of.e("Action missing from video GMSG.");
_L4:
        return;
_L2:
        if (of.a(3))
        {
            JSONObject jsonobject = new JSONObject(map);
            jsonobject.remove("google.afma.Notify_dt");
            of.a((new StringBuilder("Video GMSG: ")).append(((String) (obj1))).append(" ").append(jsonobject.toString()).toString());
        }
        if (!"background".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        map = (String)map.get("color");
        if (TextUtils.isEmpty(map))
        {
            of.e("Color parameter missing from color video GMSG.");
            return;
        }
        int i;
        i = Color.parseColor(map);
        map = akk1.f();
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
            catch (akk akk1)
            {
                of.e("Invalid color parameter in video GMSG.");
            }
            return;
        }
        a.put(akk1, Integer.valueOf(i));
        return;
        Object obj = akk1.f();
        if (obj == null)
        {
            of.e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean flag = "new".equals(obj1);
        boolean flag1 = "position".equals(obj1);
        if (flag || flag1)
        {
            obj1 = akk1.getContext();
            int j = a(((Context) (obj1)), map, "x", 0);
            int l = a(((Context) (obj1)), map, "y", 0);
            int j1 = a(((Context) (obj1)), map, "w", -1);
            int k1 = a(((Context) (obj1)), map, "h", -1);
            if (flag && ((me) (obj)).b() == null)
            {
                ((me) (obj)).b(j, l, j1, k1);
                if (a.containsKey(akk1))
                {
                    j = ((Integer)a.get(akk1)).intValue();
                    ((me) (obj)).b().setBackgroundColor(j);
                    return;
                }
            } else
            {
                ((me) (obj)).a(j, l, j1, k1);
                return;
            }
        } else
        {
            obj = ((me) (obj)).b();
            if (obj == null)
            {
                ml.a(akk1, "no_video_view", null);
                return;
            }
            if ("click".equals(obj1))
            {
                akk1 = akk1.getContext();
                int k = a(akk1, map, "x", 0);
                int i1 = a(akk1, map, "y", 0);
                long l1 = SystemClock.uptimeMillis();
                akk1 = MotionEvent.obtain(l1, l1, 0, k, i1, 0);
                ((ml) (obj)).a(akk1);
                akk1.recycle();
                return;
            }
            if ("controls".equals(obj1))
            {
                akk1 = (String)map.get("enabled");
                if (akk1 == null)
                {
                    of.e("Enabled parameter missing from controls video GMSG.");
                    return;
                } else
                {
                    ((ml) (obj)).a(Boolean.parseBoolean(akk1));
                    return;
                }
            }
            if ("currentTime".equals(obj1))
            {
                akk1 = (String)map.get("time");
                if (akk1 == null)
                {
                    of.e("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try
                {
                    ((ml) (obj)).a((int)(Float.parseFloat(akk1) * 1000F));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    of.e((new StringBuilder("Could not parse time parameter from currentTime video GMSG: ")).append(akk1).toString());
                }
                return;
            }
            if ("hide".equals(obj1))
            {
                ((ml) (obj)).setVisibility(4);
                return;
            }
            if ("load".equals(obj1))
            {
                ((ml) (obj)).b();
                return;
            }
            if ("muted".equals(obj1))
            {
                if (Boolean.parseBoolean((String)map.get("muted")))
                {
                    ((ml) (obj)).e();
                    return;
                } else
                {
                    ((ml) (obj)).f();
                    return;
                }
            }
            if ("pause".equals(obj1))
            {
                ((ml) (obj)).c();
                return;
            }
            if ("play".equals(obj1))
            {
                ((ml) (obj)).d();
                return;
            }
            if ("show".equals(obj1))
            {
                ((ml) (obj)).setVisibility(0);
                return;
            }
            if ("src".equals(obj1))
            {
                ((ml) (obj)).a((String)map.get("src"));
                return;
            }
            if ("volume".equals(obj1))
            {
                akk1 = (String)map.get("volume");
                if (akk1 == null)
                {
                    of.e("Level parameter missing from volume video GMSG.");
                    return;
                }
                try
                {
                    ((ml) (obj)).a(Float.parseFloat(akk1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    of.e((new StringBuilder("Could not parse volume parameter from volume video GMSG: ")).append(akk1).toString());
                }
                return;
            }
            if ("watermark".equals(obj1))
            {
                ((ml) (obj)).h();
                return;
            } else
            {
                of.e((new StringBuilder("Unknown video action: ")).append(((String) (obj1))).toString());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
