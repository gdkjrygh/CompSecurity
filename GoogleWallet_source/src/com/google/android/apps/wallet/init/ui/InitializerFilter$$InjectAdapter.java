// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init.ui;

import android.app.Activity;
import com.google.android.apps.wallet.init.InitializerTaskManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init.ui:
//            InitializerFilter

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding initializerTaskManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/init/ui/InitializerFilter, getClass().getClassLoader());
        initializerTaskManager = linker.requestBinding("com.google.android.apps.wallet.init.InitializerTaskManager", com/google/android/apps/wallet/init/ui/InitializerFilter, getClass().getClassLoader());
    }

    public final InitializerFilter get()
    {
        return new InitializerFilter((Activity)activity.get(), (InitializerTaskManager)initializerTaskManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(initializerTaskManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.init.ui.InitializerFilter", "members/com.google.android.apps.wallet.init.ui.InitializerFilter", false, com/google/android/apps/wallet/init/ui/InitializerFilter);
    }
}
