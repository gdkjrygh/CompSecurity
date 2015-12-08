// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardListItemDisplay

public class PaymentCardListItemBinder
    implements ListItemBinder
{

    private final Context mContext;

    public PaymentCardListItemBinder(Activity activity)
    {
        mContext = activity;
    }

    private void bind(int i, ViewHolder viewholder, PaymentCard paymentcard)
    {
        viewholder = (PaymentCardListItemDisplay)viewholder;
        viewholder.setPaymentCard(paymentcard, null);
        viewholder.setInfoButtonVisibility(false);
        setMessage(viewholder, paymentcard);
    }

    private static boolean isEnabled(PaymentCard paymentcard)
    {
        return true;
    }

    private void setMessage(PaymentCardListItemDisplay paymentcardlistitemdisplay, PaymentCard paymentcard)
    {
        if (paymentcard.isDeclined())
        {
            paymentcardlistitemdisplay.setMessage(mContext.getResources().getString(com.google.android.apps.walletnfcrel.R.string.errormessage_invalid_card), true);
        } else
        if (paymentcard.isExpired())
        {
            paymentcardlistitemdisplay.setMessage(mContext.getResources().getString(com.google.android.apps.walletnfcrel.R.string.errormessage_expired_card), true);
            return;
        }
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (PaymentCard)obj);
    }

    public final ViewHolder createDisplay()
    {
        PaymentCardListItemDisplay paymentcardlistitemdisplay = new PaymentCardListItemDisplay();
        paymentcardlistitemdisplay.createView(LayoutInflater.from(mContext));
        return paymentcardlistitemdisplay;
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((PaymentCard)obj);
    }
}
