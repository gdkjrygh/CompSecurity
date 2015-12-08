// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator
{

    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations;

    public SimpleItemAnimator()
    {
        mSupportsChangeAnimations = true;
    }

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewholder);

    public boolean animateAppearance(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
    {
        if (itemholderinfo != null && (itemholderinfo.left != itemholderinfo1.left || itemholderinfo.top != itemholderinfo1.top))
        {
            return animateMove(viewholder, itemholderinfo.left, itemholderinfo.top, itemholderinfo1.left, itemholderinfo1.top);
        } else
        {
            return animateAdd(viewholder);
        }
    }

    public abstract boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l);

    public boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
    {
        int k = itemholderinfo.left;
        int l = itemholderinfo.top;
        int i;
        int j;
        if (viewholder1.shouldIgnore())
        {
            i = itemholderinfo.left;
            j = itemholderinfo.top;
        } else
        {
            i = itemholderinfo1.left;
            j = itemholderinfo1.top;
        }
        return animateChange(viewholder, viewholder1, k, l, i, j);
    }

    public boolean animateDisappearance(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
    {
        int k = itemholderinfo.left;
        int l = itemholderinfo.top;
        itemholderinfo = viewholder.itemView;
        int i;
        int j;
        if (itemholderinfo1 == null)
        {
            i = itemholderinfo.getLeft();
        } else
        {
            i = itemholderinfo1.left;
        }
        if (itemholderinfo1 == null)
        {
            j = itemholderinfo.getTop();
        } else
        {
            j = itemholderinfo1.top;
        }
        if (!viewholder.isRemoved() && (k != i || l != j))
        {
            itemholderinfo.layout(i, j, itemholderinfo.getWidth() + i, itemholderinfo.getHeight() + j);
            return animateMove(viewholder, k, l, i, j);
        } else
        {
            return animateRemove(viewholder);
        }
    }

    public abstract boolean animateMove(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l);

    public boolean animatePersistence(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1)
    {
        if (itemholderinfo.left != itemholderinfo1.left || itemholderinfo.top != itemholderinfo1.top)
        {
            return animateMove(viewholder, itemholderinfo.left, itemholderinfo.top, itemholderinfo1.left, itemholderinfo1.top);
        } else
        {
            dispatchMoveFinished(viewholder);
            return false;
        }
    }

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewholder);

    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewholder)
    {
        return !mSupportsChangeAnimations || viewholder.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewholder)
    {
        onAddFinished(viewholder);
        dispatchAnimationFinished(viewholder);
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewholder)
    {
        onAddStarting(viewholder);
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewholder, boolean flag)
    {
        onChangeFinished(viewholder, flag);
        dispatchAnimationFinished(viewholder);
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewholder, boolean flag)
    {
        onChangeStarting(viewholder, flag);
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewholder)
    {
        onMoveFinished(viewholder);
        dispatchAnimationFinished(viewholder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewholder)
    {
        onMoveStarting(viewholder);
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewholder)
    {
        onRemoveFinished(viewholder);
        dispatchAnimationFinished(viewholder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewholder)
    {
        onRemoveStarting(viewholder);
    }

    public boolean getSupportsChangeAnimations()
    {
        return mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.ViewHolder viewholder)
    {
    }

    public void onAddStarting(RecyclerView.ViewHolder viewholder)
    {
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewholder, boolean flag)
    {
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewholder, boolean flag)
    {
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewholder)
    {
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewholder)
    {
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewholder)
    {
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewholder)
    {
    }

    public void setSupportsChangeAnimations(boolean flag)
    {
        mSupportsChangeAnimations = flag;
    }
}
