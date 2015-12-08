// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.adapters.UserRecyclerItemAdapter;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            UserFollowersPresenter, UserProfileOperations

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b imagePauseOnScrollListener;
    private b navigator;
    private b profileOperations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        imagePauseOnScrollListener = l1.a("com.soundcloud.android.image.ImagePauseOnScrollListener", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader());
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader());
        profileOperations = l1.a("com.soundcloud.android.profile.UserProfileOperations", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.view.adapters.UserRecyclerItemAdapter", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/profile/UserFollowersPresenter, getClass().getClassLoader(), false);
    }

    public final UserFollowersPresenter get()
    {
        UserFollowersPresenter userfollowerspresenter = new UserFollowersPresenter((ImagePauseOnScrollListener)imagePauseOnScrollListener.get(), (SwipeRefreshAttacher)swipeRefreshAttacher.get(), (UserProfileOperations)profileOperations.get(), (UserRecyclerItemAdapter)adapter.get(), (Navigator)navigator.get());
        injectMembers(userfollowerspresenter);
        return userfollowerspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imagePauseOnScrollListener);
        set.add(swipeRefreshAttacher);
        set.add(profileOperations);
        set.add(adapter);
        set.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(UserFollowersPresenter userfollowerspresenter)
    {
        supertype.injectMembers(userfollowerspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UserFollowersPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.UserFollowersPresenter", "members/com.soundcloud.android.profile.UserFollowersPresenter", false, com/soundcloud/android/profile/UserFollowersPresenter);
    }
}
