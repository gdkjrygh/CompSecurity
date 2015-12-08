// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.support.v7.widget.bc;
import android.support.v7.widget.bv;
import android.view.ViewGroup;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQ;
import com.dominos.views.LoyaltyFAQRowView;
import com.dominos.views.LoyaltyFAQRowView_;
import java.util.ArrayList;
import java.util.List;

public class LoyaltyFAQListAdapter extends bc
{

    private Context mContext;
    private List mFAQList;
    private com.dominos.views.LoyaltyFAQRowView.LoyaltyOptOutListener mListener;
    private ArrayList mSelectedItems;

    public LoyaltyFAQListAdapter(Context context, com.dominos.views.LoyaltyFAQRowView.LoyaltyOptOutListener loyaltyoptoutlistener, List list)
    {
        mSelectedItems = new ArrayList();
        mFAQList = list;
        mContext = context;
        mListener = loyaltyoptoutlistener;
    }

    public int getItemCount()
    {
        if (mFAQList != null)
        {
            return mFAQList.size();
        } else
        {
            return 0;
        }
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public volatile void onBindViewHolder(bv bv, int i)
    {
        onBindViewHolder((ViewHolder)bv, i);
    }

    public void onBindViewHolder(final ViewHolder itemView, final int position)
    {
label0:
        {
            if (itemView.loyaltyFAQRowView instanceof LoyaltyFAQRowView)
            {
                itemView = (LoyaltyFAQRowView)itemView.loyaltyFAQRowView;
                itemView.bind((LoyaltyFAQ)mFAQList.get(position));
                itemView.setOnClickListener(new _cls1());
                if (!mSelectedItems.contains(Integer.valueOf(position)))
                {
                    break label0;
                }
                itemView.selectRow();
            }
            return;
        }
        itemView.unSelectRow();
    }

    public volatile bv onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new ViewHolder(LoyaltyFAQRowView_.build(mContext, mListener));
    }


    private class ViewHolder extends bv
    {

        private final View loyaltyFAQRowView;


        public ViewHolder(View view)
        {
            super(view);
            loyaltyFAQRowView = view;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyFAQListAdapter this$0;
        final LoyaltyFAQRowView val$itemView;
        final int val$position;

        public void onClick(View view)
        {
            if (mSelectedItems.contains(Integer.valueOf(position)))
            {
                mSelectedItems.remove(Integer.valueOf(position));
                itemView.unSelectRow();
                return;
            } else
            {
                mSelectedItems.add(Integer.valueOf(position));
                itemView.selectRow();
                return;
            }
        }

        _cls1()
        {
            this$0 = LoyaltyFAQListAdapter.this;
            position = i;
            itemView = loyaltyfaqrowview;
            super();
        }
    }

}
