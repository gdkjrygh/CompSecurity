// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ConversationMessage;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment, ConversationAdapter

class this._cls0 extends ApiResponseHandler
{

    final ConversationFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (apiresponse instanceof PinterestJsonObject)
        {
            apiresponse = ConversationMessage.make(ConversationFragment.access$600(ConversationFragment.this), (PinterestJsonObject)apiresponse, true);
            Pinalytics.a(EventType.CONVERSATION_MESSAGE_SEND, apiresponse.getMessage().getUid());
            ConversationFragment.access$000(ConversationFragment.this).addMessage(apiresponse.getMessage());
            ConversationFragment.access$900(ConversationFragment.this);
        }
    }

    sageArtifact()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
