// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class AdapterViewCompat extends ViewGroup
{
    final class AdapterDataSetObserver extends DataSetObserver
    {

        private Parcelable mInstanceState;
        final AdapterViewCompat this$0;

        public final void onChanged()
        {
            mDataChanged = true;
            mOldItemCount = mItemCount;
            mItemCount = getAdapter().getCount();
            if (getAdapter().hasStableIds() && mInstanceState != null && mOldItemCount == 0 && mItemCount > 0)
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

        public final void onInvalidated()
        {
            mDataChanged = true;
            if (getAdapter().hasStableIds())
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

        AdapterDataSetObserver()
        {
            this$0 = AdapterViewCompat.this;
            super();
            mInstanceState = null;
        }
    }

    public static interface OnItemClickListener
    {

        public abstract void onItemClick(AdapterViewCompat adapterviewcompat, View view, int i, long l);
    }

    public static interface OnItemLongClickListener
    {
    }

    public static interface OnItemSelectedListener
    {
    }

    final class SelectionNotifier
        implements Runnable
    {

        final AdapterViewCompat this$0;

        public final void run()
        {
            if (mDataChanged)
            {
                if (getAdapter() != null)
                {
                    post(this);
                }
                return;
            } else
            {
                fireOnSelected();
                return;
            }
        }

        private SelectionNotifier()
        {
            this$0 = AdapterViewCompat.this;
            super();
        }

    }


    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    int mFirstPosition;
    boolean mInLayout;
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    OnItemClickListener mOnItemClickListener;
    OnItemLongClickListener mOnItemLongClickListener;
    OnItemSelectedListener mOnItemSelectedListener;
    int mSelectedPosition;
    long mSelectedRowId;
    private SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;

    AdapterViewCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mFirstPosition = 0;
        mSyncRowId = 0x8000000000000000L;
        mNeedSync = false;
        mInLayout = false;
        mNextSelectedPosition = -1;
        mNextSelectedRowId = 0x8000000000000000L;
        mSelectedPosition = -1;
        mSelectedRowId = 0x8000000000000000L;
        mOldSelectedPosition = -1;
        mOldSelectedRowId = 0x8000000000000000L;
        mBlockLayoutRequests = false;
    }

    private int findSyncPosition()
    {
        Adapter adapter;
        boolean flag;
        int j;
        int k;
        int l;
        int i1;
        long l1;
        long l2;
        i1 = mItemCount;
        if (i1 == 0)
        {
            return -1;
        }
        l1 = mSyncRowId;
        int i = mSyncPosition;
        if (l1 == 0x8000000000000000L)
        {
            return -1;
        }
        j = Math.min(i1 - 1, Math.max(0, i));
        l2 = SystemClock.uptimeMillis();
        k = j;
        l = j;
        flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_127;
        do
        {
            if (SystemClock.uptimeMillis() > l2 + 100L)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (adapter.getItemId(j) == l1)
            {
                return j;
            }
            if (l == i1 - 1)
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
                break MISSING_BLOCK_LABEL_195;
            }
            if (flag2 || flag && !flag1)
            {
                l++;
                j = l;
                flag = false;
            } else
            if (flag1 || !flag && !flag2)
            {
                k--;
                j = k;
                flag = true;
            }
        } while (true);
        return -1;
    }

    private void fireOnSelected()
    {
        if (mOnItemSelectedListener == null)
        {
            return;
        }
        int i = getSelectedItemPosition();
        if (i >= 0)
        {
            getSelectedView();
            OnItemSelectedListener onitemselectedlistener = mOnItemSelectedListener;
            getAdapter().getItemId(i);
            return;
        } else
        {
            OnItemSelectedListener onitemselectedlistener1 = mOnItemSelectedListener;
            return;
        }
    }

    private long getItemIdAtPosition(int i)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i);
        }
    }

    private static boolean isInFilterMode()
    {
        return false;
    }

    private static int lookForSelectablePosition(int i, boolean flag)
    {
        return i;
    }

    private void selectionChanged()
    {
        if (mOnItemSelectedListener != null)
        {
            if (mInLayout || mBlockLayoutRequests)
            {
                if (mSelectionNotifier == null)
                {
                    mSelectionNotifier = new SelectionNotifier();
                }
                post(mSelectionNotifier);
            } else
            {
                fireOnSelected();
            }
        }
        if (mSelectedPosition != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    private void updateEmptyStatus(boolean flag)
    {
        if (isInFilterMode())
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
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
            return;
        }
        if (mEmptyView != null)
        {
            mEmptyView.setVisibility(8);
        }
        setVisibility(0);
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && mItemCount > 0;
    }

    final void checkFocus()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                Adapter adapter = getAdapter();
                boolean flag;
                boolean flag1;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || isInFilterMode())
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
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                super.setFocusable(flag1);
                if (mEmptyView == null)
                {
                    break label0;
                }
                if (adapter != null)
                {
                    flag1 = flag2;
                    if (!adapter.isEmpty())
                    {
                        break label1;
                    }
                }
                flag1 = true;
            }
            updateEmptyStatus(flag1);
        }
    }

    final void checkSelectionChanged()
    {
        if (mSelectedPosition != mOldSelectedPosition || mSelectedRowId != mOldSelectedRowId)
        {
            selectionChanged();
            mOldSelectedPosition = mSelectedPosition;
            mOldSelectedRowId = mSelectedRowId;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = getSelectedView();
        return view != null && view.getVisibility() == 0 && view.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public abstract Adapter getAdapter();

    public final long getSelectedItemId()
    {
        return mNextSelectedRowId;
    }

    public final int getSelectedItemPosition()
    {
        return mNextSelectedPosition;
    }

    public abstract View getSelectedView();

    final void handleDataChanged()
    {
        int k = mItemCount;
        int i = 0;
        boolean flag1 = false;
        if (k > 0)
        {
            boolean flag = flag1;
            if (mNeedSync)
            {
                mNeedSync = false;
                i = findSyncPosition();
                flag = flag1;
                if (i >= 0)
                {
                    flag = flag1;
                    if (lookForSelectablePosition(i, true) == i)
                    {
                        setNextSelectedPositionInt(i);
                        flag = true;
                    }
                }
            }
            i = ((flag) ? 1 : 0);
            if (!flag)
            {
                int j = getSelectedItemPosition();
                i = j;
                if (j >= k)
                {
                    i = k - 1;
                }
                j = i;
                if (i < 0)
                {
                    j = 0;
                }
                i = lookForSelectablePosition(j, true);
                k = i;
                if (i < 0)
                {
                    k = lookForSelectablePosition(j, false);
                }
                i = ((flag) ? 1 : 0);
                if (k >= 0)
                {
                    setNextSelectedPositionInt(k);
                    checkSelectionChanged();
                    i = 1;
                }
            }
        }
        if (i == 0)
        {
            mSelectedPosition = -1;
            mSelectedRowId = 0x8000000000000000L;
            mNextSelectedPosition = -1;
            mNextSelectedRowId = 0x8000000000000000L;
            mNeedSync = false;
            checkSelectionChanged();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(mSelectionNotifier);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mLayoutHeight = getHeight();
    }

    public final boolean performItemClick(View view, int i, long l)
    {
        boolean flag = false;
        if (mOnItemClickListener != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            mOnItemClickListener.onItemClick(this, view, i, l);
            flag = true;
        }
        return flag;
    }

    final void rememberSyncState()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                mNeedSync = true;
                mSyncHeight = mLayoutHeight;
                if (mSelectedPosition < 0)
                {
                    break label0;
                }
                View view = getChildAt(mSelectedPosition - mFirstPosition);
                mSyncRowId = mNextSelectedRowId;
                mSyncPosition = mNextSelectedPosition;
                if (view != null)
                {
                    mSpecificTop = view.getTop();
                }
                mSyncMode = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = getAdapter();
        if (mFirstPosition >= 0 && mFirstPosition < adapter.getCount())
        {
            mSyncRowId = adapter.getItemId(mFirstPosition);
        } else
        {
            mSyncRowId = -1L;
        }
        mSyncPosition = mFirstPosition;
        if (view1 != null)
        {
            mSpecificTop = view1.getTop();
        }
        mSyncMode = 1;
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view)
    {
        mEmptyView = view;
        view = getAdapter();
        boolean flag;
        if (view == null || view.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateEmptyStatus(flag);
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = getAdapter();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
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
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!isInFilterMode()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusable(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = getAdapter();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
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
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!isInFilterMode()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusableInTouchMode(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    final void setNextSelectedPositionInt(int i)
    {
        mNextSelectedPosition = i;
        mNextSelectedRowId = getItemIdAtPosition(i);
        if (mNeedSync && mSyncMode == 0 && i >= 0)
        {
            mSyncPosition = i;
            mSyncRowId = mNextSelectedRowId;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        mOnItemClickListener = onitemclicklistener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onitemlongclicklistener)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        mOnItemLongClickListener = onitemlongclicklistener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onitemselectedlistener)
    {
        mOnItemSelectedListener = onitemselectedlistener;
    }

    final void setSelectedPositionInt(int i)
    {
        mSelectedPosition = i;
        mSelectedRowId = getItemIdAtPosition(i);
    }

    public abstract void setSelection(int i);



}
