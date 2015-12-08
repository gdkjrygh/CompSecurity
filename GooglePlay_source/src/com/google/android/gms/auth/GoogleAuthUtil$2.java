// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.auth.IAuthManagerService;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthUtil, GoogleAuthException

static final class val.extras
    implements nnectionExecutor
{

    final Bundle val$extras;
    final String val$token;

    public final volatile Object exec(IBinder ibinder)
        throws RemoteException, IOException, GoogleAuthException
    {
        ibinder = (Bundle)GoogleAuthUtil.access$000(com.google.android.auth.ce.Stub.asInterface(ibinder).clearToken(val$token, val$extras));
        String s = ibinder.getString("Error");
        if (!ibinder.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(s);
        } else
        {
            return null;
        }
    }

    on(String s, Bundle bundle)
    {
        val$token = s;
        val$extras = bundle;
        super();
    }
}
