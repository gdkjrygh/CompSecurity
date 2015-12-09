// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            VerifyCloudPinActivity, UserPin, CloudPinManager

final class pinToVerify
    implements Callable
{

    private final UserPin pinToVerify;
    final VerifyCloudPinActivity this$0;

    private com.google.wallet.proto.api.Action call()
        throws Exception
    {
        com.google.wallet.proto.api.Action action = cloudPinManager.verifyPin(pinToVerify);
        pinToVerify.shred();
        return action;
        Exception exception;
        exception;
        pinToVerify.shred();
        throw exception;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public (UserPin userpin)
    {
        this$0 = VerifyCloudPinActivity.this;
        super();
        pinToVerify = userpin.deepCopy();
    }
}
