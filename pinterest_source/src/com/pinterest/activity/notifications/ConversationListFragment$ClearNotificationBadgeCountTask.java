// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.notifications:
//            NotificationCount, ConversationListFragment

class <init> extends BackgroundTask
{

    final ConversationListFragment this$0;

    public void onFinish()
    {
        super.onFinish();
        NotificationCount.setUnseenConversationCount(0);
    }

    public void run()
    {
        ConversationApi.b(new ApiResponseHandler(), getApiTag());
    }

    private ()
    {
        this$0 = ConversationListFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
