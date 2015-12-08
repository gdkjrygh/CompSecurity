// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.ListView;
import com.pinterest.activity.conversation.model.ConversationMessagesFeed;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class eResponseHandler extends com.pinterest.api.remote.ationMessageResponseHandler
{

    final ConversationFragment this$0;

    public void onSuccess(ConversationMessagesFeed conversationmessagesfeed)
    {
        super.onSuccess(conversationmessagesfeed);
        int i = ConversationFragment.access$500(ConversationFragment.this).getLastVisiblePosition();
        int j = ConversationFragment.access$000(ConversationFragment.this).getCount();
        ConversationFragment.access$000(ConversationFragment.this).mergeFeed(conversationmessagesfeed);
        if (i == j - 1)
        {
            ConversationFragment.access$500(ConversationFragment.this).setSelection(ConversationFragment.access$000(ConversationFragment.this).getCount() - 1);
        }
    }

    gesFeed(String s)
    {
        this$0 = ConversationFragment.this;
        super(s);
    }
}
