// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
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
//            KeyEventCompat, ViewConfigurationCompat

public class ViewPager extends ViewGroup
{

    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR = new _cls1();
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
    private static final Interpolator sInterpolator = new _cls2();
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
        mEndScrollRunnable = new _cls3();
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
        int j1 = mAdapter.getCount();
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
                int k = 0;
                for (j++; j <= iteminfo.position && k < mItems.size(); j++)
                {
                    for (iteminfo1 = (ItemInfo)mItems.get(k); j > iteminfo1.position && k < mItems.size() - 1; iteminfo1 = (ItemInfo)mItems.get(k))
                    {
                        k++;
                    }

                    while (j < iteminfo1.position) 
                    {
                        float f4 = mAdapter.getPageWidth(j);
                        j++;
                        f = f4 + f3 + f;
                    }
                    iteminfo1.offset = f;
                    f += iteminfo1.widthFactor + f3;
                }

            } else
            if (j > iteminfo.position)
            {
                int l = mItems.size();
                float f1 = iteminfo1.offset;
                l--;
                for (j--; j >= iteminfo.position && l >= 0; j--)
                {
                    for (iteminfo1 = (ItemInfo)mItems.get(l); j < iteminfo1.position && l > 0; iteminfo1 = (ItemInfo)mItems.get(l))
                    {
                        l--;
                    }

                    while (j > iteminfo1.position) 
                    {
                        float f5 = mAdapter.getPageWidth(j);
                        j--;
                        f1 -= f5 + f3;
                    }
                    f1 -= iteminfo1.widthFactor + f3;
                    iteminfo1.offset = f1;
                }

            }
        }
        int k1 = mItems.size();
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
        if (iteminfo.position == j1 - 1)
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
        for (; j < k1; j++)
        {
            for (iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i++)
            {
                f2 += mAdapter.getPageWidth(i) + f3;
            }

            if (iteminfo.position == j1 - 1)
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
_L18:
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
            break MISSING_BLOCK_LABEL_346;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j = 1;
_L19:
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

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i != 66) goto _L15; else goto _L14
_L14:
        int l;
        j = getChildRectInPagerCoordinates(mTempRect, view).left;
        l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
        if (obj != null && j <= l) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L18
_L4:
label0:
        {
            if (i != 17 && i != 1)
            {
                break label0;
            }
            flag = pageLeft();
        }
          goto _L18
        if (i != 66 && i != 2) goto _L15; else goto _L17
_L17:
        flag = pageRight();
          goto _L18
_L15:
        flag = false;
          goto _L18
_L8:
        obj = view;
          goto _L13
        j = 0;
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
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j;
        int k;
        j = getClientWidth();
        k = getScrollX();
        if (i >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k <= (int)((float)j * mFirstOffset)) goto _L1; else goto _L3
_L3:
        return true;
        if (i <= 0 || k >= (int)((float)j * mLastOffset)) goto _L1; else goto _L4
_L4:
        return true;
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
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int l1 = mAdapter.getCount();
        mExpectedAdapterCount = l1;
        int j1;
        if (mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < l1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = mCurItem;
        k = 0;
        i1 = 0;
        l = i;
        i = j;
        j = k;
        k = i1;
        if (k >= mItems.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ItemInfo)mItems.get(k);
        i1 = mAdapter.getItemPosition(((ItemInfo) (obj)).object);
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_369;
        }
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
            int k1;
            if (mCurItem == ((ItemInfo) (obj)).position)
            {
                j = Math.max(0, Math.min(mCurItem, l1 - 1));
                i = k;
                k = 1;
            } else
            {
                j = i;
                boolean flag = true;
                i = k;
                k = ((flag) ? 1 : 0);
            }
        } else
        {
            if (((ItemInfo) (obj)).position == i1)
            {
                break MISSING_BLOCK_LABEL_369;
            }
            if (((ItemInfo) (obj)).position == mCurItem)
            {
                i = i1;
            }
            obj.position = i1;
            i1 = i;
            k1 = 1;
            l = k;
            i = j;
            j = i1;
            k = k1;
        }
        i1 = k;
        j1 = j;
        k = l + 1;
        j = i;
        i = j1;
        l = i1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_70;
_L1:
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
        return;
        i1 = i;
        k1 = l;
        l = k;
        i = j;
        j = i1;
        k = k1;
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
                i = mLeftEdge.draw(canvas) | false;
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
        if (mPageMargin > 0 && mMarginDrawable != null && mItems.size() > 0 && mAdapter != null)
        {
            int k = getScrollX();
            int l = getWidth();
            float f2 = (float)mPageMargin / (float)l;
            Object obj = (ItemInfo)mItems.get(0);
            float f = ((ItemInfo) (obj)).offset;
            int i1 = mItems.size();
            int i = ((ItemInfo) (obj)).position;
            int j1 = ((ItemInfo)mItems.get(i1 - 1)).position;
            int j = 0;
            do
            {
                if (i >= j1)
                {
                    break;
                }
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
                if (f1 > (float)(k + l))
                {
                    break;
                }
                i++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction() & 0xff;
        if (i != 3 && i != 1) goto _L2; else goto _L1
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
        if (mDecorChildCount <= 0) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        int l1;
        int i2;
        int j2;
        int k2;
        i2 = getScrollX();
        k = getPaddingLeft();
        l = getPaddingRight();
        j2 = getWidth();
        k2 = getChildCount();
        l1 = 0;
_L8:
        if (l1 >= k2) goto _L2; else goto _L3
_L3:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(l1);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.isDecor)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        layoutparams.gravity & 7;
        JVM INSTR tableswitch 1 5: default 116
    //                   1 219
    //                   2 116
    //                   3 190
    //                   4 116
    //                   5 251;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int i1;
        i1 = k;
        int j1 = l;
        l = k;
        k = j1;
_L9:
        int k1;
        int l2 = (i1 + i2) - view.getLeft();
        i1 = k;
        k1 = l;
        if (l2 != 0)
        {
            view.offsetLeftAndRight(l2);
            k1 = l;
            i1 = k;
        }
_L10:
        l1++;
        k = k1;
        l = i1;
          goto _L8
_L6:
        i1 = view.getWidth();
        k1 = i1 + k;
        i1 = k;
        k = l;
        l = k1;
          goto _L9
_L5:
        i1 = Math.max((j2 - view.getMeasuredWidth()) / 2, k);
        k1 = k;
        k = l;
        l = k1;
          goto _L9
_L7:
        i1 = j2 - l - view.getMeasuredWidth();
        int i3 = view.getMeasuredWidth();
        k1 = k;
        k = l + i3;
        l = k1;
          goto _L9
_L2:
        dispatchOnPageScrolled(i, f, j);
        if (mPageTransformer != null)
        {
            j = getScrollX();
            k = getChildCount();
            for (i = 0; i < k; i++)
            {
                View view1 = getChildAt(i);
                if (!((LayoutParams)view1.getLayoutParams()).isDecor)
                {
                    f = (float)(view1.getLeft() - j) / (float)getClientWidth();
                    mPageTransformer.transformPage(view1, f);
                }
            }

        }
        mCalledSuper = true;
        return;
        i1 = l;
        k1 = k;
          goto _L10
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
        int i;
        int j;
        j = 0;
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
        i = j;
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
        i = j;
_L10:
        if (i != 0)
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
        i = j;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!mIsBeingDragged)
        {
            i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
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
        i = j;
        if (mIsBeingDragged)
        {
            i = performDrag(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i = j;
        if (mIsBeingDragged)
        {
            Object obj = mVelocityTracker;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
            i = (int)VelocityTrackerCompat.getXVelocity(((VelocityTracker) (obj)), mActivePointerId);
            mPopulatePending = true;
            j = getClientWidth();
            int k = getScrollX();
            obj = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId)) - mInitialMotionX)), true, true, i);
            mActivePointerId = -1;
            endDrag();
            boolean flag = mLeftEdge.onRelease();
            i = mRightEdge.onRelease() | flag;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = j;
        if (mIsBeingDragged)
        {
            scrollToItem(mCurItem, true, 0, false);
            mActivePointerId = -1;
            endDrag();
            boolean flag1 = mLeftEdge.onRelease();
            i = mRightEdge.onRelease() | flag1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i = MotionEventCompat.getActionIndex(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, i);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        i = j;
        continue; /* Loop/switch isn't completed */
_L8:
        onSecondaryPointerUp(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        i = j;
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
        float f4;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j;
        byte byte1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
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
        j2 = Math.max(0, mCurItem - i);
        l1 = mAdapter.getCount();
        i2 = Math.min(l1 - 1, i + mCurItem);
        if (l1 != mExpectedAdapterCount)
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
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(mExpectedAdapterCount).append(", found: ").append(l1).append(" Pager id: ").append(s).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(mAdapter.getClass()).toString());
        }
        i = 0;
_L14:
        if (i >= mItems.size())
        {
            break MISSING_BLOCK_LABEL_1270;
        }
        obj = (ItemInfo)mItems.get(i);
        if (((ItemInfo) (obj)).position < mCurItem) goto _L6; else goto _L5
_L5:
        if (((ItemInfo) (obj)).position != mCurItem)
        {
            break MISSING_BLOCK_LABEL_1270;
        }
_L21:
        if (obj == null && l1 > 0)
        {
            obj2 = addNewItem(mCurItem, i);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        k1 = i - 1;
        float f2;
        if (k1 >= 0)
        {
            obj = (ItemInfo)mItems.get(k1);
        } else
        {
            obj = null;
        }
        k2 = getClientWidth();
        if (k2 <= 0)
        {
            f2 = 0.0F;
        } else
        {
            f2 = (2.0F - ((ItemInfo) (obj2)).widthFactor) + (float)getPaddingLeft() / (float)k2;
        }
        j = mCurItem;
        f4 = 0.0F;
        j1 = j - 1;
        i1 = i;
        obj3 = obj;
        if (j1 < 0) goto _L10; else goto _L9
_L9:
        if (f4 < f2 || j1 >= j2) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        i = k1;
        f = f4;
        j = i1;
        if (j1 == ((ItemInfo) (obj3)).position)
        {
            obj = obj3;
            i = k1;
            f = f4;
            j = i1;
            if (!((ItemInfo) (obj3)).scrolling)
            {
                mItems.remove(k1);
                mAdapter.destroyItem(this, j1, ((ItemInfo) (obj3)).object);
                i = k1 - 1;
                j = i1 - 1;
                if (i >= 0)
                {
                    obj = (ItemInfo)mItems.get(i);
                    f = f4;
                } else
                {
                    obj = null;
                    f = f4;
                }
            }
        }
_L15:
        j1--;
        obj3 = obj;
        k1 = i;
        f4 = f;
        i1 = j;
        break MISSING_BLOCK_LABEL_376;
_L6:
        i++;
          goto _L14
_L12:
        if (obj3 != null && j1 == ((ItemInfo) (obj3)).position)
        {
            f = f4 + ((ItemInfo) (obj3)).widthFactor;
            i = k1 - 1;
            if (i >= 0)
            {
                obj = (ItemInfo)mItems.get(i);
                j = i1;
            } else
            {
                obj = null;
                j = i1;
            }
        } else
        {
            f = f4 + addNewItem(j1, k1 + 1).widthFactor;
            j = i1 + 1;
            if (k1 >= 0)
            {
                obj = (ItemInfo)mItems.get(k1);
                i = k1;
            } else
            {
                obj = null;
                i = k1;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f1 = ((ItemInfo) (obj2)).widthFactor;
            i = i1 + 1;
            if (f1 >= 2.0F)
            {
                break label0;
            }
            float f3;
            int k;
            if (i < mItems.size())
            {
                obj = (ItemInfo)mItems.get(i);
            } else
            {
                obj = null;
            }
            if (k2 <= 0)
            {
                f3 = 0.0F;
            } else
            {
                f3 = (float)getPaddingRight() / (float)k2 + 2.0F;
            }
            k = mCurItem;
            k++;
            do
            {
                if (k >= l1)
                {
                    break label0;
                }
                if (f1 >= f3 && k > i2)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (k == ((ItemInfo) (obj)).position && !((ItemInfo) (obj)).scrolling)
                    {
                        mItems.remove(i);
                        mAdapter.destroyItem(this, k, ((ItemInfo) (obj)).object);
                        if (i < mItems.size())
                        {
                            obj = (ItemInfo)mItems.get(i);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k == ((ItemInfo) (obj)).position)
                {
                    float f5 = ((ItemInfo) (obj)).widthFactor;
                    i++;
                    if (i < mItems.size())
                    {
                        obj = (ItemInfo)mItems.get(i);
                    } else
                    {
                        obj = null;
                    }
                    f1 += f5;
                } else
                {
                    obj = addNewItem(k, i);
                    i++;
                    float f6 = ((ItemInfo) (obj)).widthFactor;
                    if (i < mItems.size())
                    {
                        obj = (ItemInfo)mItems.get(i);
                    } else
                    {
                        obj = null;
                    }
                    f1 += f6;
                }
                k++;
            } while (true);
        }
        calculatePageOffsets(((ItemInfo) (obj2)), i1, ((ItemInfo) (obj1)));
_L8:
        obj1 = mAdapter;
        i = mCurItem;
        int l;
        if (obj2 != null)
        {
            obj = ((ItemInfo) (obj2)).object;
        } else
        {
            obj = null;
        }
        ((PagerAdapter) (obj1)).setPrimaryItem(this, i, obj);
        mAdapter.finishUpdate(this);
        l = getChildCount();
        for (i = 0; i < l; i++)
        {
            obj1 = getChildAt(i);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.childIndex = i;
            if (((LayoutParams) (obj)).isDecor || ((LayoutParams) (obj)).widthFactor != 0.0F)
            {
                continue;
            }
            obj1 = infoForChild(((View) (obj1)));
            if (obj1 != null)
            {
                obj.widthFactor = ((ItemInfo) (obj1)).widthFactor;
                obj.position = ((ItemInfo) (obj1)).position;
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
        if (obj != null && ((ItemInfo) (obj)).position == mCurItem) goto _L4; else goto _L17
_L17:
        i = 0;
_L20:
        if (i >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i);
        obj1 = infoForChild(((View) (obj)));
        if (obj1 != null && ((ItemInfo) (obj1)).position == mCurItem && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i++;
          goto _L20
        obj = null;
          goto _L21
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
                mObserver = new PagerObserver(null);
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
        if (i <= 0)
        {
            Log.w("ViewPager", (new StringBuilder("Requested offscreen page limit ")).append(i).append(" too small; defaulting to 1").toString());
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






    private class ItemInfo
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


    private class _cls3
        implements Runnable
    {

        final ViewPager this$0;

        public void run()
        {
            setScrollState(0);
            populate();
        }

        _cls3()
        {
            this$0 = ViewPager.this;
            super();
        }
    }


    private class OnPageChangeListener
    {

        public abstract void onPageScrollStateChanged(int i);

        public abstract void onPageScrolled(int i, float f, int j);

        public abstract void onPageSelected(int i);
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
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


    private class Decor
    {
    }


    private class MyAccessibilityDelegate extends AccessibilityDelegateCompat
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


    private class PageTransformer
    {

        public abstract void transformPage(View view, float f);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new _cls1());
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public String toString()
        {
            return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(position).append("}").toString();
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

        class _cls1
            implements ParcelableCompatCreatorCallbacks
        {

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return new SavedState(parcel, classloader);
            }

            public final volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return createFromParcel(parcel, classloader);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

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

        PagerObserver(_cls1 _pcls1)
        {
            this();
        }
    }


    private class OnAdapterChangeListener
    {

        public abstract void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1);
    }


    private class _cls1
        implements Comparator
    {

        public final int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
        {
            return iteminfo.position - iteminfo1.position;
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((ItemInfo)obj, (ItemInfo)obj1);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Interpolator
    {

        public final float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

        _cls2()
        {
        }
    }


    private class ViewPositionComparator
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

}
