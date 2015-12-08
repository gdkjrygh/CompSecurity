// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.app.Application;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            GooglePlacesAddressSource

public final class  extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding context;
    private Binding httpUrlConnectionFactory;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/widgets/address/GooglePlacesAddressSource, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/widgets/address/GooglePlacesAddressSource, getClass().getClassLoader());
        httpUrlConnectionFactory = linker.requestBinding("com.google.android.apps.wallet.http.HttpUrlConnectionFactory", com/google/android/apps/wallet/widgets/address/GooglePlacesAddressSource, getClass().getClassLoader());
    }

    public final GooglePlacesAddressSource get()
    {
        return new GooglePlacesAddressSource((Application)context.get(), (AppControl)appControl.get(), (HttpUrlConnectionFactory)httpUrlConnectionFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(appControl);
        set.add(httpUrlConnectionFactory);
    }

    public ()
    {
        super("com.google.android.apps.wallet.widgets.address.GooglePlacesAddressSource", "members/com.google.android.apps.wallet.widgets.address.GooglePlacesAddressSource", false, com/google/android/apps/wallet/widgets/address/GooglePlacesAddressSource);
    }
}
