// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.chimera.AsyncOperation;
import com.google.android.gms.chimera.BaseAsyncOperationService;
import com.google.android.gms.common.service.OperationException;
import com.google.android.gms.games.broker.DataBroker;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

private static final class mOperation
    implements AsyncOperation
{

    private final cute mOperation;

    public final volatile void execute(BaseAsyncOperationService baseasyncoperationservice)
        throws OperationException, RemoteException
    {
        PlayGamesSignInIntentService playgamessigninintentservice;
        playgamessigninintentservice = (PlayGamesSignInIntentService)baseasyncoperationservice;
        baseasyncoperationservice = DataBroker.acquireBroker(playgamessigninintentservice);
        SystemClock.elapsedRealtime();
        mOperation.cute(playgamessigninintentservice, baseasyncoperationservice);
        SystemClock.elapsedRealtime();
        baseasyncoperationservice.release();
        return;
        Exception exception;
        exception;
        baseasyncoperationservice.release();
        throw exception;
    }

    public ( )
    {
        mOperation = ;
    }
}
