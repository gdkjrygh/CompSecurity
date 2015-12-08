// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Conversation;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment

class this._cls0 extends ApiResponseHandler
{

    final ConversationCreateFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = ((ApiResponse) (apiresponse.getData()));
        if (apiresponse instanceof PinterestJsonObject)
        {
            apiresponse = Conversation.make((PinterestJsonObject)apiresponse);
            if (apiresponse != null)
            {
                Events.post(new com.pinterest.activity.task.model._cls8(getNavigation()));
                Events.post(new Navigation(Location.CONVERSATION, apiresponse.getUid()));
            }
        }
    }

    (boolean flag)
    {
        this$0 = ConversationCreateFragment.this;
        super(flag);
    }
}
