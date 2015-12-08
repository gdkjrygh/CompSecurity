// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.fragment:
//            PinGridFragment

public class StaticPinGridFragment extends PinGridFragment
{

    private Feed feed;
    private String title;

    public StaticPinGridFragment()
    {
        _layoutId = 0x7f0300be;
    }

    protected void loadData()
    {
        if (feed != null)
        {
            gridResponseHandler.onSuccess(feed);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(title);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        feed = (Feed)navigation.getExtra("com.pinterest.EXTRA_FEED");
        title = (String)navigation.getExtra("com.pinterest.EXTRA_TITLE");
    }
}
