// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import com.pinterest.activity.user.fragment.UserFollowersFragment;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.base.Constants;
import com.pinterest.ui.actionbar.ActionBar;

public class LibraryFollowersFragment extends UserFollowersFragment
{

    public LibraryFollowersFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300dc;
        _menuId = -1;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_actionBarWrapper != null)
        {
            _actionBarWrapper.setShadowVisibility(8);
        }
        _actionBar.setTitle(0x7f0702b8);
        if (_swipeVw != null)
        {
            _swipeVw.setBackgroundColor(getResources().getColor(0x7f0e00bf));
            _swipeVw.setProgressViewOffset(false, 0, Constants.SWIPE_OFFSET_LENGTH);
        }
        if (_userMetadataView != null)
        {
            _userMetadataView.setVisibility(8);
            _listView.removeHeaderView(_userMetadataView);
            _userEmptyMetadataView.setVisibility(8);
        }
    }
}
