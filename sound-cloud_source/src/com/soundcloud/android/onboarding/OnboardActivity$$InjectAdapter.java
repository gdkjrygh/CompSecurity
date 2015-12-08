// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import com.facebook.j;
import com.facebook.login.o;
import com.facebook.s;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.onboarding.auth.TokenInformationGenerator;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

public final class  extends b
    implements a, Provider
{

    private b applicationProperties;
    private b bugReporter;
    private b configurationManager;
    private b eventBus;
    private b facebookCallbackManager;
    private b facebookLoginManager;
    private b facebookSdk;
    private b navigator;
    private b oauth;
    private b oldCloudAPI;
    private b tokenUtils;

    public final void attach(l l1)
    {
        facebookSdk = l1.a("com.facebook.FacebookSdk", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        facebookCallbackManager = l1.a("com.facebook.CallbackManager", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        facebookLoginManager = l1.a("com.facebook.login.LoginManager", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        configurationManager = l1.a("com.soundcloud.android.configuration.ConfigurationManager", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        bugReporter = l1.a("com.soundcloud.android.utils.BugReporter", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        tokenUtils = l1.a("com.soundcloud.android.onboarding.auth.TokenInformationGenerator", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        oauth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
        oldCloudAPI = l1.a("com.soundcloud.android.api.legacy.PublicApi", com/soundcloud/android/onboarding/OnboardActivity, getClass().getClassLoader());
    }

    public final OnboardActivity get()
    {
        OnboardActivity onboardactivity = new OnboardActivity();
        injectMembers(onboardactivity);
        return onboardactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(facebookSdk);
        set1.add(facebookCallbackManager);
        set1.add(facebookLoginManager);
        set1.add(configurationManager);
        set1.add(applicationProperties);
        set1.add(bugReporter);
        set1.add(eventBus);
        set1.add(tokenUtils);
        set1.add(navigator);
        set1.add(oauth);
        set1.add(oldCloudAPI);
    }

    public final void injectMembers(OnboardActivity onboardactivity)
    {
        onboardactivity.facebookSdk = (s)facebookSdk.get();
        onboardactivity.facebookCallbackManager = (j)facebookCallbackManager.get();
        onboardactivity.facebookLoginManager = (o)facebookLoginManager.get();
        onboardactivity.configurationManager = (ConfigurationManager)configurationManager.get();
        onboardactivity.applicationProperties = (ApplicationProperties)applicationProperties.get();
        onboardactivity.bugReporter = (BugReporter)bugReporter.get();
        onboardactivity.eventBus = (EventBus)eventBus.get();
        onboardactivity.tokenUtils = (TokenInformationGenerator)tokenUtils.get();
        onboardactivity.navigator = (Navigator)navigator.get();
        onboardactivity.oauth = (OAuth)oauth.get();
        onboardactivity.oldCloudAPI = (PublicApi)oldCloudAPI.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OnboardActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.onboarding.OnboardActivity", "members/com.soundcloud.android.onboarding.OnboardActivity", false, com/soundcloud/android/onboarding/OnboardActivity);
    }
}
