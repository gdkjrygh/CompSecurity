// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.support.v7.widget.bc;
import android.support.v7.widget.bv;
import android.view.View;
import android.view.ViewGroup;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.views.HistoricalItemView;
import com.dominos.views.HistoricalItemView_;
import java.util.List;

public class HistoricalListAdapter extends bc
{

    private static final int VIEW_TYPE_FOOTER = 1;
    private static final int VIEW_TYPE_ITEM = 0;
    private final Context mContext;
    private View mFooterView;
    private final List mHistoricalList;
    private OnHistoricalListListener mHistoricalListListener;

    public HistoricalListAdapter(Context context, List list, View view)
    {
        mHistoricalList = list;
        mContext = context;
        mFooterView = view;
    }

    private boolean isPositionFooter(int i)
    {
        return i == mHistoricalList.size();
    }

    public int getItemCount()
    {
        if (mHistoricalList != null)
        {
            return mHistoricalList.size() + 1;
        } else
        {
            return 0;
        }
    }

    public int getItemViewType(int i)
    {
        return !isPositionFooter(i) ? 0 : 1;
    }

    public volatile void onBindViewHolder(bv bv, int i)
    {
        onBindViewHolder((ViewHolder)bv, i);
    }

    public void onBindViewHolder(ViewHolder viewholder, final int position)
    {
        if (viewholder.historicalItemView instanceof HistoricalItemView)
        {
            ((HistoricalItemView)viewholder.historicalItemView).bind(Integer.toString(position + 1), (LabsOrder)mHistoricalList.get(position), new _cls1());
        }
    }

    public volatile bv onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        if (i == 1)
        {
            return new ViewHolder(mFooterView);
        } else
        {
            return new ViewHolder(HistoricalItemView_.build(mContext));
        }
    }

    public void setHistoricalListListener(OnHistoricalListListener onhistoricallistlistener)
    {
        mHistoricalListListener = onhistoricallistlistener;
    }


    private class ViewHolder extends bv
    {

        private final View historicalItemView;


        public ViewHolder(View view)
        {
            super(view);
            historicalItemView = view;
        }
    }


    private class _cls1 extends com.dominos.views.HistoricalItemView.HistoricalItemCallback
    {

        final HistoricalListAdapter this$0;
        final int val$position;

        public void onReorderButtonClicked(LabsOrder labsorder)
        {
            if (mHistoricalListListener != null)
            {
                mHistoricalListListener.onReorderButtonClicked(labsorder, position);
            }
        }

        _cls1()
        {
            this$0 = HistoricalListAdapter.this;
            position = i;
            super();
        }

        private class OnHistoricalListListener
        {

            public abstract void onReorderButtonClicked(LabsOrder labsorder, int i);
        }

    }

}
