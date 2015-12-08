// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Story;
import com.pinterest.api.remote.NetworkStoryApi;
import com.pinterest.fragment.PinGridFragment;

public class StoryPinsFragment extends PinGridFragment
{

    private Story _story;

    public StoryPinsFragment()
    {
        _layoutId = 0x7f03010f;
        _menuId = 0x7f10000a;
    }

    protected void loadData()
    {
        NetworkStoryApi.a(_navigation.getId(), 0, new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
        super.loadData();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_story != null)
        {
            _actionBar.setTitle(_story.getRelatedHeader());
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _story = (Story)navigation.getCachedModel();
    }
}
