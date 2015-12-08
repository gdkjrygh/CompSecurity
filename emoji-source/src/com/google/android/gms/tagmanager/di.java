// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            df, de, bh, dh, 
//            DataLayer

class di extends df
{

    private static final String ID;
    private static final String aiA;
    private static final String aiB;
    private static Map aiC;
    private static Map aiD;
    private static final String aiw;
    private static final String aix;
    private static final String aiy;
    private static final String aiz;
    private final DataLayer aeu;
    private final Set aiE;
    private final de aiF;

    public di(Context context, DataLayer datalayer)
    {
        this(context, datalayer, new de(context));
    }

    di(Context context, DataLayer datalayer, de de1)
    {
        super(ID, new String[0]);
        aeu = datalayer;
        aiF = de1;
        aiE = new HashSet();
        aiE.add("");
        aiE.add("0");
        aiE.add("false");
    }

    private Map G(Map map)
    {
        map = (com.google.android.gms.internal.d.a)map.get(aiA);
        if (map != null)
        {
            return c(map);
        }
        if (aiC == null)
        {
            map = new HashMap();
            map.put("transactionId", "&ti");
            map.put("transactionAffiliation", "&ta");
            map.put("transactionTax", "&tt");
            map.put("transactionShipping", "&ts");
            map.put("transactionTotal", "&tr");
            map.put("transactionCurrency", "&cu");
            aiC = map;
        }
        return aiC;
    }

    private Map H(Map map)
    {
        map = (com.google.android.gms.internal.d.a)map.get(aiB);
        if (map != null)
        {
            return c(map);
        }
        if (aiD == null)
        {
            map = new HashMap();
            map.put("name", "&in");
            map.put("sku", "&ic");
            map.put("category", "&iv");
            map.put("price", "&ip");
            map.put("quantity", "&iq");
            map.put("currency", "&cu");
            aiD = map;
        }
        return aiD;
    }

    private void a(Tracker tracker, Map map)
    {
        String s = cu("transactionId");
        if (s != null) goto _L2; else goto _L1
_L1:
        bh.A("Cannot find transactionId in data layer.");
_L4:
        return;
_L2:
        LinkedList linkedlist;
        Object obj;
        linkedlist = new LinkedList();
        try
        {
            obj = p((com.google.android.gms.internal.d.a)map.get(aiy));
            ((Map) (obj)).put("&t", "transaction");
            java.util.Map.Entry entry;
            for (Iterator iterator = G(map).entrySet().iterator(); iterator.hasNext(); b(((Map) (obj)), (String)entry.getValue(), cu((String)entry.getKey())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Tracker tracker)
        {
            com.google.android.gms.tagmanager.bh.b("Unable to send transaction", tracker);
            return;
        }
        linkedlist.add(obj);
        obj = ne();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj = ((List) (obj)).iterator();
_L3:
        Map map1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_337;
        }
        map1 = (Map)((Iterator) (obj)).next();
        if (map1.get("name") == null)
        {
            bh.A("Unable to send transaction item hit due to missing 'name' field.");
            return;
        }
        Map map2;
        map2 = p((com.google.android.gms.internal.d.a)map.get(aiy));
        map2.put("&t", "item");
        map2.put("&ti", s);
        java.util.Map.Entry entry1;
        for (Iterator iterator1 = H(map).entrySet().iterator(); iterator1.hasNext(); b(map2, (String)entry1.getValue(), (String)map1.get(entry1.getKey())))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        linkedlist.add(map2);
          goto _L3
        map = linkedlist.iterator();
        while (map.hasNext()) 
        {
            tracker.send((Map)map.next());
        }
          goto _L4
    }

    private void b(Map map, String s, String s1)
    {
        if (s1 != null)
        {
            map.put(s, s1);
        }
    }

    private Map c(com.google.android.gms.internal.d.a a1)
    {
        a1 = ((com.google.android.gms.internal.d.a) (dh.o(a1)));
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

    private String cu(String s)
    {
        s = ((String) (aeu.get(s)));
        if (s == null)
        {
            return null;
        } else
        {
            return s.toString();
        }
    }

    private boolean e(Map map, String s)
    {
        map = (com.google.android.gms.internal.d.a)map.get(s);
        if (map == null)
        {
            return false;
        } else
        {
            return dh.n(map).booleanValue();
        }
    }

    private List ne()
    {
        Object obj = aeu.get("transactionProducts");
        if (obj == null)
        {
            return null;
        }
        if (!(obj instanceof List))
        {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        for (Iterator iterator = ((List)obj).iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof Map))
            {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }

        return (List)obj;
    }

    private Map p(com.google.android.gms.internal.d.a a1)
    {
        if (a1 == null)
        {
            return new HashMap();
        }
        a1 = c(a1);
        if (a1 == null)
        {
            return new HashMap();
        }
        String s = (String)a1.get("&aip");
        if (s != null && aiE.contains(s.toLowerCase()))
        {
            a1.remove("&aip");
        }
        return a1;
    }

    public void y(Map map)
    {
        Tracker tracker = aiF.cm("_GTM_DEFAULT_TRACKER_");
        if (e(map, aix))
        {
            tracker.send(p((com.google.android.gms.internal.d.a)map.get(aiy)));
            return;
        }
        if (e(map, aiz))
        {
            a(tracker, map);
            return;
        } else
        {
            bh.D("Ignoring unknown tag.");
            return;
        }
    }

    static 
    {
        ID = a.aF.toString();
        aiw = b.aV.toString();
        aix = b.be.toString();
        aiy = b.bd.toString();
        aiz = b.eg.toString();
        aiA = b.ei.toString();
        aiB = b.ek.toString();
    }
}
