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

public abstract class AbstractDataHolderOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    public final ClientContext mClientContext;
    protected final boolean mCloseDataHolder;

    public AbstractDataHolderOperation(ClientContext clientcontext)
    {
        this(clientcontext, true);
    }

    public AbstractDataHolderOperation(ClientContext clientcontext, boolean flag)
    {
        mClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
        mCloseDataHolder = flag;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        Object obj;
        try
        {
            obj = fetchData(context, databroker);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("DataHolderOperation", "Auth error while performing operation, requesting reconnect", context);
            obj = DataHolder.empty(2);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.e("DataHolderOperation", ((GamesException) (obj)).mLogMessage, ((Throwable) (obj)));
            DataHolder dataholder = DataHolder.empty(((GamesException) (obj)).mClientStatusCode);
            int i = ((GamesException) (obj)).mInternalStatusCode;
            if (i == 1500)
            {
                GamesDataUtils.markGameplayAclUnset(context, mClientContext, databroker);
                SignInCache.signOut(context, mClientContext);
                obj = dataholder;
            } else
            {
                obj = dataholder;
                if (i == 1003)
                {
                    databroker.clearRevisionCheck(context);
                    obj = dataholder;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (DataBroker databroker)
        {
            GamesLog.wtf(context, "DataHolderOperation", "Killing (on development devices) due to RuntimeException", databroker);
            obj = DataHolder.empty(1);
            continue; /* Loop/switch isn't completed */
        }
_L4:
        provideResult(((DataHolder) (obj)));
        if (mCloseDataHolder)
        {
            ((DataHolder) (obj)).close();
        }
_L2:
        return;
        context;
        GamesLog.e("DataHolderOperation", "When providing result ", context);
        if (!mCloseDataHolder) goto _L2; else goto _L1
_L1:
        ((DataHolder) (obj)).close();
        return;
        context;
        if (mCloseDataHolder)
        {
            ((DataHolder) (obj)).close();
        }
        throw context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException;

    public void postExecute()
    {
    }

    public abstract void provideResult(DataHolder dataholder)
        throws RemoteException;
}
