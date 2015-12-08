// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper;
import com.pinterest.activity.nux.view.NUXCoreConceptsFeedImageView;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.AndroidView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.layout.NoLimitLinearLayout;
import com.pinterest.ui.spring.SpringInterpolator;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.Iterator;
import me.grantland.widget.AutofitHelper;
import me.grantland.widget.AutofitLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsBaseFragment, NUXInterestsPickerFragment

public class NUXCoreConceptsHomefeedFragment extends NUXCoreConceptsBaseFragment
{

    private static final long FEED_ANIMATION_DURATION = 45000L;
    private static final long FEED_PRE_TRANSLATE = -2000L;
    private static final int NUM_FEED_IMAGES = 6;
    private static final long PICK_INT_BLOCK_ANIMATION_DURATION = 1000L;
    private static final long PICK_INT_BLOCK_BEGIN_AFTER = 100L;
    private static final float PICK_INT_BLOCK_INTERPOLATOR_FRICTION = 0.8F;
    private static final float PICK_INT_BLOCK_INTERPOLATOR_TENSION = 0.25F;
    private static final long PICK_INT_BLOCK_PRE_TRANSLATEY = 150L;
    WebImageView _bottomFade;
    NoLimitLinearLayout _feedFrame;
    private NUXCoreConceptsTitleResizeHelper _nuxCoreConceptsTitleResizeHelper;
    PButton _pickInterestsBtn;
    PTextView _title;
    public AutofitHelper _titleAutofitHelper;
    AutofitLayout _titleWrapper;
    WebImageView _topFade;

    public NUXCoreConceptsHomefeedFragment()
    {
        _layoutId = 0x7f0300e3;
        _nuxCoreConceptsTitleResizeHelper = new NUXCoreConceptsTitleResizeHelper();
    }

    private Animator getFeedAnimation(LinearLayout linearlayout)
    {
        linearlayout = ObjectAnimator.ofFloat(linearlayout, "translationY", new float[] {
            -2000F, 0.0F
        });
        linearlayout.setDuration(45000L);
        linearlayout.setInterpolator(new LinearInterpolator());
        return linearlayout;
    }

    private AnimatorSet getPickIntBlockAnimation(PButton pbutton, WebImageView webimageview)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(pbutton, "translationY", new float[] {
            150F, 0.0F
        });
        pbutton = ObjectAnimator.ofFloat(pbutton, "alpha", new float[] {
            0.0F, 1.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(webimageview, "translationY", new float[] {
            150F, 0.0F
        });
        webimageview = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, pbutton, objectanimator1, webimageview
        });
        animatorset.setDuration(1000L);
        animatorset.setInterpolator(new SpringInterpolator(0.8F, 0.25F));
        return animatorset;
    }

    private void goToNextFragment()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            NUXInterestsPickerFragment nuxinterestspickerfragment = new NUXInterestsPickerFragment();
            FragmentHelper.replaceFragment(getActivity(), nuxinterestspickerfragment, false, com.pinterest.activity.FragmentHelper.Animation.SLIDE);
            return;
        }
    }

    public void applyAnimation()
    {
        _title.setVisibility(0);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(getFeedAnimation(_feedFrame));
        animatorset.play(getPickIntBlockAnimation(_pickInterestsBtn, _bottomFade)).after(100L);
        animatorset.start();
    }

    public void applyExperience()
    {
        Object obj1;
        ExperienceValue experiencevalue = Experiences.a(Experiences.b);
        if (experiencevalue == null || !(experiencevalue.f instanceof NuxDisplayData))
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj1 = ((NuxDisplayData)experiencevalue.f).a.iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (NuxStep)((Iterator) (obj1)).next();
        NUXCoreConceptsFeedImageView nuxcoreconceptsfeedimageview;
        int i;
        if (((NuxStep) (obj)).a == AndroidView.NUX_CORE_CONCEPTS_HOMEFEED.getValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        _title.setText(Html.fromHtml(((NuxStep) (obj)).b));
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM);
        _titleAutofitHelper = _titleWrapper.a(_title);
        _titleAutofitHelper.a(textSizeChange);
        _pickInterestsBtn.setText(((NuxStep) (obj)).m);
        _pickInterestsBtn.setOnClickListener(new _cls1());
        obj = ((NuxStep) (obj)).r;
        obj1 = Uri.parse(((PinterestJsonObject) (obj)).a("feed", ""));
        for (i = 0; i < 6; i++)
        {
            nuxcoreconceptsfeedimageview = new NUXCoreConceptsFeedImageView(getView().getContext(), null);
            nuxcoreconceptsfeedimageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            nuxcoreconceptsfeedimageview.loadUri(((Uri) (obj1)));
            _feedFrame.addView(nuxcoreconceptsfeedimageview);
        }

        break; /* Loop/switch isn't completed */
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
        _bottomFade.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("bottomFade", "")));
        _bottomFade.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _topFade.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("topFade", "")));
        _topFade.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        getView().getViewTreeObserver().addOnGlobalLayoutListener(new _cls2());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        applyExperience();
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXCoreConceptsHomefeedFragment this$0;

        public void onClick(View view)
        {
            goToNextFragment();
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsHomefeedFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final NUXCoreConceptsHomefeedFragment this$0;

        public void onGlobalLayout()
        {
            Events.post(new com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper.NUXCoreConceptsLayoutDoneEvent(_title));
            getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            _titleAutofitHelper.a(false);
            _nuxCoreConceptsTitleResizeHelper.matchAllTitleSizes();
        }

        _cls2()
        {
            this$0 = NUXCoreConceptsHomefeedFragment.this;
            super();
        }
    }

}
