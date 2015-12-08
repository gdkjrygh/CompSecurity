// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apptentive.android.sdk.module.rating.view.ApptentiveBaseDialog;

public class SurveyThankYouDialog extends ApptentiveBaseDialog
{

    public SurveyThankYouDialog(Context context)
    {
        super(context, com.apptentive.android.sdk.R.layout.apptentive_survey_thank_you_dialog);
    }

    protected void onCreate(Bundle bundle)
    {
        ((Button)findViewById(com.apptentive.android.sdk.R.id.ok)).setOnClickListener(new android.view.View.OnClickListener() {

            final SurveyThankYouDialog this$0;

            public void onClick(View view)
            {
                dismiss();
            }

            
            {
                this$0 = SurveyThankYouDialog.this;
                super();
            }
        });
    }

    public void setMessage(String s)
    {
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.body)).setText(s);
    }
}
