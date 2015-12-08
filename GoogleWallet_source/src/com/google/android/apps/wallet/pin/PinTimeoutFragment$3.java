// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTimeoutFragment, CloudPinManager

final class this._cls0
    implements Callable
{

    final PinTimeoutFragment this$0;

    private Integer call()
        throws Exception
    {
        return Integer.valueOf(cloudPinManager.getPinTimeout());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = PinTimeoutFragment.this;
        super();
    }
}
