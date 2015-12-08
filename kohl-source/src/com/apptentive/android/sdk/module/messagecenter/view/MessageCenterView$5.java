// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import com.apptentive.android.sdk.model.Message;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterView, MessageAdapter

class val.messages
    implements Runnable
{

    final MessageCenterView this$0;
    final List val$messages;

    public void run()
    {
        messageAdapter.clear();
        Message message;
        for (Iterator iterator = val$messages.iterator(); iterator.hasNext(); addMessage(message))
        {
            message = (Message)iterator.next();
        }

    }

    ()
    {
        this$0 = final_messagecenterview;
        val$messages = List.this;
        super();
    }
}
