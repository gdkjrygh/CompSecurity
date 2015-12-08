// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageView, AvatarView

public abstract class PersonalMessageView extends MessageView
{

    public PersonalMessageView(Context context, Message message)
    {
        super(context, message);
    }

    protected String createTimestamp(Double double1)
    {
        Resources resources = context.getResources();
        if (double1 != null)
        {
            return Util.secondsToDisplayString(resources.getString(com.apptentive.android.sdk.R.string.apptentive_message_sent_timestamp_format), double1);
        } else
        {
            return resources.getString(com.apptentive.android.sdk.R.string.apptentive_sending);
        }
    }

    protected void init(Message message)
    {
        super.init(message);
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        if (message.isOutgoingMessage())
        {
            layoutinflater.inflate(com.apptentive.android.sdk.R.layout.apptentive_message_outgoing, this);
            return;
        } else
        {
            layoutinflater.inflate(com.apptentive.android.sdk.R.layout.apptentive_message_incoming, this);
            return;
        }
    }

    public void updateMessage(final Message avatarFrame)
    {
        boolean flag;
label0:
        {
            Message message = this.message;
            super.updateMessage(avatarFrame);
            ((TextView)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_timestamp)).setText(createTimestamp(this.message.getCreatedAt()));
            TextView textview = (TextView)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_sender_name);
            String s = this.message.getSenderUsername();
            Object obj;
            if (s != null)
            {
                obj = s;
                if (!s.equals(""))
                {
                    break label0;
                }
            }
            obj = context.getResources();
            if (avatarFrame.isOutgoingMessage())
            {
                obj = ((Resources) (obj)).getString(com.apptentive.android.sdk.R.string.apptentive_you);
            } else
            {
                obj = ((Resources) (obj)).getString(com.apptentive.android.sdk.R.string.apptentive_developer);
            }
        }
        textview.setText(((CharSequence) (obj)));
        avatarFrame = (FrameLayout)findViewById(com.apptentive.android.sdk.R.id.apptentive_message_avatar);
        obj = this.message.getSenderProfilePhoto();
        if (message == null || obj != null && !((String) (obj)).equals(message.getSenderProfilePhoto()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            avatarFrame = new Thread() {

                final PersonalMessageView this$0;
                final FrameLayout val$avatarFrame;

                public void run()
                {
                    AvatarView avatarview = new AvatarView(context, message.getSenderProfilePhoto());
                    post(avatarview. new Runnable() {

                        final _cls1 this$1;
                        final AvatarView val$avatar;

                        public void run()
                        {
                            avatarFrame.addView(avatar);
                        }

            
            {
                this$1 = final__pcls1;
                avatar = AvatarView.this;
                super();
            }
                    });
                }

            
            {
                this$0 = PersonalMessageView.this;
                avatarFrame = framelayout;
                super();
            }
            };
            avatarFrame.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

                final PersonalMessageView this$0;

                public void uncaughtException(Thread thread, Throwable throwable)
                {
                    Log.w("UncaughtException in PersonalMessageView.", throwable, new Object[0]);
                    MetricModule.sendError(context.getApplicationContext(), throwable, null, null);
                }

            
            {
                this$0 = PersonalMessageView.this;
                super();
            }
            });
            avatarFrame.setName("Apptentive-MessageViewLoadAvatar");
            avatarFrame.start();
        }
    }
}
