// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Context;
import android.view.LayoutInflater;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataWidgetFactory

public final class  extends Binding
    implements Provider
{

    private Binding context;
    private Binding inflater;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/apps/wallet/wobs/add/UserDataWidgetFactory, getClass().getClassLoader());
        inflater = linker.requestBinding("android.view.LayoutInflater", com/google/android/apps/wallet/wobs/add/UserDataWidgetFactory, getClass().getClassLoader());
    }

    public final UserDataWidgetFactory get()
    {
        return new UserDataWidgetFactory((Context)context.get(), (LayoutInflater)inflater.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(inflater);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.add.UserDataWidgetFactory", "members/com.google.android.apps.wallet.wobs.add.UserDataWidgetFactory", false, com/google/android/apps/wallet/wobs/add/UserDataWidgetFactory);
    }
}
