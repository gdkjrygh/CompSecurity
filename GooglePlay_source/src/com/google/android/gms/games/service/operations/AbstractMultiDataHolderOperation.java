// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.utils.GamesDataUtils;

public abstract class AbstractMultiDataHolderOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    protected final ClientContext mClientContext;
    private final DataHolder mDataHolders[];

    public AbstractMultiDataHolderOperation(ClientContext clientcontext, int i)
    {
        mClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mDataHolders = new DataHolder[i];
    }

    public final void execute(Context context, DataBroker databroker)
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L2:
        if (i >= mDataHolders.length)
        {
            break; /* Loop/switch isn't completed */
        }
        mDataHolders[i] = fetchData$b7c4c52(databroker, i);
        boolean flag1 = flag;
_L3:
        i++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        GamesLog.e("MultiDataOperation", "Auth exception while performing operation, requesting reconnect", ((Throwable) (obj)));
        mDataHolders[i] = DataHolder.empty(2);
        flag1 = flag;
          goto _L3
        obj;
        GamesLog.e("MultiDataOperation", ((GamesException) (obj)).mLogMessage, ((Throwable) (obj)));
        mDataHolders[i] = DataHolder.empty(((GamesException) (obj)).mClientStatusCode);
        int i1 = ((GamesException) (obj)).mInternalStatusCode;
        if (i1 == 1500)
        {
            flag1 = true;
        } else
        {
            flag1 = flag;
            if (i1 == 1003)
            {
                databroker.clearRevisionCheck(context);
                flag1 = flag;
            }
        }
          goto _L3
        obj;
        GamesLog.wtf(context, "MultiDataOperation", "Killing (on development devices) due to RuntimeException", ((Throwable) (obj)));
        mDataHolders[i] = DataHolder.empty(1);
        flag1 = flag;
          goto _L3
_L1:
        if (flag)
        {
            GamesDataUtils.markGameplayAclUnset(context, mClientContext, databroker);
            SignInCache.signOut(context, mClientContext);
        }
        provideResults(mDataHolders);
        for (int j = 0; j < mDataHolders.length; j++)
        {
            mDataHolders[j].close();
        }

        break MISSING_BLOCK_LABEL_309;
        context;
        GamesLog.e("MultiDataOperation", "When providing result ", context);
        for (int k = 0; k < mDataHolders.length; k++)
        {
            mDataHolders[k].close();
        }

        break MISSING_BLOCK_LABEL_309;
        context;
        for (int l = 0; l < mDataHolders.length; l++)
        {
            mDataHolders[l].close();
        }

        throw context;
    }

    public abstract DataHolder fetchData$b7c4c52(DataBroker databroker, int i)
        throws GoogleAuthException;

    public final void postExecute()
    {
    }

    public abstract void provideResults(DataHolder adataholder[])
        throws RemoteException;
}
