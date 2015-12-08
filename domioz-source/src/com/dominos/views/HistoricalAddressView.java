// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import java.util.Locale;

public class HistoricalAddressView extends LinearLayout
{

    TextView mAddressTextView;
    ImageView mServiceMethodIcon;
    TextView mServiceMethodLabelView;

    public HistoricalAddressView(Context context)
    {
        super(context);
    }

    public HistoricalAddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(LabsOrder labsorder)
    {
        LabsAddress labsaddress = null;
        if (!labsorder.getServiceMethod().equalsIgnoreCase("Carryout")) goto _L2; else goto _L1
_L1:
        mServiceMethodIcon.setImageResource(0x7f02008f);
        mServiceMethodLabelView.setText(getResources().getString(0x7f080086).toUpperCase(Locale.getDefault()));
        labsaddress = labsorder.getStoreAddress();
_L4:
        if (labsaddress != null)
        {
            mAddressTextView.setText(String.format(Locale.getDefault(), "%s, %s, %s", new Object[] {
                labsaddress.getStreet().toUpperCase(Locale.getDefault()), labsaddress.getCity().toUpperCase(Locale.getDefault()), labsaddress.getRegion().toUpperCase(Locale.getDefault())
            }));
        }
        return;
_L2:
        if (labsorder.getServiceMethod().equalsIgnoreCase("Delivery"))
        {
            mServiceMethodIcon.setImageResource(0x7f0200d6);
            mServiceMethodLabelView.setText(getResources().getString(0x7f080232).toUpperCase(Locale.getDefault()));
            labsaddress = labsorder.getAddress();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
