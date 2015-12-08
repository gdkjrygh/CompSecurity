// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            a, MitekAnalyzer, MiSnap, an

public final class am extends FrameLayout
    implements a
{

    Handler a;
    List b;
    private MiSnap c;
    private MitekAnalyzer d;
    private List e;
    private long f;
    private HashMap g;

    private am(MiSnap misnap, Handler handler)
    {
        super(misnap, null, 0);
        a = null;
        e = new ArrayList();
        g = new HashMap();
        b = new ArrayList();
        c = misnap;
        f = System.currentTimeMillis();
        a = handler;
    }

    private am(MiSnap misnap, Handler handler, byte byte0)
    {
        this(misnap, handler);
    }

    am(MiSnap misnap, Handler handler, char c1)
    {
        this(misnap, handler, (byte)0);
    }

    public final int a(MitekAnalyzer mitekanalyzer)
    {
        boolean flag = true;
        if (d == null)
        {
            d = mitekanalyzer;
        }
        if (d.l() == null || d.l().size() != 5)
        {
            a(c.getString(R.string.uxp_not_found), -1);
        } else
        if (!d.b() && d.c())
        {
            a(c.getString(R.string.uxp_closeness_failure), d.g());
        } else
        if (!d.a())
        {
            a(c.getString(R.string.uxp_angle_failure), d.f());
        } else
        if (!d.d())
        {
            a(c.getString(R.string.uxp_brightness_failure), d.j());
        } else
        if (!d.e())
        {
            a(c.getString(R.string.uxp_sharpness_failure), d.k());
        } else
        {
            a(c.getString(R.string.uxp_capture_unsteady), -1);
            flag = false;
        }
        if (flag)
        {
            a.sendEmptyMessage(13);
        }
        return 0;
    }

    final JSONArray a()
    {
        JSONArray jsonarray;
        Object obj;
        jsonarray = new JSONArray();
        obj = e.iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            JSONObject jsonobject;
            an an1;
            JSONException jsonexception1;
            JSONArray jsonarray1;
            try
            {
                if (d != null && !jsonarray.getJSONObject(jsonarray.length() - 1).has(c.getString(R.string.uxp_capture_manual)))
                {
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.j());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_brightness), obj));
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.k());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_sharpness), obj));
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.f());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_angle), obj));
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.g());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_rectangle), obj));
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.h());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_width), obj));
                    obj = new JSONArray();
                    ((JSONArray) (obj)).put(System.currentTimeMillis() - f);
                    ((JSONArray) (obj)).put(d.i());
                    jsonarray.put((new JSONObject()).put(c.getString(R.string.uxp_measured_height), obj));
                }
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                return jsonarray;
            }
            return jsonarray;
        }
        an1 = (an)((Iterator) (obj)).next();
        jsonobject = new JSONObject();
        jsonarray1 = new JSONArray();
        try
        {
            if (an1.b != -1)
            {
                break; /* Loop/switch isn't completed */
            }
            jsonarray1.put(an1.a);
            jsonobject.put(an1.c, jsonarray1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception1)
        {
            jsonexception1.printStackTrace();
        }
_L3:
        jsonarray.put(jsonobject);
        if (true) goto _L2; else goto _L1
_L1:
        jsonarray1.put(an1.a);
        jsonarray1.put(an1.b);
        jsonobject.put(an1.c, jsonarray1);
          goto _L3
    }

    final void a(String s)
    {
        a(s, -1);
    }

    final void a(String s, int i)
    {
        e.size();
        e.add(new an(this, s, System.currentTimeMillis() - f, i));
    }
}
