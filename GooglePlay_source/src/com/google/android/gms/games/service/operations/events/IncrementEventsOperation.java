// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.events;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;
import java.util.ArrayList;

public final class IncrementEventsOperation extends AbstractStatusReportingOperation
{

    private final GamesClientContext mGamesContext;
    private final ArrayList mUpdates;

    public IncrementEventsOperation(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mUpdates = arraylist;
    }

    public final int performOperation(Context context, DataBroker databroker)
    {
        return databroker.incrementEvents(mGamesContext, mUpdates);
    }

    public final void provideResult(int i)
    {
    }
}
