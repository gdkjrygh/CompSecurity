// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class A extends JSONObject
{

    public A()
    {
    }

    public A(String s)
    {
        super(s);
    }

    public A(Map map)
    {
        if (map == null)
        {
            throw new IllegalArgumentException("copyFrom may not be null.");
        }
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null && entry.getValue() != null)
            {
                b(entry.getKey().toString(), entry.getValue());
            }
        } while (true);
    }

    public A(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            throw new IllegalArgumentException("original may not be null.");
        }
        Iterator iterator = jsonobject.keys();
        try
        {
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                b(s, jsonobject.get(s));
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new RuntimeException(jsonobject);
        }
    }

    public final A a(SharedPreferences sharedpreferences)
    {
        if (sharedpreferences != null)
        {
            sharedpreferences = sharedpreferences.getAll().entrySet().iterator();
            while (sharedpreferences.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)sharedpreferences.next();
                b((String)entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public A a(String s, double d)
    {
        if (s == null)
        {
            return this;
        }
        try
        {
            super.put(s, d);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public A a(String s, int i)
    {
        if (s == null)
        {
            return this;
        }
        try
        {
            super.put(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public A a(String s, long l)
    {
        if (s == null)
        {
            return this;
        }
        try
        {
            super.put(s, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public A a(String s, Object obj)
    {
        if (s == null)
        {
            return this;
        }
        try
        {
            super.putOpt(s, c.a.a(obj));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public A a(String s, boolean flag)
    {
        if (s == null)
        {
            return this;
        }
        try
        {
            super.put(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public final A a(Map map)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                b((String)entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public A b(String s, Object obj)
    {
        if (s == null)
        {
            return this;
        }
        if (obj == null)
        {
            remove(s);
            return this;
        }
        try
        {
            super.put(s, c.a.a(obj));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return this;
    }

    public Object get(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = ((String) (super.get(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public String getString(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = super.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public Iterator keys()
    {
        return super.keys();
    }

    public JSONObject put(String s, double d)
    {
        return a(s, d);
    }

    public JSONObject put(String s, int i)
    {
        return a(s, i);
    }

    public JSONObject put(String s, long l)
    {
        return a(s, l);
    }

    public JSONObject put(String s, Object obj)
    {
        return b(s, obj);
    }

    public JSONObject put(String s, boolean flag)
    {
        return a(s, flag);
    }

    public JSONObject putOpt(String s, Object obj)
    {
        return a(s, obj);
    }

    public String toString(int i)
    {
        String s;
        try
        {
            s = super.toString(i);
        }
        catch (JSONException jsonexception)
        {
            return toString();
        }
        return s;
    }
}
