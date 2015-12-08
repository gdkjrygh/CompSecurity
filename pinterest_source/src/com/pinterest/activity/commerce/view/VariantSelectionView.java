// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.ui.text.PTextView;
import java.util.List;

public class VariantSelectionView extends LinearLayout
{

    private static final int GRID_NUM_CIRCLES = 4;
    private boolean showPrice;
    PTextView titleTextView;
    private VariantAdapter variantAdapter;
    RecyclerView variantRecyclerView;
    private ViewType viewType;

    public VariantSelectionView(Context context, ViewType viewtype, boolean flag)
    {
        super(context);
        inflate(context, 0x7f0301b8, this);
        ButterKnife.a(this);
        showPrice = flag;
        viewType = viewtype;
        setOrientation(1);
        variantRecyclerView.setHasFixedSize(true);
        RecyclerView recyclerview = variantRecyclerView;
        if (viewtype == ViewType.Grid)
        {
            context = new GridLayoutManager(context, 4);
        } else
        {
            context = new LinearLayoutManager(context);
        }
        recyclerview.setLayoutManager(context);
        variantAdapter = new VariantAdapter();
        variantRecyclerView.setAdapter(variantAdapter);
    }

    public void addItems(List list)
    {
        variantAdapter.addItems(list);
    }

    public void setHeader(String s)
    {
        titleTextView.setText(s);
    }



    private class ViewType extends Enum
    {

        private static final ViewType $VALUES[];
        public static final ViewType Grid;
        public static final ViewType List;

        public static ViewType valueOf(String s)
        {
            return (ViewType)Enum.valueOf(com/pinterest/activity/commerce/view/VariantSelectionView$ViewType, s);
        }

        public static ViewType[] values()
        {
            return (ViewType[])$VALUES.clone();
        }

        static 
        {
            Grid = new ViewType("Grid", 0);
            List = new ViewType("List", 1);
            $VALUES = (new ViewType[] {
                Grid, List
            });
        }

        private ViewType(String s, int i)
        {
            super(s, i);
        }
    }


    private class VariantAdapter extends android.support.v7.widget.RecyclerView.Adapter
    {

        private List items;
        final VariantSelectionView this$0;

        public void addItems(List list)
        {
            items.addAll(list);
            notifyDataSetChanged();
        }

        public int getItemCount()
        {
            return items.size();
        }

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
            {

                final VariantAdapter this$1;
                public VariantItemView variantItemView;

                public ViewHolder(View view)
                {
                    this$1 = VariantAdapter.this;
                    super(view);
                    variantItemView = (VariantItemView)view;
                }
            }

            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            Object obj = null;
            final VariantRowItem variantRowItem = (VariantRowItem)items.get(i);
            VariantItemView variantitemview = viewholder.variantItemView;
            variantitemview.setTitle(variantRowItem.getTitle());
            if (showPrice)
            {
                viewholder = variantRowItem.getPrice();
            } else
            {
                viewholder = null;
            }
            variantitemview.setPrice(viewholder);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final VariantAdapter this$1;
                final VariantRowItem val$variantRowItem;

                public void onClick(View view)
                {
                    EventType eventtype = EventType.TAP;
                    if (viewType == ViewType.Grid)
                    {
                        view = ElementType.BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL;
                    } else
                    {
                        view = ElementType.BUYABLE_CHECKOUT_VARIANT_TABLE_CELL;
                    }
                    Pinalytics.b(eventtype, view, null, null);
                    Events.post(new VariantSelectedEvent(variantRowItem));
                }

                _cls1()
                {
                    this$1 = VariantAdapter.this;
                    variantRowItem = variantrowitem;
                    super();
                }
            }

            if (!variantRowItem.isInStock())
            {
                viewholder = obj;
            } else
            {
                viewholder = new _cls1();
            }
            variantitemview.setRowClickListener(viewholder);
            variantitemview.setAvailable(variantRowItem.isInStock());
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            if (viewType == ViewType.Grid)
            {
                viewgroup = new VariantItemCircleView(getContext());
            } else
            {
                viewgroup = new VariantItemRowView(getContext());
            }
            return new ViewHolder(viewgroup);
        }

        public VariantAdapter()
        {
            this$0 = VariantSelectionView.this;
            super();
            items = new ArrayList();
        }
    }

}
