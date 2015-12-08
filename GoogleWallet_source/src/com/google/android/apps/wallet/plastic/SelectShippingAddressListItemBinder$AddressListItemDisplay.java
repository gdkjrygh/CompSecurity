// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            SelectShippingAddressListItemBinder

static final class  extends DefaultViewHolder
{

    private TextView mCityStateZip;
    private TextView mLine1;
    private TextView mLine2;
    private TextView mRecipientName;

    public final void setCityStateZip(String s)
    {
        mCityStateZip.setText(s);
    }

    public final void setLine1(String s)
    {
        mLine1.setText(s);
    }

    public final void setLine2(String s)
    {
        mLine2.setText(s);
        TextView textview = mLine2;
        byte byte0;
        if (s == null || s.isEmpty())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public final void setRecipientName(String s)
    {
        mRecipientName.setText(s);
    }

    public final void setView(View view)
    {
        super.setView(view);
        mRecipientName = (TextView)findViewById(com.google.android.apps.walletnfcrel.y.findViewById);
        mLine1 = (TextView)findViewById(com.google.android.apps.walletnfcrel.y.findViewById);
        mLine2 = (TextView)findViewById(com.google.android.apps.walletnfcrel.y.findViewById);
        mCityStateZip = (TextView)findViewById(com.google.android.apps.walletnfcrel.y.findViewById);
    }

    public ()
    {
        super(com.google.android.apps.walletnfcrel.y);
    }
}
