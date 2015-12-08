// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cf, gx, hi

public final class ck
    implements cf
{

    final HashMap a = new HashMap();

    public ck()
    {
    }

    public final Future a(String s)
    {
        gx gx1 = new gx();
        a.put(s, gx1);
        return gx1;
    }

    public final void a(hi hi, Map map)
    {
        String s;
        hi = (String)map.get("request_id");
        s = (String)map.get("fetched_ad");
        com.google.android.gms.ads.internal.util.client.b.a(3);
        map = (gx)a.get(hi);
        if (map == null)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        map.b(new JSONObject(s));
        a.remove(hi);
        return;
        JSONException jsonexception;
        jsonexception;
        com.google.android.gms.ads.internal.util.client.b.a("Failed constructing JSON object from value passed from javascript", jsonexception);
        map.b(null);
        a.remove(hi);
        return;
        map;
        a.remove(hi);
        throw map;
    }

    public final void b(String s)
    {
        gx gx1 = (gx)a.get(s);
        if (gx1 == null)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!gx1.isDone())
        {
            gx1.cancel(true);
        }
        a.remove(s);
    }
}
