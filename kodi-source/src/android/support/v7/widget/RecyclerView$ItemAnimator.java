// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class ItemAnimatorListener
{
    static interface ItemAnimatorListener
    {
    }


    private ItemAnimatorListener mListener;
    private boolean mSupportsChangeAnimations;

    public abstract boolean animateAdd(ItemAnimatorListener itemanimatorlistener);

    public abstract boolean animateChange(ItemAnimatorListener itemanimatorlistener, ItemAnimatorListener itemanimatorlistener1, int i, int j, int k, int l);

    public abstract boolean animateMove(ItemAnimatorListener itemanimatorlistener, int i, int j, int k, int l);

    public abstract boolean animateRemove(ItemAnimatorListener itemanimatorlistener);

    public abstract void endAnimation(ItemAnimatorListener itemanimatorlistener);

    public abstract void endAnimations();

    public boolean getSupportsChangeAnimations()
    {
        return mSupportsChangeAnimations;
    }

    public abstract boolean isRunning();

    void setListener(ItemAnimatorListener itemanimatorlistener)
    {
        mListener = itemanimatorlistener;
    }
}
