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
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import butterknife.ButterKnife;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experience.NuxDisplayData;
import com.pinterest.experience.NuxStep;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.AndroidView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.spring.SpringInterpolator;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.Iterator;
import me.grantland.widget.AutofitHelper;
import me.grantland.widget.AutofitLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsBaseFragment

public class NUXCoreConceptsPinsFragment extends NUXCoreConceptsBaseFragment
{

    private static final long ANIMATION_START_DURATION = 300L;
    private static final float GENERAL_INTERPOLATOR = 0.9F;
    private static final long PIN_APPEAR_ANIMATION_DURATION = 700L;
    private static final long PIN_FADE_ANIMATION_DURATION = 400L;
    private static final long PIN_FADE_BEGIN_AFTER = 800L;
    private static final float PIN_FINAL_ALPHA = 0.5F;
    private static final float PIN_FINAL_SCALE = 0.9F;
    private static final long PIN_IT_BTN_ALPHA_DURATION = 200L;
    private static final long PIN_IT_BTN_BEGIN_AFTER = 1200L;
    private static final float PIN_IT_BTN_PRE_SCALE = 0.85F;
    private static final long PIN_IT_BTN_SCALE_DURATION = 1300L;
    private static final float PIN_PRE_TRANSLATEY = 100F;
    private static final long PIN_TIP_ANIMATION_DURATION = 600L;
    private static final long PIN_TIP_BEGIN_AFTER = 800L;
    private static final float PIN_TIP_INTERPOLATOR_FRICTION = 0.9F;
    private static final float PIN_TIP_INTERPOLATOR_TENSION = 0.2F;
    private static final float PIN_TIP_PRE_SCALE = 0.7F;
    private static final float PIN_TRANSLATE_INTERPOLATOR = 0.95F;
    WebImageView _pin;
    WebImageView _pinItBtn;
    WebImageView _pinTip;
    PTextView _title;
    public AutofitHelper _titleAutofitHelper;
    AutofitLayout _titleWrapper;

    public NUXCoreConceptsPinsFragment()
    {
        _layoutId = 0x7f0300e5;
    }

    private AnimatorSet getPinAnimation(WebImageView webimageview)
    {
        Object obj = ObjectAnimator.ofFloat(webimageview, "translationY", new float[] {
            100F, 0.0F
        });
        ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator(0.95F));
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            obj, objectanimator
        });
        animatorset.setDuration(700L);
        obj = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            1.0F, 0.5F
        });
        ((ObjectAnimator) (obj)).setInterpolator(new LinearInterpolator());
        objectanimator = ObjectAnimator.ofFloat(webimageview, "scaleX", new float[] {
            1.0F, 0.9F
        });
        objectanimator.setInterpolator(new DecelerateInterpolator(0.9F));
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(webimageview, "scaleY", new float[] {
            1.0F, 0.9F
        });
        objectanimator1.setInterpolator(new DecelerateInterpolator(0.9F));
        webimageview = new AnimatorSet();
        webimageview.playTogether(new Animator[] {
            obj, objectanimator, objectanimator1
        });
        webimageview.setDuration(400L);
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).play(animatorset);
        ((AnimatorSet) (obj)).play(webimageview).after(800L);
        return ((AnimatorSet) (obj));
    }

    private AnimatorSet getPinItBtnAnimation(WebImageView webimageview)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(200L);
        objectanimator.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(webimageview, "scaleX", new float[] {
            0.85F, 1.0F
        });
        objectanimator1.setDuration(1300L);
        objectanimator1.setInterpolator(new BounceInterpolator());
        webimageview = ObjectAnimator.ofFloat(webimageview, "scaleY", new float[] {
            0.85F, 1.0F
        });
        webimageview.setDuration(1300L);
        webimageview.setInterpolator(new BounceInterpolator());
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, webimageview
        });
        return animatorset;
    }

    private AnimatorSet getPinTipAnimation(WebImageView webimageview)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(webimageview, "scaleX", new float[] {
            0.7F, 1.0F
        });
        webimageview = ObjectAnimator.ofFloat(webimageview, "scaleY", new float[] {
            0.7F, 1.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, webimageview
        });
        animatorset.setDuration(600L);
        animatorset.setInterpolator(new SpringInterpolator(0.9F, 0.2F));
        return animatorset;
    }

    public void applyAnimation()
    {
        _title.setVisibility(0);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setStartDelay(300L);
        animatorset.play(getPinAnimation(_pin));
        animatorset.play(getPinTipAnimation(_pinTip)).after(800L);
        animatorset.play(getPinItBtnAnimation(_pinItBtn)).after(1200L);
        animatorset.start();
    }

    public void applyExperience()
    {
        Object obj = Experiences.a(Experiences.b);
        if (obj == null || !(((ExperienceValue) (obj)).f instanceof NuxDisplayData)) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((NuxDisplayData)((ExperienceValue) (obj)).f).a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj = (NuxStep)iterator.next();
        boolean flag;
        if (((NuxStep) (obj)).a == AndroidView.NUX_CORE_CONCEPTS_PINS.getValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        _title.setText(Html.fromHtml(((NuxStep) (obj)).b));
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM);
        _titleAutofitHelper = _titleWrapper.a(_title);
        _titleAutofitHelper.a(textSizeChange);
        obj = ((NuxStep) (obj)).r;
        _pin.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("pin", "")));
        _pinTip.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("pinTip", "")));
        _pinItBtn.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("pinItBtn", "")));
        getView().getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
_L2:
        return;
_L4:
        obj = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        applyExperience();
    }

    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final NUXCoreConceptsPinsFragment this$0;

        public void onGlobalLayout()
        {
            Events.post(new com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper.NUXCoreConceptsLayoutDoneEvent(_title));
            getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            _titleAutofitHelper.a(false);
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsPinsFragment.this;
            super();
        }
    }

}
