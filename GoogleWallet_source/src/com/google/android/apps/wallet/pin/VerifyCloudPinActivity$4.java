// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            VerifyCloudPinActivity, CloudPinManager

final class this._cls0
    implements Callable
{

    final VerifyCloudPinActivity this$0;

    private Void call()
        throws Exception
    {
        cloudPinManager.expirePin();
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    A()
    {
        this$0 = VerifyCloudPinActivity.this;
        super();
    }
}
