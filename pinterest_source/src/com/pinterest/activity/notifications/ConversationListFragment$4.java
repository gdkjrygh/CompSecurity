// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.activity.notifications.adapter.ConversationListAdapter;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.megaphone.NagUtils;

// Referenced classes of package com.pinterest.activity.notifications:
//            ConversationListFragment

class this._cls0 extends BackgroundTask
{

    public ConversationFeed _feed;
    final ConversationListFragment this$0;

    public void onFinish()
    {
        if (_feed != null && _feed.getCount() > 0)
        {
            ((ConversationListAdapter)ConversationListFragment.access$300(ConversationListFragment.this)).setDataSource(_feed);
            AdapterEmptyView.setState(ConversationListFragment.access$400(ConversationListFragment.this), 2);
            if (isActive() && !isNagShown())
            {
                NagUtils.showNag(getPlacementId(), new gEvent(null), 0x7f060001);
            }
            return;
        } else
        {
            updateEmptyContent();
            return;
        }
    }

    public void run()
    {
        _feed = new ConversationFeed(ModelHelper.getRecentConversations());
    }

    gEvent()
    {
        this$0 = ConversationListFragment.this;
        super();
    }
}
