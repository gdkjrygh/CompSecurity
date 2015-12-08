// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;

public interface BleApi
{

    public abstract PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice);

    public abstract PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient);

    public abstract PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest);

    public abstract PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback);

    public abstract PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice);

    public abstract PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s);
}
