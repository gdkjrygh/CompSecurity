// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.fragment.PinGridFragment;

public class LibraryLikesFragment extends PinGridFragment
{

    private String _title;
    private User _user;

    public LibraryLikesFragment()
    {
        _layoutId = 0x7f030135;
    }

    protected void loadData()
    {
        if (ModelHelper.isValid(_user.getUid()))
        {
            UserApi.g(_user.getUid(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
        }
        super.loadData();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        if (!TextUtils.isEmpty(_title))
        {
            _actionBar.setTitle(_title);
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
            _title = (String)navigation.getExtra("com.pinterest.EXTRA_TITLE");
            return;
        }
    }
}
