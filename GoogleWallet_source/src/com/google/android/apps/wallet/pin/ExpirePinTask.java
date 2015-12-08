// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinManager

public class ExpirePinTask
    implements Callable
{

    private final CloudPinManager cloudPinManager;

    ExpirePinTask(CloudPinManager cloudpinmanager)
    {
        cloudPinManager = cloudpinmanager;
    }

    private Void call()
    {
        if (cloudPinManager.getPinTimeout() == 0)
        {
            return null;
        } else
        {
            cloudPinManager.expirePin();
            return null;
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
