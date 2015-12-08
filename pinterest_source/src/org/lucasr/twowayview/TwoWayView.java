// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.Scroller;

public class TwoWayView extends AdapterView
    implements android.view.ViewTreeObserver.OnTouchModeChangeListener
{

    private static final int CHECK_POSITION_SEARCH_DISTANCE = 20;
    private static final int INVALID_POINTER = -1;
    private static final int LAYOUT_FORCE_BOTTOM = 3;
    private static final int LAYOUT_FORCE_TOP = 1;
    private static final int LAYOUT_MOVE_SELECTION = 6;
    private static final int LAYOUT_NORMAL = 0;
    private static final int LAYOUT_SET_SELECTION = 2;
    private static final int LAYOUT_SPECIFIC = 4;
    private static final int LAYOUT_SYNC = 5;
    private static final String LOGTAG = "TwoWayView";
    private static final float MAX_SCROLL_FACTOR = 0.33F;
    private static final int MIN_SCROLL_PREVIEW_PIXELS = 10;
    private static final int NO_POSITION = -1;
    public static final int STATE_NOTHING[] = {
        0
    };
    private static final int SYNC_FIRST_POSITION = 1;
    private static final int SYNC_MAX_DURATION_MILLIS = 100;
    private static final int SYNC_SELECTED_POSITION = 0;
    private static final int TOUCH_MODE_DONE_WAITING = 2;
    private static final int TOUCH_MODE_DOWN = 0;
    private static final int TOUCH_MODE_DRAGGING = 3;
    private static final int TOUCH_MODE_FLINGING = 4;
    private static final int TOUCH_MODE_OFF = 1;
    private static final int TOUCH_MODE_ON = 0;
    private static final int TOUCH_MODE_OVERSCROLL = 5;
    private static final int TOUCH_MODE_REST = -1;
    private static final int TOUCH_MODE_TAP = 1;
    private static final int TOUCH_MODE_UNKNOWN = -1;
    private ListItemAccessibilityDelegate mAccessibilityDelegate;
    private int mActivePointerId;
    private ListAdapter mAdapter;
    private boolean mAreAllItemsSelectable;
    private final ArrowScrollFocusResult mArrowScrollFocusResult;
    private boolean mBlockLayoutRequests;
    private SparseBooleanArray mCheckStates;
    LongSparseArray mCheckedIdStates;
    private int mCheckedItemCount;
    private ChoiceMode mChoiceMode;
    private final Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mContextMenuInfo;
    private boolean mDataChanged;
    private AdapterDataSetObserver mDataSetObserver;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private boolean mDrawSelectorOnTop;
    private View mEmptyView;
    private EdgeEffectCompat mEndEdge;
    private int mFirstPosition;
    private final int mFlingVelocity;
    private boolean mHasStableIds;
    private boolean mInLayout;
    private boolean mIsAttached;
    private boolean mIsChildViewEnabled;
    final boolean mIsScrap[];
    private boolean mIsVertical;
    private int mItemCount;
    private int mItemMargin;
    private boolean mItemsCanFocus;
    private int mLastAccessibilityScrollEventFromIndex;
    private int mLastAccessibilityScrollEventToIndex;
    private int mLastScrollState;
    private int mLastTouchMode;
    private float mLastTouchPos;
    private int mLayoutMode;
    private final int mMaximumVelocity;
    private int mMotionPosition;
    private boolean mNeedSync;
    private int mNextSelectedPosition;
    private long mNextSelectedRowId;
    private int mOldItemCount;
    private int mOldSelectedPosition;
    private long mOldSelectedRowId;
    private OnScrollListener mOnScrollListener;
    private int mOverScroll;
    private final int mOverscrollDistance;
    private CheckForKeyLongPress mPendingCheckForKeyLongPress;
    private CheckForLongPress mPendingCheckForLongPress;
    private CheckForTap mPendingCheckForTap;
    private SavedState mPendingSync;
    private PerformClick mPerformClick;
    private Runnable mPositionScrollAfterLayout;
    private PositionScroller mPositionScroller;
    private final RecycleBin mRecycler;
    private int mResurrectToPosition;
    private final Scroller mScroller;
    private int mSelectedPosition;
    private long mSelectedRowId;
    private int mSelectedStart;
    private SelectionNotifier mSelectionNotifier;
    private Drawable mSelector;
    private int mSelectorPosition;
    private final Rect mSelectorRect;
    private int mSpecificStart;
    private EdgeEffectCompat mStartEdge;
    private long mSyncHeight;
    private int mSyncMode;
    private int mSyncPosition;
    private long mSyncRowId;
    private final Rect mTempRect;
    private Rect mTouchFrame;
    private int mTouchMode;
    private Runnable mTouchModeReset;
    private float mTouchRemainderPos;
    private final int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public TwoWayView(Context context)
    {
        this(context, null);
    }

    public TwoWayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TwoWayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mIsScrap = new boolean[1];
        mContext = context;
        mNeedSync = false;
        mVelocityTracker = null;
        mLayoutMode = 0;
        mTouchMode = -1;
        mLastTouchMode = -1;
        mIsAttached = false;
        mContextMenuInfo = null;
        mOnScrollListener = null;
        mLastScrollState = 0;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        mTouchSlop = viewconfiguration.getScaledTouchSlop();
        mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
        mOverscrollDistance = getScaledOverscrollDistance(viewconfiguration);
        mOverScroll = 0;
        mScroller = new Scroller(context);
        mIsVertical = true;
        mItemsCanFocus = false;
        mTempRect = new Rect();
        mArrowScrollFocusResult = new ArrowScrollFocusResult(null);
        mSelectorPosition = -1;
        mSelectorRect = new Rect();
        mSelectedStart = 0;
        mResurrectToPosition = -1;
        mSelectedStart = 0;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mChoiceMode = ChoiceMode.NONE;
        mCheckedItemCount = 0;
        mCheckedIdStates = null;
        mCheckStates = null;
        mRecycler = new RecycleBin();
        mDataSetObserver = null;
        mAreAllItemsSelectable = true;
        mStartEdge = null;
        mEndEdge = null;
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setWillNotDraw(false);
        setClipToPadding(false);
        ViewCompat.setOverScrollMode(this, 1);
        context = context.obtainStyledAttributes(attributeset, com.pinterest.R.styleable.TwoWayView, i, 0);
        mDrawSelectorOnTop = context.getBoolean(36, false);
        attributeset = context.getDrawable(35);
        if (attributeset != null)
        {
            setSelector(attributeset);
        }
        i = context.getInt(8, -1);
        if (i >= 0)
        {
            setOrientation(Orientation.values()[i]);
        }
        i = context.getInt(37, -1);
        if (i >= 0)
        {
            setChoiceMode(ChoiceMode.values()[i]);
        }
        context.recycle();
        updateScrollbarsDirection();
    }

    private void adjustViewsStartOrEnd()
    {
        boolean flag = false;
        if (getChildCount() != 0)
        {
            View view = getChildAt(0);
            int i;
            if (mIsVertical)
            {
                i = view.getTop() - getPaddingTop() - mItemMargin;
            } else
            {
                i = view.getLeft() - getPaddingLeft() - mItemMargin;
            }
            if (i < 0)
            {
                i = ((flag) ? 1 : 0);
            }
            if (i != 0)
            {
                offsetChildren(-i);
                return;
            }
        }
    }

    private int amountToScroll(int i, int j)
    {
_L2:
        do
        {
            return 0;
        } while (i1 <= k || j != -1 && k - l >= getMaxScrollAmount());
        k = i1 - k;
        if (mFirstPosition + j1 == mItemCount)
        {
            view = getChildAt(j1 - 1);
            if (mIsVertical)
            {
                j = view.getBottom();
            } else
            {
                j = view.getRight();
            }
            i = Math.min(k, j - i);
        } else
        {
            i = k;
        }
        return Math.min(i, getMaxScrollAmount());
        forceValidFocusDirection(i);
        int j1 = getChildCount();
        if (i == 130 || i == 66)
        {
            View view;
            int k;
            int l;
            int i1;
            if (mIsVertical)
            {
                i = getHeight() - getPaddingBottom();
            } else
            {
                i = getWidth() - getPaddingRight();
            }
            k = j1 - 1;
            if (j != -1)
            {
                k = j - mFirstPosition;
            }
            l = mFirstPosition;
            view = getChildAt(k);
            if (l + k < mItemCount - 1)
            {
                k = i - getArrowScrollPreviewLength();
            } else
            {
                k = i;
            }
            if (mIsVertical)
            {
                l = view.getTop();
            } else
            {
                l = view.getLeft();
            }
            if (mIsVertical)
            {
                i1 = view.getBottom();
            } else
            {
                i1 = view.getRight();
            }
            break MISSING_BLOCK_LABEL_121;
        }
        if (mIsVertical)
        {
            i = getPaddingTop();
        } else
        {
            i = getPaddingLeft();
        }
        if (j != -1)
        {
            k = j - mFirstPosition;
        } else
        {
            k = 0;
        }
        l = mFirstPosition;
        view = getChildAt(k);
        if (l + k > 0)
        {
            k = getArrowScrollPreviewLength() + i;
        } else
        {
            k = i;
        }
        if (mIsVertical)
        {
            l = view.getTop();
        } else
        {
            l = view.getLeft();
        }
        if (mIsVertical)
        {
            i1 = view.getBottom();
        } else
        {
            i1 = view.getRight();
        }
        if (l < k && (j == -1 || i1 - k < getMaxScrollAmount()))
        {
            k -= l;
            if (mFirstPosition == 0)
            {
                view = getChildAt(0);
                if (mIsVertical)
                {
                    j = view.getTop();
                } else
                {
                    j = view.getLeft();
                }
                i = Math.min(k, i - j);
            } else
            {
                i = k;
            }
            return Math.min(i, getMaxScrollAmount());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int amountToScrollToNewFocus(int i, View view, int j)
    {
        forceValidFocusDirection(i);
        boolean flag = false;
        view.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view, mTempRect);
        if (i == 33 || i == 17)
        {
            int k;
            if (mIsVertical)
            {
                i = getPaddingTop();
            } else
            {
                i = getPaddingLeft();
            }
            if (mIsVertical)
            {
                k = mTempRect.top;
            } else
            {
                k = mTempRect.left;
            }
            int l;
            if (k < i)
            {
                k = i - k;
                i = k;
                if (j > 0)
                {
                    i = k + getArrowScrollPreviewLength();
                }
            } else
            {
                i = 0;
            }
        } else
        {
            if (mIsVertical)
            {
                k = getHeight() - getPaddingBottom();
            } else
            {
                k = getWidth() - getPaddingRight();
            }
            if (mIsVertical)
            {
                l = mTempRect.bottom;
            } else
            {
                l = mTempRect.right;
            }
            i = ((flag) ? 1 : 0);
            if (l > k)
            {
                k = l - k;
                i = k;
                if (j < mItemCount - 1)
                {
                    return k + getArrowScrollPreviewLength();
                }
            }
        }
        return i;
    }

    private boolean arrowScroll(int i)
    {
        forceValidFocusDirection(i);
        boolean flag;
        mInLayout = true;
        flag = arrowScrollImpl(i);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        mInLayout = false;
        return flag;
        Exception exception;
        exception;
        mInLayout = false;
        throw exception;
    }

    private ArrowScrollFocusResult arrowScrollFocused(int i)
    {
label0:
        {
            View view;
            int j1;
label1:
            {
label2:
                {
                    boolean flag1 = false;
                    forceValidFocusDirection(i);
                    view = getSelectedView();
                    int j;
                    boolean flag;
                    int k1;
                    if (view != null && view.hasFocus())
                    {
                        view = view.findFocus();
                        view = FocusFinder.getInstance().findNextFocus(this, view, i);
                    } else
                    {
                        int l;
                        if (i == 130 || i == 66)
                        {
                            if (mIsVertical)
                            {
                                j = getPaddingTop();
                            } else
                            {
                                j = getPaddingLeft();
                            }
                            if (view != null)
                            {
                                if (mIsVertical)
                                {
                                    l = view.getTop();
                                } else
                                {
                                    l = view.getLeft();
                                }
                            } else
                            {
                                l = j;
                            }
                            j = Math.max(l, j);
                        } else
                        {
                            if (mIsVertical)
                            {
                                j = getHeight() - getPaddingBottom();
                            } else
                            {
                                j = getWidth() - getPaddingRight();
                            }
                            if (view != null)
                            {
                                if (mIsVertical)
                                {
                                    l = view.getBottom();
                                } else
                                {
                                    l = view.getRight();
                                }
                            } else
                            {
                                l = j;
                            }
                            j = Math.min(l, j);
                        }
                        if (mIsVertical)
                        {
                            l = 0;
                        } else
                        {
                            l = j;
                        }
                        if (!mIsVertical)
                        {
                            j = 0;
                        }
                        mTempRect.set(l, j, l, j);
                        view = FocusFinder.getInstance().findNextFocusFromRect(this, mTempRect, i);
                    }
                    if (view == null)
                    {
                        break label0;
                    }
                    j1 = positionOfNewFocus(view);
                    if (mSelectedPosition == -1 || j1 == mSelectedPosition)
                    {
                        break label1;
                    }
                    k1 = lookForSelectablePositionOnScreen(i);
                    if (i == 130 || i == 66)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    if (i != 33)
                    {
                        flag = flag1;
                        if (i != 17)
                        {
                            break label2;
                        }
                    }
                    flag = true;
                }
                if (k1 != -1 && (j != 0 && k1 < j1 || flag && k1 > j1))
                {
                    return null;
                }
            }
            int k = amountToScrollToNewFocus(i, view, j1);
            int i1 = getMaxScrollAmount();
            if (k < i1)
            {
                view.requestFocus(i);
                mArrowScrollFocusResult.populate(j1, k);
                return mArrowScrollFocusResult;
            }
            if (distanceToView(view) < i1)
            {
                view.requestFocus(i);
                mArrowScrollFocusResult.populate(j1, i1);
                return mArrowScrollFocusResult;
            }
        }
        return null;
    }

    private boolean arrowScrollImpl(int i)
    {
        forceValidFocusDirection(i);
        if (getChildCount() > 0)
        {
            View view = getSelectedView();
            int l = mSelectedPosition;
            int j = lookForSelectablePositionOnScreen(i);
            int k = amountToScroll(i, j);
            Object obj;
            boolean flag;
            if (mItemsCanFocus)
            {
                obj = arrowScrollFocused(i);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                j = ((ArrowScrollFocusResult) (obj)).getSelectedPosition();
                k = ((ArrowScrollFocusResult) (obj)).getAmountToScroll();
            }
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j != -1)
            {
                boolean flag1;
                if (obj != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                handleNewSelectionChange(view, i, j, flag1);
                setSelectedPositionInt(j);
                setNextSelectedPositionInt(j);
                view = getSelectedView();
                if (mItemsCanFocus && obj == null)
                {
                    View view1 = getFocusedChild();
                    if (view1 != null)
                    {
                        view1.clearFocus();
                    }
                }
                checkSelectionChanged();
                flag = true;
                l = j;
            }
            if (k > 0)
            {
                if (i != 33 && i != 17)
                {
                    k = -k;
                }
                scrollListItemsBy(k);
                flag = true;
            }
            if (mItemsCanFocus && obj == null && view != null && view.hasFocus())
            {
                obj = view.findFocus();
                if (!isViewAncestorOf(((View) (obj)), this) || distanceToView(((View) (obj))) > 0)
                {
                    ((View) (obj)).clearFocus();
                }
            }
            if (j == -1 && view != null && !isViewAncestorOf(view, this))
            {
                hideSelector();
                mResurrectToPosition = -1;
                view = null;
            }
            if (flag)
            {
                if (view != null)
                {
                    positionSelector(l, view);
                    mSelectedStart = view.getTop();
                }
                if (!awakenScrollbarsInternal())
                {
                    invalidate();
                }
                invokeOnItemScrollListener();
                return true;
            }
        }
        return false;
    }

    private boolean awakenScrollbarsInternal()
    {
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            return super.awakenScrollBars();
        } else
        {
            return false;
        }
    }

    private void cancelCheckForLongPress()
    {
        if (mPendingCheckForLongPress == null)
        {
            return;
        } else
        {
            removeCallbacks(mPendingCheckForLongPress);
            return;
        }
    }

    private void cancelCheckForTap()
    {
        if (mPendingCheckForTap == null)
        {
            return;
        } else
        {
            removeCallbacks(mPendingCheckForTap);
            return;
        }
    }

    private void checkFocus()
    {
        boolean flag2 = true;
        ListAdapter listadapter = getAdapter();
        boolean flag;
        boolean flag1;
        if (listadapter != null && listadapter.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && mDesiredFocusableInTouchModeState)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        super.setFocusableInTouchMode(flag1);
        if (flag && mDesiredFocusableState)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        super.setFocusable(flag1);
        if (mEmptyView != null)
        {
            updateEmptyStatus();
        }
    }

    private void checkSelectionChanged()
    {
        if (mSelectedPosition != mOldSelectedPosition || mSelectedRowId != mOldSelectedRowId)
        {
            selectionChanged();
            mOldSelectedPosition = mSelectedPosition;
            mOldSelectedRowId = mSelectedRowId;
        }
    }

    private SparseBooleanArray cloneCheckStates()
    {
        if (mCheckStates == null)
        {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return mCheckStates.clone();
        }
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        for (int i = 0; i < mCheckStates.size(); i++)
        {
            sparsebooleanarray.put(mCheckStates.keyAt(i), mCheckStates.valueAt(i));
        }

        return sparsebooleanarray;
    }

    private boolean contentFits()
    {
        int i = getChildCount();
        if (i != 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        View view;
        View view1;
        if (i != mItemCount)
        {
            return false;
        }
        view = getChildAt(0);
        view1 = getChildAt(i - 1);
        if (!mIsVertical)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (view.getTop() >= getPaddingTop() && view1.getBottom() <= getHeight() - getPaddingBottom()) goto _L1; else goto _L3
_L3:
        return false;
        if (view.getLeft() >= getPaddingLeft() && view1.getRight() <= getWidth() - getPaddingRight()) goto _L1; else goto _L4
_L4:
        return false;
    }

    private void correctTooHigh(int i)
    {
        if ((mFirstPosition + i) - 1 == mItemCount - 1 && i != 0)
        {
            View view = getChildAt(i - 1);
            int j;
            int k;
            int l;
            if (mIsVertical)
            {
                j = view.getBottom();
            } else
            {
                j = view.getRight();
            }
            if (mIsVertical)
            {
                i = getPaddingTop();
            } else
            {
                i = getPaddingLeft();
            }
            if (mIsVertical)
            {
                k = getHeight() - getPaddingBottom();
            } else
            {
                k = getWidth() - getPaddingRight();
            }
            l = k - j;
            view = getChildAt(0);
            if (mIsVertical)
            {
                j = view.getTop();
            } else
            {
                j = view.getLeft();
            }
            if (l > 0 && (mFirstPosition > 0 || j < i))
            {
                k = l;
                if (mFirstPosition == 0)
                {
                    k = Math.min(l, i - j);
                }
                offsetChildren(k);
                if (mFirstPosition > 0)
                {
                    if (mIsVertical)
                    {
                        i = view.getTop();
                    } else
                    {
                        i = view.getLeft();
                    }
                    fillBefore(mFirstPosition - 1, i - mItemMargin);
                    adjustViewsStartOrEnd();
                    return;
                }
            }
        }
    }

    private void correctTooLow(int i)
    {
        if (mFirstPosition == 0 && i != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        View view;
        int l;
        int i1;
        view = getChildAt(0);
        int j;
        int k;
        if (mIsVertical)
        {
            k = view.getTop();
        } else
        {
            k = view.getLeft();
        }
        if (mIsVertical)
        {
            l = getPaddingTop();
        } else
        {
            l = getPaddingLeft();
        }
        if (mIsVertical)
        {
            j = getHeight() - getPaddingBottom();
        } else
        {
            j = getWidth() - getPaddingRight();
        }
        l = k - l;
        view = getChildAt(i - 1);
        if (mIsVertical)
        {
            k = view.getBottom();
        } else
        {
            k = view.getRight();
        }
        i1 = (mFirstPosition + i) - 1;
        if (l <= 0) goto _L1; else goto _L3
_L3:
        if (i1 >= mItemCount - 1 && k <= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == mItemCount - 1)
        {
            i = Math.min(l, k - j);
        } else
        {
            i = l;
        }
        offsetChildren(-i);
        if (i1 >= mItemCount - 1) goto _L1; else goto _L4
_L4:
        if (mIsVertical)
        {
            i = view.getBottom();
        } else
        {
            i = view.getRight();
        }
        fillAfter(i1 + 1, i + mItemMargin);
        adjustViewsStartOrEnd();
        return;
        if (i1 != mItemCount - 1) goto _L1; else goto _L5
_L5:
        adjustViewsStartOrEnd();
        return;
    }

    private android.view.ContextMenu.ContextMenuInfo createContextMenuInfo(View view, int i, long l)
    {
        return new android.widget.AdapterView.AdapterContextMenuInfo(view, i, l);
    }

    private int distanceToView(View view)
    {
        view.getDrawingRect(mTempRect);
        offsetDescendantRectToMyCoords(view, mTempRect);
        int i;
        int j;
        int k;
        int l;
        if (mIsVertical)
        {
            i = getPaddingTop();
        } else
        {
            i = getPaddingLeft();
        }
        if (mIsVertical)
        {
            j = getHeight() - getPaddingBottom();
        } else
        {
            j = getWidth() - getPaddingRight();
        }
        if (mIsVertical)
        {
            k = mTempRect.top;
        } else
        {
            k = mTempRect.left;
        }
        if (mIsVertical)
        {
            l = mTempRect.bottom;
        } else
        {
            l = mTempRect.right;
        }
        if (l < i)
        {
            return i - l;
        }
        if (k > j)
        {
            return k - j;
        } else
        {
            return 0;
        }
    }

    private boolean drawEndEdge(Canvas canvas)
    {
        if (mEndEdge.isFinished())
        {
            return false;
        }
        int i = canvas.save();
        int j = getWidth() - getPaddingLeft() - getPaddingRight();
        int k = getHeight();
        int l = getPaddingTop();
        int i1 = getPaddingBottom();
        boolean flag;
        if (mIsVertical)
        {
            canvas.translate(-j, k - l - i1);
            canvas.rotate(180F, j, 0.0F);
        } else
        {
            canvas.translate(j, 0.0F);
            canvas.rotate(90F);
        }
        flag = mEndEdge.draw(canvas);
        canvas.restoreToCount(i);
        return flag;
    }

    private void drawSelector(Canvas canvas)
    {
        if (!mSelectorRect.isEmpty())
        {
            Drawable drawable = mSelector;
            drawable.setBounds(mSelectorRect);
            drawable.draw(canvas);
        }
    }

    private boolean drawStartEdge(Canvas canvas)
    {
        if (mStartEdge.isFinished())
        {
            return false;
        }
        if (mIsVertical)
        {
            return mStartEdge.draw(canvas);
        } else
        {
            int i = canvas.save();
            canvas.translate(0.0F, getHeight() - getPaddingTop() - getPaddingBottom());
            canvas.rotate(270F);
            boolean flag = mStartEdge.draw(canvas);
            canvas.restoreToCount(i);
            return flag;
        }
    }

    private View fillAfter(int i, int j)
    {
        View view = null;
        int k;
        int l;
        if (mIsVertical)
        {
            k = getHeight() - getPaddingBottom();
            l = i;
        } else
        {
            k = getWidth() - getPaddingRight();
            l = i;
        }
        while (j < k && l < mItemCount) 
        {
            View view1;
            boolean flag;
            if (l == mSelectedPosition)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = makeAndAddView(l, j, true, flag);
            if (mIsVertical)
            {
                i = view1.getBottom() + mItemMargin;
            } else
            {
                i = view1.getRight() + mItemMargin;
            }
            if (flag)
            {
                view = view1;
            }
            l++;
            j = i;
        }
        return view;
    }

    private View fillBefore(int i, int j)
    {
        View view = null;
        int k;
        int l;
        if (mIsVertical)
        {
            k = getPaddingTop();
            l = i;
        } else
        {
            k = getPaddingLeft();
            l = i;
        }
        while (j > k && l >= 0) 
        {
            View view1;
            boolean flag;
            if (l == mSelectedPosition)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = makeAndAddView(l, j, false, flag);
            if (mIsVertical)
            {
                i = view1.getTop() - mItemMargin;
            } else
            {
                i = view1.getLeft() - mItemMargin;
            }
            if (flag)
            {
                view = view1;
            }
            l--;
            j = i;
        }
        mFirstPosition = l + 1;
        return view;
    }

    private void fillBeforeAndAfter(View view, int i)
    {
        int k = mItemMargin;
        int j;
        if (mIsVertical)
        {
            j = view.getTop() - k;
        } else
        {
            j = view.getLeft() - k;
        }
        fillBefore(i - 1, j);
        adjustViewsStartOrEnd();
        if (mIsVertical)
        {
            j = view.getBottom() + k;
        } else
        {
            j = view.getRight() + k;
        }
        fillAfter(i + 1, j);
    }

    private View fillFromMiddle(int i, int j)
    {
        View view;
        int k;
        j -= i;
        k = reconcileSelectedPosition();
        view = makeAndAddView(k, i, true, true);
        mFirstPosition = k;
        if (!mIsVertical) goto _L2; else goto _L1
_L1:
        i = view.getMeasuredHeight();
        if (i <= j)
        {
            view.offsetTopAndBottom((j - i) / 2);
        }
_L4:
        fillBeforeAndAfter(view, k);
        correctTooHigh(getChildCount());
        return view;
_L2:
        i = view.getMeasuredWidth();
        if (i <= j)
        {
            view.offsetLeftAndRight((j - i) / 2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private View fillFromOffset(int i)
    {
        mFirstPosition = Math.min(mFirstPosition, mSelectedPosition);
        mFirstPosition = Math.min(mFirstPosition, mItemCount - 1);
        if (mFirstPosition < 0)
        {
            mFirstPosition = 0;
        }
        return fillAfter(mFirstPosition, i);
    }

    private View fillFromSelection(int i, int j, int k)
    {
        View view;
        int l;
        int i1 = mSelectedPosition;
        view = makeAndAddView(i1, i, true, true);
        if (mIsVertical)
        {
            i = view.getTop();
        } else
        {
            i = view.getLeft();
        }
        if (mIsVertical)
        {
            l = view.getBottom();
        } else
        {
            l = view.getRight();
        }
        if (l <= k) goto _L2; else goto _L1
_L1:
        view.offsetTopAndBottom(-Math.min(i - j, l - k));
_L4:
        fillBeforeAndAfter(view, i1);
        correctTooHigh(getChildCount());
        return view;
_L2:
        if (i < j)
        {
            view.offsetTopAndBottom(Math.min(j - i, k - l));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private View fillSpecific(int i, int j)
    {
        View view;
        View view1;
        View view2;
        int k;
        boolean flag;
        if (i == mSelectedPosition)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = makeAndAddView(i, j, true, flag);
        mFirstPosition = i;
        k = mItemMargin;
        if (mIsVertical)
        {
            j = view.getTop() - k;
        } else
        {
            j = view.getLeft() - k;
        }
        view1 = fillBefore(i - 1, j);
        adjustViewsStartOrEnd();
        if (mIsVertical)
        {
            j = view.getBottom() + k;
        } else
        {
            j = view.getRight() + k;
        }
        view2 = fillAfter(i + 1, j);
        i = getChildCount();
        if (i > 0)
        {
            correctTooHigh(i);
        }
        if (flag)
        {
            return view;
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return view2;
        }
    }

    private int findClosestMotionRowOrColumn(int i)
    {
        int j = getChildCount();
        if (j == 0)
        {
            return -1;
        }
        i = findMotionRowOrColumn(i);
        if (i != -1)
        {
            return i;
        } else
        {
            return (mFirstPosition + j) - 1;
        }
    }

    private int findMotionRowOrColumn(int i)
    {
        int k = getChildCount();
        if (k != 0)
        {
            int j = 0;
            while (j < k) 
            {
                View view = getChildAt(j);
                if (mIsVertical && i <= view.getBottom() || !mIsVertical && i <= view.getRight())
                {
                    return mFirstPosition + j;
                }
                j++;
            }
        }
        return -1;
    }

    private int findSyncPosition()
    {
        ListAdapter listadapter;
        boolean flag;
        int i;
        int i1;
        long l1;
        long l2;
        i1 = mItemCount;
        if (i1 == 0)
        {
            return -1;
        }
        l1 = mSyncRowId;
        if (l1 == 0x8000000000000000L)
        {
            return -1;
        }
        i = Math.min(i1 - 1, Math.max(0, mSyncPosition));
        l2 = SystemClock.uptimeMillis();
        flag = false;
        listadapter = mAdapter;
        if (listadapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_189;
        k = i;
        int l = i;
        j = i;
        i = l;
        while (SystemClock.uptimeMillis() <= l2 + 100L) 
        {
            if (listadapter.getItemId(i) == l1)
            {
                return i;
            }
            if (j == i1 - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (k == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1 && flag2)
            {
                break;
            }
            if (flag2 || flag && !flag1)
            {
                j++;
                flag = false;
                i = j;
            } else
            if (flag1 || !flag && !flag2)
            {
                k--;
                flag = true;
                i = k;
            }
        }
        return -1;
    }

    private void finishEdgeGlows()
    {
        if (mStartEdge != null)
        {
            mStartEdge.finish();
        }
        if (mEndEdge != null)
        {
            mEndEdge.finish();
        }
    }

    private void finishSmoothScrolling()
    {
        mTouchMode = -1;
        reportScrollStateChange(0);
        mScroller.abortAnimation();
        if (mPositionScroller != null)
        {
            mPositionScroller.stop();
        }
    }

    private void fireOnSelected()
    {
        android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener = getOnItemSelectedListener();
        if (onitemselectedlistener == null)
        {
            return;
        }
        int i = getSelectedItemPosition();
        if (i >= 0)
        {
            onitemselectedlistener.onItemSelected(this, getSelectedView(), i, mAdapter.getItemId(i));
            return;
        } else
        {
            onitemselectedlistener.onNothingSelected(this);
            return;
        }
    }

    private void forceValidFocusDirection(int i)
    {
        if (mIsVertical && i != 33 && i != 130)
        {
            throw new IllegalArgumentException("Focus direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN} for vertical orientation");
        }
        if (!mIsVertical && i != 17 && i != 66)
        {
            throw new IllegalArgumentException("Focus direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT} for vertical orientation");
        } else
        {
            return;
        }
    }

    private void forceValidInnerFocusDirection(int i)
    {
        if (mIsVertical && i != 17 && i != 66)
        {
            throw new IllegalArgumentException("Direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT} for vertical orientation");
        }
        if (!mIsVertical && i != 33 && i != 130)
        {
            throw new IllegalArgumentException("direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN} for horizontal orientation");
        } else
        {
            return;
        }
    }

    private int getArrowScrollPreviewLength()
    {
        int i;
        int j;
        if (mIsVertical)
        {
            i = getVerticalFadingEdgeLength();
        } else
        {
            i = getHorizontalFadingEdgeLength();
        }
        j = mItemMargin;
        return Math.max(10, i) + j;
    }

    private int getAvailableSize()
    {
        if (mIsVertical)
        {
            return getHeight() - getPaddingBottom() - getPaddingTop();
        } else
        {
            return getWidth() - getPaddingRight() - getPaddingLeft();
        }
    }

    private int getChildEndEdge(View view)
    {
        if (mIsVertical)
        {
            return view.getBottom();
        } else
        {
            return view.getRight();
        }
    }

    private int getChildHeightMeasureSpec(LayoutParams layoutparams)
    {
        if (mIsVertical && layoutparams.height == -2)
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (!mIsVertical)
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(getHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000);
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
    }

    private int getChildSize(View view)
    {
        if (mIsVertical)
        {
            return view.getHeight();
        } else
        {
            return view.getWidth();
        }
    }

    private int getChildStartEdge(View view)
    {
        if (mIsVertical)
        {
            return view.getTop();
        } else
        {
            return view.getLeft();
        }
    }

    private int getChildWidthMeasureSpec(LayoutParams layoutparams)
    {
        if (!mIsVertical && layoutparams.width == -2)
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (mIsVertical)
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
    }

    private final float getCurrVelocity()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return mScroller.getCurrVelocity();
        } else
        {
            return 0.0F;
        }
    }

    private static int getDistance(Rect rect, Rect rect1, int i)
    {
        i;
        JVM INSTR lookupswitch 6: default 60
    //                   1: 246
    //                   2: 246
    //                   17: 166
    //                   33: 205
    //                   66: 71
    //                   130: 125;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
_L5:
        int j;
        int k;
        int l;
        j = rect.right;
        l = rect.top + rect.height() / 2;
        i = rect1.left;
        k = rect1.top + rect1.height() / 2;
_L8:
        i -= j;
        j = k - l;
        return i * i + j * j;
_L6:
        i = rect.left;
        j = rect.width() / 2 + i;
        l = rect.bottom;
        i = rect1.left + rect1.width() / 2;
        k = rect1.top;
        continue; /* Loop/switch isn't completed */
_L3:
        j = rect.left;
        l = rect.top + rect.height() / 2;
        i = rect1.right;
        k = rect1.top + rect1.height() / 2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = rect.left;
        j = rect.width() / 2 + i;
        l = rect.top;
        i = rect1.left + rect1.width() / 2;
        k = rect1.bottom;
        continue; /* Loop/switch isn't completed */
_L2:
        i = rect.right;
        j = rect.width() / 2 + i;
        l = rect.top + rect.height() / 2;
        i = rect1.left + rect1.width() / 2;
        k = rect1.top + rect1.height() / 2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int getEndEdge()
    {
        if (mIsVertical)
        {
            return getHeight() - getPaddingBottom();
        } else
        {
            return getWidth() - getPaddingRight();
        }
    }

    private int getScaledOverscrollDistance(ViewConfiguration viewconfiguration)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return 0;
        } else
        {
            return viewconfiguration.getScaledOverscrollDistance();
        }
    }

    private int getSize()
    {
        if (mIsVertical)
        {
            return getHeight();
        } else
        {
            return getWidth();
        }
    }

    private int getStartEdge()
    {
        if (mIsVertical)
        {
            return getPaddingTop();
        } else
        {
            return getPaddingLeft();
        }
    }

    private void handleDataChanged()
    {
        int i1;
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0 && mAdapter != null && mAdapter.hasStableIds())
        {
            confirmCheckedPositionsById();
        }
        mRecycler.clearTransientStateViews();
        i1 = mItemCount;
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        if (!mNeedSync) goto _L4; else goto _L3
_L3:
        mNeedSync = false;
        mPendingSync = null;
        mSyncMode;
        JVM INSTR tableswitch 0 1: default 96
    //                   0 144
    //                   1 231;
           goto _L4 _L5 _L6
_L4:
        if (isInTouchMode()) goto _L8; else goto _L7
_L7:
        int i;
        int l;
        l = getSelectedItemPosition();
        i = l;
        if (l >= i1)
        {
            i = i1 - 1;
        }
        l = i;
        if (i < 0)
        {
            l = 0;
        }
        i = lookForSelectablePosition(l, true);
        if (i < 0) goto _L10; else goto _L9
_L9:
        setNextSelectedPositionInt(i);
_L11:
        return;
_L5:
        if (isInTouchMode())
        {
            mLayoutMode = 5;
            mSyncPosition = Math.min(Math.max(0, mSyncPosition), i1 - 1);
            return;
        }
        int j = findSyncPosition();
        if (j >= 0 && lookForSelectablePosition(j, true) == j)
        {
            mSyncPosition = j;
            if (mSyncHeight == (long)getHeight())
            {
                mLayoutMode = 5;
            } else
            {
                mLayoutMode = 2;
            }
            setNextSelectedPositionInt(j);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        mLayoutMode = 5;
        mSyncPosition = Math.min(Math.max(0, mSyncPosition), i1 - 1);
        return;
_L10:
        int k = lookForSelectablePosition(l, false);
        if (k >= 0)
        {
            setNextSelectedPositionInt(k);
            return;
        }
        break; /* Loop/switch isn't completed */
_L8:
        if (mResurrectToPosition >= 0) goto _L11; else goto _L2
_L2:
        mLayoutMode = 1;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mNeedSync = false;
        mPendingSync = null;
        mSelectorPosition = -1;
        checkSelectionChanged();
        return;
        if (true) goto _L4; else goto _L12
_L12:
    }

    private void handleDragChange(int i)
    {
        Object obj = getParent();
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
        }
        int j;
        int k;
        boolean flag;
        if (mMotionPosition >= 0)
        {
            k = mMotionPosition - mFirstPosition;
        } else
        {
            k = getChildCount() / 2;
        }
        j = 0;
        obj = getChildAt(k);
        if (obj != null)
        {
            if (mIsVertical)
            {
                j = ((View) (obj)).getTop();
            } else
            {
                j = ((View) (obj)).getLeft();
            }
        }
        flag = scrollListItemsBy(i);
        obj = getChildAt(k);
        if (obj != null)
        {
            if (mIsVertical)
            {
                k = ((View) (obj)).getTop();
            } else
            {
                k = ((View) (obj)).getLeft();
            }
            if (flag)
            {
                updateOverScrollState(i, -i - (k - j));
            }
        }
    }

    private boolean handleFocusWithinItem(int i)
    {
        forceValidInnerFocusDirection(i);
        int j = getChildCount();
        if (mItemsCanFocus && j > 0 && mSelectedPosition != -1)
        {
            View view1 = getSelectedView();
            if (view1 != null && view1.hasFocus() && (view1 instanceof ViewGroup))
            {
                View view = view1.findFocus();
                view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)view1, view, i);
                if (view1 != null)
                {
                    view.getFocusedRect(mTempRect);
                    offsetDescendantRectToMyCoords(view, mTempRect);
                    offsetRectIntoDescendantCoords(view1, mTempRect);
                    if (view1.requestFocus(i, mTempRect))
                    {
                        return true;
                    }
                }
                view = FocusFinder.getInstance().findNextFocus((ViewGroup)getRootView(), view, i);
                if (view != null)
                {
                    return isViewAncestorOf(view, this);
                }
            }
        }
        return false;
    }

    private boolean handleKeyEvent(int i, int j, KeyEvent keyevent)
    {
        char c;
        byte byte0;
        boolean flag2;
        c = 'B';
        byte0 = 33;
        flag2 = true;
        if (mAdapter != null && mIsAttached) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L15:
        return flag1;
_L2:
        int k;
        if (mDataChanged)
        {
            layoutChildren();
        }
        k = keyevent.getAction();
        if (k == 1) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR lookupswitch 11: default 152
    //                   19: 194
    //                   20: 232
    //                   21: 272
    //                   22: 310
    //                   23: 348
    //                   62: 402
    //                   66: 348
    //                   92: 484
    //                   93: 583
    //                   122: 678
    //                   123: 727;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L9 _L11 _L12 _L13 _L14
_L4:
        boolean flag = false;
_L16:
        flag1 = flag2;
        if (!flag)
        {
            switch (k)
            {
            default:
                return false;

            case 0: // '\0'
                return super.onKeyDown(i, keyevent);

            case 1: // '\001'
                flag1 = flag2;
                if (isEnabled())
                {
                    if (isClickable() && isPressed() && mSelectedPosition >= 0 && mAdapter != null && mSelectedPosition < mAdapter.getCount())
                    {
                        keyevent = getChildAt(mSelectedPosition - mFirstPosition);
                        if (keyevent != null)
                        {
                            performItemClick(keyevent, mSelectedPosition, mSelectedRowId);
                            keyevent.setPressed(false);
                        }
                        setPressed(false);
                        return true;
                    } else
                    {
                        return false;
                    }
                }
                break;

            case 2: // '\002'
                return super.onKeyMultiple(i, j, keyevent);
            }
        }
          goto _L15
_L5:
        if (!mIsVertical)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = handleKeyScroll(keyevent, j, 33);
          goto _L16
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L17
_L17:
        flag = handleFocusWithinItem(33);
          goto _L16
_L6:
        if (!mIsVertical)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = handleKeyScroll(keyevent, j, 130);
          goto _L16
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L18
_L18:
        flag = handleFocusWithinItem(130);
          goto _L16
_L7:
        if (mIsVertical)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = handleKeyScroll(keyevent, j, 17);
          goto _L16
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L19
_L19:
        flag = handleFocusWithinItem(17);
          goto _L16
_L8:
        if (mIsVertical)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = handleKeyScroll(keyevent, j, 66);
          goto _L16
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L20
_L20:
        flag = handleFocusWithinItem(66);
          goto _L16
_L9:
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L21
_L21:
        flag1 = resurrectSelectionIfNeeded();
        flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (keyevent.getRepeatCount() == 0)
            {
                flag = flag1;
                if (getChildCount() > 0)
                {
                    keyPressed();
                    flag = true;
                }
            }
        }
          goto _L16
_L10:
        if (KeyEventCompat.hasNoModifiers(keyevent))
        {
            if (!resurrectSelectionIfNeeded())
            {
                if (mIsVertical)
                {
                    c = '\202';
                }
                pageScroll(c);
            }
        } else
        if (KeyEventCompat.hasModifiers(keyevent, 1) && !resurrectSelectionIfNeeded())
        {
            if (mIsVertical)
            {
                c = '!';
            } else
            {
                c = '\021';
            }
            fullScroll(c);
        }
        flag = true;
          goto _L16
_L11:
        if (!KeyEventCompat.hasNoModifiers(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (resurrectSelectionIfNeeded()) goto _L23; else goto _L22
_L22:
        if (!mIsVertical)
        {
            byte0 = 17;
        }
        if (!pageScroll(byte0)) goto _L24; else goto _L23
_L23:
        flag = true;
          goto _L16
_L24:
        flag = false;
          goto _L16
        if (!KeyEventCompat.hasModifiers(keyevent, 2)) goto _L4; else goto _L25
_L25:
        if (resurrectSelectionIfNeeded()) goto _L27; else goto _L26
_L26:
        if (!mIsVertical)
        {
            byte0 = 17;
        }
        if (!fullScroll(byte0)) goto _L28; else goto _L27
_L27:
        flag = true;
          goto _L16
_L28:
        flag = false;
          goto _L16
_L12:
        if (!KeyEventCompat.hasNoModifiers(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (resurrectSelectionIfNeeded()) goto _L30; else goto _L29
_L29:
        if (mIsVertical)
        {
            c = '\202';
        }
        if (!pageScroll(c)) goto _L31; else goto _L30
_L30:
        flag = true;
          goto _L16
_L31:
        flag = false;
          goto _L16
        if (!KeyEventCompat.hasModifiers(keyevent, 2)) goto _L4; else goto _L32
_L32:
        if (resurrectSelectionIfNeeded()) goto _L34; else goto _L33
_L33:
        if (mIsVertical)
        {
            c = '\202';
        }
        if (!fullScroll(c)) goto _L35; else goto _L34
_L34:
        flag = true;
          goto _L16
_L35:
        flag = false;
          goto _L16
_L13:
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L36
_L36:
        if (resurrectSelectionIfNeeded()) goto _L38; else goto _L37
_L37:
        if (!mIsVertical)
        {
            byte0 = 17;
        }
        if (!fullScroll(byte0)) goto _L39; else goto _L38
_L38:
        flag = true;
          goto _L16
_L39:
        flag = false;
          goto _L16
_L14:
        if (!KeyEventCompat.hasNoModifiers(keyevent)) goto _L4; else goto _L40
_L40:
        if (resurrectSelectionIfNeeded()) goto _L42; else goto _L41
_L41:
        if (mIsVertical)
        {
            c = '\202';
        }
        if (!fullScroll(c)) goto _L43; else goto _L42
_L42:
        flag = true;
          goto _L16
_L43:
        flag = false;
          goto _L16
    }

    private boolean handleKeyScroll(KeyEvent keyevent, int i, int j)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (KeyEventCompat.hasNoModifiers(keyevent))
            {
                flag1 = resurrectSelectionIfNeeded();
                flag = flag1;
                if (!flag1)
                {
                    do
                    {
                        flag = flag1;
                        if (i <= 0)
                        {
                            break;
                        }
                        flag = flag1;
                        if (!arrowScroll(j))
                        {
                            break;
                        }
                        flag1 = true;
                        i--;
                    } while (true);
                }
                break label0;
            }
            flag = flag1;
            if (!KeyEventCompat.hasModifiers(keyevent, 2))
            {
                break label0;
            }
            if (!resurrectSelectionIfNeeded())
            {
                flag = flag1;
                if (!fullScroll(j))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private void handleNewSelectionChange(View view, int i, int j, boolean flag)
    {
        boolean flag3 = true;
        forceValidFocusDirection(i);
        if (j == -1)
        {
            throw new IllegalArgumentException("newSelectedPosition needs to be valid");
        }
        int k = mSelectedPosition - mFirstPosition;
        j -= mFirstPosition;
        View view1;
        View view2;
        int l;
        if (i == 33 || i == 17)
        {
            view2 = getChildAt(j);
            boolean flag1 = true;
            i = k;
            view1 = view;
            k = j;
            j = i;
            i = ((flag1) ? 1 : 0);
        } else
        {
            view1 = getChildAt(j);
            i = 0;
            view2 = view;
        }
        l = getChildCount();
        if (view2 != null)
        {
            boolean flag2;
            if (!flag && i != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            view2.setSelected(flag2);
            measureAndAdjustDown(view2, k, l);
        }
        if (view1 != null)
        {
            if (!flag && i == 0)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            measureAndAdjustDown(view1, j, l);
        }
    }

    private void handleOverScrollChange(int i)
    {
        int k = mOverScroll;
        int l = k - i;
        int j = -i;
        if (l < 0 && k >= 0 || l > 0 && k <= 0)
        {
            k = -k;
            j = i + k;
            i = k;
        } else
        {
            boolean flag = false;
            i = j;
            j = ((flag) ? 1 : 0);
        }
        if (i != 0)
        {
            updateOverScrollState(j, i);
        }
        if (j != 0)
        {
            if (mOverScroll != 0)
            {
                mOverScroll = 0;
                ViewCompat.postInvalidateOnAnimation(this);
            }
            scrollListItemsBy(j);
            mTouchMode = 3;
            mMotionPosition = findClosestMotionRowOrColumn((int)mLastTouchPos);
            mTouchRemainderPos = 0.0F;
        }
    }

    private void hideSelector()
    {
        if (mSelectedPosition != -1)
        {
            if (mLayoutMode != 4)
            {
                mResurrectToPosition = mSelectedPosition;
            }
            if (mNextSelectedPosition >= 0 && mNextSelectedPosition != mSelectedPosition)
            {
                mResurrectToPosition = mNextSelectedPosition;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            mSelectedStart = 0;
        }
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

    private void invokeOnItemScrollListener()
    {
        if (mOnScrollListener != null)
        {
            mOnScrollListener.onScroll(this, mFirstPosition, getChildCount(), mItemCount);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    private boolean isViewAncestorOf(View view, View view1)
    {
        if (view == view1)
        {
            return true;
        }
        view = view.getParent();
        return (view instanceof ViewGroup) && isViewAncestorOf((View)view, view1);
    }

    private void keyPressed()
    {
        if (isEnabled() && isClickable()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Drawable drawable;
        drawable = mSelector;
        Object obj = mSelectorRect;
        if (drawable == null || !isFocused() && !touchModeDrawsInPressedState() || ((Rect) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = getChildAt(mSelectedPosition - mFirstPosition);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((View) (obj)).hasFocusable())
        {
            continue; /* Loop/switch isn't completed */
        }
        ((View) (obj)).setPressed(true);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        setPressed(true);
        boolean flag = isLongClickable();
        drawable = drawable.getCurrent();
        if (drawable != null && (drawable instanceof TransitionDrawable))
        {
            if (flag)
            {
                ((TransitionDrawable)drawable).startTransition(ViewConfiguration.getLongPressTimeout());
            } else
            {
                ((TransitionDrawable)drawable).resetTransition();
            }
        }
        if (flag && !mDataChanged)
        {
            if (mPendingCheckForKeyLongPress == null)
            {
                mPendingCheckForKeyLongPress = new CheckForKeyLongPress(null);
            }
            mPendingCheckForKeyLongPress.rememberWindowAttachCount();
            postDelayed(mPendingCheckForKeyLongPress, ViewConfiguration.getLongPressTimeout());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void layoutChildren()
    {
        if (getWidth() != 0 && getHeight() != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        return;
_L2:
        if (flag = mBlockLayoutRequests) goto _L1; else goto _L3
_L3:
        mBlockLayoutRequests = true;
        invalidate();
        if (mAdapter != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        resetState();
        if (flag) goto _L1; else goto _L4
_L4:
        mBlockLayoutRequests = false;
        mDataChanged = false;
        return;
        if (!mIsVertical) goto _L6; else goto _L5
_L5:
        int i = getPaddingTop();
_L17:
        if (!mIsVertical) goto _L8; else goto _L7
_L7:
        int k = getHeight() - getPaddingBottom();
_L18:
        int i1 = getChildCount();
        Object obj;
        View view;
        View view2;
        View view3;
        int j;
        int l;
        l = 0;
        j = 0;
        view2 = null;
        view3 = null;
        obj = null;
        view = null;
        mLayoutMode;
        JVM INSTR tableswitch 1 5: default 1201
    //                   1 1204
    //                   2 288
    //                   3 1204
    //                   4 1204
    //                   5 1204;
           goto _L9 _L10 _L11 _L10 _L10 _L10
_L9:
        l = mSelectedPosition - mFirstPosition;
        View view1;
        view1 = ((View) (obj));
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        view1 = ((View) (obj));
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        view1 = getChildAt(l);
        obj = getChildAt(0);
        if (mNextSelectedPosition >= 0)
        {
            j = mNextSelectedPosition - mSelectedPosition;
        }
        view = getChildAt(l + j);
        view3 = view1;
_L21:
        boolean flag1 = mDataChanged;
        if (!flag1) goto _L13; else goto _L12
_L12:
        handleDataChanged();
_L13:
        if (mItemCount != 0) goto _L15; else goto _L14
_L14:
        resetState();
        if (flag) goto _L1; else goto _L16
_L16:
        mBlockLayoutRequests = false;
        mDataChanged = false;
        return;
_L6:
        i = getPaddingLeft();
          goto _L17
_L8:
        k = getWidth() - getPaddingRight();
          goto _L18
_L11:
        j = mNextSelectedPosition - mFirstPosition;
        if (j < 0 || j >= i1) goto _L20; else goto _L19
_L19:
        view = getChildAt(j);
        obj = null;
        j = l;
          goto _L21
_L15:
        if (mItemCount != mAdapter.getCount())
        {
            throw new IllegalStateException((new StringBuilder("The content of the adapter has changed but TwoWayView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in TwoWayView(")).append(getId()).append(", ").append(getClass()).append(") with Adapter(").append(mAdapter.getClass()).append(")]count: ").append(mItemCount).append(" != ").append(mAdapter.getCount()).toString());
        }
          goto _L22
        obj;
        if (!flag)
        {
            mBlockLayoutRequests = false;
            mDataChanged = false;
        }
        throw obj;
_L22:
        setSelectedPositionInt(mNextSelectedPosition);
        view1 = null;
        RecycleBin recyclebin;
        int j1;
        j1 = mFirstPosition;
        recyclebin = mRecycler;
        if (!flag1) goto _L24; else goto _L23
_L23:
        l = 0;
_L26:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        recyclebin.addScrapView(getChildAt(l), j1 + l);
        l++;
        if (true) goto _L26; else goto _L25
_L24:
        recyclebin.fillActiveViews(i1, j1);
_L25:
        View view4 = getFocusedChild();
        if (view4 == null) goto _L28; else goto _L27
_L27:
        if (flag1) goto _L30; else goto _L29
_L29:
        view2 = findFocus();
        if (view2 == null) goto _L32; else goto _L31
_L31:
        view2.onStartTemporaryDetach();
          goto _L32
_L30:
        requestFocus();
        view4 = view1;
        view1 = view2;
        view2 = view4;
_L84:
        detachAllViewsFromParent();
        mLayoutMode;
        JVM INSTR tableswitch 1 6: default 1219
    //                   1 894
    //                   2 806
    //                   3 874
    //                   4 913
    //                   5 858
    //                   6 929;
           goto _L33 _L34 _L35 _L36 _L37 _L38 _L39
_L33:
        if (i1 != 0) goto _L41; else goto _L40
_L40:
        setSelectedPositionInt(lookForSelectablePosition(0));
        obj = fillFromOffset(i);
_L62:
        recyclebin.scrapActiveViews();
        if (obj == null) goto _L43; else goto _L42
_L42:
        if (!mItemsCanFocus || !hasFocus() || ((View) (obj)).hasFocus()) goto _L45; else goto _L44
_L44:
        if (obj != view2 || view1 == null) goto _L47; else goto _L46
_L46:
        if (view1.requestFocus()) goto _L48; else goto _L47
_L47:
        if (!((View) (obj)).requestFocus()) goto _L49; else goto _L48
_L85:
        if (i != 0) goto _L51; else goto _L50
_L50:
        view = getFocusedChild();
        if (view == null) goto _L53; else goto _L52
_L52:
        view.clearFocus();
_L53:
        positionSelector(-1, ((View) (obj)));
_L76:
        if (!mIsVertical) goto _L55; else goto _L54
_L54:
        i = ((View) (obj)).getTop();
_L77:
        mSelectedStart = i;
_L83:
        if (view1 == null) goto _L57; else goto _L56
_L56:
        if (view1.getWindowToken() != null)
        {
            view1.onFinishTemporaryDetach();
        }
_L57:
        mLayoutMode = 0;
        mDataChanged = false;
        mNeedSync = false;
        setNextSelectedPositionInt(mSelectedPosition);
        if (mItemCount > 0)
        {
            checkSelectionChanged();
        }
        invokeOnItemScrollListener();
        if (!flag)
        {
            mBlockLayoutRequests = false;
            mDataChanged = false;
            return;
        }
          goto _L1
_L35:
        if (view == null) goto _L59; else goto _L58
_L58:
        if (!mIsVertical) goto _L61; else goto _L60
_L60:
        j = view.getTop();
_L63:
        obj = fillFromSelection(j, i, k);
          goto _L62
_L61:
        j = view.getLeft();
          goto _L63
_L59:
        obj = fillFromMiddle(i, k);
          goto _L62
_L38:
        obj = fillSpecific(mSyncPosition, mSpecificStart);
          goto _L62
_L36:
        obj = fillBefore(mItemCount - 1, k);
        adjustViewsStartOrEnd();
          goto _L62
_L34:
        mFirstPosition = 0;
        obj = fillFromOffset(i);
        adjustViewsStartOrEnd();
          goto _L62
_L37:
        obj = fillSpecific(reconcileSelectedPosition(), mSpecificStart);
          goto _L62
_L39:
        obj = moveSelection(view3, view, j, i, k);
          goto _L62
_L41:
        if (mSelectedPosition < 0 || mSelectedPosition >= mItemCount) goto _L65; else goto _L64
_L64:
        if (view3 == null) goto _L67; else goto _L66
_L66:
        if (!mIsVertical) goto _L69; else goto _L68
_L68:
        i = view3.getTop();
_L67:
        obj = fillSpecific(mSelectedPosition, i);
          goto _L62
_L69:
        i = view3.getLeft();
          goto _L67
_L65:
        if (mFirstPosition >= mItemCount) goto _L71; else goto _L70
_L70:
        if (obj == null) goto _L73; else goto _L72
_L72:
        if (!mIsVertical) goto _L75; else goto _L74
_L74:
        i = ((View) (obj)).getTop();
_L73:
        obj = fillSpecific(mFirstPosition, i);
          goto _L62
_L75:
        i = ((View) (obj)).getLeft();
          goto _L73
_L71:
        obj = fillSpecific(0, i);
          goto _L62
_L51:
        ((View) (obj)).setSelected(false);
        mSelectorRect.setEmpty();
          goto _L76
_L45:
        positionSelector(-1, ((View) (obj)));
          goto _L76
_L55:
        i = ((View) (obj)).getLeft();
          goto _L77
_L43:
        if (mTouchMode <= 0 || mTouchMode >= 3) goto _L79; else goto _L78
_L78:
        obj = getChildAt(mMotionPosition - mFirstPosition);
        if (obj == null) goto _L81; else goto _L80
_L80:
        positionSelector(mMotionPosition, ((View) (obj)));
_L81:
        if (!hasFocus() || view1 == null) goto _L83; else goto _L82
_L82:
        view1.requestFocus();
          goto _L83
_L79:
        mSelectedStart = 0;
        mSelectorRect.setEmpty();
          goto _L81
_L28:
        view1 = null;
        view2 = null;
          goto _L84
_L20:
        obj = null;
        j = l;
          goto _L21
_L10:
        obj = null;
        j = l;
          goto _L21
_L32:
        view1 = view4;
          goto _L30
_L48:
        i = 1;
          goto _L85
_L49:
        i = 0;
          goto _L85
    }

    private int lookForSelectablePosition(int i)
    {
        return lookForSelectablePosition(i, true);
    }

    private int lookForSelectablePosition(int i, boolean flag)
    {
        ListAdapter listadapter = mAdapter;
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int k;
        k = mItemCount;
        if (mAreAllItemsSelectable)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (flag)
        {
            j = Math.max(0, i);
            do
            {
                i = j;
                if (j >= k)
                {
                    break;
                }
                i = j;
                if (listadapter.isEnabled(j))
                {
                    break;
                }
                j++;
            } while (true);
        } else
        {
            j = Math.min(i, k - 1);
            do
            {
                i = j;
                if (j < 0)
                {
                    break;
                }
                i = j;
                if (listadapter.isEnabled(j))
                {
                    break;
                }
                j--;
            } while (true);
        }
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i < k) goto _L4; else goto _L3
_L3:
        return -1;
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i < k) goto _L4; else goto _L5
_L5:
        return -1;
    }

    private int lookForSelectablePositionOnScreen(int i)
    {
        ListAdapter listadapter;
        int k;
        forceValidFocusDirection(i);
        k = mFirstPosition;
        listadapter = getAdapter();
        if (i != 130 && i != 66) goto _L2; else goto _L1
_L1:
        int j;
        if (mSelectedPosition != -1)
        {
            j = mSelectedPosition + 1;
        } else
        {
            j = k;
        }
        if (j < listadapter.getCount()) goto _L4; else goto _L3
_L3:
        j = -1;
_L6:
        return j;
_L4:
        int l;
        i = j;
        if (j < k)
        {
            i = k;
        }
        l = getLastVisiblePosition();
_L7:
        if (i > l)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (!listadapter.isEnabled(i))
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (getChildAt(i - k).getVisibility() == 0) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L2:
        j = (getChildCount() + k) - 1;
        if (mSelectedPosition != -1)
        {
            i = mSelectedPosition - 1;
        } else
        {
            i = (getChildCount() + k) - 1;
        }
        if (i < 0 || i >= listadapter.getCount())
        {
            return -1;
        }
        if (i > j)
        {
            i = j;
        }
_L11:
        if (i < k) goto _L9; else goto _L8
_L8:
        if (!listadapter.isEnabled(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        if (getChildAt(i - k).getVisibility() == 0) goto _L6; else goto _L10
_L10:
        i--;
          goto _L11
_L9:
        return -1;
    }

    private View makeAndAddView(int i, int j, boolean flag, boolean flag1)
    {
        int k;
        if (mIsVertical)
        {
            k = getPaddingLeft();
        } else
        {
            int l = getPaddingTop();
            k = j;
            j = l;
        }
        if (!mDataChanged)
        {
            View view = mRecycler.getActiveView(i);
            if (view != null)
            {
                setupChild(view, i, j, k, flag, flag1, true);
                return view;
            }
        }
        View view1 = obtainView(i, mIsScrap);
        setupChild(view1, i, j, k, flag, flag1, mIsScrap[0]);
        return view1;
    }

    private void maybeScroll(int i)
    {
        if (mTouchMode == 3)
        {
            handleDragChange(i);
        } else
        if (mTouchMode == 5)
        {
            handleOverScrollChange(i);
            return;
        }
    }

    private boolean maybeStartScrolling(int i)
    {
        boolean flag;
        if (mOverScroll != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(i) <= mTouchSlop && !flag)
        {
            return false;
        }
        Object obj;
        if (flag)
        {
            mTouchMode = 5;
        } else
        {
            mTouchMode = 3;
        }
        obj = getParent();
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
        }
        cancelCheckForLongPress();
        setPressed(false);
        obj = getChildAt(mMotionPosition - mFirstPosition);
        if (obj != null)
        {
            ((View) (obj)).setPressed(false);
        }
        reportScrollStateChange(1);
        return true;
    }

    private void measureAndAdjustDown(View view, int i, int j)
    {
        int k = view.getHeight();
        measureChild(view);
        if (view.getMeasuredHeight() != k)
        {
            relayoutMeasuredChild(view);
            int l = view.getMeasuredHeight();
            i++;
            while (i < j) 
            {
                getChildAt(i).offsetTopAndBottom(l - k);
                i++;
            }
        }
    }

    private void measureChild(View view)
    {
        measureChild(view, (LayoutParams)view.getLayoutParams());
    }

    private void measureChild(View view, LayoutParams layoutparams)
    {
        view.measure(getChildWidthMeasureSpec(layoutparams), getChildHeightMeasureSpec(layoutparams));
    }

    private int measureHeightOfChildren(int i, int j, int k, int l, int i1)
    {
        Object obj;
        int j1;
        int k1;
        j1 = getPaddingTop();
        k1 = getPaddingBottom();
        obj = mAdapter;
        if (obj != null) goto _L2; else goto _L1
_L1:
        j = j1 + k1;
_L4:
        return j;
_L2:
        int i2 = k1 + j1;
        int j2 = mItemMargin;
        int l1 = 0;
        j1 = k;
        if (k == -1)
        {
            j1 = ((ListAdapter) (obj)).getCount() - 1;
        }
        obj = mRecycler;
        boolean flag = recycleOnMeasure();
        boolean aflag[] = mIsScrap;
        k1 = j;
        k = i2;
        for (j = l1; k1 <= j1; j = l1)
        {
            View view = obtainView(k1, aflag);
            measureScrapChild(view, k1, i);
            l1 = k;
            if (k1 > 0)
            {
                l1 = k + j2;
            }
            if (flag)
            {
                ((RecycleBin) (obj)).addScrapView(view, -1);
            }
            k = l1 + view.getMeasuredHeight();
            if (k >= l)
            {
                if (i1 < 0 || k1 <= i1 || j <= 0 || k == l)
                {
                    return l;
                }
                continue; /* Loop/switch isn't completed */
            }
            l1 = j;
            if (i1 >= 0)
            {
                l1 = j;
                if (k1 >= i1)
                {
                    l1 = k;
                }
            }
            k1++;
        }

        return k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void measureScrapChild(View view, int i, int j)
    {
        LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
        LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = generateDefaultLayoutParams();
            view.setLayoutParams(layoutparams);
        }
        layoutparams.viewType = mAdapter.getItemViewType(i);
        layoutparams.forceAdd = true;
        int k;
        if (mIsVertical)
        {
            k = getChildHeightMeasureSpec(layoutparams);
            i = j;
        } else
        {
            i = getChildWidthMeasureSpec(layoutparams);
            k = j;
        }
        view.measure(i, k);
    }

    private int measureWidthOfChildren(int i, int j, int k, int l, int i1)
    {
        Object obj;
        int j1;
        int k1;
        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        obj = mAdapter;
        if (obj != null) goto _L2; else goto _L1
_L1:
        j = j1 + k1;
_L4:
        return j;
_L2:
        int i2 = k1 + j1;
        int j2 = mItemMargin;
        int l1 = 0;
        j1 = k;
        if (k == -1)
        {
            j1 = ((ListAdapter) (obj)).getCount() - 1;
        }
        obj = mRecycler;
        boolean flag = recycleOnMeasure();
        boolean aflag[] = mIsScrap;
        k1 = j;
        k = i2;
        for (j = l1; k1 <= j1; j = l1)
        {
            View view = obtainView(k1, aflag);
            measureScrapChild(view, k1, i);
            l1 = k;
            if (k1 > 0)
            {
                l1 = k + j2;
            }
            if (flag)
            {
                ((RecycleBin) (obj)).addScrapView(view, -1);
            }
            k = l1 + view.getMeasuredHeight();
            if (k >= l)
            {
                if (i1 < 0 || k1 <= i1 || j <= 0 || k == l)
                {
                    return l;
                }
                continue; /* Loop/switch isn't completed */
            }
            l1 = j;
            if (i1 >= 0)
            {
                l1 = j;
                if (k1 >= i1)
                {
                    l1 = k;
                }
            }
            k1++;
        }

        return k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private View moveSelection(View view, View view1, int i, int j, int k)
    {
        int k1 = mSelectedPosition;
        int l;
        int i1;
        if (mIsVertical)
        {
            l = view.getTop();
        } else
        {
            l = view.getLeft();
        }
        if (mIsVertical)
        {
            i1 = view.getBottom();
        } else
        {
            i1 = view.getRight();
        }
        if (i > 0)
        {
            view = makeAndAddView(k1 - 1, l, true, false);
            int l1 = mItemMargin;
            view1 = makeAndAddView(k1, i1 + l1, true, true);
            if (mIsVertical)
            {
                i = view1.getTop();
            } else
            {
                i = view1.getLeft();
            }
            if (mIsVertical)
            {
                l = view1.getBottom();
            } else
            {
                l = view1.getRight();
            }
            if (l > k)
            {
                i1 = (k - j) / 2;
                j = Math.min(Math.min(i - j, l - k), i1);
                if (mIsVertical)
                {
                    view.offsetTopAndBottom(-j);
                    view1.offsetTopAndBottom(-j);
                } else
                {
                    view.offsetLeftAndRight(-j);
                    view1.offsetLeftAndRight(-j);
                }
            }
            fillBefore(mSelectedPosition - 2, i - l1);
            adjustViewsStartOrEnd();
            fillAfter(mSelectedPosition + 1, l + l1);
            return view1;
        }
        if (i < 0)
        {
            if (view1 != null)
            {
                int j1;
                if (mIsVertical)
                {
                    i = view1.getTop();
                } else
                {
                    i = view1.getLeft();
                }
                view = makeAndAddView(k1, i, true, true);
            } else
            {
                view = makeAndAddView(k1, l, false, true);
            }
            if (mIsVertical)
            {
                i = view.getTop();
            } else
            {
                i = view.getLeft();
            }
            if (mIsVertical)
            {
                l = view.getBottom();
            } else
            {
                l = view.getRight();
            }
            if (i < j)
            {
                j1 = (k - j) / 2;
                i = Math.min(Math.min(j - i, k - l), j1);
                if (mIsVertical)
                {
                    view.offsetTopAndBottom(i);
                } else
                {
                    view.offsetLeftAndRight(i);
                }
            }
            fillBeforeAndAfter(view, k1);
            return view;
        }
        view = makeAndAddView(k1, l, true, true);
        if (mIsVertical)
        {
            i = view.getTop();
        } else
        {
            i = view.getLeft();
        }
        if (mIsVertical)
        {
            k = view.getBottom();
        } else
        {
            k = view.getRight();
        }
        if (l < j && k < j + 20)
        {
            if (mIsVertical)
            {
                view.offsetTopAndBottom(j - i);
            } else
            {
                view.offsetLeftAndRight(j - i);
            }
        }
        fillBeforeAndAfter(view, k1);
        return view;
    }

    private View obtainView(int i, boolean aflag[])
    {
        Object obj;
        Object obj1;
        aflag[0] = false;
        obj = mRecycler.getTransientStateView(i);
        if (obj != null)
        {
            return ((View) (obj));
        }
        obj1 = mRecycler.getScrapView(i);
        if (obj1 != null)
        {
            obj = mAdapter.getView(i, ((View) (obj1)), this);
            if (obj != obj1)
            {
                mRecycler.addScrapView(((View) (obj1)), i);
                aflag = ((boolean []) (obj));
            } else
            {
                aflag[0] = true;
                aflag = ((boolean []) (obj));
            }
        } else
        {
            aflag = mAdapter.getView(i, null, this);
        }
        if (ViewCompat.getImportantForAccessibility(aflag) == 0)
        {
            ViewCompat.setImportantForAccessibility(aflag, 1);
        }
        if (!mHasStableIds) goto _L2; else goto _L1
_L1:
        obj1 = (LayoutParams)aflag.getLayoutParams();
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = generateDefaultLayoutParams();
_L6:
        obj.id = mAdapter.getItemId(i);
        aflag.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
_L2:
        if (mAccessibilityDelegate == null)
        {
            mAccessibilityDelegate = new ListItemAccessibilityDelegate(null);
        }
        ViewCompat.setAccessibilityDelegate(aflag, mAccessibilityDelegate);
        return aflag;
_L4:
        obj = obj1;
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
        {
            obj = generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void offsetChildren(int i)
    {
        int k = getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = getChildAt(j);
            if (mIsVertical)
            {
                view.offsetTopAndBottom(i);
            } else
            {
                view.offsetLeftAndRight(i);
            }
            j++;
        }
    }

    private boolean overScrollByInternal(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return false;
        } else
        {
            return super.overScrollBy(i, j, k, l, i1, j1, k1, l1, flag);
        }
    }

    private void performAccessibilityActionsOnSelected()
    {
        if (getSelectedItemPosition() >= 0)
        {
            sendAccessibilityEvent(4);
        }
    }

    private boolean performLongPress(View view, int i, long l)
    {
        android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener = getOnItemLongClickListener();
        boolean flag;
        boolean flag1;
        if (onitemlongclicklistener != null)
        {
            flag = onitemlongclicklistener.onItemLongClick(this, view, i, l);
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            mContextMenuInfo = createContextMenuInfo(view, i, l);
            flag1 = super.showContextMenuForChild(this);
        }
        if (flag1)
        {
            performHapticFeedback(0);
        }
        return flag1;
    }

    private int positionOfNewFocus(View view)
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            if (isViewAncestorOf(view, getChildAt(i)))
            {
                return i + mFirstPosition;
            }
        }

        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
    }

    private void positionSelector(int i, View view)
    {
        if (i != -1)
        {
            mSelectorPosition = i;
        }
        mSelectorRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean flag = mIsChildViewEnabled;
        if (view.isEnabled() != flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsChildViewEnabled = flag;
            if (getSelectedItemPosition() != -1)
            {
                refreshDrawableState();
            }
        }
    }

    private int reconcileSelectedPosition()
    {
        int j = mSelectedPosition;
        int i = j;
        if (j < 0)
        {
            i = mResurrectToPosition;
        }
        return Math.min(Math.max(0, i), mItemCount - 1);
    }

    private void recycleVelocityTracker()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.recycle();
            mVelocityTracker = null;
        }
    }

    private void relayoutMeasuredChild(View view)
    {
        int i = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        int k = getPaddingLeft();
        int l = view.getTop();
        view.layout(k, l, i + k, j + l);
    }

    private void rememberSyncState()
    {
        if (getChildCount() == 0)
        {
            return;
        }
        mNeedSync = true;
        if (mSelectedPosition >= 0)
        {
            View view = getChildAt(mSelectedPosition - mFirstPosition);
            mSyncRowId = mNextSelectedRowId;
            mSyncPosition = mNextSelectedPosition;
            if (view != null)
            {
                int i;
                if (mIsVertical)
                {
                    i = view.getTop();
                } else
                {
                    i = view.getLeft();
                }
                mSpecificStart = i;
            }
            mSyncMode = 0;
            return;
        }
        View view1 = getChildAt(0);
        ListAdapter listadapter = getAdapter();
        if (mFirstPosition >= 0 && mFirstPosition < listadapter.getCount())
        {
            mSyncRowId = listadapter.getItemId(mFirstPosition);
        } else
        {
            mSyncRowId = -1L;
        }
        mSyncPosition = mFirstPosition;
        if (view1 != null)
        {
            int j;
            if (mIsVertical)
            {
                j = view1.getTop();
            } else
            {
                j = view1.getLeft();
            }
            mSpecificStart = j;
        }
        mSyncMode = 1;
    }

    private void reportScrollStateChange(int i)
    {
        while (i == mLastScrollState || mOnScrollListener == null) 
        {
            return;
        }
        mLastScrollState = i;
        mOnScrollListener.onScrollStateChanged(this, i);
    }

    private boolean scrollListItemsBy(int i)
    {
        boolean flag2;
        int l2 = getChildCount();
        if (l2 == 0)
        {
            return true;
        }
        int l1 = getChildStartEdge(getChildAt(0));
        int i2 = getChildEndEdge(getChildAt(l2 - 1));
        int l = getPaddingTop();
        int j = getPaddingLeft();
        int i1;
        int j2;
        int k2;
        if (!mIsVertical)
        {
            l = j;
        }
        j2 = getEndEdge();
        j = getAvailableSize();
        if (i < 0)
        {
            i1 = Math.max(-(j - 1), i);
        } else
        {
            i1 = Math.min(j - 1, i);
        }
        k2 = mFirstPosition;
        if (k2 == 0 && l1 >= l && i1 >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (k2 + l2 == mItemCount && i2 <= j2 && i1 <= 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0 || j != 0)
        {
            return i1 != 0;
        }
        flag2 = isInTouchMode();
        if (flag2)
        {
            hideSelector();
        }
        boolean flag = false;
        j = 0;
        int j1;
        int k1;
        boolean flag1;
        if (i1 < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            int i3 = -i1;
            j = 0;
            i = 0;
            do
            {
                j1 = i;
                k1 = ((flag) ? 1 : 0);
                if (j >= l2)
                {
                    break;
                }
                View view = getChildAt(j);
                j1 = i;
                k1 = ((flag) ? 1 : 0);
                if (getChildEndEdge(view) >= i3 + l)
                {
                    break;
                }
                i++;
                mRecycler.addScrapView(view, k2 + j);
                j++;
            } while (true);
        } else
        {
            i = l2 - 1;
            j1 = 0;
            int k = j;
            j = j1;
            do
            {
                j1 = j;
                k1 = k;
                if (i < 0)
                {
                    break;
                }
                View view1 = getChildAt(i);
                j1 = j;
                k1 = k;
                if (getChildStartEdge(view1) <= j2 - i1)
                {
                    break;
                }
                j++;
                mRecycler.addScrapView(view1, k2 + i);
                k = i;
                i--;
            } while (true);
        }
        mBlockLayoutRequests = true;
        if (j1 > 0)
        {
            detachViewsFromParent(k1, j1);
        }
        if (!awakenScrollbarsInternal())
        {
            invalidate();
        }
        offsetChildren(i1);
        if (flag1)
        {
            mFirstPosition = j1 + mFirstPosition;
        }
        i = Math.abs(i1);
        if (l - l1 < i || i2 - j2 < i)
        {
            fillGap(flag1);
        }
        if (flag2 || mSelectedPosition == -1) goto _L2; else goto _L1
_L1:
        i = mSelectedPosition - mFirstPosition;
        if (i >= 0 && i < getChildCount())
        {
            positionSelector(mSelectedPosition, getChildAt(i));
        }
_L4:
        mBlockLayoutRequests = false;
        invokeOnItemScrollListener();
        return false;
_L2:
        if (mSelectorPosition != -1)
        {
            i = mSelectorPosition - mFirstPosition;
            if (i >= 0 && i < getChildCount())
            {
                positionSelector(-1, getChildAt(i));
            }
        } else
        {
            mSelectorRect.setEmpty();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void selectionChanged()
    {
        if (getOnItemSelectedListener() == null)
        {
            return;
        }
        if (mInLayout || mBlockLayoutRequests)
        {
            if (mSelectionNotifier == null)
            {
                mSelectionNotifier = new SelectionNotifier(null);
            }
            post(mSelectionNotifier);
            return;
        } else
        {
            fireOnSelected();
            performAccessibilityActionsOnSelected();
            return;
        }
    }

    private void setNextSelectedPositionInt(int i)
    {
        mNextSelectedPosition = i;
        mNextSelectedRowId = getItemIdAtPosition(i);
        if (mNeedSync && mSyncMode == 0 && i >= 0)
        {
            mSyncPosition = i;
            mSyncRowId = mNextSelectedRowId;
        }
    }

    private void setSelectedPositionInt(int i)
    {
        mSelectedPosition = i;
        mSelectedRowId = getItemIdAtPosition(i);
    }

    private void setSelectionInt(int i)
    {
        boolean flag;
        int j;
        flag = true;
        setNextSelectedPositionInt(i);
        j = mSelectedPosition;
        break MISSING_BLOCK_LABEL_12;
        if (j < 0 || i != j - 1 && i != j + 1)
        {
            flag = false;
        }
        layoutChildren();
        if (flag)
        {
            awakenScrollbarsInternal();
        }
        return;
    }

    private void setupChild(View view, int i, int j, int k, boolean flag, boolean flag1, boolean flag2)
    {
        LayoutParams layoutparams;
        int l;
        boolean flag3;
        int i1;
        int j1;
        boolean flag4;
        if (flag1 && shouldShowSelector())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != view.isSelected())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l = mTouchMode;
        if (l > 0 && l < 3 && mMotionPosition == i)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4 != view.isPressed())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (!flag2 || i1 != 0 || view.isLayoutRequested())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        layoutparams.viewType = mAdapter.getItemViewType(i);
        if (flag2 && !layoutparams.forceAdd)
        {
            byte byte0;
            if (flag)
            {
                byte0 = -1;
            } else
            {
                byte0 = 0;
            }
            attachViewToParent(view, byte0, layoutparams);
        } else
        {
            layoutparams.forceAdd = false;
            byte byte1;
            if (flag)
            {
                byte1 = -1;
            } else
            {
                byte1 = 0;
            }
            addViewInLayout(view, byte1, layoutparams, true);
        }
        if (i1 != 0)
        {
            view.setSelected(flag1);
        }
        if (j1 != 0)
        {
            view.setPressed(flag4);
        }
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0 && mCheckStates != null)
        {
            if (view instanceof Checkable)
            {
                ((Checkable)view).setChecked(mCheckStates.get(i));
            } else
            if (getContext().getApplicationInfo().targetSdkVersion >= 11)
            {
                view.setActivated(mCheckStates.get(i));
            }
        }
        if (flag3)
        {
            measureChild(view, layoutparams);
        } else
        {
            cleanupLayoutState(view);
        }
        i1 = view.getMeasuredWidth();
        j1 = view.getMeasuredHeight();
        i = j;
        if (mIsVertical)
        {
            i = j;
            if (!flag)
            {
                i = j - j1;
            }
        }
        j = k;
        if (!mIsVertical)
        {
            j = k;
            if (!flag)
            {
                j = k - i1;
            }
        }
        if (flag3)
        {
            view.layout(j, i, i1 + j, j1 + i);
            return;
        } else
        {
            view.offsetLeftAndRight(j - view.getLeft());
            view.offsetTopAndBottom(i - view.getTop());
            return;
        }
    }

    private boolean shouldShowSelector()
    {
        return hasFocus() && !isInTouchMode() || touchModeDrawsInPressedState();
    }

    private boolean touchModeDrawsInPressedState()
    {
        switch (mTouchMode)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    private void triggerCheckForLongPress()
    {
        if (mPendingCheckForLongPress == null)
        {
            mPendingCheckForLongPress = new CheckForLongPress(null);
        }
        mPendingCheckForLongPress.rememberWindowAttachCount();
        postDelayed(mPendingCheckForLongPress, ViewConfiguration.getLongPressTimeout());
    }

    private void triggerCheckForTap()
    {
        if (mPendingCheckForTap == null)
        {
            mPendingCheckForTap = new CheckForTap(null);
        }
        postDelayed(mPendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    private void updateEmptyStatus()
    {
        boolean flag;
        if (mAdapter == null || mAdapter.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (mEmptyView != null)
            {
                mEmptyView.setVisibility(0);
                setVisibility(8);
            } else
            {
                setVisibility(0);
            }
            if (mDataChanged)
            {
                layout(getLeft(), getTop(), getRight(), getBottom());
            }
            return;
        }
        if (mEmptyView != null)
        {
            mEmptyView.setVisibility(8);
        }
        setVisibility(0);
    }

    private void updateOnScreenCheckedViews()
    {
        int i = 0;
        int j = mFirstPosition;
        int k = getChildCount();
        boolean flag;
        if (getContext().getApplicationInfo().targetSdkVersion >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        while (i < k) 
        {
            View view = getChildAt(i);
            int l = j + i;
            if (view instanceof Checkable)
            {
                ((Checkable)view).setChecked(mCheckStates.get(l));
            } else
            if (flag)
            {
                view.setActivated(mCheckStates.get(l));
            }
            i++;
        }
    }

    private void updateOverScrollState(int i, int j)
    {
        float f;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (mIsVertical)
        {
            k = 0;
        } else
        {
            k = j;
        }
        if (mIsVertical)
        {
            l = j;
        } else
        {
            l = 0;
        }
        if (mIsVertical)
        {
            i1 = 0;
        } else
        {
            i1 = mOverScroll;
        }
        if (mIsVertical)
        {
            j1 = mOverScroll;
        } else
        {
            j1 = 0;
        }
        if (mIsVertical)
        {
            k1 = 0;
        } else
        {
            k1 = mOverscrollDistance;
        }
        if (mIsVertical)
        {
            l1 = mOverscrollDistance;
        } else
        {
            l1 = 0;
        }
        overScrollByInternal(k, l, i1, j1, 0, 0, k1, l1, true);
        if (Math.abs(mOverscrollDistance) == Math.abs(mOverScroll) && mVelocityTracker != null)
        {
            mVelocityTracker.clear();
        }
        k = ViewCompat.getOverScrollMode(this);
        if (k != 0 && (k != 1 || contentFits())) goto _L2; else goto _L1
_L1:
        mTouchMode = 5;
        f = j;
        if (mIsVertical)
        {
            j = getHeight();
        } else
        {
            j = getWidth();
        }
        f /= j;
        if (i <= 0) goto _L4; else goto _L3
_L3:
        mStartEdge.onPull(f);
        if (!mEndEdge.isFinished())
        {
            mEndEdge.onRelease();
        }
_L6:
        if (i != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
_L2:
        return;
_L4:
        if (i < 0)
        {
            mEndEdge.onPull(f);
            if (!mStartEdge.isFinished())
            {
                mStartEdge.onRelease();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateScrollbarsDirection()
    {
        boolean flag;
        if (!mIsVertical)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setHorizontalScrollBarEnabled(flag);
        setVerticalScrollBarEnabled(mIsVertical);
    }

    private void updateSelectorState()
    {
label0:
        {
            if (mSelector != null)
            {
                if (!shouldShowSelector())
                {
                    break label0;
                }
                mSelector.setState(getDrawableState());
            }
            return;
        }
        mSelector.setState(STATE_NOTHING);
    }

    private void useDefaultSelector()
    {
        setSelector(getResources().getDrawable(0x1080062));
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && mItemCount > 0;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public void clearChoices()
    {
        if (mCheckStates != null)
        {
            mCheckStates.clear();
        }
        if (mCheckedIdStates != null)
        {
            mCheckedIdStates.clear();
        }
        mCheckedItemCount = 0;
    }

    protected int computeHorizontalScrollExtent()
    {
        int k = getChildCount();
        int j;
        if (k == 0)
        {
            j = 0;
        } else
        {
            j = k * 100;
            View view = getChildAt(0);
            int l = view.getLeft();
            int i1 = view.getWidth();
            int i = j;
            if (i1 > 0)
            {
                i = j + (l * 100) / i1;
            }
            view = getChildAt(k - 1);
            k = view.getRight();
            l = view.getWidth();
            j = i;
            if (l > 0)
            {
                return i - ((k - getWidth()) * 100) / l;
            }
        }
        return j;
    }

    protected int computeHorizontalScrollOffset()
    {
        int i = mFirstPosition;
        int j = getChildCount();
        if (i >= 0 && j != 0)
        {
            View view = getChildAt(0);
            int k = view.getLeft();
            int l = view.getWidth();
            if (l > 0)
            {
                return Math.max(i * 100 - (k * 100) / l, 0);
            }
        }
        return 0;
    }

    protected int computeHorizontalScrollRange()
    {
        int j = Math.max(mItemCount * 100, 0);
        int i = j;
        if (!mIsVertical)
        {
            i = j;
            if (mOverScroll != 0)
            {
                i = j + Math.abs((int)(((float)mOverScroll / (float)getWidth()) * (float)mItemCount * 100F));
            }
        }
        return i;
    }

    public void computeScroll()
    {
        if (!mScroller.computeScrollOffset())
        {
            return;
        }
        int i;
        int j;
        boolean flag;
        if (mIsVertical)
        {
            i = mScroller.getCurrY();
        } else
        {
            i = mScroller.getCurrX();
        }
        j = (int)((float)i - mLastTouchPos);
        mLastTouchPos = i;
        flag = scrollListItemsBy(j);
        if (!flag && !mScroller.isFinished())
        {
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        if (flag)
        {
            if (ViewCompat.getOverScrollMode(this) != 2)
            {
                EdgeEffectCompat edgeeffectcompat;
                if (j > 0)
                {
                    edgeeffectcompat = mStartEdge;
                } else
                {
                    edgeeffectcompat = mEndEdge;
                }
                if (edgeeffectcompat.onAbsorb(Math.abs((int)getCurrVelocity())))
                {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            mScroller.abortAnimation();
        }
        mTouchMode = -1;
        reportScrollStateChange(0);
    }

    protected int computeVerticalScrollExtent()
    {
        int k = getChildCount();
        int j;
        if (k == 0)
        {
            j = 0;
        } else
        {
            j = k * 100;
            View view = getChildAt(0);
            int l = view.getTop();
            int i1 = view.getHeight();
            int i = j;
            if (i1 > 0)
            {
                i = j + (l * 100) / i1;
            }
            view = getChildAt(k - 1);
            k = view.getBottom();
            l = view.getHeight();
            j = i;
            if (l > 0)
            {
                return i - ((k - getHeight()) * 100) / l;
            }
        }
        return j;
    }

    protected int computeVerticalScrollOffset()
    {
        int i = mFirstPosition;
        int j = getChildCount();
        if (i >= 0 && j != 0)
        {
            View view = getChildAt(0);
            int k = view.getTop();
            int l = view.getHeight();
            if (l > 0)
            {
                return Math.max(i * 100 - (k * 100) / l, 0);
            }
        }
        return 0;
    }

    protected int computeVerticalScrollRange()
    {
        int j = Math.max(mItemCount * 100, 0);
        int i = j;
        if (mIsVertical)
        {
            i = j;
            if (mOverScroll != 0)
            {
                i = j + Math.abs((int)(((float)mOverScroll / (float)getHeight()) * (float)mItemCount * 100F));
            }
        }
        return i;
    }

    void confirmCheckedPositionsById()
    {
        int i;
        mCheckStates.clear();
        i = 0;
_L7:
        if (i >= mCheckedIdStates.size()) goto _L2; else goto _L1
_L1:
        int k;
        long l;
        l = mCheckedIdStates.keyAt(i);
        k = ((Integer)mCheckedIdStates.valueAt(i)).intValue();
        if (l == mAdapter.getItemId(k)) goto _L4; else goto _L3
_L3:
        int j;
        j = Math.max(0, k - 20);
        k = Math.min(k + 20, mItemCount);
_L8:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (l != mAdapter.getItemId(j)) goto _L6; else goto _L5
_L5:
        mCheckStates.put(j, true);
        mCheckedIdStates.setValueAt(i, Integer.valueOf(j));
        j = 1;
_L10:
        k = i;
        if (j == 0)
        {
            mCheckedIdStates.delete(l);
            k = i - 1;
            mCheckedItemCount = mCheckedItemCount - 1;
        }
_L9:
        i = k + 1;
          goto _L7
_L6:
        j++;
          goto _L8
_L4:
        mCheckStates.put(k, true);
        k = i;
          goto _L9
_L2:
        return;
        j = 0;
          goto _L10
    }

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag = mDrawSelectorOnTop;
        if (!flag)
        {
            drawSelector(canvas);
        }
        super.dispatchDraw(canvas);
        if (flag)
        {
            drawSelector(canvas);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = super.dispatchKeyEvent(keyevent);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (getFocusedChild() != null)
            {
                flag = flag1;
                if (keyevent.getAction() == 0)
                {
                    flag = onKeyDown(keyevent.getKeyCode(), keyevent);
                }
            }
        }
        return flag;
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        boolean flag = false;
        if (mStartEdge != null)
        {
            flag = drawStartEdge(canvas) | false;
        }
        boolean flag1 = flag;
        if (mEndEdge != null)
        {
            flag1 = flag | drawEndEdge(canvas);
        }
        if (flag1)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        updateSelectorState();
    }

    void fillGap(boolean flag)
    {
        int k = getChildCount();
        if (flag)
        {
            int i = getStartEdge();
            int l = getChildEndEdge(getChildAt(k - 1));
            if (k > 0)
            {
                i = mItemMargin + l;
            }
            fillAfter(k + mFirstPosition, i);
            correctTooHigh(getChildCount());
            return;
        }
        int j = getEndEdge();
        int i1 = getChildStartEdge(getChildAt(0));
        if (k > 0)
        {
            j = i1 - mItemMargin;
        }
        fillBefore(mFirstPosition - 1, j);
        correctTooLow(getChildCount());
    }

    boolean fullScroll(int i)
    {
        boolean flag1;
        flag1 = false;
        forceValidFocusDirection(i);
        if (i != 33 && i != 17) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (mSelectedPosition != 0)
        {
            i = lookForSelectablePosition(0, true);
            if (i >= 0)
            {
                mLayoutMode = 1;
                setSelectionInt(i);
                invokeOnItemScrollListener();
            }
            flag = true;
        }
_L4:
        if (flag && !awakenScrollbarsInternal())
        {
            awakenScrollbarsInternal();
            invalidate();
        }
        return flag;
_L2:
        if (i != 130)
        {
            flag = flag1;
            if (i != 66)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = flag1;
        if (mSelectedPosition < mItemCount - 1)
        {
            i = lookForSelectablePosition(mItemCount - 1, true);
            if (i >= 0)
            {
                mLayoutMode = 3;
                setSelectionInt(i);
                invokeOnItemScrollListener();
            }
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        if (mIsVertical)
        {
            return new LayoutParams(-1, -2);
        } else
        {
            return new LayoutParams(-2, -1);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public ListAdapter getAdapter()
    {
        return mAdapter;
    }

    public int getCheckedItemCount()
    {
        return mCheckedItemCount;
    }

    public long[] getCheckedItemIds()
    {
        int i = 0;
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0 && mCheckedIdStates != null && mAdapter != null) goto _L2; else goto _L1
_L1:
        long al[] = new long[0];
_L4:
        return al;
_L2:
        LongSparseArray longsparsearray = mCheckedIdStates;
        int j = longsparsearray.size();
        long al1[] = new long[j];
        do
        {
            al = al1;
            if (i >= j)
            {
                continue;
            }
            al1[i] = longsparsearray.keyAt(i);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCheckedItemPosition()
    {
        if (mChoiceMode.compareTo(ChoiceMode.SINGLE) == 0 && mCheckStates != null && mCheckStates.size() == 1)
        {
            return mCheckStates.keyAt(0);
        } else
        {
            return -1;
        }
    }

    public SparseBooleanArray getCheckedItemPositions()
    {
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0)
        {
            return mCheckStates;
        } else
        {
            return null;
        }
    }

    public ChoiceMode getChoiceMode()
    {
        return mChoiceMode;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return mContextMenuInfo;
    }

    public int getCount()
    {
        return mItemCount;
    }

    public int getFirstVisiblePosition()
    {
        return mFirstPosition;
    }

    public void getFocusedRect(Rect rect)
    {
        View view = getSelectedView();
        if (view != null && view.getParent() == this)
        {
            view.getFocusedRect(rect);
            offsetDescendantRectToMyCoords(view, rect);
            return;
        } else
        {
            super.getFocusedRect(rect);
            return;
        }
    }

    public int getItemMargin()
    {
        return mItemMargin;
    }

    public boolean getItemsCanFocus()
    {
        return mItemsCanFocus;
    }

    public int getLastVisiblePosition()
    {
        return (mFirstPosition + getChildCount()) - 1;
    }

    public int getMaxScrollAmount()
    {
        return (int)(0.33F * (float)getHeight());
    }

    public Orientation getOrientation()
    {
        if (mIsVertical)
        {
            return Orientation.VERTICAL;
        } else
        {
            return Orientation.HORIZONTAL;
        }
    }

    public int getPositionForView(View view)
    {
        do
        {
            View view1;
            boolean flag;
            try
            {
                view1 = (View)view.getParent();
                flag = view1.equals(this);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return -1;
            }
            if (!flag)
            {
                view = view1;
            } else
            {
                int j = getChildCount();
                for (int i = 0; i < j; i++)
                {
                    if (getChildAt(i).equals(view))
                    {
                        return i + mFirstPosition;
                    }
                }

                return -1;
            }
        } while (true);
    }

    public long getSelectedItemId()
    {
        return mNextSelectedRowId;
    }

    public int getSelectedItemPosition()
    {
        return mNextSelectedPosition;
    }

    public View getSelectedView()
    {
        if (mItemCount > 0 && mSelectedPosition >= 0)
        {
            return getChildAt(mSelectedPosition - mFirstPosition);
        } else
        {
            return null;
        }
    }

    public Drawable getSelector()
    {
        return mSelector;
    }

    public boolean isItemChecked(int i)
    {
        if (mChoiceMode.compareTo(ChoiceMode.NONE) == 0 && mCheckStates != null)
        {
            return mCheckStates.get(i);
        } else
        {
            return false;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (mAdapter != null && mDataSetObserver == null)
        {
            mDataSetObserver = new AdapterDataSetObserver(null);
            mAdapter.registerDataSetObserver(mDataSetObserver);
            mDataChanged = true;
            mOldItemCount = mItemCount;
            mItemCount = mAdapter.getCount();
        }
        mIsAttached = true;
    }

    protected int[] onCreateDrawableState(int i)
    {
        if (!mIsChildViewEnabled) goto _L2; else goto _L1
_L1:
        int ai[] = super.onCreateDrawableState(i);
_L5:
        return ai;
_L2:
        int ai1[];
        int j;
        j = ENABLED_STATE_SET[0];
        ai1 = super.onCreateDrawableState(i + 1);
        i = ai1.length - 1;
_L6:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (ai1[i] != j) goto _L4; else goto _L3
_L3:
        ai = ai1;
        if (i >= 0)
        {
            System.arraycopy(ai1, i + 1, ai1, i, ai1.length - i - 1);
            return ai1;
        }
          goto _L5
_L4:
        i--;
          goto _L6
        i = -1;
          goto _L3
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mRecycler.clear();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
            mDataSetObserver = null;
        }
        if (mPerformClick != null)
        {
            removeCallbacks(mPerformClick);
        }
        if (mTouchModeReset != null)
        {
            removeCallbacks(mTouchModeReset);
            mTouchModeReset.run();
        }
        mIsAttached = false;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        ListAdapter listadapter;
        int j;
        int k;
        int l;
        int j1;
        int l1;
        l = 0;
        k = 0;
        super.onFocusChanged(flag, i, rect);
        if (flag && mSelectedPosition < 0 && !isInTouchMode())
        {
            if (!mIsAttached && mAdapter != null)
            {
                mDataChanged = true;
                mOldItemCount = mItemCount;
                mItemCount = mAdapter.getCount();
            }
            resurrectSelection();
        }
        listadapter = mAdapter;
        j = -1;
        j1 = l;
        l1 = j;
        if (listadapter == null) goto _L2; else goto _L1
_L1:
        j1 = l;
        l1 = j;
        if (!flag) goto _L2; else goto _L3
_L3:
        j1 = l;
        l1 = j;
        if (rect == null) goto _L2; else goto _L4
_L4:
        Rect rect1;
        int i1;
        int i2;
        int j2;
        rect.offset(getScrollX(), getScrollY());
        if (listadapter.getCount() < getChildCount() + mFirstPosition)
        {
            mLayoutMode = 0;
            layoutChildren();
        }
        rect1 = mTempRect;
        i1 = 0x7fffffff;
        i2 = getChildCount();
        j2 = mFirstPosition;
        l = 0;
_L5:
        j1 = k;
        l1 = j;
        if (l >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!listadapter.isEnabled(j2 + l))
        {
            break MISSING_BLOCK_LABEL_334;
        }
        View view = getChildAt(l);
        view.getDrawingRect(rect1);
        offsetDescendantRectToMyCoords(view, rect1);
        j1 = getDistance(rect, rect1, i);
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        if (mIsVertical)
        {
            j = view.getTop();
        } else
        {
            j = view.getLeft();
        }
        k = l;
        i1 = j1;
_L6:
        l++;
        j1 = k;
        k = j;
        j = j1;
        if (true) goto _L5; else goto _L2
_L2:
        if (l1 >= 0)
        {
            setSelectionFromOffset(mFirstPosition + l1, j1);
            return;
        } else
        {
            requestLayout();
            return;
        }
        int k1 = j;
        j = k;
        k = k1;
          goto _L6
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(org/lucasr/twowayview/TwoWayView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(org/lucasr/twowayview/TwoWayView.getName());
        accessibilitynodeinfo = new AccessibilityNodeInfoCompat(accessibilitynodeinfo);
        if (isEnabled())
        {
            if (getFirstVisiblePosition() > 0)
            {
                accessibilitynodeinfo.addAction(8192);
            }
            if (getLastVisiblePosition() < getCount() - 1)
            {
                accessibilitynodeinfo.addAction(4096);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!mIsAttached)
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 50
    //                   1 292
    //                   2 164
    //                   3 292;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return false;
_L2:
        initOrResetVelocityTracker();
        mVelocityTracker.addMovement(motionevent);
        mScroller.abortAnimation();
        if (mPositionScroller != null)
        {
            mPositionScroller.stop();
        }
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        if (mIsVertical)
        {
            f = f2;
        }
        mLastTouchPos = f;
        int i = findMotionRowOrColumn((int)mLastTouchPos);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mTouchRemainderPos = 0.0F;
        if (mTouchMode == 4)
        {
            return true;
        }
        if (i >= 0)
        {
            mMotionPosition = i;
            mTouchMode = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mTouchMode == 0)
        {
            initVelocityTrackerIfNotExists();
            mVelocityTracker.addMovement(motionevent);
            int j = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            if (j < 0)
            {
                Log.e("TwoWayView", (new StringBuilder("onInterceptTouchEvent could not find pointer with id ")).append(mActivePointerId).append(" - did TwoWayView receive an inconsistent event stream?").toString());
                return false;
            }
            float f1;
            if (mIsVertical)
            {
                f1 = MotionEventCompat.getY(motionevent, j);
            } else
            {
                f1 = MotionEventCompat.getX(motionevent, j);
            }
            f1 = (f1 - mLastTouchPos) + mTouchRemainderPos;
            j = (int)f1;
            mTouchRemainderPos = f1 - (float)j;
            if (maybeStartScrolling(j))
            {
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mActivePointerId = -1;
        mTouchMode = -1;
        recycleVelocityTracker();
        reportScrollStateChange(0);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        return handleKeyEvent(i, 1, keyevent);
    }

    public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
    {
        return handleKeyEvent(i, j, keyevent);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return handleKeyEvent(i, 1, keyevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            mInLayout = true;
            if (flag)
            {
                int j1 = getChildCount();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    getChildAt(i1).forceLayout();
                }

                mRecycler.markChildrenDirty();
            }
            layoutChildren();
            mInLayout = false;
            i = k - i - getPaddingLeft() - getPaddingRight();
            j = l - j - getPaddingTop() - getPaddingBottom();
            if (mStartEdge != null && mEndEdge != null)
            {
                if (!mIsVertical)
                {
                    break label0;
                }
                mStartEdge.setSize(i, j);
                mEndEdge.setSize(i, j);
            }
            return;
        }
        mStartEdge.setSize(j, i);
        mEndEdge.setSize(j, i);
    }

    protected void onMeasure(int i, int j)
    {
        if (mSelector == null)
        {
            useDefaultSelector();
        }
        int i2 = android.view.View.MeasureSpec.getMode(i);
        int j2 = android.view.View.MeasureSpec.getMode(j);
        int k1 = android.view.View.MeasureSpec.getSize(i);
        int j1 = android.view.View.MeasureSpec.getSize(j);
        int k;
        int l;
        int i1;
        if (mAdapter == null)
        {
            k = 0;
        } else
        {
            k = mAdapter.getCount();
        }
        mItemCount = k;
        if (mItemCount > 0 && (i2 == 0 || j2 == 0))
        {
            View view = obtainView(0, mIsScrap);
            int l1;
            if (mIsVertical)
            {
                k = i;
            } else
            {
                k = j;
            }
            measureScrapChild(view, 0, k);
            k = view.getMeasuredWidth();
            l1 = view.getMeasuredHeight();
            i1 = l1;
            l = k;
            if (recycleOnMeasure())
            {
                mRecycler.addScrapView(view, -1);
                l = k;
                i1 = l1;
            }
        } else
        {
            i1 = 0;
            l = 0;
        }
        k = k1;
        if (i2 == 0)
        {
            l = getPaddingLeft() + getPaddingRight() + l;
            k = l;
            if (mIsVertical)
            {
                k = l + getVerticalScrollbarWidth();
            }
        }
        l = j1;
        if (j2 == 0)
        {
            i1 = getPaddingTop() + getPaddingBottom() + i1;
            l = i1;
            if (!mIsVertical)
            {
                l = i1 + getHorizontalScrollbarHeight();
            }
        }
        if (mIsVertical && j2 == 0x80000000)
        {
            i = measureHeightOfChildren(i, 0, -1, l, -1);
        } else
        {
            i = l;
        }
        if (!mIsVertical && i2 == 0x80000000)
        {
            j = measureWidthOfChildren(j, 0, -1, k, -1);
        } else
        {
            j = k;
        }
        setMeasuredDimension(j, i);
    }

    protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        if (mIsVertical && mOverScroll != j)
        {
            onScrollChanged(getScrollX(), j, getScrollX(), mOverScroll);
            mOverScroll = j;
            i = ((flag2) ? 1 : 0);
        } else
        if (!mIsVertical && mOverScroll != i)
        {
            onScrollChanged(i, getScrollY(), mOverScroll, getScrollY());
            mOverScroll = i;
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            invalidate();
            awakenScrollbarsInternal();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        mDataChanged = true;
        mSyncHeight = ((SavedState) (parcelable)).height;
        if (((SavedState) (parcelable)).selectedId < 0L) goto _L2; else goto _L1
_L1:
        mNeedSync = true;
        mPendingSync = parcelable;
        mSyncRowId = ((SavedState) (parcelable)).selectedId;
        mSyncPosition = ((SavedState) (parcelable)).position;
        mSpecificStart = ((SavedState) (parcelable)).viewStart;
        mSyncMode = 0;
_L4:
        if (((SavedState) (parcelable)).checkState != null)
        {
            mCheckStates = ((SavedState) (parcelable)).checkState;
        }
        if (((SavedState) (parcelable)).checkIdState != null)
        {
            mCheckedIdStates = ((SavedState) (parcelable)).checkIdState;
        }
        mCheckedItemCount = ((SavedState) (parcelable)).checkedItemCount;
        requestLayout();
        return;
_L2:
        if (((SavedState) (parcelable)).firstId >= 0L)
        {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            mSelectorPosition = -1;
            mNeedSync = true;
            mPendingSync = parcelable;
            mSyncRowId = ((SavedState) (parcelable)).firstId;
            mSyncPosition = ((SavedState) (parcelable)).position;
            mSpecificStart = ((SavedState) (parcelable)).viewStart;
            mSyncMode = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Parcelable onSaveInstanceState()
    {
        boolean flag = false;
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mPendingSync != null)
        {
            savedstate.selectedId = mPendingSync.selectedId;
            savedstate.firstId = mPendingSync.firstId;
            savedstate.viewStart = mPendingSync.viewStart;
            savedstate.position = mPendingSync.position;
            savedstate.height = mPendingSync.height;
            return savedstate;
        }
        int i;
        long l1;
        if (getChildCount() > 0 && mItemCount > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l1 = getSelectedItemId();
        savedstate.selectedId = l1;
        savedstate.height = getHeight();
        if (l1 >= 0L)
        {
            savedstate.viewStart = mSelectedStart;
            savedstate.position = getSelectedItemPosition();
            savedstate.firstId = -1L;
        } else
        if (i != 0 && mFirstPosition > 0)
        {
            obj = getChildAt(0);
            int j;
            int l;
            if (mIsVertical)
            {
                j = ((View) (obj)).getTop();
            } else
            {
                j = ((View) (obj)).getLeft();
            }
            savedstate.viewStart = j;
            l = mFirstPosition;
            j = l;
            if (l >= mItemCount)
            {
                j = mItemCount - 1;
            }
            savedstate.position = j;
            savedstate.firstId = mAdapter.getItemId(j);
        } else
        {
            savedstate.viewStart = 0;
            savedstate.firstId = -1L;
            savedstate.position = 0;
        }
        if (mCheckStates != null)
        {
            savedstate.checkState = cloneCheckStates();
        }
        if (mCheckedIdStates != null)
        {
            Object obj = new LongSparseArray();
            int k = mCheckedIdStates.size();
            for (i = ((flag) ? 1 : 0); i < k; i++)
            {
                ((LongSparseArray) (obj)).put(mCheckedIdStates.keyAt(i), mCheckedIdStates.valueAt(i));
            }

            savedstate.checkIdState = ((LongSparseArray) (obj));
        }
        savedstate.checkedItemCount = mCheckedItemCount;
        return savedstate;
    }

    public boolean onTouchEvent(final MotionEvent performClick)
    {
        boolean flag;
        int l;
        boolean flag2;
        boolean flag3;
        l = 0x80000000;
        flag = false;
        flag2 = false;
        flag3 = false;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        if (isClickable() || isLongClickable())
        {
            flag3 = true;
        }
_L4:
        return flag3;
_L2:
        if (!mIsAttached) goto _L4; else goto _L3
_L3:
        initVelocityTrackerIfNotExists();
        mVelocityTracker.addMovement(performClick);
        performClick.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 115
    //                   1 577
    //                   2 296
    //                   3 485;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        int i = ((flag) ? 1 : 0);
_L10:
        if (i != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
_L6:
        i = ((flag) ? 1 : 0);
        if (!mDataChanged)
        {
            mVelocityTracker.clear();
            mScroller.abortAnimation();
            if (mPositionScroller != null)
            {
                mPositionScroller.stop();
            }
            float f4 = performClick.getX();
            float f8 = performClick.getY();
            float f;
            if (mIsVertical)
            {
                f = f8;
            } else
            {
                f = f4;
            }
            mLastTouchPos = f;
            l = pointToPosition((int)f4, (int)f8);
            mActivePointerId = MotionEventCompat.getPointerId(performClick, 0);
            mTouchRemainderPos = 0.0F;
            i = ((flag) ? 1 : 0);
            if (!mDataChanged)
            {
                if (mTouchMode == 4)
                {
                    mTouchMode = 3;
                    reportScrollStateChange(1);
                    findMotionRowOrColumn((int)mLastTouchPos);
                    return true;
                }
                if (mMotionPosition >= 0 && mAdapter.isEnabled(mMotionPosition))
                {
                    mTouchMode = 0;
                    triggerCheckForTap();
                }
                mMotionPosition = l;
                i = ((flag) ? 1 : 0);
            }
        }
          goto _L10
_L8:
        i = MotionEventCompat.findPointerIndex(performClick, mActivePointerId);
        if (i < 0)
        {
            Log.e("TwoWayView", (new StringBuilder("onInterceptTouchEvent could not find pointer with id ")).append(mActivePointerId).append(" - did TwoWayView receive an inconsistent event stream?").toString());
            return false;
        }
        float f1;
        float f5;
        if (mIsVertical)
        {
            f1 = MotionEventCompat.getY(performClick, i);
        } else
        {
            f1 = MotionEventCompat.getX(performClick, i);
        }
        if (mDataChanged)
        {
            layoutChildren();
        }
        f5 = (f1 - mLastTouchPos) + mTouchRemainderPos;
        i = (int)f5;
        mTouchRemainderPos = f5 - (float)i;
        switch (mTouchMode)
        {
        case 4: // '\004'
        default:
            i = ((flag) ? 1 : 0);
            break;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            maybeStartScrolling(i);
            i = ((flag) ? 1 : 0);
            break;

        case 3: // '\003'
        case 5: // '\005'
            mLastTouchPos = f1;
            maybeScroll(i);
            i = ((flag) ? 1 : 0);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
_L9:
        cancelCheckForTap();
        mTouchMode = -1;
        reportScrollStateChange(0);
        setPressed(false);
        performClick = getChildAt(mMotionPosition - mFirstPosition);
        if (performClick != null)
        {
            performClick.setPressed(false);
        }
        i = ((flag2) ? 1 : 0);
        if (mStartEdge != null)
        {
            i = ((flag2) ? 1 : 0);
            if (mEndEdge != null)
            {
                boolean flag4 = mStartEdge.onRelease();
                i = mEndEdge.onRelease() | flag4;
            }
        }
        recycleVelocityTracker();
          goto _L10
_L7:
        mTouchMode;
        JVM INSTR tableswitch 0 5: default 620
    //                   0 689
    //                   1 689
    //                   2 689
    //                   3 1089
    //                   4 620
    //                   5 1319;
           goto _L12 _L13 _L13 _L13 _L14 _L12 _L15
_L15:
        break MISSING_BLOCK_LABEL_1319;
_L12:
        i = 0;
_L16:
        cancelCheckForTap();
        cancelCheckForLongPress();
        setPressed(false);
        boolean flag1 = i;
        if (mStartEdge != null)
        {
            flag1 = i;
            if (mEndEdge != null)
            {
                flag1 = i | (mStartEdge.onRelease() | mEndEdge.onRelease());
            }
        }
        recycleVelocityTracker();
        i = ((flag1) ? 1 : 0);
          goto _L10
_L13:
        int j = mMotionPosition;
        final View child = getChildAt(j - mFirstPosition);
        float f2 = performClick.getX();
        float f6 = performClick.getY();
        if (mIsVertical)
        {
            if (f2 > (float)getPaddingLeft() && f2 < (float)(getWidth() - getPaddingRight()))
            {
                i = 1;
            } else
            {
                i = 0;
            }
        } else
        if (f6 > (float)getPaddingTop() && f6 < (float)(getHeight() - getPaddingBottom()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (child != null && !child.hasFocusable() && i != 0)
        {
            if (mTouchMode != 0)
            {
                child.setPressed(false);
            }
            if (mPerformClick == null)
            {
                mPerformClick = new PerformClick(null);
            }
            performClick = mPerformClick;
            performClick.mClickMotionPosition = j;
            performClick.rememberWindowAttachCount();
            mResurrectToPosition = j;
            if (mTouchMode == 0 || mTouchMode == 1)
            {
                if (mTouchMode == 0)
                {
                    cancelCheckForTap();
                } else
                {
                    cancelCheckForLongPress();
                }
                mLayoutMode = 0;
                if (!mDataChanged && mAdapter.isEnabled(j))
                {
                    mTouchMode = 1;
                    setPressed(true);
                    positionSelector(mMotionPosition, child);
                    child.setPressed(true);
                    if (mSelector != null)
                    {
                        Drawable drawable = mSelector.getCurrent();
                        if (drawable != null && (drawable instanceof TransitionDrawable))
                        {
                            ((TransitionDrawable)drawable).resetTransition();
                        }
                    }
                    if (mTouchModeReset != null)
                    {
                        removeCallbacks(mTouchModeReset);
                    }
                    mTouchModeReset = new _cls1();
                    postDelayed(mTouchModeReset, ViewConfiguration.getPressedStateDuration());
                } else
                {
                    mTouchMode = -1;
                    updateSelectorState();
                }
            } else
            if (!mDataChanged && mAdapter.isEnabled(j))
            {
                performClick.run();
            }
        }
        mTouchMode = -1;
        updateSelectorState();
        i = 0;
          goto _L16
_L14:
        if (contentFits())
        {
            break MISSING_BLOCK_LABEL_1319;
        }
        mVelocityTracker.computeCurrentVelocity(1000, mMaximumVelocity);
        float f3;
        if (mIsVertical)
        {
            f3 = VelocityTrackerCompat.getYVelocity(mVelocityTracker, mActivePointerId);
        } else
        {
            f3 = VelocityTrackerCompat.getXVelocity(mVelocityTracker, mActivePointerId);
        }
        if (Math.abs(f3) >= (float)mFlingVelocity)
        {
            mTouchMode = 4;
            reportScrollStateChange(2);
            performClick = mScroller;
            float f7;
            int k;
            int i1;
            int j1;
            int k1;
            if (mIsVertical)
            {
                f7 = 0.0F;
            } else
            {
                f7 = f3;
            }
            j1 = (int)f7;
            if (!mIsVertical)
            {
                f3 = 0.0F;
            }
            k1 = (int)f3;
            if (mIsVertical)
            {
                i = 0;
            } else
            {
                i = 0x80000000;
            }
            if (mIsVertical)
            {
                k = 0;
            } else
            {
                k = 0x7fffffff;
            }
            if (!mIsVertical)
            {
                l = 0;
            }
            if (mIsVertical)
            {
                i1 = 0x7fffffff;
            } else
            {
                i1 = 0;
            }
            performClick.fling(0, 0, j1, k1, i, k, l, i1);
            mLastTouchPos = 0.0F;
            i = 1;
        } else
        {
            mTouchMode = -1;
            reportScrollStateChange(0);
            i = 0;
        }
          goto _L16
        mTouchMode = -1;
        reportScrollStateChange(0);
          goto _L12
    }

    public void onTouchModeChanged(boolean flag)
    {
        if (flag)
        {
            hideSelector();
            if (getWidth() > 0 && getHeight() > 0 && getChildCount() > 0)
            {
                layoutChildren();
            }
            updateSelectorState();
        } else
        if (mTouchMode == 5 && mOverScroll != 0)
        {
            mOverScroll = 0;
            finishEdgeGlows();
            invalidate();
            return;
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        int i;
        super.onWindowFocusChanged(flag);
        if (isInTouchMode())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (i == 1)
        {
            mResurrectToPosition = mSelectedPosition;
        }
_L4:
        mLastTouchMode = i;
        return;
_L2:
        if (i != mLastTouchMode && mLastTouchMode != -1)
        {
            if (i == 1)
            {
                resurrectSelection();
            } else
            {
                hideSelector();
                mLayoutMode = 0;
                layoutChildren();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean pageScroll(int i)
    {
        forceValidFocusDirection(i);
        int j = -1;
        boolean flag;
        if (i == 33 || i == 17)
        {
            i = Math.max(0, mSelectedPosition - getChildCount() - 1);
            flag = false;
        } else
        if (i == 130 || i == 66)
        {
            i = Math.min(mItemCount - 1, (mSelectedPosition + getChildCount()) - 1);
            flag = true;
        } else
        {
            flag = false;
            i = j;
        }
        if (i >= 0)
        {
            if ((j = lookForSelectablePosition(i, flag)) >= 0)
            {
                mLayoutMode = 4;
                if (mIsVertical)
                {
                    i = getPaddingTop();
                } else
                {
                    i = getPaddingLeft();
                }
                mSpecificStart = i;
                if (flag && j > mItemCount - getChildCount())
                {
                    mLayoutMode = 3;
                }
                if (!flag && j < getChildCount())
                {
                    mLayoutMode = 1;
                }
                setSelectionInt(j);
                invokeOnItemScrollListener();
                if (!awakenScrollbarsInternal())
                {
                    invalidate();
                }
                return true;
            }
        }
        return false;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        boolean flag1 = false;
        if (!super.performAccessibilityAction(i, bundle)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        switch (i)
        {
        default:
            return false;

        case 4096: 
            flag = flag1;
            if (isEnabled())
            {
                flag = flag1;
                if (getLastVisiblePosition() < getCount() - 1)
                {
                    if (mIsVertical)
                    {
                        i = getHeight() - getPaddingTop() - getPaddingBottom();
                    } else
                    {
                        i = getWidth() - getPaddingLeft() - getPaddingRight();
                    }
                    scrollListItemsBy(i);
                    return true;
                }
            }
            break;

        case 8192: 
            flag = flag1;
            continue; /* Loop/switch isn't completed */
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!isEnabled()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (mFirstPosition > 0)
        {
            if (mIsVertical)
            {
                i = getHeight() - getPaddingTop() - getPaddingBottom();
            } else
            {
                i = getWidth() - getPaddingLeft() - getPaddingRight();
            }
            scrollListItemsBy(-i);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean performItemClick(View view, int i, long l)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        if (mChoiceMode.compareTo(ChoiceMode.MULTIPLE) != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (!mCheckStates.get(i, false))
        {
            flag2 = true;
        }
        mCheckStates.put(i, flag2);
        if (mCheckedIdStates != null && mAdapter.hasStableIds())
        {
            if (flag2)
            {
                mCheckedIdStates.put(mAdapter.getItemId(i), Integer.valueOf(i));
            } else
            {
                mCheckedIdStates.delete(mAdapter.getItemId(i));
            }
        }
        if (flag2)
        {
            mCheckedItemCount = mCheckedItemCount + 1;
            flag = flag1;
        } else
        {
            mCheckedItemCount = mCheckedItemCount - 1;
            flag = flag1;
        }
_L4:
        if (flag)
        {
            updateOnScreenCheckedViews();
        }
        return super.performItemClick(view, i, l);
_L2:
        if (mChoiceMode.compareTo(ChoiceMode.SINGLE) == 0)
        {
            if (!mCheckStates.get(i, false))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                mCheckStates.clear();
                mCheckStates.put(i, true);
                if (mCheckedIdStates != null && mAdapter.hasStableIds())
                {
                    mCheckedIdStates.clear();
                    mCheckedIdStates.put(mAdapter.getItemId(i), Integer.valueOf(i));
                }
                mCheckedItemCount = 1;
                flag = flag1;
                continue; /* Loop/switch isn't completed */
            }
            if (mCheckStates.size() != 0)
            {
                flag = flag1;
                if (mCheckStates.valueAt(0))
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            mCheckedItemCount = 0;
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int pointToPosition(int i, int j)
    {
        Rect rect1 = mTouchFrame;
        Rect rect = rect1;
        if (rect1 == null)
        {
            mTouchFrame = new Rect();
            rect = mTouchFrame;
        }
        for (int k = getChildCount() - 1; k >= 0; k--)
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(i, j))
            {
                return mFirstPosition + k;
            }
        }

        return -1;
    }

    protected boolean recycleOnMeasure()
    {
        return true;
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
        if (!mInLayout && !mBlockLayoutRequests)
        {
            super.requestLayout();
        }
    }

    void resetState()
    {
        mScroller.forceFinished(true);
        removeAllViewsInLayout();
        mSelectedStart = 0;
        mFirstPosition = 0;
        mDataChanged = false;
        mNeedSync = false;
        mPendingSync = null;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mOverScroll = 0;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        mSelectorPosition = -1;
        mSelectorRect.setEmpty();
        invalidate();
    }

    boolean resurrectSelection()
    {
        int k1 = getChildCount();
        if (k1 > 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        int k;
        int l;
        int j1;
        boolean flag;
        if (mIsVertical)
        {
            l = getPaddingTop();
        } else
        {
            l = getPaddingLeft();
        }
        if (mIsVertical)
        {
            k = getHeight() - getPaddingBottom();
        } else
        {
            k = getWidth() - getPaddingRight();
        }
        j1 = mFirstPosition;
        j = mResurrectToPosition;
        if (j < j1 || j >= j1 + k1) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j - mFirstPosition);
        if (mIsVertical)
        {
            i = view.getTop();
        } else
        {
            i = view.getLeft();
        }
        k = j;
        flag = true;
        j = i;
        i = k;
_L5:
        mResurrectToPosition = -1;
        mTouchMode = -1;
        reportScrollStateChange(0);
        mSpecificStart = j;
        i = lookForSelectablePosition(i, flag);
        View view1;
        int i1;
        if (i >= j1 && i <= getLastVisiblePosition())
        {
            mLayoutMode = 4;
            updateSelectorState();
            setSelectionInt(i);
            invokeOnItemScrollListener();
        } else
        {
            i = -1;
        }
        if (i >= 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (j >= j1)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        k = 0;
        j = 0;
_L6:
label0:
        {
            if (k >= k1)
            {
                break MISSING_BLOCK_LABEL_282;
            }
            view1 = getChildAt(k);
            if (mIsVertical)
            {
                i = view1.getTop();
            } else
            {
                i = view1.getLeft();
            }
            if (k == 0)
            {
                j = i;
            }
            if (i < l)
            {
                break label0;
            }
            j = i;
            i = j1 + k;
            flag = true;
        }
          goto _L5
        k++;
          goto _L6
        flag = true;
        i = j1;
          goto _L5
        l = k1 - 1;
        j = 0;
_L7:
label1:
        {
            if (l < 0)
            {
                break MISSING_BLOCK_LABEL_403;
            }
            view1 = getChildAt(l);
            if (mIsVertical)
            {
                i = view1.getTop();
            } else
            {
                i = view1.getLeft();
            }
            if (mIsVertical)
            {
                i1 = view1.getBottom();
            } else
            {
                i1 = view1.getRight();
            }
            if (l == k1 - 1)
            {
                j = i;
            }
            if (i1 > k)
            {
                break label1;
            }
            k = j1 + l;
            j = i;
            flag = false;
            i = k;
        }
          goto _L5
        l--;
          goto _L7
        flag = false;
        i = (j1 + k1) - 1;
          goto _L5
    }

    boolean resurrectSelectionIfNeeded()
    {
        if (mSelectedPosition < 0 && resurrectSelection())
        {
            updateSelectorState();
            return true;
        } else
        {
            return false;
        }
    }

    public void scrollBy(int i)
    {
        scrollListItemsBy(-i);
    }

    public void sendAccessibilityEvent(int i)
    {
        if (i == 4096)
        {
            int j = getFirstVisiblePosition();
            int k = getLastVisiblePosition();
            if (mLastAccessibilityScrollEventFromIndex == j && mLastAccessibilityScrollEventToIndex == k)
            {
                return;
            }
            mLastAccessibilityScrollEventFromIndex = j;
            mLastAccessibilityScrollEventToIndex = k;
        }
        super.sendAccessibilityEvent(i);
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
        resetState();
        mRecycler.clear();
        mAdapter = listadapter;
        mDataChanged = true;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        if (mCheckStates != null)
        {
            mCheckStates.clear();
        }
        if (mCheckedIdStates != null)
        {
            mCheckedIdStates.clear();
        }
        if (mAdapter != null)
        {
            mOldItemCount = mItemCount;
            mItemCount = listadapter.getCount();
            mDataSetObserver = new AdapterDataSetObserver(null);
            mAdapter.registerDataSetObserver(mDataSetObserver);
            mRecycler.setViewTypeCount(listadapter.getViewTypeCount());
            mHasStableIds = listadapter.hasStableIds();
            mAreAllItemsSelectable = listadapter.areAllItemsEnabled();
            if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0 && mHasStableIds && mCheckedIdStates == null)
            {
                mCheckedIdStates = new LongSparseArray();
            }
            int i = lookForSelectablePosition(0);
            setSelectedPositionInt(i);
            setNextSelectedPositionInt(i);
            if (mItemCount == 0)
            {
                checkSelectionChanged();
            }
        } else
        {
            mItemCount = 0;
            mHasStableIds = false;
            mAreAllItemsSelectable = true;
            checkSelectionChanged();
        }
        checkFocus();
        requestLayout();
    }

    public void setChoiceMode(ChoiceMode choicemode)
    {
        mChoiceMode = choicemode;
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0)
        {
            if (mCheckStates == null)
            {
                mCheckStates = new SparseBooleanArray();
            }
            if (mCheckedIdStates == null && mAdapter != null && mAdapter.hasStableIds())
            {
                mCheckedIdStates = new LongSparseArray();
            }
        }
    }

    public void setDrawSelectorOnTop(boolean flag)
    {
        mDrawSelectorOnTop = flag;
    }

    public void setEmptyView(View view)
    {
        super.setEmptyView(view);
        mEmptyView = view;
        updateEmptyStatus();
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        ListAdapter listadapter = getAdapter();
        boolean flag1;
        if (listadapter == null || listadapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mDesiredFocusableState = flag;
        if (!flag)
        {
            mDesiredFocusableInTouchModeState = false;
        }
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusable(flag);
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        ListAdapter listadapter = getAdapter();
        boolean flag1;
        if (listadapter == null || listadapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mDesiredFocusableInTouchModeState = flag;
        if (flag)
        {
            mDesiredFocusableState = true;
        }
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusableInTouchMode(flag);
    }

    public void setItemChecked(int i, boolean flag)
    {
        if (mChoiceMode.compareTo(ChoiceMode.NONE) != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mChoiceMode.compareTo(ChoiceMode.MULTIPLE) != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = mCheckStates.get(i);
        mCheckStates.put(i, flag);
        if (mCheckedIdStates != null && mAdapter.hasStableIds())
        {
            if (flag)
            {
                mCheckedIdStates.put(mAdapter.getItemId(i), Integer.valueOf(i));
            } else
            {
                mCheckedIdStates.delete(mAdapter.getItemId(i));
            }
        }
        if (flag2 != flag)
        {
            if (flag)
            {
                mCheckedItemCount = mCheckedItemCount + 1;
            } else
            {
                mCheckedItemCount = mCheckedItemCount - 1;
            }
        }
_L4:
        if (!mInLayout && !mBlockLayoutRequests)
        {
            mDataChanged = true;
            rememberSyncState();
            requestLayout();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag1;
        if (mCheckedIdStates != null && mAdapter.hasStableIds())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || isItemChecked(i))
        {
            mCheckStates.clear();
            if (flag1)
            {
                mCheckedIdStates.clear();
            }
        }
        if (flag)
        {
            mCheckStates.put(i, true);
            if (flag1)
            {
                mCheckedIdStates.put(mAdapter.getItemId(i), Integer.valueOf(i));
            }
            mCheckedItemCount = 1;
        } else
        if (mCheckStates.size() == 0 || !mCheckStates.valueAt(0))
        {
            mCheckedItemCount = 0;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setItemMargin(int i)
    {
        if (mItemMargin == i)
        {
            return;
        } else
        {
            mItemMargin = i;
            requestLayout();
            return;
        }
    }

    public void setItemsCanFocus(boolean flag)
    {
        mItemsCanFocus = flag;
        if (!flag)
        {
            setDescendantFocusability(0x60000);
        }
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        mOnScrollListener = onscrolllistener;
        invokeOnItemScrollListener();
    }

    public void setOrientation(Orientation orientation)
    {
        boolean flag;
        if (orientation.compareTo(Orientation.VERTICAL) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mIsVertical == flag)
        {
            return;
        } else
        {
            mIsVertical = flag;
            updateScrollbarsDirection();
            resetState();
            mRecycler.clear();
            requestLayout();
            return;
        }
    }

    public void setOverScrollMode(int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return;
        }
        if (i != 2)
        {
            if (mStartEdge == null)
            {
                Context context = getContext();
                mStartEdge = new EdgeEffectCompat(context);
                mEndEdge = new EdgeEffectCompat(context);
            }
        } else
        {
            mStartEdge = null;
            mEndEdge = null;
        }
        super.setOverScrollMode(i);
    }

    public void setRecyclerListener(RecyclerListener recyclerlistener)
    {
        mRecycler.mRecyclerListener = recyclerlistener;
    }

    public void setSelection(int i)
    {
        setSelectionFromOffset(i, 0);
    }

    public void setSelectionFromOffset(int i, int j)
    {
        if (mAdapter != null)
        {
            if (!isInTouchMode())
            {
                int k = lookForSelectablePosition(i);
                i = k;
                if (k >= 0)
                {
                    setNextSelectedPositionInt(k);
                    i = k;
                }
            } else
            {
                mResurrectToPosition = i;
            }
            if (i >= 0)
            {
                mLayoutMode = 4;
                if (mIsVertical)
                {
                    mSpecificStart = getPaddingTop() + j;
                } else
                {
                    mSpecificStart = getPaddingLeft() + j;
                }
                if (mNeedSync)
                {
                    mSyncPosition = i;
                    mSyncRowId = mAdapter.getItemId(i);
                }
                requestLayout();
                return;
            }
        }
    }

    public void setSelector(int i)
    {
        setSelector(getResources().getDrawable(i));
    }

    public void setSelector(Drawable drawable)
    {
        if (mSelector != null)
        {
            mSelector.setCallback(null);
            unscheduleDrawable(mSelector);
        }
        mSelector = drawable;
        drawable.getPadding(new Rect());
        drawable.setCallback(this);
        updateSelectorState();
    }

    public boolean showContextMenuForChild(View view)
    {
        int i = getPositionForView(view);
        if (i >= 0)
        {
            long l = mAdapter.getItemId(i);
            android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener = getOnItemLongClickListener();
            boolean flag;
            boolean flag1;
            if (onitemlongclicklistener != null)
            {
                flag = onitemlongclicklistener.onItemLongClick(this, view, i, l);
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                mContextMenuInfo = createContextMenuInfo(getChildAt(i - mFirstPosition), i, l);
                flag1 = super.showContextMenuForChild(view);
            }
            return flag1;
        } else
        {
            return false;
        }
    }

    public void smoothScrollBy(int i, int j)
    {
        int k = mFirstPosition;
        int l = getChildCount();
        int i1 = getStartEdge();
        int j1 = getEndEdge();
        if (i == 0 || mItemCount == 0 || l == 0 || k == 0 && getChildStartEdge(getChildAt(0)) == i1 && i < 0 || k + l == mItemCount && getChildEndEdge(getChildAt(l - 1)) == j1 && i > 0)
        {
            finishSmoothScrolling();
            return;
        }
        Scroller scroller = mScroller;
        if (mIsVertical)
        {
            k = 0;
        } else
        {
            k = -i;
        }
        if (mIsVertical)
        {
            i = -i;
        } else
        {
            i = 0;
        }
        scroller.startScroll(0, 0, k, i, j);
        mLastTouchPos = 0.0F;
        mTouchMode = 4;
        reportScrollStateChange(2);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void smoothScrollToPosition(int i)
    {
        if (mPositionScroller == null)
        {
            mPositionScroller = new PositionScroller();
        }
        mPositionScroller.start(i);
    }

    public void smoothScrollToPosition(int i, int j)
    {
        if (mPositionScroller == null)
        {
            mPositionScroller = new PositionScroller();
        }
        mPositionScroller.start(i, j);
    }

    public void smoothScrollToPositionFromOffset(int i, int j)
    {
        if (mPositionScroller == null)
        {
            mPositionScroller = new PositionScroller();
        }
        mPositionScroller.startWithOffset(i, j);
    }

    public void smoothScrollToPositionFromOffset(int i, int j, int k)
    {
        if (mPositionScroller == null)
        {
            mPositionScroller = new PositionScroller();
        }
        mPositionScroller.startWithOffset(i, j, k);
    }









/*
    static int access$1702(TwoWayView twowayview, int i)
    {
        twowayview.mOldItemCount = i;
        return i;
    }

*/



/*
    static int access$1802(TwoWayView twowayview, int i)
    {
        twowayview.mItemCount = i;
        return i;
    }

*/






/*
    static int access$2202(TwoWayView twowayview, int i)
    {
        twowayview.mSelectedPosition = i;
        return i;
    }

*/



/*
    static long access$2302(TwoWayView twowayview, long l)
    {
        twowayview.mSelectedRowId = l;
        return l;
    }

*/


/*
    static int access$2402(TwoWayView twowayview, int i)
    {
        twowayview.mNextSelectedPosition = i;
        return i;
    }

*/


/*
    static long access$2502(TwoWayView twowayview, long l)
    {
        twowayview.mNextSelectedRowId = l;
        return l;
    }

*/


/*
    static boolean access$2602(TwoWayView twowayview, boolean flag)
    {
        twowayview.mNeedSync = flag;
        return flag;
    }

*/








/*
    static int access$3502(TwoWayView twowayview, int i)
    {
        twowayview.mLayoutMode = i;
        return i;
    }

*/








/*
    static int access$402(TwoWayView twowayview, int i)
    {
        twowayview.mTouchMode = i;
        return i;
    }

*/



/*
    static Runnable access$4202(TwoWayView twowayview, Runnable runnable)
    {
        twowayview.mPositionScrollAfterLayout = runnable;
        return runnable;
    }

*/











/*
    static boolean access$502(TwoWayView twowayview, boolean flag)
    {
        twowayview.mDataChanged = flag;
        return flag;
    }

*/


/*
    static Runnable access$602(TwoWayView twowayview, Runnable runnable)
    {
        twowayview.mTouchModeReset = runnable;
        return runnable;
    }

*/

    private class ArrowScrollFocusResult
    {

        private int mAmountToScroll;
        private int mSelectedPosition;

        public int getAmountToScroll()
        {
            return mAmountToScroll;
        }

        public int getSelectedPosition()
        {
            return mSelectedPosition;
        }

        void populate(int i, int j)
        {
            mSelectedPosition = i;
            mAmountToScroll = j;
        }

        private ArrowScrollFocusResult()
        {
        }

        ArrowScrollFocusResult(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ChoiceMode extends Enum
    {

        private static final ChoiceMode $VALUES[];
        public static final ChoiceMode MULTIPLE;
        public static final ChoiceMode NONE;
        public static final ChoiceMode SINGLE;

        public static ChoiceMode valueOf(String s)
        {
            return (ChoiceMode)Enum.valueOf(org/lucasr/twowayview/TwoWayView$ChoiceMode, s);
        }

        public static ChoiceMode[] values()
        {
            return (ChoiceMode[])$VALUES.clone();
        }

        static 
        {
            NONE = new ChoiceMode("NONE", 0);
            SINGLE = new ChoiceMode("SINGLE", 1);
            MULTIPLE = new ChoiceMode("MULTIPLE", 2);
            $VALUES = (new ChoiceMode[] {
                NONE, SINGLE, MULTIPLE
            });
        }

        private ChoiceMode(String s, int i)
        {
            super(s, i);
        }
    }


    private class RecycleBin
    {

        private View mActiveViews[];
        private ArrayList mCurrentScrap;
        private int mFirstActivePosition;
        private RecyclerListener mRecyclerListener;
        private ArrayList mScrapViews[];
        private SparseArrayCompat mTransientStateViews;
        private int mViewTypeCount;
        final TwoWayView this$0;

        private void pruneScrapViews()
        {
            boolean flag = false;
            int j1 = mActiveViews.length;
            int k1 = mViewTypeCount;
            ArrayList aarraylist[] = mScrapViews;
            for (int i = 0; i < k1; i++)
            {
                ArrayList arraylist = aarraylist[i];
                int l1 = arraylist.size();
                int k = l1 - 1;
                for (int i1 = 0; i1 < l1 - j1;)
                {
                    removeDetachedView((View)arraylist.remove(k), false);
                    i1++;
                    k--;
                }

            }

            if (mTransientStateViews != null)
            {
                int l;
                for (int j = ((flag) ? 1 : 0); j < mTransientStateViews.size(); j = l + 1)
                {
                    l = j;
                    if (!ViewCompat.hasTransientState((View)mTransientStateViews.valueAt(j)))
                    {
                        mTransientStateViews.removeAt(j);
                        l = j - 1;
                    }
                }

            }
        }

        void addScrapView(View view, int i)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int j;
            layoutparams.scrappedFromPosition = i;
            j = layoutparams.viewType;
            boolean flag = ViewCompat.hasTransientState(view);
            if (shouldRecycleViewType(j) && !flag)
            {
                break; /* Loop/switch isn't completed */
            }
            if (flag)
            {
                if (mTransientStateViews == null)
                {
                    mTransientStateViews = new SparseArrayCompat();
                }
                mTransientStateViews.put(i, view);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (mViewTypeCount == 1)
            {
                mCurrentScrap.add(view);
            } else
            {
                mScrapViews[j].add(view);
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                view.setAccessibilityDelegate(null);
            }
            if (mRecyclerListener != null)
            {
                mRecyclerListener.onMovedToScrapHeap(view);
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        void clear()
        {
            if (mViewTypeCount == 1)
            {
                ArrayList arraylist = mCurrentScrap;
                int k = arraylist.size();
                for (int i = 0; i < k; i++)
                {
                    removeDetachedView((View)arraylist.remove(k - 1 - i), false);
                }

            } else
            {
                int i1 = mViewTypeCount;
                for (int j = 0; j < i1; j++)
                {
                    ArrayList arraylist1 = mScrapViews[j];
                    int j1 = arraylist1.size();
                    for (int l = 0; l < j1; l++)
                    {
                        removeDetachedView((View)arraylist1.remove(j1 - 1 - l), false);
                    }

                }

            }
            if (mTransientStateViews != null)
            {
                mTransientStateViews.clear();
            }
        }

        void clearTransientStateViews()
        {
            if (mTransientStateViews != null)
            {
                mTransientStateViews.clear();
            }
        }

        void fillActiveViews(int i, int j)
        {
            if (mActiveViews.length < i)
            {
                mActiveViews = new View[i];
            }
            mFirstActivePosition = j;
            View aview[] = mActiveViews;
            for (j = 0; j < i; j++)
            {
                aview[j] = getChildAt(j);
            }

        }

        View getActiveView(int i)
        {
            i -= mFirstActivePosition;
            View aview[] = mActiveViews;
            if (i >= 0 && i < aview.length)
            {
                View view = aview[i];
                aview[i] = null;
                return view;
            } else
            {
                return null;
            }
        }

        View getScrapView(int i)
        {
            if (mViewTypeCount == 1)
            {
                return retrieveFromScrap(mCurrentScrap, i);
            }
            int j = mAdapter.getItemViewType(i);
            if (j >= 0 && j < mScrapViews.length)
            {
                return retrieveFromScrap(mScrapViews[j], i);
            } else
            {
                return null;
            }
        }

        View getTransientStateView(int i)
        {
            if (mTransientStateViews != null)
            {
                if ((i = mTransientStateViews.indexOfKey(i)) >= 0)
                {
                    View view = (View)mTransientStateViews.valueAt(i);
                    mTransientStateViews.removeAt(i);
                    return view;
                }
            }
            return null;
        }

        public void markChildrenDirty()
        {
            boolean flag = false;
            if (mViewTypeCount == 1)
            {
                ArrayList arraylist = mCurrentScrap;
                int l = arraylist.size();
                for (int i = 0; i < l; i++)
                {
                    ((View)arraylist.get(i)).forceLayout();
                }

            } else
            {
                int k1 = mViewTypeCount;
                for (int j = 0; j < k1; j++)
                {
                    ArrayList arraylist1 = mScrapViews[j];
                    int l1 = arraylist1.size();
                    for (int i1 = 0; i1 < l1; i1++)
                    {
                        ((View)arraylist1.get(i1)).forceLayout();
                    }

                }

            }
            if (mTransientStateViews != null)
            {
                int j1 = mTransientStateViews.size();
                for (int k = ((flag) ? 1 : 0); k < j1; k++)
                {
                    ((View)mTransientStateViews.valueAt(k)).forceLayout();
                }

            }
        }

        void reclaimScrapViews(List list)
        {
            if (mViewTypeCount == 1)
            {
                list.addAll(mCurrentScrap);
            } else
            {
                int j = mViewTypeCount;
                ArrayList aarraylist[] = mScrapViews;
                int i = 0;
                while (i < j) 
                {
                    list.addAll(aarraylist[i]);
                    i++;
                }
            }
        }

        View retrieveFromScrap(ArrayList arraylist, int i)
        {
            int k = arraylist.size();
            if (k <= 0)
            {
                return null;
            }
            for (int j = 0; j < k; j++)
            {
                View view = (View)arraylist.get(j);
                if (((LayoutParams)view.getLayoutParams()).scrappedFromPosition == i)
                {
                    arraylist.remove(j);
                    return view;
                }
            }

            return (View)arraylist.remove(k - 1);
        }

        void scrapActiveViews()
        {
            View aview[] = mActiveViews;
            Object obj;
            boolean flag;
            int i;
            if (mViewTypeCount > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = mCurrentScrap;
            i = aview.length - 1;
            while (i >= 0) 
            {
                View view = aview[i];
                Object obj1 = obj;
                if (view != null)
                {
                    obj1 = (LayoutParams)view.getLayoutParams();
                    int j = ((LayoutParams) (obj1)).viewType;
                    aview[i] = null;
                    boolean flag1 = ViewCompat.hasTransientState(view);
                    if (!shouldRecycleViewType(j) || flag1)
                    {
                        obj1 = obj;
                        if (flag1)
                        {
                            removeDetachedView(view, false);
                            if (mTransientStateViews == null)
                            {
                                mTransientStateViews = new SparseArrayCompat();
                            }
                            mTransientStateViews.put(mFirstActivePosition + i, view);
                            obj1 = obj;
                        }
                    } else
                    {
                        if (flag)
                        {
                            obj = mScrapViews[j];
                        }
                        obj1.scrappedFromPosition = mFirstActivePosition + i;
                        ((ArrayList) (obj)).add(view);
                        if (android.os.Build.VERSION.SDK_INT >= 14)
                        {
                            view.setAccessibilityDelegate(null);
                        }
                        obj1 = obj;
                        if (mRecyclerListener != null)
                        {
                            mRecyclerListener.onMovedToScrapHeap(view);
                            obj1 = obj;
                        }
                    }
                }
                i--;
                obj = obj1;
            }
            pruneScrapViews();
        }

        public void setViewTypeCount(int i)
        {
            if (i <= 0)
            {
                throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
            }
            ArrayList aarraylist[] = new ArrayList[i];
            for (int j = 0; j < i; j++)
            {
                aarraylist[j] = new ArrayList();
            }

            mViewTypeCount = i;
            mCurrentScrap = aarraylist[0];
            mScrapViews = aarraylist;
        }

        public boolean shouldRecycleViewType(int i)
        {
            return i >= 0;
        }


/*
        static RecyclerListener access$102(RecycleBin recyclebin, RecyclerListener recyclerlistener)
        {
            recyclebin.mRecyclerListener = recyclerlistener;
            return recyclerlistener;
        }

*/

        RecycleBin()
        {
            this$0 = TwoWayView.this;
            super();
            mActiveViews = new View[0];
        }

        private class RecyclerListener
        {

            public abstract void onMovedToScrapHeap(View view);
        }

    }


    private class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(org/lucasr/twowayview/TwoWayView$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private class PositionScroller
        implements Runnable
    {

        private static final int MOVE_AFTER_BOUND = 3;
        private static final int MOVE_AFTER_POS = 1;
        private static final int MOVE_BEFORE_BOUND = 4;
        private static final int MOVE_BEFORE_POS = 2;
        private static final int MOVE_OFFSET = 5;
        private static final int SCROLL_DURATION = 200;
        private int mBoundPosition;
        private final int mExtraScroll;
        private int mLastSeenPosition;
        private int mMode;
        private int mOffsetFromStart;
        private int mScrollDuration;
        private int mTargetPosition;
        final TwoWayView this$0;

        public void run()
        {
            int i;
            int i1;
            int j2;
            int k2;
            k2 = getAvailableSize();
            j2 = mFirstPosition;
            if (mIsVertical)
            {
                i1 = getPaddingTop();
            } else
            {
                i1 = getPaddingLeft();
            }
            if (mIsVertical)
            {
                i = getPaddingBottom();
            } else
            {
                i = getPaddingRight();
            }
            mMode;
            JVM INSTR tableswitch 1 5: default 92
        //                       1 116
        //                       2 429
        //                       3 260
        //                       4 527
        //                       5 685;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            return;
_L2:
            if ((i1 = getChildCount() - 1) >= 0)
            {
                j2 += i1;
                if (j2 == mLastSeenPosition)
                {
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
                View view = getChildAt(i1);
                int i3 = getChildSize(view);
                int l3 = getChildStartEdge(view);
                i1 = i;
                if (j2 < mItemCount - 1)
                {
                    i1 = Math.max(i, mExtraScroll);
                }
                smoothScrollBy((i3 - (k2 - l3)) + i1, mScrollDuration);
                mLastSeenPosition = j2;
                if (j2 < mTargetPosition)
                {
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            i1 = getChildCount();
            if (j2 != mBoundPosition && i1 > 1 && i1 + j2 < mItemCount)
            {
                i1 = j2 + 1;
                if (i1 == mLastSeenPosition)
                {
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
                View view1 = getChildAt(1);
                j2 = getChildSize(view1);
                k2 = getChildStartEdge(view1);
                i = Math.max(i, mExtraScroll);
                if (i1 < mBoundPosition)
                {
                    smoothScrollBy(Math.max(0, (k2 + j2) - i), mScrollDuration);
                    mLastSeenPosition = i1;
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
                if (j2 > i)
                {
                    smoothScrollBy(j2 - i, mScrollDuration);
                    return;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (j2 == mLastSeenPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            View view2 = getChildAt(0);
            if (view2 != null)
            {
                k2 = getChildStartEdge(view2);
                int j = i1;
                if (j2 > 0)
                {
                    j = Math.max(mExtraScroll, i1);
                }
                smoothScrollBy(k2 - j, mScrollDuration);
                mLastSeenPosition = j2;
                if (j2 > mTargetPosition)
                {
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            int j3 = getChildCount() - 2;
            if (j3 >= 0)
            {
                int k = j2 + j3;
                if (k == mLastSeenPosition)
                {
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
                View view3 = getChildAt(j3);
                j2 = getChildSize(view3);
                j3 = getChildStartEdge(view3);
                i1 = Math.max(i1, mExtraScroll);
                mLastSeenPosition = k;
                if (k > mBoundPosition)
                {
                    smoothScrollBy(-(k2 - j3 - i1), mScrollDuration);
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
                k = k2 - i1;
                i1 = j3 + j2;
                if (k > i1)
                {
                    smoothScrollBy(-(k - i1), mScrollDuration);
                    return;
                }
            }
            if (true) goto _L1; else goto _L6
_L6:
            if (mLastSeenPosition == j2)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            mLastSeenPosition = j2;
            int j1 = getChildCount();
            int l2 = mTargetPosition;
            int k3 = (j2 + j1) - 1;
            float f;
            int l;
            if (l2 < j2)
            {
                l = (j2 - l2) + 1;
            } else
            if (l2 > k3)
            {
                l = l2 - k3;
            } else
            {
                l = 0;
            }
            f = Math.min(Math.abs((float)l / (float)j1), 1.0F);
            if (l2 < j2)
            {
                l = (int)((float)(-getSize()) * f);
                int k1 = (int)(f * (float)mScrollDuration);
                smoothScrollBy(l, k1);
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            if (l2 > k3)
            {
                l = (int)((float)getSize() * f);
                int l1 = (int)(f * (float)mScrollDuration);
                smoothScrollBy(l, l1);
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            } else
            {
                View view4 = getChildAt(l2 - j2);
                l = getChildStartEdge(view4) - mOffsetFromStart;
                int i2 = (int)((float)mScrollDuration * ((float)Math.abs(l) / (float)getSize()));
                smoothScrollBy(l, i2);
                return;
            }
        }

        void scrollToVisible(int i, int j, int k)
        {
            int l;
            int i1;
            int j1;
            int k1;
label0:
            {
                l = getChildCount();
                k1 = mFirstPosition;
                int l1 = (l + k1) - 1;
                i1 = getStartEdge();
                j1 = getEndEdge();
                if (i < k1 || i > l1)
                {
                    Log.w("TwoWayView", (new StringBuilder("scrollToVisible called with targetPosition ")).append(i).append(" not visible [").append(k1).append(", ").append(l1).append("]").toString());
                }
                if (j >= k1)
                {
                    l = j;
                    if (j <= l1)
                    {
                        break label0;
                    }
                }
                l = -1;
            }
            View view = getChildAt(i - k1);
            j = getChildStartEdge(view);
            i = getChildEndEdge(view);
            if (i > j1)
            {
                i -= j1;
            } else
            {
                i = 0;
            }
            if (j < i1)
            {
                i = j - i1;
            }
            if (i == 0)
            {
                return;
            }
            j = i;
            if (l < 0) goto _L2; else goto _L1
_L1:
            view = getChildAt(l - k1);
            l = getChildStartEdge(view);
            j = getChildEndEdge(view);
            k1 = Math.abs(i);
            if (i >= 0 || j + k1 <= j1) goto _L4; else goto _L3
_L3:
            j = Math.max(0, j - j1);
_L2:
            smoothScrollBy(j, k);
            return;
_L4:
            j = i;
            if (i > 0)
            {
                j = i;
                if (l - k1 < i1)
                {
                    j = Math.min(0, l - i1);
                }
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        void start(final int position)
        {
            stop();
            class _cls1
                implements Runnable
            {

                final PositionScroller this$1;
                final int val$position;

                public void run()
                {
                    start(position);
                }

                _cls1()
                {
                    this$1 = PositionScroller.this;
                    position = i;
                    super();
                }
            }

            if (mDataChanged)
            {
                mPositionScrollAfterLayout = new _cls1();
            } else
            {
                int i = getChildCount();
                if (i != 0)
                {
                    int j = mFirstPosition;
                    int k = (i + j) - 1;
                    i = Math.max(0, Math.min(getCount() - 1, position));
                    if (i < j)
                    {
                        position = (j - i) + 1;
                        mMode = 2;
                    } else
                    if (i > k)
                    {
                        position = (i - k) + 1;
                        mMode = 1;
                    } else
                    {
                        scrollToVisible(i, -1, 200);
                        return;
                    }
                    if (position > 0)
                    {
                        mScrollDuration = 200 / position;
                    } else
                    {
                        mScrollDuration = 200;
                    }
                    mTargetPosition = i;
                    mBoundPosition = -1;
                    mLastSeenPosition = -1;
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
            }
        }

        void start(final int position, final int boundPosition)
        {
            stop();
            if (boundPosition != -1) goto _L2; else goto _L1
_L1:
            start(position);
_L4:
            return;
_L2:
            int j;
            if (mDataChanged)
            {
                class _cls2
                    implements Runnable
                {

                    final PositionScroller this$1;
                    final int val$boundPosition;
                    final int val$position;

                    public void run()
                    {
                        start(position, boundPosition);
                    }

                _cls2()
                {
                    this$1 = PositionScroller.this;
                    position = i;
                    boundPosition = j;
                    super();
                }
                }

                mPositionScrollAfterLayout = new _cls2();
                return;
            }
            j = getChildCount();
            if (j == 0) goto _L4; else goto _L3
_L3:
            int i;
            int k;
            i = mFirstPosition;
            k = (j + i) - 1;
            j = Math.max(0, Math.min(getCount() - 1, position));
            if (j >= i) goto _L6; else goto _L5
_L5:
            k -= boundPosition;
            if (k <= 0) goto _L4; else goto _L7
_L7:
            position = (i - j) + 1;
            i = k - 1;
            if (i < position)
            {
                mMode = 4;
                position = i;
            } else
            {
                mMode = 2;
            }
_L9:
            if (position > 0)
            {
                mScrollDuration = 200 / position;
            } else
            {
                mScrollDuration = 200;
            }
            mTargetPosition = j;
            mBoundPosition = boundPosition;
            mLastSeenPosition = -1;
            ViewCompat.postOnAnimation(TwoWayView.this, this);
            return;
_L6:
            if (j <= k)
            {
                break MISSING_BLOCK_LABEL_230;
            }
            i = boundPosition - i;
            if (i <= 0) goto _L4; else goto _L8
_L8:
            position = (j - k) + 1;
            i--;
            if (i < position)
            {
                mMode = 3;
                position = i;
            } else
            {
                mMode = 1;
            }
              goto _L9
            scrollToVisible(j, boundPosition, 200);
            return;
        }

        void startWithOffset(int i, int j)
        {
            startWithOffset(i, j, 200);
        }

        void startWithOffset(final int position, final int postOffset, final int duration)
        {
            stop();
            class _cls3
                implements Runnable
            {

                final PositionScroller this$1;
                final int val$duration;
                final int val$position;
                final int val$postOffset;

                public void run()
                {
                    startWithOffset(position, postOffset, duration);
                }

                _cls3()
                {
                    this$1 = PositionScroller.this;
                    position = i;
                    postOffset = j;
                    duration = k;
                    super();
                }
            }

            if (mDataChanged)
            {
                mPositionScrollAfterLayout = new _cls3();
            } else
            {
                int i = getChildCount();
                if (i != 0)
                {
                    postOffset = getStartEdge() + postOffset;
                    mTargetPosition = Math.max(0, Math.min(getCount() - 1, position));
                    mOffsetFromStart = postOffset;
                    mBoundPosition = -1;
                    mLastSeenPosition = -1;
                    mMode = 5;
                    position = mFirstPosition;
                    int j = (position + i) - 1;
                    float f;
                    if (mTargetPosition < position)
                    {
                        position -= mTargetPosition;
                    } else
                    if (mTargetPosition > j)
                    {
                        position = mTargetPosition - j;
                    } else
                    {
                        View view = getChildAt(mTargetPosition - position);
                        position = getChildStartEdge(view);
                        smoothScrollBy(position - postOffset, duration);
                        return;
                    }
                    f = (float)position / (float)i;
                    if (f >= 1.0F)
                    {
                        duration = (int)((float)duration / f);
                    }
                    mScrollDuration = duration;
                    mLastSeenPosition = -1;
                    ViewCompat.postOnAnimation(TwoWayView.this, this);
                    return;
                }
            }
        }

        void stop()
        {
            removeCallbacks(this);
        }

        PositionScroller()
        {
            this$0 = TwoWayView.this;
            super();
            mExtraScroll = ViewConfiguration.get(mContext).getScaledFadingEdgeLength();
        }
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        boolean forceAdd;
        long id;
        int scrappedFromPosition;
        int viewType;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            id = -1L;
            if (width == -1)
            {
                Log.w("TwoWayView", "Constructing LayoutParams with width FILL_PARENT does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                width = -2;
            }
            if (height == -1)
            {
                Log.w("TwoWayView", "Constructing LayoutParams with height FILL_PARENT does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                height = -2;
            }
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            id = -1L;
            if (width == -1)
            {
                Log.w("TwoWayView", "Inflation setting LayoutParams width to MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                width = -1;
            }
            if (height == -1)
            {
                Log.w("TwoWayView", "Inflation setting LayoutParams height to MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                height = -2;
            }
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            id = -1L;
            if (width == -1)
            {
                Log.w("TwoWayView", "Constructing LayoutParams with width MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                width = -2;
            }
            if (height == -1)
            {
                Log.w("TwoWayView", "Constructing LayoutParams with height MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
                height = -2;
            }
        }
    }


    private class OnScrollListener
    {

        public static final int SCROLL_STATE_FLING = 2;
        public static final int SCROLL_STATE_IDLE = 0;
        public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

        public abstract void onScroll(TwoWayView twowayview, int i, int j, int k);

        public abstract void onScrollStateChanged(TwoWayView twowayview, int i);
    }


    private class CheckForKeyLongPress extends WindowRunnnable
        implements Runnable
    {
        private class WindowRunnnable
        {

            private int mOriginalAttachCount;
            final TwoWayView this$0;

            public void rememberWindowAttachCount()
            {
                mOriginalAttachCount = getWindowAttachCount();
            }

            public boolean sameWindow()
            {
                return hasWindowFocus() && getWindowAttachCount() == mOriginalAttachCount;
            }

            private WindowRunnnable()
            {
                this$0 = TwoWayView.this;
                super();
            }

            WindowRunnnable(_cls1 _pcls1)
            {
                this();
            }
        }


        final TwoWayView this$0;

        public void run()
        {
            if (isPressed() && mSelectedPosition >= 0)
            {
                int i = mSelectedPosition;
                int j = mFirstPosition;
                View view = getChildAt(i - j);
                if (!mDataChanged)
                {
                    boolean flag;
                    if (sameWindow())
                    {
                        flag = performLongPress(view, mSelectedPosition, mSelectedRowId);
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        setPressed(false);
                        view.setPressed(false);
                        return;
                    }
                }
                while (false) 
                {
                    setPressed(false);
                    if (view != null)
                    {
                        view.setPressed(false);
                        return;
                    }
                }
            }
        }

        private CheckForKeyLongPress()
        {
            this$0 = TwoWayView.this;
            super(null);
        }

        CheckForKeyLongPress(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ListItemAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final TwoWayView this$0;

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            i = getPositionForView(view);
            view = getAdapter();
            break MISSING_BLOCK_LABEL_23;
            if (i != -1 && view != null && isEnabled() && view.isEnabled(i))
            {
                if (i == getSelectedItemPosition())
                {
                    accessibilitynodeinfocompat.setSelected(true);
                    accessibilitynodeinfocompat.addAction(8);
                } else
                {
                    accessibilitynodeinfocompat.addAction(4);
                }
                if (isClickable())
                {
                    accessibilitynodeinfocompat.addAction(16);
                    accessibilitynodeinfocompat.setClickable(true);
                }
                if (isLongClickable())
                {
                    accessibilitynodeinfocompat.addAction(32);
                    accessibilitynodeinfocompat.setLongClickable(true);
                    return;
                }
            }
            return;
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i, bundle))
            {
                return true;
            }
            int j = getPositionForView(view);
            bundle = getAdapter();
            if (j == -1 || bundle == null)
            {
                return false;
            }
            if (!isEnabled() || !bundle.isEnabled(j))
            {
                return false;
            }
            long l = getItemIdAtPosition(j);
            switch (i)
            {
            default:
                return false;

            case 8: // '\b'
                if (getSelectedItemPosition() == j)
                {
                    setSelection(-1);
                    return true;
                } else
                {
                    return false;
                }

            case 4: // '\004'
                if (getSelectedItemPosition() != j)
                {
                    setSelection(j);
                    return true;
                } else
                {
                    return false;
                }

            case 16: // '\020'
                if (isClickable())
                {
                    return performItemClick(view, j, l);
                } else
                {
                    return false;
                }

            case 32: // ' '
                break;
            }
            if (isLongClickable())
            {
                return performLongPress(view, j, l);
            } else
            {
                return false;
            }
        }

        private ListItemAccessibilityDelegate()
        {
            this$0 = TwoWayView.this;
            super();
        }

        ListItemAccessibilityDelegate(_cls1 _pcls1)
        {
            this();
        }
    }


    private class SelectionNotifier
        implements Runnable
    {

        final TwoWayView this$0;

        public void run()
        {
            if (mDataChanged)
            {
                if (mAdapter != null)
                {
                    post(this);
                }
                return;
            } else
            {
                fireOnSelected();
                performAccessibilityActionsOnSelected();
                return;
            }
        }

        private SelectionNotifier()
        {
            this$0 = TwoWayView.this;
            super();
        }

        SelectionNotifier(_cls1 _pcls1)
        {
            this();
        }
    }


    private class CheckForLongPress extends WindowRunnnable
        implements Runnable
    {

        final TwoWayView this$0;

        public void run()
        {
label0:
            {
                int i = mMotionPosition;
                View view = getChildAt(i - mFirstPosition);
                if (view != null)
                {
                    long l = mAdapter.getItemId(mMotionPosition);
                    boolean flag;
                    if (sameWindow() && !mDataChanged)
                    {
                        flag = performLongPress(view, i, l);
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    mTouchMode = -1;
                    setPressed(false);
                    view.setPressed(false);
                }
                return;
            }
            mTouchMode = 2;
        }

        private CheckForLongPress()
        {
            this$0 = TwoWayView.this;
            super(null);
        }

        CheckForLongPress(_cls1 _pcls1)
        {
            this();
        }
    }


    private class CheckForTap
        implements Runnable
    {

        final TwoWayView this$0;

        public final void run()
        {
            if (mTouchMode == 0)
            {
                mTouchMode = 1;
                View view = getChildAt(mMotionPosition - mFirstPosition);
                if (view != null && !view.hasFocusable())
                {
                    mLayoutMode = 0;
                    if (!mDataChanged)
                    {
                        setPressed(true);
                        view.setPressed(true);
                        layoutChildren();
                        positionSelector(mMotionPosition, view);
                        refreshDrawableState();
                        positionSelector(mMotionPosition, view);
                        refreshDrawableState();
                        boolean flag = isLongClickable();
                        if (mSelector != null)
                        {
                            Drawable drawable = mSelector.getCurrent();
                            if (drawable != null && (drawable instanceof TransitionDrawable))
                            {
                                if (flag)
                                {
                                    int i = ViewConfiguration.getLongPressTimeout();
                                    ((TransitionDrawable)drawable).startTransition(i);
                                } else
                                {
                                    ((TransitionDrawable)drawable).resetTransition();
                                }
                            }
                        }
                        if (flag)
                        {
                            triggerCheckForLongPress();
                            return;
                        } else
                        {
                            mTouchMode = 2;
                            return;
                        }
                    } else
                    {
                        mTouchMode = 2;
                        return;
                    }
                }
            }
        }

        private CheckForTap()
        {
            this$0 = TwoWayView.this;
            super();
        }

        CheckForTap(_cls1 _pcls1)
        {
            this();
        }
    }


    private class AdapterDataSetObserver extends DataSetObserver
    {

        private Parcelable mInstanceState;
        final TwoWayView this$0;

        public void onChanged()
        {
            mDataChanged = true;
            mOldItemCount = mItemCount;
            mItemCount = getAdapter().getCount();
            if (mHasStableIds && mInstanceState != null && mOldItemCount == 0 && mItemCount > 0)
            {
                onRestoreInstanceState(mInstanceState);
                mInstanceState = null;
            } else
            {
                rememberSyncState();
            }
            checkFocus();
            requestLayout();
        }

        public void onInvalidated()
        {
            mDataChanged = true;
            if (mHasStableIds)
            {
                mInstanceState = onSaveInstanceState();
            }
            mOldItemCount = mItemCount;
            mItemCount = 0;
            mSelectedPosition = -1;
            mSelectedRowId = 0x8000000000000000L;
            mNextSelectedPosition = -1;
            mNextSelectedRowId = 0x8000000000000000L;
            mNeedSync = false;
            checkFocus();
            requestLayout();
        }

        private AdapterDataSetObserver()
        {
            this$0 = TwoWayView.this;
            super();
            mInstanceState = null;
        }

        AdapterDataSetObserver(_cls1 _pcls1)
        {
            this();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        LongSparseArray checkIdState;
        SparseBooleanArray checkState;
        int checkedItemCount;
        long firstId;
        int height;
        int position;
        long selectedId;
        int viewStart;

        public String toString()
        {
            return (new StringBuilder("TwoWayView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(selectedId).append(" firstId=").append(firstId).append(" viewStart=").append(viewStart).append(" height=").append(height).append(" position=").append(position).append(" checkState=").append(checkState).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            int j = 0;
            super.writeToParcel(parcel, i);
            parcel.writeLong(selectedId);
            parcel.writeLong(firstId);
            parcel.writeInt(viewStart);
            parcel.writeInt(position);
            parcel.writeInt(height);
            parcel.writeInt(checkedItemCount);
            parcel.writeSparseBooleanArray(checkState);
            if (checkIdState != null)
            {
                i = checkIdState.size();
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            for (; j < i; j++)
            {
                parcel.writeLong(checkIdState.keyAt(j));
                parcel.writeInt(((Integer)checkIdState.valueAt(j)).intValue());
            }

        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            selectedId = parcel.readLong();
            firstId = parcel.readLong();
            viewStart = parcel.readInt();
            position = parcel.readInt();
            height = parcel.readInt();
            checkedItemCount = parcel.readInt();
            checkState = parcel.readSparseBooleanArray();
            int j = parcel.readInt();
            if (j > 0)
            {
                checkIdState = new LongSparseArray();
                for (int i = 0; i < j; i++)
                {
                    long l = parcel.readLong();
                    int k = parcel.readInt();
                    checkIdState.put(l, Integer.valueOf(k));
                }

            }
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

                _cls1()
                {
                }
        }

    }


    private class PerformClick extends WindowRunnnable
        implements Runnable
    {

        int mClickMotionPosition;
        final TwoWayView this$0;

        public void run()
        {
            if (!mDataChanged)
            {
                ListAdapter listadapter = mAdapter;
                int i = mClickMotionPosition;
                if (listadapter != null && mItemCount > 0 && i != -1 && i < listadapter.getCount() && sameWindow())
                {
                    View view = getChildAt(i - mFirstPosition);
                    if (view != null)
                    {
                        performItemClick(view, i, listadapter.getItemId(i));
                        return;
                    }
                }
            }
        }

        private PerformClick()
        {
            this$0 = TwoWayView.this;
            super(null);
        }

        PerformClick(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final TwoWayView this$0;
        final View val$child;
        final PerformClick val$performClick;

        public void run()
        {
            mTouchMode = -1;
            setPressed(false);
            child.setPressed(false);
            if (!mDataChanged)
            {
                performClick.run();
            }
            mTouchModeReset = null;
        }

        _cls1()
        {
            this$0 = TwoWayView.this;
            child = view;
            performClick = performclick;
            super();
        }
    }

}
