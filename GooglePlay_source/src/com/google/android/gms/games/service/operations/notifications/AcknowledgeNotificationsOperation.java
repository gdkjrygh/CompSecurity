// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.notifications;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.games.broker.AccountAgent;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.NotificationAgent;
import com.google.android.gms.games.internal.GamesLog;

public final class AcknowledgeNotificationsOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final String mDataStoreName;

    public AcknowledgeNotificationsOperation(String s)
    {
        mDataStoreName = s;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        String s;
        s = mDataStoreName;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        Account account = AccountAgent.getAccount(context, s);
        if (account == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (account.name != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        GamesLog.e("DataBroker", (new StringBuilder("No account found for the given datastore! Bailing! (datastore name :")).append(s).append(")").toString());
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        return;
        NotificationAgent.acknowledgeNotifications(context, account.name, s);
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
