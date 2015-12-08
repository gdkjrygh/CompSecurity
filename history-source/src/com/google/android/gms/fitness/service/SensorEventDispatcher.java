// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

public interface SensorEventDispatcher
{

    public abstract void publish(DataPoint datapoint)
        throws RemoteException;

    public abstract void publish(List list)
        throws RemoteException;
}
