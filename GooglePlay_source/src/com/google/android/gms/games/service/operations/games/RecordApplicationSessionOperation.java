// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.games;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class RecordApplicationSessionOperation extends AbstractStatusReportingOperation
{

    private final String mAdvertisingId;
    private final long mEndTimeMillis;
    private final GamesClientContext mGamesContext;
    private final boolean mLimitAdTracking;
    private final String mSessionId;
    private final long mStartTimeMillis;

    public RecordApplicationSessionOperation(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, 
            boolean flag)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mSessionId = s;
        mStartTimeMillis = l;
        mEndTimeMillis = l1;
        mAdvertisingId = s1;
        mLimitAdTracking = flag;
    }

    protected final int performOperation(Context context, DataBroker databroker)
    {
        return databroker.recordApplicationSession(mGamesContext, mSessionId, mStartTimeMillis, mEndTimeMillis, mAdvertisingId, mLimitAdTracking);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
