// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.hats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.play.layout.CardLinearLayout;

public class PlayHappinessSurvey extends CardLinearLayout
{

    private LinearLayout mAnswerOptionContainer;
    private TextView mHeaderView;
    private final LayoutInflater mLayoutInflater;
    private TextView mQuestionView;

    public PlayHappinessSurvey(Context context)
    {
        this(context, null);
    }

    public PlayHappinessSurvey(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mLayoutInflater = LayoutInflater.from(context);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mHeaderView = (TextView)findViewById(0x7f0d0313);
        mQuestionView = (TextView)findViewById(0x7f0d0314);
        mAnswerOptionContainer = (LinearLayout)findViewById(0x7f0d0315);
    }
}
