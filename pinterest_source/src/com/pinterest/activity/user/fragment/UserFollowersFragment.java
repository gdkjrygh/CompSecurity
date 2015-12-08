// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.UserBaseFragment;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Constants;
import com.pinterest.fragment.PeopleListFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actions.SynchronizedPagerChild;

public class UserFollowersFragment extends PeopleListFragment
    implements UserBaseFragment, SynchronizedPagerChild
{

    protected SwipeRefreshLayout _swipeVw;
    private User _user;
    protected UserMetadataView _userEmptyMetadataView;
    protected UserMetadataView _userMetadataView;
    private com.pinterest.api.remote.UserApi.UserFeedApiResponse followersHandler;

    public UserFollowersFragment()
    {
        followersHandler = new _cls2();
    }

    public void adjustScroll(int i)
    {
        scrollTo(0, i);
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
            UserApi.b(s, followersHandler, getApiTag());
        }
        super.loadData();
    }

    protected void onActivate()
    {
        super.onActivate();
        loadData();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03011e;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _userMetadataView = new UserMetadataView(view.getContext());
        _userMetadataView.setUser(_user);
        _userMetadataView.setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode.FOLLOWERS);
        _userMetadataView.setPadding(0, 0, 0, Constants.MARGIN);
        _userEmptyMetadataView.setUser(_user);
        _userEmptyMetadataView.setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode.FOLLOWERS);
        _userEmptyMetadataView.setPadding(0, 0, 0, Constants.MARGIN);
        _listView.addHeaderView(_userMetadataView, null, false);
        if (_swipeVw != null)
        {
            _swipeVw.setColorSchemeResources(new int[] {
                0x7f0e009c
            });
            int i = (int)Resources.dimension(0x7f0a01f6) + Constants.MARGIN;
            int j = Constants.SWIPE_OFFSET_LENGTH;
            _swipeVw.setProgressViewOffset(false, i - j, i);
            _swipeVw.setOnRefreshListener(new _cls1());
        }
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
        _emptyLeftImage = 0x7f02020c;
        _emptyCenterImage = 0x7f02020d;
        _emptyRightImage = 0x7f02020e;
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
            _emptyMessage = Resources.string(0x7f070260);
            return;
        }
        if (_user != null && !TextUtils.isEmpty(_user.getFirstName()))
        {
            _emptyMessage = Resources.string(0x7f07024d, new Object[] {
                _user.getFirstName()
            });
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f07024e);
            return;
        }
    }



    private class _cls2 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final UserFollowersFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onFinish()
        {
            super.onFinish();
            if (_swipeVw != null)
            {
                _swipeVw.setRefreshing(false);
            }
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls2()
        {
            this$0 = UserFollowersFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    {

        final UserFollowersFragment this$0;

        public void onRefresh()
        {
            if ()
            {
                return;
            } else
            {
                _swipeVw.setRefreshing(true);
                Pinalytics.a(EventType.PULL_TO_REFRESH, null);
                refresh();
                return;
            }
        }

        _cls1()
        {
            this$0 = UserFollowersFragment.this;
            super();
        }
    }

}
