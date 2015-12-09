// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinManager

public class FetchCloudPinStateTask
    implements Callable
{

    private final CloudPinManager pinManager;

    FetchCloudPinStateTask(CloudPinManager cloudpinmanager)
    {
        pinManager = cloudpinmanager;
    }

    private Void call()
        throws RpcException
    {
        pinManager.initializeCloudPinState();
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
