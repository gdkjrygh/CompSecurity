// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import aG;
import aK;
import aP;
import aU;
import aX;
import aY;
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
import android.util.AttributeSet;
import android.util.DisplayMetrics;
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
import as;
import at;
import bb;
import bk;
import bo;
import bx;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.c());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }

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
            Object obj = new as() {

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
                obj = new at(((as) (obj)));
            } else
            {
                obj = new ar.a(((as) (obj)));
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

    final class c extends aG
    {

        private ViewPager b;

        private boolean a()
        {
            return ViewPager.b(b) != null && ViewPager.b(b).c() > 1;
        }

        public final void a(View view, bk bk1)
        {
            super.a(view, bk1);
            bk1.b(android/support/v4/view/ViewPager.getName());
            bk1.i(a());
            if (b.canScrollHorizontally(1))
            {
                bk1.a(4096);
            }
            if (b.canScrollHorizontally(-1))
            {
                bk1.a(8192);
            }
        }

        public final boolean a(View view, int k, Bundle bundle)
        {
            if (super.a(view, k, bundle))
            {
                return true;
            }
            switch (k)
            {
            default:
                return false;

            case 4096: 
                if (b.canScrollHorizontally(1))
                {
                    b.setCurrentItem(ViewPager.c(b) + 1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                break;
            }
            if (b.canScrollHorizontally(-1))
            {
                b.setCurrentItem(ViewPager.c(b) - 1);
                return true;
            } else
            {
                return false;
            }
        }

        public final void d(View view, AccessibilityEvent accessibilityevent)
        {
            super.d(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = bo.a();
            view.a(a());
            if (accessibilityevent.getEventType() == 4096 && ViewPager.b(b) != null)
            {
                view.a(ViewPager.b(b).c());
                view.b(ViewPager.c(b));
                view.c(ViewPager.c(b));
            }
        }

        c()
        {
            b = ViewPager.this;
            super();
        }
    }

    static interface d
    {

        public abstract void a(aU au, aU au1);
    }

    public static interface e
    {

        public abstract void a(int k);

        public abstract void a(int k, float f1, int l);

        public abstract void b(int k);
    }

    public static interface f
    {
    }

    final class g extends DataSetObserver
    {

        private ViewPager a;

        public final void onChanged()
        {
            a.a();
        }

        public final void onInvalidated()
        {
            a.a();
        }

        private g()
        {
            a = ViewPager.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }

    public static class h
        implements e
    {

        public void a(int k)
        {
        }

        public void a(int k, float f1, int l)
        {
        }

        public void b(int k)
        {
        }

        public h()
        {
        }
    }

    static final class i
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (View)obj1;
            obj = (LayoutParams)((View) (obj)).getLayoutParams();
            obj1 = (LayoutParams)((View) (obj1)).getLayoutParams();
            if (((LayoutParams) (obj)).a != ((LayoutParams) (obj1)).a)
            {
                return !((LayoutParams) (obj)).a ? -1 : 1;
            } else
            {
                return ((LayoutParams) (obj)).e - ((LayoutParams) (obj1)).e;
            }
        }

        i()
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
    private static final Interpolator sInterpolator = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private static final i sPositionComparator = new i();
    private int mActivePointerId;
    public aU mAdapter;
    d mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    public int mCurItem;
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
    private e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private bx mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private g mObserver;
    public int mOffscreenPageLimit;
    private e mOnPageChangeListener;
    public List mOnPageChangeListeners;
    public int mPageMargin;
    private f mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private bx mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
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

            private ViewPager a;

            public final void run()
            {
                ViewPager.a(a);
                a.b();
            }

            
            {
                a = ViewPager.this;
                super();
            }
        };
        mScrollState = 0;
        d();
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
        d();
    }

    private Rect a(Rect rect, View view)
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

    private b a(int k, int l)
    {
        b b1 = new b();
        b1.b = k;
        b1.a = mAdapter.a(this, k);
        b1.d = 1.0F;
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

    private b a(View view)
    {
        for (int k = 0; k < mItems.size(); k++)
        {
            b b1 = (b)mItems.get(k);
            if (mAdapter.a(view, b1.a))
            {
                return b1;
            }
        }

        return null;
    }

    private void a(int k)
    {
        boolean flag1 = false;
        if (mScrollState != k)
        {
            mScrollState = k;
            if (mPageTransformer != null)
            {
                boolean flag;
                int i1;
                int k1;
                if (k != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1 = getChildCount();
                i1 = 0;
                while (i1 < k1) 
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    aY.a(getChildAt(i1), byte0, null);
                    i1++;
                }
            }
            if (mOnPageChangeListener != null)
            {
                mOnPageChangeListener.b(k);
            }
            if (mOnPageChangeListeners != null)
            {
                int j1 = mOnPageChangeListeners.size();
                for (int l = ((flag1) ? 1 : 0); l < j1; l++)
                {
                    e e1 = (e)mOnPageChangeListeners.get(l);
                    if (e1 != null)
                    {
                        e1.b(k);
                    }
                }

            }
            if (mInternalPageChangeListener != null)
            {
                mInternalPageChangeListener.b(k);
                return;
            }
        }
    }

    private void a(int k, int l, int i1, int j1)
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
                b b1 = c(mCurItem);
                mScroller.startScroll(l, 0, (int)(b1.e * (float)k), 0, i1 - j1);
            }
        } else
        {
            b b2 = c(mCurItem);
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
                a(false);
                scrollTo(k, getScrollY());
                return;
            }
        }
    }

    private void a(int k, boolean flag, int l, boolean flag1)
    {
        b b1 = c(k);
        int i1 = 0;
        if (b1 != null)
        {
            i1 = (int)((float)e() * Math.max(mFirstOffset, Math.min(b1.e, mLastOffset)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                b(false);
            } else
            {
                int j1 = getScrollX();
                int k1 = getScrollY();
                i1 -= j1;
                int l1 = 0 - k1;
                if (i1 == 0 && l1 == 0)
                {
                    a(false);
                    b();
                    a(0);
                } else
                {
                    b(true);
                    a(2);
                    int i2 = e();
                    int j2 = i2 / 2;
                    float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(i1)) / (float)i2);
                    float f1 = j2;
                    float f3 = j2;
                    f4 = (float)Math.sin((float)((double)(f4 - 0.5F) * 0.4712389167638204D));
                    l = Math.abs(l);
                    if (l > 0)
                    {
                        l = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)l)) * 4;
                    } else
                    {
                        float f2 = i2;
                        l = (int)(((float)Math.abs(i1) / (f2 + (float)mPageMargin) + 1.0F) * 100F);
                    }
                    l = Math.min(l, 600);
                    mScroller.startScroll(j1, k1, i1, l1, l);
                    aY.d(this);
                }
            }
        } else
        {
            if (flag1)
            {
                e(k);
            }
            a(false);
            scrollTo(i1, 0);
            d(i1);
            return;
        }
        if (flag1)
        {
            e(k);
        }
    }

    private void a(int k, boolean flag, boolean flag1)
    {
        a(k, flag, flag1, 0);
    }

    private void a(int k, boolean flag, boolean flag1, int l)
    {
        boolean flag2;
        flag2 = false;
        if (mAdapter == null || mAdapter.c() <= 0)
        {
            b(false);
            return;
        }
        if (!flag1 && mCurItem == k && mItems.size() != 0)
        {
            b(false);
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
        if (k >= mAdapter.c())
        {
            i1 = mAdapter.c() - 1;
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
                e(i1);
            }
            requestLayout();
            return;
        } else
        {
            b(i1);
            a(i1, flag, l, flag1);
            return;
        }
    }

    private void a(b b1, int k, b b2)
    {
        int l1 = mAdapter.c();
        int l = e();
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
                        l++;
                        f1 = f4 + 1.0F + f1;
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
                        l--;
                        f2 -= f4 + 1.0F;
                    }
                    f2 -= b2.d + f4;
                    b2.e = f2;
                }

            }
        }
        int i2 = mItems.size();
        float f5 = b1.e;
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
        f3 = f5;
        for (; k1 >= 0; k1--)
        {
            for (b2 = (b)mItems.get(k1); l > b2.b;)
            {
                l--;
                f3 -= f4 + 1.0F;
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
            for (b1 = (b)mItems.get(l); k < b1.b;)
            {
                k++;
                f3 += f4 + 1.0F;
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

    static void a(ViewPager viewpager)
    {
        viewpager.a(0);
    }

    private void a(MotionEvent motionevent)
    {
        int k = aP.b(motionevent);
        if (aP.b(motionevent, k) == mActivePointerId)
        {
            if (k == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            mLastMotionX = aP.c(motionevent, k);
            mActivePointerId = aP.b(motionevent, k);
            if (mVelocityTracker != null)
            {
                mVelocityTracker.clear();
            }
        }
    }

    private void a(boolean flag)
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
                b(false);
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
                        d(j1);
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
                aY.a(this, mEndScrollRunnable);
            }
            return;
        }
        mEndScrollRunnable.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = mLastMotionX;
        mLastMotionX = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int k = e();
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
        if (b2.b != mAdapter.c() - 1)
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
        d((int)f2);
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

    private boolean a(View view, boolean flag, int k, int l, int i1)
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
        if (l + k1 < view1.getLeft() || l + k1 >= view1.getRight() || i1 + l1 < view1.getTop() || i1 + l1 >= view1.getBottom() || !a(view1, true, k, (l + k1) - view1.getLeft(), (i1 + l1) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && aY.a(view, -k)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static aU b(ViewPager viewpager)
    {
        return viewpager.mAdapter;
    }

    private b b(View view)
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
                return a(view);
            }
        } while (true);
    }

    private void b(int k)
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
            obj1 = c(mCurItem);
            mCurItem = k;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        f();
_L4:
        return;
_L2:
        if (mPopulatePending)
        {
            f();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        k = mOffscreenPageLimit;
        l2 = Math.max(0, mCurItem - k);
        j2 = mAdapter.c();
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
            break MISSING_BLOCK_LABEL_1254;
        }
        obj = (b)mItems.get(k);
        if (((b) (obj)).b < mCurItem) goto _L6; else goto _L5
_L5:
        if (((b) (obj)).b != mCurItem)
        {
            break MISSING_BLOCK_LABEL_1254;
        }
_L21:
        if (obj == null && j2 > 0)
        {
            obj2 = a(mCurItem, k);
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
        i3 = e();
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
                mAdapter.a(this, l1, ((b) (obj3)).a);
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
        break MISSING_BLOCK_LABEL_368;
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
            f1 = f5 + a(l1, i2 + 1).d;
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
                        mAdapter.a(this, i1, ((b) (obj)).a);
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
                    obj = a(i1, k);
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
        a(((b) (obj2)), k1, ((b) (obj1)));
_L8:
        obj1 = mAdapter;
        int j1;
        if (obj2 != null)
        {
            obj = ((b) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((aU) (obj1)).a(obj);
        mAdapter.a();
        j1 = getChildCount();
        for (k = 0; k < j1; k++)
        {
            obj1 = getChildAt(k);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.f = k;
            if (((LayoutParams) (obj)).a || ((LayoutParams) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((b) (obj1)).d;
                obj.e = ((b) (obj1)).b;
            }
        }

        f();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
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
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((b) (obj1)).b == mCurItem && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        k++;
          goto _L20
        obj = null;
          goto _L21
    }

    private void b(boolean flag)
    {
        if (mScrollingCacheEnabled != flag)
        {
            mScrollingCacheEnabled = flag;
        }
    }

    static int c(ViewPager viewpager)
    {
        return viewpager.mCurItem;
    }

    private b c(int k)
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

    static int[] c()
    {
        return LAYOUT_ATTRS;
    }

    private void d()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        mTouchSlop = bb.a(viewconfiguration);
        mMinimumVelocity = (int)(400F * f1);
        mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mLeftEdge = new bx(context);
        mRightEdge = new bx(context);
        mFlingDistance = (int)(25F * f1);
        mCloseEnough = (int)(2.0F * f1);
        mDefaultGutterSize = (int)(16F * f1);
        aY.a(this, new c());
        if (aY.e(this) == 0)
        {
            aY.c(this, 1);
        }
    }

    private boolean d(int k)
    {
        boolean flag = false;
        if (mItems.size() == 0)
        {
            mCalledSuper = false;
            a(0, 0.0F, 0);
            if (!mCalledSuper)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            b b1 = h();
            int i1 = e();
            int j1 = mPageMargin;
            float f1 = (float)mPageMargin / (float)i1;
            int l = b1.b;
            f1 = ((float)k / (float)i1 - b1.e) / (b1.d + f1);
            k = (int)((float)(j1 + i1) * f1);
            mCalledSuper = false;
            a(l, f1, k);
            if (!mCalledSuper)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private int e()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void e(int k)
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
                e e1 = (e)mOnPageChangeListeners.get(l);
                if (e1 != null)
                {
                    e1.a(k);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.a(k);
        }
    }

    private void f()
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

    private boolean f(int k)
    {
        View view;
        boolean flag;
        flag = false;
        view = findFocus();
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
        l = a(mTempRect, view).left;
        int i1 = a(mTempRect, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && l >= i1)
        {
            flag = j();
        } else
        {
            flag = view.requestFocus();
        }
_L15:
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
            break MISSING_BLOCK_LABEL_372;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        l = 1;
_L20:
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

        (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString());
        obj = null;
          goto _L13
_L6:
        if (k != 66) goto _L15; else goto _L14
_L14:
        int j1;
        l = a(mTempRect, view).left;
        j1 = a(mTempRect, ((View) (obj))).left;
        if (obj != null && l <= j1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L15
_L4:
        if (k != 17 && k != 1) goto _L19; else goto _L18
_L18:
        flag = j();
          goto _L15
_L19:
        if (k != 66 && k != 2) goto _L15; else goto _L17
_L17:
        if (mAdapter != null && mCurItem < mAdapter.c() - 1)
        {
            setCurrentItem(mCurItem + 1, true);
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L15
_L8:
        obj = view;
          goto _L13
        l = 0;
          goto _L20
    }

    private void g()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private b h()
    {
        int k = e();
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
                        b1.d = 1.0F;
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

    private void i()
    {
        mIsBeingDragged = false;
        mIsUnableToDrag = false;
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    private boolean j()
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

    final e a(e e1)
    {
        e e2 = mInternalPageChangeListener;
        mInternalPageChangeListener = e1;
        return e2;
    }

    final void a()
    {
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int j2 = mAdapter.c();
        mExpectedAdapterCount = j2;
        int l1;
        if (mItems.size() < (mOffscreenPageLimit << 1) + 1 && mItems.size() < j2)
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
        k1 = mAdapter.b(((b) (obj)).a);
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        if (k1 == -2)
        {
            mItems.remove(i1);
            j1 = i1 - 1;
            i1 = l;
            if (l == 0)
            {
                i1 = 1;
            }
            mAdapter.a(this, ((b) (obj)).b, ((b) (obj)).a);
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
                break MISSING_BLOCK_LABEL_360;
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
            mAdapter.a();
        }
        Collections.sort(mItems, COMPARATOR);
        if (j1 != 0)
        {
            i1 = getChildCount();
            for (l = 0; l < i1; l++)
            {
                obj = (LayoutParams)getChildAt(l).getLayoutParams();
                if (!((LayoutParams) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(k, false, true);
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
            break MISSING_BLOCK_LABEL_196;
        }
    }

    public void a(int k, float f1, int l)
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
        LayoutParams layoutparams;
        view = getChildAt(j2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        layoutparams.b & 7;
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
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.a(k, f1, l);
        }
        if (mOnPageChangeListeners != null)
        {
            j1 = mOnPageChangeListeners.size();
            for (i1 = 0; i1 < j1; i1++)
            {
                e e1 = (e)mOnPageChangeListeners.get(i1);
                if (e1 != null)
                {
                    e1.a(k, f1, l);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.a(k, f1, l);
        }
        if (mPageTransformer != null)
        {
            getScrollX();
            l = getChildCount();
            for (k = 0; k < l; k++)
            {
                View view1 = getChildAt(k);
                if (!((LayoutParams)view1.getLayoutParams()).a)
                {
                    view1.getLeft();
                    e();
                }
            }

        }
        mCalledSuper = true;
        return;
        k1 = j1;
        i2 = i1;
          goto _L10
    }

    public boolean a(KeyEvent keyevent)
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
        return f(17);
_L4:
        return f(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (aK.b(keyevent))
            {
                return f(2);
            }
            if (aK.a(keyevent))
            {
                return f(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
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
                    b b1 = a(view);
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

    public void addTouchables(ArrayList arraylist)
    {
        for (int k = 0; k < getChildCount(); k++)
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
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
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof a);
        if (mInLayout)
        {
            if (layoutparams1 != null && layoutparams1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.d = true;
                addViewInLayout(view, k, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, k, layoutparams);
            return;
        }
    }

    final void b()
    {
        b(mCurItem);
    }

    public boolean canScrollHorizontally(int k)
    {
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l;
        int i1;
        l = e();
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
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
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
                if (!d(i1))
                {
                    mScroller.abortAnimation();
                    scrollTo(0, j1);
                }
            }
            aY.d(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
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
                b b1 = a(view);
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

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int l = 0;
        int k = 0;
        int i1 = aY.a(this);
        if (i1 == 0 || i1 == 1 && mAdapter != null && mAdapter.c() > 1)
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
            aY.d(this);
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
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int k, int l)
    {
        int i1 = l;
        if (mDrawingOrder == 2)
        {
            i1 = k - 1 - l;
        }
        return ((LayoutParams)((View)mDrawingOrderedChildren.get(i1)).getLayoutParams()).f;
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
                    f2 = (1.0F + f1) * (float)j1;
                    f1 += 1.0F + f3;
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
    //                   0: 427
    //                   2: 143
    //                   6: 558;
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
        l = aP.a(motionevent, l);
        f3 = aP.c(motionevent, l);
        f1 = f3 - mLastMotionX;
        f5 = Math.abs(f1);
        f4 = aP.d(motionevent, l);
        f6 = Math.abs(f4 - mInitialMotionY);
        if (f1 != 0.0F)
        {
            float f7 = mLastMotionX;
            boolean flag;
            if (f7 < (float)mGutterSize && f1 > 0.0F || f7 > (float)(getWidth() - mGutterSize) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                mLastMotionX = f3;
                mLastMotionY = f4;
                mIsUnableToDrag = true;
                return false;
            }
        }
        if (f5 <= (float)mTouchSlop || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        mIsBeingDragged = true;
        g();
        a(1);
        if (f1 > 0.0F)
        {
            f1 = mInitialMotionX + (float)mTouchSlop;
        } else
        {
            f1 = mInitialMotionX - (float)mTouchSlop;
        }
        mLastMotionX = f1;
        mLastMotionY = f4;
        b(true);
_L11:
        if (mIsBeingDragged && a(f3))
        {
            aY.d(this);
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
        mActivePointerId = aP.b(motionevent, 0);
        mIsUnableToDrag = false;
        mScroller.computeScrollOffset();
        if (mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
        {
            mScroller.abortAnimation();
            mPopulatePending = false;
            b();
            mIsBeingDragged = true;
            g();
            a(1);
        } else
        {
            a(false);
            mIsBeingDragged = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    public void onLayout(boolean flag, int k, int l, int i1, int j1)
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
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a) goto _L4; else goto _L5
_L5:
        int j5;
        j1 = layoutparams.b;
        j5 = layoutparams.b;
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
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.a)
            {
                continue;
            }
            b b1 = a(view1);
            if (b1 == null)
            {
                continue;
            }
            float f1 = k1;
            int j2 = (int)(b1.e * f1) + l;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = k1;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k4 - k - i1, 0x40000000));
            }
            view1.layout(j2, k, view1.getMeasuredWidth() + j2, view1.getMeasuredHeight() + k);
        }

        mTopPageBounds = k;
        mBottomPageBounds = k4 - i1;
        mDecorChildCount = l1;
        if (mFirstLayout)
        {
            a(mCurItem, false, 0, false);
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
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        i1 = k;
                        j1 = l;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        i1 = k;
                        j1 = l;
                        if (!layoutparams.a)
                        {
                            break label1;
                        }
                        i1 = layoutparams.b & 7;
                        int l1 = layoutparams.b & 0x70;
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
                        if (layoutparams.width != -2)
                        {
                            i2 = 0x40000000;
                            float f1;
                            int j2;
                            int k2;
                            if (layoutparams.width != -1)
                            {
                                i1 = layoutparams.width;
                            } else
                            {
                                i1 = k;
                            }
                        } else
                        {
                            i2 = i1;
                            i1 = k;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        j2 = 0x40000000;
                        j1 = j2;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        k2 = layoutparams.height;
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
            b();
            mInLayout = false;
            i1 = getChildCount();
            for (l = 0; l < i1; l++)
            {
                view = getChildAt(l);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = k;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), mChildHeightMeasureSpec);
                }
            }

            return;
        }
        j2 = l;
        break MISSING_BLOCK_LABEL_282;
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
            b b1 = a(view);
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
            mAdapter.a(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            a(((SavedState) (parcelable)).a, false, true);
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
            savedstate.b = mAdapter.b();
        }
        return savedstate;
    }

    public void onSizeChanged(int k, int l, int i1, int j1)
    {
        super.onSizeChanged(k, l, i1, j1);
        if (k != i1)
        {
            a(k, i1, mPageMargin, mPageMargin);
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
        if (mAdapter == null || mAdapter.c() == 0)
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
    //                   1 391
    //                   2 201
    //                   3 675
    //                   4 128
    //                   5 726
    //                   6 759;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        k = l;
_L10:
        if (k != 0)
        {
            aY.d(this);
        }
        return true;
_L2:
        mScroller.abortAnimation();
        mPopulatePending = false;
        b();
        float f1 = motionevent.getX();
        mInitialMotionX = f1;
        mLastMotionX = f1;
        f1 = motionevent.getY();
        mInitialMotionY = f1;
        mLastMotionY = f1;
        mActivePointerId = aP.b(motionevent, 0);
        k = l;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!mIsBeingDragged)
        {
            k = aP.a(motionevent, mActivePointerId);
            float f2 = aP.c(motionevent, k);
            float f6 = Math.abs(f2 - mLastMotionX);
            float f4 = aP.d(motionevent, k);
            float f7 = Math.abs(f4 - mLastMotionY);
            if (f6 > (float)mTouchSlop && f6 > f7)
            {
                mIsBeingDragged = true;
                g();
                ViewParent viewparent;
                if (f2 - mInitialMotionX > 0.0F)
                {
                    f2 = mInitialMotionX + (float)mTouchSlop;
                } else
                {
                    f2 = mInitialMotionX - (float)mTouchSlop;
                }
                mLastMotionX = f2;
                mLastMotionY = f4;
                a(1);
                b(true);
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
            k = a(aP.c(motionevent, aP.a(motionevent, mActivePointerId))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        k = l;
        if (mIsBeingDragged)
        {
            Object obj = mVelocityTracker;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
            int i1 = (int)aX.a(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            l = e();
            int j1 = getScrollX();
            obj = h();
            k = ((b) (obj)).b;
            float f5 = ((float)j1 / (float)l - ((b) (obj)).e) / ((b) (obj)).d;
            if (Math.abs((int)(aP.c(motionevent, aP.a(motionevent, mActivePointerId)) - mInitialMotionX)) > mFlingDistance && Math.abs(i1) > mMinimumVelocity)
            {
                if (i1 <= 0)
                {
                    k++;
                }
            } else
            {
                float f3;
                if (k >= mCurItem)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                k = (int)((float)k + f5 + f3);
            }
            l = k;
            if (mItems.size() > 0)
            {
                motionevent = (b)mItems.get(0);
                b b1 = (b)mItems.get(mItems.size() - 1);
                l = Math.max(((b) (motionevent)).b, Math.min(k, b1.b));
            }
            a(l, true, true, i1);
            mActivePointerId = -1;
            i();
            k = mLeftEdge.c() | mRightEdge.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        k = l;
        if (mIsBeingDragged)
        {
            a(mCurItem, true, 0, false);
            mActivePointerId = -1;
            i();
            k = mLeftEdge.c() | mRightEdge.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        k = aP.b(motionevent);
        mLastMotionX = aP.c(motionevent, k);
        mActivePointerId = aP.b(motionevent, k);
        k = l;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        mLastMotionX = aP.c(motionevent, aP.a(motionevent, mActivePointerId));
        k = l;
        if (true) goto _L10; else goto _L9
_L9:
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

    public void setAdapter(aU au)
    {
        if (mAdapter != null)
        {
            mAdapter.b(mObserver);
            for (int k = 0; k < mItems.size(); k++)
            {
                b b1 = (b)mItems.get(k);
                mAdapter.a(this, b1.b, b1.a);
            }

            mAdapter.a();
            mItems.clear();
            int i1;
            for (int l = 0; l < getChildCount(); l = i1 + 1)
            {
                i1 = l;
                if (!((LayoutParams)getChildAt(l).getLayoutParams()).a)
                {
                    removeViewAt(l);
                    i1 = l - 1;
                }
            }

            mCurItem = 0;
            scrollTo(0, 0);
        }
        aU au1 = mAdapter;
        mAdapter = au;
        mExpectedAdapterCount = 0;
        if (mAdapter != null)
        {
            if (mObserver == null)
            {
                mObserver = new g((byte)0);
            }
            mAdapter.a(mObserver);
            mPopulatePending = false;
            boolean flag = mFirstLayout;
            mFirstLayout = true;
            mExpectedAdapterCount = mAdapter.c();
            if (mRestoredCurItem >= 0)
            {
                mAdapter.a(mRestoredAdapterState, mRestoredClassLoader);
                a(mRestoredCurItem, false, true);
                mRestoredCurItem = -1;
                mRestoredAdapterState = null;
                mRestoredClassLoader = null;
            } else
            if (!flag)
            {
                b();
            } else
            {
                requestLayout();
            }
        }
        if (mAdapterChangeListener != null && au1 != au)
        {
            mAdapterChangeListener.a(au1, au);
        }
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
        a(k, flag, false);
    }

    public void setCurrentItem(int k, boolean flag)
    {
        mPopulatePending = false;
        a(k, flag, false);
    }

    public void setOffscreenPageLimit(int k)
    {
        int l = k;
        if (k <= 0)
        {
            (new StringBuilder("Requested offscreen page limit ")).append(k).append(" too small; defaulting to 1");
            l = 1;
        }
        if (l != mOffscreenPageLimit)
        {
            mOffscreenPageLimit = l;
            b();
        }
    }

    public void setOnPageChangeListener(e e1)
    {
        mOnPageChangeListener = e1;
    }

    public void setPageMargin(int k)
    {
        int l = mPageMargin;
        mPageMargin = k;
        int i1 = getWidth();
        a(i1, i1, k, l);
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

    public void setPageTransformer(boolean flag, f f1)
    {
        int k = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (f1 != null)
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
            mPageTransformer = f1;
            if (android.os.Build.VERSION.SDK_INT >= 7)
            {
                if (mSetChildrenDrawingOrderEnabled == null)
                {
                    try
                    {
                        mSetChildrenDrawingOrderEnabled = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                            Boolean.TYPE
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (f f1) { }
                }
                try
                {
                    mSetChildrenDrawingOrderEnabled.invoke(this, new Object[] {
                        Boolean.valueOf(flag2)
                    });
                }
                // Misplaced declaration of an exception variable
                catch (f f1) { }
            }
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
                b();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
    }

}
