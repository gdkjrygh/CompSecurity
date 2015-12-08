// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            EdgeEffectCompat, ScrollerCompat

public class NestedScrollView extends FrameLayout
    implements NestedScrollingChild, NestedScrollingParent, ScrollingView
{
    static class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            view = (NestedScrollView)view;
            accessibilityevent.setClassName(android/widget/ScrollView.getName());
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            boolean flag;
            if (view.getScrollRange() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            accessibilityevent.setScrollable(flag);
            accessibilityevent.setScrollX(view.getScrollX());
            accessibilityevent.setScrollY(view.getScrollY());
            accessibilityevent.setMaxScrollX(view.getScrollX());
            accessibilityevent.setMaxScrollY(view.getScrollRange());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            view = (NestedScrollView)view;
            accessibilitynodeinfocompat.setClassName(android/widget/ScrollView.getName());
            if (view.isEnabled())
            {
                int i = view.getScrollRange();
                if (i > 0)
                {
                    accessibilitynodeinfocompat.setScrollable(true);
                    if (view.getScrollY() > 0)
                    {
                        accessibilitynodeinfocompat.addAction(8192);
                    }
                    if (view.getScrollY() < i)
                    {
                        accessibilitynodeinfocompat.addAction(4096);
                    }
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i, bundle))
            {
                return true;
            }
            view = (NestedScrollView)view;
            if (!view.isEnabled())
            {
                return false;
            }
            switch (i)
            {
            default:
                return false;

            case 4096: 
                i = Math.min((view.getHeight() - view.getPaddingBottom() - view.getPaddingTop()) + view.getScrollY(), view.getScrollRange());
                if (i != view.getScrollY())
                {
                    view.smoothScrollTo(0, i);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                i = view.getHeight();
                int j = view.getPaddingBottom();
                int k = view.getPaddingTop();
                i = Math.max(view.getScrollY() - (i - j - k), 0);
                break;
            }
            if (i != view.getScrollY())
            {
                view.smoothScrollTo(0, i);
                return true;
            } else
            {
                return false;
            }
        }

        AccessibilityDelegate()
        {
        }
    }

    public static interface OnScrollChangeListener
    {

        public abstract void onScrollChange(NestedScrollView nestedscrollview, int i, int j, int k, int l);
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public int scrollPosition;

        public String toString()
        {
            return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" scrollPosition=").append(scrollPosition).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(scrollPosition);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            scrollPosition = parcel.readInt();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5F;
    private static final int SCROLLVIEW_STYLEABLE[] = {
        0x101017a
    };
    private static final String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private View mChildToScrollTo;
    private EdgeEffectCompat mEdgeGlowBottom;
    private EdgeEffectCompat mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private final NestedScrollingParentHelper mParentHelper;
    private SavedState mSavedState;
    private final int mScrollConsumed[];
    private final int mScrollOffset[];
    private ScrollerCompat mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    public NestedScrollView(Context context)
    {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTempRect = new Rect();
        mIsLayoutDirty = true;
        mIsLaidOut = false;
        mChildToScrollTo = null;
        mIsBeingDragged = false;
        mSmoothScrollingEnabled = true;
        mActivePointerId = -1;
        mScrollOffset = new int[2];
        mScrollConsumed = new int[2];
        initScrollView();
        context = context.obtainStyledAttributes(attributeset, SCROLLVIEW_STYLEABLE, i, 0);
        setFillViewport(context.getBoolean(0, false));
        context.recycle();
        mParentHelper = new NestedScrollingParentHelper(this);
        mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
    }

    private boolean canScroll()
    {
        boolean flag1 = false;
        View view = getChildAt(0);
        boolean flag = flag1;
        if (view != null)
        {
            int i = view.getHeight();
            flag = flag1;
            if (getHeight() < i + getPaddingTop() + getPaddingBottom())
            {
                flag = true;
            }
        }
        return flag;
    }

    private static int clamp(int i, int j, int k)
    {
        int l;
        if (j >= k || i < 0)
        {
            l = 0;
        } else
        {
            l = i;
            if (j + i > k)
            {
                return k - j;
            }
        }
        return l;
    }

    private void doScrollY(int i)
    {
label0:
        {
            if (i != 0)
            {
                if (!mSmoothScrollingEnabled)
                {
                    break label0;
                }
                smoothScrollBy(0, i);
            }
            return;
        }
        scrollBy(0, i);
    }

    private void endDrag()
    {
        mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll();
        if (mEdgeGlowTop != null)
        {
            mEdgeGlowTop.onRelease();
            mEdgeGlowBottom.onRelease();
        }
    }

    private void ensureGlows()
    {
        if (ViewCompat.getOverScrollMode(this) != 2)
        {
            if (mEdgeGlowTop == null)
            {
                Context context = getContext();
                mEdgeGlowTop = new EdgeEffectCompat(context);
                mEdgeGlowBottom = new EdgeEffectCompat(context);
            }
            return;
        } else
        {
            mEdgeGlowTop = null;
            mEdgeGlowBottom = null;
            return;
        }
    }

    private View findFocusableViewInBounds(boolean flag, int i, int j)
    {
        View view1;
        java.util.ArrayList arraylist;
        boolean flag1;
        int k;
        int i1;
        arraylist = getFocusables(2);
        view1 = null;
        flag1 = false;
        i1 = arraylist.size();
        k = 0;
_L2:
        View view;
        boolean flag2;
        int l;
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = (View)arraylist.get(k);
        l = view.getTop();
        int j1 = view.getBottom();
        if (i >= j1 || l >= j)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (i < l && j1 < j)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (view1 == null)
        {
            flag1 = flag2;
        } else
        {
label0:
            {
                if (flag && l < view1.getTop() || !flag && j1 > view1.getBottom())
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (!flag1)
                {
                    break label0;
                }
                if (!flag2 || !l)
                {
                    break MISSING_BLOCK_LABEL_192;
                }
            }
        }
_L3:
        k++;
        view1 = view;
        if (true) goto _L2; else goto _L1
        if (flag2)
        {
            flag1 = true;
        } else
        if (!l)
        {
            break MISSING_BLOCK_LABEL_192;
        }
          goto _L3
_L1:
        return view1;
        view = view1;
          goto _L3
    }

    private void flingWithNestedDispatch(int i)
    {
        int j = getScrollY();
        boolean flag;
        if ((j > 0 || i > 0) && (j < getScrollRange() || i < 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!dispatchNestedPreFling(0.0F, i))
        {
            dispatchNestedFling(0.0F, i, flag);
            if (flag)
            {
                fling(i);
            }
        }
    }

    private int getScrollRange()
    {
        int i = 0;
        if (getChildCount() > 0)
        {
            i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
        }
        return i;
    }

    private float getVerticalScrollFactorCompat()
    {
        if (mVerticalScrollFactor == 0.0F)
        {
            TypedValue typedvalue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
            {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            mVerticalScrollFactor = typedvalue.getDimension(context.getResources().getDisplayMetrics());
        }
        return mVerticalScrollFactor;
    }

    private boolean inChild(int i, int j)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getChildCount() > 0)
        {
            int k = getScrollY();
            View view = getChildAt(0);
            flag = flag1;
            if (j >= view.getTop() - k)
            {
                flag = flag1;
                if (j < view.getBottom() - k)
                {
                    flag = flag1;
                    if (i >= view.getLeft())
                    {
                        flag = flag1;
                        if (i < view.getRight())
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    private void initOrResetVelocityTracker()
    {
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
            return;
        } else
        {
            mVelocityTracker.clear();
            return;
        }
    }

    private void initScrollView()
    {
        mScroller = new ScrollerCompat(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(0x40000);
        setWillNotDraw(false);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        mTouchSlop = viewconfiguration.getScaledTouchSlop();
        mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
        mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
    }

    private void initVelocityTrackerIfNotExists()
    {
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private boolean isOffScreen(View view)
    {
        boolean flag = false;
        if (!isWithinDeltaOfScreen(view, 0, getHeight()))
        {
            flag = true;
        }
        return flag;
    }

    private static boolean isViewDescendantOf(View view, View view1)
    {
        if (view == view1)
        {
            return true;
        }
        view = view.getParent();
        boolean flag;
        if ((view instanceof ViewGroup) && isViewDescendantOf((View)view, view1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private boolean isWithinDeltaOfScreen(View view, int i, int j)
    {
        view.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view, mTempRect);
        return mTempRect.bottom + i >= getScrollY() && mTempRect.top - i <= getScrollY() + j;
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = (motionevent.getAction() & 0xff00) >> 8;
        if (MotionEventCompat.getPointerId(motionevent, i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mLastMotionY = (int)MotionEventCompat.getY(motionevent, i);
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
            if (mVelocityTracker != null)
            {
                mVelocityTracker.clear();
            }
        }
    }

    private void recycleVelocityTracker()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    private boolean scrollAndFocus(int i, int j, int k)
    {
        boolean flag1 = false;
        int i1 = getHeight();
        int l = getScrollY();
        i1 = l + i1;
        Object obj;
        View view;
        boolean flag;
        if (i == 33)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFocusableViewInBounds(flag, j, k);
        obj = view;
        if (view == null)
        {
            obj = this;
        }
        if (j >= l && k <= i1)
        {
            flag = flag1;
        } else
        {
            if (flag)
            {
                j -= l;
            } else
            {
                j = k - i1;
            }
            doScrollY(j);
            flag = true;
        }
        if (obj != findFocus())
        {
            ((View) (obj)).requestFocus(i);
        }
        return flag;
    }

    private void scrollToChild(View view)
    {
        view.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view, mTempRect);
        int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
        if (i != 0)
        {
            scrollBy(0, i);
        }
    }

    private boolean scrollToChildRect(Rect rect, boolean flag)
    {
        int i;
        boolean flag1;
label0:
        {
            i = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (i != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                scrollBy(0, i);
            }
            return flag1;
        }
        smoothScrollBy(0, i);
        return flag1;
    }

    public void addView(View view)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view);
            return;
        }
    }

    public void addView(View view, int i)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, i);
            return;
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, i, layoutparams);
            return;
        }
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, layoutparams);
            return;
        }
    }

    public boolean arrowScroll(int i)
    {
        View view;
        View view1;
        int k;
        view1 = findFocus();
        view = view1;
        if (view1 == this)
        {
            view = null;
        }
        view1 = FocusFinder.getInstance().findNextFocus(this, view, i);
        k = getMaxScrollAmount();
        if (view1 == null || !isWithinDeltaOfScreen(view1, k, getHeight())) goto _L2; else goto _L1
_L1:
        view1.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view1, mTempRect);
        doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
        view1.requestFocus(i);
_L8:
        if (view != null && view.isFocused() && isOffScreen(view))
        {
            i = getDescendantFocusability();
            setDescendantFocusability(0x20000);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
_L2:
        if (i != 33 || getScrollY() >= k) goto _L4; else goto _L3
_L3:
        int j = getScrollY();
_L6:
        if (j == 0)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        j = k;
        if (i == 130)
        {
            j = k;
            if (getChildCount() > 0)
            {
                int l = getChildAt(0).getBottom();
                int i1 = (getScrollY() + getHeight()) - getPaddingBottom();
                j = k;
                if (l - i1 < k)
                {
                    j = l - i1;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i != 130)
        {
            j = -j;
        }
        doScrollY(j);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int computeHorizontalScrollExtent()
    {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset()
    {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange()
    {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll()
    {
        if (mScroller.computeScrollOffset())
        {
            int j = getScrollX();
            int k = getScrollY();
            int l = mScroller.getCurrX();
            int i1 = mScroller.getCurrY();
            if (j != l || k != i1)
            {
                int j1 = getScrollRange();
                int i = ViewCompat.getOverScrollMode(this);
                boolean flag;
                if (i == 0 || i == 1 && j1 > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                overScrollByCompat(l - j, i1 - k, j, k, 0, j1, 0, 0, false);
                if (flag)
                {
                    ensureGlows();
                    if (i1 <= 0 && k > 0)
                    {
                        mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
                    } else
                    if (i1 >= j1 && k < j1)
                    {
                        mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
                        return;
                    }
                }
            }
        }
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
    {
        if (getChildCount() == 0)
        {
            return 0;
        }
        int l = getHeight();
        int i = getScrollY();
        int k = i + l;
        int i1 = getVerticalFadingEdgeLength();
        int j = i;
        if (rect.top > 0)
        {
            j = i + i1;
        }
        i = k;
        if (rect.bottom < getChildAt(0).getHeight())
        {
            i = k - i1;
        }
        if (rect.bottom > i && rect.top > j)
        {
            if (rect.height() > l)
            {
                j = (rect.top - j) + 0;
            } else
            {
                j = (rect.bottom - i) + 0;
            }
            i = Math.min(j, getChildAt(0).getBottom() - i);
        } else
        if (rect.top < j && rect.bottom < i)
        {
            if (rect.height() > l)
            {
                i = 0 - (i - rect.bottom);
            } else
            {
                i = 0 - (j - rect.top);
            }
            i = Math.max(i, -getScrollY());
        } else
        {
            i = 0;
        }
        return i;
    }

    public int computeVerticalScrollExtent()
    {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset()
    {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange()
    {
        int j = getChildCount();
        int i = getHeight() - getPaddingBottom() - getPaddingTop();
        if (j != 0)
        {
            int k = getChildAt(0).getBottom();
            int l = getScrollY();
            int i1 = Math.max(0, k - i);
            if (l < 0)
            {
                return k - l;
            }
            i = k;
            if (l > i1)
            {
                return k + (l - i1);
            }
        }
        return i;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
    }

    public boolean dispatchNestedFling(float f, float f1, boolean flag)
    {
        return mChildHelper.dispatchNestedFling(f, f1, flag);
    }

    public boolean dispatchNestedPreFling(float f, float f1)
    {
        return mChildHelper.dispatchNestedPreFling(f, f1);
    }

    public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
    {
        return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
    }

    public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
    {
        return mChildHelper.dispatchNestedScroll(i, j, k, l, ai);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mEdgeGlowTop != null)
        {
            int i = getScrollY();
            if (!mEdgeGlowTop.isFinished())
            {
                int j = canvas.save();
                int l = getWidth();
                int j1 = getPaddingLeft();
                int l1 = getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, i));
                mEdgeGlowTop.setSize(l - j1 - l1, getHeight());
                if (mEdgeGlowTop.draw(canvas))
                {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(j);
            }
            if (!mEdgeGlowBottom.isFinished())
            {
                int k = canvas.save();
                int i1 = getWidth() - getPaddingLeft() - getPaddingRight();
                int k1 = getHeight();
                canvas.translate(-i1 + getPaddingLeft(), Math.max(getScrollRange(), i) + k1);
                canvas.rotate(180F, i1, 0.0F);
                mEdgeGlowBottom.setSize(i1, k1);
                if (mEdgeGlowBottom.draw(canvas))
                {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(k);
            }
        }
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
        char c = '!';
        boolean flag1 = false;
        mTempRect.setEmpty();
        boolean flag;
        if (!canScroll())
        {
            flag = flag1;
            if (isFocused())
            {
                flag = flag1;
                if (keyevent.getKeyCode() != 4)
                {
                    View view = findFocus();
                    keyevent = view;
                    if (view == this)
                    {
                        keyevent = null;
                    }
                    keyevent = FocusFinder.getInstance().findNextFocus(this, keyevent, 130);
                    if (keyevent != null && keyevent != this && keyevent.requestFocus(130))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
        } else
        {
            flag = flag1;
            if (keyevent.getAction() == 0)
            {
                switch (keyevent.getKeyCode())
                {
                default:
                    return false;

                case 19: // '\023'
                    if (!keyevent.isAltPressed())
                    {
                        return arrowScroll(33);
                    } else
                    {
                        return fullScroll(33);
                    }

                case 20: // '\024'
                    if (!keyevent.isAltPressed())
                    {
                        return arrowScroll(130);
                    } else
                    {
                        return fullScroll(130);
                    }

                case 62: // '>'
                    break;
                }
                if (!keyevent.isShiftPressed())
                {
                    c = '\202';
                }
                pageScroll(c);
                return false;
            }
        }
        return flag;
    }

    public void fling(int i)
    {
        if (getChildCount() > 0)
        {
            int j = getHeight() - getPaddingBottom() - getPaddingTop();
            int k = getChildAt(0).getHeight();
            mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, k - j), 0, j / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean fullScroll(int i)
    {
        int j;
        int k;
        if (i == 130)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = getHeight();
        mTempRect.top = 0;
        mTempRect.bottom = k;
        if (j != 0)
        {
            j = getChildCount();
            if (j > 0)
            {
                View view = getChildAt(j - 1);
                mTempRect.bottom = view.getBottom() + getPaddingBottom();
                mTempRect.top = mTempRect.bottom - k;
            }
        }
        return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
    }

    protected float getBottomFadingEdgeStrength()
    {
        if (getChildCount() == 0)
        {
            return 0.0F;
        }
        int i = getVerticalFadingEdgeLength();
        int j = getHeight();
        int k = getPaddingBottom();
        j = getChildAt(0).getBottom() - getScrollY() - (j - k);
        if (j < i)
        {
            return (float)j / (float)i;
        } else
        {
            return 1.0F;
        }
    }

    public int getMaxScrollAmount()
    {
        return (int)(0.5F * (float)getHeight());
    }

    public int getNestedScrollAxes()
    {
        return mParentHelper.getNestedScrollAxes();
    }

    protected float getTopFadingEdgeStrength()
    {
        if (getChildCount() == 0)
        {
            return 0.0F;
        }
        int i = getVerticalFadingEdgeLength();
        int j = getScrollY();
        if (j < i)
        {
            return (float)j / (float)i;
        } else
        {
            return 1.0F;
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return mChildHelper.hasNestedScrollingParent();
    }

    public boolean isFillViewport()
    {
        return mFillViewport;
    }

    public boolean isNestedScrollingEnabled()
    {
        return mChildHelper.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled()
    {
        return mSmoothScrollingEnabled;
    }

    protected void measureChild(View view, int i, int j)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        i = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
        j = marginlayoutparams.topMargin;
        view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.bottomMargin + j, 0));
    }

    public void onAttachedToWindow()
    {
        mIsLaidOut = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if ((MotionEventCompat.getSource(motionevent) & 2) == 0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 8 8: default 32
    //                   8 34;
           goto _L2 _L3
_L2:
        return false;
_L3:
        int i;
        int j;
        int k;
        int l;
        float f;
        if (mIsBeingDragged || (f = MotionEventCompat.getAxisValue(motionevent, 9)) == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = (int)(f * getVerticalScrollFactorCompat());
        j = getScrollRange();
        l = getScrollY();
        k = l - i;
        if (k >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L5:
        if (i != l)
        {
            super.scrollTo(getScrollX(), i);
            return true;
        }
        if (true) goto _L2; else goto _L4
_L4:
        i = j;
        if (k <= j)
        {
            i = k;
        }
          goto _L5
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        flag = false;
        i = motionevent.getAction();
        if (i == 2 && mIsBeingDragged)
        {
            return true;
        }
        i & 0xff;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 207
    //                   1 292
    //                   2 73
    //                   3 292
    //                   4 68
    //                   5 68
    //                   6 342;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return mIsBeingDragged;
_L4:
        int j = mActivePointerId;
        if (j != -1)
        {
            int i1 = MotionEventCompat.findPointerIndex(motionevent, j);
            if (i1 == -1)
            {
                Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(j).append(" in onInterceptTouchEvent").toString());
            } else
            {
                int k = (int)MotionEventCompat.getY(motionevent, i1);
                if (Math.abs(k - mLastMotionY) > mTouchSlop && (getNestedScrollAxes() & 2) == 0)
                {
                    mIsBeingDragged = true;
                    mLastMotionY = k;
                    initVelocityTrackerIfNotExists();
                    mVelocityTracker.addMovement(motionevent);
                    mNestedYOffset = 0;
                    motionevent = getParent();
                    if (motionevent != null)
                    {
                        motionevent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int l = (int)motionevent.getY();
        if (!inChild((int)motionevent.getX(), l))
        {
            mIsBeingDragged = false;
            recycleVelocityTracker();
        } else
        {
            mLastMotionY = l;
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
            initOrResetVelocityTracker();
            mVelocityTracker.addMovement(motionevent);
            if (!mScroller.isFinished())
            {
                flag = true;
            }
            mIsBeingDragged = flag;
            startNestedScroll(2);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mIsBeingDragged = false;
        mActivePointerId = -1;
        recycleVelocityTracker();
        if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        stopNestedScroll();
        continue; /* Loop/switch isn't completed */
_L5:
        onSecondaryPointerUp(motionevent);
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mIsLayoutDirty = false;
        if (mChildToScrollTo != null && isViewDescendantOf(mChildToScrollTo, this))
        {
            scrollToChild(mChildToScrollTo);
        }
        mChildToScrollTo = null;
        if (mIsLaidOut) goto _L2; else goto _L1
_L1:
        if (mSavedState != null)
        {
            scrollTo(getScrollX(), mSavedState.scrollPosition);
            mSavedState = null;
        }
        if (getChildCount() > 0)
        {
            i = getChildAt(0).getMeasuredHeight();
        } else
        {
            i = 0;
        }
        i = Math.max(0, i - (l - j - getPaddingBottom() - getPaddingTop()));
        if (getScrollY() <= i) goto _L4; else goto _L3
_L3:
        scrollTo(getScrollX(), i);
_L2:
        scrollTo(getScrollX(), getScrollY());
        mIsLaidOut = true;
        return;
_L4:
        if (getScrollY() < 0)
        {
            scrollTo(getScrollX(), 0);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        break MISSING_BLOCK_LABEL_6;
        if (mFillViewport && android.view.View.MeasureSpec.getMode(j) != 0 && getChildCount() > 0)
        {
            View view = getChildAt(0);
            j = getMeasuredHeight();
            if (view.getMeasuredHeight() < j)
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j - getPaddingTop() - getPaddingBottom(), 0x40000000));
                return;
            }
        }
        return;
    }

    public boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        if (!flag)
        {
            flingWithNestedDispatch((int)f1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onNestedPreFling(View view, float f, float f1)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int j, int ai[])
    {
    }

    public void onNestedScroll(View view, int i, int j, int k, int l)
    {
        i = getScrollY();
        scrollBy(0, l);
        i = getScrollY() - i;
        dispatchNestedScroll(0, i, 0, l - i, null);
    }

    public void onNestedScrollAccepted(View view, View view1, int i)
    {
        mParentHelper.onNestedScrollAccepted(view, view1, i);
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
    {
        super.scrollTo(i, j);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect)
    {
        View view;
        int j;
        if (i == 2)
        {
            j = 130;
        } else
        {
            j = i;
            if (i == 1)
            {
                j = 33;
            }
        }
        if (rect == null)
        {
            view = FocusFinder.getInstance().findNextFocus(this, null, j);
        } else
        {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, j);
        }
        if (view == null || isOffScreen(view))
        {
            return false;
        } else
        {
            return view.requestFocus(j, rect);
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        mSavedState = parcelable;
        requestLayout();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.scrollPosition = getScrollY();
        return savedstate;
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (mOnScrollChangeListener != null)
        {
            mOnScrollChangeListener.onScrollChange(this, i, j, k, l);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        View view;
        for (view = findFocus(); view == null || this == view || !isWithinDeltaOfScreen(view, 0, l);)
        {
            return;
        }

        view.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view, mTempRect);
        doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
    }

    public boolean onStartNestedScroll(View view, View view1, int i)
    {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view)
    {
        mParentHelper.onStopNestedScroll(view);
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        MotionEvent motionevent1;
        int i;
        initVelocityTrackerIfNotExists();
        motionevent1 = MotionEvent.obtain(motionevent);
        i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 0)
        {
            mNestedYOffset = 0;
        }
        motionevent1.offsetLocation(0.0F, mNestedYOffset);
        i;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 101
    //                   1 731
    //                   2 200
    //                   3 829
    //                   4 80
    //                   5 884
    //                   6 914;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L2:
        if (getChildCount() == 0)
        {
            return false;
        }
        boolean flag;
        if (!mScroller.isFinished())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsBeingDragged = flag;
        if (flag)
        {
            ViewParent viewparent = getParent();
            if (viewparent != null)
            {
                viewparent.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (!mScroller.isFinished())
        {
            mScroller.abortAnimation();
        }
        mLastMotionY = (int)motionevent.getY();
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        startNestedScroll(2);
        continue; /* Loop/switch isn't completed */
_L4:
        int k;
        int l;
        int i1;
        l = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (l == -1)
        {
            Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(mActivePointerId).append(" in onTouchEvent").toString());
            continue; /* Loop/switch isn't completed */
        }
        i1 = (int)MotionEventCompat.getY(motionevent, l);
        k = mLastMotionY - i1;
        i = k;
        if (dispatchNestedPreScroll(0, k, mScrollConsumed, mScrollOffset))
        {
            i = k - mScrollConsumed[1];
            motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
            mNestedYOffset = mNestedYOffset + mScrollOffset[1];
        }
        int j1;
        if (!mIsBeingDragged && Math.abs(i) > mTouchSlop)
        {
            ViewParent viewparent1 = getParent();
            if (viewparent1 != null)
            {
                viewparent1.requestDisallowInterceptTouchEvent(true);
            }
            mIsBeingDragged = true;
            int k1;
            if (i > 0)
            {
                i -= mTouchSlop;
            } else
            {
                i += mTouchSlop;
            }
        }
        if (!mIsBeingDragged)
        {
            continue; /* Loop/switch isn't completed */
        }
        mLastMotionY = i1 - mScrollOffset[1];
        j1 = getScrollY();
        i1 = getScrollRange();
        k = ViewCompat.getOverScrollMode(this);
        if (k == 0 || k == 1 && i1 > 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (overScrollByCompat(0, i, 0, getScrollY(), 0, i1, 0, 0, true) && !hasNestedScrollingParent())
        {
            mVelocityTracker.clear();
        }
        k1 = getScrollY() - j1;
        if (dispatchNestedScroll(0, k1, 0, i - k1, mScrollOffset))
        {
            mLastMotionY = mLastMotionY - mScrollOffset[1];
            motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
            mNestedYOffset = mNestedYOffset + mScrollOffset[1];
            continue; /* Loop/switch isn't completed */
        }
        if (!k)
        {
            continue; /* Loop/switch isn't completed */
        }
        ensureGlows();
        k = j1 + i;
        if (k >= 0) goto _L9; else goto _L8
_L8:
        mEdgeGlowTop.onPull((float)i / (float)getHeight(), MotionEventCompat.getX(motionevent, l) / (float)getWidth());
        if (!mEdgeGlowBottom.isFinished())
        {
            mEdgeGlowBottom.onRelease();
        }
_L10:
        if (mEdgeGlowTop != null && (!mEdgeGlowTop.isFinished() || !mEdgeGlowBottom.isFinished()))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (k > i1)
        {
            mEdgeGlowBottom.onPull((float)i / (float)getHeight(), 1.0F - MotionEventCompat.getX(motionevent, l) / (float)getWidth());
            if (!mEdgeGlowTop.isFinished())
            {
                mEdgeGlowTop.onRelease();
            }
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (!mIsBeingDragged) goto _L12; else goto _L11
_L11:
        motionevent = mVelocityTracker;
        motionevent.computeCurrentVelocity(1000, mMaximumVelocity);
        i = (int)VelocityTrackerCompat.getYVelocity(motionevent, mActivePointerId);
        if (Math.abs(i) <= mMinimumVelocity) goto _L14; else goto _L13
_L13:
        flingWithNestedDispatch(-i);
_L12:
        mActivePointerId = -1;
        endDrag();
        continue; /* Loop/switch isn't completed */
_L14:
        if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        if (true) goto _L12; else goto _L5
_L5:
        if (mIsBeingDragged && getChildCount() > 0 && mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        mActivePointerId = -1;
        endDrag();
        continue; /* Loop/switch isn't completed */
_L6:
        int j = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionY = (int)MotionEventCompat.getY(motionevent, j);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, j);
        continue; /* Loop/switch isn't completed */
_L7:
        onSecondaryPointerUp(motionevent);
        mLastMotionY = (int)MotionEventCompat.getY(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        if (true) goto _L1; else goto _L15
_L15:
    }

    boolean overScrollByCompat(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag)
    {
        int i2 = ViewCompat.getOverScrollMode(this);
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i2 == 0 || i2 == 1 && flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i2 == 0 || i2 == 1 && flag2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = k + i;
        if (!flag1)
        {
            k1 = 0;
        }
        j = l + j;
        if (!flag2)
        {
            l1 = 0;
        }
        l = -k1;
        k1 += i1;
        k = -l1;
        i1 = l1 + j1;
        if (i > k1)
        {
            flag = true;
            i = k1;
        } else
        if (i < l)
        {
            flag = true;
            i = l;
        } else
        {
            flag = false;
        }
        if (j > i1)
        {
            flag3 = true;
            j = i1;
        } else
        if (j < k)
        {
            flag3 = true;
            j = k;
        } else
        {
            flag3 = false;
        }
        if (flag3)
        {
            mScroller.springBack(i, j, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i, j, flag, flag3);
        return flag || flag3;
    }

    public boolean pageScroll(int i)
    {
        int k;
        View view;
        int j;
        if (i == 130)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = getHeight();
        if (j == 0) goto _L2; else goto _L1
_L1:
        mTempRect.top = getScrollY() + k;
        j = getChildCount();
        if (j > 0)
        {
            view = getChildAt(j - 1);
            if (mTempRect.top + k > view.getBottom())
            {
                mTempRect.top = view.getBottom() - k;
            }
        }
_L4:
        mTempRect.bottom = mTempRect.top + k;
        return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
_L2:
        mTempRect.top = getScrollY() - k;
        if (mTempRect.top < 0)
        {
            mTempRect.top = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void requestChildFocus(View view, View view1)
    {
        if (!mIsLayoutDirty)
        {
            scrollToChild(view1);
        } else
        {
            mChildToScrollTo = view1;
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (flag)
        {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        mIsLayoutDirty = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int j)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            i = clamp(i, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
            j = clamp(j, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
            if (i != getScrollX() || j != getScrollY())
            {
                super.scrollTo(i, j);
            }
        }
    }

    public void setFillViewport(boolean flag)
    {
        if (flag != mFillViewport)
        {
            mFillViewport = flag;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        mChildHelper.setNestedScrollingEnabled(flag);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onscrollchangelistener)
    {
        mOnScrollChangeListener = onscrollchangelistener;
    }

    public void setSmoothScrollingEnabled(boolean flag)
    {
        mSmoothScrollingEnabled = flag;
    }

    public boolean shouldDelayChildPressedState()
    {
        return true;
    }

    public final void smoothScrollBy(int i, int j)
    {
        if (getChildCount() == 0)
        {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
        {
            i = getHeight();
            int k = getPaddingBottom();
            int l = getPaddingTop();
            k = Math.max(0, getChildAt(0).getHeight() - (i - k - l));
            i = getScrollY();
            j = Math.max(0, Math.min(i + j, k));
            mScroller.startScroll(getScrollX(), i, 0, j - i);
            ViewCompat.postInvalidateOnAnimation(this);
        } else
        {
            if (!mScroller.isFinished())
            {
                mScroller.abortAnimation();
            }
            scrollBy(i, j);
        }
        mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void smoothScrollTo(int i, int j)
    {
        smoothScrollBy(i - getScrollX(), j - getScrollY());
    }

    public boolean startNestedScroll(int i)
    {
        return mChildHelper.startNestedScroll(i);
    }

    public void stopNestedScroll()
    {
        mChildHelper.stopNestedScroll();
    }


}
