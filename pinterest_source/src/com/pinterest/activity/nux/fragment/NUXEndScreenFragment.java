// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.nux.NUXCoreConceptsHelper;
import com.pinterest.activity.nux.view.NUXAnimatedInterestCellsView;
import com.pinterest.activity.nux.view.NUXAnimatedPinView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceEnabled;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PTextView;

public class NUXEndScreenFragment extends BaseFragment
    implements ExperienceEnabled
{

    public static final int WAITTIME_FEED = 1500;
    public static final int WAITTIME_HARDLIMIT = 3500;
    PTextView _desc;
    Handler _handler;
    NUXAnimatedPinView _illustrationsView;
    private boolean _inCoreConceptsExp;
    private boolean _inGiftWrapInterestsExp;
    NUXAnimatedInterestCellsView _pickedInterestsView;
    PTextView _title;
    Runnable finishFeedRunnable;

    public NUXEndScreenFragment()
    {
        finishFeedRunnable = new _cls2();
        _inCoreConceptsExp = NUXCoreConceptsHelper.inCoreConceptsExp();
        _inGiftWrapInterestsExp = EducationHelper.n();
        _layoutId = getLayoutId();
        init();
    }

    private void completeExperience()
    {
        ExperienceValue experiencevalue = Experiences.a(Experiences.b);
        if (experiencevalue != null)
        {
            experiencevalue.a();
        }
        Experiences.c(Experiences.b);
    }

    private int getLayoutId()
    {
        if (_inCoreConceptsExp)
        {
            return 0x7f0300e2;
        }
        return !_inGiftWrapInterestsExp ? 0x7f0300e7 : 0x7f0300cb;
    }

    private void init()
    {
    }

    private void refreshHomeFeed()
    {
        Events.post(new NUXCompletedEvent());
        _handler.postDelayed(new _cls3(), 1500L);
    }

    public void applyExperience()
    {
        Object obj;
        for (obj = Experiences.a(Experiences.b); obj == null || !(((ExperienceValue) (obj)).f instanceof NuxDisplayData);)
        {
            return;
        }

        obj = (NuxDisplayData)((ExperienceValue) (obj)).f;
        ViewHelper.safeSetText(_title, ((NuxDisplayData) (obj)).j);
        ViewHelper.safeSetText(_desc, ((NuxDisplayData) (obj)).k);
    }

    public void onDestroyView()
    {
        if (_pickedInterestsView != null)
        {
            _pickedInterestsView.stopAnimation();
        }
        if (_illustrationsView != null)
        {
            _illustrationsView.finish();
        }
        ButterKnife.a(this);
        _handler.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    public void onResume()
    {
        if (_illustrationsView != null)
        {
            _illustrationsView.onResume();
        }
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        AnalyticsApi.b("mandatory_nux_complete");
        applyExperience();
        completeExperience();
        bundle = _title;
        if (_inCoreConceptsExp)
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM;
        } else
        if (_inGiftWrapInterestsExp)
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD;
        } else
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR;
        }
        bundle.setTypefaceId(view);
        bundle = _desc;
        if (_inCoreConceptsExp)
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM;
        } else
        if (_inGiftWrapInterestsExp)
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD;
        } else
        {
            view = com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR;
        }
        bundle.setTypefaceId(view);
        _handler = new Handler(Looper.getMainLooper());
        view = getActivity();
        if (view instanceof NUXActivity)
        {
            ((NUXActivity)view).setProgressVisibility(4);
        }
        _handler.postDelayed(new _cls1(), 3500L);
        pollHomeFeedReady();
    }

    public void pollHomeFeedReady()
    {
        BaseActivity baseactivity = (BaseActivity)getActivity();
        if (baseactivity != null && baseactivity.isVisible())
        {
            _handler.postDelayed(finishFeedRunnable, 1500L);
        }
    }


    private class _cls2
        implements Runnable
    {

        final NUXEndScreenFragment this$0;

        public void run()
        {
            class _cls1 extends ApiResponseHandler
            {

                final _cls2 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    pollHomeFeedReady();
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    if (apiresponse.getCode() != 220)
                    {
                        Experiences.c().d(Experiences.a);
                        refreshHomeFeed();
                        super.onSuccess(apiresponse);
                        return;
                    } else
                    {
                        pollHomeFeedReady();
                        return;
                    }
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            InterestsApi.a(new _cls1(), getApiTag());
        }

        _cls2()
        {
            this$0 = NUXEndScreenFragment.this;
            super();
        }
    }


    private class NUXCompletedEvent
    {

        public NUXCompletedEvent()
        {
        }
    }


    private class _cls3
        implements Runnable
    {

        final NUXEndScreenFragment this$0;

        public void run()
        {
            if (getActivity() != null)
            {
                getActivity().finish();
            }
        }

        _cls3()
        {
            this$0 = NUXEndScreenFragment.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final NUXEndScreenFragment this$0;

        public void run()
        {
            refreshHomeFeed();
        }

        _cls1()
        {
            this$0 = NUXEndScreenFragment.this;
            super();
        }
    }

}
