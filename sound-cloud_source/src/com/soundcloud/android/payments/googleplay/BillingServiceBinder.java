// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import java.util.List;

class BillingServiceBinder
{

    private static final int NO_FLAGS = 0;
    private final Context context;
    private final Intent serviceIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");

    BillingServiceBinder(Context context1)
    {
        context = context1;
        serviceIntent.setPackage("com.android.vending");
    }

    public IInAppBillingService bind(IBinder ibinder)
    {
        return com.android.vending.billing.IInAppBillingService.Stub.a(ibinder);
    }

    public boolean canConnect()
    {
        boolean flag1 = false;
        List list = context.getPackageManager().queryIntentServices(serviceIntent, 0);
        boolean flag = flag1;
        if (list != null)
        {
            flag = flag1;
            if (!list.isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    public void connect(Activity activity, ServiceConnection serviceconnection)
    {
        activity.bindService(serviceIntent, serviceconnection, 1);
    }
}
