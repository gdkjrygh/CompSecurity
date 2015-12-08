// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.fragment:
//            PeopleListFragment

class Response extends com.pinterest.api.remote.sponse
{

    final PeopleListFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        onLoadFailed(throwable, apiresponse);
    }

    public void onFinish()
    {
        AdapterFooterView.setState(PeopleListFragment.access$200(PeopleListFragment.this), 1);
        if (PeopleListFragment.access$300(PeopleListFragment.this) != null)
        {
            ((PeopleListAdapter)PeopleListFragment.access$400(PeopleListFragment.this)).finishedLoading();
        }
    }

    public void onStart()
    {
        AdapterFooterView.setState(PeopleListFragment.access$100(PeopleListFragment.this), 0);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        onPeopleLoaded((UserFeed)feed);
    }

    Response()
    {
        this$0 = PeopleListFragment.this;
        super();
    }
}
