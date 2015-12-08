// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.event.CloseCommerceListDialogEvent;
import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.ShippingRate;
import com.pinterest.model.commerce.UserCard;
import java.util.ArrayList;
import java.util.List;

public class CommerceListDialog extends BaseDialog
{

    private static final Object ADD_ADDRESS = new Object();
    private static final Object ADD_PAYMENT = new Object();
    private static final String EXTRA_CONTACT_ADDRESSES = "contact_addresses";
    private static final String EXTRA_PAYMENT_AVAILABLE_METHODS = "payment_available_methods";
    private static final String EXTRA_PAYMENT_CURRENT_METHOD = "payment_current_method";
    private static final String EXTRA_QUANTITY_MAX = "quantity_max";
    private static final String EXTRA_SHIPPING_AVAILABLE_ADDRESSES = "shipping_available_addresses";
    private static final String EXTRA_SHIPPING_AVAILABLE_METHODS = "shipping_available_methods";
    private static final String EXTRA_SHIPPING_CURRENT_ADDRESS = "shipping_current_address";
    private static final String EXTRA_SHIPPING_CURRENT_METHOD = "shipping_current_method";
    private static final String EXTRA_TYPE = "type";
    private CommerceListAdapter commerceListAdapter;
    private View container;
    private UserCard currentPaymentMethod;
    private DetailedShipping currentShippingAddress;
    private ShippingRate currentShippingMethod;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    RecyclerView recyclerView;
    private Type type;

    public CommerceListDialog()
    {
        eventsSubscriber = new _cls1();
    }

    private void init()
    {
        Object obj;
        ButterKnife.a(this, container);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        commerceListAdapter = new CommerceListAdapter(null);
        recyclerView.setAdapter(commerceListAdapter);
        obj = getArguments();
        if (obj == null)
        {
            return;
        }
        type = Type.values()[((Bundle) (obj)).getInt("type")];
        _cls2..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceListDialog.Type[type.ordinal()];
        JVM INSTR tableswitch 1 5: default 120
    //                   1 413
    //                   2 144
    //                   3 237
    //                   4 320
    //                   5 473;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/PaymentMethodDeletedEvent, new Class[] {
            com/pinterest/activity/commerce/event/ShippingAddressDeletedEvent, com/pinterest/activity/commerce/event/CloseCommerceListDialogEvent
        });
        return;
_L3:
        ArrayList arraylist = ((Bundle) (obj)).getParcelableArrayList("shipping_available_addresses");
        int j1 = arraylist.size();
        ArrayList arraylist3 = new ArrayList(j1);
        for (int i = 0; i < j1; i++)
        {
            arraylist3.add(arraylist.get(i));
        }

        arraylist3.add(ADD_ADDRESS);
        commerceListAdapter.addItems(arraylist3);
        currentShippingAddress = (DetailedShipping)((Bundle) (obj)).getParcelable("shipping_current_address");
          goto _L1
_L4:
        ArrayList arraylist1 = ((Bundle) (obj)).getParcelableArrayList("shipping_available_methods");
        int k1 = arraylist1.size();
        ArrayList arraylist4 = new ArrayList(k1);
        for (int j = 0; j < k1; j++)
        {
            arraylist4.add(arraylist1.get(j));
        }

        commerceListAdapter.addItems(arraylist4);
        currentShippingMethod = (ShippingRate)((Bundle) (obj)).getParcelable("shipping_current_method");
          goto _L1
_L5:
        ArrayList arraylist2;
        ArrayList arraylist5 = ((Bundle) (obj)).getParcelableArrayList("payment_available_methods");
        int l1 = arraylist5.size();
        arraylist2 = new ArrayList(l1);
        for (int k = 0; k < l1; k++)
        {
            arraylist2.add(arraylist5.get(k));
        }

        arraylist2.add(ADD_PAYMENT);
        currentPaymentMethod = (UserCard)((Bundle) (obj)).getParcelable("payment_current_method");
_L8:
        commerceListAdapter.addItems(arraylist2);
          goto _L1
_L2:
        int i2 = ((Bundle) (obj)).getInt("quantity_max");
        arraylist2 = new ArrayList(i2);
        for (int l = 1; l <= i2; l++)
        {
            arraylist2.add(Integer.valueOf(l));
        }

        commerceListAdapter.addItems(arraylist2);
          goto _L1
_L6:
        ArrayList arraylist6;
        int i1;
        int j2;
        arraylist6 = ((Bundle) (obj)).getParcelableArrayList("contact_addresses");
        j2 = arraylist6.size();
        obj = new ArrayList(j2);
        i1 = 0;
_L9:
        arraylist2 = ((ArrayList) (obj));
        if (i1 >= j2) goto _L8; else goto _L7
_L7:
        ((List) (obj)).add(arraylist6.get(i1));
        i1++;
          goto _L9
    }

    public static CommerceListDialog newInstance(Type type1)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", type1.ordinal());
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public static CommerceListDialog newInstanceForPaymentMethods(UserCard usercard, ArrayList arraylist)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", Type.PaymentMethod.ordinal());
        bundle.putParcelableArrayList("payment_available_methods", arraylist);
        bundle.putParcelable("payment_current_method", usercard);
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public static CommerceListDialog newInstanceForQuantity(int i)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", Type.Quantity.ordinal());
        bundle.putInt("quantity_max", i);
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public static CommerceListDialog newInstanceForShippingAddresses(DetailedShipping detailedshipping, ArrayList arraylist)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", Type.ShippingAddress.ordinal());
        bundle.putParcelableArrayList("shipping_available_addresses", arraylist);
        bundle.putParcelable("shipping_current_address", detailedshipping);
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public static CommerceListDialog newInstanceForShippingMethods(ShippingRate shippingrate, ArrayList arraylist)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", Type.ShippingMethod.ordinal());
        bundle.putParcelable("shipping_current_method", shippingrate);
        bundle.putParcelableArrayList("shipping_available_methods", arraylist);
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public static CommerceListDialog newIntanceForContactAddresses(ArrayList arraylist)
    {
        CommerceListDialog commercelistdialog = new CommerceListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("type", Type.ContactAddress.ordinal());
        bundle.putParcelableArrayList("contact_addresses", arraylist);
        commercelistdialog.setArguments(bundle);
        return commercelistdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            container = LayoutInflater.from(getActivity()).inflate(0x7f030068, null);
            setContent(container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        switch (_cls2..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceListDialog.Type[type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setTitle(0x7f070127);
            return;

        case 2: // '\002'
            setTitle(0x7f070128);
            return;

        case 3: // '\003'
            setTitle(0x7f070129);
            return;

        case 4: // '\004'
            setTitle(0x7f070126);
            return;

        case 5: // '\005'
            setTitle(0x7f070125);
            break;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Events.unregister(eventsSubscriber);
    }

    public void onStart()
    {
        android.view.WindowManager.LayoutParams layoutparams;
        super.onStart();
        layoutparams = getDialog().getWindow().getAttributes();
        _cls2..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceListDialog.Type[type.ordinal()];
        JVM INSTR tableswitch 1 5: default 60
    //                   1 72
    //                   2 60
    //                   3 83
    //                   4 60
    //                   5 83;
           goto _L1 _L2 _L1 _L3 _L1 _L3
_L1:
        getDialog().getWindow().setAttributes(layoutparams);
        return;
_L2:
        layoutparams.width = (int)Resources.dimension(0x7f0a0092);
_L3:
        layoutparams.height = (int)Resources.dimension(0x7f0a0091);
        if (true) goto _L1; else goto _L4
_L4:
    }





/*
    static UserCard access$202(CommerceListDialog commercelistdialog, UserCard usercard)
    {
        commercelistdialog.currentPaymentMethod = usercard;
        return usercard;
    }

*/




/*
    static DetailedShipping access$402(CommerceListDialog commercelistdialog, DetailedShipping detailedshipping)
    {
        commercelistdialog.currentShippingAddress = detailedshipping;
        return detailedshipping;
    }

*/




    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CommerceListDialog this$0;

        public void onEventMainThread(CloseCommerceListDialogEvent closecommercelistdialogevent)
        {
            dismiss();
        }

        public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
        {
            if (type == Type.PaymentMethod)
            {
                if (currentPaymentMethod != null && currentPaymentMethod.equals(paymentmethoddeletedevent.getUserCard()))
                {
                    currentPaymentMethod = null;
                }
                commerceListAdapter.removeItem(paymentmethoddeletedevent.getUserCard());
                if (commerceListAdapter.getItemCount() == 1)
                {
                    dismiss();
                    return;
                }
            }
        }

        public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
        {
            if (type == Type.ShippingAddress)
            {
                if (currentShippingAddress != null && currentShippingAddress.equals(shippingaddressdeletedevent.getDetailedShipping()))
                {
                    currentShippingAddress = null;
                }
                commerceListAdapter.removeItem(shippingaddressdeletedevent.getDetailedShipping());
                if (commerceListAdapter.getItemCount() == 1)
                {
                    dismiss();
                    return;
                }
            }
        }

        _cls1()
        {
            this$0 = CommerceListDialog.this;
            super();
        }
    }


    private class CommerceListAdapter extends android.support.v7.widget.RecyclerView.Adapter
    {

        private List items;
        final CommerceListDialog this$0;

        private ViewType getItemViewTypeInternal(int i)
        {
            return ViewType.values()[getItemViewType(i)];
        }

        private android.view.View.OnClickListener postEventAndDismissDialog(final Object event)
        {
            class _cls3
                implements android.view.View.OnClickListener
            {

                final CommerceListAdapter this$1;
                final Object val$event;

                public void onClick(View view)
                {
                    Events.post(event);
                    dismiss();
                }

                _cls3()
                {
                    this$1 = CommerceListAdapter.this;
                    event = obj;
                    super();
                }
            }

            return new _cls3();
        }

        public void addItems(List list)
        {
            items = list;
            notifyDataSetChanged();
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
            if (obj == CommerceListDialog.ADD_ADDRESS)
            {
                return ViewType.AddAddress.ordinal();
            }
            if (obj == CommerceListDialog.ADD_PAYMENT)
            {
                return ViewType.AddPayment.ordinal();
            }
            if ((obj instanceof Integer) && type == Type.Quantity)
            {
                return ViewType.Quantity.ordinal();
            }
            if (obj instanceof DetailedShipping)
            {
                return com.pinterest.activity.commerce.dialog.ViewType.DetailedShipping.ordinal();
            }
            if (obj instanceof UserCard)
            {
                return com.pinterest.activity.commerce.dialog.ViewType.UserCard.ordinal();
            }
            if (obj instanceof ShippingRate)
            {
                return com.pinterest.activity.commerce.dialog.ViewType.ShippingRate.ordinal();
            }
            if (obj instanceof ContactAddressItem)
            {
                return ViewType.ContactAddress.ordinal();
            } else
            {
                throw new IllegalStateException("New type? Add to ViewType and update create/bind");
            }
        }

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
            {

                public ListCellText textView;
                public ListCellTextWithLeftCheckMark textViewWithCheckMark;
                final CommerceListAdapter this$1;

                public ViewHolder(ListCellText listcelltext)
                {
                    this$1 = CommerceListAdapter.this;
                    super(listcelltext);
                    textView = listcelltext;
                }

                public ViewHolder(ListCellTextWithLeftCheckMark listcelltextwithleftcheckmark)
                {
                    this$1 = CommerceListAdapter.this;
                    super(listcelltextwithleftcheckmark);
                    textViewWithCheckMark = listcelltextwithleftcheckmark;
                }
            }

            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            boolean flag4 = true;
            boolean flag = true;
            boolean flag3 = false;
            ViewType viewtype = getItemViewTypeInternal(i);
            switch (_cls2..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceListDialog.ViewType[viewtype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                i = ((Integer)items.get(i)).intValue();
                viewholder.textView.setText(String.valueOf(i));
                viewholder.textView.setOnClickListener(postEventAndDismissDialog(new QuantitySelectedEvent(i)));
                return;

            case 6: // '\006'
                ShippingRate shippingrate = (ShippingRate)items.get(i);
                viewholder.textViewWithCheckMark.setText(BuyableProductHelper.getFormattedShippingMethod(shippingrate));
                ListCellTextWithLeftCheckMark listcelltextwithleftcheckmark = viewholder.textViewWithCheckMark;
                if (currentShippingMethod == null || !currentShippingMethod.getId().equals(shippingrate.getId()))
                {
                    flag = false;
                }
                listcelltextwithleftcheckmark.setCheckMarkVisible(flag);
                viewholder.textViewWithCheckMark.setOnClickListener(postEventAndDismissDialog(new ShippingRateSelectedEvent(shippingrate)));
                return;

            case 2: // '\002'
                viewholder.textView.setText(Resources.string(0x7f070123));
                viewholder.textView.setOnClickListener(postEventAndDismissDialog(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.AddAddress)));
                return;

            case 3: // '\003'
                viewholder.textView.setText(Resources.string(0x7f070124));
                viewholder.textView.setOnClickListener(postEventAndDismissDialog(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.AddPayment)));
                return;

            case 7: // '\007'
                final UserCard userCard = (UserCard)items.get(i);
                viewholder.textViewWithCheckMark.setText(BuyableProductHelper.getFormattedUserCard(userCard));
                ListCellTextWithLeftCheckMark listcelltextwithleftcheckmark1 = viewholder.textViewWithCheckMark;
                boolean flag1 = flag3;
                if (currentPaymentMethod != null)
                {
                    flag1 = flag3;
                    if (currentPaymentMethod.getId().equals(userCard.getId()))
                    {
                        flag1 = true;
                    }
                }
                listcelltextwithleftcheckmark1.setCheckMarkVisible(flag1);
                viewholder.textViewWithCheckMark.setOnClickListener(postEventAndDismissDialog(new PaymentSelectedEvent(userCard, true)));
                class _cls1
                    implements android.view.View.OnLongClickListener
                {

                    final CommerceListAdapter this$1;
                    final UserCard val$userCard;

                    public boolean onLongClick(View view)
                    {
                        Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForPaymentMethod(userCard)));
                        return true;
                    }

                _cls1()
                {
                    this$1 = CommerceListAdapter.this;
                    userCard = usercard;
                    super();
                }
                }

                viewholder.textViewWithCheckMark.setOnLongClickListener(new _cls1());
                return;

            case 5: // '\005'
                final DetailedShipping shipping = (DetailedShipping)items.get(i);
                viewholder.textViewWithCheckMark.setText(BuyableProductHelper.getFormattedAddress(shipping));
                ListCellTextWithLeftCheckMark listcelltextwithleftcheckmark2 = viewholder.textViewWithCheckMark;
                class _cls2
                    implements android.view.View.OnLongClickListener
                {

                    final CommerceListAdapter this$1;
                    final DetailedShipping val$shipping;

                    public boolean onLongClick(View view)
                    {
                        Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForShippingAddress(shipping)));
                        return true;
                    }

                _cls2()
                {
                    this$1 = CommerceListAdapter.this;
                    shipping = detailedshipping;
                    super();
                }
                }

                boolean flag2;
                if (currentShippingAddress != null && currentShippingAddress.getId().equals(shipping.getId()))
                {
                    flag2 = flag4;
                } else
                {
                    flag2 = false;
                }
                listcelltextwithleftcheckmark2.setCheckMarkVisible(flag2);
                viewholder.textViewWithCheckMark.setOnClickListener(postEventAndDismissDialog(new ShippingAddressSelectedEvent(shipping)));
                viewholder.textViewWithCheckMark.setOnLongClickListener(new _cls2());
                return;

            case 4: // '\004'
                ContactAddressItem contactaddressitem = (ContactAddressItem)items.get(i);
                viewholder.textView.setMaxLines(0x7fffffff);
                viewholder.textView.setSingleLine(false);
                viewholder.textView.setTypeface(Typeface.DEFAULT);
                viewholder.textView.setText(BuyableProductHelper.getFormattedContactAddress(contactaddressitem));
                viewholder.textView.setOnClickListener(postEventAndDismissDialog(new ContactAddressSelectedEvent(contactaddressitem)));
                return;
            }
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            viewgroup = ViewType.values()[i];
            switch (_cls2..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceListDialog.ViewType[viewgroup.ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                return new ViewHolder(new ListCellText(getContext()));

            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                return new ViewHolder(new ListCellTextWithLeftCheckMark(getContext()));
            }
        }

        public void removeItem(Object obj)
        {
            items.remove(obj);
            notifyDataSetChanged();
        }

        private CommerceListAdapter()
        {
            this$0 = CommerceListDialog.this;
            super();
        }

        CommerceListAdapter(_cls1 _pcls1)
        {
            this();
        }

        private class ViewType extends Enum
        {

            private static final ViewType $VALUES[];
            public static final ViewType AddAddress;
            public static final ViewType AddPayment;
            public static final ViewType ContactAddress;
            public static final ViewType DetailedShipping;
            public static final ViewType Quantity;
            public static final ViewType ShippingRate;
            public static final ViewType UserCard;

            public static ViewType valueOf(String s)
            {
                return (ViewType)Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceListDialog$ViewType, s);
            }

            public static ViewType[] values()
            {
                return (ViewType[])$VALUES.clone();
            }

            static 
            {
                ShippingRate = new ViewType("ShippingRate", 0);
                DetailedShipping = new ViewType("DetailedShipping", 1);
                UserCard = new ViewType("UserCard", 2);
                Quantity = new ViewType("Quantity", 3);
                AddPayment = new ViewType("AddPayment", 4);
                AddAddress = new ViewType("AddAddress", 5);
                ContactAddress = new ViewType("ContactAddress", 6);
                $VALUES = (new ViewType[] {
                    ShippingRate, DetailedShipping, UserCard, Quantity, AddPayment, AddAddress, ContactAddress
                });
            }

            private ViewType(String s, int i)
            {
                super(s, i);
            }
        }

    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ContactAddress;
        public static final Type PaymentMethod;
        public static final Type Quantity;
        public static final Type ShippingAddress;
        public static final Type ShippingMethod;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceListDialog$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            ShippingAddress = new Type("ShippingAddress", 0);
            ShippingMethod = new Type("ShippingMethod", 1);
            Quantity = new Type("Quantity", 2);
            PaymentMethod = new Type("PaymentMethod", 3);
            ContactAddress = new Type("ContactAddress", 4);
            $VALUES = (new Type[] {
                ShippingAddress, ShippingMethod, Quantity, PaymentMethod, ContactAddress
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[];
        static final int $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType = new int[ViewType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ViewType.Quantity.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ViewType.AddAddress.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ViewType.AddPayment.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ViewType.ContactAddress.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[com.pinterest.activity.commerce.dialog.ViewType.DetailedShipping.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[com.pinterest.activity.commerce.dialog.ViewType.ShippingRate.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[com.pinterest.activity.commerce.dialog.ViewType.UserCard.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type = new int[Type.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[Type.Quantity.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[Type.ShippingAddress.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[Type.ShippingMethod.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[Type.PaymentMethod.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[Type.ContactAddress.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
