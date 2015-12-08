// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import com.facebook.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            u, v, w

public final class t
{

    private static t g;
    private final Map a;
    private final Map b;
    private final Map c;
    private final String d;
    private final String e;
    private final String f;

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
        com/facebook/b/t;
        JVM INSTR monitorenter ;
        t t1;
        if (g == null)
        {
            g = b();
        }
        t1 = g;
        com/facebook/b/t;
        JVM INSTR monitorexit ;
        return t1;
        Exception exception;
        exception;
        throw exception;
    }

    public static t a(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            return null;
        }
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        Map map = null;
        Map map1 = null;
        Map map3 = null;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject = jsonarray.optJSONObject(i);
            Map map2;
            Map map4;
            Map map5;
            String s3;
            String s4;
            String s5;
            if (jsonobject == null)
            {
                s5 = s;
                s4 = s1;
                s3 = s2;
                map5 = map;
                map4 = map1;
                map2 = map3;
            } else
            {
                String s6 = jsonobject.optString("name");
                map2 = map3;
                map4 = map1;
                map5 = map;
                s3 = s2;
                s4 = s1;
                s5 = s;
                if (s6 != null)
                {
                    if (s6.equalsIgnoreCase("other"))
                    {
                        s3 = jsonobject.optString("recovery_message", null);
                        map2 = a(jsonobject);
                        map4 = map1;
                        map5 = map;
                        s4 = s1;
                        s5 = s;
                    } else
                    if (s6.equalsIgnoreCase("transient"))
                    {
                        s4 = jsonobject.optString("recovery_message", null);
                        map4 = a(jsonobject);
                        map2 = map3;
                        map5 = map;
                        s3 = s2;
                        s5 = s;
                    } else
                    {
                        map2 = map3;
                        map4 = map1;
                        map5 = map;
                        s3 = s2;
                        s4 = s1;
                        s5 = s;
                        if (s6.equalsIgnoreCase("login_recoverable"))
                        {
                            s5 = jsonobject.optString("recovery_message", null);
                            map5 = a(jsonobject);
                            map2 = map3;
                            map4 = map1;
                            s3 = s2;
                            s4 = s1;
                        }
                    }
                }
            }
            i++;
            map3 = map2;
            map1 = map4;
            map = map5;
            s2 = s3;
            s1 = s4;
            s = s5;
        }
        return new t(map3, map1, map, s2, s1, s);
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
            if (jsonobject != null)
            {
                int k = jsonobject.optInt("code");
                if (k != 0)
                {
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
                }
            }
            i++;
        }
        return hashmap;
    }

    private static t b()
    {
        return new t(null, new u(), new v(), null, null, null);
    }

    public q a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return q.c;
        }
        if (a != null && a.containsKey(Integer.valueOf(i)))
        {
            Set set = (Set)a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(j)))
            {
                return q.b;
            }
        }
        if (c != null && c.containsKey(Integer.valueOf(i)))
        {
            Set set1 = (Set)c.get(Integer.valueOf(i));
            if (set1 == null || set1.contains(Integer.valueOf(j)))
            {
                return q.a;
            }
        }
        if (b != null && b.containsKey(Integer.valueOf(i)))
        {
            Set set2 = (Set)b.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(j)))
            {
                return q.c;
            }
        }
        return q.b;
    }

    public String a(q q1)
    {
        switch (w.a[q1.ordinal()])
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
