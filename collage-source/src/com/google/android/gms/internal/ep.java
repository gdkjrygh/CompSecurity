// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;

public interface ep
    extends IInterface
{

    public abstract void onActivityResult(int i, int j, Intent intent)
        throws RemoteException;

    public abstract void onCreate()
        throws RemoteException;

    public abstract void onDestroy()
        throws RemoteException;

    // Unreferenced inner class com/google/android/gms/internal/ep$a
    /* block-local class not found */
    class a {}

}
