// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
{

    private static e g;
    public final Map a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    e(Map map, Map map1, Map map2, String s, String s1, String s2)
    {
        a = map;
        b = map1;
        c = map2;
        d = s;
        e = s1;
        f = s2;
    }

    public static e a()
    {
        com/facebook/internal/e;
        JVM INSTR monitorenter ;
        e e1;
        if (g == null)
        {
            g = new e(null, new FacebookRequestErrorClassification._cls1(), new FacebookRequestErrorClassification._cls2(), null, null, null);
        }
        e1 = g;
        com/facebook/internal/e;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        throw exception;
    }

    static Map a(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("items");
        if (jsonarray.length() == 0)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            jsonobject = jsonarray.optJSONObject(i);
            if (jsonobject == null)
            {
                continue;
            }
            int k = jsonobject.optInt("code");
            if (k == 0)
            {
                continue;
            }
            JSONArray jsonarray1 = jsonobject.optJSONArray("subcodes");
            if (jsonarray1 != null && jsonarray1.length() > 0)
            {
                jsonobject = new HashSet();
                for (int j = 0; j < jsonarray1.length(); j++)
                {
                    int l = jsonarray1.optInt(j);
                    if (l != 0)
                    {
                        jsonobject.add(Integer.valueOf(l));
                    }
                }

            } else
            {
                jsonobject = null;
            }
            hashmap.put(Integer.valueOf(k), jsonobject);
            i++;
        }
        return hashmap;
    }

    // Unreferenced inner class com/facebook/internal/FacebookRequestErrorClassification$1

/* anonymous class */
    static final class FacebookRequestErrorClassification._cls1 extends HashMap
    {

            
            {
                put(Integer.valueOf(2), null);
                put(Integer.valueOf(4), null);
                put(Integer.valueOf(9), null);
                put(Integer.valueOf(17), null);
                put(Integer.valueOf(341), null);
            }
    }


    // Unreferenced inner class com/facebook/internal/FacebookRequestErrorClassification$2

/* anonymous class */
    static final class FacebookRequestErrorClassification._cls2 extends HashMap
    {

            
            {
                put(Integer.valueOf(102), null);
                put(Integer.valueOf(190), null);
            }
    }


    // Unreferenced inner class com/facebook/internal/e$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.facebook.FacebookRequestError.Category.values().length];
            try
            {
                a[com.facebook.FacebookRequestError.Category.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.facebook.FacebookRequestError.Category.a.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.FacebookRequestError.Category.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
