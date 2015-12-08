// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.pinterest.activity.user.view.UserFollowedBoardsView;
import com.pinterest.activity.user.view.UserFollowedInterestsView;
import com.pinterest.activity.user.view.UserFollowedPinnersView;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.scrollview.ObservableScrollView;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

public class _cls3
{

    public static void inject(butterknife.edFragment edfragment, final UserFollowedFragment target, Object obj)
    {
        target._swipeVw = (SwipeRefreshLayout)edfragment._swipeVw(obj, 0x7f0f0204, "field '_swipeVw'");
        target._scrollVw = (ObservableScrollView)edfragment.w(obj, 0x7f0f02e0, "field '_scrollVw'");
        target._emptyVw = (AdapterEmptyView)edfragment._emptyVw(obj, 0x7f0f02e1, "field '_emptyVw'");
        target._contentVw = (LinearLayout)edfragment._contentVw(obj, 0x7f0f02e2, "field '_contentVw'");
        target._userMetadataView = (UserMetadataView)edfragment.ew(obj, 0x7f0f02e3, "field '_userMetadataView'");
        target._followedBoards = (UserFollowedBoardsView)edfragment.ardsView(obj, 0x7f0f02e5, "field '_followedBoards'");
        target._followedInterests = (UserFollowedInterestsView)edfragment.terestsView(obj, 0x7f0f02e7, "field '_followedInterests'");
        target._followedPinners = (UserFollowedPinnersView)edfragment.nnersView(obj, 0x7f0f02e9, "field '_followedPinners'");
        View view = edfragment.nnersView(obj, 0x7f0f02e4, "field '_seeAllBoardsBt' and method 'onSeeAllBoardsClick'");
        target._seeAllBoardsBt = (Button)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final UserFollowedFragment val$target;

            public final void doClick(View view1)
            {
                target.onSeeAllBoardsClick();
            }

            _cls1()
            {
                target = userfollowedfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        view = edfragment.edFragment(obj, 0x7f0f02e6, "field '_seeAllInterestsBt' and method 'onSeeAllInterestsClick'");
        target._seeAllInterestsBt = (Button)view;
        class _cls2 extends DebouncingOnClickListener
        {

            final UserFollowedFragment val$target;

            public final void doClick(View view1)
            {
                target.onSeeAllInterestsClick();
            }

            _cls2()
            {
                target = userfollowedfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls2());
        edfragment = edfragment.edFragment(obj, 0x7f0f02e8, "field '_seeAllPinnersBt' and method 'onSeeAllPinnersClick'");
        target._seeAllPinnersBt = (Button)edfragment;
        class _cls3 extends DebouncingOnClickListener
        {

            final UserFollowedFragment val$target;

            public final void doClick(View view1)
            {
                target.onSeeAllPinnersClick();
            }

            _cls3()
            {
                target = userfollowedfragment;
                super();
            }
        }

        edfragment.setOnClickListener(new _cls3());
    }

    public static void reset(UserFollowedFragment userfollowedfragment)
    {
        userfollowedfragment._swipeVw = null;
        userfollowedfragment._scrollVw = null;
        userfollowedfragment._emptyVw = null;
        userfollowedfragment._contentVw = null;
        userfollowedfragment._userMetadataView = null;
        userfollowedfragment._followedBoards = null;
        userfollowedfragment._followedInterests = null;
        userfollowedfragment._followedPinners = null;
        userfollowedfragment._seeAllBoardsBt = null;
        userfollowedfragment._seeAllInterestsBt = null;
        userfollowedfragment._seeAllPinnersBt = null;
    }

    public _cls3()
    {
    }
}
