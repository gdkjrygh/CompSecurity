// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.UserBaseFragment;
import com.pinterest.activity.user.UserBoardsFragment;
import com.pinterest.activity.user.fragment.UserAboutFragment;
import com.pinterest.activity.user.fragment.UserFollowedFragment;
import com.pinterest.activity.user.fragment.UserFollowersFragment;
import com.pinterest.activity.user.fragment.UserLikesFragment;
import com.pinterest.activity.user.fragment.UserPinsFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;

public class UserViewAdapter extends FixedFragmentStatePagerAdapter
{

    private static final int ABOUT_INDEX = 3;
    private static final int BOARDS_INDEX = 1;
    private static final int COUNT = 6;
    private static final int FOLLOWERS_INDEX = 5;
    private static final int FOLLOWING_INDEX = 4;
    private static final int LIKES_INDEX = 2;
    private static final int PINS_INDEX = 0;
    private ChildListener _listener;
    private User _user;

    public UserViewAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        return 6;
    }

    public Fragment getItem(int i)
    {
        Object obj;
        boolean flag;
        if (!MyUser.isUserMe(_user))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 62
    //                   1 134
    //                   2 169
    //                   3 184
    //                   4 199
    //                   5 214;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L1:
        obj = null;
_L9:
        return ((Fragment) (obj));
_L2:
        final Object fragment;
        if (flag)
        {
            fragment = new UserBoardsFragment();
            obj = Location.USER_BOARDS;
        } else
        {
            fragment = new UserPinsFragment();
            obj = Location.USER_PINS;
        }
_L10:
        ((BaseFragment) (fragment)).setNavigation(new Navigation(((Location) (obj)), _user));
        obj = fragment;
        if (_listener == null) goto _L9; else goto _L8
_L8:
        ((BaseFragment) (fragment)).setScrollListener(new _cls1());
        return ((Fragment) (fragment));
_L3:
        if (flag)
        {
            fragment = new UserPinsFragment();
            obj = Location.USER_PINS;
        } else
        {
            fragment = new UserBoardsFragment();
            obj = Location.USER_BOARDS;
        }
          goto _L10
_L4:
        fragment = new UserLikesFragment();
        obj = Location.USER_LIKES;
          goto _L10
_L5:
        fragment = new UserAboutFragment();
        obj = Location.USER_ABOUT;
          goto _L10
_L6:
        fragment = new UserFollowedFragment();
        obj = Location.USER_FOLLOWED_PINNERS;
          goto _L10
        fragment = new UserFollowersFragment();
        obj = Location.USER_FOLLOWERS;
          goto _L10
    }

    public int getItemPosition(Object obj)
    {
        return (obj instanceof UserBaseFragment) && _user != null && !_user.equals(((UserBaseFragment)obj).getUser()) ? -2 : -1;
    }

    public void setChildListener(ChildListener childlistener)
    {
        _listener = childlistener;
    }

    public void setUser(User user)
    {
        boolean flag;
        if (user != null && !user.equals(_user))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _user = user;
        if (flag)
        {
            notifyDataSetChanged();
        }
    }


    private class _cls1 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final UserViewAdapter this$0;
        final BaseFragment val$fragment;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (fragment.isActive())
            {
                _listener.onChildScrolled(j);
            }
        }

        _cls1()
        {
            this$0 = UserViewAdapter.this;
            fragment = basefragment;
            super();
        }

        private class ChildListener
        {

            public abstract void onChildScrolled(int i);

            public ChildListener()
            {
            }
        }

    }

}
