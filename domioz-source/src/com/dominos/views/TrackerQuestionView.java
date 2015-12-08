// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;

public class TrackerQuestionView extends LinearLayout
{

    private OnQuestionClickedListener mListener;
    private FeedbackQuestionModel mModel;
    TextView mQuestion;
    RatingBar mRating;

    public TrackerQuestionView(Context context)
    {
        super(context);
    }

    public void bind(final FeedbackQuestionModel questionModel, OnQuestionClickedListener onquestionclickedlistener)
    {
        mQuestion.setText(questionModel.getQuestion());
        mListener = onquestionclickedlistener;
        mModel = questionModel;
        setOnClickListener(new _cls1());
        mRating.setTag(questionModel.getTag());
        mRating.setRating(questionModel.getRating());
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
    }

    public void updateRating()
    {
        mRating.setRating(mModel.getRating());
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackerQuestionView this$0;
        final FeedbackQuestionModel val$questionModel;

        public void onClick(View view)
        {
            if (questionModel.isBeforeArrived())
            {
                mListener.onBeforeQuestionClicked();
                return;
            } else
            {
                mListener.onAfterQuestionClicked();
                return;
            }
        }

        _cls1()
        {
            this$0 = TrackerQuestionView.this;
            questionModel = feedbackquestionmodel;
            super();
        }

        private class OnQuestionClickedListener
        {

            public abstract void onAfterQuestionClicked();

            public abstract void onBeforeQuestionClicked();

            public abstract void onSendButtonClicked(FeedbackQuestionModel feedbackquestionmodel);
        }

    }

}
