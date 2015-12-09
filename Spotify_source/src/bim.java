// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import org.json.JSONException;
import org.json.JSONObject;

public final class bim
{

    public bim()
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
            bka.e("Intent with no response code, assuming OK (known issue)");
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
            bka.e((new StringBuilder("Unexpected type for intent response code. ")).append(intent.getClass().getName()).toString());
            return 5;
        }
    }

    public static int a(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            bka.e("Bundle with null response code, assuming OK (known issue)");
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
            bka.e((new StringBuilder("Unexpected type for intent response code. ")).append(bundle.getClass().getName()).toString());
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
            bka.e("Fail to parse purchase data");
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
            bka.e("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    // Unreferenced inner class bim$1

/* anonymous class */
    public final class _cls1
        implements ServiceConnection
    {

        private Context a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            boolean flag = false;
            componentname = new bie(a.getApplicationContext(), false);
            componentname.a(ibinder);
            int i = componentname.c(a.getPackageName(), "inapp");
            cix cix1 = bkv.h();
            if (i == 0)
            {
                flag = true;
            }
            synchronized (cix1.a)
            {
                cix1.h = flag;
            }
            a.unbindService(this);
            componentname.a = null;
            return;
            componentname;
            ibinder;
            JVM INSTR monitorexit ;
            throw componentname;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
        }

            public 
            {
                a = context;
                super();
            }
    }

}
