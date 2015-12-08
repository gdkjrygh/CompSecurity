// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.module.messagecenter.MessageManager;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageView

class val.message
    implements Runnable
{

    final MessageView this$0;
    final Context val$context;
    final Message val$message;

    public void run()
    {
        MessageManager.updateMessage(val$context, val$message);
        MessageManager.notifyHostUnreadMessagesListener(MessageManager.getUnreadMessageCount(val$context));
    }

    ()
    {
        this$0 = final_messageview;
        val$context = context1;
        val$message = Message.this;
        super();
    }
}
