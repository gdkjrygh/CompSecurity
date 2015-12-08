// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher

final class Response
    implements Runnable
{

    final RecurringTopupPublisher this$0;
    final com.google.wallet.proto.api.ancelTopupScheduleResponse val$res;

    public final void run()
    {
        if (val$res.callError == null)
        {
            RecurringTopupPublisher.access$400(RecurringTopupPublisher.this, Optional.absent());
        } else
        if (val$res.callError.errorCode.intValue() == 2)
        {
            RecurringTopupPublisher.access$500(RecurringTopupPublisher.this, false);
            return;
        }
    }

    Response()
    {
        this$0 = final_recurringtopuppublisher;
        val$res = com.google.wallet.proto.api.ancelTopupScheduleResponse.this;
        super();
    }
}
