// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.chimera.BaseAsyncOperationService;
import com.google.android.gms.common.service.OperationException;
import com.google.android.gms.games.broker.DataBroker;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesAsyncService

private static final class mAffinity extends com.google.android.gms.chimera.Operation
{

    private final int mAffinity;
    private final mAffinity mOperation;

    public final volatile void execute(BaseAsyncOperationService baseasyncoperationservice)
        throws OperationException, RemoteException
    {
        PlayGamesAsyncService playgamesasyncservice;
        playgamesasyncservice = (PlayGamesAsyncService)baseasyncoperationservice;
        baseasyncoperationservice = DataBroker.acquireBroker(playgamesasyncservice);
        SystemClock.elapsedRealtime();
        mOperation.(playgamesasyncservice, baseasyncoperationservice);
        SystemClock.elapsedRealtime();
        mOperation.cute();
        baseasyncoperationservice.release();
        return;
        Exception exception;
        exception;
        mOperation.cute();
        baseasyncoperationservice.release();
        throw exception;
    }

    public final int getAffinity()
    {
        return mAffinity;
    }

    public ion(ion ion, int i)
    {
        mOperation = ion;
        mAffinity = i;
    }
}
