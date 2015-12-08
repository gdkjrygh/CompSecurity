// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.paypal.android.sdk.payments.PayPalService;

public class gr
{

    private static final String a = com/paypal/android/sdk/gr.getSimpleName();
    private Context b;

    public gr(Context context)
    {
        b = context;
    }

    private boolean b()
    {
        boolean flag1 = false;
        Object obj;
        PackageInfo packageinfo;
        ServiceInfo aserviceinfo[];
        ServiceInfo serviceinfo;
        int i;
        int j;
        boolean flag;
        try
        {
            obj = b.getPackageManager();
            packageinfo = ((PackageManager) (obj)).getPackageInfo(b.getPackageName(), 4);
            obj = ((PackageManager) (obj)).getApplicationInfo(b.getPackageName(), 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException((new StringBuilder("Exception loading manifest")).append(namenotfoundexception.getMessage()).toString());
        }
        flag = flag1;
        if (packageinfo.services == null) goto _L2; else goto _L1
_L1:
        aserviceinfo = packageinfo.services;
        j = aserviceinfo.length;
        i = 0;
_L8:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        serviceinfo = aserviceinfo[i];
        if (!serviceinfo.name.equals(com/paypal/android/sdk/payments/PayPalService.getName())) goto _L5; else goto _L4
_L4:
        (new StringBuilder("context.getPackageName()=")).append(b.getPackageName());
        (new StringBuilder("serviceInfo.exported=")).append(serviceinfo.exported);
        (new StringBuilder("serviceInfo.processName=")).append(serviceinfo.processName);
        (new StringBuilder("applicationInfo.processName=")).append(((ApplicationInfo) (obj)).processName);
        if (serviceinfo.exported || !((ApplicationInfo) (obj)).processName.equals(serviceinfo.processName)) goto _L5; else goto _L6
_L6:
        (new StringBuilder("Found ")).append(com/paypal/android/sdk/payments/PayPalService.getName()).append(" in manifest.");
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a()
    {
        if (!b())
        {
            throw new RuntimeException("Please declare the following in your manifest, and ensure it runs in the same process as your application:<service android:name=\"com.paypal.android.sdk.payments.PayPalService\" android:exported=\"false\" />");
        } else
        {
            return;
        }
    }

}
