// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.event.CloseCommerceListDialogEvent;
import com.pinterest.activity.commerce.util.CommerceUtil;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.di.components.ActivityComponent;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.text.PTextView;
import java.util.HashMap;

public class CommerceOptionsDialog extends BaseDialog
{

    private static final String EXTRA_SHIPPING_ADDRESS = "extra_shipping_address";
    private static final String EXTRA_TYPE = "type";
    private static final String EXTRA_USER_CARD = "extra_user_card";
    CommerceApiManager _commerceApiManager;
    private View _container;
    private DetailedShipping _shippingAddress;
    private Type _type;
    private UserCard _userCard;
    PTextView edit;

    public CommerceOptionsDialog()
    {
    }

    public static CommerceOptionsDialog getInstanceForPaymentMethod(UserCard usercard)
    {
        logEvent("payment");
        CommerceOptionsDialog commerceoptionsdialog = new CommerceOptionsDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_user_card", usercard);
        bundle.putInt("type", Type.PaymentMethod.ordinal());
        commerceoptionsdialog.setArguments(bundle);
        return commerceoptionsdialog;
    }

    public static CommerceOptionsDialog getInstanceForShippingAddress(DetailedShipping detailedshipping)
    {
        logEvent("address");
        CommerceOptionsDialog commerceoptionsdialog = new CommerceOptionsDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_shipping_address", detailedshipping);
        bundle.putInt("type", Type.ShippingAddress.ordinal());
        commerceoptionsdialog.setArguments(bundle);
        return commerceoptionsdialog;
    }

    private static void logEvent(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("commerce_edit", s);
        Pinalytics.a(EventType.TAP, ElementType.BUYABLE_CHECKOUT_EDIT_BUTTON, null, null, hashmap, null);
    }

    public void handleDeleteClicked()
    {
        switch (_cls3..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceOptionsDialog.Type[_type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Events.post(new DialogEvent(new LoadingDialog(0x7f07012d)));
            _commerceApiManager.f(_userCard.getId(), new _cls1());
            return;

        case 2: // '\002'
            Events.post(new DialogEvent(new LoadingDialog(0x7f07012d)));
            break;
        }
        _commerceApiManager.d(_shippingAddress.getId(), new _cls2());
    }

    public void handleEditClicked()
    {
        switch (_cls3..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceOptionsDialog.Type[_type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            dismiss();
            Events.post(new CloseCommerceListDialogEvent());
            CommerceUtil.goPaymentIntent(getContext(), _userCard);
            return;

        case 2: // '\002'
            dismiss();
            break;
        }
        Events.post(new CloseCommerceListDialogEvent());
        CommerceUtil.goAddressIntent(getContext(), _shippingAddress);
    }

    public void make(LayoutInflater layoutinflater)
    {
        _container = LayoutInflater.from(getActivity()).inflate(0x7f030055, null);
        setContent(_container);
        super.make(layoutinflater);
        ButterKnife.a(this, _container);
        ((ActivityComponent)getComponent(com/pinterest/di/components/ActivityComponent)).inject(this);
        layoutinflater = getArguments();
        _type = Type.getType(layoutinflater.getInt("type", -1));
        switch (_cls3..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceOptionsDialog.Type[_type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            _userCard = (UserCard)layoutinflater.getParcelable("extra_user_card");
            return;

        case 2: // '\002'
            _shippingAddress = (DetailedShipping)layoutinflater.getParcelable("extra_shipping_address");
            break;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        switch (_cls3..SwitchMap.com.pinterest.activity.commerce.dialog.CommerceOptionsDialog.Type[_type.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setTitle(0x7f07012e);
            return;

        case 2: // '\002'
            setTitle(0x7f07012f);
            break;
        }
    }



    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type PaymentMethod;
        public static final Type ShippingAddress;

        public static Type getType(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalStateException("Passed a value that is not in the range of this enum");

            case 0: // '\0'
                return PaymentMethod;

            case 1: // '\001'
                return ShippingAddress;
            }
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceOptionsDialog$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            PaymentMethod = new Type("PaymentMethod", 0);
            ShippingAddress = new Type("ShippingAddress", 1);
            $VALUES = (new Type[] {
                PaymentMethod, ShippingAddress
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceOptionsDialog$Type[];

        static 
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceOptionsDialog$Type = new int[Type.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceOptionsDialog$Type[Type.PaymentMethod.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceOptionsDialog$Type[Type.ShippingAddress.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends CommerceOptionsCallback
    {
        private class CommerceOptionsCallback extends PinterestCallbackWithDefaultFailure
        {

            final CommerceOptionsDialog this$0;

            public void failure(PinterestError pinteresterror)
            {
                Events.post(new DialogEvent(null));
                super.failure(pinteresterror);
            }

            public void success(ApiResponse apiresponse, Response response)
            {
                Events.post(new DialogEvent(null));
                dismiss();
            }

            public volatile void success(Object obj, Response response)
            {
                success((ApiResponse)obj, response);
            }

            private CommerceOptionsCallback()
            {
                this$0 = CommerceOptionsDialog.this;
                super();
            }

            CommerceOptionsCallback(_cls1 _pcls1)
            {
                this();
            }
        }


        final CommerceOptionsDialog this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            super.success(apiresponse, response);
            Events.post(new PaymentMethodDeletedEvent(_userCard));
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls1()
        {
            this$0 = CommerceOptionsDialog.this;
            super(null);
        }
    }


    private class _cls2 extends CommerceOptionsCallback
    {

        final CommerceOptionsDialog this$0;

        public void success(ApiResponse apiresponse, Response response)
        {
            super.success(apiresponse, response);
            Events.post(new ShippingAddressDeletedEvent(_shippingAddress));
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls2()
        {
            this$0 = CommerceOptionsDialog.this;
            super(null);
        }
    }

}
