// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.base.Objects;
import java.util.List;

public class RecurringTopupEligibilityEvent
{

    private final Exception failureCause;
    private final boolean isFeatureEnabled;
    private final List limits;

    public RecurringTopupEligibilityEvent(boolean flag, List list, Exception exception)
    {
        isFeatureEnabled = flag;
        limits = list;
        failureCause = exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RecurringTopupEligibilityEvent)
        {
            obj = (RecurringTopupEligibilityEvent)obj;
            flag = flag1;
            if (isFeatureEnabled == ((RecurringTopupEligibilityEvent) (obj)).isFeatureEnabled)
            {
                flag = flag1;
                if (Objects.equal(limits, ((RecurringTopupEligibilityEvent) (obj)).limits))
                {
                    flag = flag1;
                    if (Objects.equal(failureCause, ((RecurringTopupEligibilityEvent) (obj)).failureCause))
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

    public final List getLimits()
    {
        return limits;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Boolean.valueOf(isFeatureEnabled), limits, failureCause
        });
    }

    public final boolean isFeatureEnabled()
    {
        return isFeatureEnabled;
    }
}
