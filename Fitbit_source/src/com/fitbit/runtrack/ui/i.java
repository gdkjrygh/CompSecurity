// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.e.a;
import com.fitbit.mixpanel.f;
import com.fitbit.mixpanel.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{

    private final String a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public i(String s)
    {
        a = s;
    }

    public void a(String s)
    {
        a(s, 1);
    }

    public void a(String s, int j)
    {
        d.put(s, Integer.valueOf(j));
    }

    public void a(String s, String s1)
    {
        b.put(s, s1);
    }

    public void a(String s, List list)
    {
        c.put(s, list);
    }

    public void f()
    {
        Object obj;
        try
        {
            obj = g();
            java.util.Map.Entry entry;
            for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); com.fitbit.mixpanel.f.a((String)entry.getKey(), ((Integer)entry.getValue()).intValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.f(getClass().getSimpleName(), String.format("%s was not recorded due to error", new Object[] {
                a
            }), ((Throwable) (obj)), new Object[0]);
            return;
        }
        com.fitbit.mixpanel.f.a(((h) (obj)).a(), ((h) (obj)).b());
        return;
    }

    public h g()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        JSONArray jsonarray;
        for (Iterator iterator1 = c.entrySet().iterator(); iterator1.hasNext(); jsonobject.put((String)entry1.getKey(), jsonarray))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
            jsonarray = new JSONArray();
            int j = 0;
            for (int k = ((List)entry1.getValue()).size(); j < k; j++)
            {
                jsonarray.put(j, ((List)entry1.getValue()).get(j));
            }

        }

    /* block-local class not found */
    class a {}

        return new a(a, jsonobject);
    }
}
