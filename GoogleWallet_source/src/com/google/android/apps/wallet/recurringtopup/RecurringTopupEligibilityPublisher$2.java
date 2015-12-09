// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.common.cache.Cache;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEligibilityPublisher

final class this._cls0
    implements EventHandler
{

    final RecurringTopupEligibilityPublisher this$0;

    private void handleEvent(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.SCHEDULED_STORED_VALUE_TOPUP))
        {
            RecurringTopupEligibilityPublisher.access$200(RecurringTopupEligibilityPublisher.this).invalidate(RecurringTopupEligibilityPublisher.access$100());
            RecurringTopupEligibilityPublisher.access$300(RecurringTopupEligibilityPublisher.this);
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((FeaturesChangedEvent)obj);
    }

    ()
    {
        this$0 = RecurringTopupEligibilityPublisher.this;
        super();
    }
}
