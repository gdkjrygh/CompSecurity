// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEligibilityPublisher, TopupScheduleClient

final class this._cls0
    implements Callable
{

    final RecurringTopupEligibilityPublisher this$0;

    private com.google.wallet.proto.api.edTopupEligibilityResponse call()
        throws RpcException
    {
        return RecurringTopupEligibilityPublisher.access$400(RecurringTopupEligibilityPublisher.this).checkEligibility(new com.google.wallet.proto.api.edTopupEligibilityRequest());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    Response()
    {
        this$0 = RecurringTopupEligibilityPublisher.this;
        super();
    }
}
