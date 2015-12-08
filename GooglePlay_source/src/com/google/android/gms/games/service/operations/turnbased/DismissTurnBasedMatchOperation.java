// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.turnbased;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class DismissTurnBasedMatchOperation extends AbstractStatusReportingOperation
{

    private final String mExternalMatchId;
    private final GamesClientContext mGamesContext;

    public DismissTurnBasedMatchOperation(GamesClientContext gamesclientcontext, String s)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mExternalMatchId = s;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.dismissMatch(mGamesContext, mExternalMatchId);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
