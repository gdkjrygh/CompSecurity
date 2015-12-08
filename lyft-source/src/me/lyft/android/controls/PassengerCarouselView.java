// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.LyftApplication;
import me.lyft.android.common.Unit;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

// Referenced classes of package me.lyft.android.controls:
//            AnimationReadyImageView, SimpleAnimationListener

public class PassengerCarouselView extends LinearLayout
{

    private static final long ANIMATION_DELAY = 500L;
    private static final long ANIMATION_DURATION = 400L;
    private static final float SCALE_FACTOR = 1.5F;
    private android.animation.Animator.AnimatorListener carouselAnimatorListener;
    private AnimatorSet currentAnimation;
    private int currentColorIndex;
    private int currentFaceIndex;
    private final int defaultImageWidth;
    private boolean forceStopAnimations;
    ImageLoader imageLoader;
    private int indexes[];
    private boolean isAnimationRunning;
    private final int margin;
    private String matchingFaces[];
    private int rainbowColors[];
    private final int scaledImageWidth;
    private float translationOffsetX;

    public PassengerCarouselView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        currentColorIndex = -1;
        currentFaceIndex = 0;
        carouselAnimatorListener = new SimpleAnimationListener() {

            private float firstX;
            final PassengerCarouselView this$0;

            public void onAnimationEnd(Animator animator)
            {
                isAnimationRunning = false;
                animator = (ImageView)getChildAt(indexes[indexes.length - 1]);
                animator.setX(firstX);
                animator.setBackgroundColor(getNextRainbowColor());
                setNextMatchingFace(animator);
                shiftIndexes();
                if (!forceStopAnimations)
                {
                    runAnimations();
                }
            }

            public void onAnimationStart(Animator animator)
            {
                firstX = ((ImageView)getChildAt(indexes[0])).getX();
            }

            
            {
                this$0 = PassengerCarouselView.this;
                super();
            }
        };
        init();
        context = MetricsUtils.fromContext(context);
        defaultImageWidth = context.dpToPixels(60F);
        scaledImageWidth = (int)((float)defaultImageWidth * 1.5F);
        margin = context.dpToPixels(8F);
    }

    private AnimationReadyImageView createCarouselImageView()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(defaultImageWidth, defaultImageWidth);
        layoutparams.setMargins(margin, 0, margin, 0);
        AnimationReadyImageView animationreadyimageview = new AnimationReadyImageView(getContext());
        animationreadyimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        animationreadyimageview.setBackgroundColor(getNextRainbowColor());
        animationreadyimageview.setImageResource(0x7f020189);
        setNextMatchingFace(animationreadyimageview);
        animationreadyimageview.setLayoutParams(layoutparams);
        return animationreadyimageview;
    }

    private List createScaleAndTranslateAnimation(View view, boolean flag)
    {
        float f1 = 1.5F;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "x", new float[] {
            (float)(defaultImageWidth + margin * 2) + translationOffsetX + view.getX()
        });
        float f;
        ObjectAnimator objectanimator1;
        ArrayList arraylist;
        if (flag)
        {
            f = 1.5F;
        } else
        {
            f = 1.0F;
        }
        objectanimator1 = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
            f
        });
        if (flag)
        {
            f = f1;
        } else
        {
            f = 1.0F;
        }
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
            f
        });
        arraylist = new ArrayList();
        arraylist.add(objectanimator);
        arraylist.add(objectanimator1);
        arraylist.add(view);
        return arraylist;
    }

    private int getNextRainbowColor()
    {
        if (currentColorIndex < 0)
        {
            currentColorIndex = rainbowColors.length / 2;
        } else
        if (currentColorIndex == rainbowColors.length - 1)
        {
            currentColorIndex = 0;
        } else
        {
            currentColorIndex = currentColorIndex + 1;
        }
        return rainbowColors[currentColorIndex];
    }

    private void init()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            rainbowColors = getResources().getIntArray(0x7f0a0002);
            return;
        }
    }

    private void runAnimations()
    {
        if (isAnimationRunning)
        {
            return;
        }
        isAnimationRunning = true;
        int j = getChildCount();
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            ImageView imageview = (ImageView)getChildAt(indexes[i]);
            float f = defaultImageWidth + margin * 2;
            if (i == j / 2)
            {
                arraylist.addAll(createScaleAndTranslateAnimation(imageview, false));
            } else
            if (i == j / 2 - 1)
            {
                arraylist.addAll(createScaleAndTranslateAnimation(imageview, true));
            } else
            {
                arraylist.add(ObjectAnimator.ofFloat(imageview, "x", new float[] {
                    f + imageview.getX()
                }));
            }
            i++;
        }
        currentAnimation = new AnimatorSet();
        currentAnimation.playTogether(arraylist);
        currentAnimation.setDuration(400L);
        currentAnimation.setStartDelay(500L);
        currentAnimation.addListener(carouselAnimatorListener);
        currentAnimation.start();
    }

    private void setNextMatchingFace(ImageView imageview)
    {
        if (matchingFaces == null || matchingFaces.length <= 0 || imageLoader == null)
        {
            return;
        } else
        {
            currentFaceIndex = (currentFaceIndex + 1) % matchingFaces.length;
            imageLoader.load(matchingFaces[currentFaceIndex]).placeholder(0x7f020189).centerCrop().fit().into(imageview);
            return;
        }
    }

    private void shiftIndexes()
    {
        int j = indexes[indexes.length - 1];
        for (int i = indexes.length - 1; i > 0; i--)
        {
            indexes[i] = indexes[i - 1];
        }

        indexes[0] = j;
    }

    private void startAnimations()
    {
        stopAnimations();
        forceStopAnimations = false;
        runAnimations();
    }

    private void stopAnimations()
    {
        clearAnimation();
        forceStopAnimations = true;
        currentAnimation = null;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            LyftApplication.from(getContext()).inject(this);
            forceStopAnimations = false;
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        stopAnimations();
        imageLoader = null;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        removeAllViews();
        i = (i - scaledImageWidth) / (defaultImageWidth + margin);
        if (i % 2 == 0)
        {
            i += 3;
        } else
        {
            i += 4;
        }
        indexes = new int[i];
        translationOffsetX = Math.abs((defaultImageWidth + margin) - scaledImageWidth) / 2;
        j = 0;
        while (j < i) 
        {
            AnimationReadyImageView animationreadyimageview = createCarouselImageView();
            if (j == i / 2)
            {
                animationreadyimageview.setScaleX(1.5F);
                animationreadyimageview.setScaleY(1.5F);
            } else
            if (j < i / 2)
            {
                animationreadyimageview.setTranslationX(-translationOffsetX);
            } else
            {
                animationreadyimageview.setTranslationX(translationOffsetX);
            }
            addView(animationreadyimageview);
            indexes[j] = j;
            j++;
        }
        ((AnimationReadyImageView)getChildAt(getChildCount() - 1)).subscribeOnSizeChanged().observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureObserver() {

            final PassengerCarouselView this$0;

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((Unit)obj);
            }

            public void onSafeNext(Unit unit)
            {
                super.onSafeNext(unit);
                startAnimations();
            }

            
            {
                this$0 = PassengerCarouselView.this;
                super();
            }
        });
        post(new Runnable() {

            final PassengerCarouselView this$0;

            public void run()
            {
                requestLayout();
            }

            
            {
                this$0 = PassengerCarouselView.this;
                super();
            }
        });
    }

    public void setMatchingFaces(String as[])
    {
        matchingFaces = as;
    }




/*
    static boolean access$202(PassengerCarouselView passengercarouselview, boolean flag)
    {
        passengercarouselview.isAnimationRunning = flag;
        return flag;
    }

*/





}
