// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            SetupHceOnBootTask

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding sharedPreferences;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/hce/setup/SetupHceOnBootTask, getClass().getClassLoader());
        sharedPreferences = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/hce/setup/SetupHceOnBootTask, getClass().getClassLoader());
    }

    public final SetupHceOnBootTask get()
    {
        return new SetupHceOnBootTask((Application)application.get(), (SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(sharedPreferences);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.setup.SetupHceOnBootTask", "members/com.google.android.apps.wallet.hce.setup.SetupHceOnBootTask", false, com/google/android/apps/wallet/hce/setup/SetupHceOnBootTask);
    }
}
