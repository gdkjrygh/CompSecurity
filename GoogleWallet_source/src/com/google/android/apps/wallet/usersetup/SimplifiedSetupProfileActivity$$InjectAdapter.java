// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.gms.PeopleGraphRequester;
import com.google.android.gms.common.api.GoogleApiClient;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding peopleClient;
    private Binding peopleGraphRequester;

    public final void attach(Linker linker)
    {
        peopleClient = linker.requestBinding("@com.google.android.apps.wallet.gms.BindingAnnotations$PeopleClient()/com.google.android.gms.common.api.GoogleApiClient", com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity, getClass().getClassLoader());
        peopleGraphRequester = linker.requestBinding("com.google.android.apps.wallet.gms.PeopleGraphRequester", com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity, getClass().getClassLoader());
    }

    public final SimplifiedSetupProfileActivity get()
    {
        SimplifiedSetupProfileActivity simplifiedsetupprofileactivity = new SimplifiedSetupProfileActivity();
        injectMembers(simplifiedsetupprofileactivity);
        return simplifiedsetupprofileactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(peopleClient);
        set1.add(peopleGraphRequester);
    }

    public final void injectMembers(SimplifiedSetupProfileActivity simplifiedsetupprofileactivity)
    {
        simplifiedsetupprofileactivity.peopleClient = (GoogleApiClient)peopleClient.get();
        simplifiedsetupprofileactivity.peopleGraphRequester = (PeopleGraphRequester)peopleGraphRequester.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SimplifiedSetupProfileActivity)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.usersetup.SimplifiedSetupProfileActivity", "members/com.google.android.apps.wallet.usersetup.SimplifiedSetupProfileActivity", false, com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity);
    }
}
