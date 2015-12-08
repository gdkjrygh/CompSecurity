// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            Feature, FeaturesChangedEvent

public class FeaturesChangedEventPublisher
    implements com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager.ClientConfigurationFeatureListener
{

    private static final String TAG = com/google/android/apps/wallet/config/featurecontrol/FeaturesChangedEventPublisher.getSimpleName();
    private final EventBus eventBus;

    public FeaturesChangedEventPublisher(EventBus eventbus)
    {
        eventBus = eventbus;
    }

    public final void featuresPossiblyChanged(Set set, Set set1)
    {
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        Object obj = set.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (Integer)((Iterator) (obj)).next();
            if (!set1.contains(obj1))
            {
                obj1 = Feature.getFeatureForCode(((Integer) (obj1)));
                if (obj1 != null)
                {
                    builder.add(obj1);
                }
            }
        } while (true);
        obj = ImmutableSet.builder();
        set1 = set1.iterator();
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            Object obj2 = (Integer)set1.next();
            if (!set.contains(obj2))
            {
                obj2 = Feature.getFeatureForCode(((Integer) (obj2)));
                if (obj2 != null)
                {
                    ((com.google.common.collect.ImmutableSet.Builder) (obj)).add(obj2);
                }
            }
        } while (true);
        set = builder.build();
        set1 = ((com.google.common.collect.ImmutableSet.Builder) (obj)).build();
        if (!set.isEmpty() || !set1.isEmpty())
        {
            set = new FeaturesChangedEvent(set1, set);
            WLog.dfmt(TAG, "posting features changed event: %s", new Object[] {
                set
            });
            eventBus.post(set);
        }
    }

}
