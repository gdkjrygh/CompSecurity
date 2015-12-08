// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;


public class GeofencingInMemoryState
{

    private volatile boolean canHandleLocationUpdate;

    public GeofencingInMemoryState()
    {
        canHandleLocationUpdate = true;
    }

    public final boolean canHandleLocationUpdate()
    {
        return canHandleLocationUpdate;
    }

    public final void disableHandlingOfLocationUpdates()
    {
        canHandleLocationUpdate = false;
    }

    public final void enableHandlingOfLocationUpdates()
    {
        canHandleLocationUpdate = true;
    }
}
