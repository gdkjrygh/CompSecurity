// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;

public class DrawerQuestionView extends LinearLayout
{

    TextView mDrawerQuestion;
    RatingBar mDrawerRatingBar;

    public DrawerQuestionView(Context context)
    {
        super(context);
    }

    public void bind(FeedbackQuestionModel feedbackquestionmodel)
    {
        mDrawerQuestion.setText(feedbackquestionmodel.getQuestion());
        mDrawerRatingBar.setTag(feedbackquestionmodel.getTag());
        mDrawerRatingBar.setRating(feedbackquestionmodel.getRating());
    }

    public float getRating()
    {
        return mDrawerRatingBar.getRating();
    }
}
