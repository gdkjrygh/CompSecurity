// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.service.operations:
//            AbstractStatusReportingOperation

public final class LoadExperimentsOperation extends AbstractStatusReportingOperation
{

    private final IPlayGamesCallbacks mCallbacks;
    private Set mExperimentIds;
    private final GamesClientContext mGamesContext;

    public LoadExperimentsOperation(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = iplaygamescallbacks;
        mGamesContext = gamesclientcontext;
        mExperimentIds = new HashSet();
    }

    protected final int performOperation(Context context, DataBroker databroker)
    {
        mExperimentIds = databroker.getExperiments(mGamesContext);
        return 0;
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        long al[] = ArrayUtils.toLongArray(mExperimentIds);
        mCallbacks.onExperimentsLoaded(i, al);
    }
}
