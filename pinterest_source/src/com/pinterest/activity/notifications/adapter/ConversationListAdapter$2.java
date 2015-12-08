// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import com.pinterest.api.model.ConversationFeed;

// Referenced classes of package com.pinterest.activity.notifications.adapter:
//            ConversationListAdapter

class val.dataSource
    implements Runnable
{

    final ConversationListAdapter this$0;
    final ConversationFeed val$dataSource;

    public void run()
    {
        ConversationListAdapter.access$002(ConversationListAdapter.this, val$dataSource);
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_conversationlistadapter;
        val$dataSource = ConversationFeed.this;
        super();
    }
}
