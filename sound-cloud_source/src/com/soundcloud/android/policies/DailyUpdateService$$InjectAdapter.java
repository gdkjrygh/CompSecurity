// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            DailyUpdateService, PolicyOperations, PolicySettingsStorage

public final class  extends b
    implements a, Provider
{

    private b adIdHelper;
    private b configurationManager;
    private b dateProvider;
    private b eventBus;
    private b policyOperations;
    private b policySettingsStorage;

    public final void attach(l l1)
    {
        policyOperations = l1.a("com.soundcloud.android.policies.PolicyOperations", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
        policySettingsStorage = l1.a("com.soundcloud.android.policies.PolicySettingsStorage", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
        configurationManager = l1.a("com.soundcloud.android.configuration.ConfigurationManager", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
        adIdHelper = l1.a("com.soundcloud.android.ads.AdIdHelper", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/policies/DailyUpdateService, getClass().getClassLoader());
    }

    public final DailyUpdateService get()
    {
        DailyUpdateService dailyupdateservice = new DailyUpdateService();
        injectMembers(dailyupdateservice);
        return dailyupdateservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(policyOperations);
        set1.add(policySettingsStorage);
        set1.add(configurationManager);
        set1.add(adIdHelper);
        set1.add(dateProvider);
        set1.add(eventBus);
    }

    public final void injectMembers(DailyUpdateService dailyupdateservice)
    {
        dailyupdateservice.policyOperations = (PolicyOperations)policyOperations.get();
        dailyupdateservice.policySettingsStorage = (PolicySettingsStorage)policySettingsStorage.get();
        dailyupdateservice.configurationManager = (ConfigurationManager)configurationManager.get();
        dailyupdateservice.adIdHelper = (AdIdHelper)adIdHelper.get();
        dailyupdateservice.dateProvider = (CurrentDateProvider)dateProvider.get();
        dailyupdateservice.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DailyUpdateService)obj);
    }

    public ()
    {
        super("com.soundcloud.android.policies.DailyUpdateService", "members/com.soundcloud.android.policies.DailyUpdateService", false, com/soundcloud/android/policies/DailyUpdateService);
    }
}
