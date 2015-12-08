// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.PaymentSelectedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressSelectedEvent;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.di.components.FragmentComponent;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.api.ApiResponse;

public class CommerceSettingsFragment extends BaseFragment
{

    public static final String COMMERCE_SETTING_ERROR = "CommerceSettingsFragment must receive the type of commerce setting";
    private Adapter adapter;
    CommerceApiManager commerceApiManager;
    private String commerceSetting;
    RelativeLayout emptyStateContainer;
    ProgressBar emptyStateSpinner;
    TextView emptyStateText;
    private com.pinterest.base.Events.EventsSubscriber eventsStickySubscriber;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    private boolean hasLoadMoreFired;
    private String lastBookmark;
    RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    private boolean showLoadMore;
    Button startShoppingButton;

    public CommerceSettingsFragment()
    {
        eventsSubscriber = new _cls1();
        eventsStickySubscriber = new _cls2();
        _layoutId = 0x7f0300b3;
        _menuId = 0x7f100002;
    }

    private String getEmptyStateText()
    {
        if (commerceSetting.equals("VALUE_ORDER_HISTORY"))
        {
            return Resources.string(0x7f07014d);
        } else
        {
            return "";
        }
    }

    private void handleGenericLoadMoreSuccess(ApiResponse apiresponse, boolean flag)
    {
        updateEmptyState(false);
        lastBookmark = apiresponse.getBookmark();
        if (lastBookmark != null && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showLoadMore = flag;
        hasLoadMoreFired = false;
        adapter.maybeRemoveLoadMoreItem();
    }

    private void handleGenericSuccess(ApiResponse apiresponse, boolean flag)
    {
        updateEmptyState(false);
        lastBookmark = apiresponse.getBookmark();
        if (lastBookmark != null && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showLoadMore = flag;
        refreshLayout.setRefreshing(false);
    }

    private void handleLoadMore()
    {
        if (lastBookmark == null)
        {
            adapter.maybeRemoveLoadMoreItem();
        } else
        {
            adapter.maybeAddLoadMoreItem();
            updateEmptyState(true);
            if (commerceSetting.equals("VALUE_ORDER_HISTORY"))
            {
                commerceApiManager.a(lastBookmark, new _cls6());
                return;
            }
            if (commerceSetting.equals("VALUE_PAYMENT_METHODS"))
            {
                commerceApiManager.e(lastBookmark, new _cls7());
                return;
            }
            if (commerceSetting.equals("VALUE_ADDRESSES"))
            {
                commerceApiManager.c(lastBookmark, new _cls8());
                return;
            }
        }
    }

    private void maybeFireLoadMore()
    {
        if (!hasLoadMoreFired && showLoadMore)
        {
            android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerView.getLayoutManager();
            int i = layoutmanager.getChildCount();
            int j = layoutmanager.getItemCount();
            int k = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (j != 0 && k + i + 3 > j)
            {
                hasLoadMoreFired = true;
                handleLoadMore();
                return;
            }
        }
    }

    private void resetAndLoadData()
    {
        adapter.clearItems();
        lastBookmark = null;
        updateEmptyState(true);
        if (commerceSetting.equals("VALUE_ORDER_HISTORY"))
        {
            commerceApiManager.a(null, new _cls9());
        } else
        {
            if (commerceSetting.equals("VALUE_PAYMENT_METHODS"))
            {
                commerceApiManager.b(new _cls10());
                return;
            }
            if (commerceSetting.equals("VALUE_ADDRESSES"))
            {
                commerceApiManager.a(new _cls11());
                return;
            }
        }
    }

    private void updateEmptyState()
    {
        updateEmptyState(false);
    }

    private void updateEmptyState(boolean flag)
    {
        RelativeLayout relativelayout = emptyStateContainer;
        int i;
        if (adapter.getItemCount() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        relativelayout.setVisibility(i);
        if (flag)
        {
            emptyStateSpinner.setVisibility(0);
            emptyStateText.setVisibility(8);
            startShoppingButton.setVisibility(8);
        } else
        {
            emptyStateSpinner.setVisibility(8);
            emptyStateText.setVisibility(0);
            emptyStateText.setText(getEmptyStateText());
            if (commerceSetting.equals("VALUE_ORDER_HISTORY") && CommerceHelper.isCommerceShopSpaceEnabled())
            {
                startShoppingButton.setVisibility(0);
                startShoppingButton.setOnClickListener(new _cls5());
                return;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        Events.unregister(eventsSubscriber);
        Events.unregister(eventsStickySubscriber);
    }

    public void onResume()
    {
        super.onResume();
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/PaymentMethodDeletedEvent, new Class[] {
            com/pinterest/activity/commerce/event/ShippingAddressDeletedEvent
        });
        Events.registerSticky(eventsStickySubscriber, com/pinterest/activity/commerce/event/PaymentSelectedEvent, new Class[] {
            com/pinterest/activity/commerce/event/ShippingAddressSelectedEvent
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.pinterest.EXTRA_COMMERCE_SETTINGS", commerceSetting);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getComponent().inject(this);
        ButterKnife.a(this, view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        refreshLayout.setOnRefreshListener(new _cls3());
        recyclerView.setOnScrollListener(new _cls4());
        if (bundle != null)
        {
            commerceSetting = bundle.getString("com.pinterest.EXTRA_COMMERCE_SETTINGS");
        }
        if (TextUtils.isEmpty(commerceSetting))
        {
            throw new IllegalStateException("CommerceSettingsFragment must receive the type of commerce setting");
        }
        if (commerceSetting.equals("VALUE_ORDER_HISTORY"))
        {
            _actionBar.setTitle(0x7f070142);
        } else
        if (commerceSetting.equals("VALUE_PAYMENT_METHODS"))
        {
            _actionBar.setTitle(0x7f070147);
        } else
        if (commerceSetting.equals("VALUE_ADDRESSES"))
        {
            _actionBar.setTitle(0x7f070103);
        } else
        {
            throw new IllegalStateException("CommerceSettingsFragment must receive the type of commerce setting");
        }
        updateEmptyState();
        resetAndLoadData();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        navigation = ((Navigation) (navigation.getExtra("com.pinterest.EXTRA_COMMERCE_SETTINGS")));
        if (navigation != null)
        {
            commerceSetting = (String)navigation;
        }
    }







/*
    static boolean access$602(CommerceSettingsFragment commercesettingsfragment, boolean flag)
    {
        commercesettingsfragment.hasLoadMoreFired = flag;
        return flag;
    }

*/




    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CommerceSettingsFragment this$0;

        public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
        {
            resetAndLoadData();
        }

        public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
        {
            resetAndLoadData();
        }

        _cls1()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CommerceSettingsFragment this$0;

        public void onEventMainThread(PaymentSelectedEvent paymentselectedevent)
        {
            Events.removeStickyEvent(paymentselectedevent);
            resetAndLoadData();
        }

        public void onEventMainThread(ShippingAddressSelectedEvent shippingaddressselectedevent)
        {
            Events.removeStickyEvent(shippingaddressselectedevent);
            resetAndLoadData();
        }

        _cls2()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }
    }


    private class Adapter extends android.support.v7.widget.RecyclerView.Adapter
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
                adapter.removeFooter();
            }
            if (items.get(items.size() - 1) == LOAD_MORE)
            {
                items.remove(LOAD_MORE);
            }
            items.addAll(list);
            if (flag)
            {
                adapter.addFooter();
            }
            notifyDataSetChanged();
            updateEmptyState();
        }

        public void clearItems()
        {
            items = null;
            notifyDataSetChanged();
            updateEmptyState();
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
                return Type.Footer.ordinal();
            }
            if (obj == LOAD_MORE)
            {
                return Type.LoadMore.ordinal();
            }
            if (obj instanceof Cart)
            {
                return Type.Order.ordinal();
            }
            if (obj instanceof DetailedShipping)
            {
                return Type.ShippingAddress.ordinal();
            }
            if (obj instanceof UserCard)
            {
                return Type.PaymentMethod.ordinal();
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

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
            {

                public LoadMoreListItemView loadMoreListItemView;
                public ProductView productView;
                public ListCellText textView;
                final Adapter this$1;

                public ViewHolder(LoadMoreListItemView loadmorelistitemview)
                {
                    this$1 = Adapter.this;
                    super(loadmorelistitemview);
                    loadMoreListItemView = loadmorelistitemview;
                }

                public ViewHolder(ProductView productview)
                {
                    this$1 = Adapter.this;
                    super(productview);
                    productView = productview;
                }

                public ViewHolder(ListCellText listcelltext, boolean flag)
                {
                    this$1 = Adapter.this;
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

            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            final Object cart;
            Type type;
            cart = items.get(i);
            type = Type.getType(getItemViewType(i));
            _cls12..SwitchMap.com.pinterest.activity.commerce.CommerceSettingsFragment.Type[type.ordinal()];
            JVM INSTR tableswitch 1 5: default 64
        //                       1 65
        //                       2 145
        //                       3 96
        //                       4 64
        //                       5 194;
               goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
            return;
_L2:
            cart = (Cart)cart;
            viewholder.productView.bind(((Cart) (cart)), true);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final Adapter this$1;
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
                    this$1 = Adapter.this;
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

                final Adapter this$1;
                final DetailedShipping val$shipping;

                public void onClick(View view)
                {
                    CommerceUtil.goAddressIntent(view.getContext(), shipping);
                }

                _cls2()
                {
                    this$1 = Adapter.this;
                    shipping = detailedshipping;
                    super();
                }
            }

            viewholder.textView.setOnClickListener(new _cls2());
            class _cls3
                implements android.view.View.OnLongClickListener
            {

                final Adapter this$1;
                final DetailedShipping val$shipping;

                public boolean onLongClick(View view)
                {
                    Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForShippingAddress(shipping)));
                    return true;
                }

                _cls3()
                {
                    this$1 = Adapter.this;
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

                final Adapter this$1;
                final UserCard val$userCard;

                public void onClick(View view)
                {
                    CommerceUtil.goPaymentIntent(view.getContext(), userCard);
                }

                _cls4()
                {
                    this$1 = Adapter.this;
                    userCard = usercard;
                    super();
                }
            }

            viewholder.textView.setOnClickListener(new _cls4());
            class _cls5
                implements android.view.View.OnLongClickListener
            {

                final Adapter this$1;
                final UserCard val$userCard;

                public boolean onLongClick(View view)
                {
                    Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForPaymentMethod(userCard)));
                    return true;
                }

                _cls5()
                {
                    this$1 = Adapter.this;
                    userCard = usercard;
                    super();
                }
            }

            viewholder.textView.setOnLongClickListener(new _cls5());
            return;
_L5:
            if (commerceSetting.equals("VALUE_ADDRESSES"))
            {
                viewholder.textView.setText(Resources.string(0x7f070123));
                class _cls6
                    implements android.view.View.OnClickListener
                {

                    final Adapter this$1;

                    public void onClick(View view)
                    {
                        CommerceUtil.goAddressIntent(view.getContext());
                    }

                _cls6()
                {
                    this$1 = Adapter.this;
                    super();
                }
                }

                viewholder.textView.setOnClickListener(new _cls6());
                return;
            }
            if (commerceSetting.equals("VALUE_PAYMENT_METHODS"))
            {
                viewholder.textView.setText(Resources.string(0x7f070124));
                class _cls7
                    implements android.view.View.OnClickListener
                {

                    final Adapter this$1;

                    public void onClick(View view)
                    {
                        CommerceUtil.goPaymentIntent(view.getContext());
                    }

                _cls7()
                {
                    this$1 = Adapter.this;
                    super();
                }
                }

                viewholder.textView.setOnClickListener(new _cls7());
                return;
            }
            if (true) goto _L1; else goto _L6
_L6:
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            Type type = Type.getType(i);
            switch (_cls12..SwitchMap.com.pinterest.activity.commerce.CommerceSettingsFragment.Type[type.ordinal()])
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
            updateEmptyState();
        }

        public Adapter()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }

        private class Type extends Enum
        {

            private static final Type $VALUES[];
            public static final Type Footer;
            public static final Type LoadMore;
            public static final Type Order;
            public static final Type PaymentMethod;
            public static final Type ShippingAddress;

            public static Type getType(int i)
            {
                switch (i)
                {
                default:
                    throw new IllegalStateException("Passed a value that is not in the range of this enum");

                case 0: // '\0'
                    return Order;

                case 1: // '\001'
                    return PaymentMethod;

                case 2: // '\002'
                    return ShippingAddress;

                case 3: // '\003'
                    return LoadMore;

                case 4: // '\004'
                    return Footer;
                }
            }

            public static Type valueOf(String s)
            {
                return (Type)Enum.valueOf(com/pinterest/activity/commerce/CommerceSettingsFragment$Type, s);
            }

            public static Type[] values()
            {
                return (Type[])$VALUES.clone();
            }

            static 
            {
                Order = new Type("Order", 0);
                PaymentMethod = new Type("PaymentMethod", 1);
                ShippingAddress = new Type("ShippingAddress", 2);
                LoadMore = new Type("LoadMore", 3);
                Footer = new Type("Footer", 4);
                $VALUES = (new Type[] {
                    Order, PaymentMethod, ShippingAddress, LoadMore, Footer
                });
            }

            private Type(String s, int i)
            {
                super(s, i);
            }
        }


        private class _cls12
        {

            static final int $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[];

            static 
            {
                $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type = new int[Type.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[Type.Order.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[Type.PaymentMethod.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[Type.ShippingAddress.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[Type.LoadMore.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$CommerceSettingsFragment$Type[Type.Footer.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls6 extends SettingsApiCallback
    {
        private class SettingsApiCallback extends PinterestCallbackWithDefaultFailure
        {

            final CommerceSettingsFragment this$0;

            public void failure(PinterestError pinteresterror)
            {
                super.failure(pinteresterror);
                adapter.maybeRemoveLoadMoreItem();
                hasLoadMoreFired = false;
                refreshLayout.setRefreshing(false);
                updateEmptyState(false);
            }

            private SettingsApiCallback()
            {
                this$0 = CommerceSettingsFragment.this;
                super();
            }

            SettingsApiCallback(_cls1 _pcls1)
            {
                this();
            }
        }


        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.appendItem((List)apiresponse.getData());
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericLoadMoreSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls6()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls7 extends SettingsApiCallback
    {

        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.appendItem((List)apiresponse.getData());
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericLoadMoreSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls7()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls8 extends SettingsApiCallback
    {

        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.appendItem((List)apiresponse.getData());
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericLoadMoreSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls8()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls9 extends SettingsApiCallback
    {

        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.setItems((List)apiresponse.getData());
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls9()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls10 extends SettingsApiCallback
    {

        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.setItems((List)apiresponse.getData());
            adapter.addFooter();
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls10()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls11 extends SettingsApiCallback
    {

        final CommerceSettingsFragment this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            adapter.setItems((List)apiresponse.getData());
            adapter.addFooter();
            response = CommerceSettingsFragment.this;
            boolean flag;
            if (!((List)apiresponse.getData()).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            response.handleGenericSuccess(apiresponse, flag);
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls11()
        {
            this$0 = CommerceSettingsFragment.this;
            super(null);
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final CommerceSettingsFragment this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.COMMERCE_SHOP_SPACE));
        }

        _cls5()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    {

        final CommerceSettingsFragment this$0;

        public void onRefresh()
        {
            Pinalytics.a(EventType.PULL_TO_REFRESH, null);
            resetAndLoadData();
        }

        _cls3()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }
    }


    private class _cls4 extends android.support.v7.widget.RecyclerView.OnScrollListener
    {

        final CommerceSettingsFragment this$0;

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
            super.onScrolled(recyclerview, i, j);
            maybeFireLoadMore();
        }

        _cls4()
        {
            this$0 = CommerceSettingsFragment.this;
            super();
        }
    }

}
