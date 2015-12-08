// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.A;
import com.c.a.a.g;
import com.c.a.b;
import com.c.a.p;
import com.c.a.w;
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

// Referenced classes of package com.c.a.a.a:
//            n, d

public final class m
{

    static final String a = g.b();
    public static final String b = (new StringBuilder()).append(a).append("-Sent-Millis").toString();
    public static final String c = (new StringBuilder()).append(a).append("-Received-Millis").toString();
    public static final String d = (new StringBuilder()).append(a).append("-Selected-Protocol").toString();
    private static final Comparator e = new n();

    public static long a(A a1)
    {
        return a(a1.f);
    }

    public static long a(p p1)
    {
        return b(p1.a("Content-Length"));
    }

    public static long a(w w1)
    {
        return a(w1.c);
    }

    public static w a(b b1, A a1, Proxy proxy)
        throws IOException
    {
        if (a1.c == 407)
        {
            return b1.b(proxy, a1);
        } else
        {
            return b1.a(proxy, a1);
        }
    }

    public static List a(p p1, String s)
    {
        ArrayList arraylist = new ArrayList();
        int k = p1.a.length / 2;
label0:
        for (int i = 0; i < k; i++)
        {
            if (!s.equalsIgnoreCase(p1.a(i)))
            {
                continue;
            }
            String s1 = p1.b(i);
            int j = 0;
            do
            {
                if (j >= s1.length())
                {
                    continue label0;
                }
                int l = com.c.a.a.a.d.a(s1, j, " ");
                String s2 = s1.substring(j, l).trim();
                j = com.c.a.a.a.d.a(s1, l);
                if (!s1.regionMatches(true, j, "realm=\"", 0, 7))
                {
                    continue label0;
                }
                j += 7;
                l = com.c.a.a.a.d.a(s1, j, "\"");
                String s3 = s1.substring(j, l);
                j = com.c.a.a.a.d.a(s1, com.c.a.a.a.d.a(s1, l + 1, ",") + 1);
                arraylist.add(new com.c.a.g(s2, s3));
            } while (true);
        }

        return arraylist;
    }

    public static void a(com.c.a.w.a a1, Map map)
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
                    int j = map.size();
                    for (int i = 0; i < j; i++)
                    {
                        if (i > 0)
                        {
                            stringbuilder.append("; ");
                        }
                        stringbuilder.append((String)map.get(i));
                    }

                    map = stringbuilder.toString();
                }
                a1.b(s, map);
            }
        } while (true);
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

    public static Map b(p p1)
    {
        TreeMap treemap = new TreeMap(e);
        int j = p1.a.length / 2;
        for (int i = 0; i < j; i++)
        {
            String s = p1.a(i);
            String s1 = p1.b(i);
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

    static 
    {
        g.a();
    }
}
