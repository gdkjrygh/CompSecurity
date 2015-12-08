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

// Referenced classes of package com.facebook.internal:
//            u, v

public final class t
{

    private static t g;
    public final Map a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    t(Map map, Map map1, Map map2, String s, String s1, String s2)
    {
        a = map;
        b = map1;
        c = map2;
        d = s;
        e = s1;
        f = s2;
    }

    public static t a()
    {
        com/facebook/internal/t;
        JVM INSTR monitorenter ;
        t t1;
        if (g == null)
        {
            g = new t(null, new u(), new v(), null, null, null);
        }
        t1 = g;
        com/facebook/internal/t;
        JVM INSTR monitorexit ;
        return t1;
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

    // Unreferenced inner class com/facebook/internal/t$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[com.facebook.r.a.a().length];
            try
            {
                a[com.facebook.r.a.b - 1] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.facebook.r.a.a - 1] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.r.a.c - 1] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
