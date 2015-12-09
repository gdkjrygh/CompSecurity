// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.utils.GamesDataUtils;

public abstract class AbstractStatusReportingOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    public final ClientContext mClientContext;

    public AbstractStatusReportingOperation(ClientContext clientcontext)
    {
        mClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
    }

    public final void execute(Context context, DataBroker databroker)
    {
        int i;
        try
        {
            i = performOperation(context, databroker);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("StatusOperation", "Auth error while performing operation, requesting reconnect", context);
            i = 2;
        }
        catch (GamesException gamesexception)
        {
            GamesLog.e("StatusOperation", gamesexception.mLogMessage, gamesexception);
            int j = gamesexception.mClientStatusCode;
            int k = gamesexception.mInternalStatusCode;
            if (k == 1500)
            {
                GamesDataUtils.markGameplayAclUnset(context, mClientContext, databroker);
                SignInCache.signOut(context, mClientContext);
                i = j;
            } else
            {
                i = j;
                if (k == 1003)
                {
                    databroker.clearRevisionCheck(context);
                    i = j;
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (DataBroker databroker)
        {
            GamesLog.wtf(context, "StatusOperation", "Killing (on development devices) due to RuntimeException", databroker);
            i = 1;
        }
        try
        {
            provideResult(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("StatusOperation", "When providing result ", context);
        }
    }

    public abstract int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException;

    public void postExecute()
    {
    }

    public abstract void provideResult(int i)
        throws RemoteException;
}
