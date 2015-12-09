// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import com.google.android.gms.games.server.error.GamesException;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mAclData extends mAclData
{

    private final String mAclData;
    private final IGamesSignInCallbacks mCallbacks;
    private final ClientContext mClientContext;
    private final String mExternalGameId;

    public final int executeInternal(Context context, DataBroker databroker)
        throws GamesException
    {
        int i;
        try
        {
            i = databroker.updateGameplayAcl(context, mClientContext, mAclData, mExternalGameId);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1;
        }
        return i;
    }

    public final void provideResult(int i)
    {
        try
        {
            mCallbacks.onGameplayAclUpdated(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    (ClientContext clientcontext, IGamesSignInCallbacks igamessignincallbacks, String s, String s1)
    {
        mClientContext = clientcontext;
        mCallbacks = igamessignincallbacks;
        mExternalGameId = s;
        mAclData = s1;
    }
}
