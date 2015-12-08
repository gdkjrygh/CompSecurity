// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public final class SlidingPaneLayout extends ViewGroup
{
    private class SlidingPanelLayoutImpl
    {

        public abstract void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view);
    }

    private final class DisableLayerRunnable
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

    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
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

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        boolean isOpen;

        public void writeToParcel(Parcel parcel, int i)
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

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static class SlidingPanelLayoutImplBase
        implements SlidingPanelLayoutImpl
    {

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
            ViewCompat.postInvalidateOnAnimation(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }

        SlidingPanelLayoutImplBase()
        {
        }
    }

    static final class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase
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

    static final class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
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
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private final Rect mTmpRect;

    private boolean closePane$5359dc96$134632()
    {
        boolean flag = false;
        if (mFirstLayout || smoothSlideTo$254957c(0.0F))
        {
            mPreservedOpenState = false;
            flag = true;
        }
        return flag;
    }

    private void dimChildView(View view, float f, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (ViewCompat.getLayerType(view) != 0)
        {
            if (layoutparams.dimPaint != null)
            {
                layoutparams.dimPaint.setColorFilter(null);
            }
            view = new DisableLayerRunnable(view);
            mPostedRunnables.add(view);
            ViewCompat.postOnAnimation(this, view);
        }
    }

    private boolean isDimmed(View view)
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

    private boolean isLayoutRtlSupport()
    {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    private boolean smoothSlideTo$254957c(float f)
    {
        if (mCanSlide)
        {
            boolean flag = isLayoutRtlSupport();
            Object obj = (LayoutParams)mSlideableView.getLayoutParams();
            int i;
            if (flag)
            {
                i = getPaddingRight();
                int j = ((LayoutParams) (obj)).rightMargin;
                int l = mSlideableView.getWidth();
                i = (int)((float)getWidth() - ((float)(i + j) + (float)mSlideRange * f + (float)l));
            } else
            {
                i = (int)((float)(getPaddingLeft() + ((LayoutParams) (obj)).leftMargin) + (float)mSlideRange * f);
            }
            if (mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
            {
                int k = getChildCount();
                for (i = 0; i < k; i++)
                {
                    obj = getChildAt(i);
                    if (((View) (obj)).getVisibility() == 4)
                    {
                        ((View) (obj)).setVisibility(0);
                    }
                }

                ViewCompat.postInvalidateOnAnimation(this);
                return true;
            }
        }
        return false;
    }

    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public final void computeScroll()
    {
label0:
        {
            if (mDragHelper.continueSettling$138603())
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

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        isLayoutRtlSupport();
        if (getChildCount() > 1)
        {
            getChildAt(1);
        }
    }

    protected final boolean drawChild(Canvas canvas, View view, long l)
    {
        boolean flag;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i = canvas.save(2);
        if (mCanSlide && !layoutparams.slideable && mSlideableView != null)
        {
            canvas.getClipBounds(mTmpRect);
            android.graphics.Bitmap bitmap;
            if (isLayoutRtlSupport())
            {
                mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
            } else
            {
                mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
            }
            canvas.clipRect(mTmpRect);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!layoutparams.dimWhenOffset || mSlideOffset <= 0.0F) goto _L4; else goto _L3
_L3:
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
        flag = false;
_L7:
        canvas.restoreToCount(i);
        return flag;
_L6:
        Log.e("SlidingPaneLayout", (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache").toString());
_L2:
        flag = super.drawChild(canvas, view, l);
        if (true) goto _L7; else goto _L4
_L4:
        if (view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(false);
        }
          goto _L2
    }

    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected final void onDetachedFromWindow()
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

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
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
        JVM INSTR tableswitch 0 2: default 168
    //                   0 194
    //                   1 172
    //                   2 258;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_258;
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
        if (f3 > (float)mDragHelper.mTouchSlop)
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

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int k2;
        boolean flag1 = isLayoutRtlSupport();
        int i2;
        int l2;
        if (flag1)
        {
            mDragHelper.mTrackingEdges = 2;
        } else
        {
            mDragHelper.mTrackingEdges = 1;
        }
        i2 = k - i;
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
        l2 = getPaddingTop();
        k2 = getChildCount();
        j = i;
        if (mFirstLayout)
        {
            float f;
            View view;
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
        while (l < k2) 
        {
            view = getChildAt(l);
            int k1 = i;
            int i1 = j;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int j3 = view.getMeasuredWidth();
                if (layoutparams.slideable)
                {
                    i1 = layoutparams.leftMargin;
                    k1 = layoutparams.rightMargin;
                    k1 = Math.min(i, i2 - k - mOverhangSize) - j - (i1 + k1);
                    mSlideRange = k1;
                    if (flag1)
                    {
                        i1 = layoutparams.rightMargin;
                    } else
                    {
                        i1 = layoutparams.leftMargin;
                    }
                    if (j + i1 + k1 + j3 / 2 > i2 - k)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.dimWhenOffset = flag;
                    k1 = (int)((float)k1 * mSlideOffset);
                    j += k1 + i1;
                    mSlideOffset = (float)k1 / (float)mSlideRange;
                } else
                {
                    j = i;
                }
                if (flag1)
                {
                    k1 = (i2 - j) + 0;
                    i1 = k1 - j3;
                } else
                {
                    i1 = j + 0;
                    k1 = i1 + j3;
                }
                view.layout(i1, l2, k1, l2 + view.getMeasuredHeight());
                k1 = i + view.getWidth();
                i1 = j;
            }
            l++;
            i = k1;
            j = i1;
        }
        if (!mFirstLayout) goto _L2; else goto _L1
_L1:
        View view1;
        int j1;
        int l1;
        View view2;
        int j2;
        int i3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        if (mCanSlide)
        {
            if (((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
            {
                dimChildView(mSlideableView, mSlideOffset, 0);
            }
        } else
        {
            i = 0;
            while (i < k2) 
            {
                dimChildView(getChildAt(i), 0.0F, 0);
                i++;
            }
        }
        view1 = mSlideableView;
        flag = isLayoutRtlSupport();
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
        i3 = getPaddingTop();
        k3 = getHeight();
        l3 = getPaddingBottom();
        if (view1 == null) goto _L4; else goto _L3
_L3:
        if (!ViewCompat.isOpaque(view1)) goto _L6; else goto _L5
_L5:
        k = 1;
_L10:
        if (k == 0) goto _L4; else goto _L7
_L7:
        l1 = view1.getLeft();
        j1 = view1.getRight();
        l = view1.getTop();
        k = view1.getBottom();
_L8:
        i4 = getChildCount();
        j2 = 0;
        do
        {
            if (j2 >= i4)
            {
                break;
            }
            view2 = getChildAt(j2);
            if (view2 == view1)
            {
                break;
            }
            Drawable drawable;
            if (flag)
            {
                k2 = j;
            } else
            {
                k2 = i;
            }
            j4 = Math.max(k2, view2.getLeft());
            k4 = Math.max(i3, view2.getTop());
            if (flag)
            {
                k2 = i;
            } else
            {
                k2 = j;
            }
            k2 = Math.min(k2, view2.getRight());
            l4 = Math.min(k3 - l3, view2.getBottom());
            if (j4 >= l1 && k4 >= l && k2 <= j1 && l4 <= k)
            {
                k2 = 4;
            } else
            {
                k2 = 0;
            }
            view2.setVisibility(k2);
            j2++;
        } while (true);
          goto _L2
_L6:
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            drawable = view1.getBackground();
            if (drawable != null)
            {
                if (drawable.getOpacity() == -1)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        k = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        k = 0;
        l = 0;
        j1 = 0;
        l1 = 0;
          goto _L8
_L2:
        mFirstLayout = false;
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected final void onMeasure(int i, int j)
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
        if (mDragHelper.mDragState != 0 && !flag)
        {
            mDragHelper.abort();
        }
        return;
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).isOpen)
        {
            if (mFirstLayout || smoothSlideTo$254957c(1.0F))
            {
                mPreservedOpenState = true;
            }
        } else
        {
            closePane$5359dc96$134632();
        }
        mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
    }

    protected final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (mCanSlide)
        {
            if (!mCanSlide || mSlideOffset == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = mPreservedOpenState;
        }
        savedstate.isOpen = flag;
        return savedstate;
    }

    protected final void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k)
        {
            mFirstLayout = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
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
            int i = mDragHelper.mTouchSlop;
            if (f4 * f4 + f5 * f5 < (float)(i * i) && ViewDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
            {
                closePane$5359dc96$134632();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void requestChildFocus(View view, View view1)
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
            IMPL = new SlidingPanelLayoutImplBase();
        }
    }


}
