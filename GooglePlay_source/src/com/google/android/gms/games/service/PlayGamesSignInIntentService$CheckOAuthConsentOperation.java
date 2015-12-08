// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.signin.SignInAuthenticator;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mCallbacks extends mCallbacks
{

    private final IGamesSignInCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private PendingIntent mResolution;
    private final Bundle mSignInOptionsBundle;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        ConnectionResult connectionresult;
        char c;
        new SignInAuthenticator();
        connectionresult = SignInAuthenticator.authWithSignInService(context, mClientContext, mSignInOptionsBundle);
        c = '\u03E8';
        if (!connectionresult.isSuccess())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        boolean flag = databroker.checkRevision(context, Agents.buildFirstPartyClientContext(mClientContext));
        if (!flag) goto _L2; else goto _L1
_L1:
        c = '\0';
_L4:
        return c;
_L2:
        return 1;
        databroker;
        if (!(databroker instanceof UserRecoverableAuthException)) goto _L4; else goto _L3
_L3:
        mResolution = PendingIntent.getActivity(context, 0, ((UserRecoverableAuthException)databroker).getIntent(), 0);
        return 1001;
        switch (connectionresult.mStatusCode)
        {
        case 5: // '\005'
        default:
            return 1000;

        case 4: // '\004'
        case 6: // '\006'
            mResolution = connectionresult.mPendingIntent;
            return 1001;

        case 7: // '\007'
            return 6;
        }
    }

    public final void provideResult(int i)
    {
        try
        {
            mCallbacks.onCheckOAuthComplete(i, mResolution);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public (ClientContext clientcontext, Bundle bundle, IGamesSignInCallbacks igamessignincallbacks)
    {
        mClientContext = clientcontext;
        mSignInOptionsBundle = bundle;
        mCallbacks = igamessignincallbacks;
    }
}
