// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.BleDevice;

public abstract class BleScanCallback
{

    public BleScanCallback()
    {
    }

    public abstract void onDeviceFound(BleDevice bledevice);

    public abstract void onScanStopped();
}
