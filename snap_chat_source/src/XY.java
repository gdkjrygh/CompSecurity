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

public final class XY
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

    public static long a(XA xa)
    {
        return a(xa.f);
    }

    public static long a(Xr xr)
    {
        return b(xr.a("Content-Length"));
    }

    public static long a(Xy xy)
    {
        return a(xy.c);
    }

    public static Xy a(Xe xe, XA xa, Proxy proxy)
    {
        if (xa.c == 407)
        {
            return xe.b(proxy, xa);
        } else
        {
            return xe.a(proxy, xa);
        }
    }

    public static List a(Xr xr, String s)
    {
        ArrayList arraylist = new ArrayList();
        int k = xr.a.length / 2;
label0:
        for (int i = 0; i < k; i++)
        {
            if (!s.equalsIgnoreCase(xr.a(i)))
            {
                continue;
            }
            String s1 = xr.b(i);
            int j = 0;
            do
            {
                if (j >= s1.length())
                {
                    continue label0;
                }
                int l = XS.a(s1, j, " ");
                String s2 = s1.substring(j, l).trim();
                j = XS.a(s1, l);
                if (!s1.regionMatches(true, j, "realm=\"", 0, 7))
                {
                    continue label0;
                }
                j += 7;
                l = XS.a(s1, j, "\"");
                String s3 = s1.substring(j, l);
                j = XS.a(s1, XS.a(s1, l + 1, ",") + 1);
                arraylist.add(new Xj(s2, s3));
            } while (true);
        }

        return arraylist;
    }

    public static void a(Xy.a a1, Map map)
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
                a1.c.a(s, map);
            }
        } while (true);
    }

    public static boolean a(XA xa, Xr xr, Xy xy)
    {
        for (xa = c(xa.f).iterator(); xa.hasNext();)
        {
            String s = (String)xa.next();
            if (!XO.a(xr.c(s), xy.c.c(s)))
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

    public static Map b(Xr xr)
    {
        TreeMap treemap = new TreeMap(d);
        int j = xr.a.length / 2;
        for (int i = 0; i < j; i++)
        {
            String s = xr.a(i);
            String s1 = xr.b(i);
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

    public static boolean b(XA xa)
    {
        return c(xa.f).contains("*");
    }

    public static Xr c(XA xa)
    {
        Xr xr = xa.h.a.c;
        xa = c(xa.f);
        if (xa.isEmpty())
        {
            return (new Xr.a()).a();
        }
        Xr.a a1 = new Xr.a();
        int i = 0;
        for (int j = xr.a.length / 2; i < j; i++)
        {
            String s = xr.a(i);
            if (xa.contains(s))
            {
                a1.a(s, xr.b(i));
            }
        }

        return a1.a();
    }

    private static Set c(Xr xr)
    {
        Object obj1 = Collections.emptySet();
        int k = xr.a.length / 2;
        for (int i = 0; i < k;)
        {
            Object obj2 = obj1;
            if ("Vary".equalsIgnoreCase(xr.a(i)))
            {
                obj2 = xr.b(i);
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

    static 
    {
        XM.a();
        e = XM.b();
        a = (new StringBuilder()).append(e).append("-Sent-Millis").toString();
        b = (new StringBuilder()).append(e).append("-Received-Millis").toString();
        c = (new StringBuilder()).append(e).append("-Selected-Protocol").toString();
    }
}
