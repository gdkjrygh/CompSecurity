// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.utils.GamesDataUtils;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mCallbacks extends mCallbacks
{

    private final IGamesSignInCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private DataHolder mDataHolder;
    private final String mExternalGameId;
    private final boolean mForceRefresh = true;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        if (!TextUtils.isEmpty(mExternalGameId)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new com.google.android.gms.games.broker..mExternalGameId(context, mClientContext);
        obj.mClientContext = mForceRefresh;
        obj = ((com.google.android.gms.games.broker..mForceRefresh) (obj)).mForceRefresh();
_L3:
        mDataHolder = databroker.loadSelf(((com.google.android.gms.games.broker.GamesClientContext) (obj)));
_L4:
        return mDataHolder.mStatusCode;
_L2:
        obj = new com.google.android.gms.games.broker..mDataHolder(context, mClientContext);
        obj.mClientContext = mForceRefresh;
        obj.d = mExternalGameId;
        obj.d = mExternalGameId;
        obj = ((com.google.android.gms.games.broker..mExternalGameId) (obj)).mExternalGameId();
          goto _L3
        context;
        if (context instanceof UserRecoverableAuthException)
        {
            mDataHolder = DataHolder.empty(1001);
        } else
        {
            mDataHolder = DataHolder.empty(1000);
        }
          goto _L4
        GamesException gamesexception;
        gamesexception;
        GamesLog.e("SignInIntentService", gamesexception.mLogMessage, gamesexception);
        int i = gamesexception.mInternalStatusCode;
        if (i == 1002)
        {
            mDataHolder = DataHolder.empty(i);
        } else
        if (i == 1500)
        {
            GamesDataUtils.markGameplayAclUnset(context, mClientContext, databroker);
            mDataHolder = DataHolder.empty(i);
        } else
        {
            if (i == 1003)
            {
                databroker.clearRevisionCheck(context);
            }
            mDataHolder = DataHolder.empty(gamesexception.mClientStatusCode);
        }
          goto _L4
    }

    public final void provideResult(int i)
    {
        mCallbacks.onPlayersLoaded(mDataHolder);
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

    public Y(ClientContext clientcontext, String s, boolean flag, IGamesSignInCallbacks igamessignincallbacks)
    {
        mClientContext = clientcontext;
        mExternalGameId = s;
        mCallbacks = igamessignincallbacks;
    }
}
