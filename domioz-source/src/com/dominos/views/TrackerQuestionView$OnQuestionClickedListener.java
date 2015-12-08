// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;

public interface l
{

    public abstract void onAfterQuestionClicked();

    public abstract void onBeforeQuestionClicked();

    public abstract void onSendButtonClicked(FeedbackQuestionModel feedbackquestionmodel);
}
