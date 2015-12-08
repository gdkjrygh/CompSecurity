// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.fragment.BoardGridFragment;
import com.pinterest.kit.application.Resources;

public class UserFollowedBoardsFragment extends BoardGridFragment
{

    public UserFollowedBoardsFragment()
    {
        _layoutId = 0x7f03011c;
    }

    protected void loadData()
    {
        UserApi.b(_navigation.getId(), new com.pinterest.api.remote.BoardApi.BoardFeedApiResponse(gridResponseHandler), getApiTag());
        super.loadData();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f0702b5);
    }

    protected void updateEmptyContent()
    {
        User user = _navigation.getModelAsUser();
        _emptyLeftImage = 0x7f020208;
        _emptyCenterImage = 0x7f020207;
        _emptyRightImage = 0x7f020206;
        if (MyUser.isUserMe(user))
        {
            _emptyMessage = Resources.string(0x7f07025d);
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f07024a, new Object[] {
                user.getFirstName()
            });
            return;
        }
    }
}
