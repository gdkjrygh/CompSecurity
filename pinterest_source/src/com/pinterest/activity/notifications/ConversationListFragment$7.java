// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.activity.notifications.adapter.ConversationListAdapter;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.megaphone.MegaphoneView;
import com.pinterest.ui.megaphone.NagUtils;

// Referenced classes of package com.pinterest.activity.notifications:
//            ConversationListFragment

class this._cls0
    implements com.pinterest.base.ionListFragment._cls7
{

    final ConversationListFragment this$0;

    public void onEventMainThread(gEvent gevent)
    {
        PLog.info("ConversationListFragment.NagEvent", new Object[0]);
        if (ConversationListFragment.access$3000(ConversationListFragment.this) == null)
        {
            ConversationListFragment.access$3102(ConversationListFragment.this, (MegaphoneView)ViewHelper.viewById(getActivity(), 0x7f03017d));
            ConversationListFragment.access$3300(ConversationListFragment.this).setListViewParent(ConversationListFragment.access$3200(ConversationListFragment.this));
        }
        NagUtils.showNagFromEvent(ConversationListFragment.this, ConversationListFragment.access$3400(ConversationListFragment.this), gevent);
    }

    public void onEventMainThread(com.pinterest.api.model.stFragment._cls7 _pcls7)
    {
        if (isActive() && _pcls7.onversation() != null)
        {
            ConversationFeed conversationfeed = ((ConversationListAdapter)ConversationListFragment.access$2600(ConversationListFragment.this)).getDataSource();
            conversationfeed.removeItem(_pcls7.onversation());
            ((ConversationListAdapter)ConversationListFragment.access$2700(ConversationListFragment.this)).setDataSource(conversationfeed);
            if (((ConversationListAdapter)ConversationListFragment.access$2800(ConversationListFragment.this)).isEmpty())
            {
                AdapterEmptyView.setState(ConversationListFragment.access$2900(ConversationListFragment.this), 1);
            }
        }
    }

    public void onEventMainThread(com.pinterest.api.model.stFragment._cls7 _pcls7)
    {
        if (isActive() && _pcls7.tConversation() != null)
        {
            ConversationListFragment.access$100(ConversationListFragment.this).execute();
        }
    }

    gEvent()
    {
        this$0 = ConversationListFragment.this;
        super();
    }
}
