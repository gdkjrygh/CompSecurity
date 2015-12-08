// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.content.res.Resources;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.offline.OfflineSettingsOperations;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.users.UserRepository;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.you:
//            YouPresenter, YouViewFactory

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b appProperties;
    private b bugReporter;
    private b eventBus;
    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b offlineSettingsOperations;
    private b resources;
    private b supertype;
    private b userRepository;
    private b youViewFactory;

    public final void attach(l l1)
    {
        youViewFactory = l1.a("com.soundcloud.android.you.YouViewFactory", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        userRepository = l1.a("com.soundcloud.android.users.UserRepository", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        offlineSettingsOperations = l1.a("com.soundcloud.android.offline.OfflineSettingsOperations", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        bugReporter = l1.a("com.soundcloud.android.utils.BugReporter", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        appProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/you/YouPresenter, getClass().getClassLoader(), false);
    }

    public final YouPresenter get()
    {
        YouPresenter youpresenter = new YouPresenter((YouViewFactory)youViewFactory.get(), (UserRepository)userRepository.get(), (AccountOperations)accountOperations.get(), (ImageOperations)imageOperations.get(), (Resources)resources.get(), (EventBus)eventBus.get(), (FeatureOperations)featureOperations.get(), (OfflineSettingsOperations)offlineSettingsOperations.get(), (Navigator)navigator.get(), (BugReporter)bugReporter.get(), (ApplicationProperties)appProperties.get());
        injectMembers(youpresenter);
        return youpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(youViewFactory);
        set.add(userRepository);
        set.add(accountOperations);
        set.add(imageOperations);
        set.add(resources);
        set.add(eventBus);
        set.add(featureOperations);
        set.add(offlineSettingsOperations);
        set.add(navigator);
        set.add(bugReporter);
        set.add(appProperties);
        set1.add(supertype);
    }

    public final void injectMembers(YouPresenter youpresenter)
    {
        supertype.injectMembers(youpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((YouPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.you.YouPresenter", "members/com.soundcloud.android.you.YouPresenter", false, com/soundcloud/android/you/YouPresenter);
    }
}
