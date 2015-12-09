// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.ui.listener.Listeners;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.checkablelayout.CheckableLinearLayout;
import com.google.common.collect.Lists;
import java.util.List;

public class KycOowDisplay extends DefaultViewHolder
{

    private final List answerListItems = Lists.newArrayList();
    private LinearLayout answersContainer;
    private final LayoutInflater layoutInflater;
    private Button nextButton;
    private OnActionListener onAnswerSelectedListener;
    private TextView questionProgress;
    private TextView questionPrompt;
    private int selectedAnswerIndex;
    private TextView timeRemaining;

    KycOowDisplay(Activity activity)
    {
        super(com.google.android.apps.walletnfcrel.R.layout.kyc_oow_fragment);
        layoutInflater = LayoutInflater.from(activity);
        selectedAnswerIndex = -1;
    }

    private void setUpAnswerItemOnClickListener(CheckableLinearLayout checkablelinearlayout, final int index)
    {
        checkablelinearlayout.setOnClickListener(new android.view.View.OnClickListener() {

            final KycOowDisplay this$0;
            final int val$index;

            public final void onClick(View view)
            {
                setSelectedAnswerIndex(index);
                if (onAnswerSelectedListener != null)
                {
                    onAnswerSelectedListener.onAction(Integer.valueOf(index));
                }
            }

            
            {
                this$0 = KycOowDisplay.this;
                index = i;
                super();
            }
        });
    }

    public final int getSelectedIndex()
    {
        return selectedAnswerIndex;
    }

    public final void setNextButtonOnActionListener(OnActionListener onactionlistener)
    {
        nextButton.setOnClickListener(Listeners.getOnClickListener(onactionlistener, null));
    }

    public final void setOnAnswerSelectedListener(OnActionListener onactionlistener)
    {
        onAnswerSelectedListener = onactionlistener;
    }

    public final void setQuestion(com.google.wallet.proto.features.NanoWalletKyc.ReferralQuestion referralquestion)
    {
        questionPrompt.setText(referralquestion.prompt);
        answersContainer.removeAllViews();
        answerListItems.clear();
        selectedAnswerIndex = -1;
        referralquestion = referralquestion.possibleAnswer;
        for (int i = 0; i < referralquestion.length; i++)
        {
            CharSequence charsequence = referralquestion[i];
            CheckableLinearLayout checkablelinearlayout = (CheckableLinearLayout)layoutInflater.inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_oow_question_list_item, null);
            TextView textview = (TextView)Views.findViewById(checkablelinearlayout, com.google.android.apps.walletnfcrel.R.id.KycAnswer);
            RadioButton radiobutton = (RadioButton)Views.findViewById(checkablelinearlayout, com.google.android.apps.walletnfcrel.R.id.KycAnswerRadioButton);
            textview.setText(charsequence);
            checkablelinearlayout.setDelegate(radiobutton);
            setUpAnswerItemOnClickListener(checkablelinearlayout, i);
            answersContainer.addView(checkablelinearlayout);
            answerListItems.add(checkablelinearlayout);
        }

    }

    public final void setQuestionProgress(String s)
    {
        questionProgress.setText(s);
    }

    public final void setSelectedAnswerIndex(int i)
    {
        selectedAnswerIndex = i;
        int j = 0;
        while (j < answerListItems.size()) 
        {
            CheckableLinearLayout checkablelinearlayout = (CheckableLinearLayout)answerListItems.get(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkablelinearlayout.setChecked(flag);
            j++;
        }
    }

    public final void setTimeRemaining(String s)
    {
        timeRemaining.setText(s);
    }

    public final void setView(View view)
    {
        super.setView(view);
        questionProgress = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.KycQuestionProgress);
        timeRemaining = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.KycTimeRemaining);
        questionPrompt = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.KycQuestionPrompt);
        answersContainer = (LinearLayout)findViewById(com.google.android.apps.walletnfcrel.R.id.KycAnswersContainer);
        nextButton = (Button)findViewById(com.google.android.apps.walletnfcrel.R.id.KycNextButton);
    }

}
