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

public class NUXCoreConceptsSaveFragment extends NUXCoreConceptsBaseFragment
{

    private static final long ANIMATIONS_BEGIN_AFTER = 300L;
    private static final float GENERAL_INTERPOLATOR_TENSION = 0.25F;
    private static final long PHONE_ANIMATION_DURATION = 1300L;
    private static final long PHONE_BACKGROUND_ANIMATION_DURATION = 300L;
    private static final long PHONE_BG_BEGIN_AFTER = 2400L;
    private static final float PHONE_INTERPOLATOR_FRICTION = 0.9F;
    private static final float PHONE_PRE_SCALE = 0.8F;
    private static final float PHONE_PRE_TRANSLATEY = 50F;
    private static final long PIN_ANIMATION_DURATION = 800L;
    private static final float PIN_INTERPOLATOR = 0.7F;
    private static final float PIN_PRE_TRANSLATEY = 25F;
    private static final long SMALL_PIN1_BEGIN_AFTER = 1500L;
    private static final long SMALL_PIN2_BEGIN_AFTER = 1700L;
    private static final long SMALL_PIN3_BEGIN_AFTER = 1900L;
    WebImageView _bottomFade;
    WebImageView _mainPin;
    WebImageView _phone;
    WebImageView _phoneBg;
    WebImageView _smallPin1;
    WebImageView _smallPin2;
    WebImageView _smallPin3;
    PTextView _title;
    public AutofitHelper _titleAutofitHelper;
    AutofitLayout _titleWrapper;

    public NUXCoreConceptsSaveFragment()
    {
        _layoutId = 0x7f0300e6;
    }

    private AnimatorSet getPhoneAnimation(WebImageView webimageview)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(webimageview, "scaleX", new float[] {
            0.8F, 1.0F
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(webimageview, "scaleY", new float[] {
            0.8F, 1.0F
        });
        webimageview = ObjectAnimator.ofFloat(webimageview, "translationY", new float[] {
            50F, 0.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2, webimageview
        });
        animatorset.setDuration(1300L);
        animatorset.setInterpolator(new SpringInterpolator(0.9F, 0.25F));
        return animatorset;
    }

    private ObjectAnimator getPhoneBackgroundAnimation(WebImageView webimageview)
    {
        webimageview = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        webimageview.setDuration(300L);
        webimageview.setInterpolator(new LinearInterpolator());
        return webimageview;
    }

    private AnimatorSet getPinAnimation(WebImageView webimageview)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(webimageview, "alpha", new float[] {
            0.0F, 1.0F
        });
        webimageview = ObjectAnimator.ofFloat(webimageview, "translationY", new float[] {
            25F, 0.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, webimageview
        });
        animatorset.setDuration(800L);
        animatorset.setInterpolator(new SpringInterpolator(0.7F, 0.25F));
        return animatorset;
    }

    public void applyAnimation()
    {
        _title.setVisibility(0);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(getPhoneAnimation(_phone)).after(300L);
        animatorset.play(getPinAnimation(_mainPin)).after(1300L);
        animatorset.play(getPinAnimation(_smallPin1)).after(1500L);
        animatorset.play(getPinAnimation(_smallPin2)).after(1700L);
        animatorset.play(getPinAnimation(_smallPin3)).after(1900L);
        animatorset.play(getPhoneBackgroundAnimation(_phoneBg)).after(2400L);
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
        if (((NuxStep) (obj)).a == AndroidView.NUX_CORE_CONCEPTS_SAVE.getValue())
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
        _phone.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("phone", "")));
        _phone.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _phoneBg.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("phoneBg", "")));
        _phoneBg.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        _mainPin.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("mainPin", "")));
        _smallPin1.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("smallPin1", "")));
        _smallPin2.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("smallPin2", "")));
        _smallPin3.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("smallPin3", "")));
        _bottomFade.loadUri(Uri.parse(((PinterestJsonObject) (obj)).a("bottomFade", "")));
        _bottomFade.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
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

        final NUXCoreConceptsSaveFragment this$0;

        public void onGlobalLayout()
        {
            Events.post(new com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper.NUXCoreConceptsLayoutDoneEvent(_title));
            getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            _titleAutofitHelper.a(false);
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsSaveFragment.this;
            super();
        }
    }

}
