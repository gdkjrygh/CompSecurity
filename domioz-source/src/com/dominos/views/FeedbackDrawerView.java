// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SlidingDrawer;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            DrawerQuestionView_, DrawerQuestionView

public class FeedbackDrawerView extends RelativeLayout
{

    SlidingDrawer mDrawer;
    private OnFeedbackDrawerSubmitListener mListener;
    LinearLayout mQuestionContainer;
    private ArrayList mRatingList;
    Button mSubmitRatingsButton;

    public FeedbackDrawerView(Context context)
    {
        super(context);
    }

    public FeedbackDrawerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(List list, final OnFeedbackDrawerSubmitListener listener, final boolean isBeforeArrive)
    {
        mRatingList = new ArrayList();
        mListener = listener;
        mQuestionContainer.removeAllViews();
        DrawerQuestionView drawerquestionview;
        for (list = list.iterator(); list.hasNext(); mQuestionContainer.addView(drawerquestionview))
        {
            FeedbackQuestionModel feedbackquestionmodel = (FeedbackQuestionModel)list.next();
            drawerquestionview = DrawerQuestionView_.build(getContext());
            drawerquestionview.bind(feedbackquestionmodel);
        }

        mSubmitRatingsButton.setOnClickListener(new _cls1());
        mDrawer.setVerticalFadingEdgeEnabled(true);
    }

    public boolean isOpened()
    {
        return mDrawer.isOpened();
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
    }

    public void toggle()
    {
        mDrawer.animateToggle();
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FeedbackDrawerView this$0;
        final boolean val$isBeforeArrive;
        final OnFeedbackDrawerSubmitListener val$listener;

        public void onClick(View view)
        {
            for (int i = 0; i < mQuestionContainer.getChildCount(); i++)
            {
                float f = ((DrawerQuestionView)mQuestionContainer.getChildAt(i)).getRating();
                mRatingList.add(Float.valueOf(f));
            }

            listener.onSubmitButtonClick(mRatingList, isBeforeArrive);
        }

        _cls1()
        {
            this$0 = FeedbackDrawerView.this;
            listener = onfeedbackdrawersubmitlistener;
            isBeforeArrive = flag;
            super();
        }

        private class OnFeedbackDrawerSubmitListener
        {

            public abstract void onSubmitButtonClick(ArrayList arraylist, boolean flag);
        }

    }

}
