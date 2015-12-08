// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesSignInCallbacks;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mCallbacks extends mCallbacks
{

    private final Account mAccount;
    private final IGamesSignInCallbacks mCallbacks;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        return !AccountUtils.isUnicornAccount(context, mAccount.name) ? 0 : 1004;
    }

    public final void provideResult(int i)
    {
        try
        {
            mCallbacks.onAccountValidated(i);
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
