// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import org.androidannotations.api.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.tracker:
//            TrackerManager, TrackerAPI_

public final class TrackerManager_ extends TrackerManager
{

    private static TrackerManager_ instance_;
    private Context context_;

    private TrackerManager_(Context context)
    {
        context_ = context;
    }

    public static TrackerManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new TrackerManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mApplicationService = ApplicationService_.getInstance_(context_);
        mTrackerAPI = TrackerAPI_.getInstance_(context_);
    }

    public final void loadFeedbackQuestions(String s, String s1, TrackerManager.LoadFeedbackQuestionsCallback loadfeedbackquestionscallback)
    {
        a.a(new _cls2(s, s1, loadfeedbackquestionscallback));
    }

    public final void submitFeedbackResponse(String s, String s1, String s2, String s3, String s4, String s5, TrackerManager.SubmitFeedbackResponseCallback submitfeedbackresponsecallback)
    {
        a.a(new _cls1(s4, s5, submitfeedbackresponsecallback));
    }



    private class _cls2 extends org.androidannotations.api.c
    {

        final TrackerManager_ this$0;
        final TrackerManager.LoadFeedbackQuestionsCallback val$callback;
        final String val$orderId;
        final String val$storeId;

        public void execute()
        {
            try
            {
                loadFeedbackQuestions(storeId, orderId, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s2, String s3, TrackerManager.LoadFeedbackQuestionsCallback loadfeedbackquestionscallback)
        {
            this$0 = TrackerManager_.this;
            storeId = s2;
            orderId = s3;
            callback = loadfeedbackquestionscallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls1 extends org.androidannotations.api.c
    {

        final TrackerManager_ this$0;
        final TrackerManager.SubmitFeedbackResponseCallback val$callback;
        final String val$questionId;
        final String val$questionType;
        final String val$response;
        final String val$teamMemberId;
        final String val$teamMemberName;
        final String val$teamMemberPosition;

        public void execute()
        {
            try
            {
                submitFeedbackResponse(questionId, questionType, teamMemberName, teamMemberId, teamMemberPosition, response, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(String s6, String s7, TrackerManager.SubmitFeedbackResponseCallback submitfeedbackresponsecallback)
        {
            this$0 = TrackerManager_.this;
            questionId = s2;
            questionType = s3;
            teamMemberName = s4;
            teamMemberId = s5;
            teamMemberPosition = s6;
            response = s7;
            callback = submitfeedbackresponsecallback;
            super(final_s, final_i, final_s1);
        }
    }

}
