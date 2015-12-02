// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class add
    implements acu
{

    final HashMap a = new HashMap();

    public add()
    {
    }

    private void a(String s, String s1)
    {
        ajs ajs1;
        of.a("Received ad from the cache.");
        ajs1 = (ajs)a.get(s);
        if (ajs1 == null)
        {
            of.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        ajs1.a(new JSONObject(s1));
        a.remove(s);
        return;
        s1;
        of.b("Failed constructing JSON object from value passed from javascript", s1);
        ajs1.a(null);
        a.remove(s);
        return;
        s1;
        a.remove(s);
        throw s1;
    }

    public final Future a(String s)
    {
        ajs ajs1 = new ajs();
        a.put(s, ajs1);
        return ajs1;
    }

    public final void a(akk akk, Map map)
    {
        a((String)map.get("request_id"), (String)map.get("fetched_ad"));
    }

    public final void b(String s)
    {
        ajs ajs1 = (ajs)a.get(s);
        if (ajs1 == null)
        {
            of.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!ajs1.isDone())
        {
            ajs1.cancel(true);
        }
        a.remove(s);
    }
}
