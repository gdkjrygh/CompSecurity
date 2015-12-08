// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
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
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
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
    implements NestedScrollingChild, NestedScrollingParent
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
                i = view.getHeight();
                int j = view.getPaddingBottom();
                int l = view.getPaddingTop();
                i = Math.min(view.getScrollY() + (i - j - l), view.getScrollRange());
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
                int k = view.getPaddingBottom();
                int i1 = view.getPaddingTop();
                i = Math.max(view.getScrollY() - (i - k - i1), 0);
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
    private static final int SCROLLVIEW_STYLEABLE[] = {
        0x101017a
    };
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

    private boolean canScroll()
    {
        boolean flag1 = false;
        View view = getChildAt(0);
        boolean flag = flag1;
        if (view != null)
        {
            int i = view.getHeight();
            flag = flag1;
            if (getHeight() < getPaddingTop() + i + getPaddingBottom())
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
        java.util.ArrayList arraylist = getFocusables(2);
        View view2 = null;
        boolean flag3 = false;
        int i1 = arraylist.size();
        int k = 0;
        while (k < i1) 
        {
            View view1 = (View)arraylist.get(k);
            int l = view1.getTop();
            int j1 = view1.getBottom();
            View view = view2;
            boolean flag2 = flag3;
            if (i < j1)
            {
                view = view2;
                flag2 = flag3;
                if (l < j)
                {
                    boolean flag1;
                    if (i < l && j1 < j)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (view2 == null)
                    {
                        view = view1;
                        flag2 = flag1;
                    } else
                    {
                        boolean flag4;
                        if (flag && l < view2.getTop() || !flag && j1 > view2.getBottom())
                        {
                            flag4 = true;
                        } else
                        {
                            flag4 = false;
                        }
                        if (flag3)
                        {
                            view = view2;
                            flag2 = flag3;
                            if (flag1)
                            {
                                view = view2;
                                flag2 = flag3;
                                if (flag4)
                                {
                                    view = view1;
                                    flag2 = flag3;
                                }
                            }
                        } else
                        if (flag1)
                        {
                            view = view1;
                            flag2 = true;
                        } else
                        {
                            view = view2;
                            flag2 = flag3;
                            if (flag4)
                            {
                                view = view1;
                                flag2 = flag3;
                            }
                        }
                    }
                }
            }
            k++;
            view2 = view;
            flag3 = flag2;
        }
        return view2;
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
        if (view != view1)
        {
            if (!((view = view.getParent()) instanceof ViewGroup) || !isViewDescendantOf((View)view, view1))
            {
                return false;
            }
        }
        return true;
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
        boolean flag1 = true;
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
            flag = false;
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
            flag = flag1;
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
        int l;
        boolean flag;
        flag = false;
        view1 = findFocus();
        view = view1;
        if (view1 == this)
        {
            view = null;
        }
        view1 = FocusFinder.getInstance().findNextFocus(this, view, i);
        l = getMaxScrollAmount();
        if (view1 == null || !isWithinDeltaOfScreen(view1, l, getHeight())) goto _L2; else goto _L1
_L1:
        view1.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view1, mTempRect);
        doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
        view1.requestFocus(i);
_L6:
        if (view != null && view.isFocused() && isOffScreen(view))
        {
            i = getDescendantFocusability();
            setDescendantFocusability(0x20000);
            requestFocus();
            setDescendantFocusability(i);
        }
        flag = true;
_L4:
        return flag;
_L2:
        int j;
        int k = l;
        if (i == 33 && getScrollY() < k)
        {
            j = getScrollY();
        } else
        {
            j = k;
            if (i == 130)
            {
                j = k;
                if (getChildCount() > 0)
                {
                    int i1 = getChildAt(0).getBottom();
                    int j1 = (getScrollY() + getHeight()) - getPaddingBottom();
                    j = k;
                    if (i1 - j1 < l)
                    {
                        j = i1 - j1;
                    }
                }
            }
        }
        if (j == 0) goto _L4; else goto _L3
_L3:
        if (i != 130)
        {
            j = -j;
        }
        doScrollY(j);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void computeScroll()
    {
        boolean flag1 = true;
        if (mScroller.computeScrollOffset())
        {
            int i = getScrollX();
            int j = getScrollY();
            int k = mScroller.getCurrX();
            int l = mScroller.getCurrY();
            if (i != k || j != l)
            {
                int i1 = getScrollRange();
                int j1 = ViewCompat.getOverScrollMode(this);
                boolean flag = flag1;
                if (j1 != 0)
                {
                    if (j1 == 1 && i1 > 0)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                overScrollByCompat(k - i, l - j, i, j, 0, i1, 0, 0, false);
                if (flag)
                {
                    ensureGlows();
                    if (l <= 0 && j > 0)
                    {
                        mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
                    } else
                    if (l >= i1 && j < i1)
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
        if (getChildCount() != 0)
        {
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
                    j = 0 + (rect.top - j);
                } else
                {
                    j = 0 + (rect.bottom - i);
                }
                return Math.min(j, getChildAt(0).getBottom() - i);
            }
            if (rect.top < j && rect.bottom < i)
            {
                if (rect.height() > l)
                {
                    i = 0 - (i - rect.bottom);
                } else
                {
                    i = 0 - (j - rect.top);
                }
                return Math.max(i, -getScrollY());
            }
        }
        return 0;
    }

    protected int computeVerticalScrollOffset()
    {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    protected int computeVerticalScrollRange()
    {
        int k;
        int l;
        int i1;
        k = getChildCount();
        int i = getHeight() - getPaddingBottom() - getPaddingTop();
        if (k == 0)
        {
            return i;
        }
        k = getChildAt(0).getBottom();
        l = getScrollY();
        i1 = Math.max(0, k - i);
        if (l >= 0) goto _L2; else goto _L1
_L1:
        int j = k - l;
_L4:
        return j;
_L2:
        j = k;
        if (l > i1)
        {
            j = k + (l - i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        boolean flag1;
        boolean flag2;
        flag2 = false;
        mTempRect.setEmpty();
        if (!canScroll())
        {
            boolean flag = flag2;
            if (isFocused())
            {
                flag = flag2;
                if (keyevent.getKeyCode() != 4)
                {
                    View view = findFocus();
                    keyevent = view;
                    if (view == this)
                    {
                        keyevent = null;
                    }
                    keyevent = FocusFinder.getInstance().findNextFocus(this, keyevent, 130);
                    flag = flag2;
                    if (keyevent != null)
                    {
                        flag = flag2;
                        if (keyevent != this)
                        {
                            flag = flag2;
                            if (keyevent.requestFocus(130))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
            return flag;
        }
        flag2 = false;
        flag1 = flag2;
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 156
    //                   19: 163
    //                   20: 192
    //                   62: 223;
           goto _L3 _L4 _L5 _L6
_L3:
        flag1 = flag2;
_L2:
        return flag1;
_L4:
        if (!keyevent.isAltPressed())
        {
            flag1 = arrowScroll(33);
        } else
        {
            flag1 = fullScroll(33);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!keyevent.isAltPressed())
        {
            flag1 = arrowScroll(130);
        } else
        {
            flag1 = fullScroll(130);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        char c;
        if (keyevent.isShiftPressed())
        {
            c = '!';
        } else
        {
            c = '\202';
        }
        pageScroll(c);
        flag1 = flag2;
        if (true) goto _L2; else goto _L7
_L7:
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

    public boolean isNestedScrollingEnabled()
    {
        return mChildHelper.isNestedScrollingEnabled();
    }

    protected void measureChild(View view, int i, int j)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
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
        i = (int)(getVerticalScrollFactorCompat() * f);
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
        i = k;
        if (k > j)
        {
            i = j;
        }
          goto _L5
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        flag = true;
        i = motionevent.getAction();
        if (i == 2 && mIsBeingDragged)
        {
            return true;
        }
        if (getScrollY() == 0 && !ViewCompat.canScrollVertically(this, 1))
        {
            return false;
        }
        i & 0xff;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 228
    //                   1 316
    //                   2 93
    //                   3 316
    //                   4 88
    //                   5 88
    //                   6 337;
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
            if (mScroller.isFinished())
            {
                flag = false;
            }
            mIsBeingDragged = flag;
            startNestedScroll(2);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mIsBeingDragged = false;
        mActivePointerId = -1;
        recycleVelocityTracker();
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
    //                   1 740
    //                   2 200
    //                   3 806
    //                   4 80
    //                   5 832
    //                   6 862;
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
        int l;
        int i1;
        int j1;
        i1 = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (i1 == -1)
        {
            Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(mActivePointerId).append(" in onTouchEvent").toString());
            continue; /* Loop/switch isn't completed */
        }
        j1 = (int)MotionEventCompat.getY(motionevent, i1);
        i = mLastMotionY - j1;
        l = i;
        if (dispatchNestedPreScroll(0, i, mScrollConsumed, mScrollOffset))
        {
            l = i - mScrollConsumed[1];
            motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
            mNestedYOffset = mNestedYOffset + mScrollOffset[1];
        }
        i = l;
        int k1;
        if (!mIsBeingDragged)
        {
            i = l;
            if (Math.abs(l) > mTouchSlop)
            {
                ViewParent viewparent1 = getParent();
                if (viewparent1 != null)
                {
                    viewparent1.requestDisallowInterceptTouchEvent(true);
                }
                mIsBeingDragged = true;
                int l1;
                if (l > 0)
                {
                    i = l - mTouchSlop;
                } else
                {
                    i = l + mTouchSlop;
                }
            }
        }
        if (!mIsBeingDragged)
        {
            continue; /* Loop/switch isn't completed */
        }
        mLastMotionY = j1 - mScrollOffset[1];
        k1 = getScrollY();
        j1 = getScrollRange();
        l = ViewCompat.getOverScrollMode(this);
        if (l == 0 || l == 1 && j1 > 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (overScrollByCompat(0, i, 0, getScrollY(), 0, j1, 0, 0, true) && !hasNestedScrollingParent())
        {
            mVelocityTracker.clear();
        }
        l1 = getScrollY() - k1;
        if (dispatchNestedScroll(0, l1, 0, i - l1, mScrollOffset))
        {
            mLastMotionY = mLastMotionY - mScrollOffset[1];
            motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
            mNestedYOffset = mNestedYOffset + mScrollOffset[1];
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ensureGlows();
        l = k1 + i;
        if (l >= 0) goto _L9; else goto _L8
_L8:
        mEdgeGlowTop.onPull((float)i / (float)getHeight(), MotionEventCompat.getX(motionevent, i1) / (float)getWidth());
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
        if (l > j1)
        {
            mEdgeGlowBottom.onPull((float)i / (float)getHeight(), 1.0F - MotionEventCompat.getX(motionevent, i1) / (float)getWidth());
            if (!mEdgeGlowTop.isFinished())
            {
                mEdgeGlowTop.onRelease();
            }
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (mIsBeingDragged)
        {
            motionevent = mVelocityTracker;
            motionevent.computeCurrentVelocity(1000, mMaximumVelocity);
            int j = (int)VelocityTrackerCompat.getYVelocity(motionevent, mActivePointerId);
            if (Math.abs(j) > mMinimumVelocity)
            {
                flingWithNestedDispatch(-j);
            }
            mActivePointerId = -1;
            endDrag();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (mIsBeingDragged && getChildCount() > 0)
        {
            mActivePointerId = -1;
            endDrag();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionY = (int)MotionEventCompat.getY(motionevent, k);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, k);
        continue; /* Loop/switch isn't completed */
_L7:
        onSecondaryPointerUp(motionevent);
        mLastMotionY = (int)MotionEventCompat.getY(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        if (true) goto _L1; else goto _L11
_L11:
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
        k += i;
        if (!flag1)
        {
            k1 = 0;
        }
        l += j;
        if (!flag2)
        {
            l1 = 0;
        }
        j = -k1;
        i = k1 + i1;
        i1 = -l1;
        j1 = l1 + j1;
        flag = false;
        if (k > i)
        {
            flag = true;
        } else
        {
            i = k;
            if (k < j)
            {
                i = j;
                flag = true;
            }
        }
        flag3 = false;
        if (l > j1)
        {
            j = j1;
            flag3 = true;
        } else
        {
            j = l;
            if (l < i1)
            {
                j = i1;
                flag3 = true;
            }
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
