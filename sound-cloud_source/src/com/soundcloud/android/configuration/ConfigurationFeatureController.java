// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.offline.OfflineServiceInitiator;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.b;

// Referenced classes of package com.soundcloud.android.configuration:
//            FeatureOperations

public class ConfigurationFeatureController
{
    private class OfflineSyncFeatureUpdatesSubscriber extends DefaultSubscriber
    {

        final ConfigurationFeatureController this$0;

        public void onNext(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                offlineServiceInitiator.subscribe();
                return;
            } else
            {
                offlineServiceInitiator.unsubscribe();
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Boolean)obj);
        }

        private OfflineSyncFeatureUpdatesSubscriber()
        {
            this$0 = ConfigurationFeatureController.this;
            super();
        }

        OfflineSyncFeatureUpdatesSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final FeatureOperations featureOperations;
    private final OfflineServiceInitiator offlineServiceInitiator;
    private final b offlineSyncFeatureUpdatesObservable;

    public ConfigurationFeatureController(OfflineServiceInitiator offlineserviceinitiator, FeatureOperations featureoperations)
    {
        offlineServiceInitiator = offlineserviceinitiator;
        featureOperations = featureoperations;
        offlineSyncFeatureUpdatesObservable = featureoperations.offlineContentEnabled();
    }

    private void initialise()
    {
        if (featureOperations.isOfflineContentEnabled())
        {
            offlineServiceInitiator.subscribe();
        }
    }

    public void subscribe()
    {
        initialise();
        offlineSyncFeatureUpdatesObservable.subscribe(new OfflineSyncFeatureUpdatesSubscriber(null));
    }

}
