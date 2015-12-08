// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.module.messagecenter.MessageManager;
import com.apptentive.android.sdk.module.metric.MetricModule;
import java.util.HashMap;
import java.util.Map;

public abstract class MessageView extends FrameLayout
{

    protected Context context;
    protected Message message;

    public MessageView(final Context context, final Message message)
    {
        super(context);
        this.context = context;
        init(message);
        updateMessage(message);
        if (!message.isRead())
        {
            message.setRead(true);
            HashMap hashmap = new HashMap();
            hashmap.put("message_id", message.getId());
            MetricModule.sendMetric(context, com.apptentive.android.sdk.model.Event.EventLabel.message_center__read, null, hashmap);
            post(new Runnable() {

                final MessageView this$0;
                final Context val$context;
                final Message val$message;

                public void run()
                {
                    MessageManager.updateMessage(context, message);
                    MessageManager.notifyHostUnreadMessagesListener(MessageManager.getUnreadMessageCount(context));
                }

            
            {
                this$0 = MessageView.this;
                context = context1;
                message = message1;
                super();
            }
            });
        }
    }

    protected void init(Message message1)
    {
    }

    public void updateMessage(Message message1)
    {
        message = message1;
    }
}
