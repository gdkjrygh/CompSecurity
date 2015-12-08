// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreActivity, ExplorePresenter

public final class  extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b baseLayoutHelper;
    private b explorePresenter;
    private b navigator;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader());
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader());
        explorePresenter = l1.a("com.soundcloud.android.explore.ExplorePresenter", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/explore/ExploreActivity, getClass().getClassLoader(), false);
    }

    public final ExploreActivity get()
    {
        ExploreActivity exploreactivity = new ExploreActivity();
        injectMembers(exploreactivity);
        return exploreactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(actionBarHelper);
        set1.add(explorePresenter);
        set1.add(baseLayoutHelper);
        set1.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(ExploreActivity exploreactivity)
    {
        exploreactivity.playerController = (PlayerController)playerController.get();
        exploreactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        exploreactivity.explorePresenter = (ExplorePresenter)explorePresenter.get();
        exploreactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        exploreactivity.navigator = (Navigator)navigator.get();
        supertype.injectMembers(exploreactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.explore.ExploreActivity", "members/com.soundcloud.android.explore.ExploreActivity", false, com/soundcloud/android/explore/ExploreActivity);
    }
}
