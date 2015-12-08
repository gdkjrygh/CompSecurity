// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
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

public final class lqy extends lqx
{

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
    private final lqv q;
    private final lpu r;

    public lqy(Context context, lpu lpu1)
    {
        this(lpu1, new lqv(context));
    }

    private lqy(lpu lpu1, lqv lqv1)
    {
        super(b, new String[0]);
        r = lpu1;
        q = lqv1;
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

    private static Map a(ksp ksp1)
    {
        ksp1 = ((ksp) (ltw.e(ksp1)));
        if (!(ksp1 instanceof Map))
        {
            return null;
        }
        Object obj = (Map)ksp1;
        ksp1 = new LinkedHashMap();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); ksp1.put(entry.getKey().toString(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return ksp1;
    }

    private static void a(Map map, String s, String s1)
    {
        if (s1 != null)
        {
            map.put(s, s1);
        }
    }

    private void a(jqt jqt1, Map map)
    {
        String s = a("transactionId");
        if (s != null) goto _L2; else goto _L1
_L1:
        lqh.a("Cannot find transactionId in data layer.");
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
            obj1 = b((ksp)map.get(g));
            ((Map) (obj1)).put("&t", "transaction");
            obj = (ksp)map.get(i);
        }
        // Misplaced declaration of an exception variable
        catch (jqt jqt1)
        {
            lqh.a("Unable to send transaction", jqt1);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = a(((ksp) (obj)));
_L3:
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a(((Map) (obj1)), (String)entry.getValue(), a((String)entry.getKey())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_245;
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
            break MISSING_BLOCK_LABEL_555;
        }
        obj1 = ((List) (obj)).iterator();
_L5:
        Map map1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_555;
        }
        map1 = (Map)((Iterator) (obj1)).next();
        if (map1.get("name") == null)
        {
            lqh.a("Unable to send transaction item hit due to missing 'name' field.");
            return;
        }
        Map map2;
        map2 = b((ksp)map.get(g));
        map2.put("&t", "item");
        map2.put("&ti", s);
        obj = (ksp)map.get(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        obj = a(((ksp) (obj)));
_L4:
        java.util.Map.Entry entry1;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a(map2, (String)entry1.getValue(), (String)map1.get(entry1.getKey())))
        {
            entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_542;
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
            jqt1.a((Map)map.next());
        }
          goto _L6
    }

    private static boolean a(Map map, String s)
    {
        map = (ksp)map.get(s);
        if (map == null)
        {
            return false;
        } else
        {
            return ltw.d(map).booleanValue();
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

    private Map b(ksp ksp1)
    {
        if (ksp1 == null)
        {
            return new HashMap();
        }
        ksp1 = a(ksp1);
        if (ksp1 == null)
        {
            return new HashMap();
        }
        String s = (String)ksp1.get("&aip");
        if (s != null && p.contains(s.toLowerCase()))
        {
            ksp1.remove("&aip");
        }
        return ksp1;
    }

    private jra c(Map map)
    {
        jra jra1;
        Object obj;
        jra1 = new jra();
        obj = map.get("id");
        if (obj != null)
        {
            jra1.a("id", String.valueOf(obj));
        }
        obj = map.get("name");
        if (obj != null)
        {
            jra1.a("nm", String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null)
        {
            jra1.a("br", String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null)
        {
            jra1.a("ca", String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null)
        {
            jra1.a("va", String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null)
        {
            jra1.a("cc", String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null)
        {
            jra1.a("ps", Integer.toString(b(obj).intValue()));
        }
        obj = map.get("price");
        if (obj != null)
        {
            jra1.a("pr", Double.toString(a(obj).doubleValue()));
        }
        obj = map.get("quantity");
        if (obj != null)
        {
            jra1.a("qt", Integer.toString(b(obj).intValue()));
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
                lqh.b((new StringBuilder("illegal number in custom dimension value: ")).append(s).toString());
                continue; /* Loop/switch isn't completed */
            }
            s = String.valueOf(map.get(s));
            jra1.a(b.a("cd", i1), s);
            continue; /* Loop/switch isn't completed */
        }
        numberformatexception = m.matcher(s);
        if (!numberformatexception.matches())
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1 = Integer.parseInt(numberformatexception.group(1));
        int k1 = b(map.get(s)).intValue();
        jra1.a(b.a("cm", j1), Integer.toString(k1));
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception1;
        numberformatexception1;
        lqh.b((new StringBuilder("illegal number in custom metric value: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return jra1;
    }

    public final volatile String a()
    {
        return super.a();
    }

    public final volatile ksp a(Map map)
    {
        return super.a(map);
    }

    public final void b(Map map)
    {
        jqt jqt1;
        lqv lqv1 = q;
        lqv1.a("_GTM_DEFAULT_TRACKER_");
        jqt1 = lqv1.a;
        jqt1.a = a(map, "collect_adid");
        if (!a(map, d)) goto _L2; else goto _L1
_L1:
        jqr jqr1 = new jqr();
        Object obj = b((ksp)map.get(g));
        if (obj != null)
        {
            ((jqq) (jqr1)).a.putAll(new HashMap(((Map) (obj))));
        }
        if (a(map, e))
        {
            map = ((Map) (r.b("ecommerce")));
            Object obj1;
            Object obj2;
            Object obj3;
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
            map = ((Map) (ltw.e((ksp)map.get(f))));
            if (map instanceof Map)
            {
                map = (Map)map;
            } else
            {
                map = null;
            }
        }
        if (map == null) goto _L4; else goto _L3
_L3:
        obj1 = (String)((Map) (obj)).get("&cu");
        obj = obj1;
        if (obj1 == null)
        {
            obj = (String)map.get("currencyCode");
        }
        if (obj != null)
        {
            jqr1.a("&cu", ((String) (obj)));
        }
        obj = map.get("impressions");
        if (!(obj instanceof List)) goto _L6; else goto _L5
_L5:
        obj2 = ((List)obj).iterator();
_L7:
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Map)((Iterator) (obj2)).next();
        obj3 = c(((Map) (obj)));
        obj1 = (String)((Map) (obj)).get("list");
        if (obj3 == null)
        {
            try
            {
                jtj.a("product should be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                lqh.a((new StringBuilder("Failed to extract a product from DataLayer. ")).append(((RuntimeException) (obj)).getMessage()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        if (!((jqq) (jqr1)).c.containsKey(obj))
        {
            ((jqq) (jqr1)).c.put(obj, new ArrayList());
        }
        ((List)((jqq) (jqr1)).c.get(obj)).add(obj3);
        if (true) goto _L7; else goto _L6
_L6:
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
        if (obj == null) goto _L9; else goto _L8
_L8:
        obj = ((List) (obj)).iterator();
_L11:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Map)((Iterator) (obj)).next();
        obj1 = new jrc();
        obj3 = (String)((Map) (obj2)).get("id");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        ((jrc) (obj1)).a("id", String.valueOf(obj3));
        obj3 = (String)((Map) (obj2)).get("name");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_521;
        }
        ((jrc) (obj1)).a("nm", String.valueOf(obj3));
        obj3 = (String)((Map) (obj2)).get("creative");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        ((jrc) (obj1)).a("cr", String.valueOf(obj3));
        obj2 = (String)((Map) (obj2)).get("position");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        ((jrc) (obj1)).a("ps", String.valueOf(obj2));
        if (obj1 == null)
        {
            try
            {
                jtj.a("promotion should be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                lqh.a((new StringBuilder("Failed to extract a promotion from DataLayer. ")).append(((RuntimeException) (obj1)).getMessage()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        ((jqq) (jqr1)).d.add(obj1);
        if (true) goto _L11; else goto _L10
_L10:
        if (!map.containsKey("promoClick")) goto _L13; else goto _L12
_L12:
        jqr1.a("&promoa", "click");
        flag = false;
_L28:
        if (!flag) goto _L4; else goto _L14
_L14:
        obj = k.iterator();
_L17:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L15
_L15:
        obj1 = (String)((Iterator) (obj)).next();
        if (!map.containsKey(obj1)) goto _L17; else goto _L16
_L16:
        map = (Map)map.get(obj1);
        obj = (List)map.get("products");
        if (obj == null) goto _L19; else goto _L18
_L18:
        obj = ((List) (obj)).iterator();
_L23:
        if (!((Iterator) (obj)).hasNext()) goto _L19; else goto _L20
_L20:
        obj2 = (Map)((Iterator) (obj)).next();
        obj2 = c(((Map) (obj2)));
        if (obj2 != null) goto _L22; else goto _L21
_L21:
        try
        {
            jtj.a("product should be non-null");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            lqh.a((new StringBuilder("Failed to extract a product from DataLayer. ")).append(((RuntimeException) (obj2)).getMessage()).toString());
        }
          goto _L23
_L13:
        jqr1.a("&promoa", "view");
_L9:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L22:
        ((jqq) (jqr1)).e.add(obj2);
          goto _L23
_L19:
        if (!map.containsKey("actionField")) goto _L25; else goto _L24
_L24:
        obj = (Map)map.get("actionField");
        map = new jrb(((String) (obj1)));
        obj1 = ((Map) (obj)).get("id");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_947;
        }
        map.a("&ti", String.valueOf(obj1));
        obj1 = ((Map) (obj)).get("affiliation");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_972;
        }
        map.a("&ta", String.valueOf(obj1));
        obj1 = ((Map) (obj)).get("coupon");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        map.a("&tcc", String.valueOf(obj1));
        obj1 = ((Map) (obj)).get("list");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1022;
        }
        map.a("&pal", String.valueOf(obj1));
        obj1 = ((Map) (obj)).get("option");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1047;
        }
        map.a("&col", String.valueOf(obj1));
        obj1 = ((Map) (obj)).get("revenue");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1078;
        }
        map.a("&tr", Double.toString(a(obj1).doubleValue()));
        obj1 = ((Map) (obj)).get("tax");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1109;
        }
        map.a("&tt", Double.toString(a(obj1).doubleValue()));
        obj1 = ((Map) (obj)).get("shipping");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1140;
        }
        map.a("&ts", Double.toString(a(obj1).doubleValue()));
        obj = ((Map) (obj)).get("step");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1174;
        }
        map.a("&cos", Integer.toString(b(obj).intValue()));
_L26:
        try
        {
            jqr1.b = map;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            lqh.a((new StringBuilder("Failed to extract a product action from DataLayer. ")).append(map.getMessage()).toString());
        }
_L4:
        jqt1.a(jqr1.a());
        return;
_L25:
        map = new jrb(((String) (obj1)));
          goto _L26
_L2:
        if (a(map, c))
        {
            jqt1.a(b((ksp)map.get(g)));
            return;
        }
        if (a(map, h))
        {
            a(jqt1, map);
            return;
        }
        lqh.b("Ignoring unknown tag.");
        return;
        if (true) goto _L28; else goto _L27
_L27:
    }

    public final volatile boolean b()
    {
        return super.b();
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        b = kse.P.toString();
        ksf.a.toString();
        c = ksf.e.toString();
        d = ksf.n.toString();
        e = ksf.m.toString();
        f = ksf.l.toString();
        g = ksf.d.toString();
        h = ksf.G.toString();
        i = ksf.H.toString();
        j = ksf.I.toString();
    }
}
