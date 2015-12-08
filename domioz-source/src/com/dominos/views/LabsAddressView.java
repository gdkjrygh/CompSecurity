// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.core.models.LabsOrder;

public class LabsAddressView extends RelativeLayout
{

    TextView addressLine1Text;
    TextView serviceMethodLabelText;

    public LabsAddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(LabsOrder labsorder)
    {
        if (labsorder.isDelivery())
        {
            serviceMethodLabelText.setText(getContext().getString(0x7f080232));
            addressLine1Text.setText(AddressUtil.getDeliveryAddressDescription(labsorder.getAddress()));
            return;
        } else
        {
            serviceMethodLabelText.setText(getContext().getString(0x7f080086));
            addressLine1Text.setText(AddressUtil.getCarryoutAddressDescription(labsorder.getStoreAddress()));
            return;
        }
    }
}
