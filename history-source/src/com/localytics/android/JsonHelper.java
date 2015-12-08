// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class JsonHelper
{

    JsonHelper()
    {
    }

    public static Object fromJson(Object obj)
        throws JSONException
    {
        Object obj1;
        if (obj == JSONObject.NULL)
        {
            obj1 = null;
        } else
        {
            if (obj instanceof JSONObject)
            {
                return toMap((JSONObject)obj);
            }
            obj1 = obj;
            if (obj instanceof JSONArray)
            {
                return toList((JSONArray)obj);
            }
        }
        return obj1;
    }

    public static Map getMap(JSONObject jsonobject, String s)
        throws JSONException
    {
        return toMap(jsonobject.getJSONObject(s));
    }

    public static int getSafeIntegerFromMap(Map map, String s)
    {
        int i;
        i = 0;
        map = ((Map) (map.get(s)));
        if (map == null)
        {
            return 0;
        }
        if (!(map instanceof Integer)) goto _L2; else goto _L1
_L1:
        i = ((Integer)map).intValue();
_L4:
        return i;
_L2:
        if (map instanceof String)
        {
            i = Integer.parseInt((String)map);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List getSafeListFromMap(Map map, String s)
    {
        Object obj = null;
        s = ((String) (map.get(s)));
        if (s == null)
        {
            return null;
        }
        map = obj;
        if (s instanceof List)
        {
            map = (List)s;
        }
        return map;
    }

    public static Map getSafeMapFromMap(Map map, String s)
    {
        Object obj = null;
        s = ((String) (map.get(s)));
        if (s == null)
        {
            return null;
        }
        map = obj;
        if (s instanceof Map)
        {
            map = (Map)s;
        }
        return map;
    }

    public static String getSafeStringFromMap(Map map, String s)
    {
        Object obj;
        obj = null;
        s = ((String) (map.get(s)));
        if (s == null)
        {
            return null;
        }
        if (!(s instanceof Integer)) goto _L2; else goto _L1
_L1:
        map = Integer.toString(((Integer)s).intValue());
_L4:
        return map;
_L2:
        map = obj;
        if (s instanceof String)
        {
            map = (String)s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getSafeStringFromValue(Object obj)
    {
        String s;
        s = null;
        if (obj == null)
        {
            return null;
        }
        if (!(obj instanceof Integer)) goto _L2; else goto _L1
_L1:
        s = Integer.toString(((Integer)obj).intValue());
_L4:
        return s;
_L2:
        if (obj instanceof String)
        {
            s = (String)obj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean isEmptyObject(JSONObject jsonobject)
    {
        return jsonobject.names() == null;
    }

    public static Object toJSON(Object obj)
        throws JSONException
    {
        if (obj instanceof Map)
        {
            JSONObject jsonobject = new JSONObject();
            Map map = (Map)obj;
            Iterator iterator1 = map.keySet().iterator();
            do
            {
                obj = jsonobject;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = iterator1.next();
                jsonobject.put(obj.toString(), toJSON(map.get(obj)));
            } while (true);
        } else
        if (obj instanceof Iterable)
        {
            JSONArray jsonarray = new JSONArray();
            Iterator iterator = ((Iterable)obj).iterator();
            do
            {
                obj = jsonarray;
                if (!iterator.hasNext())
                {
                    break;
                }
                jsonarray.put(iterator.next());
            } while (true);
        }
        return obj;
    }

    public static List toList(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(fromJson(jsonarray.get(i)));
        }

        return arraylist;
    }

    public static Map toMap(JSONObject jsonobject)
        throws JSONException
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashmap.put(s, fromJson(jsonobject.get(s))))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }
}
