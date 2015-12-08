// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ProfileScrollHelper;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileScreen, UserDetailsFragment, MyPostsFragment, UserPostsFragment, 
//            MyPlaylistsFragment, UserPlaylistsFragment, MyLikesFragment, UserLikesFragment, 
//            MyFollowingsFragment, UserFollowingsFragment, UserFollowersFragment

class ProfilePagerAdapter extends FragmentPagerAdapter
{

    public static final int FRAGMENT_COUNT = 6;
    protected static final int TAB_FOLLOWERS = 5;
    protected static final int TAB_FOLLOWINGS = 4;
    protected static final int TAB_INFO = 0;
    protected static final int TAB_LIKES = 3;
    protected static final int TAB_PLAYLISTS = 2;
    protected static final int TAB_POSTS = 1;
    private final ProfileScrollHelper activtyScrollHelper;
    private final boolean isLoggedInUser;
    private final Resources resources;
    private final SearchQuerySourceInfo searchQuerySourceInfo;
    private final Urn userUrn;

    ProfilePagerAdapter(FragmentActivity fragmentactivity, Urn urn, boolean flag, ProfileScrollHelper profilescrollhelper, SearchQuerySourceInfo searchquerysourceinfo)
    {
        super(fragmentactivity.getSupportFragmentManager());
        activtyScrollHelper = profilescrollhelper;
        isLoggedInUser = flag;
        searchQuerySourceInfo = searchquerysourceinfo;
        resources = fragmentactivity.getResources();
        userUrn = urn;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (obj instanceof ProfileScreen)
        {
            activtyScrollHelper.removeProfileScreen((ProfileScreen)obj);
        }
        super.destroyItem(viewgroup, i, obj);
    }

    public int getCount()
    {
        return 6;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for ")).append(i).toString());

        case 0: // '\0'
            return UserDetailsFragment.create(userUrn);

        case 1: // '\001'
            if (isLoggedInUser)
            {
                return MyPostsFragment.create(Screen.YOUR_POSTS, searchQuerySourceInfo);
            } else
            {
                return UserPostsFragment.create(userUrn, Screen.USER_POSTS, searchQuerySourceInfo);
            }

        case 2: // '\002'
            if (isLoggedInUser)
            {
                return MyPlaylistsFragment.create(Screen.YOUR_PLAYLISTS, searchQuerySourceInfo);
            } else
            {
                return UserPlaylistsFragment.create(userUrn, Screen.USER_PLAYLISTS, searchQuerySourceInfo);
            }

        case 3: // '\003'
            if (isLoggedInUser)
            {
                return MyLikesFragment.create(Screen.YOUR_LIKES, searchQuerySourceInfo);
            } else
            {
                return UserLikesFragment.create(userUrn, Screen.USER_LIKES, searchQuerySourceInfo);
            }

        case 4: // '\004'
            if (isLoggedInUser)
            {
                return MyFollowingsFragment.create(Screen.YOUR_FOLLOWINGS, searchQuerySourceInfo);
            } else
            {
                return UserFollowingsFragment.create(userUrn, Screen.USER_FOLLOWINGS, searchQuerySourceInfo);
            }

        case 5: // '\005'
            return UserFollowersFragment.create(userUrn, Screen.USER_FOLLOWERS, searchQuerySourceInfo);
        }
    }

    public CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getPageTitle ")).append(i).toString());

        case 0: // '\0'
            return resources.getString(0x7f0701f8);

        case 1: // '\001'
            return resources.getString(0x7f0701fb);

        case 2: // '\002'
            return resources.getString(0x7f0701fa);

        case 3: // '\003'
            return resources.getString(0x7f0701f9);

        case 4: // '\004'
            return resources.getString(0x7f0701f7);

        case 5: // '\005'
            return resources.getString(0x7f0701f6);
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = (Fragment)super.instantiateItem(viewgroup, i);
        if (viewgroup instanceof ProfileScreen)
        {
            activtyScrollHelper.addProfileCollection((ProfileScreen)viewgroup);
        }
        return viewgroup;
    }
}
