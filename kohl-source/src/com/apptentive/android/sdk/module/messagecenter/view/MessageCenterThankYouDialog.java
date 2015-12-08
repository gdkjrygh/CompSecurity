// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.module.rating.view.ApptentiveBaseDialog;

public class MessageCenterThankYouDialog extends ApptentiveBaseDialog
{
    public static interface OnChoiceMadeListener
    {

        public abstract void onNo();

        public abstract void onYes();
    }


    private OnChoiceMadeListener onChoiceMadeListener;
    private boolean validEmailProvided;

    public MessageCenterThankYouDialog(Context context)
    {
        super(context, com.apptentive.android.sdk.R.layout.apptentive_message_center_thank_you_dialog);
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = Configuration.load(getContext()).isMessageCenterEnabled(getContext());
        bundle = (Button)findViewById(com.apptentive.android.sdk.R.id.close);
        Button button = (Button)findViewById(com.apptentive.android.sdk.R.id.view_messages);
        TextView textview = (TextView)findViewById(com.apptentive.android.sdk.R.id.body);
        if (!flag)
        {
            if (validEmailProvided)
            {
                textview.setText(getContext().getResources().getText(com.apptentive.android.sdk.R.string.apptentive_thank_you_dialog_body_message_center_disabled_email_required));
            } else
            {
                textview.setText(getContext().getResources().getText(com.apptentive.android.sdk.R.string.apptentive_thank_you_dialog_body_message_center_disabled));
            }
        }
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final MessageCenterThankYouDialog this$0;

            public void onClick(View view)
            {
                cancel();
                if (onChoiceMadeListener != null)
                {
                    onChoiceMadeListener.onNo();
                }
            }

            
            {
                this$0 = MessageCenterThankYouDialog.this;
                super();
            }
        });
        if (!flag)
        {
            button.setVisibility(8);
            return;
        } else
        {
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final MessageCenterThankYouDialog this$0;

                public void onClick(View view)
                {
                    dismiss();
                    if (onChoiceMadeListener != null)
                    {
                        onChoiceMadeListener.onYes();
                    }
                }

            
            {
                this$0 = MessageCenterThankYouDialog.this;
                super();
            }
            });
            return;
        }
    }

    public void setOnChoiceMadeListener(OnChoiceMadeListener onchoicemadelistener)
    {
        onChoiceMadeListener = onchoicemadelistener;
    }

    public void setValidEmailProvided(boolean flag)
    {
        validEmailProvided = flag;
    }

}
