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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
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
//            PagerAdapter, ViewCompat, MotionEventCompat, VelocityTrackerCompat, 
//            KeyEventCompat, ViewConfigurationCompat, AccessibilityDelegateCompat

public class ViewPager extends ViewGroup
{
    static interface Decor
    {
    }

    static class ItemInfo
    {

        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo()
        {
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams()
        {
            super(-1, -1);
            widthFactor = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            widthFactor = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS);
            gravity = context.getInteger(0, 48);
            context.recycle();
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final ViewPager this$0;

        private boolean canScroll()
        {
            return mAdapter != null && mAdapter.getCount() > 1;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = AccessibilityRecordCompat.obtain();
            view.setScrollable(canScroll());
            if (accessibilityevent.getEventType() == 4096 && mAdapter != null)
            {
                view.setItemCount(mAdapter.getCount());
                view.setFromIndex(mCurItem);
                view.setToIndex(mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            accessibilitynodeinfocompat.setClassName(android/support/v4/view/ViewPager.getName());
            accessibilitynodeinfocompat.setScrollable(canScroll());
            if (canScrollHorizontally(1))
            {
                accessibilitynodeinfocompat.addAction(4096);
            }
            if (canScrollHorizontally(-1))
            {
                accessibilitynodeinfocompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i, bundle))
            {
                return true;
            }
            switch (i)
            {
            default:
                return false;

            case 4096: 
                if (canScrollHorizontally(1))
                {
                    setCurrentItem(mCurItem + 1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                break;
            }
            if (canScrollHorizontally(-1))
            {
                setCurrentItem(mCurItem - 1);
                return true;
            } else
            {
                return false;
            }
        }

        MyAccessibilityDelegate()
        {
            this$0 = ViewPager.this;
            super();
        }
    }

    static interface OnAdapterChangeListener
    {

        public abstract void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1);
    }

    public static interface OnPageChangeListener
    {

        public abstract void onPageScrollStateChanged(int i);

        public abstract void onPageScrolled(int i, float f, int j);

        public abstract void onPageSelected(int i);
    }

    public static interface PageTransformer
    {

        public abstract void transformPage(View view, float f);
    }

    private class PagerObserver extends DataSetObserver
    {

        final ViewPager this$0;

        public void onChanged()
        {
            dataSetChanged();
        }

        public void onInvalidated()
        {
            dataSetChanged();
        }

        private PagerObserver()
        {
            this$0 = ViewPager.this;
            super();
        }

    }

    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

            public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return new SavedState(parcel, classloader);
            }

            public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return createFromParcel(parcel, classloader);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        });
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(position);
            parcel.writeParcelable(adapterState, i);
        }


        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            position = parcel.readInt();
            adapterState = parcel.readParcelable(classloader1);
            loader = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static class SimpleOnPageChangeListener
        implements OnPageChangeListener
    {

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
        }

        public SimpleOnPageChangeListener()
        {
        }
    }

    static class ViewPositionComparator
        implements Comparator
    {

        public int compare(View view, View view1)
        {
            view = (LayoutParams)view.getLayoutParams();
            view1 = (LayoutParams)view1.getLayoutParams();
            if (((LayoutParams) (view)).isDecor != ((LayoutParams) (view1)).isDecor)
            {
                return !((LayoutParams) (view)).isDecor ? -1 : 1;
            } else
            {
                return ((LayoutParams) (view)).position - ((LayoutParams) (view1)).position;
            }
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((View)obj, (View)obj1);
        }

        ViewPositionComparator()
        {
        }
    }


    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR = new Comparator() {

        public int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
        {
            return iteminfo.position - iteminfo1.position;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ItemInfo)obj, (ItemInfo)obj1);
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

        public float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
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
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public ViewPager(Context context)
    {
        super(context);
        mItems = new ArrayList();
        mTempItem = new ItemInfo();
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

            final ViewPager this$0;

            public void run()
            {
                setScrollState(0);
                populate();
            }

            
            {
                this$0 = ViewPager.this;
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
        mTempItem = new ItemInfo();
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

    private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
    {
        int i2 = mAdapter.getCount();
        int j = getClientWidth();
        float f3;
        if (j > 0)
        {
            f3 = (float)mPageMargin / (float)j;
        } else
        {
            f3 = 0.0F;
        }
        if (iteminfo1 != null)
        {
            j = iteminfo1.position;
            if (j < iteminfo.position)
            {
                float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
                j++;
                int j1;
                for (int k = 0; j <= iteminfo.position && k < mItems.size(); j = j1 + 1)
                {
                    iteminfo1 = (ItemInfo)mItems.get(k);
                    float f4;
                    do
                    {
                        j1 = j;
                        f4 = f;
                        if (j <= iteminfo1.position)
                        {
                            break;
                        }
                        j1 = j;
                        f4 = f;
                        if (k >= mItems.size() - 1)
                        {
                            break;
                        }
                        k++;
                        iteminfo1 = (ItemInfo)mItems.get(k);
                    } while (true);
                    for (; j1 < iteminfo1.position; j1++)
                    {
                        f4 += mAdapter.getPageWidth(j1) + f3;
                    }

                    iteminfo1.offset = f4;
                    f = f4 + (iteminfo1.widthFactor + f3);
                }

            } else
            if (j > iteminfo.position)
            {
                int l = mItems.size() - 1;
                float f1 = iteminfo1.offset;
                int k1;
                for (j--; j >= iteminfo.position && l >= 0; j = k1 - 1)
                {
                    iteminfo1 = (ItemInfo)mItems.get(l);
                    float f5;
                    do
                    {
                        k1 = j;
                        f5 = f1;
                        if (j >= iteminfo1.position)
                        {
                            break;
                        }
                        k1 = j;
                        f5 = f1;
                        if (l <= 0)
                        {
                            break;
                        }
                        l--;
                        iteminfo1 = (ItemInfo)mItems.get(l);
                    } while (true);
                    for (; k1 > iteminfo1.position; k1--)
                    {
                        f5 -= mAdapter.getPageWidth(k1) + f3;
                    }

                    f1 = f5 - (iteminfo1.widthFactor + f3);
                    iteminfo1.offset = f1;
                }

            }
        }
        int l1 = mItems.size();
        float f6 = iteminfo.offset;
        j = iteminfo.position - 1;
        float f2;
        int i1;
        if (iteminfo.position == 0)
        {
            f2 = iteminfo.offset;
        } else
        {
            f2 = -3.402823E+38F;
        }
        mFirstOffset = f2;
        if (iteminfo.position == i2 - 1)
        {
            f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
        } else
        {
            f2 = 3.402823E+38F;
        }
        mLastOffset = f2;
        i1 = i - 1;
        f2 = f6;
        for (; i1 >= 0; i1--)
        {
            for (iteminfo1 = (ItemInfo)mItems.get(i1); j > iteminfo1.position; j--)
            {
                f2 -= mAdapter.getPageWidth(j) + f3;
            }

            f2 -= iteminfo1.widthFactor + f3;
            iteminfo1.offset = f2;
            if (iteminfo1.position == 0)
            {
                mFirstOffset = f2;
            }
            j--;
        }

        f2 = iteminfo.offset + iteminfo.widthFactor + f3;
        i1 = iteminfo.position + 1;
        j = i + 1;
        i = i1;
        for (; j < l1; j++)
        {
            for (iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i++)
            {
                f2 = mAdapter.getPageWidth(i) + f3 + f2;
            }

            if (iteminfo.position == i2 - 1)
            {
                mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
            }
            iteminfo.offset = f2;
            f2 += iteminfo.widthFactor + f3;
            i++;
        }

        mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean flag)
    {
label0:
        {
            int i;
            boolean flag1;
            boolean flag2;
            if (mScrollState == 2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                setScrollingCacheEnabled(false);
                mScroller.abortAnimation();
                int j = getScrollX();
                int k = getScrollY();
                int l = mScroller.getCurrX();
                int i1 = mScroller.getCurrY();
                if (j != l || k != i1)
                {
                    scrollTo(l, i1);
                    if (l != j)
                    {
                        pageScrolled(l);
                    }
                }
            }
            mPopulatePending = false;
            flag2 = false;
            flag1 = i;
            for (i = ((flag2) ? 1 : 0); i < mItems.size(); i++)
            {
                ItemInfo iteminfo = (ItemInfo)mItems.get(i);
                if (iteminfo.scrolling)
                {
                    iteminfo.scrolling = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                ViewCompat.postOnAnimation(this, mEndScrollRunnable);
            }
            return;
        }
        mEndScrollRunnable.run();
    }

    private int determineTargetPage(int i, float f, int j, int k)
    {
        if (Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
        {
            if (j <= 0)
            {
                i++;
            }
        } else
        {
            float f1;
            if (i >= mCurItem)
            {
                f1 = 0.4F;
            } else
            {
                f1 = 0.6F;
            }
            i = (int)(f1 + ((float)i + f));
        }
        j = i;
        if (mItems.size() > 0)
        {
            ItemInfo iteminfo = (ItemInfo)mItems.get(0);
            ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
            j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
        }
        return j;
    }

    private void dispatchOnPageScrolled(int i, float f, int j)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.onPageScrolled(i, f, j);
        }
        if (mOnPageChangeListeners != null)
        {
            int l = mOnPageChangeListeners.size();
            for (int k = 0; k < l; k++)
            {
                OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(k);
                if (onpagechangelistener != null)
                {
                    onpagechangelistener.onPageScrolled(i, f, j);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.onPageScrolled(i, f, j);
        }
    }

    private void dispatchOnPageSelected(int i)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.onPageSelected(i);
        }
        if (mOnPageChangeListeners != null)
        {
            int k = mOnPageChangeListeners.size();
            for (int j = 0; j < k; j++)
            {
                OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
                if (onpagechangelistener != null)
                {
                    onpagechangelistener.onPageSelected(i);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i)
    {
        if (mOnPageChangeListener != null)
        {
            mOnPageChangeListener.onPageScrollStateChanged(i);
        }
        if (mOnPageChangeListeners != null)
        {
            int k = mOnPageChangeListeners.size();
            for (int j = 0; j < k; j++)
            {
                OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
                if (onpagechangelistener != null)
                {
                    onpagechangelistener.onPageScrollStateChanged(i);
                }
            }

        }
        if (mInternalPageChangeListener != null)
        {
            mInternalPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean flag)
    {
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            ViewCompat.setLayerType(getChildAt(i), byte0, null);
            i++;
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

    private ItemInfo infoForCurrentScrollPosition()
    {
        int i = getClientWidth();
        float f;
        float f1;
        float f2;
        float f3;
        ItemInfo iteminfo1;
        boolean flag;
        int j;
        if (i > 0)
        {
            f = (float)getScrollX() / (float)i;
        } else
        {
            f = 0.0F;
        }
        if (i > 0)
        {
            f1 = (float)mPageMargin / (float)i;
        } else
        {
            f1 = 0.0F;
        }
        f3 = 0.0F;
        f2 = 0.0F;
        j = -1;
        i = 0;
        flag = true;
        iteminfo1 = null;
        do
        {
            ItemInfo iteminfo;
label0:
            {
                ItemInfo iteminfo2;
label1:
                {
                    iteminfo2 = iteminfo1;
                    if (i >= mItems.size())
                    {
                        break label1;
                    }
                    iteminfo = (ItemInfo)mItems.get(i);
                    if (!flag && iteminfo.position != j + 1)
                    {
                        iteminfo = mTempItem;
                        iteminfo.offset = f3 + f2 + f1;
                        iteminfo.position = j + 1;
                        iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
                        i--;
                    }
                    f2 = iteminfo.offset;
                    f3 = iteminfo.widthFactor;
                    if (!flag)
                    {
                        iteminfo2 = iteminfo1;
                        if (f < f2)
                        {
                            break label1;
                        }
                    }
                    if (f >= f3 + f2 + f1 && i != mItems.size() - 1)
                    {
                        break label0;
                    }
                    iteminfo2 = iteminfo;
                }
                return iteminfo2;
            }
            j = iteminfo.position;
            f3 = iteminfo.widthFactor;
            flag = false;
            i++;
            iteminfo1 = iteminfo;
        } while (true);
    }

    private boolean isGutterDrag(float f, float f1)
    {
        return f < (float)mGutterSize && f1 > 0.0F || f > (float)(getWidth() - mGutterSize) && f1 < 0.0F;
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mLastMotionX = MotionEventCompat.getX(motionevent, i);
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
            if (mVelocityTracker != null)
            {
                mVelocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i)
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
            ItemInfo iteminfo = infoForCurrentScrollPosition();
            int k = getClientWidth();
            int l = mPageMargin;
            float f = (float)mPageMargin / (float)k;
            int j = iteminfo.position;
            f = ((float)i / (float)k - iteminfo.offset) / (iteminfo.widthFactor + f);
            i = (int)((float)(l + k) * f);
            mCalledSuper = false;
            onPageScrolled(j, f, i);
            if (!mCalledSuper)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private boolean performDrag(float f)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f1 = mLastMotionX;
        mLastMotionX = f;
        float f2 = (float)getScrollX() + (f1 - f);
        int i = getClientWidth();
        f = (float)i * mFirstOffset;
        f1 = i;
        float f3 = mLastOffset;
        ItemInfo iteminfo = (ItemInfo)mItems.get(0);
        ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
        boolean flag;
        if (iteminfo.position != 0)
        {
            f = iteminfo.offset * (float)i;
            flag = false;
        } else
        {
            flag = true;
        }
        if (iteminfo1.position != mAdapter.getCount() - 1)
        {
            f1 = iteminfo1.offset * (float)i;
            flag1 = false;
        } else
        {
            f1 *= f3;
        }
        if (f2 >= f) goto _L2; else goto _L1
_L1:
        f1 = f;
        if (flag)
        {
            flag2 = mLeftEdge.onPull(Math.abs(f - f2) / (float)i);
            f1 = f;
        }
_L4:
        mLastMotionX = mLastMotionX + (f1 - (float)(int)f1);
        scrollTo((int)f1, getScrollY());
        pageScrolled((int)f1);
        return flag2;
_L2:
        if (f2 > f1)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = mRightEdge.onPull(Math.abs(f2 - f1) / (float)i);
            }
        } else
        {
            f1 = f2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void recomputeScrollPosition(int i, int j, int k, int l)
    {
        if (j > 0 && !mItems.isEmpty())
        {
            int i1 = getPaddingLeft();
            int j1 = getPaddingRight();
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            float f = (float)getScrollX() / (float)((j - k1 - l1) + l);
            j = (int)((float)((i - i1 - j1) + k) * f);
            scrollTo(j, getScrollY());
            if (!mScroller.isFinished())
            {
                k = mScroller.getDuration();
                l = mScroller.timePassed();
                ItemInfo iteminfo = infoForPosition(mCurItem);
                mScroller.startScroll(j, 0, (int)(iteminfo.offset * (float)i), 0, k - l);
            }
        } else
        {
            ItemInfo iteminfo1 = infoForPosition(mCurItem);
            float f1;
            if (iteminfo1 != null)
            {
                f1 = Math.min(iteminfo1.offset, mLastOffset);
            } else
            {
                f1 = 0.0F;
            }
            i = (int)(f1 * (float)(i - getPaddingLeft() - getPaddingRight()));
            if (i != getScrollX())
            {
                completeScroll(false);
                scrollTo(i, getScrollY());
                return;
            }
        }
    }

    private void removeNonDecorViews()
    {
        int j;
        for (int i = 0; i < getChildCount(); i = j + 1)
        {
            j = i;
            if (!((LayoutParams)getChildAt(i).getLayoutParams()).isDecor)
            {
                removeViewAt(i);
                j = i - 1;
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

    private boolean resetTouch()
    {
        mActivePointerId = -1;
        endDrag();
        return mLeftEdge.onRelease() | mRightEdge.onRelease();
    }

    private void scrollToItem(int i, boolean flag, int j, boolean flag1)
    {
        ItemInfo iteminfo = infoForPosition(i);
        int k;
        if (iteminfo != null)
        {
            float f = getClientWidth();
            k = (int)(Math.max(mFirstOffset, Math.min(iteminfo.offset, mLastOffset)) * f);
        } else
        {
            k = 0;
        }
        if (flag)
        {
            smoothScrollTo(k, 0, j);
            if (flag1)
            {
                dispatchOnPageSelected(i);
            }
            return;
        }
        if (flag1)
        {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(k, 0);
        pageScrolled(k);
    }

    private void setScrollState(int i)
    {
        if (mScrollState == i)
        {
            return;
        }
        mScrollState = i;
        if (mPageTransformer != null)
        {
            boolean flag;
            if (i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            enableLayers(flag);
        }
        dispatchOnScrollStateChanged(i);
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
            int j;
            if (mDrawingOrderedChildren == null)
            {
                mDrawingOrderedChildren = new ArrayList();
            } else
            {
                mDrawingOrderedChildren.clear();
            }
            j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                View view = getChildAt(i);
                mDrawingOrderedChildren.add(view);
            }

            Collections.sort(mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        int l = arraylist.size();
        int i1 = getDescendantFocusability();
        if (i1 != 0x60000)
        {
            for (int k = 0; k < getChildCount(); k++)
            {
                View view = getChildAt(k);
                if (view.getVisibility() == 0)
                {
                    ItemInfo iteminfo = infoForChild(view);
                    if (iteminfo != null && iteminfo.position == mCurItem)
                    {
                        view.addFocusables(arraylist, i, j);
                    }
                }
            }

        }
        while (i1 == 0x40000 && l != arraylist.size() || !isFocusable() || (j & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    ItemInfo addNewItem(int i, int j)
    {
        ItemInfo iteminfo = new ItemInfo();
        iteminfo.position = i;
        iteminfo.object = mAdapter.instantiateItem(this, i);
        iteminfo.widthFactor = mAdapter.getPageWidth(i);
        if (j < 0 || j >= mItems.size())
        {
            mItems.add(iteminfo);
            return iteminfo;
        } else
        {
            mItems.add(j, iteminfo);
            return iteminfo;
        }
    }

    public void addOnPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        if (mOnPageChangeListeners == null)
        {
            mOnPageChangeListeners = new ArrayList();
        }
        mOnPageChangeListeners.add(onpagechangelistener);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            ItemInfo iteminfo = infoForChild(view);
            if (iteminfo != null && iteminfo.position == mCurItem)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.isDecor = layoutparams1.isDecor | (view instanceof Decor);
        if (mInLayout)
        {
            if (layoutparams1 != null && layoutparams1.isDecor)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.needsMeasure = true;
                addViewInLayout(view, i, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i, layoutparams);
            return;
        }
    }

    public boolean arrowScroll(int i)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i != 17) goto _L6; else goto _L5
_L5:
        int j;
        boolean flag;
        j = getChildRectInPagerCoordinates(mTempRect, view).left;
        int k = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j >= k)
        {
            flag = pageLeft();
        } else
        {
            flag = view.requestFocus();
        }
_L16:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j = 1;
_L18:
        if (j != 0) goto _L8; else goto _L11
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

        Log.e("ViewPager", (new StringBuilder()).append("arrowScroll tried to find focus based on non-child current focused view ").append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i != 66) goto _L15; else goto _L14
_L14:
        j = getChildRectInPagerCoordinates(mTempRect, view).left;
        int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
        if (obj != null && j <= l)
        {
            flag = pageRight();
        } else
        {
            flag = view.requestFocus();
        }
          goto _L16
_L4:
label0:
        {
            if (i != 17 && i != 1)
            {
                break label0;
            }
            flag = pageLeft();
        }
          goto _L16
        if (i != 66 && i != 2) goto _L15; else goto _L17
_L17:
        flag = pageRight();
          goto _L16
_L15:
        flag = false;
          goto _L16
_L8:
        obj = view;
          goto _L13
        j = 0;
          goto _L18
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

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l;
        int i1;
        int j1;
        viewgroup = (ViewGroup)view;
        i1 = view.getScrollX();
        j1 = view.getScrollY();
        l = viewgroup.getChildCount() - 1;
_L8:
        if (l < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l);
        if (j + i1 < view1.getLeft() || j + i1 >= view1.getRight() || k + j1 < view1.getTop() || k + j1 >= view1.getBottom() || !canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && ViewCompat.canScrollHorizontally(view, -i)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean canScrollHorizontally(int i)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (mAdapter != null)
        {
            int j = getClientWidth();
            int k = getScrollX();
            if (i < 0)
            {
                if (k <= (int)((float)j * mFirstOffset))
                {
                    flag = false;
                }
                return flag;
            }
            if (i > 0)
            {
                boolean flag1;
                if (k < (int)((float)j * mLastOffset))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
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
            int i = getScrollX();
            int j = getScrollY();
            int k = mScroller.getCurrX();
            int l = mScroller.getCurrY();
            if (i != k || j != l)
            {
                scrollTo(k, l);
                if (!pageScrolled(k))
                {
                    mScroller.abortAnimation();
                    scrollTo(0, l);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        } else
        {
            completeScroll(true);
            return;
        }
    }

    void dataSetChanged()
    {
        int i2 = mAdapter.getCount();
        mExpectedAdapterCount = i2;
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        if (mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < i2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = mCurItem;
        k = 0;
        flag = false;
        l = i;
        i = j;
        j = k;
        k = ((flag) ? 1 : 0);
        while (k < mItems.size()) 
        {
            Object obj = (ItemInfo)mItems.get(k);
            int i1 = mAdapter.getItemPosition(((ItemInfo) (obj)).object);
            int k1;
            if (i1 == -1)
            {
                i1 = k;
                int j1 = j;
                k = l;
                j = i;
                i = j1;
                l = i1;
            } else
            if (i1 == -2)
            {
                mItems.remove(k);
                l = k - 1;
                k = j;
                if (j == 0)
                {
                    mAdapter.startUpdate(this);
                    k = 1;
                }
                mAdapter.destroyItem(this, ((ItemInfo) (obj)).position, ((ItemInfo) (obj)).object);
                int l1;
                if (mCurItem == ((ItemInfo) (obj)).position)
                {
                    j = Math.max(0, Math.min(mCurItem, i2 - 1));
                    i = k;
                    k = 1;
                } else
                {
                    j = i;
                    boolean flag1 = true;
                    i = k;
                    k = ((flag1) ? 1 : 0);
                }
            } else
            if (((ItemInfo) (obj)).position != i1)
            {
                if (((ItemInfo) (obj)).position == mCurItem)
                {
                    i = i1;
                }
                obj.position = i1;
                i1 = i;
                l1 = 1;
                l = k;
                i = j;
                j = i1;
                k = l1;
            } else
            {
                i1 = i;
                l1 = l;
                l = k;
                i = j;
                j = i1;
                k = l1;
            }
            i1 = k;
            k1 = j;
            k = l + 1;
            j = i;
            i = k1;
            l = i1;
        }
        if (j != 0)
        {
            mAdapter.finishUpdate(this);
        }
        Collections.sort(mItems, COMPARATOR);
        if (l != 0)
        {
            k = getChildCount();
            for (j = 0; j < k; j++)
            {
                obj = (LayoutParams)getChildAt(j).getLayoutParams();
                if (!((LayoutParams) (obj)).isDecor)
                {
                    obj.widthFactor = 0.0F;
                }
            }

            setCurrentItemInternal(i, false, true);
            requestLayout();
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
        int j = getChildCount();
        int i = 0;
        do
        {
            flag = flag1;
            if (i >= j)
            {
                continue;
            }
            View view = getChildAt(i);
            if (view.getVisibility() == 0)
            {
                ItemInfo iteminfo = infoForChild(view);
                if (iteminfo != null && iteminfo.position == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    float distanceInfluenceForSnapDuration(float f)
    {
        return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j = 0;
        int i = 0;
        int k = ViewCompat.getOverScrollMode(this);
        if (k == 0 || k == 1 && mAdapter != null && mAdapter.getCount() > 1)
        {
            if (!mLeftEdge.isFinished())
            {
                j = canvas.save();
                i = getHeight() - getPaddingTop() - getPaddingBottom();
                int l = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
                mLeftEdge.setSize(i, l);
                i = false | mLeftEdge.draw(canvas);
                canvas.restoreToCount(j);
            }
            j = i;
            if (!mRightEdge.isFinished())
            {
                int i1 = canvas.save();
                j = getWidth();
                int j1 = getHeight();
                int k1 = getPaddingTop();
                int l1 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
                mRightEdge.setSize(j1 - k1 - l1, j);
                j = i | mRightEdge.draw(canvas);
                canvas.restoreToCount(i1);
            }
        } else
        {
            mLeftEdge.finish();
            mRightEdge.finish();
        }
        if (j != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
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
            int i = (int)VelocityTrackerCompat.getXVelocity(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            int j = getClientWidth();
            int k = getScrollX();
            obj = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
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
            if (KeyEventCompat.hasNoModifiers(keyevent))
            {
                return arrowScroll(2);
            }
            if (KeyEventCompat.hasModifiers(keyevent, 1))
            {
                return arrowScroll(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void fakeDragBy(float f)
    {
        if (!mFakeDragging)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        mLastMotionX = mLastMotionX + f;
        float f2 = (float)getScrollX() - f;
        int i = getClientWidth();
        f = i;
        float f4 = mFirstOffset;
        float f1 = i;
        float f3 = mLastOffset;
        Object obj = (ItemInfo)mItems.get(0);
        ItemInfo iteminfo = (ItemInfo)mItems.get(mItems.size() - 1);
        long l;
        if (((ItemInfo) (obj)).position != 0)
        {
            f = ((ItemInfo) (obj)).offset * (float)i;
        } else
        {
            f *= f4;
        }
        if (iteminfo.position != mAdapter.getCount() - 1)
        {
            f1 = iteminfo.offset * (float)i;
        } else
        {
            f1 *= f3;
        }
        if (f2 >= f)
        {
            if (f2 > f1)
            {
                f = f1;
            } else
            {
                f = f2;
            }
        }
        mLastMotionX = mLastMotionX + (f - (float)(int)f);
        scrollTo((int)f, getScrollY());
        pageScrolled((int)f);
        l = SystemClock.uptimeMillis();
        obj = MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0);
        mVelocityTracker.addMovement(((MotionEvent) (obj)));
        ((MotionEvent) (obj)).recycle();
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

    public PagerAdapter getAdapter()
    {
        return mAdapter;
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        int k = j;
        if (mDrawingOrder == 2)
        {
            k = i - 1 - j;
        }
        return ((LayoutParams)((View)mDrawingOrderedChildren.get(k)).getLayoutParams()).childIndex;
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

    ItemInfo infoForAnyChild(View view)
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

    ItemInfo infoForChild(View view)
    {
        for (int i = 0; i < mItems.size(); i++)
        {
            ItemInfo iteminfo = (ItemInfo)mItems.get(i);
            if (mAdapter.isViewFromObject(view, iteminfo.object))
            {
                return iteminfo;
            }
        }

        return null;
    }

    ItemInfo infoForPosition(int i)
    {
        for (int j = 0; j < mItems.size(); j++)
        {
            ItemInfo iteminfo = (ItemInfo)mItems.get(j);
            if (iteminfo.position == i)
            {
                return iteminfo;
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
        float f = context.getResources().getDisplayMetrics().density;
        mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewconfiguration);
        mMinimumVelocity = (int)(400F * f);
        mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mLeftEdge = new EdgeEffectCompat(context);
        mRightEdge = new EdgeEffectCompat(context);
        mFlingDistance = (int)(25F * f);
        mCloseEnough = (int)(2.0F * f);
        mDefaultGutterSize = (int)(16F * f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
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
        if (mPageMargin <= 0 || mMarginDrawable == null || mItems.size() <= 0 || mAdapter == null) goto _L2; else goto _L1
_L1:
        float f;
        float f2;
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        k = getScrollX();
        l = getWidth();
        f2 = (float)mPageMargin / (float)l;
        obj = (ItemInfo)mItems.get(0);
        f = ((ItemInfo) (obj)).offset;
        i1 = mItems.size();
        i = ((ItemInfo) (obj)).position;
        j1 = ((ItemInfo)mItems.get(i1 - 1)).position;
        j = 0;
_L6:
        if (i >= j1) goto _L2; else goto _L3
_L3:
        for (; i > ((ItemInfo) (obj)).position && j < i1; obj = (ItemInfo)((ArrayList) (obj)).get(j))
        {
            obj = mItems;
            j++;
        }

        float f1;
        if (i == ((ItemInfo) (obj)).position)
        {
            f1 = (((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor) * (float)l;
            f = ((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor + f2;
        } else
        {
            float f3 = mAdapter.getPageWidth(i);
            f1 = (f + f3) * (float)l;
            f += f3 + f2;
        }
        if ((float)mPageMargin + f1 > (float)k)
        {
            mMarginDrawable.setBounds((int)f1, mTopPageBounds, (int)((float)mPageMargin + f1 + 0.5F), mBottomPageBounds);
            mMarginDrawable.draw(canvas);
        }
        if (f1 <= (float)(k + l)) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction() & 0xff;
        if (i != 3 && i != 1) goto _L2; else goto _L1
_L1:
        resetTouch();
_L4:
        return false;
_L2:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mIsBeingDragged)
        {
            return true;
        }
        if (mIsUnableToDrag) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR lookupswitch 3: default 88
    //                   0: 353
    //                   2: 115
    //                   6: 485;
           goto _L5 _L6 _L7 _L8
_L5:
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        return mIsBeingDragged;
_L7:
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int j = mActivePointerId;
        if (j == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = MotionEventCompat.findPointerIndex(motionevent, j);
        f2 = MotionEventCompat.getX(motionevent, j);
        f = f2 - mLastMotionX;
        f4 = Math.abs(f);
        f3 = MotionEventCompat.getY(motionevent, j);
        f5 = Math.abs(f3 - mInitialMotionY);
        if (f != 0.0F && !isGutterDrag(mLastMotionX, f) && canScroll(this, false, (int)f, (int)f2, (int)f3))
        {
            mLastMotionX = f2;
            mLastMotionY = f3;
            mIsUnableToDrag = true;
            return false;
        }
        if (f4 <= (float)mTouchSlop || 0.5F * f4 <= f5) goto _L10; else goto _L9
_L9:
        mIsBeingDragged = true;
        requestParentDisallowInterceptTouchEvent(true);
        setScrollState(1);
        if (f > 0.0F)
        {
            f = mInitialMotionX + (float)mTouchSlop;
        } else
        {
            f = mInitialMotionX - (float)mTouchSlop;
        }
        mLastMotionX = f;
        mLastMotionY = f3;
        setScrollingCacheEnabled(true);
_L11:
        if (mIsBeingDragged && performDrag(f2))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f5 > (float)mTouchSlop)
        {
            mIsUnableToDrag = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f1 = motionevent.getX();
        mInitialMotionX = f1;
        mLastMotionX = f1;
        f1 = motionevent.getY();
        mInitialMotionY = f1;
        mLastMotionY = f1;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
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

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int j1;
        int j2;
        int l3;
        int i4;
        int j4;
        int k4;
        l3 = getChildCount();
        j4 = k - i;
        i4 = l - j;
        j = getPaddingLeft();
        i = getPaddingTop();
        i1 = getPaddingRight();
        k = getPaddingBottom();
        k4 = getScrollX();
        j1 = 0;
        j2 = 0;
_L14:
        if (j2 >= l3) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j2);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.isDecor) goto _L4; else goto _L5
_L5:
        int l4;
        l = layoutparams.gravity;
        l4 = layoutparams.gravity;
        l & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k1;
        l = j;
        k1 = j;
_L15:
        l4 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k2 = i;
        j = i;
        i = k;
        k = k2;
_L16:
        l += k4;
        view.layout(l, k, view.getMeasuredWidth() + l, view.getMeasuredHeight() + k);
        j1++;
        l = i1;
        k = k1;
        i1 = i;
        i = j1;
_L17:
        j2++;
        k1 = k;
        j1 = i;
        i = j;
        k = i1;
        i1 = l;
        j = k1;
          goto _L14
_L8:
        k1 = view.getMeasuredWidth();
        l = j;
        k1 += j;
          goto _L15
_L7:
        l = Math.max((j4 - view.getMeasuredWidth()) / 2, j);
        k1 = j;
          goto _L15
_L9:
        k1 = view.getMeasuredWidth();
        l = i1 + view.getMeasuredWidth();
        int l2 = j4 - i1 - k1;
        i1 = l;
        k1 = j;
        l = l2;
          goto _L15
_L12:
        int i3 = view.getMeasuredHeight();
        j = k;
        i3 += i;
        k = i;
        i = j;
        j = i3;
          goto _L16
_L11:
        int j3 = Math.max((i4 - view.getMeasuredHeight()) / 2, i);
        j = i;
        i = k;
        k = j3;
          goto _L16
_L13:
        int k3 = i4 - k - view.getMeasuredHeight();
        int i5 = view.getMeasuredHeight();
        j = i;
        i = k + i5;
        k = k3;
          goto _L16
_L2:
        i1 = j4 - j - i1;
        for (l = 0; l < l3; l++)
        {
            View view1 = getChildAt(l);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.isDecor)
            {
                continue;
            }
            ItemInfo iteminfo = infoForChild(view1);
            if (iteminfo == null)
            {
                continue;
            }
            float f = i1;
            int l1 = (int)(iteminfo.offset * f) + j;
            if (layoutparams1.needsMeasure)
            {
                layoutparams1.needsMeasure = false;
                float f1 = i1;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.widthFactor * f1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i4 - i - k, 0x40000000));
            }
            view1.layout(l1, i, view1.getMeasuredWidth() + l1, view1.getMeasuredHeight() + i);
        }

        mTopPageBounds = i;
        mBottomPageBounds = i4 - k;
        mDecorChildCount = j1;
        if (mFirstLayout)
        {
            scrollToItem(mCurItem, false, 0, false);
        }
        mFirstLayout = false;
        return;
_L4:
        l = j1;
        j1 = i;
        int i2 = j;
        i = l;
        l = i1;
        i1 = k;
        j = j1;
        k = i2;
          goto _L17
    }

    protected void onMeasure(int i, int j)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
            i = getMeasuredWidth();
            mGutterSize = Math.min(i / 10, mDefaultGutterSize);
            i = i - getPaddingLeft() - getPaddingRight();
            j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j2 = getChildCount();
            int i1 = 0;
            while (i1 < j2) 
            {
label1:
                {
                    {
                        View view = getChildAt(i1);
                        int k = i;
                        int l = j;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        k = i;
                        l = j;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        k = i;
                        l = j;
                        if (!layoutparams.isDecor)
                        {
                            break label1;
                        }
                        k = layoutparams.gravity & 7;
                        int j1 = layoutparams.gravity & 0x70;
                        int k1 = 0x80000000;
                        l = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j1 == 48 || j1 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k == 3 || k == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k = 0x40000000;
                        } else
                        {
                            k = k1;
                            if (flag1)
                            {
                                l = 0x40000000;
                                k = k1;
                            }
                        }
                        if (layoutparams.width != -2)
                        {
                            k1 = 0x40000000;
                            float f;
                            int l1;
                            int i2;
                            if (layoutparams.width != -1)
                            {
                                k = layoutparams.width;
                            } else
                            {
                                k = i;
                            }
                        } else
                        {
                            k1 = k;
                            k = i;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        l1 = 0x40000000;
                        l = l1;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        i2 = layoutparams.height;
                        l = l1;
                        l1 = i2;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, k1), android.view.View.MeasureSpec.makeMeasureSpec(l1, l));
                    if (flag)
                    {
                        l = j - view.getMeasuredHeight();
                        k = i;
                    } else
                    {
                        k = i;
                        l = j;
                        if (flag1)
                        {
                            k = i - view.getMeasuredWidth();
                            l = j;
                        }
                    }
                }
                i1++;
                i = k;
                j = l;
            }
            mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
            mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            mInLayout = true;
            populate();
            mInLayout = false;
            k = getChildCount();
            for (j = 0; j < k; j++)
            {
                view = getChildAt(j);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.isDecor)
                {
                    f = i;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.widthFactor * f), 0x40000000), mChildHeightMeasureSpec);
                }
            }

            return;
        }
        l1 = j;
        break MISSING_BLOCK_LABEL_282;
    }

    protected void onPageScrolled(int i, float f, int j)
    {
        int k;
        int i1;
        int k2;
        int l2;
        int i3;
        int j3;
        if (mDecorChildCount <= 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        l2 = getScrollX();
        k = getPaddingLeft();
        i1 = getPaddingRight();
        i3 = getWidth();
        j3 = getChildCount();
        k2 = 0;
_L2:
        View view;
        LayoutParams layoutparams;
        int j1;
        int k1;
        if (k2 >= j3)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        view = getChildAt(k2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.isDecor)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = k;
        j1 = i1;
_L7:
        k2++;
        k = k1;
        i1 = j1;
        if (true) goto _L2; else goto _L1
_L1:
        layoutparams.gravity & 7;
        JVM INSTR tableswitch 1 5: default 140
    //                   1 229
    //                   2 140
    //                   3 200
    //                   4 140
    //                   5 261;
           goto _L3 _L4 _L3 _L5 _L3 _L6
_L6:
        break MISSING_BLOCK_LABEL_261;
_L3:
        j1 = k;
        k1 = i1;
        i1 = k;
        k = k1;
_L8:
        int k3 = (j1 + l2) - view.getLeft();
        j1 = k;
        k1 = i1;
        if (k3 != 0)
        {
            view.offsetLeftAndRight(k3);
            j1 = k;
            k1 = i1;
        }
          goto _L7
_L5:
        j1 = view.getWidth();
        int l1 = j1 + k;
        j1 = k;
        k = i1;
        i1 = l1;
          goto _L8
_L4:
        j1 = Math.max((i3 - view.getMeasuredWidth()) / 2, k);
        int i2 = k;
        k = i1;
        i1 = i2;
          goto _L8
        j1 = i3 - i1 - view.getMeasuredWidth();
        int l3 = view.getMeasuredWidth();
        int j2 = k;
        k = i1 + l3;
        i1 = j2;
          goto _L8
        dispatchOnPageScrolled(i, f, j);
        if (mPageTransformer != null)
        {
            j = getScrollX();
            int l = getChildCount();
            i = 0;
            while (i < l) 
            {
                View view1 = getChildAt(i);
                if (!((LayoutParams)view1.getLayoutParams()).isDecor)
                {
                    f = (float)(view1.getLeft() - j) / (float)getClientWidth();
                    mPageTransformer.transformPage(view1, f);
                }
                i++;
            }
        }
        mCalledSuper = true;
        return;
          goto _L7
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect)
    {
        byte byte0 = -1;
        int k = getChildCount();
        int j;
        if ((i & 2) != 0)
        {
            byte0 = 1;
            j = 0;
        } else
        {
            j = k - 1;
            k = -1;
        }
        for (; j != k; j += byte0)
        {
            View view = getChildAt(j);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            ItemInfo iteminfo = infoForChild(view);
            if (iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
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
            mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
            setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
            return;
        } else
        {
            mRestoredCurItem = ((SavedState) (parcelable)).position;
            mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
            mRestoredClassLoader = ((SavedState) (parcelable)).loader;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.position = mCurItem;
        if (mAdapter != null)
        {
            savedstate.adapterState = mAdapter.saveState();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k)
        {
            recomputeScrollPosition(i, k, mPageMargin, mPageMargin);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
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
        flag = flag1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 407
    //                   2 201
    //                   3 537
    //                   4 128
    //                   5 568
    //                   6 601;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag1;
_L10:
        if (flag)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
_L2:
        mScroller.abortAnimation();
        mPopulatePending = false;
        populate();
        float f = motionevent.getX();
        mInitialMotionX = f;
        mLastMotionX = f;
        f = motionevent.getY();
        mInitialMotionY = f;
        mLastMotionY = f;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!mIsBeingDragged)
        {
            int i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            if (i == -1)
            {
                flag = resetTouch();
                continue; /* Loop/switch isn't completed */
            }
            float f1 = MotionEventCompat.getX(motionevent, i);
            float f3 = Math.abs(f1 - mLastMotionX);
            float f2 = MotionEventCompat.getY(motionevent, i);
            float f4 = Math.abs(f2 - mLastMotionY);
            if (f3 > (float)mTouchSlop && f3 > f4)
            {
                mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                ViewParent viewparent;
                if (f1 - mInitialMotionX > 0.0F)
                {
                    f1 = mInitialMotionX + (float)mTouchSlop;
                } else
                {
                    f1 = mInitialMotionX - (float)mTouchSlop;
                }
                mLastMotionX = f1;
                mLastMotionY = f2;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        flag = flag1;
        if (mIsBeingDragged)
        {
            flag = false | performDrag(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId)));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
        if (mIsBeingDragged)
        {
            Object obj = mVelocityTracker;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
            int j = (int)VelocityTrackerCompat.getXVelocity(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            int l = getClientWidth();
            int i1 = getScrollX();
            obj = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)i1 / (float)l - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, j, (int)(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId)) - mInitialMotionX)), true, true, j);
            flag = resetTouch();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (mIsBeingDragged)
        {
            scrollToItem(mCurItem, true, 0, false);
            flag = resetTouch();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int k = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, k);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, k);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L8:
        onSecondaryPointerUp(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        flag = flag1;
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

    void populate(int i)
    {
        float f;
        float f1;
        float f2;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j;
        byte byte1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (mCurItem != i)
        {
            byte byte0;
            if (mCurItem < i)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = infoForPosition(mCurItem);
            mCurItem = i;
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
        i = mOffscreenPageLimit;
        l1 = Math.max(0, mCurItem - i);
        j1 = mAdapter.getCount();
        k1 = Math.min(j1 - 1, i + mCurItem);
        if (j1 != mExpectedAdapterCount)
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
            throw new IllegalStateException((new StringBuilder()).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(mExpectedAdapterCount).append(", found: ").append(j1).append(" Pager id: ").append(s).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(mAdapter.getClass()).toString());
        }
        i = 0;
_L20:
        if (i >= mItems.size())
        {
            break MISSING_BLOCK_LABEL_1273;
        }
        obj = (ItemInfo)mItems.get(i);
        if (((ItemInfo) (obj)).position < mCurItem) goto _L6; else goto _L5
_L5:
        if (((ItemInfo) (obj)).position != mCurItem)
        {
            break MISSING_BLOCK_LABEL_1273;
        }
_L30:
        if (obj == null && j1 > 0)
        {
            obj2 = addNewItem(mCurItem, i);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        i1 = i - 1;
        if (i1 >= 0)
        {
            obj = (ItemInfo)mItems.get(i1);
        } else
        {
            obj = null;
        }
        i2 = getClientWidth();
        if (i2 <= 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (2.0F - ((ItemInfo) (obj2)).widthFactor) + (float)getPaddingLeft() / (float)i2;
        }
        j = mCurItem;
        f2 = 0.0F;
        l = j - 1;
        k = i;
        obj3 = obj;
_L21:
        if (l < 0) goto _L10; else goto _L9
_L9:
        if (f2 < f1 || l >= l1) goto _L12; else goto _L11
_L11:
        if (obj3 != null) goto _L13; else goto _L10
_L10:
        f = ((ItemInfo) (obj2)).widthFactor;
        i = k + 1;
        if (f >= 2.0F) goto _L15; else goto _L14
_L14:
        if (i < mItems.size())
        {
            obj = (ItemInfo)mItems.get(i);
        } else
        {
            obj = null;
        }
        if (i2 <= 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (float)getPaddingRight() / (float)i2 + 2.0F;
        }
        j = mCurItem;
        j++;
_L23:
        if (j >= j1) goto _L15; else goto _L16
_L16:
        if (f < f1 || j <= k1) goto _L18; else goto _L17
_L17:
        if (obj != null) goto _L19; else goto _L15
_L15:
        calculatePageOffsets(((ItemInfo) (obj2)), k, ((ItemInfo) (obj1)));
          goto _L8
_L6:
        i++;
          goto _L20
_L13:
        obj = obj3;
        i = i1;
        f = f2;
        j = k;
        if (l == ((ItemInfo) (obj3)).position)
        {
            obj = obj3;
            i = i1;
            f = f2;
            j = k;
            if (!((ItemInfo) (obj3)).scrolling)
            {
                mItems.remove(i1);
                mAdapter.destroyItem(this, l, ((ItemInfo) (obj3)).object);
                i = i1 - 1;
                j = k - 1;
                if (i >= 0)
                {
                    obj = (ItemInfo)mItems.get(i);
                    f = f2;
                } else
                {
                    obj = null;
                    f = f2;
                }
            }
        }
_L22:
        l--;
        obj3 = obj;
        i1 = i;
        f2 = f;
        k = j;
          goto _L21
_L12:
        if (obj3 != null && l == ((ItemInfo) (obj3)).position)
        {
            f = f2 + ((ItemInfo) (obj3)).widthFactor;
            i = i1 - 1;
            if (i >= 0)
            {
                obj = (ItemInfo)mItems.get(i);
                j = k;
            } else
            {
                obj = null;
                j = k;
            }
        } else
        {
            f = f2 + addNewItem(l, i1 + 1).widthFactor;
            j = k + 1;
            if (i1 >= 0)
            {
                obj = (ItemInfo)mItems.get(i1);
                i = i1;
            } else
            {
                obj = null;
                i = i1;
            }
        }
          goto _L22
_L19:
        if (j == ((ItemInfo) (obj)).position && !((ItemInfo) (obj)).scrolling)
        {
            mItems.remove(i);
            mAdapter.destroyItem(this, j, ((ItemInfo) (obj)).object);
            if (i < mItems.size())
            {
                obj = (ItemInfo)mItems.get(i);
            } else
            {
                obj = null;
            }
        }
_L24:
        j++;
          goto _L23
_L18:
        if (obj != null && j == ((ItemInfo) (obj)).position)
        {
            float f3 = ((ItemInfo) (obj)).widthFactor;
            i++;
            if (i < mItems.size())
            {
                obj = (ItemInfo)mItems.get(i);
            } else
            {
                obj = null;
            }
            f += f3;
        } else
        {
            obj = addNewItem(j, i);
            i++;
            float f4 = ((ItemInfo) (obj)).widthFactor;
            if (i < mItems.size())
            {
                obj = (ItemInfo)mItems.get(i);
            } else
            {
                obj = null;
            }
            f += f4;
        }
          goto _L24
_L8:
        obj1 = mAdapter;
        i = mCurItem;
        if (obj2 != null)
        {
            obj = ((ItemInfo) (obj2)).object;
        } else
        {
            obj = null;
        }
        ((PagerAdapter) (obj1)).setPrimaryItem(this, i, obj);
        mAdapter.finishUpdate(this);
        j = getChildCount();
        for (i = 0; i < j; i++)
        {
            obj1 = getChildAt(i);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.childIndex = i;
            if (!((LayoutParams) (obj)).isDecor && ((LayoutParams) (obj)).widthFactor == 0.0F)
            {
                obj1 = infoForChild(((View) (obj1)));
                if (obj1 != null)
                {
                    obj.widthFactor = ((ItemInfo) (obj1)).widthFactor;
                    obj.position = ((ItemInfo) (obj1)).position;
                }
            }
        }

        sortChildDrawingOrder();
        if (!hasFocus()) goto _L4; else goto _L25
_L25:
        obj = findFocus();
        if (obj != null)
        {
            obj = infoForAnyChild(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((ItemInfo) (obj)).position == mCurItem) goto _L4; else goto _L26
_L26:
        i = 0;
_L29:
        if (i >= getChildCount()) goto _L4; else goto _L27
_L27:
        obj = getChildAt(i);
        obj1 = infoForChild(((View) (obj)));
        if (obj1 != null && ((ItemInfo) (obj1)).position == mCurItem && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L28
_L28:
        i++;
          goto _L29
        obj = null;
          goto _L30
    }

    public void removeOnPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        if (mOnPageChangeListeners != null)
        {
            mOnPageChangeListeners.remove(onpagechangelistener);
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

    public void setAdapter(PagerAdapter pageradapter)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
            mAdapter.startUpdate(this);
            for (int i = 0; i < mItems.size(); i++)
            {
                ItemInfo iteminfo = (ItemInfo)mItems.get(i);
                mAdapter.destroyItem(this, iteminfo.position, iteminfo.object);
            }

            mAdapter.finishUpdate(this);
            mItems.clear();
            removeNonDecorViews();
            mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pageradapter1 = mAdapter;
        mAdapter = pageradapter;
        mExpectedAdapterCount = 0;
        if (mAdapter != null)
        {
            if (mObserver == null)
            {
                mObserver = new PagerObserver();
            }
            mAdapter.registerDataSetObserver(mObserver);
            mPopulatePending = false;
            boolean flag = mFirstLayout;
            mFirstLayout = true;
            mExpectedAdapterCount = mAdapter.getCount();
            if (mRestoredCurItem >= 0)
            {
                mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
                setCurrentItemInternal(mRestoredCurItem, false, true);
                mRestoredCurItem = -1;
                mRestoredAdapterState = null;
                mRestoredClassLoader = null;
            } else
            if (!flag)
            {
                populate();
            } else
            {
                requestLayout();
            }
        }
        if (mAdapterChangeListener != null && pageradapter1 != pageradapter)
        {
            mAdapterChangeListener.onAdapterChanged(pageradapter1, pageradapter);
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

    public void setCurrentItem(int i)
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
        setCurrentItemInternal(i, flag, false);
    }

    public void setCurrentItem(int i, boolean flag)
    {
        mPopulatePending = false;
        setCurrentItemInternal(i, flag, false);
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1)
    {
        setCurrentItemInternal(i, flag, flag1, 0);
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
    {
        boolean flag2;
        flag2 = false;
        if (mAdapter == null || mAdapter.getCount() <= 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!flag1 && mCurItem == i && mItems.size() != 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i >= 0) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        i = mOffscreenPageLimit;
        if (k > mCurItem + i || k < mCurItem - i)
        {
            for (i = 0; i < mItems.size(); i++)
            {
                ((ItemInfo)mItems.get(i)).scrolling = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k = i;
        if (i >= mAdapter.getCount())
        {
            k = mAdapter.getCount() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (mCurItem != k)
        {
            flag1 = true;
        }
        if (mFirstLayout)
        {
            mCurItem = k;
            if (flag1)
            {
                dispatchOnPageSelected(k);
            }
            requestLayout();
            return;
        } else
        {
            populate(k);
            scrollToItem(k, flag, j, flag1);
            return;
        }
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        OnPageChangeListener onpagechangelistener1 = mInternalPageChangeListener;
        mInternalPageChangeListener = onpagechangelistener;
        return onpagechangelistener1;
    }

    public void setOffscreenPageLimit(int i)
    {
        int j = i;
        if (i < 1)
        {
            Log.w("ViewPager", (new StringBuilder()).append("Requested offscreen page limit ").append(i).append(" too small; defaulting to ").append(1).toString());
            j = 1;
        }
        if (j != mOffscreenPageLimit)
        {
            mOffscreenPageLimit = j;
            populate();
        }
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
    {
        mAdapterChangeListener = onadapterchangelistener;
    }

    public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        mOnPageChangeListener = onpagechangelistener;
    }

    public void setPageMargin(int i)
    {
        int j = mPageMargin;
        mPageMargin = i;
        int k = getWidth();
        recomputeScrollPosition(k, k, i, j);
        requestLayout();
    }

    public void setPageMarginDrawable(int i)
    {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
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

    public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
    {
        int i = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (pagetransformer != null)
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
            mPageTransformer = pagetransformer;
            setChildrenDrawingOrderEnabledCompat(flag2);
            if (flag2)
            {
                if (flag)
                {
                    i = 2;
                }
                mDrawingOrder = i;
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

    void smoothScrollTo(int i, int j)
    {
        smoothScrollTo(i, j, 0);
    }

    void smoothScrollTo(int i, int j, int k)
    {
        if (getChildCount() == 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        int l = getScrollX();
        int i1 = getScrollY();
        int j1 = i - l;
        j -= i1;
        if (j1 == 0 && j == 0)
        {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i = getClientWidth();
        int k1 = i / 2;
        float f4 = Math.min(1.0F, ((float)Math.abs(j1) * 1.0F) / (float)i);
        float f = k1;
        float f2 = k1;
        f4 = distanceInfluenceForSnapDuration(f4);
        k = Math.abs(k);
        if (k > 0)
        {
            i = Math.round(1000F * Math.abs((f2 * f4 + f) / (float)k)) * 4;
        } else
        {
            float f1 = i;
            float f3 = mAdapter.getPageWidth(mCurItem);
            i = (int)(((float)Math.abs(j1) / (f1 * f3 + (float)mPageMargin) + 1.0F) * 100F);
        }
        i = Math.min(i, 600);
        mScroller.startScroll(l, i1, j1, j, i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
    }





}
