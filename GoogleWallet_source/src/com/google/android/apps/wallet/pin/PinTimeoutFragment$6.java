// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinTimeoutFragment

final class this._cls0
    implements AsyncCallback
{

    final PinTimeoutFragment this$0;

    private void onSuccess(Integer integer)
    {
        PinTimeoutFragment.access$300(PinTimeoutFragment.this, integer.intValue(), true);
    }

    public final void onFailure(Exception exception)
    {
        WLog.v(PinTimeoutFragment.access$400(), "Could not get Pin timeout setting from server", exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Integer)obj);
    }

    ()
    {
        this$0 = PinTimeoutFragment.this;
        super();
    }
}
