// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.acls;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class UpdateNotifyAclOperation extends AbstractStatusReportingOperation
{

    private final String mAclData;
    private final WrappedGamesCallbacks mCallbacks;

    public UpdateNotifyAclOperation(ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        super(clientcontext);
        mCallbacks = wrappedgamescallbacks;
        mAclData = s;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.updateNotifyAcl$32b84d33(mClientContext, mAclData);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        mCallbacks.mCallbacks.onNotifyAclUpdated(i);
    }
}
