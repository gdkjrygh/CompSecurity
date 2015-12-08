// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.b;
import com.squareup.okhttp.h;
import com.squareup.okhttp.internal.i;
import com.squareup.okhttp.o;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            e

public final class k
{

    static final String a = i.b();
    public static final String b = (new StringBuilder()).append(a).append("-Sent-Millis").toString();
    public static final String c = (new StringBuilder()).append(a).append("-Received-Millis").toString();
    public static final String d = (new StringBuilder()).append(a).append("-Selected-Protocol").toString();
    private static final Comparator e = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (String)obj;
            obj1 = (String)obj1;
            if (obj == obj1)
            {
                return 0;
            }
            if (obj == null)
            {
                return -1;
            }
            if (obj1 == null)
            {
                return 1;
            } else
            {
                return String.CASE_INSENSITIVE_ORDER.compare(obj, obj1);
            }
        }

    };

    public static long a(o o1)
    {
        return b(o1.a("Content-Length"));
    }

    public static long a(t t1)
    {
        return a(t1.c);
    }

    public static long a(v v1)
    {
        return a(v1.f);
    }

    public static t a(b b1, v v1, Proxy proxy)
        throws IOException
    {
        if (v1.c == 407)
        {
            return b1.b(proxy, v1);
        } else
        {
            return b1.a(proxy, v1);
        }
    }

    public static List a(o o1, String s)
    {
        ArrayList arraylist = new ArrayList();
        int i1 = o1.a.length / 2;
label0:
        for (int j = 0; j < i1; j++)
        {
            if (!s.equalsIgnoreCase(o1.a(j)))
            {
                continue;
            }
            String s1 = o1.b(j);
            int l = 0;
            do
            {
                if (l >= s1.length())
                {
                    continue label0;
                }
                int j1 = com.squareup.okhttp.internal.http.e.a(s1, l, " ");
                String s2 = s1.substring(l, j1).trim();
                l = com.squareup.okhttp.internal.http.e.a(s1, j1);
                if (!s1.regionMatches(true, l, "realm=\"", 0, 7))
                {
                    continue label0;
                }
                l += 7;
                j1 = com.squareup.okhttp.internal.http.e.a(s1, l, "\"");
                String s3 = s1.substring(l, j1);
                l = com.squareup.okhttp.internal.http.e.a(s1, com.squareup.okhttp.internal.http.e.a(s1, j1 + 1, ",") + 1);
                arraylist.add(new h(s2, s3));
            } while (true);
        }

        return arraylist;
    }

    public static void a(com.squareup.okhttp.t.a a1, Map map)
    {
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)iterator.next();
            String s = (String)map.getKey();
            if (("Cookie".equalsIgnoreCase(s) || "Cookie2".equalsIgnoreCase(s)) && !((List)map.getValue()).isEmpty())
            {
                map = (List)map.getValue();
                if (map.size() == 1)
                {
                    map = (String)map.get(0);
                } else
                {
                    StringBuilder stringbuilder = new StringBuilder();
                    int l = map.size();
                    for (int j = 0; j < l; j++)
                    {
                        if (j > 0)
                        {
                            stringbuilder.append("; ");
                        }
                        stringbuilder.append((String)map.get(j));
                    }

                    map = stringbuilder.toString();
                }
                a1.b(s, map);
            }
        } while (true);
    }

    public static boolean a(v v1, o o1, t t1)
    {
        for (v1 = c(v1.f).iterator(); v1.hasNext();)
        {
            String s = (String)v1.next();
            if (!com.squareup.okhttp.internal.k.a(o1.c(s), t1.c.c(s)))
            {
                return false;
            }
        }

        return true;
    }

    static boolean a(String s)
    {
        return !"Connection".equalsIgnoreCase(s) && !"Keep-Alive".equalsIgnoreCase(s) && !"Proxy-Authenticate".equalsIgnoreCase(s) && !"Proxy-Authorization".equalsIgnoreCase(s) && !"TE".equalsIgnoreCase(s) && !"Trailers".equalsIgnoreCase(s) && !"Transfer-Encoding".equalsIgnoreCase(s) && !"Upgrade".equalsIgnoreCase(s);
    }

    private static long b(String s)
    {
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    public static Map b(o o1)
    {
        TreeMap treemap = new TreeMap(e);
        int l = o1.a.length / 2;
        for (int j = 0; j < l; j++)
        {
            String s = o1.a(j);
            String s1 = o1.b(j);
            ArrayList arraylist = new ArrayList();
            List list = (List)treemap.get(s);
            if (list != null)
            {
                arraylist.addAll(list);
            }
            arraylist.add(s1);
            treemap.put(s, Collections.unmodifiableList(arraylist));
        }

        return Collections.unmodifiableMap(treemap);
    }

    public static boolean b(v v1)
    {
        return c(v1.f).contains("*");
    }

    public static o c(v v1)
    {
        o o1 = v1.h.a.c;
        v1 = c(v1.f);
        if (v1.isEmpty())
        {
            return (new com.squareup.okhttp.o.a()).a();
        }
        com.squareup.okhttp.o.a a1 = new com.squareup.okhttp.o.a();
        int j = 0;
        for (int l = o1.a.length / 2; j < l; j++)
        {
            String s = o1.a(j);
            if (v1.contains(s))
            {
                a1.a(s, o1.b(j));
            }
        }

        return a1.a();
    }

    private static Set c(o o1)
    {
        Object obj1 = Collections.emptySet();
        int i1 = o1.a.length / 2;
        for (int j = 0; j < i1;)
        {
            Object obj2 = obj1;
            if ("Vary".equalsIgnoreCase(o1.a(j)))
            {
                obj2 = o1.b(j);
                Object obj = obj1;
                if (((Set) (obj1)).isEmpty())
                {
                    obj = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                obj1 = ((String) (obj2)).split(",");
                int j1 = obj1.length;
                int l = 0;
                do
                {
                    obj2 = obj;
                    if (l >= j1)
                    {
                        break;
                    }
                    ((Set) (obj)).add(obj1[l].trim());
                    l++;
                } while (true);
            }
            j++;
            obj1 = obj2;
        }

        return ((Set) (obj1));
    }

    static 
    {
        i.a();
    }
}
