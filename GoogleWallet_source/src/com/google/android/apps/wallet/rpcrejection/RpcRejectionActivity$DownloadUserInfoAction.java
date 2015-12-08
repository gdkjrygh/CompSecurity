// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.user.UserInfoManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.rpcrejection:
//            RpcRejectionActivity

static final class mUserInfoManager
    implements Callable
{

    private final UserInfoManager mUserInfoManager;

    private Void call()
        throws RpcException
    {
        mUserInfoManager.downloadAndPersistUserInfo();
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public (UserInfoManager userinfomanager)
    {
        mUserInfoManager = userinfomanager;
    }
}
