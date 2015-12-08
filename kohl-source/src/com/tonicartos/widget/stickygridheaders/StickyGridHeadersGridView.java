// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapterWrapper, StickyGridHeadersBaseAdapter, StickyGridHeadersSimpleAdapter, StickyGridHeadersSimpleAdapterWrapper, 
//            StickyGridHeadersListAdapterWrapper

public class StickyGridHeadersGridView extends GridView
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.AdapterView.OnItemLongClickListener
{
    private class CheckForHeaderLongPress extends WindowRunnable
        implements Runnable
    {

        final StickyGridHeadersGridView this$0;

        public void run()
        {
label0:
            {
                View view = getHeaderAt(mMotionHeaderPosition);
                if (view != null)
                {
                    long l = headerViewPositionToId(mMotionHeaderPosition);
                    boolean flag1 = false;
                    boolean flag = flag1;
                    if (sameWindow())
                    {
                        flag = flag1;
                        if (!mDataChanged)
                        {
                            flag = performHeaderLongPress(view, l);
                        }
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    mTouchMode = -2;
                    setPressed(false);
                    view.setPressed(false);
                }
                return;
            }
            mTouchMode = 2;
        }

        private CheckForHeaderLongPress()
        {
            this$0 = StickyGridHeadersGridView.this;
            super();
        }

    }

    final class CheckForHeaderTap
        implements Runnable
    {

        final StickyGridHeadersGridView this$0;

        public void run()
        {
label0:
            {
label1:
                {
                    if (mTouchMode == 0)
                    {
                        mTouchMode = 1;
                        View view = getHeaderAt(mMotionHeaderPosition);
                        if (view != null && !mHeaderChildBeingPressed)
                        {
                            if (mDataChanged)
                            {
                                break label0;
                            }
                            view.setPressed(true);
                            setPressed(true);
                            refreshDrawableState();
                            int i = ViewConfiguration.getLongPressTimeout();
                            if (!isLongClickable())
                            {
                                break label1;
                            }
                            if (mPendingCheckForLongPress == null)
                            {
                                mPendingCheckForLongPress = new CheckForHeaderLongPress();
                            }
                            mPendingCheckForLongPress.rememberWindowAttachCount();
                            postDelayed(mPendingCheckForLongPress, i);
                        }
                    }
                    return;
                }
                mTouchMode = 2;
                return;
            }
            mTouchMode = 2;
        }

        CheckForHeaderTap()
        {
            this$0 = StickyGridHeadersGridView.this;
            super();
        }
    }

    public static interface OnHeaderClickListener
    {

        public abstract void onHeaderClick(AdapterView adapterview, View view, long l);
    }

    public static interface OnHeaderLongClickListener
    {

        public abstract boolean onHeaderLongClick(AdapterView adapterview, View view, long l);
    }

    private class PerformHeaderClick extends WindowRunnable
        implements Runnable
    {

        int mClickMotionPosition;
        final StickyGridHeadersGridView this$0;

        public void run()
        {
            if (!mDataChanged && mAdapter != null && mAdapter.getCount() > 0 && mClickMotionPosition != -1 && mClickMotionPosition < mAdapter.getCount() && sameWindow())
            {
                View view = getHeaderAt(mClickMotionPosition);
                if (view != null)
                {
                    performHeaderClick(view, headerViewPositionToId(mClickMotionPosition));
                    return;
                }
            }
        }

        private PerformHeaderClick()
        {
            this$0 = StickyGridHeadersGridView.this;
            super();
        }

    }

    class RuntimePlatformSupportException extends RuntimeException
    {

        private static final long serialVersionUID = 0xa5a060a2c717e626L;
        final StickyGridHeadersGridView this$0;

        public RuntimePlatformSupportException(Exception exception)
        {
            this$0 = StickyGridHeadersGridView.this;
            super(StickyGridHeadersGridView.ERROR_PLATFORM, exception);
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
        boolean areHeadersSticky;

        public String toString()
        {
            return (new StringBuilder()).append("StickyGridHeadersGridView.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" areHeadersSticky=").append(areHeadersSticky).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (areHeadersSticky)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            areHeadersSticky = flag;
        }


        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private class WindowRunnable
    {

        private int mOriginalAttachCount;
        final StickyGridHeadersGridView this$0;

        public void rememberWindowAttachCount()
        {
            mOriginalAttachCount = getWindowAttachCount();
        }

        public boolean sameWindow()
        {
            return hasWindowFocus() && getWindowAttachCount() == mOriginalAttachCount;
        }

        private WindowRunnable()
        {
            this$0 = StickyGridHeadersGridView.this;
            super();
        }

    }


    private static final String ERROR_PLATFORM;
    private static final int MATCHED_STICKIED_HEADER = -2;
    private static final int NO_MATCHED_HEADER = -1;
    static final String TAG = com/tonicartos/widget/stickygridheaders/StickyGridHeadersGridView.getSimpleName();
    protected static final int TOUCH_MODE_DONE_WAITING = 2;
    protected static final int TOUCH_MODE_DOWN = 0;
    protected static final int TOUCH_MODE_FINISHED_LONG_PRESS = -2;
    protected static final int TOUCH_MODE_REST = -1;
    protected static final int TOUCH_MODE_TAP = 1;
    protected StickyGridHeadersBaseAdapterWrapper mAdapter;
    private boolean mAreHeadersSticky;
    private boolean mClipToPaddingHasBeenSet;
    private final Rect mClippingRect;
    private boolean mClippingToPadding;
    private int mColumnWidth;
    private long mCurrentHeaderId;
    protected boolean mDataChanged;
    private DataSetObserver mDataSetObserver = new DataSetObserver() {

        final StickyGridHeadersGridView this$0;

        public void onChanged()
        {
            reset();
        }

        public void onInvalidated()
        {
            reset();
        }

            
            {
                this$0 = StickyGridHeadersGridView.this;
                super();
            }
    };
    private int mHeaderBottomPosition;
    boolean mHeaderChildBeingPressed;
    private boolean mHeadersIgnorePadding;
    private int mHorizontalSpacing;
    private boolean mMaskStickyHeaderRegion;
    protected int mMotionHeaderPosition;
    private float mMotionY;
    private int mNumColumns;
    private boolean mNumColumnsSet;
    private int mNumMeasuredColumns;
    private OnHeaderClickListener mOnHeaderClickListener;
    private OnHeaderLongClickListener mOnHeaderLongClickListener;
    private android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private android.widget.AdapterView.OnItemLongClickListener mOnItemLongClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    public CheckForHeaderLongPress mPendingCheckForLongPress;
    public CheckForHeaderTap mPendingCheckForTap;
    private PerformHeaderClick mPerformHeaderClick;
    private android.widget.AbsListView.OnScrollListener mScrollListener;
    private int mScrollState;
    private View mStickiedHeader;
    protected int mTouchMode;
    private Runnable mTouchModeReset;
    private int mTouchSlop;
    private int mVerticalSpacing;

    public StickyGridHeadersGridView(Context context)
    {
        this(context, null);
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010071);
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAreHeadersSticky = true;
        mClippingRect = new Rect();
        mCurrentHeaderId = -1L;
        mMaskStickyHeaderRegion = true;
        mNumMeasuredColumns = 1;
        mScrollState = 0;
        mHeaderChildBeingPressed = false;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!mNumColumnsSet)
        {
            mNumColumns = -1;
        }
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private int findMotionHeader(float f)
    {
        if (mStickiedHeader == null || f > (float)mHeaderBottomPosition) goto _L2; else goto _L1
_L1:
        int k = -2;
_L6:
        return k;
_L2:
        int i;
        int j;
        i = 0;
        j = getFirstVisiblePosition();
_L7:
        if (j > getLastVisiblePosition()) goto _L4; else goto _L3
_L3:
        int l;
        if (getItemIdAtPosition(j) != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = getChildAt(i);
        k = view.getBottom();
        l = view.getTop();
        if (f > (float)k)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (f >= (float)l) goto _L6; else goto _L5
_L5:
        j += mNumMeasuredColumns;
        i += mNumMeasuredColumns;
          goto _L7
_L4:
        return -1;
    }

    private int getHeaderHeight()
    {
        if (mStickiedHeader != null)
        {
            return mStickiedHeader.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    private static android.view.MotionEvent.PointerCoords[] getPointerCoords(MotionEvent motionevent)
    {
        int j = motionevent.getPointerCount();
        android.view.MotionEvent.PointerCoords apointercoords[] = new android.view.MotionEvent.PointerCoords[j];
        for (int i = 0; i < j; i++)
        {
            apointercoords[i] = new android.view.MotionEvent.PointerCoords();
            motionevent.getPointerCoords(i, apointercoords[i]);
        }

        return apointercoords;
    }

    private static int[] getPointerIds(MotionEvent motionevent)
    {
        int j = motionevent.getPointerCount();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = motionevent.getPointerId(i);
        }

        return ai;
    }

    private long headerViewPositionToId(int i)
    {
        if (i == -2)
        {
            return mCurrentHeaderId;
        } else
        {
            return mAdapter.getHeaderId(getFirstVisiblePosition() + i);
        }
    }

    private void measureHeader()
    {
        if (mStickiedHeader == null)
        {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutparams;
        int i;
        int j;
        if (mHeadersIgnorePadding)
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
        }
        layoutparams = mStickiedHeader.getLayoutParams();
        if (layoutparams != null && layoutparams.height > 0)
        {
            j = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        } else
        {
            j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        mStickiedHeader.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        mStickiedHeader.measure(i, j);
        if (mHeadersIgnorePadding)
        {
            mStickiedHeader.layout(getLeft(), 0, getRight(), mStickiedHeader.getMeasuredHeight());
            return;
        } else
        {
            mStickiedHeader.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), mStickiedHeader.getMeasuredHeight());
            return;
        }
    }

    private void reset()
    {
        mHeaderBottomPosition = 0;
        swapStickiedHeader(null);
        mCurrentHeaderId = 0x8000000000000000L;
    }

    private void scrollChanged(int i)
    {
        if (mAdapter != null && mAdapter.getCount() != 0 && mAreHeadersSticky && getChildAt(0) != null)
        {
            int i1 = i;
            int k = i - mNumMeasuredColumns;
            int j = k;
            if (k < 0)
            {
                j = i;
            }
            int j1 = i + mNumMeasuredColumns;
            k = j1;
            if (j1 >= mAdapter.getCount())
            {
                k = i;
            }
            int l1;
            long l2;
            if (mVerticalSpacing == 0)
            {
                l2 = mAdapter.getHeaderId(i);
                j = i1;
            } else
            if (mVerticalSpacing < 0)
            {
                mAdapter.getHeaderId(i);
                if (getChildAt(mNumMeasuredColumns).getTop() <= 0)
                {
                    l2 = mAdapter.getHeaderId(k);
                    j = k;
                } else
                {
                    l2 = mAdapter.getHeaderId(i);
                    j = i1;
                }
            } else
            {
                int l = getChildAt(0).getTop();
                if (l > 0 && l < mVerticalSpacing)
                {
                    l2 = mAdapter.getHeaderId(j);
                } else
                {
                    l2 = mAdapter.getHeaderId(i);
                    j = i1;
                }
            }
            if (mCurrentHeaderId != l2)
            {
                swapStickiedHeader(mAdapter.getHeaderView(j, mStickiedHeader, this));
                measureHeader();
                mCurrentHeaderId = l2;
            }
            l1 = getChildCount();
            if (l1 != 0)
            {
                View view = null;
                i1 = 0x1869f;
                k = 0;
                while (k < l1) 
                {
                    View view2 = super.getChildAt(k);
                    View view1;
                    int k1;
                    if (mClippingToPadding)
                    {
                        j = view2.getTop() - getPaddingTop();
                    } else
                    {
                        j = view2.getTop();
                    }
                    if (j < 0)
                    {
                        k1 = i1;
                        view1 = view;
                    } else
                    {
                        view1 = view;
                        k1 = i1;
                        if (mAdapter.getItemId(getPositionForView(view2)) == -1L)
                        {
                            view1 = view;
                            k1 = i1;
                            if (j < i1)
                            {
                                view1 = view2;
                                k1 = j;
                            }
                        }
                    }
                    k += mNumMeasuredColumns;
                    view = view1;
                    i1 = k1;
                }
                j = getHeaderHeight();
                if (view != null)
                {
                    if (i == 0 && super.getChildAt(0).getTop() > 0 && !mClippingToPadding)
                    {
                        mHeaderBottomPosition = 0;
                        return;
                    }
                    if (mClippingToPadding)
                    {
                        mHeaderBottomPosition = Math.min(view.getTop(), getPaddingTop() + j);
                        if (mHeaderBottomPosition < getPaddingTop())
                        {
                            i = getPaddingTop() + j;
                        } else
                        {
                            i = mHeaderBottomPosition;
                        }
                        mHeaderBottomPosition = i;
                        return;
                    }
                    mHeaderBottomPosition = Math.min(view.getTop(), j);
                    if (mHeaderBottomPosition < 0)
                    {
                        i = j;
                    } else
                    {
                        i = mHeaderBottomPosition;
                    }
                    mHeaderBottomPosition = i;
                    return;
                }
                mHeaderBottomPosition = j;
                if (mClippingToPadding)
                {
                    mHeaderBottomPosition = mHeaderBottomPosition + getPaddingTop();
                    return;
                }
            }
        }
    }

    private void swapStickiedHeader(View view)
    {
        detachHeader(mStickiedHeader);
        attachHeader(view);
        mStickiedHeader = view;
    }

    private MotionEvent transformEvent(MotionEvent motionevent, int i)
    {
        if (i == -2)
        {
            return motionevent;
        }
        long l2 = motionevent.getDownTime();
        long l3 = motionevent.getEventTime();
        int j = motionevent.getAction();
        int k = motionevent.getPointerCount();
        int ai[] = getPointerIds(motionevent);
        android.view.MotionEvent.PointerCoords apointercoords[] = getPointerCoords(motionevent);
        int l = motionevent.getMetaState();
        float f = motionevent.getXPrecision();
        float f1 = motionevent.getYPrecision();
        int i1 = motionevent.getDeviceId();
        int j1 = motionevent.getEdgeFlags();
        int k1 = motionevent.getSource();
        int l1 = motionevent.getFlags();
        motionevent = getChildAt(i);
        for (i = 0; i < k; i++)
        {
            android.view.MotionEvent.PointerCoords pointercoords = apointercoords[i];
            pointercoords.y = pointercoords.y - (float)motionevent.getTop();
        }

        return MotionEvent.obtain(l2, l3, j, k, ai, apointercoords, l, f, f1, i1, j1, k1, l1);
    }

    public boolean areHeadersSticky()
    {
        return mAreHeadersSticky;
    }

    void attachHeader(View view)
    {
        if (view == null)
        {
            return;
        }
        try
        {
            Field field = android/view/View.getDeclaredField("mAttachInfo");
            field.setAccessible(true);
            Method method = android/view/View.getDeclaredMethod("dispatchAttachedToWindow", new Class[] {
                Class.forName("android.view.View$AttachInfo"), Integer.TYPE
            });
            method.setAccessible(true);
            method.invoke(view, new Object[] {
                field.get(this), Integer.valueOf(8)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
    }

    void detachHeader(View view)
    {
        if (view == null)
        {
            return;
        }
        try
        {
            Method method = android/view/View.getDeclaredMethod("dispatchDetachedFromWindow", new Class[0]);
            method.setAccessible(true);
            method.invoke(view, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimePlatformSupportException(view);
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            scrollChanged(getFirstVisiblePosition());
        }
        ArrayList arraylist;
        int i;
        int k1;
        int l1;
        if (mStickiedHeader != null && mAreHeadersSticky && mStickiedHeader.getVisibility() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k1 = getHeaderHeight();
        l1 = mHeaderBottomPosition - k1;
        if (i != 0 && mMaskStickyHeaderRegion)
        {
            int j;
            int i1;
            if (mHeadersIgnorePadding)
            {
                mClippingRect.left = 0;
                mClippingRect.right = getWidth();
            } else
            {
                mClippingRect.left = getPaddingLeft();
                mClippingRect.right = getWidth() - getPaddingRight();
            }
            mClippingRect.top = mHeaderBottomPosition;
            mClippingRect.bottom = getHeight();
            canvas.save();
            canvas.clipRect(mClippingRect);
        }
        super.dispatchDraw(canvas);
        arraylist = new ArrayList();
        j = 0;
        for (i1 = getFirstVisiblePosition(); i1 <= getLastVisiblePosition();)
        {
            if (getItemIdAtPosition(i1) == -1L)
            {
                arraylist.add(Integer.valueOf(j));
            }
            i1 += mNumMeasuredColumns;
            j += mNumMeasuredColumns;
        }

        int k = 0;
        while (k < arraylist.size()) 
        {
            View view = getChildAt(((Integer)arraylist.get(k)).intValue());
            View view1;
            boolean flag;
            try
            {
                view1 = (View)view.getTag();
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                return;
            }
            if ((long)((StickyGridHeadersBaseAdapterWrapper.HeaderFillerView)view).getHeaderId() == mCurrentHeaderId && view.getTop() < 0 && mAreHeadersSticky)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view1.getVisibility() == 0 && !flag)
            {
                int j1;
                int i2;
                if (mHeadersIgnorePadding)
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000);
                } else
                {
                    j1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
                }
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                view1.measure(j1, i2);
                if (mHeadersIgnorePadding)
                {
                    view1.layout(getLeft(), 0, getRight(), view.getHeight());
                } else
                {
                    view1.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), view.getHeight());
                }
                if (mHeadersIgnorePadding)
                {
                    mClippingRect.left = 0;
                    mClippingRect.right = getWidth();
                } else
                {
                    mClippingRect.left = getPaddingLeft();
                    mClippingRect.right = getWidth() - getPaddingRight();
                }
                mClippingRect.bottom = view.getBottom();
                mClippingRect.top = view.getTop();
                canvas.save();
                canvas.clipRect(mClippingRect);
                if (mHeadersIgnorePadding)
                {
                    canvas.translate(0.0F, view.getTop());
                } else
                {
                    canvas.translate(getPaddingLeft(), view.getTop());
                }
                view1.draw(canvas);
                canvas.restore();
            }
            k++;
        }
        if (i != 0 && mMaskStickyHeaderRegion)
        {
            canvas.restore();
        } else
        if (i == 0)
        {
            return;
        }
        if (mHeadersIgnorePadding)
        {
            i = getWidth();
        } else
        {
            i = getWidth() - getPaddingLeft() - getPaddingRight();
        }
        if (mStickiedHeader.getWidth() != i)
        {
            int l;
            if (mHeadersIgnorePadding)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000);
            } else
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
            }
            l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            mStickiedHeader.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            mStickiedHeader.measure(i, l);
            if (mHeadersIgnorePadding)
            {
                mStickiedHeader.layout(getLeft(), 0, getRight(), mStickiedHeader.getHeight());
            } else
            {
                mStickiedHeader.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), mStickiedHeader.getHeight());
            }
        }
        if (mHeadersIgnorePadding)
        {
            mClippingRect.left = 0;
            mClippingRect.right = getWidth();
        } else
        {
            mClippingRect.left = getPaddingLeft();
            mClippingRect.right = getWidth() - getPaddingRight();
        }
        mClippingRect.bottom = l1 + k1;
        if (mClippingToPadding)
        {
            mClippingRect.top = getPaddingTop();
        } else
        {
            mClippingRect.top = 0;
        }
        canvas.save();
        canvas.clipRect(mClippingRect);
        if (mHeadersIgnorePadding)
        {
            canvas.translate(0.0F, l1);
        } else
        {
            canvas.translate(getPaddingLeft(), l1);
        }
        if (mHeaderBottomPosition != k1)
        {
            canvas.saveLayerAlpha(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), (mHeaderBottomPosition * 255) / k1, 31);
        }
        mStickiedHeader.draw(canvas);
        if (mHeaderBottomPosition != k1)
        {
            canvas.restore();
        }
        canvas.restore();
    }

    public View getHeaderAt(int i)
    {
        if (i == -2)
        {
            return mStickiedHeader;
        }
        View view;
        try
        {
            view = (View)getChildAt(i).getTag();
        }
        catch (Exception exception)
        {
            return null;
        }
        return view;
    }

    public View getStickiedHeader()
    {
        return mStickiedHeader;
    }

    public boolean getStickyHeaderIsTranscluent()
    {
        return !mMaskStickyHeaderRegion;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mOnItemClickListener.onItemClick(adapterview, view, mAdapter.translatePosition(i).mPosition, l);
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        return mOnItemLongClickListener.onItemLongClick(adapterview, view, mAdapter.translatePosition(i).mPosition, l);
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        mOnItemSelectedListener.onItemSelected(adapterview, view, mAdapter.translatePosition(i).mPosition, l);
    }

    protected void onMeasure(int i, int j)
    {
        if (mNumColumns == -1)
        {
            int l;
            if (mColumnWidth > 0)
            {
                int i1 = Math.max(android.view.View.MeasureSpec.getSize(i) - getPaddingLeft() - getPaddingRight(), 0);
                int k = i1 / mColumnWidth;
                if (k > 0)
                {
                    do
                    {
                        l = k;
                        if (k == 1)
                        {
                            break;
                        }
                        l = k;
                        if (mColumnWidth * k + (k - 1) * mHorizontalSpacing <= i1)
                        {
                            break;
                        }
                        k--;
                    } while (true);
                } else
                {
                    l = 1;
                }
            } else
            {
                l = 2;
            }
            mNumMeasuredColumns = l;
        } else
        {
            mNumMeasuredColumns = mNumColumns;
        }
        if (mAdapter != null)
        {
            mAdapter.setNumColumns(mNumMeasuredColumns);
        }
        measureHeader();
        super.onMeasure(i, j);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        mOnItemSelectedListener.onNothingSelected(adapterview);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        mAreHeadersSticky = ((SavedState) (parcelable)).areHeadersSticky;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.areHeadersSticky = mAreHeadersSticky;
        return savedstate;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (mScrollListener != null)
        {
            mScrollListener.onScroll(abslistview, i, j, k);
        }
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            scrollChanged(i);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (mScrollListener != null)
        {
            mScrollListener.onScrollStateChanged(abslistview, i);
        }
        mScrollState = i;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        int i = motionevent.getAction();
        flag = mHeaderChildBeingPressed;
        if (mHeaderChildBeingPressed)
        {
            View view1 = getHeaderAt(mMotionHeaderPosition);
            final View headerHolder;
            if (mMotionHeaderPosition == -2)
            {
                headerHolder = view1;
            } else
            {
                headerHolder = getChildAt(mMotionHeaderPosition);
            }
            if (i == 1 || i == 3)
            {
                mHeaderChildBeingPressed = false;
            }
            if (view1 != null)
            {
                view1.dispatchTouchEvent(transformEvent(motionevent, mMotionHeaderPosition));
                view1.invalidate();
                view1.postDelayed(new Runnable() {

                    final StickyGridHeadersGridView this$0;
                    final View val$headerHolder;

                    public void run()
                    {
                        invalidate(0, headerHolder.getTop(), getWidth(), headerHolder.getTop() + headerHolder.getHeight());
                    }

            
            {
                this$0 = StickyGridHeadersGridView.this;
                headerHolder = view;
                super();
            }
                }, ViewConfiguration.getPressedStateDuration());
                invalidate(0, headerHolder.getTop(), getWidth(), headerHolder.getTop() + headerHolder.getHeight());
            }
        }
        i & 0xff;
        JVM INSTR tableswitch 0 2: default 152
    //                   0 170
    //                   1 416
    //                   2 335;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        if (mPendingCheckForTap == null)
        {
            mPendingCheckForTap = new CheckForHeaderTap();
        }
        postDelayed(mPendingCheckForTap, ViewConfiguration.getTapTimeout());
        int j = (int)motionevent.getY();
        mMotionY = j;
        mMotionHeaderPosition = findMotionHeader(j);
        if (mMotionHeaderPosition != -1 && mScrollState != 2)
        {
            View view = getHeaderAt(mMotionHeaderPosition);
            if (view != null)
            {
                if (view.dispatchTouchEvent(transformEvent(motionevent, mMotionHeaderPosition)))
                {
                    mHeaderChildBeingPressed = true;
                    view.setPressed(true);
                }
                view.invalidate();
                motionevent = view;
                if (mMotionHeaderPosition != -2)
                {
                    motionevent = getChildAt(mMotionHeaderPosition);
                }
                invalidate(0, motionevent.getTop(), getWidth(), motionevent.getTop() + motionevent.getHeight());
            }
            mTouchMode = 0;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mMotionHeaderPosition != -1 && Math.abs(motionevent.getY() - mMotionY) > (float)mTouchSlop)
        {
            mTouchMode = -1;
            Object obj = getHeaderAt(mMotionHeaderPosition);
            if (obj != null)
            {
                ((View) (obj)).setPressed(false);
                ((View) (obj)).invalidate();
            }
            obj = getHandler();
            if (obj != null)
            {
                ((Handler) (obj)).removeCallbacks(mPendingCheckForLongPress);
            }
            mMotionHeaderPosition = -1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (mTouchMode == -2)
        {
            mTouchMode = -1;
            return true;
        }
        if (mTouchMode == -1 || mMotionHeaderPosition == -1) goto _L1; else goto _L5
_L5:
        final View header = getHeaderAt(mMotionHeaderPosition);
        if (flag || header == null) goto _L7; else goto _L6
_L6:
        final PerformHeaderClick performHeaderClick;
        if (mTouchMode != 0)
        {
            header.setPressed(false);
        }
        if (mPerformHeaderClick == null)
        {
            mPerformHeaderClick = new PerformHeaderClick();
        }
        performHeaderClick = mPerformHeaderClick;
        performHeaderClick.mClickMotionPosition = mMotionHeaderPosition;
        performHeaderClick.rememberWindowAttachCount();
        if (mTouchMode != 0 && mTouchMode != 1) goto _L9; else goto _L8
_L8:
        Handler handler = getHandler();
        if (handler != null)
        {
            if (mTouchMode == 0)
            {
                motionevent = mPendingCheckForTap;
            } else
            {
                motionevent = mPendingCheckForLongPress;
            }
            handler.removeCallbacks(motionevent);
        }
        if (!mDataChanged)
        {
            mTouchMode = 1;
            header.setPressed(true);
            setPressed(true);
            if (mTouchModeReset != null)
            {
                removeCallbacks(mTouchModeReset);
            }
            mTouchModeReset = new Runnable() {

                final StickyGridHeadersGridView this$0;
                final View val$header;
                final PerformHeaderClick val$performHeaderClick;

                public void run()
                {
                    mMotionHeaderPosition = -1;
                    mTouchModeReset = null;
                    mTouchMode = -1;
                    header.setPressed(false);
                    setPressed(false);
                    header.invalidate();
                    invalidate(0, header.getTop(), getWidth(), header.getHeight());
                    if (!mDataChanged)
                    {
                        performHeaderClick.run();
                    }
                }

            
            {
                this$0 = StickyGridHeadersGridView.this;
                header = view;
                performHeaderClick = performheaderclick;
                super();
            }
            };
            postDelayed(mTouchModeReset, ViewConfiguration.getPressedStateDuration());
        } else
        {
            mTouchMode = -1;
        }
_L7:
        mTouchMode = -1;
        return true;
_L9:
        if (!mDataChanged)
        {
            performHeaderClick.run();
        }
        if (true) goto _L7; else goto _L10
_L10:
    }

    public boolean performHeaderClick(View view, long l)
    {
        if (mOnHeaderClickListener != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            mOnHeaderClickListener.onHeaderClick(this, view, l);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean performHeaderLongPress(View view, long l)
    {
        boolean flag = false;
        if (mOnHeaderLongClickListener != null)
        {
            flag = mOnHeaderLongClickListener.onHeaderLongClick(this, view, l);
        }
        if (flag)
        {
            if (view != null)
            {
                view.sendAccessibilityEvent(2);
            }
            performHapticFeedback(0);
        }
        return flag;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (mAdapter != null && mDataSetObserver != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
        }
        if (!mClipToPaddingHasBeenSet)
        {
            mClippingToPadding = true;
        }
        if (listadapter instanceof StickyGridHeadersBaseAdapter)
        {
            listadapter = (StickyGridHeadersBaseAdapter)listadapter;
        } else
        if (listadapter instanceof StickyGridHeadersSimpleAdapter)
        {
            listadapter = new StickyGridHeadersSimpleAdapterWrapper((StickyGridHeadersSimpleAdapter)listadapter);
        } else
        {
            listadapter = new StickyGridHeadersListAdapterWrapper(listadapter);
        }
        mAdapter = new StickyGridHeadersBaseAdapterWrapper(getContext(), this, listadapter);
        mAdapter.registerDataSetObserver(mDataSetObserver);
        reset();
        super.setAdapter(mAdapter);
    }

    public void setAreHeadersSticky(boolean flag)
    {
        if (flag != mAreHeadersSticky)
        {
            mAreHeadersSticky = flag;
            requestLayout();
        }
    }

    public void setClipToPadding(boolean flag)
    {
        super.setClipToPadding(flag);
        mClippingToPadding = flag;
        mClipToPaddingHasBeenSet = true;
    }

    public void setColumnWidth(int i)
    {
        super.setColumnWidth(i);
        mColumnWidth = i;
    }

    public void setHeadersIgnorePadding(boolean flag)
    {
        mHeadersIgnorePadding = flag;
    }

    public void setHorizontalSpacing(int i)
    {
        super.setHorizontalSpacing(i);
        mHorizontalSpacing = i;
    }

    public void setNumColumns(int i)
    {
        super.setNumColumns(i);
        mNumColumnsSet = true;
        mNumColumns = i;
        if (i != -1 && mAdapter != null)
        {
            mAdapter.setNumColumns(i);
        }
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onheaderclicklistener)
    {
        mOnHeaderClickListener = onheaderclicklistener;
    }

    public void setOnHeaderLongClickListener(OnHeaderLongClickListener onheaderlongclicklistener)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        mOnHeaderLongClickListener = onheaderlongclicklistener;
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        mOnItemClickListener = onitemclicklistener;
        super.setOnItemClickListener(this);
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        mOnItemLongClickListener = onitemlongclicklistener;
        super.setOnItemLongClickListener(this);
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        mOnItemSelectedListener = onitemselectedlistener;
        super.setOnItemSelectedListener(this);
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        mScrollListener = onscrolllistener;
    }

    public void setStickyHeaderIsTranscluent(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mMaskStickyHeaderRegion = flag;
    }

    public void setVerticalSpacing(int i)
    {
        super.setVerticalSpacing(i);
        mVerticalSpacing = i;
    }

    static 
    {
        ERROR_PLATFORM = (new StringBuilder()).append("Error supporting platform ").append(android.os.Build.VERSION.SDK_INT).append(".").toString();
    }



/*
    static Runnable access$202(StickyGridHeadersGridView stickygridheadersgridview, Runnable runnable)
    {
        stickygridheadersgridview.mTouchModeReset = runnable;
        return runnable;
    }

*/




}
