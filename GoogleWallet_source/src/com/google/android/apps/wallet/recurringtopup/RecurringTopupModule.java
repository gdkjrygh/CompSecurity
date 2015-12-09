// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEligibilityPublisher, RecurringTopupPublisher

public class RecurringTopupModule
{

    public RecurringTopupModule()
    {
    }

    static Set getInitializedEventPublishers(RecurringTopupEligibilityPublisher recurringtopupeligibilitypublisher, RecurringTopupPublisher recurringtopuppublisher)
    {
        return Sets.newHashSet(new InitializedEventPublisher[] {
            recurringtopupeligibilitypublisher, recurringtopuppublisher
        });
    }

    static Cache getRecurringTopupEligibilityEventCache()
    {
        return CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build();
    }
}
