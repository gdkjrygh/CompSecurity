// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            ah, gd

public class ei
{

    private static final String a = com/paypal/android/sdk/ei.getSimpleName();
    private static final Map b;
    private static final Set c;

    public ei()
    {
    }

    public static ah a(ah ah1)
    {
        Map map = ah1.b;
        HashMap hashmap = new HashMap();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!gd.c(s))
            {
                if (c.contains(s))
                {
                    (new StringBuilder("SC key ")).append(s).append(" not used in FPTI, skipping");
                } else
                if (!b.containsKey(s))
                {
                    (new StringBuilder("No mapping for SC key ")).append(s).append(", skipping");
                } else
                {
                    String s1 = (String)b.get(s);
                    if (s1 != null)
                    {
                        hashmap.put(s1, map.get(s));
                    }
                }
            }
        } while (true);
        return new ah(ah1.a, hashmap, ah1.c, ah1.d, false);
    }

    static 
    {
        Object obj = new HashMap();
        b = ((Map) (obj));
        ((Map) (obj)).put("c14", "erpg");
        b.put("c25", "page");
        b.put("c26", "link");
        b.put("c27", "pgln");
        b.put("c29", "eccd");
        b.put("c35", "lgin");
        b.put("vers", "vers");
        b.put("c50", "rsta");
        b.put("gn", "pgrp");
        b.put("v49", "mapv");
        b.put("v51", "mcar");
        b.put("v52", "mosv");
        b.put("v53", "mdvs");
        b.put("clid", "clid");
        b.put("apid", "apid");
        b.put("calc", "calc");
        b.put("e", "e");
        b.put("t", "t");
        b.put("g", "g");
        b.put("srce", "srce");
        b.put("vid", "vid");
        b.put("bchn", "bchn");
        b.put("adte", "adte");
        b.put("sv", "sv");
        b.put("dsid", "dsid");
        b.put("bzsr", "bzsr");
        b.put("prid", "prid");
        obj = new HashSet();
        c = ((Set) (obj));
        ((Set) (obj)).add("v25");
        c.add("v31");
        c.add("c37");
    }
}
