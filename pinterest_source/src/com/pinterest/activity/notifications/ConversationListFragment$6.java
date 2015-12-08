// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.activity.notifications.adapter.ConversationListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.notifications:
//            ConversationListFragment

class this._cls0 extends ApiResponseHandler
{

    final ConversationListFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        ((ConversationListAdapter)ConversationListFragment.access$2400(ConversationListFragment.this)).finishedLoading();
        AdapterFooterView.setState(ConversationListFragment.access$2500(ConversationListFragment.this), 1);
    }

    public void onStart()
    {
        super.onStart();
        AdapterEmptyView.setState(ConversationListFragment.access$1800(ConversationListFragment.this), 2);
        AdapterFooterView.setState(ConversationListFragment.access$1900(ConversationListFragment.this), 0);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (apiresponse instanceof PinterestJsonArray)
        {
            apiresponse = new ConversationFeed((PinterestJsonArray)apiresponse, getBaseUrl());
            if (ConversationListFragment.access$2000(ConversationListFragment.this) != null)
            {
                ((ConversationListAdapter)ConversationListFragment.access$2100(ConversationListFragment.this)).getDataSource().appendItems(apiresponse);
                ((ConversationListAdapter)ConversationListFragment.access$2200(ConversationListFragment.this)).finishedLoading();
            }
            AdapterFooterView.setState(ConversationListFragment.access$2300(ConversationListFragment.this), 1);
        }
    }

    pter()
    {
        this$0 = ConversationListFragment.this;
        super();
    }
}
