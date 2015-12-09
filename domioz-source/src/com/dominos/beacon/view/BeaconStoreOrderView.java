// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.beacon.util.BeaconUtil;

public class BeaconStoreOrderView extends LinearLayout
{

    TextView mCustomerName;
    TextView mCustomerOrderId;

    public BeaconStoreOrderView(Context context)
    {
        super(context);
    }

    public void bind(com.dominos.beacon.model.CarryoutOrder.Order order)
    {
        String s = BeaconUtil.getFormattedFirstName(order.getCustomerName());
        String s1 = BeaconUtil.getCustomerLastInitial(order.getCustomerName());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        if (StringHelper.isNotEmpty(s1))
        {
            stringbuilder.append(" ").append(s1).append(".");
        }
        mCustomerName.setText(stringbuilder.toString());
        mCustomerOrderId.setText(order.getOrderId());
    }
}
