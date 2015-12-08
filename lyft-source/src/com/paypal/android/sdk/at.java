// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            bf, R, bh, b, 
//            au, be, c

public class at extends bf
{

    private static final String a = com/paypal/android/sdk/at.getSimpleName();
    private static Map b;
    private static Set c;
    private au d;

    public at(be be, bh bh1, c c1, String s, au au1)
    {
        super(be, bh1, c1, s);
        d = au1;
        a("Accept", "application/json; charset=utf-8");
        a("Accept-Language", "en_US");
        a("Content-Type", "application/json");
    }

    private JSONObject a(Map map)
    {
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = map.keySet().iterator();
_L4:
        String s;
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_160;
        }
        s1 = (String)iterator.next();
        if (!R.b(s1))
        {
            if (c.contains(s1))
            {
                (new StringBuilder("SC key ")).append(s1).append(" not used in FPTI, skipping");
            } else
            {
label0:
                {
                    if (b.containsKey(s1))
                    {
                        break label0;
                    }
                    (new StringBuilder("No mapping for SC key ")).append(s1).append(", skipping");
                }
            }
        }
        s = null;
_L2:
        if (s != null)
        {
            jsonobject.accumulate(s, map.get(s1));
        }
        continue; /* Loop/switch isn't completed */
        s = (String)b.get(s1);
        if (true) goto _L2; else goto _L1
_L1:
        return jsonobject;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(be be)
    {
        return "https://api.paypal.com/v1/tracking/events";
    }

    public final boolean a()
    {
        return true;
    }

    public final String b()
    {
        Object obj = R.a(t().d().e());
        String s = d.a;
        Object obj1 = new JSONObject();
        ((JSONObject) (obj1)).accumulate("tracking_visitor_id", obj);
        ((JSONObject) (obj1)).accumulate("tracking_visit_id", s);
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("actor", obj1);
        jsonobject.accumulate("channel", "mobile");
        obj1 = Long.toString(System.currentTimeMillis());
        jsonobject.accumulate("tracking_event", obj1);
        d.b.put("t", obj1);
        d.b.put("dsid", obj);
        d.b.put("vid", s);
        jsonobject.accumulate("event_params", a(d.b));
        obj = new JSONObject();
        ((JSONObject) (obj)).accumulate("events", jsonobject);
        return ((JSONObject) (obj)).toString();
    }

    public final void c()
    {
    }

    public final void d()
    {
    }

    public final String e()
    {
        return "mockResponse";
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
