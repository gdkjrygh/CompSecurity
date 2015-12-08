// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;

public final class AccountsChangedOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    public AccountsChangedOperation()
    {
    }

    public final void execute(Context context, DataBroker databroker)
    {
        databroker.registerForNotifications(context);
    }

    public final void postExecute()
    {
    }
}
