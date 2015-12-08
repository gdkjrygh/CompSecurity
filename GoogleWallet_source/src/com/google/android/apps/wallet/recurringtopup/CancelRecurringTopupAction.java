// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher

public final class CancelRecurringTopupAction
    implements Callable
{

    private final boolean ignoreDeadline;
    private final RecurringTopupPublisher recurringTopupPublisher;
    private final byte serverData[];

    public CancelRecurringTopupAction(RecurringTopupPublisher recurringtopuppublisher, byte abyte0[])
    {
        this(recurringtopuppublisher, abyte0, false);
    }

    public CancelRecurringTopupAction(RecurringTopupPublisher recurringtopuppublisher, byte abyte0[], boolean flag)
    {
        recurringTopupPublisher = recurringtopuppublisher;
        serverData = abyte0;
        ignoreDeadline = flag;
    }

    private com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse call()
        throws RpcException
    {
        return recurringTopupPublisher.cancelTopupSchedule(serverData, ignoreDeadline);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
