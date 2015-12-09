// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            TrackerFeedbackFragment, BaseFragment

public final class TrackerFeedbackFragment_ extends TrackerFeedbackFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public TrackerFeedbackFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        onBaseAfterInject();
        onAfterInject();
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void hideLoading()
    {
        handler_.post(new _cls2());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (contentView_ == null)
        {
            contentView_ = layoutinflater.inflate(0x7f0300e4, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewChanged(a a1)
    {
        mHeader = (RelativeLayout)a1.findViewById(0x7f0f04ad);
        mPostFeedbackQuestionsContainer = (RelativeLayout)a1.findViewById(0x7f0f04b3);
        mCommentBox = (EditText)a1.findViewById(0x7f0f04b6);
        mThanksTextView = (TextView)a1.findViewById(0x7f0f04b0);
        mCommentsTitle = (TextView)a1.findViewById(0x7f0f04b7);
        mExpRatingContainer = (LinearLayout)a1.findViewById(0x7f0f04af);
        mFeedbackDisplay = (LinearLayout)a1.findViewById(0x7f0f04ac);
        mShoutSpinner = (Spinner)a1.findViewById(0x7f0f04b1);
        mFeedbackContainer = (LinearLayout)a1.findViewById(0x7f0f04b5);
        mThanksCommentTextView = (TextView)a1.findViewById(0x7f0f04ba);
        mSendButton = (Button)a1.findViewById(0x7f0f04b8);
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showLoading()
    {
        handler_.post(new _cls1());
    }



    private class FragmentBuilder_ extends d
    {

        public TrackerFeedbackFragment build()
        {
            TrackerFeedbackFragment_ trackerfeedbackfragment_ = new TrackerFeedbackFragment_();
            trackerfeedbackfragment_.setArguments(args);
            return trackerfeedbackfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls2
        implements Runnable
    {

        final TrackerFeedbackFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = TrackerFeedbackFragment_.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final TrackerFeedbackFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls1()
        {
            this$0 = TrackerFeedbackFragment_.this;
            super();
        }
    }

}
