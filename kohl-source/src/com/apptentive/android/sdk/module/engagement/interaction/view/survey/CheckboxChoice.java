// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CheckboxChoice extends FrameLayout
{

    protected CheckBox checkbox;

    public CheckboxChoice(Context context, String s)
    {
        super(context);
        context = ((Activity)context).getLayoutInflater().inflate(com.apptentive.android.sdk.R.layout.apptentive_survey_question_multichoice_choice, this);
        TextView textview = (TextView)context.findViewById(com.apptentive.android.sdk.R.id.choice_text);
        checkbox = (CheckBox)context.findViewById(com.apptentive.android.sdk.R.id.checkbox);
        textview.setText(s);
        setClickable(true);
        checkbox.setClickable(false);
    }

    public void check()
    {
        checkbox.setChecked(true);
    }

    public boolean isChecked()
    {
        return checkbox.isChecked();
    }

    public void toggle()
    {
        checkbox.toggle();
    }
}
