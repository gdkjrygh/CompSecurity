// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.util;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ConversationFeed;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.List;

// Referenced classes of package com.pinterest.activity.notifications.util:
//            RecentConversations

class this._cls0 extends ApiResponseHandler
{

    final RecentConversations this$0;

    public void onSuccess(final ApiResponse data)
    {
        super.onSuccess(data);
        data = ((ApiResponse) (data.getData()));
        if (data instanceof PinterestJsonArray)
        {
            ConversationFeed conversationfeed = new ConversationFeed((PinterestJsonArray)data, getBaseUrl());
            RecentConversations.access$000(RecentConversations.this).clear();
            RecentConversations.access$000(RecentConversations.this).addAll(conversationfeed.getItems());
            class _cls1 extends BackgroundTask
            {

                final RecentConversations._cls1 this$1;
                final Object val$data;

                public void run()
                {
                    DiskCache.setJsonArray("RECENT_CONVERSATIONS", (PinterestJsonArray)data);
                }

            _cls1()
            {
                this$1 = RecentConversations._cls1.this;
                data = obj;
                super();
            }
            }

            (new _cls1()).execute();
        }
    }

    _cls1()
    {
        this$0 = RecentConversations.this;
        super();
    }
}
