// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.view.View;
import com.pinterest.api.model.Conversation;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            ConversationNotificationCell

class val.conversation
    implements android.view.versationNotificationCell._cls1
{

    final ConversationNotificationCell this$0;
    final Conversation val$conversation;

    public boolean onLongClick(View view)
    {
        ConversationNotificationCell.access$000(ConversationNotificationCell.this, val$conversation);
        return true;
    }

    ()
    {
        this$0 = final_conversationnotificationcell;
        val$conversation = Conversation.this;
        super();
    }
}
