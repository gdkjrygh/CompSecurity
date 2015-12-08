// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Conversation;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;

public class HideConversationTask extends BackgroundTask
{

    private Conversation _conversation;
    private String _conversationId;

    public HideConversationTask(Conversation conversation)
    {
        _conversation = conversation;
    }

    public HideConversationTask(String s)
    {
        _conversationId = s;
    }

    public void onFinish()
    {
        super.onFinish();
        Application.showToast(0x7f070497);
    }

    public void run()
    {
        if (_conversation == null)
        {
            _conversation = ModelHelper.getConversation(_conversationId);
        }
        if (_conversation != null)
        {
            ConversationApi.a(_conversation.getUid(), new ApiResponseHandler());
            ModelHelper.deleteConversation(_conversation);
            Events.post(new com.pinterest.api.model.Conversation.HideEvent(_conversation));
        }
    }
}
