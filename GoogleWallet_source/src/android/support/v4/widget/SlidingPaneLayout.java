// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{
    final class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        private final Rect mTmpRect = new Rect();
        final SlidingPaneLayout this$0;

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
            Rect rect = mTmpRect;
            accessibilitynodeinfocompat1.getBoundsInParent(rect);
            accessibilitynodeinfocompat.setBoundsInParent(rect);
            accessibilitynodeinfocompat1.getBoundsInScreen(rect);
            accessibilitynodeinfocompat.setBoundsInScreen(rect);
            accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
            accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
            accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
            accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
            accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
            accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
            accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
            accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
            accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
            accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
            accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
            accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
            accessibilitynodeinfocompat.setMovementGranularities(accessibilitynodeinfocompat1.getMovementGranularities());
        }

        private boolean filter(View view)
        {
            return isDimmed(view);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
            copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat1.recycle();
            accessibilitynodeinfocompat.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
            accessibilitynodeinfocompat.setSource(view);
            view = ViewCompat.getParentForAccessibility(view);
            if (view instanceof View)
            {
                accessibilitynodeinfocompat.setParent((View)view);
            }
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                view = getChildAt(i);
                if (!filter(view) && view.getVisibility() == 0)
                {
                    ViewCompat.setImportantForAccessibility(view, 1);
                    accessibilitynodeinfocompat.addChild(view);
                }
            }

        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (!filter(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        AccessibilityDelegate()
        {
            this$0 = SlidingPaneLayout.this;
            super();
        }
    }

    final class DisableLayerRunnable
        implements Runnable
    {

        final View mChildView;
        final SlidingPaneLayout this$0;

        public final void run()
        {
            if (mChildView.getParent() == SlidingPaneLayout.this)
            {
                ViewCompat.setLayerType(mChildView, 0, null);
                invalidateChildRegion(mChildView);
            }
            mPostedRunnables.remove(this);
        }

        DisableLayerRunnable(View view)
        {
            this$0 = SlidingPaneLayout.this;
            super();
            mChildView = view;
        }
    }

    final class DragHelperCallback extends ViewDragHelper.Callback
    {

        final SlidingPaneLayout this$0;

        public final int clampViewPositionHorizontal(View view, int i, int j)
        {
            view = (LayoutParams)mSlideableView.getLayoutParams();
            if (isLayoutRtlSupport())
            {
                j = getWidth() - (getPaddingRight() + ((LayoutParams) (view)).rightMargin + mSlideableView.getWidth());
                int k = mSlideRange;
                return Math.max(Math.min(i, j), j - k);
            } else
            {
                j = getPaddingLeft() + ((LayoutParams) (view)).leftMargin;
                int l = mSlideRange;
                return Math.min(Math.max(i, j), j + l);
            }
        }

        public final int clampViewPositionVertical(View view, int i, int j)
        {
            return view.getTop();
        }

        public final int getViewHorizontalDragRange(View view)
        {
            return mSlideRange;
        }

        public final void onEdgeDragStarted(int i, int j)
        {
            mDragHelper.captureChildView(mSlideableView, j);
        }

        public final void onViewCaptured(View view, int i)
        {
            setAllChildrenVisible();
        }

        public final void onViewDragStateChanged(int i)
        {
label0:
            {
                if (mDragHelper.getViewDragState() == 0)
                {
                    if (mSlideOffset != 0.0F)
                    {
                        break label0;
                    }
                    updateObscuredViewsVisibility(mSlideableView);
                    dispatchOnPanelClosed(mSlideableView);
                    mPreservedOpenState = false;
                }
                return;
            }
            dispatchOnPanelOpened(mSlideableView);
            mPreservedOpenState = true;
        }

        public final void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            onPanelDragged(i);
            invalidate();
        }

        public final void onViewReleased(View view, float f, float f1)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (!isLayoutRtlSupport()) goto _L2; else goto _L1
_L1:
            int i;
label0:
            {
                int j = getPaddingRight() + layoutparams.rightMargin;
                if (f >= 0.0F)
                {
                    i = j;
                    if (f != 0.0F)
                    {
                        break label0;
                    }
                    i = j;
                    if (mSlideOffset <= 0.5F)
                    {
                        break label0;
                    }
                }
                i = j + mSlideRange;
            }
            int k = mSlideableView.getWidth();
            i = getWidth() - i - k;
_L4:
            mDragHelper.settleCapturedViewAt(i, view.getTop());
            invalidate();
            return;
_L2:
            int l = getPaddingLeft() + layoutparams.leftMargin;
            if (f <= 0.0F)
            {
                i = l;
                if (f != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = l;
                if (mSlideOffset <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = l + mSlideRange;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean tryCaptureView(View view, int i)
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
            this$0 = SlidingPaneLayout.this;
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
        public float weight;


        public LayoutParams()
        {
            super(-1, -1);
            weight = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            weight = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ATTRS);
            weight = context.getFloat(0, 0.0F);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            weight = 0.0F;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            weight = 0.0F;
        }
    }

    public static interface PanelSlideListener
    {
    }

    static final class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        boolean isOpen;

        public final void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (isOpen)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isOpen = flag;
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static class SlidingPanelLayoutImpl
    {

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            ViewCompat.postInvalidateOnAnimation(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }

        SlidingPanelLayoutImpl()
        {
        }
    }

    static final class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImpl
    {

        private Method mGetDisplayList;
        private Field mRecreateDisplayList;

        public final void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            if (mGetDisplayList != null && mRecreateDisplayList != null)
            {
                try
                {
                    mRecreateDisplayList.setBoolean(view, true);
                    mGetDisplayList.invoke(view, null);
                }
                catch (Exception exception)
                {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", exception);
                }
                super.invalidateChildRegion(slidingpanelayout, view);
                return;
            } else
            {
                view.invalidate();
                return;
            }
        }

        SlidingPanelLayoutImplJB()
        {
            try
            {
                mGetDisplayList = android/view/View.getDeclaredMethod("getDisplayList", null);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", nosuchmethodexception);
            }
            try
            {
                mRecreateDisplayList = android/view/View.getDeclaredField("mRecreateDisplayList");
                mRecreateDisplayList.setAccessible(true);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", nosuchfieldexception);
            }
        }
    }

    static final class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImpl
    {

        public final void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
        }

        SlidingPanelLayoutImplJBMR1()
        {
        }
    }


    static final SlidingPanelLayoutImpl IMPL;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public SlidingPaneLayout(Context context)
    {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSliderFadeColor = 0xcccccccc;
        mFirstLayout = true;
        mTmpRect = new Rect();
        mPostedRunnables = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        mOverhangSize = (int)(32F * f + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        mDragHelper = ViewDragHelper.create(this, 0.5F, new DragHelperCallback());
        mDragHelper.setMinVelocity(400F * f);
    }

    private boolean closePane()
    {
        return closePane(mSlideableView, 0);
    }

    private boolean closePane(View view, int i)
    {
        boolean flag = false;
        if (mFirstLayout || smoothSlideTo(0.0F, i))
        {
            mPreservedOpenState = false;
            flag = true;
        }
        return flag;
    }

    private void dimChildView(View view, float f, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f > 0.0F && i != 0)
        {
            int j = (int)((float)((0xff000000 & i) >>> 24) * f);
            if (layoutparams.dimPaint == null)
            {
                layoutparams.dimPaint = new Paint();
            }
            layoutparams.dimPaint.setColorFilter(new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (ViewCompat.getLayerType(view) != 2)
            {
                ViewCompat.setLayerType(view, 2, layoutparams.dimPaint);
            }
            invalidateChildRegion(view);
        } else
        if (ViewCompat.getLayerType(view) != 0)
        {
            if (layoutparams.dimPaint != null)
            {
                layoutparams.dimPaint.setColorFilter(null);
            }
            view = new DisableLayerRunnable(view);
            mPostedRunnables.add(view);
            ViewCompat.postOnAnimation(this, view);
            return;
        }
    }

    private void dispatchOnPanelSlide(View view)
    {
        if (mPanelSlideListener != null)
        {
            view = mPanelSlideListener;
            float f = mSlideOffset;
        }
    }

    private void invalidateChildRegion(View view)
    {
        IMPL.invalidateChildRegion(this, view);
    }

    private boolean isLayoutRtlSupport()
    {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    private boolean isOpen()
    {
        return !mCanSlide || mSlideOffset == 1.0F;
    }

    private boolean isSlideable()
    {
        return mCanSlide;
    }

    private void onPanelDragged(int i)
    {
        if (mSlideableView == null)
        {
            mSlideOffset = 0.0F;
            return;
        }
        boolean flag = isLayoutRtlSupport();
        LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
        int j = mSlideableView.getWidth();
        if (flag)
        {
            i = getWidth() - i - j;
        }
        int k;
        if (flag)
        {
            j = getPaddingRight();
        } else
        {
            j = getPaddingLeft();
        }
        if (flag)
        {
            k = layoutparams.rightMargin;
        } else
        {
            k = layoutparams.leftMargin;
        }
        mSlideOffset = (float)(i - (j + k)) / (float)mSlideRange;
        if (mParallaxBy != 0)
        {
            parallaxOtherViews(mSlideOffset);
        }
        if (layoutparams.dimWhenOffset)
        {
            dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
        }
        dispatchOnPanelSlide(mSlideableView);
    }

    private boolean openPane()
    {
        return openPane(mSlideableView, 0);
    }

    private boolean openPane(View view, int i)
    {
        if (mFirstLayout || smoothSlideTo(1.0F, i))
        {
            mPreservedOpenState = true;
            return true;
        } else
        {
            return false;
        }
    }

    private void parallaxOtherViews(float f)
    {
        int i;
        boolean flag = isLayoutRtlSupport();
        Object obj = (LayoutParams)mSlideableView.getLayoutParams();
        if (!((LayoutParams) (obj)).dimWhenOffset)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        int j;
        int k;
        int l;
        int i1;
        if (flag)
        {
            i = ((LayoutParams) (obj)).rightMargin;
        } else
        {
            i = ((LayoutParams) (obj)).leftMargin;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        i = 1;
_L1:
        i1 = getChildCount();
        j = 0;
        while (j < i1) 
        {
            obj = getChildAt(j);
            if (obj != mSlideableView)
            {
                k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
                mParallaxOffset = f;
                l = k - (int)((1.0F - f) * (float)mParallaxBy);
                k = l;
                if (flag)
                {
                    k = -l;
                }
                ((View) (obj)).offsetLeftAndRight(k);
                if (i != 0)
                {
                    float f1;
                    if (flag)
                    {
                        f1 = mParallaxOffset - 1.0F;
                    } else
                    {
                        f1 = 1.0F - mParallaxOffset;
                    }
                    dimChildView(((View) (obj)), f1, mCoveredFadeColor);
                }
            }
            j++;
        }
        break MISSING_BLOCK_LABEL_190;
        i = 0;
          goto _L1
    }

    private boolean smoothSlideTo(float f, int i)
    {
        if (mCanSlide)
        {
            boolean flag = isLayoutRtlSupport();
            LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
            if (flag)
            {
                i = getPaddingRight();
                int j = layoutparams.rightMargin;
                int k = mSlideableView.getWidth();
                i = (int)((float)getWidth() - ((float)(i + j) + (float)mSlideRange * f + (float)k));
            } else
            {
                i = (int)((float)(getPaddingLeft() + layoutparams.leftMargin) + (float)mSlideRange * f);
            }
            if (mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
            {
                setAllChildrenVisible();
                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    private static boolean viewIsOpaque(View view)
    {
        if (!ViewCompat.isOpaque(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            view = view.getBackground();
            if (view != null)
            {
                if (view.getOpacity() != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
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

    final void dispatchOnPanelClosed(View view)
    {
        if (mPanelSlideListener != null)
        {
            view = mPanelSlideListener;
        }
        sendAccessibilityEvent(32);
    }

    final void dispatchOnPanelOpened(View view)
    {
        if (mPanelSlideListener != null)
        {
            view = mPanelSlideListener;
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (isLayoutRtlSupport())
        {
            drawable = mShadowDrawableRight;
        } else
        {
            drawable = mShadowDrawableLeft;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int k = view.getTop();
        int l = view.getBottom();
        int i1 = drawable.getIntrinsicWidth();
        int i;
        int j;
        if (isLayoutRtlSupport())
        {
            i = view.getRight();
            j = i + i1;
        } else
        {
            j = view.getLeft();
            i = j - i1;
        }
        drawable.setBounds(i, k, j, l);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i = canvas.save(2);
        boolean flag;
        if (mCanSlide && !layoutparams.slideable && mSlideableView != null)
        {
            canvas.getClipBounds(mTmpRect);
            if (isLayoutRtlSupport())
            {
                mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
            } else
            {
                mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
            }
            canvas.clipRect(mTmpRect);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l);
        } else
        if (layoutparams.dimWhenOffset && mSlideOffset > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l);
        }
        canvas.restoreToCount(i);
        return flag;
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

    final boolean isDimmed(View view)
    {
        if (view != null)
        {
            view = (LayoutParams)view.getLayoutParams();
            if (mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F)
            {
                return true;
            }
        }
        return false;
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
        int i = 0;
        for (int j = mPostedRunnables.size(); i < j; i++)
        {
            ((DisableLayerRunnable)mPostedRunnables.get(i)).run();
        }

        mPostedRunnables.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (!mCanSlide && i == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                ViewDragHelper viewdraghelper1 = mDragHelper;
                if (!ViewDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                mPreservedOpenState = flag2;
            }
        }
        if (mCanSlide && (!mIsUnableToDrag || i == 0)) goto _L2; else goto _L1
_L1:
        mDragHelper.cancel();
        flag2 = super.onInterceptTouchEvent(motionevent);
_L8:
        return flag2;
_L2:
        boolean flag;
        boolean flag1;
        if (i == 3 || i == 1)
        {
            mDragHelper.cancel();
            return false;
        }
        flag1 = false;
        flag = flag1;
        i;
        JVM INSTR tableswitch 0 2: default 172
    //                   0 198
    //                   1 176
    //                   2 268;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_268;
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
_L9:
        if (mDragHelper.shouldInterceptTouchEvent(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!flag) goto _L8; else goto _L7
_L7:
        return true;
_L4:
        mIsUnableToDrag = false;
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        ViewDragHelper viewdraghelper = mDragHelper;
        flag = flag1;
        if (ViewDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2))
        {
            flag = flag1;
            if (isDimmed(mSlideableView))
            {
                flag = true;
            }
        }
          goto _L9
        float f3 = motionevent.getX();
        float f1 = motionevent.getY();
        f3 = Math.abs(f3 - mInitialMotionX);
        f1 = Math.abs(f1 - mInitialMotionY);
        flag = flag1;
        if (f3 > (float)mDragHelper.getTouchSlop())
        {
            flag = flag1;
            if (f1 > f3)
            {
                mDragHelper.cancel();
                mIsUnableToDrag = true;
                return false;
            }
        }
          goto _L9
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1 = isLayoutRtlSupport();
        int k1;
        int l1;
        int i2;
        if (flag1)
        {
            mDragHelper.setEdgeTrackingEnabled(2);
        } else
        {
            mDragHelper.setEdgeTrackingEnabled(1);
        }
        k1 = k - i;
        if (flag1)
        {
            i = getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag1)
        {
            k = getPaddingLeft();
        } else
        {
            k = getPaddingRight();
        }
        i2 = getPaddingTop();
        l1 = getChildCount();
        j = i;
        if (mFirstLayout)
        {
            float f;
            View view;
            int k2;
            if (mCanSlide && mPreservedOpenState)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            mSlideOffset = f;
        }
        l = 0;
        while (l < l1) 
        {
            view = getChildAt(l);
            int j1 = i;
            int i1 = j;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int j2 = view.getMeasuredWidth();
                j1 = 0;
                if (layoutparams.slideable)
                {
                    i1 = layoutparams.leftMargin;
                    k2 = layoutparams.rightMargin;
                    k2 = Math.min(i, k1 - k - mOverhangSize) - j - (i1 + k2);
                    mSlideRange = k2;
                    if (flag1)
                    {
                        i1 = layoutparams.rightMargin;
                    } else
                    {
                        i1 = layoutparams.leftMargin;
                    }
                    if (j + i1 + k2 + j2 / 2 > k1 - k)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.dimWhenOffset = flag;
                    k2 = (int)((float)k2 * mSlideOffset);
                    j += k2 + i1;
                    mSlideOffset = (float)k2 / (float)mSlideRange;
                    i1 = j1;
                } else
                if (mCanSlide && mParallaxBy != 0)
                {
                    i1 = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
                    j = i;
                } else
                {
                    j = i;
                    i1 = j1;
                }
                if (flag1)
                {
                    j1 = (k1 - j) + i1;
                    i1 = j1 - j2;
                } else
                {
                    i1 = j - i1;
                    j1 = i1 + j2;
                }
                view.layout(i1, i2, j1, i2 + view.getMeasuredHeight());
                j1 = i + view.getWidth();
                i1 = j;
            }
            l++;
            i = j1;
            j = i1;
        }
        if (mFirstLayout)
        {
            if (mCanSlide)
            {
                if (mParallaxBy != 0)
                {
                    parallaxOtherViews(mSlideOffset);
                }
                if (((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
                {
                    dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
                }
            } else
            {
                i = 0;
                while (i < l1) 
                {
                    dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
                    i++;
                }
            }
            updateObscuredViewsVisibility(mSlideableView);
        }
        mFirstLayout = false;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int k1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (k1 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        int j1;
        int l1;
        l1 = l;
        i = j;
        j1 = k;
        if (k1 != 0x80000000)
        {
            l1 = l;
            i = j;
            j1 = k;
            if (k1 == 0)
            {
                j1 = 300;
                i = j;
                l1 = l;
            }
        }
_L17:
        k = 0;
        j = -1;
        l1;
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 336
    //                   1073741824: 318;
           goto _L5 _L6 _L7
_L5:
        float f;
        int j2;
        int k3;
        int l3;
        boolean flag;
        f = 0.0F;
        flag = false;
        k3 = j1 - getPaddingLeft() - getPaddingRight();
        k1 = k3;
        l3 = getChildCount();
        if (l3 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        mSlideableView = null;
        j2 = 0;
_L12:
        if (j2 >= l3) goto _L9; else goto _L8
_L8:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(j2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (view.getVisibility() != 8) goto _L11; else goto _L10
_L10:
        int l2;
        boolean flag1;
        layoutparams.dimWhenOffset = false;
        l2 = k1;
        l = k;
        flag1 = flag;
_L15:
        j2++;
        flag = flag1;
        k = l;
        k1 = l2;
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        l1 = l;
        i = j;
        j1 = k;
        if (l == 0)
        {
            if (isInEditMode())
            {
                l1 = l;
                i = j;
                j1 = k;
                if (l == 0)
                {
                    l1 = 0x80000000;
                    i = 300;
                    j1 = k;
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        j = i - getPaddingTop() - getPaddingBottom();
        k = j;
          goto _L5
_L6:
        j = i - getPaddingTop() - getPaddingBottom();
          goto _L5
_L11:
        float f1 = f;
        if (layoutparams.weight <= 0.0F) goto _L14; else goto _L13
_L13:
        f1 = f + layoutparams.weight;
        flag1 = flag;
        l = k;
        f = f1;
        l2 = k1;
        if (layoutparams.width == 0) goto _L15; else goto _L14
_L14:
        i = layoutparams.leftMargin + layoutparams.rightMargin;
        if (layoutparams.width == -2)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i, 0x40000000);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
        if (layoutparams.height == -2)
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
        } else
        if (layoutparams.height == -1)
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        } else
        {
            l = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
        view.measure(i, l);
        l = view.getMeasuredWidth();
        l2 = view.getMeasuredHeight();
        i = k;
        if (l1 == 0x80000000)
        {
            i = k;
            if (l2 > k)
            {
                i = Math.min(l2, j);
            }
        }
        k = k1 - l;
        if (k < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.slideable = flag1;
        flag |= flag1;
        flag1 = flag;
        l = i;
        f = f1;
        l2 = k;
        if (layoutparams.slideable)
        {
            mSlideableView = view;
            flag1 = flag;
            l = i;
            f = f1;
            l2 = k;
        }
          goto _L15
_L9:
        if (flag || f > 0.0F)
        {
            int k2 = k3 - mOverhangSize;
            int i1 = 0;
            while (i1 < l3) 
            {
                View view1 = getChildAt(i1);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (view1.getVisibility() != 8)
                {
                    int i2;
                    if (layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (i != 0)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = view1.getMeasuredWidth();
                    }
                    if (flag && view1 != mSlideableView)
                    {
                        if (layoutparams1.width < 0 && (i2 > k2 || layoutparams1.weight > 0.0F))
                        {
                            if (i != 0)
                            {
                                if (layoutparams1.height == -2)
                                {
                                    i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
                                } else
                                if (layoutparams1.height == -1)
                                {
                                    i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
                                } else
                                {
                                    i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                }
                            } else
                            {
                                i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000), i);
                        }
                    } else
                    if (layoutparams1.weight > 0.0F)
                    {
                        if (layoutparams1.width == 0)
                        {
                            if (layoutparams1.height == -2)
                            {
                                i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
                            } else
                            if (layoutparams1.height == -1)
                            {
                                i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
                            } else
                            {
                                i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                            }
                        } else
                        {
                            i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                        }
                        if (flag)
                        {
                            int i3 = k3 - (layoutparams1.leftMargin + layoutparams1.rightMargin);
                            int i4 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000);
                            if (i2 != i3)
                            {
                                view1.measure(i4, i);
                            }
                        } else
                        {
                            int j3 = Math.max(0, k1);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 + (int)((layoutparams1.weight * (float)j3) / f), 0x40000000), i);
                        }
                    }
                }
                i1++;
            }
        }
        setMeasuredDimension(j1, getPaddingTop() + k + getPaddingBottom());
        mCanSlide = flag;
        if (mDragHelper.getViewDragState() != 0 && !flag)
        {
            mDragHelper.abort();
        }
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).isOpen)
        {
            openPane();
        } else
        {
            closePane();
        }
        mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (isSlideable())
        {
            flag = isOpen();
        } else
        {
            flag = mPreservedOpenState;
        }
        savedstate.isOpen = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k)
        {
            mFirstLayout = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!mCanSlide)
        {
            return super.onTouchEvent(motionevent);
        }
        mDragHelper.processTouchEvent(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 54
    //                   1 77;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        continue; /* Loop/switch isn't completed */
_L3:
        if (isDimmed(mSlideableView))
        {
            float f1 = motionevent.getX();
            float f3 = motionevent.getY();
            float f4 = f1 - mInitialMotionX;
            float f5 = f3 - mInitialMotionY;
            int i = mDragHelper.getTouchSlop();
            if (f4 * f4 + f5 * f5 < (float)(i * i))
            {
                motionevent = mDragHelper;
                if (ViewDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
                {
                    closePane(mSlideableView, 0);
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !mCanSlide)
        {
            boolean flag;
            if (view == mSlideableView)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mPreservedOpenState = flag;
        }
    }

    final void setAllChildrenVisible()
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

    public void setCoveredFadeColor(int i)
    {
        mCoveredFadeColor = i;
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        mPanelSlideListener = panelslidelistener;
    }

    public void setParallaxDistance(int i)
    {
        mParallaxBy = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        mShadowDrawableRight = drawable;
    }

    public void setShadowResource(int i)
    {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i)
    {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i)
    {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i)
    {
        mSliderFadeColor = i;
    }

    final void updateObscuredViewsVisibility(View view)
    {
        boolean flag = isLayoutRtlSupport();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (flag)
        {
            i = getWidth() - getPaddingRight();
        } else
        {
            i = getPaddingLeft();
        }
        if (flag)
        {
            j = getPaddingLeft();
        } else
        {
            j = getWidth() - getPaddingRight();
        }
        i2 = getPaddingTop();
        j2 = getHeight();
        k2 = getPaddingBottom();
        if (view != null && viewIsOpaque(view))
        {
            l = view.getLeft();
            i1 = view.getRight();
            j1 = view.getTop();
            k = view.getBottom();
        } else
        {
            k = 0;
            j1 = 0;
            i1 = 0;
            l = 0;
        }
        k1 = 0;
        l2 = getChildCount();
        do
        {
            if (k1 >= l2)
            {
                break;
            }
            View view1 = getChildAt(k1);
            if (view1 == view)
            {
                break;
            }
            int l1;
            int i3;
            int j3;
            int k3;
            if (flag)
            {
                l1 = j;
            } else
            {
                l1 = i;
            }
            i3 = Math.max(l1, view1.getLeft());
            j3 = Math.max(i2, view1.getTop());
            if (flag)
            {
                l1 = i;
            } else
            {
                l1 = j;
            }
            l1 = Math.min(l1, view1.getRight());
            k3 = Math.min(j2 - k2, view1.getBottom());
            if (i3 >= l && j3 >= j1 && l1 <= i1 && k3 <= k)
            {
                l1 = 4;
            } else
            {
                l1 = 0;
            }
            view1.setVisibility(l1);
            k1++;
        } while (true);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 17)
        {
            IMPL = new SlidingPanelLayoutImplJBMR1();
        } else
        if (i >= 16)
        {
            IMPL = new SlidingPanelLayoutImplJB();
        } else
        {
            IMPL = new SlidingPanelLayoutImpl();
        }
    }








/*
    static boolean access$502(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.mPreservedOpenState = flag;
        return flag;
    }

*/



}
