// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class AdapterViewCompat extends ViewGroup
{

    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    int mFirstPosition;
    boolean mInLayout;
    int mItemCount;
    int mLayoutHeight;
    boolean mNeedSync;
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    int mSelectedPosition;
    long mSelectedRowId;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;

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

    final void checkSelectionChanged()
    {
        if (mSelectedPosition != mOldSelectedPosition || mSelectedRowId != mOldSelectedRowId)
        {
            if (mSelectedPosition != -1 && isShown() && !isInTouchMode())
            {
                sendAccessibilityEvent(4);
            }
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

    public abstract View getSelectedView();

    final void handleDataChanged()
    {
        int j;
        boolean flag3;
        int i1;
        i1 = mItemCount;
        j = 0;
        flag3 = false;
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        int i = ((flag3) ? 1 : 0);
        if (!mNeedSync) goto _L4; else goto _L3
_L3:
        Adapter adapter;
        int k;
        int l;
        int j1;
        long l1;
        long l2;
        mNeedSync = false;
        j1 = mItemCount;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        l1 = mSyncRowId;
        i = mSyncPosition;
        if (l1 == 0x8000000000000000L)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        j = Math.min(j1 - 1, Math.max(0, i));
        l2 = SystemClock.uptimeMillis();
        boolean flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        k = j;
        i = j;
        l = j;
        j = ((flag) ? 1 : 0);
_L7:
        if (SystemClock.uptimeMillis() > l2 + 100L)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (adapter.getItemId(i) != l1) goto _L6; else goto _L5
_L5:
        j = i;
_L8:
        i = ((flag3) ? 1 : 0);
        if (j >= 0)
        {
            setNextSelectedPositionInt(j);
            i = 1;
        }
_L4:
        j = i;
        if (i == 0)
        {
            k = mNextSelectedPosition;
            j = k;
            if (k >= i1)
            {
                j = i1 - 1;
            }
            k = j;
            if (j < 0)
            {
                k = 0;
            }
            if (k >= 0);
            j = i;
            if (k >= 0)
            {
                setNextSelectedPositionInt(k);
                checkSelectionChanged();
                j = 1;
            }
        }
_L2:
        if (j == 0)
        {
            mSelectedPosition = -1;
            mSelectedRowId = 0x8000000000000000L;
            mNextSelectedPosition = -1;
            mNextSelectedRowId = 0x8000000000000000L;
            mNeedSync = false;
            checkSelectionChanged();
        }
        return;
_L6:
        boolean flag1;
        boolean flag2;
        if (l == j1 - 1)
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
            break MISSING_BLOCK_LABEL_342;
        }
        if (flag2 || j != 0 && !flag1)
        {
            l++;
            j = 0;
            i = l;
        } else
        if (flag1 || j == 0 && !flag2)
        {
            k--;
            j = 1;
            i = k;
        }
          goto _L7
        j = -1;
          goto _L8
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        mLayoutHeight = getHeight();
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
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusableInTouchMode(flag);
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

    final void setSelectedPositionInt(int i)
    {
        mSelectedPosition = i;
        mSelectedRowId = getItemIdAtPosition(i);
    }
}
