// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzfy, zzbb, zzhs, 
//            zzid

class zzBN
    implements zzdg
{

    final zzbb zzBL;
    final b zzBM;
    final zzhs zzBN;
    final zzfy zzBO;

    public void zza(zzid zzid, Map map)
    {
        zzBL.zzb("/nativeAdPreProcess", zzBM.zzBX);
        try
        {
            zzid = (String)map.get("success");
            if (!TextUtils.isEmpty(zzid))
            {
                zzBN.zzf((new JSONObject(zzid)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzid zzid)
        {
            zzb.zzb("Malformed native JSON response.", zzid);
        }
        zzBO.zzB(0);
        zzu.zza(zzBO.zzfr(), "Unable to set the ad state error!");
        zzBN.zzf(null);
    }

    b(zzfy zzfy1, zzbb zzbb1, b b, zzhs zzhs1)
    {
        zzBO = zzfy1;
        zzBL = zzbb1;
        zzBM = b;
        zzBN = zzhs1;
        super();
    }
}
