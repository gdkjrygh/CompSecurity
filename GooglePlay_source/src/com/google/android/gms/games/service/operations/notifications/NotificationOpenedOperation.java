// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.notifications;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.NotificationAgent;

public final class NotificationOpenedOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final ClientContext mClientContext;

    public NotificationOpenedOperation(ClientContext clientcontext)
    {
        mClientContext = clientcontext;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        ClientContext clientcontext;
        clientcontext = mClientContext;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        NotificationAgent.notificationOpened(context, clientcontext);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        return;
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        throw context;
    }

    public final void postExecute()
    {
    }
}
