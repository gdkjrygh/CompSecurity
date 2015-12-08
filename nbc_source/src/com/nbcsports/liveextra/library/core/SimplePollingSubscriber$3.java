// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import com.squareup.okhttp.Call;
import rx.functions.Action0;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            SimplePollingSubscriber

class val.call
    implements Action0
{

    final SimplePollingSubscriber this$0;
    final Call val$call;

    public void call()
    {
        val$call.cancel();
    }

    ()
    {
        this$0 = final_simplepollingsubscriber;
        val$call = Call.this;
        super();
    }
}
