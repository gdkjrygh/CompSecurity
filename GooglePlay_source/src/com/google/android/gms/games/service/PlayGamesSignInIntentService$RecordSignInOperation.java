// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mSignInSessionId extends mSignInSessionId
{

    private final IGamesSignInCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private final String mExternalPlayerId;
    private final Integer mSignInSessionId;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        return databroker.recordSignIn(context, mClientContext, mExternalPlayerId, mSignInSessionId);
    }

    public final void provideResult(int i)
    {
        try
        {
            mCallbacks.onSignInRecorded(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    (ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, Integer integer)
    {
        mClientContext = clientcontext;
        mCallbacks = igamessignincallbacks;
        mExternalPlayerId = s;
        mSignInSessionId = integer;
    }
}
