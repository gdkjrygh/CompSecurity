// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

public class SlidingUpPanelLayout extends ViewGroup
{
    private class DragHelperCallback extends android.support.v4.widget.ViewDragHelper.Callback
    {

        final SlidingUpPanelLayout this$0;

        public int clampViewPositionVertical(View view, int i, int j)
        {
            int k;
            if (mIsSlidingUp)
            {
                k = getSlidingTop();
                j = k + mSlideRange;
            } else
            {
                j = getPaddingTop();
                k = j - mSlideRange;
            }
            return Math.min(Math.max(i, k), j);
        }

        public int getViewVerticalDragRange(View view)
        {
            return mSlideRange;
        }

        public void onViewCaptured(View view, int i)
        {
            setAllChildrenVisible();
        }

        public void onViewDragStateChanged(int i)
        {
            if (Log.isLoggable(SlidingUpPanelLayout.TAG, 2))
            {
                String s = SlidingUpPanelLayout.TAG;
                StringBuilder stringbuilder = (new StringBuilder()).append("onViewDragStateChanged - ").append(i).append(", sliding top: ");
                Object obj;
                if (mSlideableView == null)
                {
                    obj = "null";
                } else
                {
                    obj = Integer.valueOf(mSlideableView.getTop());
                }
                Log.v(s, stringbuilder.append(obj).toString());
            }
            i = (int)(mAnchorPoint * (float)mSlideRange);
            if (mDragHelper.getViewDragState() != 0) goto _L2; else goto _L1
_L1:
            if (mSlideOffset != 0.0F && (mSlideableView == null || mSlideableView.getTop() != 0)) goto _L4; else goto _L3
_L3:
            if (mSlideState != SlideState.EXPANDED)
            {
                updateObscuredViewVisibility();
                dispatchOnPanelExpanded(mSlideableView);
                mSlideState = SlideState.EXPANDED;
            }
_L2:
            return;
_L4:
            if (mSlideOffset != (float)i / (float)mSlideRange)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (mSlideState == SlideState.ANCHORED) goto _L2; else goto _L5
_L5:
            updateObscuredViewVisibility();
            dispatchOnPanelAnchored(mSlideableView);
            mSlideState = SlideState.ANCHORED;
            return;
            if (mSlideState == SlideState.COLLAPSED) goto _L2; else goto _L6
_L6:
            dispatchOnPanelCollapsed(mSlideableView);
            mSlideState = SlideState.COLLAPSED;
            return;
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            onPanelDragged(j);
            invalidate();
        }

        public void onViewReleased(View view, float f, float f1)
        {
            int i;
            int j;
            if (mIsSlidingUp)
            {
                j = getSlidingTop();
            } else
            {
                j = getSlidingTop() - mSlideRange;
            }
            if (mAnchorPoint == 0.0F) goto _L2; else goto _L1
_L1:
            if (mIsSlidingUp)
            {
                f = (float)(int)(mAnchorPoint * (float)mSlideRange) / (float)mSlideRange;
            } else
            {
                i = mPanelHeight;
                int k = (int)(mAnchorPoint * (float)mSlideRange);
                f = (float)(mPanelHeight - (i - k)) / (float)mSlideRange;
            }
            if (f1 <= 0.0F && (f1 != 0.0F || mSlideOffset < (1.0F + f) / 2.0F)) goto _L4; else goto _L3
_L3:
            i = j + mSlideRange;
_L6:
            mDragHelper.settleCapturedViewAt(view.getLeft(), i);
            invalidate();
            return;
_L4:
            i = j;
            if (f1 == 0.0F)
            {
                i = j;
                if (mSlideOffset < (1.0F + f) / 2.0F)
                {
                    i = j;
                    if (mSlideOffset >= f / 2.0F)
                    {
                        i = (int)((float)j + (float)mSlideRange * mAnchorPoint);
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (f1 <= 0.0F)
            {
                i = j;
                if (f1 != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = j;
                if (mSlideOffset <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = j + mSlideRange;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public boolean tryCaptureView(View view, int i)
        {
            if (mIsUnableToDrag)
            {
                return false;
            } else
            {
                return ((LayoutParams)view.getLayoutParams()).slideable;
            }
        }

        private DragHelperCallback()
        {
            this$0 = SlidingUpPanelLayout.this;
            super();
        }

    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int ATTRS[] = {
            0x1010181
        };
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;


        public LayoutParams()
        {
            super(-1, -1);
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context.obtainStyledAttributes(attributeset, ATTRS).recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

    public static interface PanelSlideListener
    {

        public abstract void onPanelAnchored(View view);

        public abstract void onPanelCollapsed(View view);

        public abstract void onPanelExpanded(View view);

        public abstract void onPanelSlide(View view, float f);
    }

    public static class SimplePanelSlideListener
        implements PanelSlideListener
    {

        public void onPanelAnchored(View view)
        {
        }

        public void onPanelCollapsed(View view)
        {
        }

        public void onPanelExpanded(View view)
        {
        }

        public void onPanelSlide(View view, float f)
        {
        }

        public SimplePanelSlideListener()
        {
        }
    }

    private static final class SlideState extends Enum
    {

        private static final SlideState $VALUES[];
        public static final SlideState ANCHORED;
        public static final SlideState COLLAPSED;
        public static final SlideState EXPANDED;

        public static SlideState valueOf(String s)
        {
            return (SlideState)Enum.valueOf(com/sothree/slidinguppanel/SlidingUpPanelLayout$SlideState, s);
        }

        public static SlideState[] values()
        {
            return (SlideState[])$VALUES.clone();
        }

        static 
        {
            EXPANDED = new SlideState("EXPANDED", 0);
            COLLAPSED = new SlideState("COLLAPSED", 1);
            ANCHORED = new SlideState("ANCHORED", 2);
            $VALUES = (new SlideState[] {
                EXPANDED, COLLAPSED, ANCHORED
            });
        }

        private SlideState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int DEFAULT_ATTRS[] = {
        0x10100af
    };
    private static final int DEFAULT_FADE_COLOR = 0x99000000;
    private static final int DEFAULT_MIN_FLING_VELOCITY = 400;
    private static final int DEFAULT_PANEL_HEIGHT = 68;
    private static final int DEFAULT_SHADOW_HEIGHT = 4;
    private static final String TAG = com/sothree/slidinguppanel/SlidingUpPanelLayout.getSimpleName();
    private float mAnchorPoint;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final Paint mCoveredFadePaint;
    private final ViewDragHelper mDragHelper;
    private View mDragView;
    private int mDragViewResId;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsSlidingEnabled;
    private boolean mIsSlidingUp;
    private boolean mIsUnableToDrag;
    private boolean mIsUsingDragViewTouchEvents;
    private int mMinFlingVelocity;
    private int mPanelHeight;
    private PanelSlideListener mPanelSlideListener;
    private final int mScrollTouchSlop;
    private Drawable mShadowDrawable;
    private int mShadowHeight;
    private float mSlideOffset;
    private int mSlideRange;
    private SlideState mSlideState;
    private View mSlideableView;
    private final Rect mTmpRect;

    public SlidingUpPanelLayout(Context context)
    {
        this(context, null);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMinFlingVelocity = 400;
        mCoveredFadeColor = 0x99000000;
        mCoveredFadePaint = new Paint();
        mPanelHeight = -1;
        mShadowHeight = -1;
        mDragViewResId = -1;
        mSlideState = SlideState.COLLAPSED;
        mAnchorPoint = 0.0F;
        mFirstLayout = true;
        mTmpRect = new Rect();
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, DEFAULT_ATTRS);
            if (typedarray != null)
            {
                i = typedarray.getInt(0, 0);
                if (i != 48 && i != 80)
                {
                    throw new IllegalArgumentException("layout_gravity must be set to either top or bottom");
                }
                float f;
                boolean flag;
                if (i == 80)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mIsSlidingUp = flag;
            }
            typedarray.recycle();
            attributeset = context.obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.SlidingUpPanelLayout);
            if (attributeset != null)
            {
                mPanelHeight = attributeset.getDimensionPixelSize(0, -1);
                mShadowHeight = attributeset.getDimensionPixelSize(1, -1);
                mMinFlingVelocity = attributeset.getInt(3, 400);
                mCoveredFadeColor = attributeset.getColor(2, 0x99000000);
                mDragViewResId = attributeset.getResourceId(4, -1);
            }
            attributeset.recycle();
        }
        f = context.getResources().getDisplayMetrics().density;
        if (mPanelHeight == -1)
        {
            mPanelHeight = (int)(68F * f + 0.5F);
        }
        if (mShadowHeight == -1)
        {
            mShadowHeight = (int)(4F * f + 0.5F);
        }
        setWillNotDraw(false);
        mDragHelper = ViewDragHelper.create(this, 0.5F, new DragHelperCallback());
        mDragHelper.setMinVelocity((float)mMinFlingVelocity * f);
        mCanSlide = true;
        mIsSlidingEnabled = true;
        mScrollTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private boolean collapsePane(View view, int i)
    {
        return mFirstLayout || smoothSlideTo(1.0F, i);
    }

    private boolean expandPane(View view, int i, float f)
    {
        return mFirstLayout || smoothSlideTo(f, i);
    }

    private int getSlidingTop()
    {
        if (mSlideableView != null)
        {
            return getMeasuredHeight() - getPaddingBottom() - mSlideableView.getMeasuredHeight();
        } else
        {
            return getMeasuredHeight() - getPaddingBottom();
        }
    }

    private static boolean hasOpaqueBackground(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isDragViewUnder(int i, int j)
    {
        boolean flag = true;
        View view;
        if (mDragView != null)
        {
            view = mDragView;
        } else
        {
            view = mSlideableView;
        }
        if (view == null)
        {
            return false;
        }
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        getLocationOnScreen(ai1);
        i = ai1[0] + i;
        j = ai1[1] + j;
        if (i < ai[0] || i >= ai[0] + view.getWidth() || j < ai[1] || j >= ai[1] + view.getHeight())
        {
            flag = false;
        }
        return flag;
    }

    private void onPanelDragged(int i)
    {
        int j = getSlidingTop();
        float f;
        if (mIsSlidingUp)
        {
            f = (float)(i - j) / (float)mSlideRange;
        } else
        {
            f = (float)(j - i) / (float)mSlideRange;
        }
        mSlideOffset = f;
        if (mSlideOffset >= 0.0F) goto _L2; else goto _L1
_L1:
        mSlideOffset = 0.0F;
_L4:
        dispatchOnPanelSlide(mSlideableView);
        return;
_L2:
        if (mSlideOffset > 1.0F)
        {
            mSlideOffset = 1.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int i1 = view.getScrollX();
            int j1 = view.getScrollY();
            for (int l = viewgroup.getChildCount() - 1; l >= 0; l--)
            {
                View view1 = viewgroup.getChildAt(l);
                if (j + i1 >= view1.getLeft() && j + i1 < view1.getRight() && k + j1 >= view1.getTop() && k + j1 < view1.getBottom() && canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop()))
                {
                    return true;
                }
            }

        }
        return flag && ViewCompat.canScrollHorizontally(view, -i);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public boolean collapsePane()
    {
        return collapsePane(mSlideableView, 0);
    }

    public void computeScroll()
    {
label0:
        {
            if (mDragHelper.continueSettling(true))
            {
                if (mCanSlide)
                {
                    break label0;
                }
                mDragHelper.abort();
            }
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void dispatchOnPanelAnchored(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelAnchored(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelCollapsed(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelCollapsed(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelExpanded(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelExpanded(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelSlide(View view)
    {
        if (mPanelSlideListener != null)
        {
            mPanelSlideListener.onPanelSlide(view, mSlideOffset);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mSlideableView != null)
        {
            int k = mSlideableView.getRight();
            int i;
            int j;
            int l;
            if (mIsSlidingUp)
            {
                j = mSlideableView.getTop() - mShadowHeight;
                i = mSlideableView.getTop();
            } else
            {
                j = mSlideableView.getBottom();
                i = mSlideableView.getBottom() + mShadowHeight;
            }
            l = mSlideableView.getLeft();
            if (mShadowDrawable != null)
            {
                mShadowDrawable.setBounds(l, j, k, i);
                mShadowDrawable.draw(canvas);
                return;
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = canvas.save(2);
        int j = 0;
        boolean flag = j;
        if (mCanSlide)
        {
            flag = j;
            if (!layoutparams.slideable)
            {
                flag = j;
                if (mSlideableView != null)
                {
                    canvas.getClipBounds(mTmpRect);
                    int i;
                    boolean flag1;
                    if (mIsSlidingUp)
                    {
                        mTmpRect.bottom = Math.min(mTmpRect.bottom, mSlideableView.getTop());
                    } else
                    {
                        mTmpRect.top = Math.max(mTmpRect.top, mSlideableView.getBottom());
                    }
                    canvas.clipRect(mTmpRect);
                    flag = j;
                    if (mSlideOffset < 1.0F)
                    {
                        flag = true;
                    }
                }
            }
        }
        flag1 = super.drawChild(canvas, view, l);
        canvas.restoreToCount(k);
        if (flag)
        {
            i = (int)((float)((mCoveredFadeColor & 0xff000000) >>> 24) * (1.0F - mSlideOffset));
            j = mCoveredFadeColor;
            mCoveredFadePaint.setColor(i << 24 | j & 0xffffff);
            canvas.drawRect(mTmpRect, mCoveredFadePaint);
        }
        return flag1;
    }

    public boolean expandPane()
    {
        return expandPane(0.0F);
    }

    public boolean expandPane(float f)
    {
        if (!isPaneVisible())
        {
            showPane();
        }
        return expandPane(mSlideableView, 0, f);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return mCoveredFadeColor;
    }

    public int getPanelHeight()
    {
        return mPanelHeight;
    }

    public void hidePane()
    {
        if (mSlideableView == null)
        {
            return;
        } else
        {
            mSlideableView.setVisibility(8);
            requestLayout();
            return;
        }
    }

    public boolean isAnchored()
    {
        return mSlideState == SlideState.ANCHORED;
    }

    public boolean isExpanded()
    {
        return mSlideState == SlideState.EXPANDED;
    }

    public boolean isPaneVisible()
    {
        boolean flag = true;
        if (getChildCount() < 2)
        {
            return false;
        }
        if (getChildAt(1).getVisibility() != 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean isSlideable()
    {
        return mCanSlide;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mFirstLayout = true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (mDragViewResId != -1)
        {
            mDragView = findViewById(mDragViewResId);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag1;
        flag1 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mCanSlide && mIsSlidingEnabled && (!mIsUnableToDrag || i == 0)) goto _L2; else goto _L1
_L1:
        mDragHelper.cancel();
        flag1 = super.onInterceptTouchEvent(motionevent);
_L8:
        return flag1;
_L2:
        float f;
        float f1;
        boolean flag;
        boolean flag2;
        boolean flag3;
        if (i == 3 || i == 1)
        {
            mDragHelper.cancel();
            return false;
        }
        f = motionevent.getX();
        f1 = motionevent.getY();
        flag2 = false;
        flag3 = false;
        flag = flag3;
        i;
        JVM INSTR tableswitch 0 2: default 120
    //                   0 142
    //                   1 124
    //                   2 189;
           goto _L3 _L4 _L5 _L6
_L3:
        flag = flag3;
_L5:
        if (!mDragHelper.shouldInterceptTouchEvent(motionevent) && !flag) goto _L8; else goto _L7
_L7:
        return true;
_L4:
        mIsUnableToDrag = false;
        mInitialMotionX = f;
        mInitialMotionY = f1;
        flag = flag3;
        if (isDragViewUnder((int)f, (int)f1))
        {
            flag = flag3;
            if (!mIsUsingDragViewTouchEvents)
            {
                flag = true;
            }
        }
          goto _L5
_L6:
        float f2 = Math.abs(f - mInitialMotionX);
        float f3 = Math.abs(f1 - mInitialMotionY);
        int j = mDragHelper.getTouchSlop();
        flag = flag2;
        if (mIsUsingDragViewTouchEvents)
        {
            if (f2 > (float)mScrollTouchSlop && f3 < (float)mScrollTouchSlop)
            {
                return super.onInterceptTouchEvent(motionevent);
            }
            flag = flag2;
            if (f3 > (float)mScrollTouchSlop)
            {
                flag = isDragViewUnder((int)f, (int)f1);
            }
        }
        if (f3 > (float)j && f2 > f3 || !isDragViewUnder((int)f, (int)f1))
        {
            mDragHelper.cancel();
            mIsUnableToDrag = true;
            return false;
        }
          goto _L5
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        l = getPaddingLeft();
        k = getPaddingTop();
        i1 = getSlidingTop();
        int j1 = getChildCount();
        if (mFirstLayout)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$sothree$slidinguppanel$SlidingUpPanelLayout$SlideState[];

                static 
                {
                    $SwitchMap$com$sothree$slidinguppanel$SlidingUpPanelLayout$SlideState = new int[SlideState.values().length];
                    try
                    {
                        $SwitchMap$com$sothree$slidinguppanel$SlidingUpPanelLayout$SlideState[SlideState.EXPANDED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$sothree$slidinguppanel$SlidingUpPanelLayout$SlideState[SlideState.ANCHORED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.sothree.slidinguppanel.SlidingUpPanelLayout.SlideState[mSlideState.ordinal()])
            {
            default:
                mSlideOffset = 1.0F;
                break;

            case 1: // '\001'
                float f;
                if (mCanSlide)
                {
                    f = 0.0F;
                } else
                {
                    f = 1.0F;
                }
                mSlideOffset = f;
                continue;

            case 2: // '\002'
                float f1;
                if (mCanSlide)
                {
                    f1 = mAnchorPoint;
                } else
                {
                    f1 = 1.0F;
                }
                mSlideOffset = f1;
                continue;
            }
            break;
        }
        do
        {
            j = 0;
            while (j < j1) 
            {
                View view = getChildAt(j);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int k1 = view.getMeasuredHeight();
                    if (layoutparams.slideable)
                    {
                        mSlideRange = k1 - mPanelHeight;
                    }
                    if (mIsSlidingUp)
                    {
                        if (layoutparams.slideable)
                        {
                            i = i1 + (int)((float)mSlideRange * mSlideOffset);
                        } else
                        {
                            i = k;
                        }
                    } else
                    if (layoutparams.slideable)
                    {
                        i = i1 - (int)((float)mSlideRange * mSlideOffset);
                    } else
                    {
                        i = k + mPanelHeight;
                    }
                    view.layout(l, i, l + view.getMeasuredWidth(), i + k1);
                }
                j++;
            }
            if (mFirstLayout)
            {
                updateObscuredViewVisibility();
            }
            mFirstLayout = false;
            return;
        } while (true);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int i1;
        int j1;
        k = android.view.View.MeasureSpec.getMode(i);
        i1 = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getMode(j);
        j1 = android.view.View.MeasureSpec.getSize(j);
        if (k != 0x40000000)
        {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (i != 0x40000000)
        {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        int k1 = getPaddingTop();
        int l1 = getPaddingBottom();
        k = mPanelHeight;
        int i2 = getChildCount();
        if (i2 > 2)
        {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
            break MISSING_BLOCK_LABEL_100;
        } else
        {
            if (getChildAt(1).getVisibility() == 8)
            {
                k = 0;
            }
            continue;
        }
        do
        {
            mSlideableView = null;
            mCanSlide = false;
            int l = 0;
            while (l < i2) 
            {
                View view = getChildAt(l);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                j = j1 - k1 - l1;
                if (view.getVisibility() == 8)
                {
                    layoutparams.dimWhenOffset = false;
                } else
                {
                    if (l == 1)
                    {
                        layoutparams.slideable = true;
                        layoutparams.dimWhenOffset = true;
                        mSlideableView = view;
                        mCanSlide = true;
                    } else
                    {
                        j -= k;
                    }
                    if (layoutparams.width == -2)
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                    } else
                    if (layoutparams.width == -1)
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                    } else
                    {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
                    }
                    if (layoutparams.height == -2)
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
                    } else
                    if (layoutparams.height == -1)
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
                    } else
                    {
                        j = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                    }
                    view.measure(i, j);
                }
                l++;
            }
            setMeasuredDimension(i1, j1);
            return;
        } while (true);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (j != l)
        {
            mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (!mCanSlide || !mIsSlidingEnabled)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            mDragHelper.processTouchEvent(motionevent);
            int i = motionevent.getAction();
            boolean flag1 = true;
            float f1;
            switch (i & 0xff)
            {
            default:
                return true;

            case 0: // '\0'
                float f = motionevent.getX();
                float f2 = motionevent.getY();
                mInitialMotionX = f;
                mInitialMotionY = f2;
                return true;

            case 1: // '\001'
                f1 = motionevent.getX();
                break;
            }
            float f3 = motionevent.getY();
            float f4 = f1 - mInitialMotionX;
            float f5 = f3 - mInitialMotionY;
            i = mDragHelper.getTouchSlop();
            if (mDragView != null)
            {
                motionevent = mDragView;
            } else
            {
                motionevent = mSlideableView;
            }
            flag = flag1;
            if (f4 * f4 + f5 * f5 < (float)(i * i))
            {
                flag = flag1;
                if (isDragViewUnder((int)f1, (int)f3))
                {
                    motionevent.playSoundEffect(0);
                    if (!isExpanded() && !isAnchored())
                    {
                        expandPane(mAnchorPoint);
                        return true;
                    } else
                    {
                        collapsePane();
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    void setAllChildrenVisible()
    {
        int i = 0;
        for (int j = getChildCount(); i < j; i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    public void setAnchorPoint(float f)
    {
        if (f > 0.0F && f < 1.0F)
        {
            mAnchorPoint = f;
        }
    }

    public void setCoveredFadeColor(int i)
    {
        mCoveredFadeColor = i;
        invalidate();
    }

    public void setDragView(View view)
    {
        mDragView = view;
    }

    public void setEnableDragViewTouchEvents(boolean flag)
    {
        mIsUsingDragViewTouchEvents = flag;
    }

    public void setPanelHeight(int i)
    {
        mPanelHeight = i;
        requestLayout();
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        mPanelSlideListener = panelslidelistener;
    }

    public void setShadowDrawable(Drawable drawable)
    {
        mShadowDrawable = drawable;
    }

    public void setSlidingEnabled(boolean flag)
    {
        mIsSlidingEnabled = flag;
    }

    public void showPane()
    {
        if (getChildCount() < 2)
        {
            return;
        } else
        {
            getChildAt(1).setVisibility(0);
            requestLayout();
            return;
        }
    }

    boolean smoothSlideTo(float f, int i)
    {
        if (mCanSlide)
        {
            i = getSlidingTop();
            if (mIsSlidingUp)
            {
                i = (int)((float)i + (float)mSlideRange * f);
            } else
            {
                i = (int)((float)i - (float)mSlideRange * f);
            }
            if (mDragHelper.smoothSlideViewTo(mSlideableView, mSlideableView.getLeft(), i))
            {
                setAllChildrenVisible();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    void updateObscuredViewVisibility()
    {
        if (getChildCount() == 0)
        {
            return;
        }
        int j2 = getPaddingLeft();
        int k1 = getWidth();
        int l1 = getPaddingRight();
        int i2 = getPaddingTop();
        int i1 = getHeight();
        int j1 = getPaddingBottom();
        View view;
        int i;
        int j;
        int k;
        int l;
        if (mSlideableView != null && hasOpaqueBackground(mSlideableView))
        {
            j = mSlideableView.getLeft();
            k = mSlideableView.getRight();
            l = mSlideableView.getTop();
            i = mSlideableView.getBottom();
        } else
        {
            i = 0;
            l = 0;
            k = 0;
            j = 0;
        }
        view = getChildAt(0);
        j2 = Math.max(j2, view.getLeft());
        i2 = Math.max(i2, view.getTop());
        k1 = Math.min(k1 - l1, view.getRight());
        i1 = Math.min(i1 - j1, view.getBottom());
        if (j2 >= j && i2 >= l && k1 <= k && i1 <= i)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
    }














/*
    static SlideState access$802(SlidingUpPanelLayout slidinguppanellayout, SlideState slidestate)
    {
        slidinguppanellayout.mSlideState = slidestate;
        return slidestate;
    }

*/

}
