// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.base.Objects;
import com.google.protobuf.nano.MessageNano;

public class RecurringTopupEvent
{

    private final Exception failureCause;
    private final boolean isFeatureEnabled;
    private final com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule topupSchedule;

    public RecurringTopupEvent(boolean flag, com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableschedule, Exception exception)
    {
        isFeatureEnabled = flag;
        topupSchedule = displayableschedule;
        failureCause = exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RecurringTopupEvent)
        {
            obj = (RecurringTopupEvent)obj;
            flag = flag1;
            if (isFeatureEnabled == ((RecurringTopupEvent) (obj)).isFeatureEnabled)
            {
                flag = flag1;
                if (MessageNano.messageNanoEquals(topupSchedule, ((RecurringTopupEvent) (obj)).topupSchedule))
                {
                    flag = flag1;
                    if (Objects.equal(failureCause, ((RecurringTopupEvent) (obj)).failureCause))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final Exception getFailureCause()
    {
        return failureCause;
    }

    public final com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule getTopupSchedule()
    {
        return topupSchedule;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Boolean.valueOf(isFeatureEnabled), topupSchedule, failureCause
        });
    }

    public final boolean isFeatureEnabled()
    {
        return isFeatureEnabled;
    }
}
