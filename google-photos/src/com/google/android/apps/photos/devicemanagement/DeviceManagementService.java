// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.devicemanagement;

import android.content.IntentFilter;
import fby;
import java.util.concurrent.TimeUnit;
import jhk;
import jhl;
import noz;
import olm;
import olq;

public class DeviceManagementService extends jhk
{

    private static final long b;
    private static final IntentFilter c;
    private noz d;

    public DeviceManagementService()
    {
        super("PhotosDeviceMgmt");
    }

    public static IntentFilter a()
    {
        return c;
    }

    public static noz a(DeviceManagementService devicemanagementservice)
    {
        return devicemanagementservice.d;
    }

    public static long b()
    {
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        d = noz.a(getApplicationContext(), 3, "PhotosDeviceMgmt", new String[0]);
        a.a.a(jhl, new fby(this));
    }

    static 
    {
        b = TimeUnit.MINUTES.toMillis(30L);
        IntentFilter intentfilter = new IntentFilter();
        c = intentfilter;
        intentfilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        c.addAction("com.google.android.apps.photos.devicemanagement.MANUAL_TRIGGER");
        c.addAction("android.intent.action.DEVICE_STORAGE_OK");
    }
}
