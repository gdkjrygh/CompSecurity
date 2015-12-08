// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.domain.ridehistory.charge.AccountInfoItem;
import me.lyft.android.utils.CardExtensions;

public class PassengerRideHistoryPaymentChargeItemView extends LinearLayout
{

    TextView chargedAmountTextView;
    ImageView chargedMethodAndTypeImageView;
    TextView chargedMethodTextView;
    private AccountInfoItem item;

    public PassengerRideHistoryPaymentChargeItemView(Context context, AccountInfoItem accountinfoitem)
    {
        super(context);
        item = accountinfoitem;
        ButterKnife.a(this, LayoutInflater.from(context).inflate(0x7f0300d0, this, true));
        init();
    }

    private void init()
    {
        chargedMethodTextView.setText(item.getTitle());
        if (!item.isCreditCard()) goto _L2; else goto _L1
_L1:
        chargedMethodAndTypeImageView.setImageResource(CardExtensions.getCardTypeImageResourceWithOutline(item.getType()));
_L4:
        chargedAmountTextView.setText(item.getValue());
        return;
_L2:
        if (item.isPayPal())
        {
            chargedMethodAndTypeImageView.setImageResource(0x7f02007a);
        } else
        if (item.isGoogleWallet())
        {
            chargedMethodAndTypeImageView.setImageResource(0x7f020071);
        } else
        if (item.isCreditLine())
        {
            chargedMethodAndTypeImageView.setImageResource(0x7f02007e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
