// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            dv, dx, cn, gd, 
//            ah, du, ef

public class ag extends dv
{

    private ah a;

    public ag(du du, dx dx1, ef ef, ah ah1)
    {
        super(du, dx1, ef, null);
        a = ah1;
        a("Accept", "application/json; charset=utf-8");
        a("Accept-Language", "en_US");
        a("Content-Type", "application/json");
    }

    private static JSONObject a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.accumulate(s, map.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    public final String a(du du)
    {
        return "https://api.paypal.com/v1/tracking/events";
    }

    public final boolean a()
    {
        return true;
    }

    public final String b()
    {
        Object obj = gd.a(t().d().e());
        String s = a.a;
        Object obj1 = new JSONObject();
        ((JSONObject) (obj1)).accumulate("tracking_visitor_id", obj);
        ((JSONObject) (obj1)).accumulate("tracking_visit_id", s);
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("actor", obj1);
        jsonobject.accumulate("channel", "mobile");
        obj1 = Long.toString(System.currentTimeMillis());
        jsonobject.accumulate("tracking_event", obj1);
        a.b.put("t", obj1);
        a.b.put("dsid", obj);
        a.b.put("vid", s);
        jsonobject.accumulate("event_params", a(a.b));
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
        com/paypal/android/sdk/ag.getSimpleName();
    }
}
