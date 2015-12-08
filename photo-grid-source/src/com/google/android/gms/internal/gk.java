// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fz, rf, ry

public final class gk
    implements fz
{

    final HashMap a = new HashMap();

    public gk()
    {
    }

    public final Future a(String s)
    {
        rf rf1 = new rf();
        a.put(s, rf1);
        return rf1;
    }

    public final void b(String s)
    {
        rf rf1 = (rf)a.get(s);
        if (rf1 == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!rf1.isDone())
        {
            rf1.cancel(true);
        }
        a.remove(s);
    }

    public final void zza(ry ry, Map map)
    {
        String s;
        ry = (String)map.get("request_id");
        s = (String)map.get("fetched_ad");
        zzb.zzaF("Received ad from the cache.");
        map = (rf)a.get(ry);
        if (map == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        map.b(new JSONObject(s));
        a.remove(ry);
        return;
        JSONException jsonexception;
        jsonexception;
        zzb.zzb("Failed constructing JSON object from value passed from javascript", jsonexception);
        map.b(null);
        a.remove(ry);
        return;
        map;
        a.remove(ry);
        throw map;
    }
}
