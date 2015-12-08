// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.games;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GameAgent;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class UpdatePlayedOperation extends AbstractStatusReportingOperation
{

    public UpdatePlayedOperation(ClientContext clientcontext)
    {
        super(clientcontext);
    }

    protected final int performOperation(Context context, DataBroker databroker)
    {
        context = mClientContext;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mGameAgent
        });
        GameAgent gameagent = databroker.mGameAgent;
        (new Thread(new com.google.android.gms.games.broker.GameAgent.UpdatePlayedTimeRunnable(gameagent, context))).start();
        gameagent.clearRecentlyPlayedCache();
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent
        });
        return 0;
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent
        });
        throw context;
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
