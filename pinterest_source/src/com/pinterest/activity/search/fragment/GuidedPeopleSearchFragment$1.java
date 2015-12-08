// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterEmptyView;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPeopleSearchFragment

class this._cls0 extends com.pinterest.api.remote.rchFragment._cls1
{

    final GuidedPeopleSearchFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.nFailure(throwable, apiresponse);
        GuidedPeopleSearchFragment.access$300(GuidedPeopleSearchFragment.this, throwable, apiresponse);
    }

    public void onFinish()
    {
        ((PeopleListAdapter)GuidedPeopleSearchFragment.access$200(GuidedPeopleSearchFragment.this)).finishedLoading();
    }

    public void onStart()
    {
        GuidedPeopleSearchFragment.access$000(GuidedPeopleSearchFragment.this);
        AdapterEmptyView.setState(GuidedPeopleSearchFragment.access$100(GuidedPeopleSearchFragment.this), 0);
        ViewHelper.setVisibility(_nagView, 8);
        ViewHelper.setVisibility(_nagVwEmpty, 8);
    }

    public void onSuccess(Feed feed)
    {
        super.nSuccess(feed);
        HashMap hashmap = new HashMap();
        hashmap.put("query", GuidedPeopleSearchFragment.access$400(GuidedPeopleSearchFragment.this));
        Pinalytics.a(EventType.SEARCH_USERS, null, hashmap);
        onPeopleLoaded((UserFeed)feed);
    }

    I()
    {
        this$0 = GuidedPeopleSearchFragment.this;
        super();
    }
}
