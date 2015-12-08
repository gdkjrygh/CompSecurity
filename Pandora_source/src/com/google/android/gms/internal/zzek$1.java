// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzek, zzy, zzfs, 
//            zzgd

class c
    implements zzbs
{

    final zzy a;
    final c b;
    final zzfs c;
    final zzek d;

    public void zza(zzgd zzgd, Map map)
    {
        a.zzb("/nativeAdPreProcess", b.a);
        try
        {
            zzgd = (String)map.get("success");
            if (!TextUtils.isEmpty(zzgd))
            {
                c.zzc((new JSONObject(zzgd)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzgd zzgd)
        {
            zzb.zzb("Malformed native JSON response.", zzgd);
        }
        d.zzv(0);
        zzv.zza(d.zzek(), "Unable to set the ad state error!");
        c.zzc(null);
    }

    zzv(zzek zzek1, zzy zzy1, zzv zzv1, zzfs zzfs1)
    {
        d = zzek1;
        a = zzy1;
        b = zzv1;
        c = zzfs1;
        super();
    }
}
