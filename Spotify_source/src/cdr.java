// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cdr
    implements cdi
{

    public final HashMap a = new HashMap();

    public cdr()
    {
    }

    public final void a(ckw ckw, Map map)
    {
        String s;
        ckw = (String)map.get("request_id");
        s = (String)map.get("fetched_ad");
        bka.a("Received ad from the cache.");
        map = (ckg)a.get(ckw);
        if (map == null)
        {
            bka.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        map.b(new JSONObject(s));
        a.remove(ckw);
        return;
        JSONException jsonexception;
        jsonexception;
        bka.b("Failed constructing JSON object from value passed from javascript", jsonexception);
        map.b(null);
        a.remove(ckw);
        return;
        map;
        a.remove(ckw);
        throw map;
    }

    public final void a(String s)
    {
        ckg ckg1 = (ckg)a.get(s);
        if (ckg1 == null)
        {
            bka.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!ckg1.isDone())
        {
            ckg1.cancel(true);
        }
        a.remove(s);
    }
}
