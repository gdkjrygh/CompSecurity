// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.requests;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class SendRequestOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final int mExpirationDurationDays;
    private final String mExternalRecipientIds[];
    private final GamesClientContext mGamesContext;
    private final byte mPayload[];
    private final int mRequestType;

    public SendRequestOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int j, byte abyte0[], String as[])
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mRequestType = i;
        mExpirationDurationDays = j;
        mExternalRecipientIds = as;
        if (abyte0 == null)
        {
            mPayload = null;
            return;
        } else
        {
            mPayload = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, mPayload, 0, abyte0.length);
            return;
        }
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.sendRequest(mGamesContext, mRequestType, mExpirationDurationDays, mPayload, mExternalRecipientIds);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onRequestSent(dataholder);
    }
}
