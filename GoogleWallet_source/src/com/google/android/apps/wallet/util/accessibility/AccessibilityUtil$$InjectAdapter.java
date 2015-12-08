// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.accessibility;

import android.app.Application;
import android.view.accessibility.AccessibilityManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.accessibility:
//            AccessibilityUtil

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding manager;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/util/accessibility/AccessibilityUtil, getClass().getClassLoader());
        manager = linker.requestBinding("android.view.accessibility.AccessibilityManager", com/google/android/apps/wallet/util/accessibility/AccessibilityUtil, getClass().getClassLoader());
    }

    public final AccessibilityUtil get()
    {
        return new AccessibilityUtil((Application)application.get(), (AccessibilityManager)manager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(manager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.accessibility.AccessibilityUtil", "members/com.google.android.apps.wallet.util.accessibility.AccessibilityUtil", false, com/google/android/apps/wallet/util/accessibility/AccessibilityUtil);
    }
}
