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
import com.pinterest.ui.megaphone.NagUtils;

// Referenced classes of package com.pinterest.activity.notifications:
//            ConversationListFragment

class this._cls0 extends ApiResponseHandler
{

    final ConversationListFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        ((ConversationListAdapter)ConversationListFragment.access$1300(ConversationListFragment.this)).finishedLoading();
        if (((ConversationListAdapter)ConversationListFragment.access$1400(ConversationListFragment.this)).isEmpty())
        {
            AdapterEmptyView.setState(ConversationListFragment.access$1500(ConversationListFragment.this), 1);
            ConversationListFragment.access$1700(ConversationListFragment.this, ConversationListFragment.access$1600(ConversationListFragment.this));
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Object obj;
        super.onSuccess(apiresponse);
        obj = apiresponse.getData();
        if (!(obj instanceof PinterestJsonArray)) goto _L2; else goto _L1
_L1:
        obj = new ConversationFeed((PinterestJsonArray)obj, getBaseUrl());
        ((ConversationFeed) (obj)).setBookmark(apiresponse.getBookmark());
        if (ConversationListFragment.access$500(ConversationListFragment.this) == null) goto _L2; else goto _L3
_L3:
        ((ConversationListAdapter)ConversationListFragment.access$600(ConversationListFragment.this)).setDataSource(((ConversationFeed) (obj)));
        if (!((ConversationListAdapter)ConversationListFragment.access$700(ConversationListFragment.this)).isEmpty()) goto _L5; else goto _L4
_L4:
        AdapterEmptyView.setState(ConversationListFragment.access$800(ConversationListFragment.this), 1);
_L2:
        ConversationListFragment.access$1100(ConversationListFragment.this, ConversationListFragment.access$1000(ConversationListFragment.this));
        AdapterFooterView.setState(ConversationListFragment.access$1200(ConversationListFragment.this), 1);
        return;
_L5:
        AdapterEmptyView.setState(ConversationListFragment.access$900(ConversationListFragment.this), 2);
        if (isActive() && !isNagShown())
        {
            NagUtils.showNag(getPlacementId(), new gEvent(null), 0x7f060001);
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    gEvent()
    {
        this$0 = ConversationListFragment.this;
        super();
    }
}
