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
//            ch, hh, hs

public class cm
    implements ch
{

    final HashMap a = new HashMap();

    public cm()
    {
    }

    public Future a(String s)
    {
        hh hh1 = new hh();
        a.put(s, hh1);
        return hh1;
    }

    public void a(String s, String s1)
    {
        hh hh1;
        zzb.zzaC("Received ad from the cache.");
        hh1 = (hh)a.get(s);
        if (hh1 == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        hh1.b(new JSONObject(s1));
        a.remove(s);
        return;
        s1;
        zzb.zzb("Failed constructing JSON object from value passed from javascript", s1);
        hh1.b(null);
        a.remove(s);
        return;
        s1;
        a.remove(s);
        throw s1;
    }

    public void b(String s)
    {
        hh hh1 = (hh)a.get(s);
        if (hh1 == null)
        {
            zzb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!hh1.isDone())
        {
            hh1.cancel(true);
        }
        a.remove(s);
    }

    public void zza(hs hs, Map map)
    {
        a((String)map.get("request_id"), (String)map.get("fetched_ad"));
    }
}
