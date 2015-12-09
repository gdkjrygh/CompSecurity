// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.operations:
//            AbstractDataHolderOperation

public final class LoadContactSettingsOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final boolean mForceReload;

    public LoadContactSettingsOperation(ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        super(clientcontext);
        mCallbacks = wrappedgamescallbacks;
        mForceReload = flag;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.loadContactSettings(mClientContext, mForceReload);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onContactSettingsLoaded(dataholder);
    }
}
