// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.wearable.view:
//            SwipeTouchDelegate, GridPagerAdapter, BackgroundParallaxer, BackgroundCrossfader

public class GridViewPager extends ViewGroup
    implements SwipeTouchDelegate
{
    private class ContentScrollTask
        implements Runnable
    {

        final GridViewPager this$0;

        public void run()
        {
            boolean flag = mContentScroller.computeScrollOffset();
            mCenterView.setTranslationX(-mContentScroller.getCurrX());
            mCenterView.setTranslationY(-mContentScroller.getCurrY());
            if (flag)
            {
                postOnAnimation(this);
            }
        }

        private ContentScrollTask()
        {
            this$0 = GridViewPager.this;
            super();
        }

    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean contentView;
        public boolean current;
        public int gravity;
        public boolean needsMeasure;
        public int scrollLeft;
        public int scrollTop;
        public boolean tall;
        public boolean wide;

        public LayoutParams()
        {
            super(-1, -1);
            needsMeasure = true;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = context.obtainStyledAttributes(attributeset, GridViewPager.LAYOUT_ATTRS);
            gravity = context.getInteger(0, 48);
            context.recycle();
        }
    }

    private class PagerObserver extends DataSetObserver
    {

        final GridViewPager this$0;

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
            this$0 = GridViewPager.this;
            super();
        }

    }

    static final class RelativePosition extends Enum
    {

        private static final RelativePosition $VALUES[];
        public static final RelativePosition ABOVE;
        public static final RelativePosition BELOW;
        public static final RelativePosition CENTER;
        public static final RelativePosition LEFT;
        public static final RelativePosition RIGHT;
        public final int x;
        public final int y;

        public static RelativePosition get(int i, int j)
        {
            if (i < -1 || i > 1 || j < -1 || j > 1)
            {
                throw new IllegalArgumentException("x and y must be in the range of [-1, 1]");
            }
            if (i != 0 && j != 0)
            {
                throw new IllegalArgumentException("one of x or y must be equal to 0");
            }
            if (j == 0)
            {
                return values()[i + 1];
            }
            if (j == -1)
            {
                return ABOVE;
            } else
            {
                return BELOW;
            }
        }

        public static RelativePosition valueOf(String s)
        {
            return (RelativePosition)Enum.valueOf(android/support/wearable/view/GridViewPager$RelativePosition, s);
        }

        public static RelativePosition[] values()
        {
            return (RelativePosition[])$VALUES.clone();
        }

        static 
        {
            LEFT = new RelativePosition("LEFT", 0, -1, 0);
            CENTER = new RelativePosition("CENTER", 1, 0, 0);
            RIGHT = new RelativePosition("RIGHT", 2, 1, 0);
            ABOVE = new RelativePosition("ABOVE", 3, 0, -1);
            BELOW = new RelativePosition("BELOW", 4, 0, 1);
            $VALUES = (new RelativePosition[] {
                LEFT, CENTER, RIGHT, ABOVE, BELOW
            });
        }

        private RelativePosition(String s, int i, int j, int k)
        {
            super(s, i);
            x = j;
            y = k;
        }
    }

    public static class SavedState extends android.view.View.BaseSavedState
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
        int currentX;
        int currentY;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(currentX);
            parcel.writeInt(currentY);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            currentX = parcel.readInt();
            currentY = parcel.readInt();
        }


        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private class ViewScrollTask
        implements Runnable
    {

        final GridViewPager this$0;

        public void run()
        {
            boolean flag = mPageScroller.computeScrollOffset();
            internalScrollTo(mPageScroller.getCurrX(), mPageScroller.getCurrY());
            updateScrollInfo(false);
            updateBackground();
            if (flag)
            {
                postOnAnimation(this);
                return;
            } else
            {
                onScrollAnimationEnd();
                return;
            }
        }

        private ViewScrollTask()
        {
            this$0 = GridViewPager.this;
            super();
        }

    }


    private static final boolean DEBUG_LOGGING = false;
    private static final int GESTURE_NONE = 0;
    private static final int GESTURE_SLIDE_HORIZONTAL = 2;
    private static final int GESTURE_SLIDE_VERTICAL = 1;
    private static final int LAYOUT_ATTRS[] = {
        0x10100b3
    };
    private static final int NO_POINTER = -1;
    private static final int SLIDE_ANIMATION_DURATION_NORMAL = 300;
    private static final String TAG = "GridViewPager";
    private int mActivePointerId;
    private GridPagerAdapter mAdapter;
    private BackgroundCrossfader mBackgroundContainer;
    private View mCenterView;
    private final ContentScrollTask mContentScrollTask;
    private final OverScroller mContentScroller;
    private Point mCurrent;
    private int mCurrentColumnCount;
    private int mCurrentGesture;
    private Map mFragments;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private final int mMaxFlingVelocityPxSecs;
    private final int mMinFlingVelocityPxSecs;
    private Point mNewCenter;
    private PagerObserver mObserver;
    private final ViewScrollTask mPageScrollTask;
    private final OverScroller mPageScroller;
    private boolean mPopulateNeeded;
    private boolean mPositionRestored;
    private float mPrevTouchX;
    private float mPrevTouchY;
    private Rect mRect1;
    private Rect mRect2;
    private int mRowCount;
    private boolean mScrollAnimationInterrupted;
    private boolean mScrollAnimationInterruptible;
    private RelativePosition mScrollDirection;
    private boolean mScrollInterruptible;
    private float mScrollProgress;
    private final int mTouchSlop;
    private boolean mUpdatePrimary;
    private VelocityTracker mVelocityTracker;
    private Map mWarpPoints;

    public GridViewPager(Context context)
    {
        this(context, null, 0);
    }

    public GridViewPager(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GridViewPager(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mActivePointerId = -1;
        mCurrentGesture = 0;
        mVelocityTracker = null;
        attributeset = ViewConfiguration.get(getContext());
        mTouchSlop = attributeset.getScaledTouchSlop();
        mMinFlingVelocityPxSecs = attributeset.getScaledMinimumFlingVelocity();
        mMaxFlingVelocityPxSecs = attributeset.getScaledMaximumFlingVelocity();
        setupViews(context);
        mCurrent = new Point(0, 0);
        mNewCenter = new Point(0, 0);
        mFragments = new EnumMap(android/support/wearable/view/GridViewPager$RelativePosition);
        mWarpPoints = new HashMap(2);
        mPageScroller = new OverScroller(context);
        mContentScroller = new OverScroller(context);
        mPageScrollTask = new ViewScrollTask();
        mContentScrollTask = new ContentScrollTask();
        mObserver = new PagerObserver();
        mRect1 = new Rect();
        mRect2 = new Rect();
        mScrollAnimationInterruptible = true;
        mScrollDirection = RelativePosition.CENTER;
        setClipToPadding(false);
        setFocusableInTouchMode(true);
        setFocusable(true);
    }

    private boolean canContentScrollHorizontally(int i)
    {
        boolean flag = true;
        if (mCenterView != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mCenterView.getX() + (float)mCenterView.getWidth() > (float)((getScrollX() + getWidth()) - getPaddingRight())) goto _L4; else goto _L3
_L3:
        return false;
        if (mCenterView.getX() < (float)(getScrollX() + getPaddingLeft())) goto _L4; else goto _L5
_L5:
        return false;
    }

    private boolean canContentScrollVertically(int i)
    {
        boolean flag = true;
        if (mCenterView != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mCenterView.getY() + (float)mCenterView.getHeight() > (float)((getScrollY() + getHeight()) - getPaddingBottom())) goto _L4; else goto _L3
_L3:
        return false;
        if (mCenterView.getY() < (float)(getScrollY() + getPaddingTop())) goto _L4; else goto _L5
_L5:
        return false;
    }

    private static int clamp(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    private void dataSetChanged()
    {
        mAdapter.startUpdate(this);
        Fragment fragment;
        for (Iterator iterator = mFragments.values().iterator(); iterator.hasNext(); mAdapter.destroyItem(this, fragment))
        {
            fragment = (Fragment)iterator.next();
        }

        mAdapter.finishUpdate(this);
        mWarpPoints.clear();
        mFragments.clear();
        mRowCount = mAdapter.getRowCount();
        if (mRowCount > 0)
        {
            mCurrentColumnCount = mAdapter.getColumnCount(mCurrent.y);
            if (!pointInRange(mCurrent))
            {
                Log.w("GridViewPager", (new StringBuilder()).append("dataSetChanged(): position ").append(mCurrent.y).append(", ").append(mCurrent.x).append(" is no longer valid. Resetting to 0,0").toString());
                mCurrent.set(0, 0);
                mPositionRestored = true;
                mUpdatePrimary = true;
            }
        }
        if (isLaidOut())
        {
            populate();
            updateBackground();
            mAdapter.setPrimaryItem(this, mCurrent.x, mCurrent.y);
            return;
        } else
        {
            mPopulateNeeded = true;
            requestLayout();
            return;
        }
    }

    private static int distance(Point point, Point point1)
    {
        return Math.abs(point1.x - point.x) + Math.abs(point1.y - point.y);
    }

    private Drawable getBackground(RelativePosition relativeposition)
    {
        relativeposition = (Fragment)mFragments.get(relativeposition);
        if (relativeposition instanceof BackgroundParallaxer)
        {
            return ((BackgroundParallaxer)relativeposition).getBackground();
        } else
        {
            return null;
        }
    }

    private int getScrollPositionXCenterOffset()
    {
        int i = getWidth();
        return clamp(Math.round((float)getScrollX() / (float)i), 0, mCurrentColumnCount - 1) - mCurrent.x;
    }

    private int getScrollPositionYCenterOffset()
    {
        int i = getHeight();
        return clamp(Math.round((float)getScrollY() / (float)i), 0, mRowCount - 1) - mCurrent.y;
    }

    private void haltScrollAnimation()
    {
        if (!mPageScroller.isFinished() && mScrollAnimationInterruptible)
        {
            mScrollAnimationInterrupted = true;
            mPageScroller.forceFinished(true);
        }
    }

    private boolean handlePointerDown(MotionEvent motionevent)
    {
        if (mActivePointerId == -1)
        {
            mActivePointerId = motionevent.getPointerId(0);
            mInitialTouchX = motionevent.getX();
            mInitialTouchY = motionevent.getY();
            mPrevTouchX = mInitialTouchX;
            mPrevTouchY = mInitialTouchY;
            mVelocityTracker = VelocityTracker.obtain();
            mVelocityTracker.addMovement(motionevent);
            removeCallbacks(mContentScrollTask);
        }
        return false;
    }

    private boolean handlePointerMove(MotionEvent motionevent)
    {
        float f;
        float f1;
        float f2;
        float f3;
        boolean flag;
        flag = true;
        int i = motionevent.findPointerIndex(mActivePointerId);
        if (i == -1)
        {
            return false;
        }
        f = motionevent.getY(i);
        f1 = motionevent.getX(i);
        f2 = f1 - mInitialTouchX;
        f3 = f - mInitialTouchY;
        mVelocityTracker.addMovement(motionevent);
        mCurrentGesture;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 134
    //                   1 108
    //                   2 121;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_134;
_L5:
        mPrevTouchX = f1;
        mPrevTouchY = f;
        if (mCurrentGesture == 0)
        {
            flag = false;
        }
        return flag;
_L3:
        onGestureProgress(f - mPrevTouchY);
          goto _L5
_L4:
        onGestureProgress(f1 - mPrevTouchX);
          goto _L5
        if (mPageScroller.isFinished() || mScrollInterruptible)
        {
            if (Math.abs(f3) > (float)mTouchSlop && (mCurrent.y != 0 || f3 <= 0.0F))
            {
                mCurrentGesture = 1;
                onGestureStart();
                onGestureProgress(f - mPrevTouchY);
            } else
            if (Math.abs(f2) > (float)mTouchSlop && (mCurrent.x != 0 || f2 <= 0.0F))
            {
                mCurrentGesture = 2;
                onGestureStart();
                onGestureProgress(f1 - mPrevTouchX);
            }
        }
          goto _L5
    }

    private boolean handlePointerUp(MotionEvent motionevent)
    {
        boolean flag;
        flag = false;
        if (mActivePointerId == -1)
        {
            return false;
        }
        if (mCurrentGesture == 0) goto _L2; else goto _L1
_L1:
        mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocityPxSecs);
        if (mCurrentGesture != 2) goto _L4; else goto _L3
_L3:
        onGestureEnd(mVelocityTracker.getXVelocity(mActivePointerId));
_L6:
        flag = true;
_L2:
        mActivePointerId = -1;
        mCurrentGesture = 0;
        mVelocityTracker.recycle();
        mVelocityTracker = null;
        return flag;
_L4:
        if (mCurrentGesture == 1)
        {
            onGestureEnd(mVelocityTracker.getYVelocity(mActivePointerId));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean inRange(int i, int j, int k)
    {
        return i >= j && i <= k;
    }

    private void internalScrollTo(int i, int j)
    {
        super.scrollTo(i, j);
        mBackgroundContainer.setTranslationX(i);
        mBackgroundContainer.setTranslationY(j);
    }

    private void moveTowards(RelativePosition relativeposition)
    {
        if (inRange(mCurrent.x + relativeposition.x, 0, mCurrentColumnCount - 1) && inRange(mCurrent.y + relativeposition.y, 0, mRowCount - 1))
        {
            setPosition(mCurrent.x + relativeposition.x, mCurrent.y + relativeposition.y);
        }
    }

    private void onGestureEnd(float f)
    {
        int k = -Math.round(f);
        mCurrentGesture;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 180
    //                   2 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        float f1;
        float f2;
        int i;
        boolean flag;
        i = getScrollPositionXCenterOffset();
        f1 = f;
        f2 = 0.0F;
        flag = canContentScrollHorizontally(k);
_L7:
        int i1;
        if (f <= (float)(-mMinFlingVelocityPxSecs) || f >= (float)mMinFlingVelocityPxSecs)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i;
        if (k != 0)
        {
            i1 = (int)((float)i + Math.signum(-f));
        }
        i1 = clamp(i1, -1, 1);
        i = 0;
        k = 0;
        mCurrentGesture;
        JVM INSTR tableswitch 1 2: default 144
    //                   1 239
    //                   2 207;
           goto _L4 _L5 _L6
_L4:
        mNewCenter.set(mCurrent.x + i, mCurrent.y + k);
        scrollPageBy(i, k);
        return;
_L2:
        i = getScrollPositionYCenterOffset();
        f1 = 0.0F;
        f2 = f;
        flag = canContentScrollVertically(k);
          goto _L7
_L6:
        i = clamp(i1, -mCurrent.x, mCurrentColumnCount - (mCurrent.x + 1));
          goto _L4
_L5:
        k = clamp(i1, -mCurrent.y, mRowCount - (mCurrent.y + 1));
          goto _L4
        if (k == 0) goto _L1; else goto _L8
_L8:
        int j = (int)(-mCenterView.getTranslationX());
        int l = (int)(-mCenterView.getTranslationY());
        mContentScroller.fling(j, l, (int)(-f1), (int)(-f2), 0, (mCenterView.getWidth() - getWidth()) + (getPaddingLeft() + getPaddingRight()), 0, (mCenterView.getHeight() - getHeight()) + (getPaddingTop() + getPaddingBottom()));
        removeCallbacks(mContentScrollTask);
        postOnAnimation(mContentScrollTask);
        return;
    }

    private void onGestureProgress(float f)
    {
        mCurrentGesture;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 267
    //                   2 29;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        int i;
        int j;
        int l;
        i = getWidth();
        l = i * (mCurrentColumnCount - 1);
        j = getScrollX();
_L8:
        int j1 = -Math.round(f);
        int k;
        int i1;
        boolean flag;
        if (j1 < 0)
        {
            k = -(j % i);
        } else
        {
            k = (i - j % i) % i;
        }
        flag = false;
        i = j1;
        i1 = j;
        if (Math.abs(k) <= Math.abs(j1))
        {
            i1 = j + k;
            i = j1 - k;
            flag = true;
        }
        k = i;
        if (flag)
        {
            k = i;
            if (i != 0)
            {
                k = i;
                if (mCenterView != null)
                {
                    LayoutParams layoutparams = (LayoutParams)mCenterView.getLayoutParams();
                    j = i;
                    if (mCurrentGesture == 2)
                    {
                        j = i;
                        if (layoutparams.wide)
                        {
                            j = i - scrollContentHorizontallyBy(i);
                        }
                    }
                    k = j;
                    if (mCurrentGesture == 1)
                    {
                        k = j;
                        if (layoutparams.tall)
                        {
                            k = j - scrollContentVerticallyBy(j);
                        }
                    }
                }
            }
        }
        if (k == 0 && !flag) goto _L1; else goto _L4
_L4:
        i = clamp(i1 + k, 0, l);
        mCurrentGesture;
        JVM INSTR tableswitch 1 2: default 256
    //                   1 316
    //                   2 304;
           goto _L5 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_316;
_L9:
        updateScrollInfo(flag);
        updateBackground();
        return;
_L2:
        i = getHeight();
        l = i * (mRowCount - 1);
        j = getScrollY();
          goto _L8
_L7:
        internalScrollTo(i, getScrollY());
          goto _L9
        internalScrollTo(getScrollX(), i);
          goto _L9
    }

    private void onGestureStart()
    {
        cancelLongPress();
        requestDisallowInterceptTouchEvent(true);
        haltScrollAnimation();
        mContentScroller.abortAnimation();
        removeCallbacks(mContentScrollTask);
    }

    private boolean pointInRange(int i, int j)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (inRange(j, 0, mRowCount - 1))
        {
            flag = flag1;
            if (inRange(i, 0, mAdapter.getColumnCount(j) - 1))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean pointInRange(Point point)
    {
        return pointInRange(point.x, point.y);
    }

    private void populate()
    {
        populate(RelativePosition.values());
    }

    private transient void populate(RelativePosition arelativeposition[])
    {
        if (mAdapter != null)
        {
            mAdapter.startUpdate(this);
            Object obj = new HashMap();
            HashSet hashset = new HashSet();
            int j = arelativeposition.length;
            int i = 0;
            while (i < j) 
            {
                Object obj2 = arelativeposition[i];
                Object obj3 = new Point(mCurrent.x + ((RelativePosition) (obj2)).x, mCurrent.y + ((RelativePosition) (obj2)).y);
                Point point = (Point)mWarpPoints.get(obj3);
                if (point != null)
                {
                    ((Point) (obj3)).set(point.x, point.y);
                } else
                if (((RelativePosition) (obj2)).y != 0 && inRange(((Point) (obj3)).y, 0, mRowCount - 1))
                {
                    obj3.x = mAdapter.getCurrentColumnForRow(((Point) (obj3)).y, mCurrent.x);
                    int k = mAdapter.getColumnCount(((Point) (obj3)).y) - 1;
                    if (!inRange(((Point) (obj3)).x, 0, k))
                    {
                        Log.w("GridViewPager", (new StringBuilder()).append("getFocusedPosition returned invalid position for row ").append(((Point) (obj3)).y).toString());
                        obj3.x = clamp(((Point) (obj3)).x, 0, k);
                    }
                    if (((Point) (obj3)).x != mCurrent.x)
                    {
                        mWarpPoints.put(new Point(mCurrent.x, ((Point) (obj3)).y), obj3);
                    }
                }
                if (!pointInRange(((Point) (obj3))))
                {
                    obj2 = (Fragment)mFragments.remove(obj2);
                    if (obj2 != null && !hashset.contains(((Fragment) (obj2)).getTag()))
                    {
                        ((Map) (obj)).put(((Fragment) (obj2)).getTag(), obj2);
                    }
                } else
                {
                    obj3 = mAdapter.instantiateItem(this, ((Point) (obj3)).y, ((Point) (obj3)).x);
                    ((Map) (obj)).remove(((Fragment) (obj3)).getTag());
                    hashset.add(((Fragment) (obj3)).getTag());
                    Fragment fragment = (Fragment)mFragments.put(obj2, obj3);
                    Iterator iterator = mFragments.entrySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                        if (!((RelativePosition)entry.getKey()).equals(obj2) && ((Fragment)entry.getValue()).getTag().equals(((Fragment) (obj3)).getTag()))
                        {
                            iterator.remove();
                        }
                    } while (true);
                    if (fragment != null && fragment != obj3 && !hashset.contains(fragment.getTag()))
                    {
                        ((Map) (obj)).put(fragment.getTag(), fragment);
                    }
                }
                i++;
            }
            for (arelativeposition = ((Map) (obj)).values().iterator(); arelativeposition.hasNext(); mAdapter.destroyItem(this, ((Fragment) (obj))))
            {
                obj = (Fragment)arelativeposition.next();
            }

            mAdapter.finishUpdate(this);
            arelativeposition = mFragments.entrySet().iterator();
            do
            {
                if (!arelativeposition.hasNext())
                {
                    break;
                }
                Object obj1 = (java.util.Map.Entry)arelativeposition.next();
                RelativePosition relativeposition = (RelativePosition)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (Fragment)((java.util.Map.Entry) (obj1)).getValue();
                if (((Fragment) (obj1)).getView() != null)
                {
                    obj1 = (LayoutParams)((Fragment) (obj1)).getView().getLayoutParams();
                    obj1.contentView = true;
                    boolean flag;
                    if (relativeposition == RelativePosition.CENTER)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj1.current = flag;
                }
            } while (true);
            if (!isInLayout())
            {
                requestLayout();
                return;
            }
        }
    }

    private int scrollContentHorizontallyBy(int i)
    {
        int j = (int)(-mCenterView.getTranslationX());
        int k = mCenterView.getWidth();
        int l = getWidth();
        int i1 = getPaddingLeft();
        int j1 = getPaddingRight();
        i = clamp(i, -j, ((k - l) + (i1 + j1)) - j);
        mCenterView.setTranslationX(-(j + i));
        return i;
    }

    private int scrollContentVerticallyBy(int i)
    {
        int j = (int)(-mCenterView.getTranslationY());
        int k = mCenterView.getHeight();
        int l = getHeight();
        int i1 = getPaddingTop();
        int j1 = getPaddingBottom();
        i = clamp(i, -j, ((k - l) + (i1 + j1)) - j);
        mCenterView.setTranslationY(-(j + i));
        return i;
    }

    private void setPosition(int i, int j)
    {
        int k = i - mCurrent.x;
        int l = j - mCurrent.y;
        if (k == 0 && l == 0)
        {
            return;
        }
        Object obj = new Point(i, j);
        if (distance(mCurrent, ((Point) (obj))) == 1)
        {
            mNewCenter = ((Point) (obj));
            mScrollDirection = RelativePosition.get(k, l);
            scrollPageBy(k, l);
            mScrollAnimationInterruptible = true;
            return;
        }
        Point point;
        Point point1;
        if (l == 0)
        {
            obj = RelativePosition.get(clamp(k, -1, 1), 0);
        } else
        {
            obj = RelativePosition.get(0, clamp(l, -1, 1));
        }
        point = new Point(mCurrent.x + ((RelativePosition) (obj)).x, mCurrent.y + ((RelativePosition) (obj)).y);
        point1 = new Point(i, j);
        mNewCenter = point;
        mWarpPoints.put(point, point1);
        populate(new RelativePosition[] {
            obj
        });
        mScrollAnimationInterruptible = false;
        scrollPageBy(((RelativePosition) (obj)).x, ((RelativePosition) (obj)).y);
    }

    private void setupViews(Context context)
    {
        mBackgroundContainer = new BackgroundCrossfader(context);
        addView(mBackgroundContainer);
    }

    private void skipScrollAnimation()
    {
        if (!mPageScroller.isFinished() && mScrollAnimationInterruptible)
        {
            removeCallbacks(mPageScrollTask);
            mPageScroller.abortAnimation();
            internalScrollTo(mPageScroller.getFinalX(), mPageScroller.getFinalY());
            updateBackground();
            onScrollAnimationEnd();
        }
    }

    private void updateBackground()
    {
        float f;
        float f1;
        float f2;
        float f3;
        Drawable drawable1 = getBackground(RelativePosition.CENTER);
        static class _cls2
        {

            static final int $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[];

            static 
            {
                $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition = new int[RelativePosition.values().length];
                try
                {
                    $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[RelativePosition.ABOVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[RelativePosition.BELOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[RelativePosition.LEFT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[RelativePosition.RIGHT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$support$wearable$view$GridViewPager$RelativePosition[RelativePosition.CENTER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Drawable drawable;
        if (mScrollDirection != RelativePosition.CENTER)
        {
            drawable = getBackground(mScrollDirection);
        } else
        {
            drawable = null;
        }
        f = 0.0F;
        f1 = 0.0F;
        f2 = 0.0F;
        f3 = 0.0F;
        _cls2..SwitchMap.android.support.wearable.view.GridViewPager.RelativePosition[mScrollDirection.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 128
    //                   2 128
    //                   3 164
    //                   4 164;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        mBackgroundContainer.setProgress(mScrollProgress);
        mBackgroundContainer.setBackgrounds(drawable, drawable1);
        mBackgroundContainer.setBackgroundsPositionX(f, f2);
        mBackgroundContainer.setBackgroundsPositionY(f1, f3);
        return;
_L2:
        f1 = (1.0F - mScrollProgress) * (float)(0 - mScrollDirection.y);
        f3 = mScrollProgress * (float)mScrollDirection.y;
        continue; /* Loop/switch isn't completed */
_L3:
        f = (1.0F - mScrollProgress) * (float)(0 - mScrollDirection.x);
        f2 = mScrollProgress * (float)mScrollDirection.x;
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void updateScrollInfo(boolean flag)
    {
        if (mCurrentGesture == 2 || mScrollDirection.x != 0)
        {
            int i = getWidth();
            int k = getScrollX() - mCurrent.x * i;
            mScrollProgress = (float)Math.abs(k) / (float)i;
            if (flag)
            {
                mScrollDirection = RelativePosition.get(Integer.signum(k), 0);
            }
        } else
        if (mCurrentGesture == 1 || mScrollDirection.y != 0)
        {
            int j = getHeight();
            int l = getScrollY() - mCurrent.y * j;
            mScrollProgress = (float)Math.abs(l) / (float)j;
            if (flag)
            {
                mScrollDirection = RelativePosition.get(0, Integer.signum(l));
                return;
            }
        } else
        {
            mScrollDirection = RelativePosition.CENTER;
            mScrollProgress = 0.0F;
            return;
        }
    }

    public boolean canScrollHorizontally(int i)
    {
        boolean flag = false;
        int j = getScrollX();
        int k = mCurrentColumnCount - 1;
        if (i > 0)
        {
            if (mCurrent.x < k || j < getWidth() * k)
            {
                flag = true;
            }
        } else
        if (mCurrent.x > 0 || j > 0)
        {
            return true;
        }
        return flag;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        if (!((LayoutParams)view.getLayoutParams()).contentView)
        {
            return super.drawChild(canvas, view, l);
        } else
        {
            int i = canvas.getSaveCount();
            canvas.save();
            int k = view.getLeft();
            int j = view.getTop();
            j -= j % getHeight();
            k -= k % getWidth();
            int i1 = getScrollX();
            int j1 = getScrollY();
            canvas.clipRect(i1, j1, getWidth() + i1, getHeight() + j1);
            canvas.clipRect(k, j, getWidth() + k, getHeight() + j);
            boolean flag = super.drawChild(canvas, view, l);
            canvas.restoreToCount(i);
            return flag;
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

    public GridPagerAdapter getAdapter()
    {
        return mAdapter;
    }

    public int getColumn()
    {
        return mCurrent.y;
    }

    public int getRow()
    {
        return mCurrent.x;
    }

    public boolean isDismissHandler()
    {
        return canScrollHorizontally(-1);
    }

    protected void measureChild(View view, int i, int j)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int k = getPaddingLeft();
        int l = getPaddingRight();
        int i1 = getPaddingTop();
        int j1 = getPaddingBottom();
        if (layoutparams.contentView)
        {
            int k1 = android.view.View.MeasureSpec.getSize(i);
            j = android.view.View.MeasureSpec.getSize(j);
            boolean flag;
            if (layoutparams.height == -2)
            {
                i = 0;
            } else
            {
                i = 0x40000000;
            }
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
            i = android.view.View.MeasureSpec.makeMeasureSpec(j, i);
            view.measure(getChildMeasureSpec(k1, k + l, layoutparams.width), getChildMeasureSpec(i, i1 + j1, layoutparams.height));
            layoutparams.needsMeasure = false;
            if (view.getMeasuredHeight() > getMeasuredHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            layoutparams.tall = flag;
            if (view.getMeasuredWidth() > getMeasuredWidth())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            layoutparams.wide = flag;
            return;
        } else
        {
            view.measure(getChildMeasureSpec(i, 0, layoutparams.width), getChildMeasureSpec(j, 0, layoutparams.height));
            return;
        }
    }

    public void moveTo(int i, int j)
    {
        if (!pointInRange(i, j))
        {
            Log.w("GridViewPager", "setPosition called with invalid position");
            return;
        } else
        {
            setPosition(i, j);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mPageScrollTask);
        mCenterView = null;
    }

    public void onDismissGesture()
    {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (mAdapter == null)
        {
            return false;
        }
        switch (motionevent.getAction() & 0xff)
        {
        default:
            return false;

        case 0: // '\0'
            return handlePointerDown(motionevent);

        case 2: // '\002'
            return handlePointerMove(motionevent);

        case 1: // '\001'
        case 3: // '\003'
            return handlePointerUp(motionevent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        keyevent.getKeyCode();
        JVM INSTR tableswitch 19 22: default 36
    //                   19 60
    //                   20 67
    //                   21 38
    //                   22 53;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L4:
        keyevent = RelativePosition.LEFT;
_L7:
        skipScrollAnimation();
        moveTowards(keyevent);
        return true;
_L5:
        keyevent = RelativePosition.RIGHT;
        continue; /* Loop/switch isn't completed */
_L2:
        keyevent = RelativePosition.ABOVE;
        continue; /* Loop/switch isn't completed */
_L3:
        keyevent = RelativePosition.BELOW;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (mAdapter != null && mAdapter.getRowCount() != 0)
        {
            i = k - i;
            j = l - j;
            mBackgroundContainer.layout(0, 0, i, j);
            if (mPopulateNeeded)
            {
                Log.d("GridViewPager", "Populate in layout");
                populate();
                updateBackground();
                snapScrollTo(RelativePosition.CENTER);
                if (mPositionRestored)
                {
                    mPositionRestored = false;
                }
                if (mUpdatePrimary)
                {
                    mUpdatePrimary = false;
                    post(new Runnable() {

                        final GridViewPager this$0;

                        public void run()
                        {
                            if (mAdapter != null && mCurrent != null)
                            {
                                mAdapter.setPrimaryItem(GridViewPager.this, mCurrent.x, mCurrent.y);
                            }
                        }

            
            {
                this$0 = GridViewPager.this;
                super();
            }
                    });
                }
                mPopulateNeeded = false;
            }
            Iterator iterator = mFragments.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                RelativePosition relativeposition = (RelativePosition)((java.util.Map.Entry) (obj)).getKey();
                obj = ((Fragment)((java.util.Map.Entry) (obj)).getValue()).getView();
                if (obj != null)
                {
                    LayoutParams layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                    if (layoutparams != null)
                    {
                        if (layoutparams.needsMeasure)
                        {
                            measureChild(((View) (obj)), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000));
                        }
                        k = (mCurrent.x + relativeposition.x) * getWidth();
                        l = (mCurrent.y + relativeposition.y) * getHeight();
                        mRect1.set(getPaddingLeft() + k, getPaddingTop() + l, (k + i) - getPaddingRight(), (l + j) - getPaddingBottom());
                        if (((View) (obj)).getMeasuredHeight() > j)
                        {
                            layoutparams.gravity = layoutparams.gravity & 0xffffff8f | 0x30;
                        }
                        if (((View) (obj)).getMeasuredWidth() > i)
                        {
                            layoutparams.gravity = layoutparams.gravity & -8 | 3;
                        }
                        Gravity.apply(layoutparams.gravity, ((View) (obj)).getMeasuredWidth(), ((View) (obj)).getMeasuredHeight(), mRect1, mRect2);
                        ((View) (obj)).layout(mRect2.left, mRect2.top, mRect2.right, mRect2.bottom);
                    }
                }
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), j));
        measureChildren(i, j);
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
        if (pointInRange(((SavedState) (parcelable)).currentX, ((SavedState) (parcelable)).currentY))
        {
            mCurrent.set(((SavedState) (parcelable)).currentX, ((SavedState) (parcelable)).currentY);
            mPositionRestored = true;
            return;
        } else
        {
            mCurrent.set(0, 0);
            internalScrollTo(0, 0);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.currentX = mCurrent.x;
        savedstate.currentY = mCurrent.y;
        return savedstate;
    }

    protected void onScrollAnimationEnd()
    {
        mCurrent.set(mNewCenter.x, mNewCenter.y);
        if (mAdapter != null)
        {
            mCurrentColumnCount = mAdapter.getColumnCount(mCurrent.y);
            if (!mScrollAnimationInterrupted)
            {
                Point point = (Point)mWarpPoints.remove(mCurrent);
                if (point != null)
                {
                    mCurrent = point;
                    mCurrentColumnCount = mAdapter.getColumnCount(mCurrent.y);
                    snapScrollTo(RelativePosition.CENTER);
                }
                mAdapter.setPrimaryItem(this, mCurrent.x, mCurrent.y);
                mWarpPoints.clear();
            }
            populate();
        }
        mScrollDirection = RelativePosition.CENTER;
        mScrollProgress = 0.0F;
        mScrollAnimationInterrupted = false;
        mScrollAnimationInterruptible = true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        if (mAdapter == null)
        {
            return false;
        }
        i = motionevent.getAction();
        i & 0xff;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 76
    //                   1 94
    //                   2 85
    //                   3 94;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        Log.e("GridViewPager", (new StringBuilder()).append("Unknown action type: ").append(i).toString());
_L6:
        return true;
_L2:
        handlePointerDown(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        handlePointerMove(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        handlePointerUp(motionevent);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void scrollPageBy(int i, int j)
    {
        int k = mCurrent.x;
        int l = getWidth();
        int i1 = getScrollX();
        int j1 = mCurrent.y;
        int k1 = getHeight();
        int l1 = getScrollY();
        mPageScroller.startScroll(getScrollX(), getScrollY(), (k + i) * l - i1, (j1 + j) * k1 - l1, 300);
        removeCallbacks(mPageScrollTask);
        postOnAnimation(mPageScrollTask);
    }

    public void scrollTo(int i, int j)
    {
        internalScrollTo(i, j);
        updateScrollInfo(true);
        updateBackground();
    }

    public void setAdapter(GridPagerAdapter gridpageradapter)
    {
label0:
        {
            if (mAdapter != null)
            {
                mAdapter.unregisterDataSetObserver(mObserver);
                mAdapter.startUpdate(this);
                Fragment fragment;
                for (Iterator iterator = mFragments.values().iterator(); iterator.hasNext(); mAdapter.destroyItem(this, fragment))
                {
                    fragment = (Fragment)iterator.next();
                }

                mAdapter.finishUpdate(this);
                mWarpPoints.clear();
                mFragments.clear();
                mRowCount = 0;
                mCurrentColumnCount = 0;
                mCurrent.set(0, 0);
            }
            mAdapter = gridpageradapter;
            if (mAdapter != null)
            {
                mAdapter.registerDataSetObserver(mObserver);
                mRowCount = mAdapter.getRowCount();
                if (mRowCount > 0)
                {
                    mCurrentColumnCount = mAdapter.getColumnCount(mCurrent.y);
                }
                if (!isLaidOut() || isInLayout())
                {
                    break label0;
                }
                populate();
                updateScrollInfo(false);
                updateBackground();
                mAdapter.setPrimaryItem(this, mCurrent.x, mCurrent.y);
            }
            return;
        }
        mPopulateNeeded = true;
        mUpdatePrimary = true;
        requestLayout();
    }

    protected void snapScrollTo(RelativePosition relativeposition)
    {
        internalScrollTo((mCurrent.x + relativeposition.x) * getWidth(), (mCurrent.y + relativeposition.y) * getHeight());
        updateBackground();
        mScrollDirection = RelativePosition.CENTER;
        mScrollProgress = 0.0F;
    }











}
