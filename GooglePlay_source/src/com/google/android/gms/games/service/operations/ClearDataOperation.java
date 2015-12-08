// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;

public final class ClearDataOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final boolean mTransientOnly;

    public ClearDataOperation(boolean flag)
    {
        mTransientOnly = flag;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        if (mTransientOnly)
        {
            databroker.clearTransientData();
            return;
        } else
        {
            databroker.clearDataForLocaleChange(context);
            return;
        }
    }

    public final void postExecute()
    {
    }
}
