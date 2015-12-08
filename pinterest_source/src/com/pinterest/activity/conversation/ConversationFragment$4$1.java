// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class this._cls1 extends BackgroundTask
{

    private ConversationMessagesFeed _feed;
    final sFeed this$1;

    public void onFinish()
    {
        super.onFinish();
        ConversationFragment.access$000(_fld0).replaceFeed(_feed);
    }

    public void run()
    {
        int i = ConversationFragment.access$000(_fld0).getCount();
        _feed = new ConversationMessagesFeed(ModelHelper.getConversationMessages(ConversationFragment.access$600(_fld0), i));
    }

    sFeed()
    {
        this$1 = this._cls1.this;
        super();
    }
}
