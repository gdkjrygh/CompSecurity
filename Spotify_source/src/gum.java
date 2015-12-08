// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class gum
{

    public static final String a;
    public static final String b;
    public static final String c;
    private static final Comparator d = new Comparator() {

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
    private static String e;

    public static long a(grh grh1)
    {
        return b(grh1.a("Content-Length"));
    }

    public static long a(grq grq1)
    {
        return a(grq1.c);
    }

    public static long a(grt grt1)
    {
        return a(grt1.f);
    }

    public static grq a(gql gql1, grt grt1, Proxy proxy)
    {
        if (grt1.c == 407)
        {
            return gql1.b(proxy, grt1);
        } else
        {
            return gql1.a(proxy, grt1);
        }
    }

    public static Map a(grh grh1, String s)
    {
        TreeMap treemap = new TreeMap(d);
        int j = grh1.a.length / 2;
        for (int i = 0; i < j; i++)
        {
            String s1 = grh1.a(i);
            String s2 = grh1.b(i);
            ArrayList arraylist = new ArrayList();
            List list = (List)treemap.get(s1);
            if (list != null)
            {
                arraylist.addAll(list);
            }
            arraylist.add(s2);
            treemap.put(s1, Collections.unmodifiableList(arraylist));
        }

        if (s != null)
        {
            treemap.put(null, Collections.unmodifiableList(Collections.singletonList(s)));
        }
        return Collections.unmodifiableMap(treemap);
    }

    public static void a(grr grr1, Map map)
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
                grr1.b(s, map);
            }
        } while (true);
    }

    public static boolean a(grt grt1, grh grh1, grq grq1)
    {
        for (grt1 = b(grt1.f).iterator(); grt1.hasNext();)
        {
            String s = (String)grt1.next();
            if (!gsp.a(grh1.c(s), grq1.c.c(s)))
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

    public static List b(grh grh1, String s)
    {
        ArrayList arraylist = new ArrayList();
        int k = grh1.a.length / 2;
label0:
        for (int i = 0; i < k; i++)
        {
            if (!s.equalsIgnoreCase(grh1.a(i)))
            {
                continue;
            }
            String s1 = grh1.b(i);
            int j = 0;
            do
            {
                if (j >= s1.length())
                {
                    continue label0;
                }
                int l = gtz.a(s1, j, " ");
                String s2 = s1.substring(j, l).trim();
                j = gtz.a(s1, l);
                if (!s1.regionMatches(true, j, "realm=\"", 0, 7))
                {
                    continue label0;
                }
                j += 7;
                l = gtz.a(s1, j, "\"");
                String s3 = s1.substring(j, l);
                j = gtz.a(s1, gtz.a(s1, l + 1, ",") + 1);
                arraylist.add(new gqy(s2, s3));
            } while (true);
        }

        return arraylist;
    }

    private static Set b(grh grh1)
    {
        Object obj1 = Collections.emptySet();
        int k = grh1.a.length / 2;
        for (int i = 0; i < k;)
        {
            Object obj2 = obj1;
            if ("Vary".equalsIgnoreCase(grh1.a(i)))
            {
                obj2 = grh1.b(i);
                Object obj = obj1;
                if (((Set) (obj1)).isEmpty())
                {
                    obj = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                obj1 = ((String) (obj2)).split(",");
                int l = obj1.length;
                int j = 0;
                do
                {
                    obj2 = obj;
                    if (j >= l)
                    {
                        break;
                    }
                    ((Set) (obj)).add(obj1[j].trim());
                    j++;
                } while (true);
            }
            i++;
            obj1 = obj2;
        }

        return ((Set) (obj1));
    }

    public static boolean b(grt grt1)
    {
        return b(grt1.f).contains("*");
    }

    public static grh c(grt grt1)
    {
        grh grh1 = grt1.h.a.c;
        grt1 = b(grt1.f);
        if (grt1.isEmpty())
        {
            return (new gri()).a();
        }
        gri gri1 = new gri();
        int i = 0;
        for (int j = grh1.a.length / 2; i < j; i++)
        {
            String s = grh1.a(i);
            if (grt1.contains(s))
            {
                gri1.a(s, grh1.b(i));
            }
        }

        return gri1.a();
    }

    static 
    {
        gsk.a();
        e = gsk.b();
        a = (new StringBuilder()).append(e).append("-Sent-Millis").toString();
        b = (new StringBuilder()).append(e).append("-Received-Millis").toString();
        c = (new StringBuilder()).append(e).append("-Selected-Protocol").toString();
    }
}
