// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.invitations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class DeclineInvitationOperation extends AbstractStatusReportingOperation
{

    private final String mExternalInvitationId;
    private final GamesClientContext mGamesContext;
    private final int mInvitationType;

    public DeclineInvitationOperation(GamesClientContext gamesclientcontext, String s, int i)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mExternalInvitationId = s;
        mInvitationType = i;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.declineInvitation(mGamesContext, mExternalInvitationId, mInvitationType);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
