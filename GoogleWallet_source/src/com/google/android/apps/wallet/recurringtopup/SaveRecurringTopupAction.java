// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher

public final class SaveRecurringTopupAction
    implements Callable
{

    private final RecurringTopupPublisher recurringTopupPublisher;
    final byte serverData[];

    public SaveRecurringTopupAction(RecurringTopupPublisher recurringtopuppublisher, byte abyte0[])
    {
        recurringTopupPublisher = recurringtopuppublisher;
        serverData = abyte0;
    }

    private com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse call()
        throws RpcException
    {
        (new com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupRequest()).serverData = serverData;
        return recurringTopupPublisher.scheduleTopup(serverData);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}
