// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.ListView;
import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0 extends ApiResponseHandler
{

    final ConversationFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Application.showToast(throwable.getMessage());
        class _cls2
            implements Runnable
        {

            final ConversationFragment._cls5 this$1;

            public void run()
            {
                ConversationFragment.access$102(this$0, false);
            }

            _cls2()
            {
                this$1 = ConversationFragment._cls5.this;
                super();
            }
        }

        ConversationFragment.access$500(ConversationFragment.this).post(new _cls2());
    }

    public void onSuccess(final PinterestJsonObject moreItems)
    {
        moreItems = new ConversationMessagesFeed(ConversationFragment.access$600(ConversationFragment.this), moreItems, getBaseUrl());
        class _cls1
            implements Runnable
        {

            final ConversationFragment._cls5 this$1;
            final ConversationMessagesFeed val$moreItems;

            public void run()
            {
                ConversationFragment.access$000(this$0).setShowSpinner(false);
                ConversationFragment.access$000(this$0).appendFeed(moreItems);
                ConversationFragment.access$102(this$0, false);
                int i = ConversationFragment.access$500(this$0).getFirstVisiblePosition();
                int j = moreItems.getCount();
                ConversationFragment.access$500(this$0).setSelection(i + j);
            }

            _cls1()
            {
                this$1 = ConversationFragment._cls5.this;
                moreItems = conversationmessagesfeed;
                super();
            }
        }

        ConversationFragment.access$500(ConversationFragment.this).post(new _cls1());
    }

    _cls1()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
