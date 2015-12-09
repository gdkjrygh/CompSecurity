// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.ApiRateLimitUtil;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.PlayGamesServiceBroker;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.signin.SignInCache;

public final class SignOutOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private final boolean mRecordSignOut;

    public SignOutOperation(ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        mClientContext = clientcontext;
        mCallbacks = wrappedgamescallbacks;
        mRecordSignOut = flag;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        SignInCache.signOut(context, mClientContext, mRecordSignOut);
        PlayGamesServiceBroker.clearServiceCache();
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        ApiRateLimitUtil.clearSyncTimestamp(databroker.mMultiplayerAgent);
        ApiRateLimitUtil.clearSyncTimestamp(databroker.mRequestAgent);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        try
        {
            if (mCallbacks != null)
            {
                mCallbacks.mCallbacks.onSignOutComplete();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        throw context;
    }

    public final void postExecute()
    {
    }
}
