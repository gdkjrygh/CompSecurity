// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.adapters.UserRecyclerItemAdapter;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            MyFollowingsPresenter, MyProfileOperations

public final class I extends b
    implements a, Provider
{

    private b adapter;
    private b followingOperations;
    private b imagePauseOnScrollListener;
    private b navigator;
    private b profileOperations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        imagePauseOnScrollListener = l1.a("com.soundcloud.android.image.ImagePauseOnScrollListener", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.view.adapters.UserRecyclerItemAdapter", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        profileOperations = l1.a("com.soundcloud.android.profile.MyProfileOperations", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        followingOperations = l1.a("com.soundcloud.android.associations.NextFollowingOperations", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/profile/MyFollowingsPresenter, getClass().getClassLoader(), false);
    }

    public final MyFollowingsPresenter get()
    {
        MyFollowingsPresenter myfollowingspresenter = new MyFollowingsPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (ImagePauseOnScrollListener)imagePauseOnScrollListener.get(), (UserRecyclerItemAdapter)adapter.get(), (MyProfileOperations)profileOperations.get(), (NextFollowingOperations)followingOperations.get(), (Navigator)navigator.get());
        injectMembers(myfollowingspresenter);
        return myfollowingspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(imagePauseOnScrollListener);
        set.add(adapter);
        set.add(profileOperations);
        set.add(followingOperations);
        set.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(MyFollowingsPresenter myfollowingspresenter)
    {
        supertype.injectMembers(myfollowingspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MyFollowingsPresenter)obj);
    }

    public I()
    {
        super("com.soundcloud.android.profile.MyFollowingsPresenter", "members/com.soundcloud.android.profile.MyFollowingsPresenter", false, com/soundcloud/android/profile/MyFollowingsPresenter);
    }
}
