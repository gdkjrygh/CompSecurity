// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewCompat

class mInstanceState extends DataSetObserver
{

    private Parcelable mInstanceState;
    final AdapterViewCompat this$0;

    public void onChanged()
    {
        mDataChanged = true;
        mOldItemCount = mItemCount;
        mItemCount = getAdapter().getCount();
        if (getAdapter().hasStableIds() && mInstanceState != null && mOldItemCount == 0 && mItemCount > 0)
        {
            AdapterViewCompat.access$000(AdapterViewCompat.this, mInstanceState);
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
        if (getAdapter().hasStableIds())
        {
            mInstanceState = AdapterViewCompat.access$100(AdapterViewCompat.this);
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

    Q()
    {
        this$0 = AdapterViewCompat.this;
        super();
        mInstanceState = null;
    }
}
