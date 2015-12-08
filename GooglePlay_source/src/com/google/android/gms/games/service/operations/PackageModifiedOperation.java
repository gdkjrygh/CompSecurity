// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GameAgent;
import java.util.HashSet;
import java.util.Iterator;

public final class PackageModifiedOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final boolean mPackageAdded;
    private final String mPackageName;

    public PackageModifiedOperation(String s, boolean flag)
    {
        mPackageName = s;
        mPackageAdded = flag;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        String s1;
        Iterator iterator1;
        boolean flag;
        if (mPackageAdded)
        {
            String s = mPackageName;
            for (Iterator iterator = databroker.getClientContextsForAllDatastores(context).iterator(); iterator.hasNext(); databroker.registerGame(context, (ClientContext)iterator.next(), s, false)) { }
        } else
        {
            databroker.clearPendingOps(context, mPackageName);
        }
        s1 = mPackageName;
        flag = mPackageAdded;
        iterator1 = databroker.getClientContextsForAllDatastores(context).iterator();
_L2:
        ClientContext clientcontext;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        clientcontext = (ClientContext)iterator1.next();
        DataBroker.acquireLocks(databroker.mGameAgent.mCacheLockables);
        databroker.mGameAgent.clearTransientCaches();
        databroker.mGameAgent.updateGameInstancePackage(context, clientcontext, s1, flag);
        DataBroker.releaseLocks(databroker.mGameAgent.mCacheLockables);
        if (true) goto _L2; else goto _L1
        context;
        DataBroker.releaseLocks(databroker.mGameAgent.mCacheLockables);
        throw context;
_L1:
    }

    public final void postExecute()
    {
    }
}
