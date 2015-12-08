// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            t, u, v

public final class s
{

    private static s g;
    private final Map a;
    private final Map b;
    private final Map c;
    private final String d;
    private final String e;
    private final String f;

    private s(Map map, Map map1, Map map2, String s1, String s2, String s3)
    {
        a = map;
        b = map1;
        c = map2;
        d = s1;
        e = s2;
        f = s3;
    }

    public static s a()
    {
        com/facebook/internal/s;
        JVM INSTR monitorenter ;
        s s1;
        if (g == null)
        {
            g = new s(null, new t(), new u(), null, null, null);
        }
        s1 = g;
        com/facebook/internal/s;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public static s a(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            return null;
        }
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Map map = null;
        Map map1 = null;
        Map map2 = null;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject = jsonarray.optJSONObject(i);
            Map map3 = map2;
            Map map4 = map1;
            Map map5 = map;
            String s4 = s3;
            String s5 = s2;
            String s6 = s1;
            if (jsonobject != null)
            {
                String s7 = jsonobject.optString("name");
                map3 = map2;
                map4 = map1;
                map5 = map;
                s4 = s3;
                s5 = s2;
                s6 = s1;
                if (s7 != null)
                {
                    if (s7.equalsIgnoreCase("other"))
                    {
                        s4 = jsonobject.optString("recovery_message", null);
                        map3 = a(jsonobject);
                        s6 = s1;
                        s5 = s2;
                        map5 = map;
                        map4 = map1;
                    } else
                    if (s7.equalsIgnoreCase("transient"))
                    {
                        s5 = jsonobject.optString("recovery_message", null);
                        map4 = a(jsonobject);
                        map3 = map2;
                        map5 = map;
                        s4 = s3;
                        s6 = s1;
                    } else
                    {
                        map3 = map2;
                        map4 = map1;
                        map5 = map;
                        s4 = s3;
                        s5 = s2;
                        s6 = s1;
                        if (s7.equalsIgnoreCase("login_recoverable"))
                        {
                            s6 = jsonobject.optString("recovery_message", null);
                            map5 = a(jsonobject);
                            map3 = map2;
                            map4 = map1;
                            s4 = s3;
                            s5 = s2;
                        }
                    }
                }
            }
            i++;
            map2 = map3;
            map1 = map4;
            map = map5;
            s3 = s4;
            s2 = s5;
            s1 = s6;
        }
        return new s(map2, map1, map, s3, s2, s1);
    }

    private static Map a(JSONObject jsonobject)
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

    public final int a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return o.c;
        }
        if (a != null && a.containsKey(Integer.valueOf(i)))
        {
            Set set = (Set)a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(j)))
            {
                return o.b;
            }
        }
        if (c != null && c.containsKey(Integer.valueOf(i)))
        {
            Set set1 = (Set)c.get(Integer.valueOf(i));
            if (set1 == null || set1.contains(Integer.valueOf(j)))
            {
                return o.a;
            }
        }
        if (b != null && b.containsKey(Integer.valueOf(i)))
        {
            Set set2 = (Set)b.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(j)))
            {
                return o.c;
            }
        }
        return o.b;
    }

    public final String a(int i)
    {
        switch (v.a[i - 1])
        {
        default:
            return null;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return f;

        case 3: // '\003'
            return e;
        }
    }
}
