// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            LauncherActivity

public final class A extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b supertype;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/main/LauncherActivity, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/LauncherActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.TrackedActivity", com/soundcloud/android/main/LauncherActivity, getClass().getClassLoader(), false);
    }

    public final LauncherActivity get()
    {
        LauncherActivity launcheractivity = new LauncherActivity();
        injectMembers(launcheractivity);
        return launcheractivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accountOperations);
        set1.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(LauncherActivity launcheractivity)
    {
        launcheractivity.accountOperations = (AccountOperations)accountOperations.get();
        launcheractivity.eventBus = (EventBus)eventBus.get();
        supertype.injectMembers(launcheractivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LauncherActivity)obj);
    }

    public A()
    {
        super("com.soundcloud.android.main.LauncherActivity", "members/com.soundcloud.android.main.LauncherActivity", false, com/soundcloud/android/main/LauncherActivity);
    }
}
