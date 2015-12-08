// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.support.v7.widget.RecyclerView;

public class ItemClickSupport
{

    private OnItemClickListener mItemClickListener;
    private OnItemLongClickListener mItemLongClickListener;
    private final RecyclerView mRecyclerView;
    private final TouchListener mTouchListener;

    private ItemClickSupport(RecyclerView recyclerview)
    {
        mRecyclerView = recyclerview;
        mTouchListener = new TouchListener(recyclerview);
        recyclerview.a(mTouchListener);
    }

    public static ItemClickSupport addTo(RecyclerView recyclerview)
    {
        ItemClickSupport itemclicksupport1 = from(recyclerview);
        ItemClickSupport itemclicksupport = itemclicksupport1;
        if (itemclicksupport1 == null)
        {
            itemclicksupport = new ItemClickSupport(recyclerview);
            recyclerview.setTag(R.id.twowayview_item_click_support, itemclicksupport);
        }
        return itemclicksupport;
    }

    public static ItemClickSupport from(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            return null;
        } else
        {
            return (ItemClickSupport)recyclerview.getTag(R.id.twowayview_item_click_support);
        }
    }

    public static void removeFrom(RecyclerView recyclerview)
    {
        ItemClickSupport itemclicksupport = from(recyclerview);
        if (itemclicksupport == null)
        {
            return;
        } else
        {
            recyclerview.b(itemclicksupport.mTouchListener);
            recyclerview.setTag(R.id.twowayview_item_click_support, null);
            return;
        }
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        mItemClickListener = onitemclicklistener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onitemlongclicklistener)
    {
        if (!mRecyclerView.isLongClickable())
        {
            mRecyclerView.setLongClickable(true);
        }
        mItemLongClickListener = onitemlongclicklistener;
    }



    private class TouchListener extends ClickItemTouchListener
    {

        final ItemClickSupport this$0;

        boolean performItemClick(RecyclerView recyclerview, View view, int i, long l)
        {
            boolean flag = false;
            if (mItemClickListener != null)
            {
                view.playSoundEffect(0);
                mItemClickListener.onItemClick(recyclerview, view, i, l);
                flag = true;
            }
            return flag;
        }

        boolean performItemLongClick(RecyclerView recyclerview, View view, int i, long l)
        {
            boolean flag = false;
            if (mItemLongClickListener != null)
            {
                view.performHapticFeedback(0);
                flag = mItemLongClickListener.onItemLongClick(recyclerview, view, i, l);
            }
            return flag;
        }

        TouchListener(RecyclerView recyclerview)
        {
            this$0 = ItemClickSupport.this;
            super(recyclerview);
        }

        private class OnItemClickListener
        {

            public abstract void onItemClick(RecyclerView recyclerview, View view, int i, long l);
        }


        private class OnItemLongClickListener
        {

            public abstract boolean onItemLongClick(RecyclerView recyclerview, View view, int i, long l);
        }

    }

}
