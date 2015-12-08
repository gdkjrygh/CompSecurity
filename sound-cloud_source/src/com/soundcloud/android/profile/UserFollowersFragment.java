// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import dagger.b;

// Referenced classes of package com.soundcloud.android.profile:
//            ScrollableProfileFragment, ProfileArguments, UserFollowersPresenter

public class UserFollowersFragment extends ScrollableProfileFragment
{

    public static final String IS_CURRENT_USER = "is_current_user";
    UserFollowersPresenter presenter;

    public UserFollowersFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static UserFollowersFragment create(Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        UserFollowersFragment userfollowersfragment = new UserFollowersFragment();
        userfollowersfragment.setArguments(ProfileArguments.from(urn, screen, searchquerysourceinfo));
        return userfollowersfragment;
    }

    public static Fragment createForCurrentUser(Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        UserFollowersFragment userfollowersfragment = new UserFollowersFragment();
        urn = ProfileArguments.from(urn, screen, searchquerysourceinfo);
        urn.putBoolean("is_current_user", true);
        userfollowersfragment.setArguments(urn);
        return userfollowersfragment;
    }

    public View[] getRefreshableViews()
    {
        return (new View[] {
            presenter.getRecyclerView(), presenter.getEmptyView()
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }
}
