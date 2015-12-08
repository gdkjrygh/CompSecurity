// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            C2dmRegistrationReceiver

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding featureManager;
    private Binding gcm;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/notifications/C2dmRegistrationReceiver, getClass().getClassLoader());
        gcm = linker.requestBinding("com.google.android.gms.gcm.GoogleCloudMessaging", com/google/android/apps/wallet/notifications/C2dmRegistrationReceiver, getClass().getClassLoader());
    }

    public final C2dmRegistrationReceiver get()
    {
        C2dmRegistrationReceiver c2dmregistrationreceiver = new C2dmRegistrationReceiver();
        injectMembers(c2dmregistrationreceiver);
        return c2dmregistrationreceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(featureManager);
        set1.add(gcm);
    }

    public final void injectMembers(C2dmRegistrationReceiver c2dmregistrationreceiver)
    {
        c2dmregistrationreceiver.featureManager = (FeatureManager)featureManager.get();
        c2dmregistrationreceiver.gcm = (GoogleCloudMessaging)gcm.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((C2dmRegistrationReceiver)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.C2dmRegistrationReceiver", "members/com.google.android.apps.wallet.notifications.C2dmRegistrationReceiver", false, com/google/android/apps/wallet/notifications/C2dmRegistrationReceiver);
    }
}
