// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mCallbacks extends mCallbacks
{

    private final Account mAccount;
    private final IGamesSignInCallbacks mCallbacks;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        try
        {
            GoogleAuthUtil.invalidateToken(context, GoogleAuthUtil.getToken(context, mAccount, "cp"));
            GoogleAuthUtil.getToken(context, mAccount, "cp");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 6;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1000;
        }
        return 0;
    }

    public final void provideResult(int i)
    {
        try
        {
            mCallbacks.onTokenRefreshed(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    (Account account, IGamesSignInCallbacks igamessignincallbacks)
    {
        mAccount = account;
        mCallbacks = igamessignincallbacks;
    }
}
