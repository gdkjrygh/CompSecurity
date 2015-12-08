// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class PopoverView extends RelativeLayout
    implements android.view.View.OnTouchListener
{

    public static final int PopoverArrowDirectionAny = 14;
    public static final int PopoverArrowDirectionDown = 2;
    public static final int PopoverArrowDirectionLeft = 4;
    public static final int PopoverArrowDirectionRight = 8;
    private int animationTime;
    private Point contentSizeForViewInPopover;
    private boolean isAnimating;
    public int popoverArrowDownLeftDrawable;
    public int popoverArrowDownRightDrawable;
    public int popoverArrowLeftDrawable;
    public int popoverArrowRightDrawable;
    private Rect popoverLayoutRect;
    private RelativeLayout popoverView;
    private SparseArray possibleRects;
    private Point realContentSize;
    private ViewGroup superview;

    public PopoverView(Context context, int i)
    {
        super(context);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(inflate(context, i, null));
    }

    public PopoverView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(inflate(context, i, null));
    }

    public PopoverView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(inflate(context, j, null));
    }

    public PopoverView(Context context, AttributeSet attributeset, int i, View view)
    {
        super(context, attributeset, i);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(view);
    }

    public PopoverView(Context context, AttributeSet attributeset, View view)
    {
        super(context, attributeset);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(view);
    }

    public PopoverView(Context context, View view)
    {
        super(context);
        popoverArrowDownLeftDrawable = 0x7f0200b1;
        popoverArrowDownRightDrawable = 0x7f0200b2;
        popoverArrowLeftDrawable = 0x7f0200b3;
        popoverArrowRightDrawable = 0x7f0200b4;
        contentSizeForViewInPopover = new Point(0, 0);
        realContentSize = new Point(0, 0);
        isAnimating = false;
        animationTime = 200;
        initPopoverView(view);
    }

    private void addAvailableRects(Rect rect, int i)
    {
        possibleRects = new SparseArray();
        if ((i & 6) == 6)
        {
            possibleRects.put(6, getRectForArrowDownLeft(rect));
        }
        if ((i & 0xa) == 10)
        {
            possibleRects.put(10, getRectForArrowDownRight(rect));
        }
        if ((i & 8) != 0)
        {
            possibleRects.put(8, getRectForArrowRight(rect));
        }
        if ((i & 4) != 0)
        {
            possibleRects.put(4, getRectForArrowLeft(rect));
        }
    }

    private void addPopoverInRect(Rect rect)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(rect.width(), rect.height());
        layoutparams.leftMargin = rect.left;
        layoutparams.topMargin = rect.top;
        addView(popoverView, layoutparams);
    }

    private Integer getBestRect()
    {
        Integer integer1;
        int i;
        integer1 = null;
        i = 0;
_L6:
        if (i < possibleRects.size()) goto _L2; else goto _L1
_L1:
        Integer integer2 = integer1;
_L4:
        return integer2;
_L2:
        Integer integer;
        integer = Integer.valueOf(possibleRects.keyAt(i));
        if ((integer.intValue() & 2) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        integer2 = integer;
        if (((Rect)possibleRects.get(integer.intValue())).top > 25) goto _L4; else goto _L3
_L3:
        if (integer1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        integer1 = integer;
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        Rect rect = (Rect)possibleRects.get(integer1.intValue());
        Rect rect1 = (Rect)possibleRects.get(integer.intValue());
        if (rect.width() * rect.height() < rect1.width() * rect1.height())
        {
            integer1 = integer;
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public static Rect getFrameForView(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        return new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
    }

    private Rect getRectForArrowDownLeft(Rect rect)
    {
        Rect rect1;
        int k;
        int l;
        int i1;
        int j1;
        k = popoverLayoutRect.width();
        l = rect.top - popoverLayoutRect.top;
        int i = k;
        if (k < 0)
        {
            i = 0;
        }
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        rect1 = new Rect();
        getResources().getDrawable(popoverArrowDownLeftDrawable).getPadding(rect1);
        i1 = getResources().getDimensionPixelSize(0x7f080029);
        l = i;
        i = k;
        k = l;
        if (realContentSize.x + rect1.left > 0)
        {
            k = l;
            if (realContentSize.x + rect1.left + rect1.right < l)
            {
                k = realContentSize.x + rect1.left + rect1.right;
            }
        }
        l = i;
        if (realContentSize.y + rect1.top > 0)
        {
            l = i;
            if (realContentSize.y + rect1.top + rect1.bottom < i)
            {
                l = realContentSize.y + rect1.top + rect1.bottom;
            }
        }
        i1 = rect.centerX() - popoverLayoutRect.left - i1;
        j1 = rect.top - popoverLayoutRect.top - l - 5;
        if (i1 >= -rect1.left) goto _L2; else goto _L1
_L1:
        int j = -rect1.left;
_L4:
        return new Rect(j, j1, j + k, j1 + l);
_L2:
        j = i1;
        if (i1 + k > popoverLayoutRect.width())
        {
            j = popoverLayoutRect.width() - k;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Rect getRectForArrowDownRight(Rect rect)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        k = popoverLayoutRect.width();
        int i = k;
        if (k < 0)
        {
            i = 0;
        }
        l = rect.top - popoverLayoutRect.top;
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        Rect rect1 = new Rect();
        getResources().getDrawable(popoverArrowDownRightDrawable).getPadding(rect1);
        j1 = getResources().getDimensionPixelSize(0x7f080029);
        l = i;
        i = k;
        k = l;
        if (realContentSize.x + rect1.left > 0)
        {
            k = l;
            if (realContentSize.x + rect1.left + rect1.right < l)
            {
                k = realContentSize.x + rect1.left + rect1.right;
            }
        }
        l = i;
        if (realContentSize.y + rect1.top > 0)
        {
            l = i;
            if (realContentSize.y + rect1.top + rect1.bottom < i)
            {
                l = realContentSize.y + rect1.top + rect1.bottom;
            }
        }
        i1 = rect.centerX() - popoverLayoutRect.left - (k - j1);
        k1 = rect.top - popoverLayoutRect.top - l - 5;
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return new Rect(j, k1, j + k, k1 + l);
_L2:
        j = i1;
        if (i1 + k > popoverLayoutRect.width())
        {
            j = popoverLayoutRect.width() - k - j1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Rect getRectForArrowLeft(Rect rect)
    {
        int k;
        int l;
        int i1;
        int j1;
        k = popoverLayoutRect.width() - (rect.right - popoverLayoutRect.left);
        l = popoverLayoutRect.height();
        int i = k;
        if (k < 0)
        {
            i = 0;
        }
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        Rect rect1 = new Rect();
        getResources().getDrawable(popoverArrowLeftDrawable).getPadding(rect1);
        l = i;
        i = k;
        k = l;
        if (realContentSize.x + rect1.left > 0)
        {
            k = l;
            if (realContentSize.x + rect1.left + rect1.right < l)
            {
                k = realContentSize.x + rect1.left + rect1.bottom;
            }
        }
        l = i;
        if (realContentSize.y + rect1.top > 0)
        {
            l = i;
            if (realContentSize.y + rect1.top + rect1.bottom < i)
            {
                l = realContentSize.y + rect1.top + rect1.bottom;
            }
        }
        j1 = (rect.right - popoverLayoutRect.left) + 5;
        i1 = rect.centerY() - popoverLayoutRect.top - l / 2;
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return new Rect(j1, j, j1 + k, j + l);
_L2:
        j = i1;
        if (i1 + l > popoverLayoutRect.height())
        {
            j = popoverLayoutRect.height() - l;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Rect getRectForArrowRight(Rect rect)
    {
        int k;
        int l;
        int i1;
        int j1;
        k = rect.left - popoverLayoutRect.left;
        l = popoverLayoutRect.height();
        int i = k;
        if (k < 0)
        {
            i = 0;
        }
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        Rect rect1 = new Rect();
        getResources().getDrawable(popoverArrowRightDrawable).getPadding(rect1);
        l = i;
        i = k;
        k = l;
        if (realContentSize.x + rect1.left > 0)
        {
            k = l;
            if (realContentSize.x + rect1.left + rect1.right < l)
            {
                k = realContentSize.x + rect1.left + rect1.right;
            }
        }
        l = i;
        if (realContentSize.y + rect1.top > 0)
        {
            l = i;
            if (realContentSize.y + rect1.top + rect1.bottom < i)
            {
                l = realContentSize.y + rect1.top + rect1.bottom;
            }
        }
        j1 = rect.left - popoverLayoutRect.left - 5 - k;
        i1 = rect.centerY() - popoverLayoutRect.top - l / 2;
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return new Rect(j1, j, j1 + k, j + l);
_L2:
        j = i1;
        if (i1 + l > popoverLayoutRect.height())
        {
            j = popoverLayoutRect.height() - l;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void initPopoverView(View view)
    {
        setBackgroundColor(0);
        setOnTouchListener(this);
        popoverView = new RelativeLayout(getContext());
        popoverView.addView(view, -1, -1);
    }

    public void dissmissPopover(boolean flag)
    {
        if (!flag)
        {
            popoverView.removeAllViews();
            removeAllViews();
            superview.removeView(this);
        } else
        if (!isAnimating)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(animationTime);
            alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final PopoverView this$0;

                public void onAnimationEnd(Animation animation)
                {
                    popoverView.removeAllViews();
                    removeAllViews();
                    superview.removeView(PopoverView.this);
                    isAnimating = false;
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = PopoverView.this;
                super();
            }
            });
            isAnimating = true;
            startAnimation(alphaanimation);
            return;
        }
    }

    public Point getContentSizeForViewInPopover()
    {
        return contentSizeForViewInPopover;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!isAnimating && view == this)
        {
            dissmissPopover(true);
        }
        return false;
    }

    public void setContentSizeForViewInPopover(Point point)
    {
        contentSizeForViewInPopover = point;
        realContentSize = new Point(point);
        point = realContentSize;
        point.x = point.x + (popoverView.getPaddingLeft() + popoverView.getPaddingRight());
        point = realContentSize;
        point.y = point.y + (popoverView.getPaddingTop() + popoverView.getPaddingBottom());
    }

    public void setPopoverArrowDownLeftDrawable(int i)
    {
        popoverArrowDownLeftDrawable = i;
    }

    public void setPopoverArrowDownRightDrawable(int i)
    {
        popoverArrowDownRightDrawable = i;
    }

    public void setPopoverArrowLeftDrawable(int i)
    {
        popoverArrowLeftDrawable = i;
    }

    public void setPopoverArrowRightDrawable(int i)
    {
        popoverArrowRightDrawable = i;
    }

    public void showPopoverFromRectInViewGroup(ViewGroup viewgroup, Rect rect, int i, boolean flag)
    {
        superview = viewgroup;
        viewgroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        popoverLayoutRect = getFrameForView(superview);
        addAvailableRects(rect, i);
        viewgroup = getBestRect();
        viewgroup.intValue();
        JVM INSTR tableswitch 4 10: default 88
    //                   4 327
    //                   5 88
    //                   6 285
    //                   7 88
    //                   8 313
    //                   9 88
    //                   10 299;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L5
_L1:
        rect = (Rect)possibleRects.get(viewgroup.intValue());
        addPopoverInRect(rect);
        if (!flag || isAnimating) goto _L7; else goto _L6
_L6:
        float f = getResources().getDimension(0x7f080029);
        viewgroup.intValue();
        JVM INSTR tableswitch 4 10: default 176
    //                   4 418
    //                   5 176
    //                   6 341
    //                   7 176
    //                   8 395
    //                   9 176
    //                   10 365;
           goto _L8 _L9 _L8 _L10 _L8 _L11 _L8 _L12
_L9:
        break MISSING_BLOCK_LABEL_418;
_L8:
        viewgroup = new ScaleAnimation(0.05F, 1.0F, 0.05F, 1.0F);
_L13:
        rect = new AlphaAnimation(0.0F, 1.0F);
        rect.setInterpolator(new LinearInterpolator());
        viewgroup.setInterpolator(new OvershootInterpolator(2.0F));
        AnimationSet animationset = new AnimationSet(false);
        animationset.addAnimation(viewgroup);
        animationset.addAnimation(rect);
        animationset.setDuration(animationTime);
        animationset.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final PopoverView this$0;

            public void onAnimationEnd(Animation animation)
            {
                isAnimating = false;
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = PopoverView.this;
                super();
            }
        });
        isAnimating = true;
        popoverView.startAnimation(animationset);
_L7:
        return;
_L3:
        popoverView.setBackgroundResource(popoverArrowDownLeftDrawable);
          goto _L1
_L5:
        popoverView.setBackgroundResource(popoverArrowDownRightDrawable);
          goto _L1
_L4:
        popoverView.setBackgroundResource(popoverArrowRightDrawable);
          goto _L1
_L2:
        popoverView.setBackgroundResource(popoverArrowLeftDrawable);
          goto _L1
_L10:
        viewgroup = new ScaleAnimation(0.05F, 1.0F, 0.05F, 1.0F, 0, f, 1, 1.0F);
          goto _L13
_L12:
        viewgroup = new ScaleAnimation(0.05F, 1.0F, 0.05F, 1.0F, 0, (float)rect.width() - f, 1, 1.0F);
          goto _L13
_L11:
        viewgroup = new ScaleAnimation(0.05F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.5F);
          goto _L13
        viewgroup = new ScaleAnimation(0.05F, 1.0F, 1.0F, 1.0F, 0.0F, 0.5F);
          goto _L13
    }



}
