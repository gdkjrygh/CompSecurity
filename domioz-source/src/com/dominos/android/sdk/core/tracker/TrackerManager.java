// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.android.sdk.core.tracker:
//            TrackerAPI

public class TrackerManager extends Manager
{

    ApplicationService mApplicationService;
    private FeedbackQuestions mFeedbackQuestions;
    private LabsOrder mOrder;
    private boolean mRateAppDialogFlag;
    TrackerAPI mTrackerAPI;
    private TrackerOrderStatus mTrackerOrderStatus;
    private String mTrackerStatus;

    public TrackerManager()
    {
    }

    public void clear()
    {
        mTrackerOrderStatus = null;
        mOrder = null;
    }

    public FeedbackQuestions getFeedbackQuestions()
    {
        return mFeedbackQuestions;
    }

    public String getName()
    {
        return "tracker-manager";
    }

    public LabsOrder getOrder()
    {
        return mOrder;
    }

    public TrackerOrderStatus getTrackerOrderStatus()
    {
        return mTrackerOrderStatus;
    }

    public boolean hasTrackerFailed()
    {
        return StringHelper.equalsIgnoreCase(mTrackerStatus, "com.dominos.notifications.stop");
    }

    public boolean isRateAppDialogFlag()
    {
        return mRateAppDialogFlag;
    }

    public void loadFeedbackQuestions(String s, String s1, LoadFeedbackQuestionsCallback loadfeedbackquestionscallback)
    {
        if (loadfeedbackquestionscallback != null)
        {
            loadfeedbackquestionscallback.onBegin();
        }
        mFeedbackQuestions = mTrackerAPI.getFeedbackQuestions(s, s1, mApplicationService.getLangSetting());
        if (mFeedbackQuestions != null) goto _L2; else goto _L1
_L1:
        if (loadfeedbackquestionscallback != null)
        {
            loadfeedbackquestionscallback.onLoadFeedbackFailure();
        }
_L4:
        if (loadfeedbackquestionscallback != null)
        {
            loadfeedbackquestionscallback.onFinish();
        }
        return;
_L2:
        if (loadfeedbackquestionscallback != null)
        {
            loadfeedbackquestionscallback.onLoadFeedbackSuccess(mFeedbackQuestions);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onSessionSet()
    {
    }

    public void setOrder(LabsOrder labsorder)
    {
        mOrder = labsorder;
    }

    public void setRateAppDialogFlag(boolean flag)
    {
        mRateAppDialogFlag = flag;
    }

    public void submitFeedbackResponse(String s, String s1, String s2, String s3, String s4, String s5, SubmitFeedbackResponseCallback submitfeedbackresponsecallback)
    {
        if (submitfeedbackresponsecallback != null)
        {
            submitfeedbackresponsecallback.onBegin();
        }
        s = (new com.dominos.android.sdk.common.dom.feedback.FeedbackResponse.Builder()).setFeedbackResponse(s5).setQuestionId(s).setQuestionType(s1).setOrderId(mTrackerOrderStatus.getOrderId()).setOrderKey(mTrackerOrderStatus.getOrderKey()).setStoreId(mTrackerOrderStatus.getStoreId()).setTeamMemberId(s3).setTeamMemberName(s2).setTeamMemberPosition(s4).build();
        boolean flag = mTrackerAPI.submitFeedbackResponse(s, mApplicationService.getLangSetting());
        if (submitfeedbackresponsecallback != null)
        {
            if (flag)
            {
                submitfeedbackresponsecallback.onSubmissionSuccess();
            } else
            {
                submitfeedbackresponsecallback.onSubmissionFailed();
            }
        }
        if (submitfeedbackresponsecallback != null)
        {
            submitfeedbackresponsecallback.onFinish();
        }
    }

    public void updateStatus(TrackerOrderStatus trackerorderstatus, String s)
    {
        mTrackerOrderStatus = trackerorderstatus;
        mTrackerStatus = s;
    }

    private class LoadFeedbackQuestionsCallback extends BaseCallback
    {

        public abstract void onLoadFeedbackFailure();

        public abstract void onLoadFeedbackSuccess(FeedbackQuestions feedbackquestions);

        public LoadFeedbackQuestionsCallback()
        {
        }
    }


    private class SubmitFeedbackResponseCallback extends BaseCallback
    {

        public abstract void onSubmissionFailed();

        public abstract void onSubmissionSuccess();

        public SubmitFeedbackResponseCallback()
        {
        }
    }

}
