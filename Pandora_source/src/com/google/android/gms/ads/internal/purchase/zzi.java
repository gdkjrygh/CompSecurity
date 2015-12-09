// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel

public class zzi
{

    public zzi()
    {
    }

    public String zzU(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new JSONObject(s)).getString("developerPayload");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public String zzV(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new JSONObject(s)).getString("purchaseToken");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public void zza(Context context, boolean flag, GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
        GInAppPurchaseManagerInfoParcel.zza(intent, ginapppurchasemanagerinfoparcel);
        context.startActivity(intent);
    }

    public int zzb(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (bundle instanceof Integer)
        {
            return ((Integer)bundle).intValue();
        }
        if (bundle instanceof Long)
        {
            return (int)((Long)bundle).longValue();
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Unexpected type for intent response code. ").append(bundle.getClass().getName()).toString());
            return 5;
        }
    }

    public int zzd(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (intent instanceof Integer)
        {
            return ((Integer)intent).intValue();
        }
        if (intent instanceof Long)
        {
            return (int)((Long)intent).longValue();
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Unexpected type for intent response code. ").append(intent.getClass().getName()).toString());
            return 5;
        }
    }

    public String zze(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("INAPP_PURCHASE_DATA");
        }
    }

    public String zzf(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("INAPP_DATA_SIGNATURE");
        }
    }
}
