// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateAdapter

class <init> extends BackgroundTask
{

    final ConversationCreateAdapter this$0;

    public void onFinish()
    {
    }

    public void run()
    {
        if (ConversationCreateAdapter.access$100(ConversationCreateAdapter.this) == null)
        {
            ConversationCreateAdapter.access$102(ConversationCreateAdapter.this, ModelHelper.getRecentConversationUsers());
        }
        ConversationCreateAdapter.access$200(ConversationCreateAdapter.this, "", ConversationCreateAdapter.access$100(ConversationCreateAdapter.this));
    }

    private ()
    {
        this$0 = ConversationCreateAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
