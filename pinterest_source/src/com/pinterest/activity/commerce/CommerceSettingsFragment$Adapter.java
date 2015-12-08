// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.ViewGroup;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.LoadMoreListItemView;
import com.pinterest.activity.commerce.view.ProductView;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.ui.listview.ListCellText;
import java.util.List;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

public class this._cls0 extends android.support.v7.widget.apter
{

    private final Object FOOTER = new Object();
    private final Object LOAD_MORE = new Object();
    private List items;
    final CommerceSettingsFragment this$0;

    private boolean hasFooter()
    {
        return items.get(items.size() - 1) == FOOTER;
    }

    private void removeFooter()
    {
        items.remove(FOOTER);
    }

    public void addFooter()
    {
        items.add(FOOTER);
    }

    public void appendItem(List list)
    {
        boolean flag = hasFooter();
        if (flag)
        {
            CommerceSettingsFragment.access$300(CommerceSettingsFragment.this).removeFooter();
        }
        if (items.get(items.size() - 1) == LOAD_MORE)
        {
            items.remove(LOAD_MORE);
        }
        items.addAll(list);
        if (flag)
        {
            CommerceSettingsFragment.access$300(CommerceSettingsFragment.this).addFooter();
        }
        notifyDataSetChanged();
        CommerceSettingsFragment.access$900(CommerceSettingsFragment.this);
    }

    public void clearItems()
    {
        items = null;
        notifyDataSetChanged();
        CommerceSettingsFragment.access$900(CommerceSettingsFragment.this);
    }

    public int getItemCount()
    {
        if (items == null)
        {
            return 0;
        } else
        {
            return items.size();
        }
    }

    public int getItemViewType(int i)
    {
        Object obj = items.get(i);
        if (obj == FOOTER)
        {
            return ter.inal();
        }
        if (obj == LOAD_MORE)
        {
            return dMore.inal();
        }
        if (obj instanceof Cart)
        {
            return er.inal();
        }
        if (obj instanceof DetailedShipping)
        {
            return ppingAddress.inal();
        }
        if (obj instanceof UserCard)
        {
            return mentMethod.inal();
        } else
        {
            throw new IllegalStateException("unknown view type");
        }
    }

    public void maybeAddLoadMoreItem()
    {
        while (items == null || items.get(items.size() - 1) == LOAD_MORE) 
        {
            return;
        }
        items.add(LOAD_MORE);
        notifyDataSetChanged();
    }

    public void maybeRemoveLoadMoreItem()
    {
        while (items == null || items.get(items.size() - 1) != LOAD_MORE) 
        {
            return;
        }
        items.remove(LOAD_MORE);
        notifyDataSetChanged();
    }

    public volatile void onBindViewHolder(android.support.v7.widget.apter apter, int i)
    {
        class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
        {

            public LoadMoreListItemView loadMoreListItemView;
            public ProductView productView;
            public ListCellText textView;
            final CommerceSettingsFragment.Adapter this$1;

            public ViewHolder(LoadMoreListItemView loadmorelistitemview)
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                super(loadmorelistitemview);
                loadMoreListItemView = loadmorelistitemview;
            }

            public ViewHolder(ProductView productview)
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                super(productview);
                productView = productview;
            }

            public ViewHolder(ListCellText listcelltext, boolean flag)
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                super(listcelltext);
                textView = listcelltext;
                textView.setMaxLines(0x7fffffff);
                textView.setSingleLine(false);
                if (!flag)
                {
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
        }

        onBindViewHolder((ViewHolder)apter, i);
    }

    public void onBindViewHolder(ViewHolder viewholder, int i)
    {
        final Object cart;
        _cls7.this._cls1 _lcls1;
        cart = items.get(i);
        _lcls1 = Type(getItemViewType(i));
        chMap.com.pinterest.activity.commerce.CommerceSettingsFragment.Type[_lcls1.inal()];
        JVM INSTR tableswitch 1 5: default 64
    //                   1 65
    //                   2 145
    //                   3 96
    //                   4 64
    //                   5 194;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        return;
_L2:
        cart = (Cart)cart;
        viewholder.productView.bind(((Cart) (cart)), true);
        class _cls1
            implements android.view.View.OnClickListener
        {

            final CommerceSettingsFragment.Adapter this$1;
            final Cart val$cart;

            public void onClick(View view)
            {
                Pinalytics.a(EventType.TAP, ElementType.BUYABLE_ORDER_HISTORY_CELL, ComponentType.NAVIGATION, null);
                view = new Navigation(Location.COMMERCE_ORDER_DETAIL);
                view.putExtra("cart", cart);
                Events.post(view);
            }

            _cls1()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                cart = cart1;
                super();
            }
        }

        viewholder.productView.setOnClickListener(new _cls1());
        return;
_L4:
        cart = (DetailedShipping)cart;
        viewholder.textView.setText(BuyableProductHelper.getFormattedAddress(((DetailedShipping) (cart))));
        class _cls2
            implements android.view.View.OnClickListener
        {

            final CommerceSettingsFragment.Adapter this$1;
            final DetailedShipping val$shipping;

            public void onClick(View view)
            {
                CommerceUtil.goAddressIntent(view.getContext(), shipping);
            }

            _cls2()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                shipping = detailedshipping;
                super();
            }
        }

        viewholder.textView.setOnClickListener(new _cls2());
        class _cls3
            implements android.view.View.OnLongClickListener
        {

            final CommerceSettingsFragment.Adapter this$1;
            final DetailedShipping val$shipping;

            public boolean onLongClick(View view)
            {
                Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForShippingAddress(shipping)));
                return true;
            }

            _cls3()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                shipping = detailedshipping;
                super();
            }
        }

        viewholder.textView.setOnLongClickListener(new _cls3());
        return;
_L3:
        final UserCard userCard = (UserCard)cart;
        viewholder.textView.setText(BuyableProductHelper.getFormattedUserCard(userCard));
        class _cls4
            implements android.view.View.OnClickListener
        {

            final CommerceSettingsFragment.Adapter this$1;
            final UserCard val$userCard;

            public void onClick(View view)
            {
                CommerceUtil.goPaymentIntent(view.getContext(), userCard);
            }

            _cls4()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                userCard = usercard;
                super();
            }
        }

        viewholder.textView.setOnClickListener(new _cls4());
        class _cls5
            implements android.view.View.OnLongClickListener
        {

            final CommerceSettingsFragment.Adapter this$1;
            final UserCard val$userCard;

            public boolean onLongClick(View view)
            {
                Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForPaymentMethod(userCard)));
                return true;
            }

            _cls5()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                userCard = usercard;
                super();
            }
        }

        viewholder.textView.setOnLongClickListener(new _cls5());
        return;
_L5:
        if (CommerceSettingsFragment.access$800(CommerceSettingsFragment.this).equals("VALUE_ADDRESSES"))
        {
            viewholder.textView.setText(Resources.string(0x7f070123));
            class _cls6
                implements android.view.View.OnClickListener
            {

                final CommerceSettingsFragment.Adapter this$1;

                public void onClick(View view)
                {
                    CommerceUtil.goAddressIntent(view.getContext());
                }

            _cls6()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                super();
            }
            }

            viewholder.textView.setOnClickListener(new _cls6());
            return;
        }
        if (CommerceSettingsFragment.access$800(CommerceSettingsFragment.this).equals("VALUE_PAYMENT_METHODS"))
        {
            viewholder.textView.setText(Resources.string(0x7f070124));
            class _cls7
                implements android.view.View.OnClickListener
            {

                final CommerceSettingsFragment.Adapter this$1;

                public void onClick(View view)
                {
                    CommerceUtil.goPaymentIntent(view.getContext());
                }

            _cls7()
            {
                this$1 = CommerceSettingsFragment.Adapter.this;
                super();
            }
            }

            viewholder.textView.setOnClickListener(new _cls7());
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public volatile android.support.v7.widget.apter onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        ViewHolder viewholder = Type(i);
        switch (chMap.com.pinterest.activity.commerce.CommerceSettingsFragment.Type[viewholder.inal()])
        {
        default:
            throw new IllegalStateException("unknown viewtype");

        case 1: // '\001'
            return new ViewHolder(new ProductView(viewgroup.getContext()));

        case 2: // '\002'
        case 3: // '\003'
            return new ViewHolder(new ListCellText(viewgroup.getContext()), false);

        case 4: // '\004'
            return new ViewHolder(new LoadMoreListItemView(viewgroup.getContext()));

        case 5: // '\005'
            return new ViewHolder(new ListCellText(viewgroup.getContext()), true);
        }
    }

    public void setItems(List list)
    {
        items = list;
        notifyDataSetChanged();
        CommerceSettingsFragment.access$900(CommerceSettingsFragment.this);
    }

    public ViewHolder()
    {
        this$0 = CommerceSettingsFragment.this;
        super();
    }
}
