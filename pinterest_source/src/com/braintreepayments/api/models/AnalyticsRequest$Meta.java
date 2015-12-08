// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.UUID;

// Referenced classes of package com.braintreepayments.api.models:
//            AnalyticsRequest

class p
{

    final AnalyticsRequest a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    private static String a()
    {
        boolean flag;
        boolean flag3 = false;
        String s = Build.TAGS;
        boolean flag1;
        boolean flag2;
        if (s != null && s.contains("test-keys"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        try
        {
            flag2 = (new File("/system/app/Superuser.apk")).exists();
        }
        catch (Exception exception)
        {
            flag2 = false;
        }
        s = (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] {
            "/system/xbin/which", "su"
        }).getInputStream()))).readLine();
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
label0:
        {
            if (!flag1 && !flag2)
            {
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        return Boolean.toString(flag2);
        Exception exception1;
        exception1;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(PackageManager packagemanager, String s)
    {
        try
        {
            packagemanager = packagemanager.getPackageInfo(s, 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return "VersionUnknown";
        }
        return packagemanager;
    }

    protected (AnalyticsRequest analyticsrequest, Context context, String s)
    {
        a = analyticsrequest;
        super();
        String s1 = context.getPackageName();
        Object obj = context.getPackageManager();
        try
        {
            analyticsrequest = ((PackageManager) (obj)).getApplicationInfo(s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (AnalyticsRequest analyticsrequest)
        {
            analyticsrequest = null;
        }
        b = "Android";
        c = Integer.toString(android.os.AnalyticsRequest.Meta.c);
        d = "1.7.1";
        e = s1;
        if (analyticsrequest != null)
        {
            analyticsrequest = (String)((PackageManager) (obj)).getApplicationLabel(analyticsrequest);
        } else
        {
            analyticsrequest = "ApplicationNameUnknown";
        }
        f = analyticsrequest;
        g = a(((PackageManager) (obj)), s1);
        h = a();
        i = Build.MANUFACTURER;
        j = Build.MODEL;
        k = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName();
        l = android.provider.ing(context.getContentResolver(), "android_id");
        obj = context.getSharedPreferences("BraintreeApi", 0);
        s1 = ((SharedPreferences) (obj)).getString("braintreeUUID", null);
        analyticsrequest = s1;
        if (s1 == null)
        {
            analyticsrequest = UUID.randomUUID().toString().replace("-", "");
            ((SharedPreferences) (obj)).edit().putString("braintreeUUID", analyticsrequest).apply();
        }
        m = analyticsrequest;
        if ("google_sdk".equalsIgnoreCase(Build.PRODUCT) || "sdk".equalsIgnoreCase(Build.PRODUCT) || "Genymotion".equalsIgnoreCase(Build.MANUFACTURER))
        {
            analyticsrequest = "true";
        } else
        {
            analyticsrequest = "false";
        }
        n = analyticsrequest;
        o = s;
        context.getResources().getConfiguration().orientation;
        JVM INSTR tableswitch 1 2: default 288
    //                   1 315
    //                   2 321;
           goto _L1 _L2 _L3
_L1:
        analyticsrequest = "Unknown";
_L5:
        p = analyticsrequest;
        return;
_L2:
        analyticsrequest = "Portrait";
        continue; /* Loop/switch isn't completed */
_L3:
        analyticsrequest = "Landscape";
        if (true) goto _L5; else goto _L4
_L4:
    }
}
