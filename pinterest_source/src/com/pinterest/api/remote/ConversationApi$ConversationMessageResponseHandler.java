// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

public class _conversationId extends ApiResponseHandler
{

    private final String _conversationId;

    public void onSuccess(ConversationMessagesFeed conversationmessagesfeed)
    {
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final ConversationApi.ConversationMessageResponseHandler b;
            private ConversationMessagesFeed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = new ConversationMessagesFeed(b._conversationId, a, b.getBaseUrl());
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = ConversationApi.ConversationMessageResponseHandler.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }


    public _cls1(String s)
    {
        _conversationId = s;
    }
}
