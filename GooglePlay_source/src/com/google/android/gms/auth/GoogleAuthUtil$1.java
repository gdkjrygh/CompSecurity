// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.firstparty.shared.Status;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthUtil, GoogleAuthException, TokenData, UserRecoverableAuthException

static final class val.options
    implements nnectionExecutor
{

    final Account val$account;
    final Bundle val$options;
    final String val$scope;

    public final volatile Object exec(IBinder ibinder)
        throws RemoteException, IOException, GoogleAuthException
    {
        Object obj = (Bundle)GoogleAuthUtil.access$000(com.google.android.auth.ce.Stub.asInterface(ibinder).getTokenByAccount(val$account, val$scope, val$options));
        ibinder = TokenData.fromWrappedBundle(((Bundle) (obj)), "tokenDetails");
        if (ibinder != null)
        {
            return ibinder;
        }
        ibinder = ((Bundle) (obj)).getString("Error");
        obj = (Intent)((Bundle) (obj)).getParcelable("userRecoveryIntent");
        Status status = Status.fromWireCode(ibinder);
        if (Status.isUserRecoverableError(status))
        {
            throw new UserRecoverableAuthException(ibinder, ((Intent) (obj)));
        }
        if (Status.isRetryableError(status))
        {
            throw new IOException(ibinder);
        } else
        {
            throw new GoogleAuthException(ibinder);
        }
    }

    on(Account account1, String s, Bundle bundle)
    {
        val$account = account1;
        val$scope = s;
        val$options = bundle;
        super();
    }
}
