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
//            zzbs, zzfs, zzgd

public class zzbx
    implements zzbs
{

    final HashMap zztG = new HashMap();

    public zzbx()
    {
    }

    public Future zzG(String s)
    {
        zzfs zzfs1 = new zzfs();
        zztG.put(s, zzfs1);
        return zzfs1;
    }

    public void zzH(String s)
    {
        zzfs zzfs1 = (zzfs)zztG.get(s);
        if (zzfs1 == null)
        {
            zzb.zzak("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzfs1.isDone())
        {
            zzfs1.cancel(true);
        }
        zztG.remove(s);
    }

    public void zza(zzgd zzgd, Map map)
    {
        zzf((String)map.get("request_id"), (String)map.get("fetched_ad"));
    }

    public void zzf(String s, String s1)
    {
        zzfs zzfs1;
        zzb.zzaj("Received ad from the cache.");
        zzfs1 = (zzfs)zztG.get(s);
        if (zzfs1 == null)
        {
            zzb.zzak("Could not find the ad request for the corresponding ad response.");
            return;
        }
        zzfs1.zzc(new JSONObject(s1));
        zztG.remove(s);
        return;
        s1;
        zzb.zzb("Failed constructing JSON object from value passed from javascript", s1);
        zzfs1.zzc(null);
        zztG.remove(s);
        return;
        s1;
        zztG.remove(s);
        throw s1;
    }
}
