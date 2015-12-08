// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzgt, zzah, zzhq, 
//            zzhx, zzic

class zzxb
    implements zzcv
{

    final zzah zzwZ;
    final b zzxa;
    final zzhq zzxb;
    final zzgt zzxc;

    public void zza(zzic zzic, Map map)
    {
        zzwZ.zzb("/nativeAdPreProcess", zzxa.zzxe);
        try
        {
            zzic = (String)map.get("success");
            if (!TextUtils.isEmpty(zzic))
            {
                zzxb.zzb((new JSONObject(zzic)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzic zzic)
        {
            zzhx.zzb("Malformed native JSON response.", zzic);
        }
        zzxc.zzx(0);
        zzx.zza(zzxc.zzdO(), "Unable to set the ad state error!");
        zzxb.zzb(null);
    }

    b(zzgt zzgt1, zzah zzah1, b b, zzhq zzhq1)
    {
        zzxc = zzgt1;
        zzwZ = zzah1;
        zzxa = b;
        zzxb = zzhq1;
        super();
    }
}
