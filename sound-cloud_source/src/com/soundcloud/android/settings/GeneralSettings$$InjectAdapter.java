// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.content.Context;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineSettingsOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.settings:
//            GeneralSettings

public final class  extends b
    implements Provider
{

    private b appContext;
    private b eventBus;
    private b featureOperations;
    private b offlineSettingsOperations;

    public final void attach(l l1)
    {
        appContext = l1.a("android.content.Context", com/soundcloud/android/settings/GeneralSettings, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/settings/GeneralSettings, getClass().getClassLoader());
        offlineSettingsOperations = l1.a("com.soundcloud.android.offline.OfflineSettingsOperations", com/soundcloud/android/settings/GeneralSettings, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/settings/GeneralSettings, getClass().getClassLoader());
    }

    public final GeneralSettings get()
    {
        return new GeneralSettings((Context)appContext.get(), (FeatureOperations)featureOperations.get(), (OfflineSettingsOperations)offlineSettingsOperations.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appContext);
        set.add(featureOperations);
        set.add(offlineSettingsOperations);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.settings.GeneralSettings", "members/com.soundcloud.android.settings.GeneralSettings", false, com/soundcloud/android/settings/GeneralSettings);
    }
}
