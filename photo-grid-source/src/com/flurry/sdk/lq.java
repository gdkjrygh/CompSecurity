// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class lq
{

    public static List a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            Object obj = jsonarray.get(i);
            if (!(obj instanceof JSONObject))
            {
                throw new JSONException("Array contains unsupported objects. JSONArray param must contain JSON object.");
            }
            arraylist.add((JSONObject)obj);
        }

        return arraylist;
    }

    public static Map a(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        Object obj;
        Object obj1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(obj, (String)obj1))
        {
            obj = iterator.next();
            if (!(obj instanceof String))
            {
                throw new JSONException("JSONObject contains unsupported type for key in the map.");
            }
            obj = (String)obj;
            obj1 = jsonobject.get(((String) (obj)));
            if (!(obj1 instanceof String))
            {
                throw new JSONException("JSONObject contains unsupported type for value in the map.");
            }
        }

        return hashmap;
    }

    public static void a(JSONObject jsonobject, String s, float f)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        } else
        {
            jsonobject.putOpt(s, Float.valueOf(f));
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, int i)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        } else
        {
            jsonobject.put(s, i);
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, long l)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        } else
        {
            jsonobject.put(s, l);
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, Object obj)
    {
        if (jsonobject == null)
        {
            throw new NullPointerException("Null Json object");
        }
        if (obj == null)
        {
            jsonobject.put(s, JSONObject.NULL);
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, String s1)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        }
        if (s1 != null)
        {
            jsonobject.put(s, s1);
            return;
        } else
        {
            jsonobject.put(s, JSONObject.NULL);
            return;
        }
    }

    public static void a(JSONObject jsonobject, String s, boolean flag)
    {
        if (jsonobject == null)
        {
            throw new IOException("Null Json object");
        } else
        {
            jsonobject.put(s, flag);
            return;
        }
    }

    public static List b(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            Object obj = jsonarray.get(i);
            if (!(obj instanceof String))
            {
                throw new JSONException("Array contains unsupported objects. JSONArray param must contain String object.");
            }
            arraylist.add((String)obj);
        }

        return arraylist;
    }
}
