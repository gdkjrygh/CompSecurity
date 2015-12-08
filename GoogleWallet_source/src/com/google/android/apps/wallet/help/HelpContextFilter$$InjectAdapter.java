// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.help:
//            HelpContextFilter, HelpContextProvider

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding helpContextProvider;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/help/HelpContextFilter, getClass().getClassLoader());
        helpContextProvider = linker.requestBinding("com.google.android.apps.wallet.help.HelpContextProvider", com/google/android/apps/wallet/help/HelpContextFilter, getClass().getClassLoader());
    }

    public final HelpContextFilter get()
    {
        return new HelpContextFilter((Activity)activity.get(), (HelpContextProvider)helpContextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(helpContextProvider);
    }

    public ()
    {
        super("com.google.android.apps.wallet.help.HelpContextFilter", "members/com.google.android.apps.wallet.help.HelpContextFilter", false, com/google/android/apps/wallet/help/HelpContextFilter);
    }
}
