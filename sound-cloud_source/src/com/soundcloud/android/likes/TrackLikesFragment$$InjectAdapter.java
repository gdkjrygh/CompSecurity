// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesFragment, TrackLikesPresenter, LikesMenuPresenter

public final class  extends b
    implements a, Provider
{

    private b likesMenuPresenter;
    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.likes.TrackLikesPresenter", com/soundcloud/android/likes/TrackLikesFragment, getClass().getClassLoader());
        likesMenuPresenter = l1.a("com.soundcloud.android.likes.LikesMenuPresenter", com/soundcloud/android/likes/TrackLikesFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/likes/TrackLikesFragment, getClass().getClassLoader(), false);
    }

    public final TrackLikesFragment get()
    {
        TrackLikesFragment tracklikesfragment = new TrackLikesFragment();
        injectMembers(tracklikesfragment);
        return tracklikesfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(likesMenuPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(TrackLikesFragment tracklikesfragment)
    {
        tracklikesfragment.presenter = (TrackLikesPresenter)presenter.get();
        tracklikesfragment.likesMenuPresenter = (LikesMenuPresenter)likesMenuPresenter.get();
        supertype.injectMembers(tracklikesfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackLikesFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.likes.TrackLikesFragment", "members/com.soundcloud.android.likes.TrackLikesFragment", false, com/soundcloud/android/likes/TrackLikesFragment);
    }
}
