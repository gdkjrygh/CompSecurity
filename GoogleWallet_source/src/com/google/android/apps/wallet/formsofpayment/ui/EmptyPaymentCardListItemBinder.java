// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.formsofpayment.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

public class EmptyPaymentCardListItemBinder
    implements ListItemBinder
{

    private final Context context;

    public EmptyPaymentCardListItemBinder(Activity activity)
    {
        context = activity;
    }

    private static boolean isEnabled(PaymentCard paymentcard)
    {
        return true;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
    }

    public final ViewHolder createDisplay()
    {
        return new ViewHolder() {

            final EmptyPaymentCardListItemBinder this$0;
            final View val$view;

            public final View getView()
            {
                return view;
            }

            
            {
                this$0 = EmptyPaymentCardListItemBinder.this;
                view = view1;
                super();
            }
        };
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((PaymentCard)obj);
    }
}
