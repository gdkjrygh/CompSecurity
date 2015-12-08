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
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.gd;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            b

public final class i
{

    public i()
    {
    }

    public static int a(Intent intent)
    {
        if (intent == null)
        {
            return 5;
        }
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Intent with no response code, assuming OK (known issue)");
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
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Unexpected type for intent response code. ")).append(intent.getClass().getName()).toString());
            return 5;
        }
    }

    public static int a(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Bundle with null response code, assuming OK (known issue)");
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
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Unexpected type for intent response code. ")).append(bundle.getClass().getName()).toString());
            return 5;
        }
    }

    public static String a(String s)
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
            com.google.android.gms.ads.internal.util.client.b.c("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public static String b(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("INAPP_PURCHASE_DATA");
        }
    }

    public static String b(String s)
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
            com.google.android.gms.ads.internal.util.client.b.c("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public final void a(Context context)
    {
        ServiceConnection serviceconnection = new ServiceConnection(context) {

            final Context a;
            final i b;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                boolean flag = false;
                componentname = new com.google.android.gms.ads.internal.purchase.b(a.getApplicationContext(), false);
                componentname.a(ibinder);
                int j = componentname.c(a.getPackageName(), "inapp");
                ibinder = p.h();
                if (j == 0)
                {
                    flag = true;
                }
                ibinder.b(flag);
                a.unbindService(this);
                componentname.a = null;
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                b = i.this;
                a = context;
                super();
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, serviceconnection, 1);
    }
}
