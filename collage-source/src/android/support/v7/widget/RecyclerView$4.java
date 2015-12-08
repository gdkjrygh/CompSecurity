// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

class this._cls0
    implements rocessCallback
{

    final RecyclerView this$0;

    public void processAppeared(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
    {
        RecyclerView.access$800(RecyclerView.this, ewholder, itemholderinfo, itemholderinfo1);
    }

    public void processDisappeared(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
    {
        mRecycler.unscrapView(ewholder);
        RecyclerView.access$700(RecyclerView.this, ewholder, itemholderinfo, itemholderinfo1);
    }

    public void processPersistent(ewHolder ewholder, emAnimator.ItemHolderInfo itemholderinfo, emAnimator.ItemHolderInfo itemholderinfo1)
    {
        ewholder.setIsRecyclable(false);
        if (RecyclerView.access$900(RecyclerView.this))
        {
            if (mItemAnimator.animateChange(ewholder, ewholder, itemholderinfo, itemholderinfo1))
            {
                RecyclerView.access$1000(RecyclerView.this);
            }
        } else
        if (mItemAnimator.animatePersistence(ewholder, itemholderinfo, itemholderinfo1))
        {
            RecyclerView.access$1000(RecyclerView.this);
            return;
        }
    }

    public void unused(ewHolder ewholder)
    {
        RecyclerView.access$1100(RecyclerView.this).removeAndRecycleView(ewholder.itemView, mRecycler);
    }

    ewHolder()
    {
        this$0 = RecyclerView.this;
        super();
    }
}
