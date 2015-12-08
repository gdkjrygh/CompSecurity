// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.squareup.okhttp.Call;
import rx.functions.Action0;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            PollingSubscriber

class val.call
    implements Action0
{

    final PollingSubscriber this$0;
    final Call val$call;

    public void call()
    {
        val$call.cancel();
    }

    ()
    {
        this$0 = final_pollingsubscriber;
        val$call = Call.this;
        super();
    }
}
