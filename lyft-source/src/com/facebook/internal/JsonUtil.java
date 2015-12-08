// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class JsonUtil
{

    JsonUtil()
    {
    }

    static void jsonObjectClear(JSONObject jsonobject)
    {
        for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); jsonobject.remove())
        {
            jsonobject.next();
        }

    }

    static boolean jsonObjectContainsValue(JSONObject jsonobject, Object obj)
    {
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            Object obj1 = jsonobject.opt((String)iterator.next());
            if (obj1 != null && obj1.equals(obj))
            {
                return true;
            }
        }

        return false;
    }

    static Set jsonObjectEntrySet(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); hashset.add(new JSONObjectEntry(s, jsonobject.opt(s))))
        {
            s = (String)iterator.next();
        }

        return hashset;
    }

    static Set jsonObjectKeySet(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); hashset.add(jsonobject.next())) { }
        return hashset;
    }

    static void jsonObjectPutAll(JSONObject jsonobject, Map map)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.putOpt((String)entry.getKey(), entry.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new IllegalArgumentException(jsonobject);
            }
        }

    }

    static Collection jsonObjectValues(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); arraylist.add(jsonobject.opt((String)iterator.next()))) { }
        return arraylist;
    }

    private class JSONObjectEntry
        implements java.util.Map.Entry
    {

        private final String key;
        private final Object value;

        public volatile Object getKey()
        {
            return getKey();
        }

        public String getKey()
        {
            return key;
        }

        public Object getValue()
        {
            return value;
        }

        public Object setValue(Object obj)
        {
            throw new UnsupportedOperationException("JSONObjectEntry is immutable");
        }

        JSONObjectEntry(String s, Object obj)
        {
            key = s;
            value = obj;
        }
    }

}
