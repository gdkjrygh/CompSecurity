// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.UserBaseFragment;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Constants;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actions.SynchronizedPagerChild;
import com.pinterest.ui.grid.PinterestGridView;

public class UserLikesFragment extends PinGridFragment
    implements UserBaseFragment, SynchronizedPagerChild
{

    private User _user;
    private UserMetadataView _userMetadataView;

    public UserLikesFragment()
    {
        _swipeOffsetEnd = (int)Resources.dimension(0x7f0a01f6) + Constants.MARGIN;
        _swipeOffsetStart = _swipeOffsetEnd - Constants.SWIPE_OFFSET_LENGTH;
    }

    public void adjustScroll(int i)
    {
        scrollTo(0, i, true);
    }

    public User getUser()
    {
        return _user;
    }

    protected void loadData()
    {
        String s = getNavigation().getId();
        if (ModelHelper.isValid(s))
        {
            UserApi.g(s, new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
        }
        super.loadData();
    }

    protected void onDataSourceChanged(boolean flag)
    {
        if (!flag && MyUser.isUserMe(_navigation.getId()))
        {
            com.pinterest.api.model.Feed feed = ((PinGridAdapter)_adapter).getDataSource();
            if (feed instanceof PinFeed)
            {
                ((PinFeed)feed).setOnlyLikedByMe(true);
            }
        }
    }

    public void onDestroyView()
    {
        _userMetadataView = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _userMetadataView = new UserMetadataView(view.getContext());
        _userMetadataView.setUser(_user);
        _userMetadataView.setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode.LIKES);
        _gridVw.addHeaderView(_userMetadataView, -1, -2);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _user = navigation.getModelAsUser();
            return;
        }
    }

    protected void updateEmptyContent()
    {
        _emptyCenterImage = 0x7f020217;
        _emptyLeftImage = 0x7f02020f;
        _emptyRightImage = 0x7f020212;
        String s;
        if (_navigation == null)
        {
            s = "";
        } else
        {
            s = _navigation.getId();
        }
        if (MyUser.isUserMe(s))
        {
            _emptyMessage = Resources.string(0x7f070264);
            return;
        }
        if (_user != null && !TextUtils.isEmpty(_user.getFirstName()))
        {
            _emptyMessage = Resources.string(0x7f070255, new Object[] {
                _user.getFirstName()
            });
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f070256);
            return;
        }
    }
}
