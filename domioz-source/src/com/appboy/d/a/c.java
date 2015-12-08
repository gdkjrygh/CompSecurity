// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import a.a.az;
import a.a.bu;
import a.a.db;
import a.a.dc;
import a.a.dl;
import a.a.dm;
import a.a.j;
import com.appboy.b.b;
import com.appboy.f.a;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends Observable
    implements com.appboy.d.c
{

    private static final String i = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/d/a/c.getName()
    });
    protected final JSONObject a;
    protected final Map b;
    protected final String c;
    protected boolean d;
    protected boolean e;
    protected final long f;
    protected final long g;
    protected final EnumSet h;
    private final az j;
    private final db k;

    public c(JSONObject jsonobject, az az1, db db1)
    {
        a = jsonobject;
        b = dl.a(jsonobject.optJSONObject("extras"), new HashMap());
        j = az1;
        k = db1;
        c = jsonobject.getString("id");
        d = jsonobject.getBoolean("viewed");
        e = d;
        f = jsonobject.getLong("created");
        g = jsonobject.getLong("updated");
        jsonobject = jsonobject.optJSONArray("categories");
        if (jsonobject == null || jsonobject.length() == 0)
        {
            h = EnumSet.of(b.e);
        } else
        {
            h = EnumSet.noneOf(com/appboy/b/b);
            int i1 = 0;
            while (i1 < jsonobject.length()) 
            {
                az1 = com.appboy.b.b.a(jsonobject.getString(i1));
                if (az1 != null)
                {
                    h.add(az1);
                }
                i1++;
            }
        }
    }

    private boolean b()
    {
        if (dm.c(c))
        {
            com.appboy.f.a.d(i, "Card ID cannot be null");
            return false;
        } else
        {
            return true;
        }
    }

    public final volatile Object a()
    {
        return a;
    }

    public final boolean a(c c1)
    {
        return c.equals(c1.c) && g == c1.g && j == c1.j;
    }

    public final boolean a(EnumSet enumset)
    {
        for (enumset = enumset.iterator(); enumset.hasNext();)
        {
            b b1 = (b)enumset.next();
            if (h.contains(b1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean h()
    {
        if (j == null || k == null || !b())
        {
            break MISSING_BLOCK_LABEL_110;
        }
        az az1 = j;
        String s = c;
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        az1.a(new bu(j.h, jsonobject));
        k.a(c);
        return true;
        Exception exception;
        exception;
        exception.printStackTrace();
        com.appboy.f.a.b(i, "Failed to log feed card impression.", exception);
        return false;
    }

    public final boolean i()
    {
        if (j == null || !b())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        az az1 = j;
        String s = c;
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(s);
        jsonobject.put("ids", jsonarray);
        az1.a(new bu(j.i, jsonobject));
        return true;
        Exception exception;
        exception;
        exception.printStackTrace();
        com.appboy.f.a.b(i, "Failed to log feed card clicked.", exception);
        return false;
    }

    public final String j()
    {
        return c;
    }

    public final boolean k()
    {
        return d;
    }

    public final void l()
    {
        d = true;
    }

    public final boolean m()
    {
        return e;
    }

    public final void n()
    {
        e = true;
        setChanged();
        notifyObservers();
        try
        {
            db db1 = k;
            String s = c;
            if (!db1.d.contains(s))
            {
                db1.d.add(s);
                db1.a(db1.d, dc.a);
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

}
