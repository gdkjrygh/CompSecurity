// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.logging.WLog;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity, CloudPinManager

final class this._cls0
    implements Callable
{

    final ChangeOrSetPinActivity this$0;

    private com.google.wallet.proto.api.ifyResponse call()
        throws Exception
    {
        WLog.i(ChangeOrSetPinActivity.access$500(), "verifying PIN with CloudPinManager");
        return cloudPinManager.verifyPin(ChangeOrSetPinActivity.access$600(ChangeOrSetPinActivity.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    onse()
    {
        this$0 = ChangeOrSetPinActivity.this;
        super();
    }
}
