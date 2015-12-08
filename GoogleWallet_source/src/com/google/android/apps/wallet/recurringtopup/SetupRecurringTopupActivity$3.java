// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            SetupRecurringTopupActivity

final class val.recurence
    implements Predicate
{

    final SetupRecurringTopupActivity this$0;
    final int val$recurence;

    private boolean apply(com.google.wallet.proto.api.ScheduledTopupEligibilityResponse.TransferLimit transferlimit)
    {
        return transferlimit.recurrence.intValue() == val$recurence;
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.ScheduledTopupEligibilityResponse.TransferLimit)obj);
    }

    ibilityResponse.TransferLimit()
    {
        this$0 = final_setuprecurringtopupactivity;
        val$recurence = I.this;
        super();
    }
}
