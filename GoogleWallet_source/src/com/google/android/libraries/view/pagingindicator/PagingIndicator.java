// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Arrays;

public class PagingIndicator extends View
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    public final class LeftwardStartPredicate extends StartPredicate
    {

        final PagingIndicator this$0;

        final boolean shouldStart(float f)
        {
            return f < thresholdValue;
        }

        public LeftwardStartPredicate(float f)
        {
            this$0 = PagingIndicator.this;
            super(f);
        }
    }

    public final class PendingRetreatAnimator extends PendingStartAnimator
    {

        final PagingIndicator this$0;

        public PendingRetreatAnimator(int i, int j, int k, final StartPredicate dotsToHide)
        {
            this.this$0 = PagingIndicator.this;
            super(dotsToHide);
            setDuration(animHalfDuration);
            setInterpolator(interpolator);
            final float initialX1;
            float f;
            float f1;
            float f2;
            if (j > i)
            {
                initialX1 = Math.min(dotCenterX[i], selectedDotX) - dotRadius;
            } else
            {
                initialX1 = dotCenterX[j] - dotRadius;
            }
            if (j > i)
            {
                f = dotCenterX[j] - dotRadius;
            } else
            {
                f = dotCenterX[j] - dotRadius;
            }
            if (j > i)
            {
                f1 = dotCenterX[j] + dotRadius;
            } else
            {
                f1 = Math.max(dotCenterX[i], selectedDotX) + dotRadius;
            }
            if (j > i)
            {
                f2 = dotCenterX[j] + dotRadius;
            } else
            {
                f2 = dotCenterX[j] + dotRadius;
            }
            revealAnimations = new PendingRevealAnimator[k];
            dotsToHide = new int[k];
            if (initialX1 != f)
            {
                setFloatValues(new float[] {
                    initialX1, f
                });
                for (j = 0; j < k; j++)
                {
                    revealAnimations[j] = new PendingRevealAnimator(i + j, new RightwardStartPredicate(dotCenterX[i + j]));
                    dotsToHide[j] = i + j;
                }

                addUpdateListener(new _cls1());
            } else
            {
                setFloatValues(new float[] {
                    f1, f2
                });
                for (j = 0; j < k; j++)
                {
                    revealAnimations[j] = new PendingRevealAnimator(i - j, new LeftwardStartPredicate(dotCenterX[i - j]));
                    dotsToHide[j] = i - j;
                }

                addUpdateListener(new _cls2());
            }
            addListener(f1. new _cls3());
        }
    }

    public final class PendingRevealAnimator extends PendingStartAnimator
    {

        private final int dot;
        final PagingIndicator this$0;


        public PendingRevealAnimator(int i, StartPredicate startpredicate)
        {
            this$0 = PagingIndicator.this;
            super(startpredicate);
            dot = i;
            setFloatValues(new float[] {
                1E-05F, 1.0F
            });
            setDuration(animHalfDuration);
            setInterpolator(interpolator);
            addUpdateListener(new _cls1());
            addListener(new _cls2());
        }
    }

    public abstract class PendingStartAnimator extends ValueAnimator
    {

        protected boolean hasStarted;
        protected StartPredicate predicate;
        final PagingIndicator this$0;

        public final void startIfNecessary(float f)
        {
            if (!hasStarted && predicate.shouldStart(f))
            {
                start();
                hasStarted = true;
            }
        }

        public PendingStartAnimator(StartPredicate startpredicate)
        {
            this$0 = PagingIndicator.this;
            super();
            predicate = startpredicate;
            hasStarted = false;
        }
    }

    public final class RightwardStartPredicate extends StartPredicate
    {

        final PagingIndicator this$0;

        final boolean shouldStart(float f)
        {
            return f > thresholdValue;
        }

        public RightwardStartPredicate(float f)
        {
            this$0 = PagingIndicator.this;
            super(f);
        }
    }

    public abstract class StartPredicate
    {

        final PagingIndicator this$0;
        protected float thresholdValue;

        abstract boolean shouldStart(float f);

        public StartPredicate(float f)
        {
            this$0 = PagingIndicator.this;
            super();
            thresholdValue = f;
        }
    }


    public static final String TAG = com/google/android/libraries/view/pagingindicator/PagingIndicator.getSimpleName();
    private long animDuration;
    private long animHalfDuration;
    private boolean attachedState;
    private final Path combinedUnselectedPath;
    float controlX1;
    float controlX2;
    float controlY1;
    float controlY2;
    private int currentPage;
    private float dotBottomY;
    private float dotCenterX[];
    private float dotCenterY;
    private int dotDiameter;
    private float dotRadius;
    private float dotRevealFractions[];
    private float dotTopY;
    float endX1;
    float endX2;
    float endY1;
    float endY2;
    private int gap;
    private float halfDotRadius;
    private final Interpolator interpolator;
    private AnimatorSet joiningAnimationSet;
    private ValueAnimator joiningAnimations[];
    private float joiningFractions[];
    private ValueAnimator moveAnimation;
    private android.support.v4.view.ViewPager.OnPageChangeListener pageChangeListener;
    private int pageCount;
    private final RectF rectF;
    private PendingRetreatAnimator retreatAnimation;
    private float retreatingJoinX1;
    private float retreatingJoinX2;
    private PendingRevealAnimator revealAnimations[];
    private int selectedColour;
    private boolean selectedDotInPosition;
    private float selectedDotX;
    private final Paint selectedPaint;
    private int unselectedColour;
    private final Path unselectedDotLeftPath;
    private final Path unselectedDotPath;
    private final Path unselectedDotRightPath;
    private final Paint unselectedPaint;
    private ViewPager viewPager;

    public PagingIndicator(Context context)
    {
        this(context, null, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        int j = (int)context.getResources().getDisplayMetrics().scaledDensity;
        attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.PagingIndicator, i, 0);
        dotDiameter = attributeset.getDimensionPixelSize(R.styleable.PagingIndicator_dotDiameter, j * 8);
        dotRadius = dotDiameter / 2;
        halfDotRadius = dotRadius / 2.0F;
        gap = attributeset.getDimensionPixelSize(R.styleable.PagingIndicator_dotGap, j * 12);
        animDuration = attributeset.getInteger(R.styleable.PagingIndicator_animationDuration, 400);
        animHalfDuration = animDuration / 2L;
        unselectedColour = attributeset.getColor(R.styleable.PagingIndicator_pageIndicatorColor, 0x80ffffff);
        selectedColour = attributeset.getColor(R.styleable.PagingIndicator_currentPageIndicatorColor, -1);
        attributeset.recycle();
        unselectedPaint = new Paint(1);
        unselectedPaint.setColor(unselectedColour);
        selectedPaint = new Paint(1);
        selectedPaint.setColor(selectedColour);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            interpolator = AnimationUtils.loadInterpolator(context, 0x10c000d);
        } else
        {
            interpolator = AnimationUtils.loadInterpolator(context, 0x10a0004);
        }
        combinedUnselectedPath = new Path();
        unselectedDotPath = new Path();
        unselectedDotLeftPath = new Path();
        unselectedDotRightPath = new Path();
        rectF = new RectF();
        addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() {

            final PagingIndicator this$0;

            public final void onViewAttachedToWindow(View view)
            {
                attachedState = true;
            }

            public final void onViewDetachedFromWindow(View view)
            {
                attachedState = false;
            }

            
            {
                this$0 = PagingIndicator.this;
                super();
            }
        });
    }

    private void calculateDotPositions()
    {
        int i = getPaddingLeft();
        int k = getPaddingTop();
        float f = (getWidth() - getPaddingRight() - i - getRequiredWidth()) / 2 + i;
        float f1 = dotRadius;
        dotCenterX = new float[pageCount];
        for (int j = 0; j < pageCount; j++)
        {
            dotCenterX[j] = (float)((dotDiameter + gap) * j) + (f + f1);
        }

        dotTopY = k;
        dotCenterY = (float)k + dotRadius;
        dotBottomY = dotDiameter + k;
        setCurrentPageImmediate();
    }

    private void cancelJoiningAnimations()
    {
        if (joiningAnimationSet != null && joiningAnimationSet.isRunning())
        {
            joiningAnimationSet.cancel();
        }
    }

    private void cancelMoveAnimation()
    {
        if (moveAnimation != null && moveAnimation.isRunning())
        {
            moveAnimation.cancel();
        }
    }

    private void cancelRetreatAnimation()
    {
        if (retreatAnimation != null && retreatAnimation.isRunning())
        {
            retreatAnimation.cancel();
        }
    }

    private void cancelRevealAnimations()
    {
        if (revealAnimations != null)
        {
            PendingRevealAnimator apendingrevealanimator[] = revealAnimations;
            int j = apendingrevealanimator.length;
            for (int i = 0; i < j; i++)
            {
                apendingrevealanimator[i].cancel();
            }

        }
    }

    private void cancelRunningAnimations()
    {
        cancelMoveAnimation();
        cancelJoiningAnimations();
        cancelRetreatAnimation();
        cancelRevealAnimations();
        resetState();
    }

    private void clearJoiningFractions()
    {
        Arrays.fill(joiningFractions, 0.0F);
        postInvalidateOnAnimation();
    }

    private ValueAnimator createJoiningAnimator(final int leftJoiningDot, long l)
    {
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PagingIndicator this$0;
            final int val$leftJoiningDot;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                setJoiningFraction(leftJoiningDot, valueanimator1.getAnimatedFraction());
            }

            
            {
                this$0 = PagingIndicator.this;
                leftJoiningDot = i;
                super();
            }
        });
        valueanimator.setDuration(animHalfDuration);
        valueanimator.setStartDelay(l);
        valueanimator.setInterpolator(interpolator);
        return valueanimator;
    }

    private ValueAnimator createMoveSelectedAnimator(float f, int i, int j, int k)
    {
        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
            selectedDotX, f
        });
        Object obj;
        long l;
        if (j > i)
        {
            obj = new RightwardStartPredicate(f - (f - selectedDotX) * 0.25F);
        } else
        {
            obj = new LeftwardStartPredicate((selectedDotX - f) * 0.25F + f);
        }
        retreatAnimation = new PendingRetreatAnimator(i, j, k, ((StartPredicate) (obj)));
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PagingIndicator this$0;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                selectedDotX = ((Float)valueanimator1.getAnimatedValue()).floatValue();
                retreatAnimation.startIfNecessary(selectedDotX);
                postInvalidateOnAnimation();
            }

            
            {
                this$0 = PagingIndicator.this;
                super();
            }
        });
        valueanimator.addListener(new AnimatorListenerAdapter() {

            final PagingIndicator this$0;

            public final void onAnimationEnd(Animator animator)
            {
                selectedDotInPosition = true;
            }

            public final void onAnimationStart(Animator animator)
            {
                selectedDotInPosition = false;
            }

            
            {
                this$0 = PagingIndicator.this;
                super();
            }
        });
        if (selectedDotInPosition)
        {
            l = animDuration / 4L;
        } else
        {
            l = 0L;
        }
        valueanimator.setStartDelay(l);
        valueanimator.setDuration((animDuration * 3L) / 4L);
        valueanimator.setInterpolator(interpolator);
        return valueanimator;
    }

    private void drawSelected(Canvas canvas)
    {
        canvas.drawCircle(selectedDotX, dotCenterY, dotRadius, selectedPaint);
    }

    private void drawUnselected(Canvas canvas)
    {
        combinedUnselectedPath.rewind();
        int i = 0;
        while (i < pageCount) 
        {
            int j;
            if (i == pageCount - 1)
            {
                j = i;
            } else
            {
                j = i + 1;
            }
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                float f1 = dotCenterX[i];
                float f2 = dotCenterX[j];
                float f;
                Path path;
                if (i == pageCount - 1)
                {
                    f = -1F;
                } else
                {
                    f = joiningFractions[i];
                }
                path = getUnselectedPath(i, f1, f2, f, dotRevealFractions[i]);
                combinedUnselectedPath.op(path, android.graphics.Path.Op.UNION);
            } else
            {
                canvas.drawCircle(dotCenterX[i], dotCenterY, dotRadius, unselectedPaint);
            }
            i++;
        }
        if (retreatingJoinX1 != -1F && android.os.Build.VERSION.SDK_INT >= 21)
        {
            combinedUnselectedPath.op(getRetreatingJoinPath(), android.graphics.Path.Op.UNION);
        }
        canvas.drawPath(combinedUnselectedPath, unselectedPaint);
    }

    private int getDesiredHeight()
    {
        return getPaddingTop() + dotDiameter + getPaddingBottom();
    }

    private int getDesiredWidth()
    {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth()
    {
        return pageCount * dotDiameter + (pageCount - 1) * gap;
    }

    private Path getRetreatingJoinPath()
    {
        unselectedDotPath.rewind();
        rectF.set(retreatingJoinX1, dotTopY, retreatingJoinX2, dotBottomY);
        unselectedDotPath.addRoundRect(rectF, dotRadius, dotRadius, android.graphics.Path.Direction.CW);
        return unselectedDotPath;
    }

    private Path getUnselectedPath(int i, float f, float f1, float f2, float f3)
    {
        unselectedDotPath.rewind();
        if ((f2 == 0.0F || f2 == -1F) && f3 == 0.0F && (i != currentPage || !selectedDotInPosition))
        {
            unselectedDotPath.addCircle(dotCenterX[i], dotCenterY, dotRadius, android.graphics.Path.Direction.CW);
        }
        if (f2 > 0.0F && f2 < 0.5F && retreatingJoinX1 == -1F)
        {
            unselectedDotLeftPath.rewind();
            unselectedDotLeftPath.moveTo(f, dotBottomY);
            rectF.set(f - dotRadius, dotTopY, dotRadius + f, dotBottomY);
            unselectedDotLeftPath.arcTo(rectF, 90F, 180F, true);
            endX1 = dotRadius + f + (float)gap * f2;
            endY1 = dotCenterY;
            controlX1 = halfDotRadius + f;
            controlY1 = dotTopY;
            controlX2 = endX1;
            controlY2 = endY1 - halfDotRadius;
            unselectedDotLeftPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX1, endY1);
            endX2 = f;
            endY2 = dotBottomY;
            controlX1 = endX1;
            controlY1 = endY1 + halfDotRadius;
            controlX2 = halfDotRadius + f;
            controlY2 = dotBottomY;
            unselectedDotLeftPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX2, endY2);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                unselectedDotPath.op(unselectedDotLeftPath, android.graphics.Path.Op.UNION);
            }
            unselectedDotRightPath.rewind();
            unselectedDotRightPath.moveTo(f1, dotBottomY);
            rectF.set(f1 - dotRadius, dotTopY, dotRadius + f1, dotBottomY);
            unselectedDotRightPath.arcTo(rectF, 90F, -180F, true);
            endX1 = f1 - dotRadius - (float)gap * f2;
            endY1 = dotCenterY;
            controlX1 = f1 - halfDotRadius;
            controlY1 = dotTopY;
            controlX2 = endX1;
            controlY2 = endY1 - halfDotRadius;
            unselectedDotRightPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX1, endY1);
            endX2 = f1;
            endY2 = dotBottomY;
            controlX1 = endX1;
            controlY1 = endY1 + halfDotRadius;
            controlX2 = endX2 - halfDotRadius;
            controlY2 = dotBottomY;
            unselectedDotRightPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX2, endY2);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                unselectedDotPath.op(unselectedDotRightPath, android.graphics.Path.Op.UNION);
            }
        }
        if (f2 > 0.5F && f2 < 1.0F && retreatingJoinX1 == -1F)
        {
            unselectedDotPath.moveTo(f, dotBottomY);
            rectF.set(f - dotRadius, dotTopY, dotRadius + f, dotBottomY);
            unselectedDotPath.arcTo(rectF, 90F, 180F, true);
            endX1 = dotRadius + f + (float)(gap / 2);
            endY1 = dotCenterY - dotRadius * f2;
            controlX1 = endX1 - dotRadius * f2;
            controlY1 = dotTopY;
            controlX2 = endX1 - (1.0F - f2) * dotRadius;
            controlY2 = endY1;
            unselectedDotPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX1, endY1);
            endX2 = f1;
            endY2 = dotTopY;
            controlX1 = endX1 + (1.0F - f2) * dotRadius;
            controlY1 = endY1;
            controlX2 = endX1 + dotRadius * f2;
            controlY2 = dotTopY;
            unselectedDotPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX2, endY2);
            rectF.set(f1 - dotRadius, dotTopY, dotRadius + f1, dotBottomY);
            unselectedDotPath.arcTo(rectF, 270F, 180F, true);
            endY1 = dotCenterY + dotRadius * f2;
            controlX1 = endX1 + dotRadius * f2;
            controlY1 = dotBottomY;
            controlX2 = endX1 + (1.0F - f2) * dotRadius;
            controlY2 = endY1;
            unselectedDotPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX1, endY1);
            endX2 = f;
            endY2 = dotBottomY;
            controlX1 = endX1 - (1.0F - f2) * dotRadius;
            controlY1 = endY1;
            controlX2 = endX1 - dotRadius * f2;
            controlY2 = endY2;
            unselectedDotPath.cubicTo(controlX1, controlY1, controlX2, controlY2, endX2, endY2);
        }
        if (f2 == 1.0F && retreatingJoinX1 == -1F)
        {
            rectF.set(f - dotRadius, dotTopY, dotRadius + f1, dotBottomY);
            unselectedDotPath.addRoundRect(rectF, dotRadius, dotRadius, android.graphics.Path.Direction.CW);
        }
        if (f3 > 1E-05F)
        {
            unselectedDotPath.addCircle(f, dotCenterY, dotRadius * f3, android.graphics.Path.Direction.CW);
        }
        return unselectedDotPath;
    }

    private void resetState()
    {
        joiningFractions = new float[pageCount - 1];
        Arrays.fill(joiningFractions, 0.0F);
        dotRevealFractions = new float[pageCount];
        Arrays.fill(dotRevealFractions, 0.0F);
        retreatingJoinX1 = -1F;
        retreatingJoinX2 = -1F;
        selectedDotInPosition = true;
    }

    private void setCurrentPageImmediate()
    {
        if (viewPager != null)
        {
            currentPage = viewPager.getCurrentItem();
        } else
        {
            currentPage = 0;
        }
        selectedDotX = dotCenterX[currentPage];
    }

    private void setDotRevealFraction(int i, float f)
    {
        dotRevealFractions[i] = f;
        postInvalidateOnAnimation();
    }

    private void setJoiningFraction(int i, float f)
    {
        joiningFractions[i] = f;
        postInvalidateOnAnimation();
    }

    private void setPageCount(int i)
    {
        pageCount = i;
        calculateDotPositions();
        resetState();
    }

    private void setSelectedPage(int i)
    {
        if (i == currentPage)
        {
            return;
        }
        int l = currentPage;
        currentPage = i;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            cancelRunningAnimations();
            int i1 = Math.abs(i - l);
            moveAnimation = createMoveSelectedAnimator(dotCenterX[i], l, i, i1);
            joiningAnimations = new ValueAnimator[i1];
            int j = 0;
            while (j < i1) 
            {
                ValueAnimator avalueanimator[] = joiningAnimations;
                int k;
                if (i > l)
                {
                    k = l + j;
                } else
                {
                    k = l - 1 - j;
                }
                avalueanimator[j] = createJoiningAnimator(k, (long)j * (animDuration / 8L));
                j++;
            }
            moveAnimation.start();
            startJoiningAnimations();
            return;
        } else
        {
            setCurrentPageImmediate();
            invalidate();
            return;
        }
    }

    private void startJoiningAnimations()
    {
        joiningAnimationSet = new AnimatorSet();
        joiningAnimationSet.playTogether(joiningAnimations);
        joiningAnimationSet.start();
    }

    protected void onDraw(Canvas canvas)
    {
        if (viewPager == null || pageCount == 0)
        {
            return;
        } else
        {
            drawUnselected(canvas);
            drawSelected(canvas);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = getDesiredHeight();
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 2: default 36
    //                   -2147483648: 93
    //                   1073741824: 85;
           goto _L1 _L2 _L3
_L1:
        j = k;
_L7:
        k = getDesiredWidth();
        android.view.View.MeasureSpec.getMode(i);
        JVM INSTR lookupswitch 2: default 72
    //                   -2147483648: 113
    //                   1073741824: 105;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_113;
_L4:
        i = k;
_L8:
        setMeasuredDimension(i, j);
        calculateDotPositions();
        return;
_L3:
        j = android.view.View.MeasureSpec.getSize(j);
          goto _L7
_L2:
        j = Math.min(k, android.view.View.MeasureSpec.getSize(j));
          goto _L7
_L6:
        i = android.view.View.MeasureSpec.getSize(i);
          goto _L8
        i = Math.min(k, android.view.View.MeasureSpec.getSize(i));
          goto _L8
    }

    public final void onPageScrollStateChanged(int i)
    {
        if (pageChangeListener != null)
        {
            pageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if (pageChangeListener != null)
        {
            pageChangeListener.onPageScrolled(i, f, j);
        }
    }

    public final void onPageSelected(int i)
    {
        if (attachedState)
        {
            setSelectedPage(i);
        } else
        {
            setCurrentPageImmediate();
        }
        if (pageChangeListener != null)
        {
            pageChangeListener.onPageSelected(i);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        setMeasuredDimension(i, j);
        calculateDotPositions();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        pageChangeListener = onpagechangelistener;
    }

    public void setViewPager(ViewPager viewpager)
    {
        viewPager = viewpager;
        viewpager.setOnPageChangeListener(this);
        setPageCount(viewpager.getAdapter().getCount());
        viewpager.getAdapter().registerDataSetObserver(new DataSetObserver() {

            final PagingIndicator this$0;

            public final void onChanged()
            {
                setPageCount(viewPager.getAdapter().getCount());
            }

            
            {
                this$0 = PagingIndicator.this;
                super();
            }
        });
        setCurrentPageImmediate();
    }



/*
    static boolean access$002(PagingIndicator pagingindicator, boolean flag)
    {
        pagingindicator.attachedState = flag;
        return flag;
    }

*/





/*
    static PendingRevealAnimator[] access$1102(PagingIndicator pagingindicator, PendingRevealAnimator apendingrevealanimator[])
    {
        pagingindicator.revealAnimations = apendingrevealanimator;
        return apendingrevealanimator;
    }

*/



/*
    static float access$1202(PagingIndicator pagingindicator, float f)
    {
        pagingindicator.retreatingJoinX1 = f;
        return f;
    }

*/



/*
    static float access$1302(PagingIndicator pagingindicator, float f)
    {
        pagingindicator.retreatingJoinX2 = f;
        return f;
    }

*/







/*
    static float access$302(PagingIndicator pagingindicator, float f)
    {
        pagingindicator.selectedDotX = f;
        return f;
    }

*/



/*
    static boolean access$502(PagingIndicator pagingindicator, boolean flag)
    {
        pagingindicator.selectedDotInPosition = flag;
        return flag;
    }

*/





    // Unreferenced inner class com/google/android/libraries/view/pagingindicator/PagingIndicator$PendingRetreatAnimator$1

/* anonymous class */
    final class PendingRetreatAnimator._cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PendingRetreatAnimator this$1;
        final PagingIndicator val$this$0;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            retreatingJoinX1 = ((Float)valueanimator.getAnimatedValue()).floatValue();
            postInvalidateOnAnimation();
            valueanimator = revealAnimations;
            int j = valueanimator.length;
            for (int i = 0; i < j; i++)
            {
                valueanimator[i].startIfNecessary(retreatingJoinX1);
            }

        }

            
            {
                this$1 = final_pendingretreatanimator;
                this$0 = PagingIndicator.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/libraries/view/pagingindicator/PagingIndicator$PendingRetreatAnimator$2

/* anonymous class */
    final class PendingRetreatAnimator._cls2
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PendingRetreatAnimator this$1;
        final PagingIndicator val$this$0;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            retreatingJoinX2 = ((Float)valueanimator.getAnimatedValue()).floatValue();
            postInvalidateOnAnimation();
            valueanimator = revealAnimations;
            int j = valueanimator.length;
            for (int i = 0; i < j; i++)
            {
                valueanimator[i].startIfNecessary(retreatingJoinX2);
            }

        }

            
            {
                this$1 = final_pendingretreatanimator;
                this$0 = PagingIndicator.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/libraries/view/pagingindicator/PagingIndicator$PendingRetreatAnimator$3

/* anonymous class */
    final class PendingRetreatAnimator._cls3 extends AnimatorListenerAdapter
    {

        final PendingRetreatAnimator this$1;
        final int val$dotsToHide[];
        final float val$initialX1;
        final float val$initialX2;
        final PagingIndicator val$this$0;

        public final void onAnimationEnd(Animator animator)
        {
            retreatingJoinX1 = -1F;
            retreatingJoinX2 = -1F;
            postInvalidateOnAnimation();
        }

        public final void onAnimationStart(Animator animator)
        {
            cancelJoiningAnimations();
            clearJoiningFractions();
            animator = dotsToHide;
            int j = animator.length;
            for (int i = 0; i < j; i++)
            {
                int k = animator[i];
                setDotRevealFraction(k, 1E-05F);
            }

            retreatingJoinX1 = initialX1;
            retreatingJoinX2 = initialX2;
            postInvalidateOnAnimation();
        }

            
            {
                this$1 = final_pendingretreatanimator;
                this$0 = pagingindicator;
                dotsToHide = ai;
                initialX1 = f;
                initialX2 = F.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/libraries/view/pagingindicator/PagingIndicator$PendingRevealAnimator$1

/* anonymous class */
    final class PendingRevealAnimator._cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PendingRevealAnimator this$1;
        final PagingIndicator val$this$0;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            setDotRevealFraction(dot, ((Float)valueanimator.getAnimatedValue()).floatValue());
        }

            
            {
                this$1 = final_pendingrevealanimator;
                this$0 = PagingIndicator.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/libraries/view/pagingindicator/PagingIndicator$PendingRevealAnimator$2

/* anonymous class */
    final class PendingRevealAnimator._cls2 extends AnimatorListenerAdapter
    {

        final PendingRevealAnimator this$1;
        final PagingIndicator val$this$0;

        public final void onAnimationEnd(Animator animator)
        {
            setDotRevealFraction(dot, 0.0F);
            postInvalidateOnAnimation();
        }

            
            {
                this$1 = final_pendingrevealanimator;
                this$0 = PagingIndicator.this;
                super();
            }
    }

}
