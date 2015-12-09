// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressView, GooglePlacesAddressSource

public final class  extends Binding
    implements MembersInjector
{

    private Binding actionExecutor;
    private Binding addressSource;

    public final void attach(Linker linker)
    {
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/widgets/address/AddressView, getClass().getClassLoader());
        addressSource = linker.requestBinding("com.google.android.apps.wallet.widgets.address.GooglePlacesAddressSource", com/google/android/apps/wallet/widgets/address/AddressView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(actionExecutor);
        set1.add(addressSource);
    }

    public final void injectMembers(AddressView addressview)
    {
        addressview.actionExecutor = (ActionExecutor)actionExecutor.get();
        addressview.addressSource = (GooglePlacesAddressSource)addressSource.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AddressView)obj);
    }

    public ()
    {
        super(null, "members/com.google.android.apps.wallet.widgets.address.AddressView", false, com/google/android/apps/wallet/widgets/address/AddressView);
    }
}
