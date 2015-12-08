// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.ScopeUtil;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.signin.SignInCache;

public final class ValidatePlayServiceConnectionOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final IGmsCallbacks mCallbacks;
    private final int mCallingUid = Binder.getCallingUid();
    private final int mClientVersion;
    private final GetServiceRequest mRequest;

    public ValidatePlayServiceConnectionOperation(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
    {
        mCallbacks = igmscallbacks;
        mRequest = getservicerequest;
        mClientVersion = getservicerequest.clientVersion;
    }

    private void sendCallback(int i, com.google.android.gms.games.service.PlayGames1pServiceBroker.PlayGamesService playgamesservice)
    {
        try
        {
            mCallbacks.onPostInitComplete(i, playgamesservice, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.service.PlayGames1pServiceBroker.PlayGamesService playgamesservice)
        {
            GamesLog.e("ValidatePlayServiceOp", "Failed to invoke callback", playgamesservice);
        }
    }

    public final void execute(Context context, DataBroker databroker)
    {
        Bundle bundle = mRequest.extraArgs;
        bundle.setClassLoader(getClass().getClassLoader());
        if (bundle.getBoolean("unauthenticated"))
        {
            sendCallback(0, new com.google.android.gms.games.service.PlayGames1pServiceBroker.PlayGamesService(context.getApplicationContext()));
            return;
        }
        String as[] = ScopeUtil.toScopeString(mRequest.scopes);
        if (!ArrayUtils.contains(as, "https://www.googleapis.com/auth/games.firstparty"))
        {
            throw new IllegalArgumentException("Play Games must have the 1P scope!");
        }
        String s = mRequest.callingPackage;
        Object obj1 = mRequest.clientRequestedAccount;
        Object obj = obj1;
        if (AccountUtils.isDefaultAccount(((android.accounts.Account) (obj1)), "com.google"))
        {
            obj = SignInCache.getAccount(context, s);
        }
        if (obj == null)
        {
            sendCallback(5, null);
            return;
        } else
        {
            boolean flag = bundle.getBoolean("com.google.android.gms.games.key.isHeadless", false);
            obj = new ClientContext(mCallingUid, ((android.accounts.Account) (obj1)), ((android.accounts.Account) (obj)), s);
            ((ClientContext) (obj)).setGrantedScopes(as);
            ((ClientContext) (obj)).setExtra("client_version", mRequest.clientVersion);
            obj1 = AndroidUtils.getMetadataTagForPackage(context, s, "com.google.android.gms.games.APP_ID");
            databroker = databroker.getCurrentPlayerId(context, ((ClientContext) (obj)));
            sendCallback(0, new com.google.android.gms.games.service.PlayGames1pServiceBroker.PlayGamesService(context.getApplicationContext(), ((ClientContext) (obj)), mClientVersion, ((String) (obj1)), flag, databroker));
            return;
        }
    }

    public final void postExecute()
    {
    }
}
