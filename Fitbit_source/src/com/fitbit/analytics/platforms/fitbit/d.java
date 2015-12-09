// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;

// Referenced classes of package com.fitbit.analytics.platforms.fitbit:
//            b

public class d
{

    private final Context a;
    private final String b;
    private final String c;
    private final String d;

    public d(Context context)
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        super();
        a = context;
        context = a.getPackageManager();
        Object obj;
        obj = context.getPackageInfo(a.getPackageName(), 0);
        context = ((PackageInfo) (obj)).versionName;
        int i = ((PackageInfo) (obj)).versionCode;
        Integer integer = Integer.valueOf(i);
        obj = context;
        context = integer;
_L2:
label0:
        {
            b = ((String) (obj));
            c = String.format("%d", new Object[] {
                context
            });
            if (Build.BRAND == null)
            {
                obj = obj2;
                if (Build.MODEL == null)
                {
                    break label0;
                }
            }
            context = obj1;
            if (Build.BRAND != null)
            {
                context = Build.BRAND;
            }
            obj = context;
            if (Build.MODEL != null)
            {
                obj = context;
                if (Build.BRAND != null)
                {
                    obj = (new StringBuilder()).append(context).append(" ").toString();
                }
                obj = (new StringBuilder()).append(((String) (obj))).append(Build.MODEL).toString();
            }
        }
        d = ((String) (obj));
        return;
        context;
        context = null;
_L3:
        Log.w("FitbitAnalytics", "System information constructed with a context that apparently doesn't exist.");
        obj = context;
        context = null;
        if (true) goto _L2; else goto _L1
_L1:
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
          goto _L3
    }

    public static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        boolean flag1 = flag;
        StringBuilder stringbuilder;
        if (!b.a)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        stringbuilder = (new StringBuilder()).append("Connectivity: ");
        if (flag)
        {
            context = "online";
        } else
        {
            context = "offline";
        }
        Log.d("FitbitAnalytics", stringbuilder.append(context).toString());
        return flag;
        context;
        if (b.a)
        {
            Log.d("FitbitAnalytics", "Unable to check connectivity. Assuming online.");
        }
        flag1 = true;
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        TelephonyManager telephonymanager = (TelephonyManager)a.getSystemService("phone");
        if (telephonymanager != null)
        {
            return telephonymanager.getNetworkOperatorName();
        } else
        {
            return null;
        }
    }
}
