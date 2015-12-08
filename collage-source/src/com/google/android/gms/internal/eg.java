// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public interface eg
    extends IInterface
{

    public abstract void onBackPressed()
        throws RemoteException;

    public abstract void onCreate(Bundle bundle)
        throws RemoteException;

    public abstract void onDestroy()
        throws RemoteException;

    public abstract void onPause()
        throws RemoteException;

    public abstract void onRestart()
        throws RemoteException;

    public abstract void onResume()
        throws RemoteException;

    public abstract void onSaveInstanceState(Bundle bundle)
        throws RemoteException;

    public abstract void onStart()
        throws RemoteException;

    public abstract void onStop()
        throws RemoteException;

    public abstract void zzaE()
        throws RemoteException;

    public abstract boolean zzez()
        throws RemoteException;

    // Unreferenced inner class com/google/android/gms/internal/eg$a
    /* block-local class not found */
    class a {}

}
