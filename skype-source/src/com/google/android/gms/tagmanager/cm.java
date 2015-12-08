// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.g;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cj, ci, c, cl, 
//            ak

public final class cm extends cj
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final List k = Arrays.asList(new String[] {
        "detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"
    });
    private static final Pattern l = Pattern.compile("dimension(\\d+)");
    private static final Pattern m = Pattern.compile("metric(\\d+)");
    private static Map n;
    private static Map o;
    private final Set p;
    private final ci q;
    private final com.google.android.gms.tagmanager.c r;

    public cm(Context context, com.google.android.gms.tagmanager.c c1)
    {
        this(c1, new ci(context));
    }

    private cm(com.google.android.gms.tagmanager.c c1, ci ci1)
    {
        super(a, new String[0]);
        r = c1;
        q = ci1;
        p = new HashSet();
        p.add("");
        p.add("0");
        p.add("false");
    }

    private static Double a(Object obj)
    {
        if (obj instanceof String)
        {
            try
            {
                obj = Double.valueOf((String)obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder("Cannot convert the object to Double: ")).append(((NumberFormatException) (obj)).getMessage()).toString());
            }
            return ((Double) (obj));
        }
        if (obj instanceof Integer)
        {
            return Double.valueOf(((Integer)obj).doubleValue());
        }
        if (obj instanceof Double)
        {
            return (Double)obj;
        } else
        {
            throw new RuntimeException((new StringBuilder("Cannot convert the object to Double: ")).append(obj.toString()).toString());
        }
    }

    private String a(String s)
    {
        s = ((String) (r.b(s)));
        if (s == null)
        {
            return null;
        } else
        {
            return s.toString();
        }
    }

    private static Map a(com.google.android.gms.internal.h.a a1)
    {
        a1 = ((com.google.android.gms.internal.h.a) (com.google.android.gms.tagmanager.cl.e(a1)));
        if (!(a1 instanceof Map))
        {
            return null;
        }
        Object obj = (Map)a1;
        a1 = new LinkedHashMap();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a1.put(entry.getKey().toString(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return a1;
    }

    private void a(g g1, Map map)
    {
        String s = a("transactionId");
        if (s != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.tagmanager.ak.a("Cannot find transactionId in data layer.");
_L6:
        return;
_L2:
        Object obj;
        LinkedList linkedlist;
        Object obj1;
        linkedlist = new LinkedList();
        java.util.Map.Entry entry;
        try
        {
            obj1 = b((com.google.android.gms.internal.h.a)map.get(g));
            ((Map) (obj1)).put("&t", "transaction");
            obj = (com.google.android.gms.internal.h.a)map.get(i);
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            com.google.android.gms.tagmanager.ak.a("Unable to send transaction", g1);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        obj = a(((com.google.android.gms.internal.h.a) (obj)));
_L3:
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a(((Map) (obj1)), (String)entry.getValue(), a((String)entry.getKey())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_248;
        if (n == null)
        {
            obj = new HashMap();
            ((HashMap) (obj)).put("transactionId", "&ti");
            ((HashMap) (obj)).put("transactionAffiliation", "&ta");
            ((HashMap) (obj)).put("transactionTax", "&tt");
            ((HashMap) (obj)).put("transactionShipping", "&ts");
            ((HashMap) (obj)).put("transactionTotal", "&tr");
            ((HashMap) (obj)).put("transactionCurrency", "&cu");
            n = ((Map) (obj));
        }
        obj = n;
          goto _L3
        linkedlist.add(obj1);
        obj = b("transactionProducts");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        obj1 = ((List) (obj)).iterator();
_L5:
        Map map1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_558;
        }
        map1 = (Map)((Iterator) (obj1)).next();
        if (map1.get("name") == null)
        {
            com.google.android.gms.tagmanager.ak.a("Unable to send transaction item hit due to missing 'name' field.");
            return;
        }
        Map map2;
        map2 = b((com.google.android.gms.internal.h.a)map.get(g));
        map2.put("&t", "item");
        map2.put("&ti", s);
        obj = (com.google.android.gms.internal.h.a)map.get(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        obj = a(((com.google.android.gms.internal.h.a) (obj)));
_L4:
        java.util.Map.Entry entry1;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a(map2, (String)entry1.getValue(), (String)map1.get(entry1.getKey())))
        {
            entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_545;
        if (o == null)
        {
            obj = new HashMap();
            ((HashMap) (obj)).put("name", "&in");
            ((HashMap) (obj)).put("sku", "&ic");
            ((HashMap) (obj)).put("category", "&iv");
            ((HashMap) (obj)).put("price", "&ip");
            ((HashMap) (obj)).put("quantity", "&iq");
            ((HashMap) (obj)).put("currency", "&cu");
            o = ((Map) (obj));
        }
        obj = o;
          goto _L4
        linkedlist.add(map2);
          goto _L5
        map = linkedlist.iterator();
        while (map.hasNext()) 
        {
            g1.a((Map)map.next());
        }
          goto _L6
    }

    private static void a(Map map, String s, String s1)
    {
        if (s1 != null)
        {
            map.put(s, s1);
        }
    }

    private static boolean a(Map map, String s)
    {
        map = (com.google.android.gms.internal.h.a)map.get(s);
        if (map == null)
        {
            return false;
        } else
        {
            return cl.d(map).booleanValue();
        }
    }

    private static Integer b(Object obj)
    {
        if (obj instanceof String)
        {
            try
            {
                obj = Integer.valueOf((String)obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder("Cannot convert the object to Integer: ")).append(((NumberFormatException) (obj)).getMessage()).toString());
            }
            return ((Integer) (obj));
        }
        if (obj instanceof Double)
        {
            return Integer.valueOf(((Double)obj).intValue());
        }
        if (obj instanceof Integer)
        {
            return (Integer)obj;
        } else
        {
            throw new RuntimeException((new StringBuilder("Cannot convert the object to Integer: ")).append(obj.toString()).toString());
        }
    }

    private List b(String s)
    {
        s = ((String) (r.b(s)));
        if (s == null)
        {
            return null;
        }
        if (!(s instanceof List))
        {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        for (Iterator iterator = ((List)s).iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof Map))
            {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }

        return (List)s;
    }

    private Map b(com.google.android.gms.internal.h.a a1)
    {
        if (a1 == null)
        {
            return new HashMap();
        }
        a1 = a(a1);
        if (a1 == null)
        {
            return new HashMap();
        }
        String s = (String)a1.get("&aip");
        if (s != null && p.contains(s.toLowerCase()))
        {
            a1.remove("&aip");
        }
        return a1;
    }

    private static a c(Map map)
    {
        a a1;
        Object obj;
        a1 = new a();
        obj = map.get("id");
        if (obj != null)
        {
            a1.a(String.valueOf(obj));
        }
        obj = map.get("name");
        if (obj != null)
        {
            a1.b(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null)
        {
            a1.c(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null)
        {
            a1.d(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null)
        {
            a1.e(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null)
        {
            a1.f(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null)
        {
            a1.a(b(obj).intValue());
        }
        obj = map.get("price");
        if (obj != null)
        {
            a1.a(a(obj).doubleValue());
        }
        obj = map.get("quantity");
        if (obj != null)
        {
            a1.b(b(obj).intValue());
        }
        obj = map.keySet().iterator();
_L2:
        String s;
        Matcher matcher;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)((Iterator) (obj)).next();
        matcher = l.matcher(s);
        if (matcher.matches())
        {
            int i1;
            try
            {
                i1 = Integer.parseInt(matcher.group(1));
            }
            catch (NumberFormatException numberformatexception)
            {
                com.google.android.gms.tagmanager.ak.b((new StringBuilder("illegal number in custom dimension value: ")).append(s).toString());
                continue; /* Loop/switch isn't completed */
            }
            a1.a(i1, String.valueOf(map.get(s)));
            continue; /* Loop/switch isn't completed */
        }
        numberformatexception = m.matcher(s);
        if (!numberformatexception.matches())
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1 = Integer.parseInt(numberformatexception.group(1));
        a1.a(j1, b(map.get(s)).intValue());
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception1;
        numberformatexception1;
        com.google.android.gms.tagmanager.ak.b((new StringBuilder("illegal number in custom metric value: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return a1;
    }

    public final volatile com.google.android.gms.internal.h.a a(Map map)
    {
        return super.a(map);
    }

    public final volatile boolean a()
    {
        return super.a();
    }

    public final volatile String b()
    {
        return super.b();
    }

    public final void b(Map map)
    {
        g g1 = q.a("_GTM_DEFAULT_TRACKER_");
        g1.a(a(map, "collect_adid"));
        if (!a(map, d))
        {
            break MISSING_BLOCK_LABEL_1048;
        }
        com.google.android.gms.analytics.d.e e1 = new com.google.android.gms.analytics.d.e();
        Object obj = b((com.google.android.gms.internal.h.a)map.get(g));
        e1.a(((Map) (obj)));
        if (a(map, e))
        {
            map = ((Map) (r.b("ecommerce")));
            Object obj1;
            RuntimeException runtimeexception;
            Object obj2;
            RuntimeException runtimeexception1;
            String s;
            boolean flag;
            if (map instanceof Map)
            {
                map = (Map)map;
            } else
            {
                map = null;
            }
        } else
        {
            map = ((Map) (com.google.android.gms.tagmanager.cl.e((com.google.android.gms.internal.h.a)map.get(f))));
            if (map instanceof Map)
            {
                map = (Map)map;
            } else
            {
                map = null;
            }
        }
        if (map == null) goto _L2; else goto _L1
_L1:
        obj1 = (String)((Map) (obj)).get("&cu");
        obj = obj1;
        if (obj1 == null)
        {
            obj = (String)map.get("currencyCode");
        }
        if (obj != null)
        {
            e1.a("&cu", ((String) (obj)));
        }
        obj = map.get("impressions");
        if (obj instanceof List)
        {
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext();)
            {
                obj1 = (Map)((Iterator) (obj)).next();
                try
                {
                    e1.a(c(((Map) (obj1))), (String)((Map) (obj1)).get("list"));
                }
                // Misplaced declaration of an exception variable
                catch (RuntimeException runtimeexception)
                {
                    com.google.android.gms.tagmanager.ak.a((new StringBuilder("Failed to extract a product from DataLayer. ")).append(runtimeexception.getMessage()).toString());
                }
            }

        }
        if (map.containsKey("promoClick"))
        {
            obj = (List)((Map)map.get("promoClick")).get("promotions");
        } else
        if (map.containsKey("promoView"))
        {
            obj = (List)((Map)map.get("promoView")).get("promotions");
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Map)((Iterator) (obj)).next();
        runtimeexception = new c();
        s = (String)((Map) (obj2)).get("id");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        runtimeexception.a(String.valueOf(s));
        s = (String)((Map) (obj2)).get("name");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        runtimeexception.b(String.valueOf(s));
        s = (String)((Map) (obj2)).get("creative");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        runtimeexception.c(String.valueOf(s));
        obj2 = (String)((Map) (obj2)).get("position");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        runtimeexception.d(String.valueOf(obj2));
        e1.a(runtimeexception);
        continue; /* Loop/switch isn't completed */
        runtimeexception;
        com.google.android.gms.tagmanager.ak.a((new StringBuilder("Failed to extract a promotion from DataLayer. ")).append(runtimeexception.getMessage()).toString());
        if (true) goto _L6; else goto _L5
_L5:
        if (!map.containsKey("promoClick")) goto _L8; else goto _L7
_L7:
        e1.a("&promoa", "click");
        flag = false;
_L14:
        if (!flag) goto _L2; else goto _L9
_L9:
        obj = k.iterator();
_L12:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L10
_L10:
        runtimeexception = (String)((Iterator) (obj)).next();
        if (!map.containsKey(runtimeexception)) goto _L12; else goto _L11
_L11:
        map = (Map)map.get(runtimeexception);
        obj = (List)map.get("products");
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                obj2 = (Map)((Iterator) (obj)).next();
                try
                {
                    e1.a(c(((Map) (obj2))));
                }
                // Misplaced declaration of an exception variable
                catch (RuntimeException runtimeexception1)
                {
                    com.google.android.gms.tagmanager.ak.a((new StringBuilder("Failed to extract a product from DataLayer. ")).append(runtimeexception1.getMessage()).toString());
                }
            }

        }
          goto _L13
_L8:
        e1.a("&promoa", "view");
_L4:
        flag = true;
          goto _L14
_L13:
        if (!map.containsKey("actionField"))
        {
            break MISSING_BLOCK_LABEL_1009;
        }
        obj = (Map)map.get("actionField");
        map = new b(runtimeexception);
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("id")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_792;
        }
        map.a(String.valueOf(runtimeexception));
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("affiliation")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        map.b(String.valueOf(runtimeexception));
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("coupon")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_838;
        }
        map.c(String.valueOf(runtimeexception));
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("list")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_861;
        }
        map.e(String.valueOf(runtimeexception));
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("option")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_884;
        }
        map.d(String.valueOf(runtimeexception));
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("revenue")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_910;
        }
        map.a(a(runtimeexception).doubleValue());
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("tax")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        map.b(a(runtimeexception).doubleValue());
        runtimeexception = ((RuntimeException) (((Map) (obj)).get("shipping")));
        if (runtimeexception == null)
        {
            break MISSING_BLOCK_LABEL_962;
        }
        map.c(a(runtimeexception).doubleValue());
        obj = ((Map) (obj)).get("step");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_991;
        }
        map.a(b(obj).intValue());
_L15:
        try
        {
            e1.a(map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            com.google.android.gms.tagmanager.ak.a((new StringBuilder("Failed to extract a product action from DataLayer. ")).append(map.getMessage()).toString());
        }
_L2:
        g1.a(e1.a());
        return;
        map = new b(runtimeexception);
          goto _L15
        if (a(map, c))
        {
            g1.a(b((com.google.android.gms.internal.h.a)map.get(g)));
            return;
        }
        if (a(map, h))
        {
            a(g1, map);
            return;
        } else
        {
            com.google.android.gms.tagmanager.ak.b("Ignoring unknown tag.");
            return;
        }
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        a = e.az.toString();
        b = f.b.toString();
        c = f.l.toString();
        d = f.aG.toString();
        e = f.aA.toString();
        f = f.az.toString();
        g = f.k.toString();
        h = f.dd.toString();
        i = f.dg.toString();
        j = f.di.toString();
    }
}
