// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ea

public class ex
{
    public class a
    {

        public ex a;
        public int b;
        public ea c;
        public long d;
        public long e;
        public int f;
        final ex g;

        public JSONObject a()
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("event_id", c.c());
            jsonobject.put("event_start_time", d);
            jsonobject.put("event_end_time", d + e);
            if (c.q() != null)
            {
                jsonobject.put("event parameters", c.q());
            }
            if (f > 0)
            {
                jsonobject.put("view", f);
            }
            return jsonobject;
        }

        public a(ex ex2)
        {
            g = ex.this;
            super();
            a = ex2;
            b = 0;
            c = null;
            d = 0L;
            e = 0L;
        }
    }

    public class b
    {

        public float a;
        public float b;
        public long c;
        public long d;
        public int e;
        final ex f;

        public b()
        {
            f = ex.this;
            super();
        }
    }


    private static int d = 0;
    List a;
    List b;
    long c;

    public ex()
    {
        b = new ArrayList();
        a = new ArrayList();
    }

    public int a(ea ea, int i)
    {
        if (ea != null)
        {
            a a1 = new a(this);
            a1.c = ea;
            int j = d;
            d = j + 1;
            a1.b = j;
            a1.d = ct.B();
            a1.f = i;
            b.add(a1);
            return a1.b;
        } else
        {
            return -1;
        }
    }

    public void a()
    {
        c = ct.B();
    }

    public void a(float f1, float f2, int i, long l, long l1)
    {
        if (a.size() < 100)
        {
            b b1 = new b();
            b1.a = f1;
            b1.b = f2;
            b1.c = l;
            b1.d = l1;
            b1.e = i;
            a.add(b1);
        }
    }

    public boolean a(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.b == i)
            {
                a1.e = ct.B() - a1.d;
                return true;
            }
        }

        return false;
    }

    public long b()
    {
        return c;
    }

    public long c()
    {
        return b() + d();
    }

    public long d()
    {
        if (b.size() == 0)
        {
            return 0L;
        } else
        {
            a a1 = (a)b.get(b.size() - 1);
            return (a1.d + a1.e) - c;
        }
    }

    public a e()
    {
        return (a)b.get(b.size() - 1);
    }

    public JSONArray f()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            JSONObject jsonobject;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put(jsonobject))
            {
                b b1 = (b)iterator.next();
                jsonobject = new JSONObject();
                jsonobject.put("touch_x", b1.a);
                jsonobject.put("touch_y", b1.b);
                jsonobject.put("real_time", b1.c);
                jsonobject.put("creative_time", b1.d);
                jsonobject.put("orientation", b1.e);
            }

        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        return jsonarray;
    }

    public JSONArray g()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); jsonarray.put(((a)iterator.next()).a())) { }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return jsonarray;
    }

}
