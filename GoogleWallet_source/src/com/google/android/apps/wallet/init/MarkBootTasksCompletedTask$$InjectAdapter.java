// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            MarkBootTasksCompletedTask

public final class  extends Binding
    implements Provider
{

    private Binding globalPrefs;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/init/MarkBootTasksCompletedTask, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/init/MarkBootTasksCompletedTask, getClass().getClassLoader());
    }

    public final MarkBootTasksCompletedTask get()
    {
        return new MarkBootTasksCompletedTask((SharedPreferences)globalPrefs.get(), (SharedPreferences)userPrefs.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(globalPrefs);
        set.add(userPrefs);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.MarkBootTasksCompletedTask", "members/com.google.android.apps.wallet.init.MarkBootTasksCompletedTask", false, com/google/android/apps/wallet/init/MarkBootTasksCompletedTask);
    }
}
