// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptentive.android.sdk.model.AutomatedMessage;
import com.apptentive.android.sdk.model.Message;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageView, ZeroMinSizeDrawable

public class AutomatedMessageView extends MessageView
{

    public AutomatedMessageView(Context context, AutomatedMessage automatedmessage)
    {
        super(context, automatedmessage);
    }

    protected void init(AutomatedMessage automatedmessage)
    {
        super.init(automatedmessage);
        LayoutInflater.from(context).inflate(com.apptentive.android.sdk.R.layout.apptentive_message_auto, this);
        ((LinearLayout)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_auto_frame)).setBackgroundDrawable(new ZeroMinSizeDrawable(context.getResources(), com.apptentive.android.sdk.R.drawable.apptentive_paper_bg));
    }

    protected volatile void init(Message message)
    {
        init((AutomatedMessage)message);
    }

    public void updateMessage(AutomatedMessage automatedmessage)
    {
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_auto_title)).setText(automatedmessage.getTitle());
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_auto_body)).setText(automatedmessage.getBody());
    }

    public volatile void updateMessage(Message message)
    {
        updateMessage((AutomatedMessage)message);
    }
}
