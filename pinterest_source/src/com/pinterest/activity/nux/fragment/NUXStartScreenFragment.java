// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.experience.ExperienceEnabled;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXInterestsPickerFragment, NUXSocialPickerFragment

public class NUXStartScreenFragment extends BaseFragment
    implements ExperienceEnabled
{

    ViewGroup _animationContainer;
    ImageView _centerIv;
    RelativeLayout _container;
    PTextView _details;
    ImageView _leftIv;
    PButton _nextBt;
    ImageView _rightIv;
    PTextView _title;

    public NUXStartScreenFragment()
    {
        _layoutId = 0x7f0300eb;
    }

    public void applyExperience()
    {
        Object obj;
        obj = Experiences.a(Experiences.b);
        break MISSING_BLOCK_LABEL_7;
_L2:
        do
        {
            return;
        } while (obj == null || !(((ExperienceValue) (obj)).f instanceof NuxDisplayData));
        Iterator iterator = ((NuxDisplayData)((ExperienceValue) (obj)).f).a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (NuxStep)iterator.next();
        } while (!((NuxStep) (obj)).a());
_L3:
        if (obj != null)
        {
            ViewHelper.safeSetText(_title, ((NuxStep) (obj)).b);
            ViewHelper.safeSetText(_details, ((NuxStep) (obj)).c);
            ViewHelper.safeSetText(_nextBt, ((NuxStep) (obj)).m);
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj = null;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams getFanUtilParams()
    {
        return new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams();
    }

    public void goToNextFragment()
    {
        Object obj;
        if (getActivity() == null)
        {
            return;
        }
        obj = NuxDisplayData.c();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((NuxDisplayData) (obj)).a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj = (NuxStep)iterator.next();
        if (((NuxStep) (obj)).d != 1) goto _L6; else goto _L5
_L5:
        if (!((NuxStep) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_84;
        }
_L2:
        obj = new NUXInterestsPickerFragment();
_L7:
        FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), false, com.pinterest.activity.FragmentHelper.Animation.SLIDE);
        return;
_L4:
        obj = null;
          goto _L5
        obj = new NUXSocialPickerFragment();
          goto _L7
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onViewCreated(final View v, Bundle bundle)
    {
        super.onViewCreated(v, bundle);
        ButterKnife.a(this, v);
        AnalyticsApi.b("nux_started");
        applyExperience();
        _nextBt.setOnClickListener(new _cls1());
        bundle = getActivity();
        if (bundle instanceof NUXActivity)
        {
            ((NUXActivity)bundle).setProgressVisibility(4);
        }
        setupCards();
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR);
        bundle = v.getViewTreeObserver();
        if (bundle.isAlive())
        {
            bundle.addOnGlobalLayoutListener(new _cls2());
        }
    }

    protected void setupCards()
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 1;
        _leftIv.setLayoutParams(layoutparams);
        _rightIv.setLayoutParams(layoutparams);
        _centerIv.setLayoutParams(layoutparams);
        _rightIv.setScaleX(0.85F);
        _rightIv.setScaleY(0.85F);
        _leftIv.setScaleX(0.85F);
        _leftIv.setScaleY(0.85F);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXStartScreenFragment this$0;

        public void onClick(View view)
        {
            goToNextFragment();
        }

        _cls1()
        {
            this$0 = NUXStartScreenFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final NUXStartScreenFragment this$0;
        final View val$v;

        public void onGlobalLayout()
        {
            v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams = getFanUtilParams();
            FanAnimationUtil.animate(_leftIv, _centerIv, _rightIv, _container, fanutilparams);
        }

        _cls2()
        {
            this$0 = NUXStartScreenFragment.this;
            v = view;
            super();
        }
    }

}
