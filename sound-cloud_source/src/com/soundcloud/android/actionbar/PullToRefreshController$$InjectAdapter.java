// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.actionbar:
//            PullToRefreshController

public final class  extends b
    implements a, Provider
{

    private b supertype;
    private b wrapper;

    public final void attach(l l1)
    {
        wrapper = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/actionbar/PullToRefreshController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/actionbar/PullToRefreshController, getClass().getClassLoader(), false);
    }

    public final PullToRefreshController get()
    {
        PullToRefreshController pulltorefreshcontroller = new PullToRefreshController((SwipeRefreshAttacher)wrapper.get());
        injectMembers(pulltorefreshcontroller);
        return pulltorefreshcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(wrapper);
        set1.add(supertype);
    }

    public final void injectMembers(PullToRefreshController pulltorefreshcontroller)
    {
        supertype.injectMembers(pulltorefreshcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PullToRefreshController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.actionbar.PullToRefreshController", "members/com.soundcloud.android.actionbar.PullToRefreshController", false, com/soundcloud/android/actionbar/PullToRefreshController);
    }
}
