// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper, ChildHelper

final class this._cls0
    implements Runnable
{

    final RecyclerView this$0;

    public final void run()
    {
        if (RecyclerView.access$100(RecyclerView.this)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (RecyclerView.access$200(RecyclerView.this))
        {
            TraceCompat.beginSection("RV FullInvalidate");
            dispatchLayout();
            TraceCompat.endSection();
            return;
        }
        if (!mAdapterHelper.hasPendingUpdates()) goto _L1; else goto _L3
_L3:
        RecyclerView recyclerview;
        int i;
        int j;
        TraceCompat.beginSection("RV PartialInvalidate");
        eatRequestLayout();
        mAdapterHelper.preProcess();
        if (RecyclerView.access$300(RecyclerView.this))
        {
            break MISSING_BLOCK_LABEL_221;
        }
        recyclerview = RecyclerView.this;
        j = recyclerview.mChildHelper.getChildCount();
        i = 0;
_L5:
        ewHolder ewholder;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        ewholder = RecyclerView.getChildViewHolderInt(recyclerview.mChildHelper.getChildAt(i));
        if (ewholder != null && !ewholder.shouldIgnore())
        {
            if (!ewholder.isRemoved() && !ewholder.isInvalid())
            {
                break; /* Loop/switch isn't completed */
            }
            recyclerview.requestLayout();
        }
_L7:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (!ewholder.needsUpdate()) goto _L7; else goto _L6
_L6:
label0:
        {
            int k = recyclerview.mAdapter.getItemViewType(ewholder.mPosition);
            if (ewholder.mItemViewType != k)
            {
                break label0;
            }
            if (!ewholder.isChanged() || !recyclerview.supportsChangeAnimations())
            {
                recyclerview.mAdapter.bindViewHolder(ewholder, ewholder.mPosition);
            } else
            {
                recyclerview.requestLayout();
            }
        }
          goto _L7
        recyclerview.requestLayout();
        resumeRequestLayout(true);
        TraceCompat.endSection();
        return;
    }

    apter()
    {
        this$0 = RecyclerView.this;
        super();
    }
}
