// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.ListView;
import com.pinterest.activity.conversation.model.ConversationMessagesFeed;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class sFeed
    implements Runnable
{

    final is._cls0 this$1;
    final ConversationMessagesFeed val$moreItems;

    public void run()
    {
        ConversationFragment.access$000(_fld0).setShowSpinner(false);
        ConversationFragment.access$000(_fld0).appendFeed(val$moreItems);
        ConversationFragment.access$102(_fld0, false);
        int i = ConversationFragment.access$500(_fld0).getFirstVisiblePosition();
        int j = val$moreItems.getCount();
        ConversationFragment.access$500(_fld0).setSelection(i + j);
    }

    sFeed()
    {
        this$1 = final_sfeed;
        val$moreItems = ConversationMessagesFeed.this;
        super();
    }
}
