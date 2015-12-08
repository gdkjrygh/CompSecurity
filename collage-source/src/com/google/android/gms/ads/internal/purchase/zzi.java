// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.gn;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel, zzb

public class zzi
{

    public zzi()
    {
    }

    public void zza(Context context, boolean flag, GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", flag);
        GInAppPurchaseManagerInfoParcel.zza(intent, ginapppurchasemanagerinfoparcel);
        context.startActivity(intent);
    }

    public String zzal(String s)
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
            zzb.zzaE("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public String zzam(String s)
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
            zzb.zzaE("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public int zzc(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            zzb.zzaE("Bundle with null response code, assuming OK (known issue)");
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
            zzb.zzaE((new StringBuilder()).append("Unexpected type for intent response code. ").append(bundle.getClass().getName()).toString());
            return 5;
        }
    }

    public int zzd(Intent intent)
    {
        if (intent == null)
        {
            return 5;
        }
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            zzb.zzaE("Intent with no response code, assuming OK (known issue)");
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
            zzb.zzaE((new StringBuilder()).append("Unexpected type for intent response code. ").append(intent.getClass().getName()).toString());
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

    public void zzy(Context context)
    {
        ServiceConnection serviceconnection = new ServiceConnection(context) {

            final zzi zzCn;
            final Context zzrn;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                boolean flag = false;
                componentname = new com.google.android.gms.ads.internal.purchase.zzb(zzrn.getApplicationContext(), false);
                componentname.zzM(ibinder);
                int i = componentname.zza(3, zzrn.getPackageName(), "inapp");
                ibinder = zzp.zzbA();
                if (i == 0)
                {
                    flag = true;
                }
                ibinder.b(flag);
                zzrn.unbindService(this);
                componentname.destroy();
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                zzCn = zzi.this;
                zzrn = context;
                super();
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, serviceconnection, 1);
    }
}
