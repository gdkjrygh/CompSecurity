// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher

final class ctionResponse
    implements Runnable
{

    final RecurringTopupPublisher this$0;
    final com.google.wallet.proto.api.kipNextTopupTransactionResponse val$res;

    public final void run()
    {
        if (val$res.callError == null)
        {
            RecurringTopupPublisher.access$200(RecurringTopupPublisher.this, Optional.fromNullable(val$res.schedule));
        } else
        if (val$res.callError.errorCode.intValue() == 2)
        {
            RecurringTopupPublisher.access$300(RecurringTopupPublisher.this, false);
            return;
        }
    }

    ctionResponse()
    {
        this$0 = final_recurringtopuppublisher;
        val$res = com.google.wallet.proto.api.kipNextTopupTransactionResponse.this;
        super();
    }
}
