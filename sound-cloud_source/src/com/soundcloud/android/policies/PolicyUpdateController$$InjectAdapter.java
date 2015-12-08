// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.policies:
//            PolicyUpdateController, PolicySettingsStorage, GoBackOnlineDialogPresenter

public final class  extends b
    implements a, Provider
{

    private b connectionHelper;
    private b dateProvider;
    private b featureOperations;
    private b goBackOnlineDialogPresenter;
    private b offlineContentOperations;
    private b policySettingsStorage;
    private b supertype;

    public final void attach(l l1)
    {
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        policySettingsStorage = l1.a("com.soundcloud.android.policies.PolicySettingsStorage", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        goBackOnlineDialogPresenter = l1.a("com.soundcloud.android.policies.GoBackOnlineDialogPresenter", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/policies/PolicyUpdateController, getClass().getClassLoader(), false);
    }

    public final PolicyUpdateController get()
    {
        PolicyUpdateController policyupdatecontroller = new PolicyUpdateController((FeatureOperations)featureOperations.get(), (OfflineContentOperations)offlineContentOperations.get(), (PolicySettingsStorage)policySettingsStorage.get(), (CurrentDateProvider)dateProvider.get(), (GoBackOnlineDialogPresenter)goBackOnlineDialogPresenter.get(), (NetworkConnectionHelper)connectionHelper.get());
        injectMembers(policyupdatecontroller);
        return policyupdatecontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureOperations);
        set.add(offlineContentOperations);
        set.add(policySettingsStorage);
        set.add(dateProvider);
        set.add(goBackOnlineDialogPresenter);
        set.add(connectionHelper);
        set1.add(supertype);
    }

    public final void injectMembers(PolicyUpdateController policyupdatecontroller)
    {
        supertype.injectMembers(policyupdatecontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PolicyUpdateController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.policies.PolicyUpdateController", "members/com.soundcloud.android.policies.PolicyUpdateController", false, com/soundcloud/android/policies/PolicyUpdateController);
    }
}
