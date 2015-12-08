// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.events;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.EventAgent;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class ClearPendingEventsOperation extends AbstractStatusReportingOperation
{

    private final GamesClientContext mGamesContext;

    public ClearPendingEventsOperation(GamesClientContext gamesclientcontext)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
    }

    public final int performOperation(Context context, DataBroker databroker)
    {
        EventAgent.clearPending(mGamesContext);
        return 0;
    }

    public final void provideResult(int i)
    {
    }
}
