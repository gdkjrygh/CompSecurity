// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineSettingsFragment, OfflineUsage

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b featureOperations;
    private b navigator;
    private b offlineContentOperations;
    private b offlineSettings;
    private b offlineUsage;

    public final void attach(l l1)
    {
        offlineSettings = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
        offlineUsage = l1.a("com.soundcloud.android.settings.OfflineUsage", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/settings/OfflineSettingsFragment, getClass().getClassLoader());
    }

    public final OfflineSettingsFragment get()
    {
        OfflineSettingsFragment offlinesettingsfragment = new OfflineSettingsFragment();
        injectMembers(offlinesettingsfragment);
        return offlinesettingsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(offlineSettings);
        set1.add(offlineUsage);
        set1.add(offlineContentOperations);
        set1.add(featureOperations);
        set1.add(eventBus);
        set1.add(navigator);
    }

    public final void injectMembers(OfflineSettingsFragment offlinesettingsfragment)
    {
        offlinesettingsfragment.offlineSettings = (OfflineSettingsStorage)offlineSettings.get();
        offlinesettingsfragment.offlineUsage = (OfflineUsage)offlineUsage.get();
        offlinesettingsfragment.offlineContentOperations = (OfflineContentOperations)offlineContentOperations.get();
        offlinesettingsfragment.featureOperations = (FeatureOperations)featureOperations.get();
        offlinesettingsfragment.eventBus = (EventBus)eventBus.get();
        offlinesettingsfragment.navigator = (Navigator)navigator.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OfflineSettingsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.settings.OfflineSettingsFragment", "members/com.soundcloud.android.settings.OfflineSettingsFragment", false, com/soundcloud/android/settings/OfflineSettingsFragment);
    }
}
