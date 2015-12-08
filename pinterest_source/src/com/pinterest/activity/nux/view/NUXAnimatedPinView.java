// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.activity.nux.NUXCoreConceptsHelper;
import com.pinterest.activity.nux.adapter.NUXInfiniteListAdapter;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;

public class NUXAnimatedPinView extends FrameLayout
{

    private static int _pos;
    private final int ANIMATION_FADE_DURATION;
    private final float ANIMATION_FRICTION;
    private final int ANIMATION_PAUSE_DURATION;
    private final int ANIMATION_SPRING_DURATION;
    private final int ANIMATION_START_DELAY;
    private final float ANIMATION_TENSION;
    private final float DIMMED_PIN_ALPHA;
    NUXInfiniteListAdapter _adapter;
    private Handler _handler;
    private int _illustrationWidth;
    private boolean _inCoreConceptsExp;
    private boolean _isFirstLaunch;
    private int _numImages;
    private int _startPosition;
    AnimateImagesRunnable animateRunnable;

    public NUXAnimatedPinView(Context context)
    {
        this(context, null);
    }

    public NUXAnimatedPinView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXAnimatedPinView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        DIMMED_PIN_ALPHA = 0.5F;
        ANIMATION_FRICTION = 0.9F;
        ANIMATION_TENSION = 0.4F;
        ANIMATION_PAUSE_DURATION = 400;
        ANIMATION_SPRING_DURATION = 700;
        ANIMATION_FADE_DURATION = 900;
        ANIMATION_START_DELAY = 1000;
        animateRunnable = new AnimateImagesRunnable();
        _isFirstLaunch = true;
        _inCoreConceptsExp = NUXCoreConceptsHelper.inCoreConceptsExp();
    }

    private void animateIllustrations()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < getChildCount()) 
        {
            Object obj = getChildAt(i);
            ObjectAnimator objectanimator = AnimationUtils.springAnimate(((View) (obj)), "translationX", ((View) (obj)).getTranslationX(), ((View) (obj)).getTranslationX() - (float)_illustrationWidth, 0.9F, 0.4F);
            objectanimator.setDuration(700L);
            arraylist.add(objectanimator);
            if (i == _numImages / 2)
            {
                obj = AnimationUtils.springAnimate(((View) (obj)), "alpha", ((View) (obj)).getAlpha(), 1.0F, 0.9F, 0.4F);
            } else
            if (i == _numImages / 2 - 1)
            {
                obj = AnimationUtils.springAnimate(((View) (obj)), "alpha", ((View) (obj)).getAlpha(), 0.5F, 0.9F, 0.4F);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                ((ObjectAnimator) (obj)).setDuration(900L);
                arraylist.add(obj);
            }
            i++;
        }
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(arraylist);
        ((AnimatorSet) (obj)).start();
        ((AnimatorSet) (obj)).addListener(new _cls3());
    }

    private void init()
    {
        _handler = new Handler();
        _adapter = new NUXInfiniteListAdapter();
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inTargetDensity = Device.getDensityDpi();
        obj = BitmapFactory.decodeResource(getResources(), 0x7f02020f, ((android.graphics.BitmapFactory.Options) (obj)));
        int i;
        if (_inCoreConceptsExp)
        {
            i = (int)(Resources.dimension(0x7f0a00d5) + Resources.dimension(0x7f0a0161) * 2.0F);
        } else
        {
            i = (int)((float)((Bitmap) (obj)).getWidth() + Resources.dimension(0x7f0a0162) * 2.0F);
        }
        _illustrationWidth = i;
        _adapter.addItem(getResources().getDrawable(0x7f020215));
        _adapter.addItem(getResources().getDrawable(0x7f020210));
        _adapter.addItem(getResources().getDrawable(0x7f02020f));
        _adapter.addItem(getResources().getDrawable(0x7f020217));
        _adapter.addItem(getResources().getDrawable(0x7f020211));
        _adapter.addItem(getResources().getDrawable(0x7f020212));
    }

    public void finish()
    {
        _handler.removeCallbacks(animateRunnable);
        _adapter.clearItems();
        _adapter = null;
    }

    protected void onFinishInflate()
    {
        init();
        _numImages = (int)(Device.getScreenWidth() / (float)_illustrationWidth);
        if (_numImages % 2 == 0)
        {
            _numImages = _numImages - 1;
        }
        _numImages = _numImages + 3;
        _startPosition = -(_numImages / 2 - 1) * _illustrationWidth;
        for (int i = 0; i < _numImages; i++)
        {
            ImageView imageview = new ImageView(getContext());
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutparams.setMargins(0x7f0a0162, 0, 0x7f0a0162, 0);
            if (_inCoreConceptsExp)
            {
                layoutparams = new android.widget.FrameLayout.LayoutParams((int)Resources.dimension(0x7f0a00d5), -2);
                layoutparams.setMargins(0x7f0a0161, 0, 0x7f0a0161, 0);
            }
            layoutparams.gravity = 17;
            imageview.setLayoutParams(layoutparams);
            imageview.setX(_startPosition + _illustrationWidth * i);
            imageview.setImageDrawable(_adapter.getItem(i));
            imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            if (i != _numImages / 2 - 1)
            {
                imageview.setAlpha(0.5F);
            }
            addView(imageview);
        }

        _pos = _numImages;
        super.onFinishInflate();
    }

    public void onResume()
    {
        if (_isFirstLaunch)
        {
            _handler.postDelayed(new _cls1(), 1000L);
            return;
        } else
        {
            _handler.postDelayed(new _cls2(), 400L);
            return;
        }
    }


/*
    static boolean access$002(NUXAnimatedPinView nuxanimatedpinview, boolean flag)
    {
        nuxanimatedpinview._isFirstLaunch = flag;
        return flag;
    }

*/




/*
    static int access$208()
    {
        int i = _pos;
        _pos = i + 1;
        return i;
    }

*/




    private class AnimateImagesRunnable
        implements Runnable
    {

        final NUXAnimatedPinView this$0;

        public void run()
        {
            View view = getChildAt(0);
            if (view.getTranslationX() + (float)_illustrationWidth < 0.0F && (view instanceof ImageView))
            {
                View view1 = getChildAt(getChildCount() - 1);
                ImageView imageview = (ImageView)view;
                imageview.setTranslationX(view1.getTranslationX() + (float)_illustrationWidth);
                imageview.setImageDrawable(_adapter.getItem(NUXAnimatedPinView._pos % _numImages));
                removeView(view);
                addView(imageview, getChildCount());
            }
            if (((BaseActivity)getContext()).isVisible() && _adapter != null)
            {
                int i = BaseActivity.isVisible;
                animateIllustrations();
            }
        }

        public AnimateImagesRunnable()
        {
            this$0 = NUXAnimatedPinView.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final NUXAnimatedPinView this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            if (_adapter != null)
            {
                _handler.postDelayed(animateRunnable, 400L);
            }
        }

        _cls3()
        {
            this$0 = NUXAnimatedPinView.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final NUXAnimatedPinView this$0;

        public void run()
        {
            _isFirstLaunch = false;
            animateIllustrations();
        }

        _cls1()
        {
            this$0 = NUXAnimatedPinView.this;
            super();
        }
    }


}
