// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.games;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class SetIdentitySharingConfirmedOperation extends AbstractStatusReportingOperation
{

    private final GamesClientContext mGamesContext;

    public SetIdentitySharingConfirmedOperation(GamesClientContext gamesclientcontext)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.setIdentitySharingConfirmed(mGamesContext);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
