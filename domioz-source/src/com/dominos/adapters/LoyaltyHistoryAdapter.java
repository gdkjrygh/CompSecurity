// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.support.v7.widget.bc;
import android.support.v7.widget.bv;
import android.view.ViewGroup;
import com.dominos.android.sdk.core.models.loyalty.History;
import com.dominos.views.LoyaltyHeaderRowView;
import com.dominos.views.LoyaltyHeaderRowView_;
import com.dominos.views.LoyaltyHistoryRowView;
import com.dominos.views.LoyaltyHistoryRowView_;
import com.dominos.views.LoyaltyPointsExpireView_;
import java.util.ArrayList;
import java.util.List;

public class LoyaltyHistoryAdapter extends bc
{

    private static final int FOOTER = 2;
    private static final int HEADER = 0;
    private static final int REGULAR_ITEM = 1;
    private Context mContext;
    private List mHistoryList;
    private ArrayList mSelectedItems;

    public LoyaltyHistoryAdapter(Context context, List list)
    {
        mSelectedItems = new ArrayList();
        mHistoryList = list;
        mContext = context;
    }

    public int getItemCount()
    {
        if (mHistoryList != null)
        {
            return mHistoryList.size() + 1;
        } else
        {
            return 0;
        }
    }

    public int getItemViewType(int i)
    {
        if (i == mHistoryList.size())
        {
            return 2;
        }
        return !((History)mHistoryList.get(i)).isHeader() ? 1 : 0;
    }

    public volatile void onBindViewHolder(bv bv, int i)
    {
        onBindViewHolder((ViewHolder)bv, i);
    }

    public void onBindViewHolder(final ViewHolder itemView, final int position)
    {
        if (!(itemView.loyatyHistoryRowView instanceof LoyaltyHistoryRowView)) goto _L2; else goto _L1
_L1:
        itemView = (LoyaltyHistoryRowView)itemView.loyatyHistoryRowView;
        itemView.bind((History)mHistoryList.get(position), false, false);
        itemView.setOnClickListener(new _cls1());
        if (!mSelectedItems.contains(Integer.valueOf(position))) goto _L4; else goto _L3
_L3:
        itemView.selectRow();
_L6:
        return;
_L4:
        itemView.deselectRow();
        return;
_L2:
        if (itemView.loyatyHistoryRowView instanceof LoyaltyHeaderRowView)
        {
            ((LoyaltyHeaderRowView)itemView.loyatyHistoryRowView).bind(mContext, ((History)mHistoryList.get(position)).getType());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile bv onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return new ViewHolder(LoyaltyHistoryRowView_.build(mContext));

        case 0: // '\0'
            return new ViewHolder(LoyaltyHeaderRowView_.build(mContext));

        case 2: // '\002'
            return new ViewHolder(LoyaltyPointsExpireView_.build(mContext));
        }
    }


    private class ViewHolder extends bv
    {

        private final View loyatyHistoryRowView;


        public ViewHolder(View view)
        {
            super(view);
            loyatyHistoryRowView = view;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyHistoryAdapter this$0;
        final LoyaltyHistoryRowView val$itemView;
        final int val$position;

        public void onClick(View view)
        {
            if (mSelectedItems.contains(Integer.valueOf(position)))
            {
                mSelectedItems.remove(Integer.valueOf(position));
                itemView.deselectRow();
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
            this$0 = LoyaltyHistoryAdapter.this;
            position = i;
            itemView = loyaltyhistoryrowview;
            super();
        }
    }

}
