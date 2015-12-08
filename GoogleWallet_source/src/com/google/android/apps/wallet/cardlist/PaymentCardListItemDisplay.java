// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.util.view.Views;

public final class PaymentCardListItemDisplay extends DefaultViewHolder
{

    private View infoButton;

    public PaymentCardListItemDisplay()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.funding_sources_list_item);
    }

    private static void setMessageInView(Context context, View view, String s, boolean flag)
    {
        context = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.MessageText);
        Views.setTextOrHide(context, s);
        if (flag && s != null)
        {
            Views.showAlertIndicator(context);
            return;
        } else
        {
            Views.hideDrawableIndicators(context);
            return;
        }
    }

    public final void setInfoButtonVisibility(boolean flag)
    {
        View view = infoButton;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (flag)
        {
            infoButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentCardListItemDisplay this$0;

                public final void onClick(View view1)
                {
                    view1 = (Intent)access$000.getTag(com.google.android.apps.walletnfcrel.R.id.FormsOfPaymentIntentTagKey);
                    getContext().startActivity(view1);
                }

            
            {
                this$0 = PaymentCardListItemDisplay.this;
                super();
            }
            });
        }
    }

    public final void setMessage(String s, boolean flag)
    {
        setMessageInView(getContext(), rootView, s, flag);
    }

    public final void setPaymentCard(PaymentCard paymentcard, Integer integer)
    {
        ((TextView)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.PaymentCardName)).setText(paymentcard.getNickname());
        setMessage(paymentcard.getCardNumberLast4(), false);
        rootView.setTag(com.google.android.apps.walletnfcrel.R.id.FormsOfPaymentIntentTagKey, PaymentCardApi.createPaymentCardDetailsIntent(getContext(), paymentcard.getId().toKeyString(), integer));
        integer = getContext().getString(com.google.android.apps.walletnfcrel.R.string.select_funding_source_list_card_details_button, new Object[] {
            paymentcard.getNickname()
        });
        infoButton.setContentDescription(integer);
        ((FundingSourceView)Views.findViewById(rootView, com.google.android.apps.walletnfcrel.R.id.Card)).setFundingSource(new FundingSource(paymentcard));
    }

    public final void setView(View view)
    {
        super.setView(view);
        infoButton = findViewById(com.google.android.apps.walletnfcrel.R.id.PaymentCardDetailView);
    }


}
