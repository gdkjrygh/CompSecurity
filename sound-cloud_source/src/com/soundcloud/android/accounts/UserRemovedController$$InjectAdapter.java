// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.accounts:
//            UserRemovedController

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/accounts/UserRemovedController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/accounts/UserRemovedController, getClass().getClassLoader(), false);
    }

    public final UserRemovedController get()
    {
        UserRemovedController userremovedcontroller = new UserRemovedController((EventBus)eventBus.get());
        injectMembers(userremovedcontroller);
        return userremovedcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(UserRemovedController userremovedcontroller)
    {
        supertype.injectMembers(userremovedcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserRemovedController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.accounts.UserRemovedController", "members/com.soundcloud.android.accounts.UserRemovedController", false, com/soundcloud/android/accounts/UserRemovedController);
    }
}
