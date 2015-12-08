// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.configuration.ConfigurationOperations;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment, TokenInformationGenerator

public final class  extends b
    implements a
{

    private b accountOperations;
    private b apiClient;
    private b configurationOperations;
    private b eventBus;
    private b networkConnectionHelper;
    private b tokenUtils;
    private b userStorage;

    public final void attach(l l1)
    {
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        configurationOperations = l1.a("com.soundcloud.android.configuration.ConfigurationOperations", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        tokenUtils = l1.a("com.soundcloud.android.onboarding.auth.TokenInformationGenerator", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
        userStorage = l1.a("com.soundcloud.android.storage.LegacyUserStorage", com/soundcloud/android/onboarding/auth/AuthTaskFragment, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(networkConnectionHelper);
        set1.add(configurationOperations);
        set1.add(eventBus);
        set1.add(accountOperations);
        set1.add(tokenUtils);
        set1.add(apiClient);
        set1.add(userStorage);
    }

    public final void injectMembers(AuthTaskFragment authtaskfragment)
    {
        authtaskfragment.networkConnectionHelper = (NetworkConnectionHelper)networkConnectionHelper.get();
        authtaskfragment.configurationOperations = (ConfigurationOperations)configurationOperations.get();
        authtaskfragment.eventBus = (EventBus)eventBus.get();
        authtaskfragment.accountOperations = (AccountOperations)accountOperations.get();
        authtaskfragment.tokenUtils = (TokenInformationGenerator)tokenUtils.get();
        authtaskfragment.apiClient = (ApiClient)apiClient.get();
        authtaskfragment.userStorage = (LegacyUserStorage)userStorage.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AuthTaskFragment)obj);
    }

    public ()
    {
        super(null, "members/com.soundcloud.android.onboarding.auth.AuthTaskFragment", false, com/soundcloud/android/onboarding/auth/AuthTaskFragment);
    }
}
