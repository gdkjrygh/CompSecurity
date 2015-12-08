// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.conversation.model.ConversationMessagesFeed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class a extends BackgroundTask
{

    final PinterestJsonObject a;
    final tBaseUrl b;
    private ConversationMessagesFeed c;

    public void onFinish()
    {
        super.onFinish();
        b.Success(c);
    }

    public void run()
    {
        c = new ConversationMessagesFeed(cess._mth000(b), a, b.tBaseUrl());
    }

    ( , PinterestJsonObject pinterestjsonobject)
    {
        b = ;
        a = pinterestjsonobject;
        super();
    }
}
