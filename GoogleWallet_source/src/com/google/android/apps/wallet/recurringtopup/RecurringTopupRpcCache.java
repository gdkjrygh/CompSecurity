// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.eventbus.RpcCache;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            TopupScheduleClient

public class RecurringTopupRpcCache
    implements RpcCache
{

    private volatile Optional cachedData;
    private final TopupScheduleClient topupScheduleClient;

    RecurringTopupRpcCache(TopupScheduleClient topupscheduleclient)
    {
        topupScheduleClient = topupscheduleclient;
    }

    private Optional readFromCache()
    {
        return cachedData;
    }

    private Optional readFromServer()
        throws Exception
    {
        com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleResponse gettopupscheduleresponse = topupScheduleClient.getTopupSchedule(new com.google.wallet.proto.api.NanoWalletScheduleTopups.GetTopupScheduleRequest());
        if (gettopupscheduleresponse.callError != null)
        {
            throw new CallErrorException(gettopupscheduleresponse.callError);
        } else
        {
            return Optional.fromNullable(gettopupscheduleresponse.schedule);
        }
    }

    private void writeToCache(Optional optional)
    {
        cachedData = optional;
    }

    public final volatile Object readFromCache()
    {
        return readFromCache();
    }

    public final volatile Object readFromServer()
        throws Exception
    {
        return readFromServer();
    }

    public final volatile void writeToCache(Object obj)
    {
        writeToCache((Optional)obj);
    }
}
