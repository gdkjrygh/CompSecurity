// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestion;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import com.dominos.android.sdk.core.tracker.TrackerUtil;
import com.dominos.views.TrackerQuestionView;
import com.dominos.views.TrackerQuestionView_;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment

public class TrackerFeedbackFragment extends BaseFragment
{

    public static final String POSITION_DRIVER = "Driver";
    public static final String POSITION_MANAGER = "Manager";
    public static final String POSITION_ORDER_TAKER = "OrderTaker";
    private ArrayList mAfterQuestionList;
    private ArrayList mBeforeQuestionList;
    EditText mCommentBox;
    TextView mCommentsTitle;
    LinearLayout mExpRatingContainer;
    LinearLayout mFeedbackContainer;
    LinearLayout mFeedbackDisplay;
    RelativeLayout mHeader;
    RelativeLayout mPostFeedbackQuestionsContainer;
    private com.dominos.views.TrackerQuestionView.OnQuestionClickedListener mQuestionListener;
    Button mSendButton;
    Spinner mShoutSpinner;
    TextView mThanksCommentTextView;
    TextView mThanksTextView;
    private TrackerManager mTrackerManager;

    public TrackerFeedbackFragment()
    {
    }

    private void addFeedbackQuestion(FeedbackQuestion feedbackquestion, String s, float f, ViewGroup viewgroup, boolean flag, String s1)
    {
        TrackerQuestionView trackerquestionview = TrackerQuestionView_.build(getActivity());
        FeedbackQuestionModel feedbackquestionmodel = new FeedbackQuestionModel();
        feedbackquestionmodel.setBeforeArrived(flag);
        feedbackquestionmodel.setQuestion(s);
        feedbackquestionmodel.setTag(feedbackquestion.getQuestionTag());
        feedbackquestionmodel.setRating(f);
        feedbackquestionmodel.setCode(feedbackquestion.getCode());
        feedbackquestionmodel.setType(feedbackquestion.getType());
        feedbackquestionmodel.setTeamMemberPosition(s1);
        trackerquestionview.bind(feedbackquestionmodel, mQuestionListener);
        viewgroup.addView(trackerquestionview);
        if (flag)
        {
            mBeforeQuestionList.add(feedbackquestionmodel);
            return;
        } else
        {
            mAfterQuestionList.add(feedbackquestionmodel);
            return;
        }
    }

    private void grayView(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setAlpha(0.5F);
        }
    }

    private void restoreView(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            view.setAlpha(1.0F);
        }
    }

    private void updateRateFood(TrackerOrderStatus trackerorderstatus, Map map)
    {
        String s = trackerorderstatus.getMakerName();
        trackerorderstatus = s;
        if (StringHelper.isEmpty(s))
        {
            trackerorderstatus = "our expert pizza maker";
        }
        map = (FeedbackQuestion)map.get("09262007-000006");
        if (map == null)
        {
            return;
        } else
        {
            addFeedbackQuestion(map, map.getText().replace("$managerName$", trackerorderstatus), 0.0F, mFeedbackContainer, false, "Manager");
            return;
        }
    }

    private void updateRateOrderingExperience(TrackerOrderStatus trackerorderstatus, Map map)
    {
        trackerorderstatus = TrackerUtil.getQuestionForOrderingExperience(trackerorderstatus, map);
        addFeedbackQuestion(trackerorderstatus, trackerorderstatus.getText(), 0.0F, mExpRatingContainer, true, "OrderTaker");
    }

    private void updateRateTeamMember(TrackerOrderStatus trackerorderstatus, Map map)
    {
        map = TrackerUtil.getQuestionForTeamMember(trackerorderstatus, map);
        String s = map.getText();
        if (StringHelper.isEmpty(trackerorderstatus.getDriverName()))
        {
            trackerorderstatus = getActivity().getString(0x7f08030c);
        } else
        {
            trackerorderstatus = trackerorderstatus.getDriverName();
        }
        addFeedbackQuestion(map, s.replace("$driverName$", trackerorderstatus), 0.0F, mFeedbackContainer, false, "Driver");
    }

    private void updateRateUltimateQuestion(TrackerOrderStatus trackerorderstatus, Map map)
    {
        trackerorderstatus = (FeedbackQuestion)map.get("09262007-000000");
        if (trackerorderstatus == null)
        {
            return;
        } else
        {
            addFeedbackQuestion(trackerorderstatus, trackerorderstatus.getText(), 0.0F, mFeedbackContainer, false, "Manager");
            return;
        }
    }

    private void updateShoutOuts(final Map feedbackQuestions)
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(getResources().getString(0x7f0802a6));
        FeedbackQuestion feedbackquestion = (FeedbackQuestion)feedbackQuestions.get("06092011-000001");
        if (feedbackquestion == null)
        {
            return;
        }
        String as[] = feedbackquestion.getText().split("\\||\n", -1);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            ((ArrayList) (obj)).add(as[i]);
        }

        obj = new ArrayAdapter(getActivity(), 0x7f0300ad, ((List) (obj)));
        mShoutSpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        mShoutSpinner.setEnabled(true);
        mShoutSpinner.setOnItemSelectedListener(new _cls4());
    }

    public List getAfterQuestionList()
    {
        return mAfterQuestionList;
    }

    public List getBeforeQuestionList()
    {
        return mBeforeQuestionList;
    }

    protected void onAfterInject()
    {
        mTrackerManager = (TrackerManager)mMobileSession.getManager("tracker-manager");
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        mHeader.setOnClickListener(new _cls1());
    }

    public void onSendShoutoutClick(View view, Map map)
    {
        view = (FeedbackQuestion)map.get("06092011-000001");
        if (!StringHelper.equals(mShoutSpinner.getSelectedItem().toString(), (String)mShoutSpinner.getItemAtPosition(0)))
        {
            mShoutSpinner.setVisibility(8);
            mThanksTextView.setVisibility(0);
            mTrackerManager.submitFeedbackResponse(view.getCode(), view.getType(), "", "", "", mShoutSpinner.getSelectedItem().toString(), null);
        }
    }

    public void updateData(final FeedbackQuestions feedbackQuestions, TrackerOrderStatus trackerorderstatus, com.dominos.views.TrackerQuestionView.OnQuestionClickedListener onquestionclickedlistener)
    {
        mQuestionListener = onquestionclickedlistener;
        mBeforeQuestionList = new ArrayList();
        mAfterQuestionList = new ArrayList();
        mFeedbackContainer.removeAllViews();
        if (trackerorderstatus.getOrderStatus() != OrderStatus.COMPLETE)
        {
            grayView(mPostFeedbackQuestionsContainer);
        } else
        {
            restoreView(mPostFeedbackQuestionsContainer);
        }
        mExpRatingContainer.removeAllViews();
        feedbackQuestions = feedbackQuestions.getQuestions();
        updateShoutOuts(feedbackQuestions);
        updateRateOrderingExperience(trackerorderstatus, feedbackQuestions);
        updateRateTeamMember(trackerorderstatus, feedbackQuestions);
        updateRateFood(trackerorderstatus, feedbackQuestions);
        updateRateUltimateQuestion(trackerorderstatus, feedbackQuestions);
        mCommentBox.setOnClickListener(new _cls2());
        mSendButton.setOnClickListener(new _cls3());
    }

    public void updateRatings(ArrayList arraylist, boolean flag)
    {
        if (flag)
        {
            for (int i = 0; i < arraylist.size(); i++)
            {
                ((FeedbackQuestionModel)mBeforeQuestionList.get(i)).setRating(((Float)arraylist.get(i)).floatValue());
                ((TrackerQuestionView)mExpRatingContainer.getChildAt(i)).updateRating();
            }

        } else
        {
            for (int j = 0; j < arraylist.size(); j++)
            {
                ((FeedbackQuestionModel)mAfterQuestionList.get(j)).setRating(((Float)arraylist.get(j)).floatValue());
                ((TrackerQuestionView)mFeedbackContainer.getChildAt(j)).updateRating();
            }

        }
    }



    private class _cls4
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final TrackerFeedbackFragment this$0;
        final Map val$feedbackQuestions;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            onSendShoutoutClick(view, feedbackQuestions);
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls4()
        {
            this$0 = TrackerFeedbackFragment.this;
            feedbackQuestions = map;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackerFeedbackFragment this$0;

        public void onClick(View view)
        {
            if (mFeedbackDisplay.getVisibility() == 0)
            {
                mFeedbackDisplay.setVisibility(8);
                return;
            } else
            {
                mFeedbackDisplay.setVisibility(0);
                return;
            }
        }

        _cls1()
        {
            this$0 = TrackerFeedbackFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final TrackerFeedbackFragment this$0;

        public void onClick(View view)
        {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            ((InputMethodManager)getActivity().getSystemService("input_method")).toggleSoftInput(0, 1);
        }

        _cls2()
        {
            this$0 = TrackerFeedbackFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final TrackerFeedbackFragment this$0;
        final Map val$feedbackQuestions;

        public void onClick(View view)
        {
            view = (FeedbackQuestion)feedbackQuestions.get("09262007-000007");
            FeedbackQuestionModel feedbackquestionmodel = new FeedbackQuestionModel();
            feedbackquestionmodel.setResponse(mCommentBox.getText().toString());
            feedbackquestionmodel.setType(view.getType());
            feedbackquestionmodel.setCode(view.getCode());
            if (StringHelper.isNotEmpty(feedbackquestionmodel.getResponse()))
            {
                mQuestionListener.onSendButtonClicked(feedbackquestionmodel);
                if (mTrackerManager.getTrackerOrderStatus().getOrderStatus() == OrderStatus.COMPLETE)
                {
                    mSendButton.setVisibility(8);
                    mThanksCommentTextView.setVisibility(0);
                    mCommentBox.setVisibility(8);
                    mCommentsTitle.setVisibility(8);
                }
            }
        }

        _cls3()
        {
            this$0 = TrackerFeedbackFragment.this;
            feedbackQuestions = map;
            super();
        }
    }

}
