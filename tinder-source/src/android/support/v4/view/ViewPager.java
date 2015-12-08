// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v4.view:
//            t, x, n, w, 
//            g, ab, a

public class ViewPager extends ViewGroup
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR;
        int a;
        Parcelable b;
        ClassLoader c;

        public String toString()
        {
            return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            super.writeToParcel(parcel, k);
            parcel.writeInt(a);
            parcel.writeParcelable(b, k);
        }

        static 
        {
            Object obj = new android.support.v4.e.b() {

                public final Object a(Parcel parcel, ClassLoader classloader)
                {
                    return new SavedState(parcel, classloader);
                }

                public final volatile Object[] a(int k)
                {
                    return new SavedState[k];
                }

            };
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                obj = new android.support.v4.e.c(((android.support.v4.e.b) (obj)));
            } else
            {
                obj = new android.support.v4.e.a.a(((android.support.v4.e.b) (obj)));
            }
            CREATOR = ((android.os.Parcelable.Creator) (obj));
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            a = parcel.readInt();
            b = parcel.readParcelable(classloader1);
            c = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static interface a
    {
    }

    static final class b
    {

        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b()
        {
        }
    }

    public static final class c extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public c()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public c(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS);
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }

    final class d extends android.support.v4.view.a
    {

        final ViewPager a;

        private boolean a()
        {
            return a.mAdapter != null && a.mAdapter.getCount() > 1;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = android.support.v4.view.a.g.a();
            view.a(a());
            if (accessibilityevent.getEventType() == 4096 && a.mAdapter != null)
            {
                view.a(a.mAdapter.getCount());
                view.b(a.mCurItem);
                view.c(a.mCurItem);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, android.support.v4.view.a.c c1)
        {
            super.onInitializeAccessibilityNodeInfo(view, c1);
            c1.b(android/support/v4/view/ViewPager.getName());
            c1.f(a());
            if (a.canScrollHorizontally(1))
            {
                c1.a(4096);
            }
            if (a.canScrollHorizontally(-1))
            {
                c1.a(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int k, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, k, bundle))
            {
                return true;
            }
            switch (k)
            {
            default:
                return false;

            case 4096: 
                if (a.canScrollHorizontally(1))
                {
                    a.setCurrentItem(a.mCurItem + 1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                break;
            }
            if (a.canScrollHorizontally(-1))
            {
                a.setCurrentItem(a.mCurItem - 1);
                return true;
            } else
            {
                return false;
            }
        }

        d()
        {
            a = ViewPager.this;
            super();
        }
    }

    static interface e
    {
    }

    public static interface f
    {

        public abstract void a(int k);

        public abstract void a(int k, float f1, int l);

        public abstract void b(int k);
    }

    public static interface g
    {

        public abstract void transformPage(View view, float f1);
    }

    private final class h extends DataSetObserver
    {

        final ViewPager a;

        public final void onChanged()
        {
            a.dataSetChanged();
        }

        public final void onInvalidated()
        {
            a.dataSetChanged();
        }

        private h()
        {
            a = ViewPager.this;
            super();
        }

        h(byte byte0)
        {
            this();
        }
    }

    public static class i
        implements f
    {

        public final void a(int k)
        {
        }

        public final void a(int k, float f1, int l)
        {
        }

        public void b(int k)
        {
        }

        public i()
        {
        }
    }

    static final class j
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (View)obj1;
            obj = (c)((View) (obj)).getLayoutParams();
            obj1 = (c)((View) (obj1)).getLayoutParams();
            if (((c) (obj)).a != ((c) (obj1)).a)
            {
                return !((c) (obj)).a ? -1 : 1;
            } else
            {
                return ((c) (obj)).e - ((c) (obj1)).e;
            }
        }

        j()
        {
        }
    }


    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (b)obj;
            obj1 = (b)obj1;
            return ((b) (obj)).b - ((b) (obj1)).b;
        }

    };
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int LAYOUT_ATTRS[] = {
        0x10100b3
    };
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    public static final Interpolator sInterpolator = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private static final j sPositionComparator = new j();
    private int mActivePointerId;
    private t mAdapter;
    private e mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private f mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private android.support.v4.widget.i mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private h mObserver;
    private int mOffscreenPageLimit;
    private f mOnPageChangeListener;
    private List mOnPageChangeListeners;
    private int mPageMargin;
    private g mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private android.support.v4.widget.i mRightEdge;
    private int mScrollState;
    public Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final b mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public ViewPager(Context context)
    {
        super(context);
        mItems = new ArrayList();
        mTempItem = new b();
        mTempRect = new Rect();
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
        mFirstOffset = -3.402823E+38F;
        mLastOffset = 3.402823E+38F;
        mOffscreenPageLimit = 1;
        mActivePointerId = -1;
        mFirstLayout = true;
        mNeedCalculatePageOffsets = false;
        mEndScrollRunnable = new Runnable() {

            final ViewPager a;

            public final void run()
            {
                a.setScrollState(0);
                a.populate();
            }

            
            {
                a = ViewPager.this;
                super();
            }
        };
        mScrollState = 0;
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mItems = new ArrayList();
        mTempItem = new b();
        mTempRect = new Rect();
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
        mFirstOffset = -3.402823E+38F;
        mLastOffset = 3.402823E+38F;
        mOffscreenPageLimit = 1;
        mActivePointerId = -1;
        mFirstLayout = true;
        mNeedCalculatePageOffsets = false;
        mEndScrollRunnable = new _cls3();
        mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(b b1, int k, b b2)
    {
        int l1 = mAdapter.getCount();
        int l = getClientWidth();
        float f4;
        if (l > 0)
        {
            f4 = (float)mPageMargin / (float)l;
        } else
        {
            f4 = 0.0F;
        }
        if (b2 != null)
        {
            l = b2.b;
            if (l < b1.b)
            {
                float f1 = b2.e + b2.d + f4;
                int i1 = 0;
                for (l++; l <= b1.b && i1 < mItems.size(); l++)
                {
                    for (b2 = (b)mItems.get(i1); l > b2.b && i1 < mItems.size() - 1; b2 = (b)mItems.get(i1))
                    {
                        i1++;
                    }

                    while (l < b2.b) 
                    {
                        float f5 = mAdapter.getPageWidth(l);
                        l++;
                        f1 = f5 + f4 + f1;
                    }
                    b2.e = f1;
                    f1 += b2.d + f4;
                }

            } else
            if (l > b1.b)
            {
                int j1 = mItems.size();
                float f2 = b2.e;
                j1--;
                for (l--; l >= b1.b && j1 >= 0; l--)
                {
                    for (b2 = (b)mItems.get(j1); l < b2.b && j1 > 0; b2 = (b)mItems.get(j1))
                    {
                        j1--;
                    }

                    while (l > b2.b) 
                    {
                        float f6 = mAdapter.getPageWidth(l);
                        l--;
                        f2 -= f6 + f4;
                    }
                    f2 -= b2.d + f4;
                    b2.e = f2;
                }

            }
        }
        int i2 = mItems.size();
        float f7 = b1.e;
        l = b1.b - 1;
        float f3;
        int k1;
        if (b1.b == 0)
        {
            f3 = b1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        mFirstOffset = f3;
        if (b1.b == l1 - 1)
        {
            f3 = (b1.e + b1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        mLastOffset = f3;
        k1 = k - 1;
        f3 = f7;
        for (; k1 >= 0; k1--)
        {
            for (b2 = (b)mItems.get(k1); l > b2.b; l--)
            {
                f3 -= mAdapter.getPageWidth(l) + f4;
            }

            f3 -= b2.d + f4;
            b2.e = f3;
            if (b2.b == 0)
            {
                mFirstOffset = f3;
            }
            l--;
        }

        f3 = b1.e + b1.d + f4;
        k1 = b1.b + 1;
        l = k + 1;
        k = k1;
        for (; l < i2; l++)
        {
            for (b1 = (b)mItems.get(l); k < b1.b; k++)
            {
                f3 += mAdapter.getPageWidth(k) + f4;
            }

            if (b1.b == l1 - 1)
            {
                mLastOffset = (b1.d + f3) - 1.0F;
            }
            b1.e = f3;
            f3 += b1.d + f4;
            k++;
        }

        mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean flag)
    {
label0:
        {
            int k;
            boolean flag1;
            boolean flag2;
            if (mScrollState == 2)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                setScrollingCacheEnabled(false);
                mScroller.abortAnimation();
                int l = getScrollX();
                int i1 = getScrollY();
                int j1 = mScroller.getCurrX();
                int k1 = mScroller.getCurrY();
                if (l != j1 || i1 != k1)
                {
                    scrollTo(j1, k1);
                    if (j1 != l)
                    {
                        pageScrolled(j1);
                    }
                }
            }
            mPopulatePending = false;
            flag2 = false;
            flag1 = k;
            for (k = ((flag2) ? 1 : 0); k < mItems.size(); k++)
            {
                b b1 = (b)mItems.get(k);
                if (b1.c)
                {
                    b1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                x.a(this, mEndScrollRunnable);
            }
            return;
        }
        mEndScrollRunnable.run();
    }

    private int determineTargetPage(int k, float f1, int l, int i1)
    {
        if (Math.abs(i1) > mFlingDistance && Math.abs(l) > mMinimumVelocity)
        {
            if (l <= 0)
            {
                k++;
            }
        } else
        {
            float f2;
            if (k >= mCurItem)
            {
                f2 = 0.4F;
            } else
            {
                f2 = 0.6F;
            }
            k = (int)(f2 + ((float)k + f1));
        }
        l = k;
        if (mItems.size() > 0)
        {
            b b1 = (b)mItems.get(0);
            b b2 = (b)mItems.get(mItems.size() - 1);
            l = Math.max(b1.b, Math.min(k, b2.b));
        }
        return l;
    }

    private void dispatchOnPageScrolled(int k, float f1, int l)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.a(k, f1, l);
        }
        if (mOnPageChangeListeners != null)
        {
            int j1 = mOnPageChangeListeners.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                f f2 = (f)mOnPageChangeListeners.get(i1);
                if (f2 != null)
                {
                    f2.a(k, f1, l);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.a(k, f1, l);
        }
    }

    private void dispatchOnPageSelected(int k)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.b(k);
        }
        if (mOnPageChangeListeners != null)
        {
            int i1 = mOnPageChangeListeners.size();
            for (int l = 0; l < i1; l++)
            {
                f f1 = (f)mOnPageChangeListeners.get(l);
                if (f1 != null)
                {
                    f1.b(k);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.b(k);
        }
    }

    private void dispatchOnScrollStateChanged(int k)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.a(k);
        }
        if (mOnPageChangeListeners != null)
        {
            int i1 = mOnPageChangeListeners.size();
            for (int l = 0; l < i1; l++)
            {
                f f1 = (f)mOnPageChangeListeners.get(l);
                if (f1 != null)
                {
                    f1.a(k);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.a(k);
        }
    }

    private void enableLayers(boolean flag)
    {
        int l = getChildCount();
        int k = 0;
        while (k < l) 
        {
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            x.a(getChildAt(k), byte0, null);
            k++;
        }
    }

    private void endDrag()
    {
        mIsBeingDragged = false;
        mIsUnableToDrag = false;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    private int getClientWidth()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private b infoForCurrentScrollPosition()
    {
        int k = getClientWidth();
        float f1;
        float f2;
        float f3;
        float f4;
        b b2;
        boolean flag;
        int l;
        if (k > 0)
        {
            f1 = (float)getScrollX() / (float)k;
        } else
        {
            f1 = 0.0F;
        }
        if (k > 0)
        {
            f2 = (float)mPageMargin / (float)k;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        l = -1;
        k = 0;
        flag = true;
        b2 = null;
        do
        {
            b b1;
label0:
            {
                b b3;
label1:
                {
                    b3 = b2;
                    if (k >= mItems.size())
                    {
                        break label1;
                    }
                    b1 = (b)mItems.get(k);
                    if (!flag && b1.b != l + 1)
                    {
                        b1 = mTempItem;
                        b1.e = f4 + f3 + f2;
                        b1.b = l + 1;
                        b1.d = mAdapter.getPageWidth(b1.b);
                        k--;
                    }
                    f3 = b1.e;
                    f4 = b1.d;
                    if (!flag)
                    {
                        b3 = b2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && k != mItems.size() - 1)
                    {
                        break label0;
                    }
                    b3 = b1;
                }
                return b3;
            }
            l = b1.b;
            f4 = b1.d;
            flag = false;
            k++;
            b2 = b1;
        } while (true);
    }

    private boolean isGutterDrag(float f1, float f2)
    {
        return f1 < (float)mGutterSize && f2 > 0.0F || f1 > (float)(getWidth() - mGutterSize) && f2 < 0.0F;
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int k = n.b(motionevent);
        if (n.b(motionevent, k) == mActivePointerId)
        {
            if (k == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            mLastMotionX = n.c(motionevent, k);
            mActivePointerId = n.b(motionevent, k);
            if (mVelocityTracker != null)
            {
                mVelocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int k)
    {
        boolean flag = false;
        if (mItems.size() == 0)
        {
            mCalledSuper = false;
            onPageScrolled(0, 0.0F, 0);
            if (!mCalledSuper)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            b b1 = infoForCurrentScrollPosition();
            int i1 = getClientWidth();
            int j1 = mPageMargin;
            float f1 = (float)mPageMargin / (float)i1;
            int l = b1.b;
            f1 = ((float)k / (float)i1 - b1.e) / (b1.d + f1);
            k = (int)((float)(j1 + i1) * f1);
            mCalledSuper = false;
            onPageScrolled(l, f1, k);
            if (!mCalledSuper)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private boolean performDrag(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = mLastMotionX;
        mLastMotionX = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int k = getClientWidth();
        f1 = (float)k * mFirstOffset;
        f2 = k;
        float f4 = mLastOffset;
        b b1 = (b)mItems.get(0);
        b b2 = (b)mItems.get(mItems.size() - 1);
        boolean flag;
        if (b1.b != 0)
        {
            f1 = b1.e * (float)k;
            flag = false;
        } else
        {
            flag = true;
        }
        if (b2.b != mAdapter.getCount() - 1)
        {
            f2 = b2.e * (float)k;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = mLeftEdge.a(Math.abs(f1 - f3) / (float)k);
            f2 = f1;
        }
_L4:
        mLastMotionX = mLastMotionX + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        pageScrolled((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = mRightEdge.a(Math.abs(f3 - f2) / (float)k);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void recomputeScrollPosition(int k, int l, int i1, int j1)
    {
        if (l > 0 && !mItems.isEmpty())
        {
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            float f1 = (float)getScrollX() / (float)((l - i2 - j2) + j1);
            l = (int)((float)((k - k1 - l1) + i1) * f1);
            scrollTo(l, getScrollY());
            if (!mScroller.isFinished())
            {
                i1 = mScroller.getDuration();
                j1 = mScroller.timePassed();
                b b1 = infoForPosition(mCurItem);
                mScroller.startScroll(l, 0, (int)(b1.e * (float)k), 0, i1 - j1);
            }
        } else
        {
            b b2 = infoForPosition(mCurItem);
            float f2;
            if (b2 != null)
            {
                f2 = Math.min(b2.e, mLastOffset);
            } else
            {
                f2 = 0.0F;
            }
            k = (int)(f2 * (float)(k - getPaddingLeft() - getPaddingRight()));
            if (k != getScrollX())
            {
                completeScroll(false);
                scrollTo(k, getScrollY());
                return;
            }
        }
    }

    private void removeNonDecorViews()
    {
        int l;
        for (int k = 0; k < getChildCount(); k = l + 1)
        {
            l = k;
            if (!((c)getChildAt(k).getLayoutParams()).a)
            {
                removeViewAt(k);
                l = k - 1;
            }
        }

    }

    private void requestParentDisallowInterceptTouchEvent(boolean flag)
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(flag);
        }
    }

    private void scrollToItem(int k, boolean flag, int l, boolean flag1)
    {
        b b1 = infoForPosition(k);
        int i1;
        if (b1 != null)
        {
            float f1 = getClientWidth();
            i1 = (int)(Math.max(mFirstOffset, Math.min(b1.e, mLastOffset)) * f1);
        } else
        {
            i1 = 0;
        }
        if (flag)
        {
            smoothScrollTo(i1, 0, l);
            if (flag1)
            {
                dispatchOnPageSelected(k);
            }
            return;
        }
        if (flag1)
        {
            dispatchOnPageSelected(k);
        }
        completeScroll(false);
        scrollTo(i1, 0);
        pageScrolled(i1);
    }

    private void setScrollState(int k)
    {
        if (mScrollState == k)
        {
            return;
        }
        mScrollState = k;
        if (mPageTransformer != null)
        {
            boolean flag;
            if (k != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            enableLayers(flag);
        }
        dispatchOnScrollStateChanged(k);
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
        if (mScrollingCacheEnabled != flag)
        {
            mScrollingCacheEnabled = flag;
        }
    }

    private void sortChildDrawingOrder()
    {
        if (mDrawingOrder != 0)
        {
            int l;
            if (mDrawingOrderedChildren == null)
            {
                mDrawingOrderedChildren = new ArrayList();
            } else
            {
                mDrawingOrderedChildren.clear();
            }
            l = getChildCount();
            for (int k = 0; k < l; k++)
            {
                View view = getChildAt(k);
                mDrawingOrderedChildren.add(view);
            }

            Collections.sort(mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void addFocusables(ArrayList arraylist, int k, int l)
    {
        int j1 = arraylist.size();
        int k1 = getDescendantFocusability();
        if (k1 != 0x60000)
        {
            for (int i1 = 0; i1 < getChildCount(); i1++)
            {
                View view = getChildAt(i1);
                if (view.getVisibility() == 0)
                {
                    b b1 = infoForChild(view);
                    if (b1 != null && b1.b == mCurItem)
                    {
                        view.addFocusables(arraylist, k, l);
                    }
                }
            }

        }
        while (k1 == 0x40000 && j1 != arraylist.size() || !isFocusable() || (l & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    b addNewItem(int k, int l)
    {
        b b1 = new b();
        b1.b = k;
        b1.a = mAdapter.instantiateItem(this, k);
        b1.d = mAdapter.getPageWidth(k);
        if (l < 0 || l >= mItems.size())
        {
            mItems.add(b1);
            return b1;
        } else
        {
            mItems.add(l, b1);
            return b1;
        }
    }

    public void addOnPageChangeListener(f f1)
    {
        if (mOnPageChangeListeners == null)
        {
            mOnPageChangeListeners = new ArrayList();
        }
        mOnPageChangeListeners.add(f1);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int k = 0; k < getChildCount(); k++)
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = infoForChild(view);
            if (b1 != null && b1.b == mCurItem)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int k, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        c c1 = (c)layoutparams;
        c1.a = c1.a | (view instanceof a);
        if (mInLayout)
        {
            if (c1 != null && c1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                c1.d = true;
                addViewInLayout(view, k, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, k, layoutparams);
            return;
        }
    }

    public boolean arrowScroll(int k)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), k);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (k != 17) goto _L6; else goto _L5
_L5:
        int l;
        boolean flag;
        l = getChildRectInPagerCoordinates(mTempRect, view).left;
        int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && l >= i1)
        {
            flag = pageLeft();
        } else
        {
            flag = view.requestFocus();
        }
_L18:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(k));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        l = 1;
_L19:
        if (l != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (k != 66) goto _L15; else goto _L14
_L14:
        int j1;
        l = getChildRectInPagerCoordinates(mTempRect, view).left;
        j1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
        if (obj != null && l <= j1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L18
_L4:
label0:
        {
            if (k != 17 && k != 1)
            {
                break label0;
            }
            flag = pageLeft();
        }
          goto _L18
        if (k != 66 && k != 2) goto _L15; else goto _L17
_L17:
        flag = pageRight();
          goto _L18
_L15:
        flag = false;
          goto _L18
_L8:
        obj = view;
          goto _L13
        l = 0;
          goto _L19
    }

    public boolean beginFakeDrag()
    {
        if (mIsBeingDragged)
        {
            return false;
        }
        mFakeDragging = true;
        setScrollState(1);
        mLastMotionX = 0.0F;
        mInitialMotionX = 0.0F;
        MotionEvent motionevent;
        long l;
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        } else
        {
            mVelocityTracker.clear();
        }
        l = SystemClock.uptimeMillis();
        motionevent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
        mVelocityTracker.addMovement(motionevent);
        motionevent.recycle();
        mFakeDragBeginTime = l;
        return true;
    }

    public boolean canScroll(View view, boolean flag, int k, int l, int i1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int j1;
        int k1;
        int l1;
        viewgroup = (ViewGroup)view;
        k1 = view.getScrollX();
        l1 = view.getScrollY();
        j1 = viewgroup.getChildCount() - 1;
_L8:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(j1);
        if (l + k1 < view1.getLeft() || l + k1 >= view1.getRight() || i1 + l1 < view1.getTop() || i1 + l1 >= view1.getBottom() || !canScroll(view1, true, k, (l + k1) - view1.getLeft(), (i1 + l1) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && x.a(view, -k)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean canScrollHorizontally(int k)
    {
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l;
        int i1;
        l = getClientWidth();
        i1 = getScrollX();
        if (k >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 <= (int)((float)l * mFirstOffset)) goto _L1; else goto _L3
_L3:
        return true;
        if (k <= 0 || i1 >= (int)((float)l * mLastOffset)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof c) && super.checkLayoutParams(layoutparams);
    }

    public void clearOnPageChangeListeners()
    {
        if (mOnPageChangeListeners != null)
        {
            mOnPageChangeListeners.clear();
        }
    }

    public void computeScroll()
    {
        if (!mScroller.isFinished() && mScroller.computeScrollOffset())
        {
            int k = getScrollX();
            int l = getScrollY();
            int i1 = mScroller.getCurrX();
            int j1 = mScroller.getCurrY();
            if (k != i1 || l != j1)
            {
                scrollTo(i1, j1);
                if (!pageScrolled(i1))
                {
                    mScroller.abortAnimation();
                    scrollTo(0, j1);
                }
            }
            x.d(this);
            return;
        } else
        {
            completeScroll(true);
            return;
        }
    }

    void dataSetChanged()
    {
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int j2 = mAdapter.getCount();
        mExpectedAdapterCount = j2;
        int l1;
        if (mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < j2)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = mCurItem;
        i1 = 0;
        k1 = 0;
        j1 = k;
        k = l;
        l = i1;
        i1 = k1;
        if (i1 >= mItems.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (b)mItems.get(i1);
        k1 = mAdapter.getItemPosition(((b) (obj)).a);
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        if (k1 == -2)
        {
            mItems.remove(i1);
            j1 = i1 - 1;
            i1 = l;
            if (l == 0)
            {
                mAdapter.startUpdate(this);
                i1 = 1;
            }
            mAdapter.destroyItem(this, ((b) (obj)).b, ((b) (obj)).a);
            int i2;
            if (mCurItem == ((b) (obj)).b)
            {
                l = Math.max(0, Math.min(mCurItem, j2 - 1));
                k = i1;
                i1 = 1;
            } else
            {
                l = k;
                boolean flag = true;
                k = i1;
                i1 = ((flag) ? 1 : 0);
            }
        } else
        {
            if (((b) (obj)).b == k1)
            {
                break MISSING_BLOCK_LABEL_369;
            }
            if (((b) (obj)).b == mCurItem)
            {
                k = k1;
            }
            obj.b = k1;
            k1 = k;
            i2 = 1;
            j1 = i1;
            k = l;
            l = k1;
            i1 = i2;
        }
        k1 = i1;
        l1 = l;
        i1 = j1 + 1;
        l = k;
        k = l1;
        j1 = k1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_70;
_L1:
        if (l != 0)
        {
            mAdapter.finishUpdate(this);
        }
        Collections.sort(mItems, COMPARATOR);
        if (j1 != 0)
        {
            i1 = getChildCount();
            for (l = 0; l < i1; l++)
            {
                obj = (c)getChildAt(l).getLayoutParams();
                if (!((c) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            setCurrentItemInternal(k, false, true);
            requestLayout();
        }
        return;
        k1 = k;
        i2 = j1;
        j1 = i1;
        k = l;
        l = k1;
        i1 = i2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_204;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int l = getChildCount();
        int k = 0;
        do
        {
            flag = flag1;
            if (k >= l)
            {
                continue;
            }
            View view = getChildAt(k);
            if (view.getVisibility() == 0)
            {
                b b1 = infoForChild(view);
                if (b1 != null && b1.b == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    float distanceInfluenceForSnapDuration(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int l = 0;
        int k = 0;
        int i1 = x.a(this);
        if (i1 == 0 || i1 == 1 && mAdapter != null && mAdapter.getCount() > 1)
        {
            if (!mLeftEdge.a())
            {
                l = canvas.save();
                k = getHeight() - getPaddingTop() - getPaddingBottom();
                int j1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-k + getPaddingTop(), mFirstOffset * (float)j1);
                mLeftEdge.a(k, j1);
                k = mLeftEdge.a(canvas) | false;
                canvas.restoreToCount(l);
            }
            l = k;
            if (!mRightEdge.a())
            {
                int k1 = canvas.save();
                l = getWidth();
                int l1 = getHeight();
                int i2 = getPaddingTop();
                int j2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)l);
                mRightEdge.a(l1 - i2 - j2, l);
                l = k | mRightEdge.a(canvas);
                canvas.restoreToCount(k1);
            }
        } else
        {
            mLeftEdge.b();
            mRightEdge.b();
        }
        if (l != 0)
        {
            x.d(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = mMarginDrawable;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag()
    {
        if (!mFakeDragging)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else
        {
            Object obj = mVelocityTracker;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
            int k = (int)w.a(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            int l = getClientWidth();
            int i1 = getScrollX();
            obj = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(((b) (obj)).b, ((float)i1 / (float)l - ((b) (obj)).e) / ((b) (obj)).d, k, (int)(mLastMotionX - mInitialMotionX)), true, true, k);
            endDrag();
            mFakeDragging = false;
            return;
        }
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60;
           goto _L2 _L3 _L4 _L5
_L2:
        return false;
_L3:
        return arrowScroll(17);
_L4:
        return arrowScroll(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (android.support.v4.view.g.b(keyevent))
            {
                return arrowScroll(2);
            }
            if (android.support.v4.view.g.a(keyevent))
            {
                return arrowScroll(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void fakeDragBy(float f1)
    {
        if (!mFakeDragging)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        mLastMotionX = mLastMotionX + f1;
        float f3 = (float)getScrollX() - f1;
        int k = getClientWidth();
        f1 = k;
        float f5 = mFirstOffset;
        float f2 = k;
        float f4 = mLastOffset;
        Object obj = (b)mItems.get(0);
        b b1 = (b)mItems.get(mItems.size() - 1);
        long l;
        if (((b) (obj)).b != 0)
        {
            f1 = ((b) (obj)).e * (float)k;
        } else
        {
            f1 *= f5;
        }
        if (b1.b != mAdapter.getCount() - 1)
        {
            f2 = b1.e * (float)k;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1)
        {
            if (f3 > f2)
            {
                f1 = f2;
            } else
            {
                f1 = f3;
            }
        }
        mLastMotionX = mLastMotionX + (f1 - (float)(int)f1);
        scrollTo((int)f1, getScrollY());
        pageScrolled((int)f1);
        l = SystemClock.uptimeMillis();
        obj = MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0);
        mVelocityTracker.addMovement(((MotionEvent) (obj)));
        ((MotionEvent) (obj)).recycle();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new c();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new c(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    public t getAdapter()
    {
        return mAdapter;
    }

    protected int getChildDrawingOrder(int k, int l)
    {
        int i1 = l;
        if (mDrawingOrder == 2)
        {
            i1 = k - 1 - l;
        }
        return ((c)((View)mDrawingOrderedChildren.get(i1)).getLayoutParams()).f;
    }

    public int getCurrentItem()
    {
        return mCurItem;
    }

    public int getOffscreenPageLimit()
    {
        return mOffscreenPageLimit;
    }

    public int getPageMargin()
    {
        return mPageMargin;
    }

    b infoForAnyChild(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return infoForChild(view);
            }
        } while (true);
    }

    b infoForChild(View view)
    {
        for (int k = 0; k < mItems.size(); k++)
        {
            b b1 = (b)mItems.get(k);
            if (mAdapter.isViewFromObject(view, b1.a))
            {
                return b1;
            }
        }

        return null;
    }

    b infoForPosition(int k)
    {
        for (int l = 0; l < mItems.size(); l++)
        {
            b b1 = (b)mItems.get(l);
            if (b1.b == k)
            {
                return b1;
            }
        }

        return null;
    }

    void initViewPager()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        mTouchSlop = ab.a(viewconfiguration);
        mMinimumVelocity = (int)(400F * f1);
        mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mLeftEdge = new android.support.v4.widget.i(context);
        mRightEdge = new android.support.v4.widget.i(context);
        mFlingDistance = (int)(25F * f1);
        mCloseEnough = (int)(2.0F * f1);
        mDefaultGutterSize = (int)(16F * f1);
        x.a(this, new d());
        if (x.e(this) == 0)
        {
            x.d(this, 1);
        }
    }

    public boolean isFakeDragging()
    {
        return mFakeDragging;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mPageMargin > 0 && mMarginDrawable != null && mItems.size() > 0 && mAdapter != null)
        {
            int i1 = getScrollX();
            int j1 = getWidth();
            float f3 = (float)mPageMargin / (float)j1;
            Object obj = (b)mItems.get(0);
            float f1 = ((b) (obj)).e;
            int k1 = mItems.size();
            int k = ((b) (obj)).b;
            int l1 = ((b)mItems.get(k1 - 1)).b;
            int l = 0;
            do
            {
                if (k >= l1)
                {
                    break;
                }
                for (; k > ((b) (obj)).b && l < k1; obj = (b)((ArrayList) (obj)).get(l))
                {
                    obj = mItems;
                    l++;
                }

                float f2;
                if (k == ((b) (obj)).b)
                {
                    f2 = (((b) (obj)).e + ((b) (obj)).d) * (float)j1;
                    f1 = ((b) (obj)).e + ((b) (obj)).d + f3;
                } else
                {
                    float f4 = mAdapter.getPageWidth(k);
                    f2 = (f1 + f4) * (float)j1;
                    f1 += f4 + f3;
                }
                if ((float)mPageMargin + f2 > (float)i1)
                {
                    mMarginDrawable.setBounds((int)f2, mTopPageBounds, (int)((float)mPageMargin + f2 + 0.5F), mBottomPageBounds);
                    mMarginDrawable.draw(canvas);
                }
                if (f2 > (float)(i1 + j1))
                {
                    break;
                }
                k++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int k = motionevent.getAction() & 0xff;
        if (k != 3 && k != 1) goto _L2; else goto _L1
_L1:
        mIsBeingDragged = false;
        mIsUnableToDrag = false;
        mActivePointerId = -1;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
_L4:
        return false;
_L2:
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mIsBeingDragged)
        {
            return true;
        }
        if (mIsUnableToDrag) goto _L4; else goto _L3
_L3:
        k;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 381
    //                   2: 143
    //                   6: 513;
           goto _L5 _L6 _L7 _L8
_L5:
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        return mIsBeingDragged;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int l = mActivePointerId;
        if (l == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = n.a(motionevent, l);
        f3 = n.c(motionevent, l);
        f1 = f3 - mLastMotionX;
        f5 = Math.abs(f1);
        f4 = n.d(motionevent, l);
        f6 = Math.abs(f4 - mInitialMotionY);
        if (f1 != 0.0F && !isGutterDrag(mLastMotionX, f1) && canScroll(this, false, (int)f1, (int)f3, (int)f4))
        {
            mLastMotionX = f3;
            mLastMotionY = f4;
            mIsUnableToDrag = true;
            return false;
        }
        if (f5 <= (float)mTouchSlop || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        mIsBeingDragged = true;
        requestParentDisallowInterceptTouchEvent(true);
        setScrollState(1);
        if (f1 > 0.0F)
        {
            f1 = mInitialMotionX + (float)mTouchSlop;
        } else
        {
            f1 = mInitialMotionX - (float)mTouchSlop;
        }
        mLastMotionX = f1;
        mLastMotionY = f4;
        setScrollingCacheEnabled(true);
_L11:
        if (mIsBeingDragged && performDrag(f3))
        {
            x.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)mTouchSlop)
        {
            mIsUnableToDrag = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        mInitialMotionX = f2;
        mLastMotionX = f2;
        f2 = motionevent.getY();
        mInitialMotionY = f2;
        mLastMotionY = f2;
        mActivePointerId = n.b(motionevent, 0);
        mIsUnableToDrag = false;
        mScroller.computeScrollOffset();
        if (mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
        {
            mScroller.abortAnimation();
            mPopulatePending = false;
            populate();
            mIsBeingDragged = true;
            requestParentDisallowInterceptTouchEvent(true);
            setScrollState(1);
        } else
        {
            completeScroll(false);
            mIsBeingDragged = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        onSecondaryPointerUp(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        int k1;
        int l1;
        int l2;
        int j4;
        int k4;
        int l4;
        int i5;
        j4 = getChildCount();
        l4 = i1 - k;
        k4 = j1 - l;
        l = getPaddingLeft();
        k = getPaddingTop();
        k1 = getPaddingRight();
        i1 = getPaddingBottom();
        i5 = getScrollX();
        l1 = 0;
        l2 = 0;
_L14:
        if (l2 >= j4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(l2);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        c c1 = (c)view.getLayoutParams();
        if (!c1.a) goto _L4; else goto _L5
_L5:
        int j5;
        j1 = c1.b;
        j5 = c1.b;
        j1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int i2;
        j1 = l;
        i2 = l;
_L15:
        j5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int i3 = k;
        l = k;
        k = i1;
        i1 = i3;
_L16:
        j1 += i5;
        view.layout(j1, i1, view.getMeasuredWidth() + j1, view.getMeasuredHeight() + i1);
        l1++;
        j1 = k1;
        i1 = i2;
        k1 = k;
        k = l1;
_L17:
        l2++;
        i2 = i1;
        l1 = k;
        k = l;
        i1 = k1;
        k1 = j1;
        l = i2;
          goto _L14
_L8:
        i2 = view.getMeasuredWidth();
        j1 = l;
        i2 += l;
          goto _L15
_L7:
        j1 = Math.max((l4 - view.getMeasuredWidth()) / 2, l);
        i2 = l;
          goto _L15
_L9:
        i2 = view.getMeasuredWidth();
        j1 = k1 + view.getMeasuredWidth();
        int j3 = l4 - k1 - i2;
        k1 = j1;
        i2 = l;
        j1 = j3;
          goto _L15
_L12:
        int k3 = view.getMeasuredHeight();
        l = i1;
        k3 += k;
        i1 = k;
        k = l;
        l = k3;
          goto _L16
_L11:
        int l3 = Math.max((k4 - view.getMeasuredHeight()) / 2, k);
        l = k;
        k = i1;
        i1 = l3;
          goto _L16
_L13:
        int i4 = k4 - i1 - view.getMeasuredHeight();
        int k5 = view.getMeasuredHeight();
        l = k;
        k = i1 + k5;
        i1 = i4;
          goto _L16
_L2:
        k1 = l4 - l - k1;
        for (j1 = 0; j1 < j4; j1++)
        {
            View view1 = getChildAt(j1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            c c2 = (c)view1.getLayoutParams();
            if (c2.a)
            {
                continue;
            }
            b b1 = infoForChild(view1);
            if (b1 == null)
            {
                continue;
            }
            float f1 = k1;
            int j2 = (int)(b1.e * f1) + l;
            if (c2.d)
            {
                c2.d = false;
                float f2 = k1;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(c2.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k4 - k - i1, 0x40000000));
            }
            view1.layout(j2, k, view1.getMeasuredWidth() + j2, view1.getMeasuredHeight() + k);
        }

        mTopPageBounds = k;
        mBottomPageBounds = k4 - i1;
        mDecorChildCount = l1;
        if (mFirstLayout)
        {
            scrollToItem(mCurItem, false, 0, false);
        }
        mFirstLayout = false;
        return;
_L4:
        j1 = l1;
        l1 = k;
        int k2 = l;
        k = j1;
        j1 = k1;
        k1 = i1;
        l = l1;
        i1 = k2;
          goto _L17
    }

    protected void onMeasure(int k, int l)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, k), getDefaultSize(0, l));
            k = getMeasuredWidth();
            mGutterSize = Math.min(k / 10, mDefaultGutterSize);
            k = k - getPaddingLeft() - getPaddingRight();
            l = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int l2 = getChildCount();
            int k1 = 0;
            while (k1 < l2) 
            {
label1:
                {
                    {
                        View view = getChildAt(k1);
                        int i1 = k;
                        int j1 = l;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        c c1 = (c)view.getLayoutParams();
                        i1 = k;
                        j1 = l;
                        if (c1 == null)
                        {
                            break label1;
                        }
                        i1 = k;
                        j1 = l;
                        if (!c1.a)
                        {
                            break label1;
                        }
                        i1 = c1.b & 7;
                        int l1 = c1.b & 0x70;
                        int i2 = 0x80000000;
                        j1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (l1 == 48 || l1 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (i1 == 3 || i1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            i1 = 0x40000000;
                        } else
                        {
                            i1 = i2;
                            if (flag1)
                            {
                                j1 = 0x40000000;
                                i1 = i2;
                            }
                        }
                        if (c1.width != -2)
                        {
                            i2 = 0x40000000;
                            float f1;
                            int j2;
                            int k2;
                            if (c1.width != -1)
                            {
                                i1 = c1.width;
                            } else
                            {
                                i1 = k;
                            }
                        } else
                        {
                            i2 = i1;
                            i1 = k;
                        }
                        if (c1.height == -2)
                        {
                            break label0;
                        }
                        j2 = 0x40000000;
                        j1 = j2;
                        if (c1.height == -1)
                        {
                            break label0;
                        }
                        k2 = c1.height;
                        j1 = j2;
                        j2 = k2;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, i2), android.view.View.MeasureSpec.makeMeasureSpec(j2, j1));
                    if (flag)
                    {
                        j1 = l - view.getMeasuredHeight();
                        i1 = k;
                    } else
                    {
                        i1 = k;
                        j1 = l;
                        if (flag1)
                        {
                            i1 = k - view.getMeasuredWidth();
                            j1 = l;
                        }
                    }
                }
                k1++;
                k = i1;
                l = j1;
            }
            mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
            mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
            mInLayout = true;
            populate();
            mInLayout = false;
            i1 = getChildCount();
            for (l = 0; l < i1; l++)
            {
                view = getChildAt(l);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                c1 = (c)view.getLayoutParams();
                if (c1 == null || !c1.a)
                {
                    f1 = k;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(c1.c * f1), 0x40000000), mChildHeightMeasureSpec);
                }
            }

            return;
        }
        j2 = l;
        break MISSING_BLOCK_LABEL_282;
    }

    protected void onPageScrolled(int k, float f1, int l)
    {
        if (mDecorChildCount <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int j2;
        int k2;
        int l2;
        int i3;
        k2 = getScrollX();
        i1 = getPaddingLeft();
        j1 = getPaddingRight();
        l2 = getWidth();
        i3 = getChildCount();
        j2 = 0;
_L8:
        if (j2 >= i3) goto _L2; else goto _L3
_L3:
        View view;
        c c1;
        view = getChildAt(j2);
        c1 = (c)view.getLayoutParams();
        if (!c1.a)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        c1.b & 7;
        JVM INSTR tableswitch 1 5: default 116
    //                   1 219
    //                   2 116
    //                   3 190
    //                   4 116
    //                   5 251;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int k1;
        k1 = i1;
        int l1 = j1;
        j1 = i1;
        i1 = l1;
_L9:
        int i2;
        int j3 = (k1 + k2) - view.getLeft();
        k1 = i1;
        i2 = j1;
        if (j3 != 0)
        {
            view.offsetLeftAndRight(j3);
            i2 = j1;
            k1 = i1;
        }
_L10:
        j2++;
        i1 = i2;
        j1 = k1;
          goto _L8
_L6:
        k1 = view.getWidth();
        i2 = k1 + i1;
        k1 = i1;
        i1 = j1;
        j1 = i2;
          goto _L9
_L5:
        k1 = Math.max((l2 - view.getMeasuredWidth()) / 2, i1);
        i2 = i1;
        i1 = j1;
        j1 = i2;
          goto _L9
_L7:
        k1 = l2 - j1 - view.getMeasuredWidth();
        int k3 = view.getMeasuredWidth();
        i2 = i1;
        i1 = j1 + k3;
        j1 = i2;
          goto _L9
_L2:
        dispatchOnPageScrolled(k, f1, l);
        if (mPageTransformer != null)
        {
            l = getScrollX();
            i1 = getChildCount();
            for (k = 0; k < i1; k++)
            {
                View view1 = getChildAt(k);
                if (!((c)view1.getLayoutParams()).a)
                {
                    f1 = (float)(view1.getLeft() - l) / (float)getClientWidth();
                    mPageTransformer.transformPage(view1, f1);
                }
            }

        }
        mCalledSuper = true;
        return;
        k1 = j1;
        i2 = i1;
          goto _L10
    }

    protected boolean onRequestFocusInDescendants(int k, Rect rect)
    {
        byte byte0 = -1;
        int i1 = getChildCount();
        int l;
        if ((k & 2) != 0)
        {
            byte0 = 1;
            l = 0;
        } else
        {
            l = i1 - 1;
            i1 = -1;
        }
        for (; l != i1; l += byte0)
        {
            View view = getChildAt(l);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = infoForChild(view);
            if (b1 != null && b1.b == mCurItem && view.requestFocus(k, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (mAdapter != null)
        {
            mAdapter.restoreState(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            setCurrentItemInternal(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            mRestoredCurItem = ((SavedState) (parcelable)).a;
            mRestoredAdapterState = ((SavedState) (parcelable)).b;
            mRestoredClassLoader = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = mCurItem;
        if (mAdapter != null)
        {
            savedstate.b = mAdapter.saveState();
        }
        return savedstate;
    }

    protected void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        if (k != i1)
        {
            recomputeScrollPosition(k, i1, mPageMargin, mPageMargin);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int k;
        int l;
        l = 0;
        if (mFakeDragging)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (mAdapter == null || mAdapter.getCount() == 0)
        {
            return false;
        }
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        k = l;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 392
    //                   2 201
    //                   3 546
    //                   4 128
    //                   5 601
    //                   6 634;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        k = l;
_L10:
        if (k != 0)
        {
            x.d(this);
        }
        return true;
_L2:
        mScroller.abortAnimation();
        mPopulatePending = false;
        populate();
        float f1 = motionevent.getX();
        mInitialMotionX = f1;
        mLastMotionX = f1;
        f1 = motionevent.getY();
        mInitialMotionY = f1;
        mLastMotionY = f1;
        mActivePointerId = n.b(motionevent, 0);
        k = l;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!mIsBeingDragged)
        {
            k = n.a(motionevent, mActivePointerId);
            float f2 = n.c(motionevent, k);
            float f4 = Math.abs(f2 - mLastMotionX);
            float f3 = n.d(motionevent, k);
            float f5 = Math.abs(f3 - mLastMotionY);
            if (f4 > (float)mTouchSlop && f4 > f5)
            {
                mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                ViewParent viewparent;
                if (f2 - mInitialMotionX > 0.0F)
                {
                    f2 = mInitialMotionX + (float)mTouchSlop;
                } else
                {
                    f2 = mInitialMotionX - (float)mTouchSlop;
                }
                mLastMotionX = f2;
                mLastMotionY = f3;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        k = l;
        if (mIsBeingDragged)
        {
            k = performDrag(n.c(motionevent, n.a(motionevent, mActivePointerId))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        k = l;
        if (mIsBeingDragged)
        {
            Object obj = mVelocityTracker;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
            k = (int)w.a(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            l = getClientWidth();
            int i1 = getScrollX();
            obj = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(((b) (obj)).b, ((float)i1 / (float)l - ((b) (obj)).e) / ((b) (obj)).d, k, (int)(n.c(motionevent, n.a(motionevent, mActivePointerId)) - mInitialMotionX)), true, true, k);
            mActivePointerId = -1;
            endDrag();
            boolean flag = mLeftEdge.c();
            k = mRightEdge.c() | flag;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        k = l;
        if (mIsBeingDragged)
        {
            scrollToItem(mCurItem, true, 0, false);
            mActivePointerId = -1;
            endDrag();
            boolean flag1 = mLeftEdge.c();
            k = mRightEdge.c() | flag1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        k = n.b(motionevent);
        mLastMotionX = n.c(motionevent, k);
        mActivePointerId = n.b(motionevent, k);
        k = l;
        continue; /* Loop/switch isn't completed */
_L8:
        onSecondaryPointerUp(motionevent);
        mLastMotionX = n.c(motionevent, n.a(motionevent, mActivePointerId));
        k = l;
        if (true) goto _L10; else goto _L9
_L9:
    }

    boolean pageLeft()
    {
        if (mCurItem > 0)
        {
            setCurrentItem(mCurItem - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    boolean pageRight()
    {
        if (mAdapter != null && mCurItem < mAdapter.getCount() - 1)
        {
            setCurrentItem(mCurItem + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    void populate()
    {
        populate(mCurItem);
    }

    void populate(int k)
    {
        float f1;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int l;
        byte byte1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (mCurItem != k)
        {
            byte byte0;
            if (mCurItem < k)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = infoForPosition(mCurItem);
            mCurItem = k;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        sortChildDrawingOrder();
_L4:
        return;
_L2:
        if (mPopulatePending)
        {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        mAdapter.startUpdate(this);
        k = mOffscreenPageLimit;
        l2 = Math.max(0, mCurItem - k);
        j2 = mAdapter.getCount();
        k2 = Math.min(j2 - 1, k + mCurItem);
        if (j2 != mExpectedAdapterCount)
        {
            String s;
            try
            {
                s = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(mExpectedAdapterCount).append(", found: ").append(j2).append(" Pager id: ").append(s).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(mAdapter.getClass()).toString());
        }
        k = 0;
_L14:
        if (k >= mItems.size())
        {
            break MISSING_BLOCK_LABEL_1270;
        }
        obj = (b)mItems.get(k);
        if (((b) (obj)).b < mCurItem) goto _L6; else goto _L5
_L5:
        if (((b) (obj)).b != mCurItem)
        {
            break MISSING_BLOCK_LABEL_1270;
        }
_L21:
        if (obj == null && j2 > 0)
        {
            obj2 = addNewItem(mCurItem, k);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        i2 = k - 1;
        float f3;
        if (i2 >= 0)
        {
            obj = (b)mItems.get(i2);
        } else
        {
            obj = null;
        }
        i3 = getClientWidth();
        if (i3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((b) (obj2)).d) + (float)getPaddingLeft() / (float)i3;
        }
        l = mCurItem;
        f5 = 0.0F;
        l1 = l - 1;
        k1 = k;
        obj3 = obj;
        if (l1 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || l1 >= l2) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        k = i2;
        f1 = f5;
        l = k1;
        if (l1 == ((b) (obj3)).b)
        {
            obj = obj3;
            k = i2;
            f1 = f5;
            l = k1;
            if (!((b) (obj3)).c)
            {
                mItems.remove(i2);
                mAdapter.destroyItem(this, l1, ((b) (obj3)).a);
                k = i2 - 1;
                l = k1 - 1;
                if (k >= 0)
                {
                    obj = (b)mItems.get(k);
                    f1 = f5;
                } else
                {
                    obj = null;
                    f1 = f5;
                }
            }
        }
_L15:
        l1--;
        obj3 = obj;
        i2 = k;
        f5 = f1;
        k1 = l;
        break MISSING_BLOCK_LABEL_376;
_L6:
        k++;
          goto _L14
_L12:
        if (obj3 != null && l1 == ((b) (obj3)).b)
        {
            f1 = f5 + ((b) (obj3)).d;
            k = i2 - 1;
            if (k >= 0)
            {
                obj = (b)mItems.get(k);
                l = k1;
            } else
            {
                obj = null;
                l = k1;
            }
        } else
        {
            f1 = f5 + addNewItem(l1, i2 + 1).d;
            l = k1 + 1;
            if (i2 >= 0)
            {
                obj = (b)mItems.get(i2);
                k = i2;
            } else
            {
                obj = null;
                k = i2;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f2 = ((b) (obj2)).d;
            k = k1 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int i1;
            if (k < mItems.size())
            {
                obj = (b)mItems.get(k);
            } else
            {
                obj = null;
            }
            if (i3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)i3 + 2.0F;
            }
            i1 = mCurItem;
            i1++;
            do
            {
                if (i1 >= j2)
                {
                    break label0;
                }
                if (f2 >= f4 && i1 > k2)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (i1 == ((b) (obj)).b && !((b) (obj)).c)
                    {
                        mItems.remove(k);
                        mAdapter.destroyItem(this, i1, ((b) (obj)).a);
                        if (k < mItems.size())
                        {
                            obj = (b)mItems.get(k);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && i1 == ((b) (obj)).b)
                {
                    float f6 = ((b) (obj)).d;
                    k++;
                    if (k < mItems.size())
                    {
                        obj = (b)mItems.get(k);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = addNewItem(i1, k);
                    k++;
                    float f7 = ((b) (obj)).d;
                    if (k < mItems.size())
                    {
                        obj = (b)mItems.get(k);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                i1++;
            } while (true);
        }
        calculatePageOffsets(((b) (obj2)), k1, ((b) (obj1)));
_L8:
        obj1 = mAdapter;
        k = mCurItem;
        int j1;
        if (obj2 != null)
        {
            obj = ((b) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((t) (obj1)).setPrimaryItem(this, k, obj);
        mAdapter.finishUpdate(this);
        j1 = getChildCount();
        for (k = 0; k < j1; k++)
        {
            obj1 = getChildAt(k);
            obj = (c)((View) (obj1)).getLayoutParams();
            obj.f = k;
            if (((c) (obj)).a || ((c) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = infoForChild(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((b) (obj1)).d;
                obj.e = ((b) (obj1)).b;
            }
        }

        sortChildDrawingOrder();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = infoForAnyChild(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((b) (obj)).b == mCurItem) goto _L4; else goto _L17
_L17:
        k = 0;
_L20:
        if (k >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(k);
        obj1 = infoForChild(((View) (obj)));
        if (obj1 != null && ((b) (obj1)).b == mCurItem && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        k++;
          goto _L20
        obj = null;
          goto _L21
    }

    public void removeOnPageChangeListener(f f1)
    {
        if (mOnPageChangeListeners != null)
        {
            mOnPageChangeListeners.remove(f1);
        }
    }

    public void removeView(View view)
    {
        if (mInLayout)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setAdapter(t t1)
    {
        boolean flag;
label0:
        {
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(mObserver);
                mAdapter.startUpdate(this);
                for (int k = 0; k < mItems.size(); k++)
                {
                    b b1 = (b)mItems.get(k);
                    mAdapter.destroyItem(this, b1.b, b1.a);
                }

                mAdapter.finishUpdate(this);
                mItems.clear();
                removeNonDecorViews();
                mCurItem = 0;
                scrollTo(0, 0);
            }
            mAdapter = t1;
            mExpectedAdapterCount = 0;
            if (mAdapter != null)
            {
                if (mObserver == null)
                {
                    mObserver = new h((byte)0);
                }
                mAdapter.registerDataSetObserver(mObserver);
                mPopulatePending = false;
                flag = mFirstLayout;
                mFirstLayout = true;
                mExpectedAdapterCount = mAdapter.getCount();
                if (mRestoredCurItem < 0)
                {
                    break label0;
                }
                mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
                setCurrentItemInternal(mRestoredCurItem, false, true);
                mRestoredCurItem = -1;
                mRestoredAdapterState = null;
                mRestoredClassLoader = null;
            }
            return;
        }
        if (!flag)
        {
            populate();
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 7)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (mSetChildrenDrawingOrderEnabled == null)
        {
            try
            {
                mSetChildrenDrawingOrderEnabled = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", nosuchmethodexception);
            }
        }
        mSetChildrenDrawingOrderEnabled.invoke(this, new Object[] {
            Boolean.valueOf(flag)
        });
        return;
        Exception exception;
        exception;
        Log.e("ViewPager", "Error changing children drawing order", exception);
        return;
    }

    public void setCurrentItem(int k)
    {
        mPopulatePending = false;
        boolean flag;
        if (!mFirstLayout)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setCurrentItemInternal(k, flag, false);
    }

    public void setCurrentItem(int k, boolean flag)
    {
        mPopulatePending = false;
        setCurrentItemInternal(k, flag, false);
    }

    void setCurrentItemInternal(int k, boolean flag, boolean flag1)
    {
        setCurrentItemInternal(k, flag, flag1, 0);
    }

    void setCurrentItemInternal(int k, boolean flag, boolean flag1, int l)
    {
        boolean flag2;
        flag2 = false;
        if (mAdapter == null || mAdapter.getCount() <= 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!flag1 && mCurItem == k && mItems.size() != 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (k >= 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        k = mOffscreenPageLimit;
        if (i1 > mCurItem + k || i1 < mCurItem - k)
        {
            for (k = 0; k < mItems.size(); k++)
            {
                ((b)mItems.get(k)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        i1 = k;
        if (k >= mAdapter.getCount())
        {
            i1 = mAdapter.getCount() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (mCurItem != i1)
        {
            flag1 = true;
        }
        if (mFirstLayout)
        {
            mCurItem = i1;
            if (flag1)
            {
                dispatchOnPageSelected(i1);
            }
            requestLayout();
            return;
        } else
        {
            populate(i1);
            scrollToItem(i1, flag, l, flag1);
            return;
        }
    }

    f setInternalPageChangeListener(f f1)
    {
        f f2 = mInternalPageChangeListener;
        mInternalPageChangeListener = f1;
        return f2;
    }

    public void setOffscreenPageLimit(int k)
    {
        int l = k;
        if (k <= 0)
        {
            Log.w("ViewPager", (new StringBuilder("Requested offscreen page limit ")).append(k).append(" too small; defaulting to 1").toString());
            l = 1;
        }
        if (l != mOffscreenPageLimit)
        {
            mOffscreenPageLimit = l;
            populate();
        }
    }

    void setOnAdapterChangeListener(e e1)
    {
        mAdapterChangeListener = e1;
    }

    public void setOnPageChangeListener(f f1)
    {
        mOnPageChangeListener = f1;
    }

    public void setPageMargin(int k)
    {
        int l = mPageMargin;
        mPageMargin = k;
        int i1 = getWidth();
        recomputeScrollPosition(i1, i1, k, l);
        requestLayout();
    }

    public void setPageMarginDrawable(int k)
    {
        setPageMarginDrawable(getContext().getResources().getDrawable(k));
    }

    public void setPageMarginDrawable(Drawable drawable)
    {
        mMarginDrawable = drawable;
        if (drawable != null)
        {
            refreshDrawableState();
        }
        boolean flag;
        if (drawable == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        invalidate();
    }

    public void setPageTransformer(boolean flag, g g1)
    {
        int k = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (g1 != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (mPageTransformer != null)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag2 != flag3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mPageTransformer = g1;
            setChildrenDrawingOrderEnabledCompat(flag2);
            if (flag2)
            {
                if (flag)
                {
                    k = 2;
                }
                mDrawingOrder = k;
            } else
            {
                mDrawingOrder = 0;
            }
            if (flag1)
            {
                populate();
            }
        }
    }

    void smoothScrollTo(int k, int l)
    {
        smoothScrollTo(k, l, 0);
    }

    void smoothScrollTo(int k, int l, int i1)
    {
        if (getChildCount() == 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        int j1 = getScrollX();
        int k1 = getScrollY();
        int l1 = k - j1;
        l -= k1;
        if (l1 == 0 && l == 0)
        {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        k = getClientWidth();
        int i2 = k / 2;
        float f5 = Math.min(1.0F, ((float)Math.abs(l1) * 1.0F) / (float)k);
        float f1 = i2;
        float f3 = i2;
        f5 = distanceInfluenceForSnapDuration(f5);
        i1 = Math.abs(i1);
        if (i1 > 0)
        {
            k = Math.round(1000F * Math.abs((f3 * f5 + f1) / (float)i1)) * 4;
        } else
        {
            float f2 = k;
            float f4 = mAdapter.getPageWidth(mCurItem);
            k = (int)(((float)Math.abs(l1) / (f2 * f4 + (float)mPageMargin) + 1.0F) * 100F);
        }
        k = Math.min(k, 600);
        mScroller.startScroll(j1, k1, l1, l, k);
        x.d(this);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
    }





}
