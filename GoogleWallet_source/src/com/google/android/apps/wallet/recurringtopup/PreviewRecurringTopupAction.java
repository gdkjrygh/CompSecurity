// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher

public final class PreviewRecurringTopupAction
    implements Callable
{

    private final com.google.wallet.proto.NanoWalletEntities.MoneyProto amount;
    private final String instrumentSubId;
    private final RecurringTopupPublisher recurringTopupPublisher;
    private final com.google.wallet.proto.features.NanoPaymentSchedule.Schedule schedule;

    public PreviewRecurringTopupAction(RecurringTopupPublisher recurringtopuppublisher, com.google.wallet.proto.features.NanoPaymentSchedule.Schedule schedule1, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, String s)
    {
        recurringTopupPublisher = recurringtopuppublisher;
        schedule = schedule1;
        amount = moneyproto;
        instrumentSubId = s;
    }

    private com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse call()
        throws RpcException
    {
        return recurringTopupPublisher.previewTopupSchedule(schedule, amount, instrumentSubId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
