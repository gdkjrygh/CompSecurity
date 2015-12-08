// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public class AbstractSignInCallbacks extends com.google.android.gms.games.internal.IGamesSignInCallbacks.Stub
{

    public AbstractSignInCallbacks()
    {
    }

    public void onAccountValidated(int i)
        throws RemoteException
    {
    }

    public void onCheckOAuthComplete(int i, PendingIntent pendingintent)
        throws RemoteException
    {
    }

    public void onGameLoaded(DataHolder dataholder)
        throws RemoteException
    {
    }

    public void onGameplayAclLoaded(DataHolder dataholder)
        throws RemoteException
    {
    }

    public void onGameplayAclUpdated(int i)
        throws RemoteException
    {
    }

    public void onPlayersLoaded(DataHolder dataholder)
        throws RemoteException
    {
    }

    public void onSignInRecorded(int i)
        throws RemoteException
    {
    }

    public void onTokenRefreshed(int i)
        throws RemoteException
    {
    }
}
