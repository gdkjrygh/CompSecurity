// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


public class DeviceData
{

    public final long availableInternalStorage;
    public final long availablePhysicalMemory;
    public final int batteryCapacity;
    public final int batteryVelocity;
    public final int orientation;
    public final boolean proximity;
    public final long totalInternalStorage;
    public final long totalPhysicalMemory;

    public DeviceData(int i, long l, long l1, long l2, 
            long l3, int j, int k, boolean flag)
    {
        orientation = i;
        totalPhysicalMemory = l;
        totalInternalStorage = l1;
        availablePhysicalMemory = l2;
        availableInternalStorage = l3;
        batteryCapacity = j;
        batteryVelocity = k;
        proximity = flag;
    }
}
