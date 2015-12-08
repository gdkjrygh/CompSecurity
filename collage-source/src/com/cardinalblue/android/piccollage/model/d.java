// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            g, f

public class d
{

    private List a;
    private g b;
    private Path c;
    private float d;
    private int e;

    public d(String s)
        throws JSONException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new JSONException("frame string should not be empty");
        }
        s = new JSONObject(s);
        JSONArray jsonarray = s.getJSONArray("frame_rects");
        d = (float)s.optDouble("border_width");
        e = s.optInt("frame_id");
        a = new ArrayList(jsonarray.length());
        b = new g(1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        for (int i = 0; i < jsonarray.length(); i++)
        {
            a.add(new g(jsonarray.getJSONObject(i), d));
        }

        c = com.cardinalblue.android.piccollage.model.f.a();
    }

    public d(List list, int i)
    {
        this(list, i, com.cardinalblue.android.piccollage.model.f.a());
    }

    public d(List list, int i, Path path)
    {
        e = i;
        a = list;
        b = new g(1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        d = 0.025F;
        c = path;
    }

    public static d a()
    {
        return new d(new ArrayList(), 0, com.cardinalblue.android.piccollage.model.f.a());
    }

    public int a(float f1, float f2, int i, int j)
    {
        for (int k = 0; k < a.size(); k++)
        {
            if (((g)a.get(k)).a(i, j, false).contains(f1, f2))
            {
                return k;
            }
        }

        return -1;
    }

    public g a(int i)
    {
        if (i == -1 || i >= a.size())
        {
            return b;
        } else
        {
            return (g)a.get(i);
        }
    }

    public void a(float f1)
    {
        d = f1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((g)iterator.next()).a(d)) { }
    }

    public void a(int i, g g1)
    {
        if (i >= 0 && i < a.size() && g1 != null)
        {
            a.set(i, g1);
        }
    }

    public void a(List list, Path path)
    {
        a.clear();
        a.addAll(list);
        c = path;
    }

    public List b()
    {
        return a;
    }

    public int c()
    {
        return e;
    }

    public boolean d()
    {
        return c() == 0 && b().isEmpty();
    }

    public float e()
    {
        return d;
    }

    public f.h f()
    {
        if (e < com.cardinalblue.android.piccollage.model.f.h.values().length)
        {
            return com.cardinalblue.android.piccollage.model.f.h.values()[e];
        } else
        {
            return f.h.a;
        }
    }

    public String g()
    {
        if (e < com.cardinalblue.android.piccollage.model.f.h.values().length)
        {
            return com.cardinalblue.android.piccollage.model.f.h.values()[e].a();
        } else
        {
            return String.valueOf(e);
        }
    }

    public Path h()
    {
        return c;
    }

    public String toString()
    {
        Object obj;
        JSONArray jsonarray;
        try
        {
            obj = new JSONObject();
            jsonarray = new JSONArray();
            for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put(((g)iterator.next()).a())) { }
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        ((JSONObject) (obj)).put("frame_id", e);
        ((JSONObject) (obj)).put("frame_rects", jsonarray);
        ((JSONObject) (obj)).put("border_width", d);
        obj = ((JSONObject) (obj)).toString();
        return ((String) (obj));
    }
}
