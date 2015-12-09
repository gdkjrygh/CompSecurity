// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.server.error.GamesException;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mGamePackageName extends mGamePackageName
{

    private final IGamesSignInCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private DataHolder mDataHolder;
    private final String mExternalGameId;
    private final String mGamePackageName;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        mDataHolder = DataHolder.empty(1);
        try
        {
            mDataHolder = databroker.getGame(GamesClientContext.buildContextForTargetGame(context, mClientContext, mExternalGameId), mGamePackageName);
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return mDataHolder.mStatusCode;
    }

    protected final void onGamesException(GamesException gamesexception)
    {
        mDataHolder = DataHolder.empty(gamesexception.mClientStatusCode);
    }

    public final void provideResult(int i)
    {
        mCallbacks.onGameLoaded(mDataHolder);
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
_L2:
        return;
        Object obj;
        obj;
        if (mDataHolder == null) goto _L2; else goto _L1
_L1:
        mDataHolder.close();
        return;
        obj;
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
        throw obj;
    }

    Y(ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
    {
        mClientContext = clientcontext;
        mCallbacks = igamessignincallbacks;
        mExternalGameId = s;
        mGamePackageName = s1;
    }
}
