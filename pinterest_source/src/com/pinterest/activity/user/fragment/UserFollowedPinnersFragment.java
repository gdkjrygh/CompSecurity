// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.fragment.PeopleListFragment;
import com.pinterest.kit.application.Resources;

public class UserFollowedPinnersFragment extends PeopleListFragment
{

    private User _user;

    public UserFollowedPinnersFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03011d;
        UserApi.a(_navigation.getId(), new _cls1(), getApiTag());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f0702b7);
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
        if (MyUser.isUserMe(_user))
        {
            _emptyMessage = Resources.string(0x7f070262);
        } else
        if (_user.getFullName() != null)
        {
            _emptyMessage = Resources.string(0x7f070250, new Object[] {
                _user.getFirstName()
            });
            return;
        }
    }


    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final UserFollowedPinnersFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls1()
        {
            this$0 = UserFollowedPinnersFragment.this;
            super();
        }
    }

}
