// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, ChildHelper

final class this._cls0
    implements allback
{

    final RecyclerView this$0;

    private void dispatchUpdate(pdateOp pdateop)
    {
        switch (pdateop.cmd)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.access$1100(RecyclerView.this).onItemsAdded(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
            return;

        case 1: // '\001'
            RecyclerView.access$1100(RecyclerView.this).onItemsRemoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
            return;

        case 2: // '\002'
            RecyclerView.access$1100(RecyclerView.this).onItemsUpdated(RecyclerView.this, pdateop.positionStart, pdateop.itemCount);
            return;

        case 3: // '\003'
            RecyclerView.access$1100(RecyclerView.this).onItemsMoved(RecyclerView.this, pdateop.positionStart, pdateop.itemCount, 1);
            break;
        }
    }

    public final ewHolder findViewHolder(int i)
    {
        Object obj;
        int j;
        int k;
        obj = RecyclerView.this;
        k = ((RecyclerView) (obj)).mChildHelper.getUnfilteredChildCount();
        j = 0;
_L10:
        if (j >= k) goto _L2; else goto _L1
_L1:
        ewHolder ewholder = RecyclerView.getChildViewHolderInt(((RecyclerView) (obj)).mChildHelper.getUnfilteredChildAt(j));
        if (ewholder == null || ewholder.isRemoved() || ewholder.mPosition != i) goto _L4; else goto _L3
_L3:
        if (ewholder != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L8:
        return ((ewHolder) (obj));
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        ewholder = null;
          goto _L3
_L6:
        obj = ewholder;
        if (!mChildHelper.isHidden(ewholder.itemView)) goto _L8; else goto _L7
_L7:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void markViewHoldersUpdated(int i, int j)
    {
        boolean flag = false;
        Object obj = RecyclerView.this;
        int j1 = ((RecyclerView) (obj)).mChildHelper.getUnfilteredChildCount();
        for (int k = 0; k < j1; k++)
        {
            View view = ((RecyclerView) (obj)).mChildHelper.getUnfilteredChildAt(k);
            ewHolder ewholder1 = RecyclerView.getChildViewHolderInt(view);
            if (ewholder1 == null || ewholder1.shouldIgnore() || ewholder1.mPosition < i || ewholder1.mPosition >= i + j)
            {
                continue;
            }
            ewholder1.addFlags(2);
            if (((RecyclerView) (obj)).supportsChangeAnimations())
            {
                ewholder1.addFlags(64);
            }
            ((youtParams)view.getLayoutParams()).mInsetsDirty = true;
        }

        obj = ((RecyclerView) (obj)).mRecycler;
        j1 = ((cycler) (obj)).mCachedViews.size();
        for (int l = ((flag) ? 1 : 0); l < j1; l++)
        {
            ewHolder ewholder = (ewHolder)((cycler) (obj)).mCachedViews.get(l);
            if (ewholder == null)
            {
                continue;
            }
            int i1 = ewholder.getLayoutPosition();
            if (i1 >= i && i1 < i + j)
            {
                ewholder.addFlags(2);
            }
        }

        mItemsChanged = true;
    }

    public final void offsetPositionsForAdd(int i, int j)
    {
        RecyclerView recyclerview = RecyclerView.this;
        int i1 = recyclerview.mChildHelper.getUnfilteredChildCount();
        for (int k = 0; k < i1; k++)
        {
            ewHolder ewholder = RecyclerView.getChildViewHolderInt(recyclerview.mChildHelper.getUnfilteredChildAt(k));
            if (ewholder != null && !ewholder.shouldIgnore() && ewholder.mPosition >= i)
            {
                ewholder.offsetPosition(j, false);
                recyclerview.mState.mStructureChanged = true;
            }
        }

        cycler cycler = recyclerview.mRecycler;
        i1 = cycler.mCachedViews.size();
        for (int l = 0; l < i1; l++)
        {
            ewHolder ewholder1 = (ewHolder)cycler.mCachedViews.get(l);
            if (ewholder1 != null && ewholder1.getLayoutPosition() >= i)
            {
                ewholder1.offsetPosition(j, true);
            }
        }

        recyclerview.requestLayout();
        mItemsAddedOrRemoved = true;
    }

    public final void offsetPositionsForMove(int i, int j)
    {
        int j1 = -1;
        RecyclerView recyclerview = RecyclerView.this;
        int k1 = recyclerview.mChildHelper.getUnfilteredChildCount();
        byte byte0;
        int k;
        int l;
        int i1;
        if (i < j)
        {
            byte0 = -1;
            k = j;
            l = i;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        i1 = 0;
        while (i1 < k1) 
        {
            ewHolder ewholder = RecyclerView.getChildViewHolderInt(recyclerview.mChildHelper.getUnfilteredChildAt(i1));
            if (ewholder != null && ewholder.mPosition >= l && ewholder.mPosition <= k)
            {
                if (ewholder.mPosition == i)
                {
                    ewholder.offsetPosition(j - i, false);
                } else
                {
                    ewholder.offsetPosition(byte0, false);
                }
                recyclerview.mState.mStructureChanged = true;
            }
            i1++;
        }
        cycler cycler = recyclerview.mRecycler;
        if (i < j)
        {
            k = j;
            l = i;
            byte0 = j1;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        j1 = cycler.mCachedViews.size();
        i1 = 0;
        while (i1 < j1) 
        {
            ewHolder ewholder1 = (ewHolder)cycler.mCachedViews.get(i1);
            if (ewholder1 != null && ewholder1.mPosition >= l && ewholder1.mPosition <= k)
            {
                if (ewholder1.mPosition == i)
                {
                    ewholder1.offsetPosition(j - i, false);
                } else
                {
                    ewholder1.offsetPosition(byte0, false);
                }
            }
            i1++;
        }
        recyclerview.requestLayout();
        mItemsAddedOrRemoved = true;
    }

    public final void offsetPositionsForRemovingInvisible(int i, int j)
    {
        offsetPositionRecordsForRemove(i, j, true);
        mItemsAddedOrRemoved = true;
        ate ate = mState;
        ate.mDeletedInvisibleItemCountSincePreviousLayout = ate.mDeletedInvisibleItemCountSincePreviousLayout + j;
    }

    public final void offsetPositionsForRemovingLaidOutOrNewView(int i, int j)
    {
        offsetPositionRecordsForRemove(i, j, false);
        mItemsAddedOrRemoved = true;
    }

    public final void onDispatchFirstPass(pdateOp pdateop)
    {
        dispatchUpdate(pdateop);
    }

    public final void onDispatchSecondPass(pdateOp pdateop)
    {
        dispatchUpdate(pdateop);
    }

    pdateOp()
    {
        this$0 = RecyclerView.this;
        super();
    }
}
