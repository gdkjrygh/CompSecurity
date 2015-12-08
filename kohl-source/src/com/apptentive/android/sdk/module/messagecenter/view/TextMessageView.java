// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.TextMessage;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            PersonalMessageView

public class TextMessageView extends PersonalMessageView
{

    public TextMessageView(Context context, TextMessage textmessage)
    {
        super(context, textmessage);
    }

    protected volatile void init(Message message)
    {
        init((TextMessage)message);
    }

    protected void init(TextMessage textmessage)
    {
        super.init(textmessage);
        textmessage = LayoutInflater.from(context);
        FrameLayout framelayout = (FrameLayout)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_body);
        textmessage.inflate(com.apptentive.android.sdk.R.layout.apptentive_message_body_text, framelayout);
    }

    public volatile void updateMessage(Message message)
    {
        updateMessage((TextMessage)message);
    }

    public void updateMessage(TextMessage textmessage)
    {
        super.updateMessage(textmessage);
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.apptentive_text_message_text)).setText(textmessage.getBody());
    }
}
