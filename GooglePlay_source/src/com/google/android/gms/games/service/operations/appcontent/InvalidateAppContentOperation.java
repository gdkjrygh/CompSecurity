// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.appcontent;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.games.broker.AppContentAgent;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.cache.AppContentSectionAndCardCache;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class InvalidateAppContentOperation extends AbstractStatusReportingOperation
{

    private final GamesClientContext mGamesContext;
    private final String mScreenNames[];

    public InvalidateAppContentOperation(GamesClientContext gamesclientcontext, String as[])
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mScreenNames = as;
    }

    protected final int performOperation(Context context, DataBroker databroker)
    {
        String as[];
        context = mGamesContext;
        as = mScreenNames;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mCardStreamAgent
        });
        AppContentAgent appcontentagent;
        appcontentagent = databroker.mCardStreamAgent;
        appcontentagent.enableCaches(((GamesClientContext) (context)).mExternalCurrentPlayerId);
        if (as != null) goto _L2; else goto _L1
_L1:
        appcontentagent.mCardStreamCache.clear();
        AppContentAgent.clearDBCache(((GamesClientContext) (context)).mContext, ((GamesClientContext) (context)).mClientContext, null);
_L6:
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mCardStreamAgent
        });
        return 0;
_L2:
        int j = as.length;
        int i = 0;
_L4:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        appcontentagent.mCardStreamCache.clearData(s);
        AppContentAgent.clearDBCache(((GamesClientContext) (context)).mContext, ((GamesClientContext) (context)).mClientContext, s);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mCardStreamAgent
        });
        throw context;
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
