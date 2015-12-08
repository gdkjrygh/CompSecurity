// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.ConversionUtil;
import com.dominos.utils.AddressType;
import java.util.List;

public class AddressTypeView extends RelativeLayout
{

    private static final int ADDRESS_TYPE_AT_TOP = 0;
    private final Context mContext;
    ConversionUtil mConversionUtil;
    View mDivider;
    TextView mTypeName;

    public AddressTypeView(Context context)
    {
        super(context);
        mContext = context;
    }

    public AddressTypeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    public AddressTypeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContext = context;
    }

    public void bind(AddressType addresstype, int i)
    {
        mDivider.setVisibility(8);
        mTypeName.setText(addresstype.getName());
        if (i == 0)
        {
            setBackgroundResource(0x7f020056);
            mDivider.setVisibility(0);
        } else
        if (i == AddressType.getAddressTypeList().size() - 1)
        {
            setBackgroundResource(0x7f020053);
        } else
        {
            setBackgroundResource(0x7f020054);
            mDivider.setVisibility(0);
        }
        setTag(Integer.valueOf(i));
    }
}
