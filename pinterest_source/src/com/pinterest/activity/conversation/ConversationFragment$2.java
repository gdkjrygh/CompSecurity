// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.widget.ListView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Conversation;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0 extends ApiResponseHandler
{

    final ConversationFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        if (apiresponse == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        apiresponse.a("unread", Integer.valueOf(0));
        ConversationFragment.access$302(ConversationFragment.this, Conversation.make(apiresponse));
        class _cls1
            implements Runnable
        {

            final ConversationFragment._cls2 this$1;

            public void run()
            {
                ConversationFragment.access$400(this$0);
            }

            _cls1()
            {
                this$1 = ConversationFragment._cls2.this;
                super();
            }
        }

        ConversationFragment.access$500(ConversationFragment.this).post(new _cls1());
        return;
        apiresponse;
        CrashReporting.a(apiresponse);
        return;
    }

    _cls1()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
