// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.userscope.UserInjector;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            CardDrawable

public class FundingSourceView extends ImageView
{

    CardDrawable cardDrawable;

    public FundingSourceView(Context context)
    {
        this(context, null, null);
    }

    public FundingSourceView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, null);
    }

    private FundingSourceView(Context context, AttributeSet attributeset, CardDrawable carddrawable)
    {
        super(context, attributeset);
        cardDrawable = carddrawable;
        if (cardDrawable == null)
        {
            cardDrawable = (CardDrawable)UserInjector.get(com/google/android/apps/wallet/paymentcard/widgets/CardDrawable, context);
        }
    }

    public FundingSourceView(Context context, CardDrawable carddrawable)
    {
        this(context, null, carddrawable);
    }

    public void setFundingSource(FundingSource fundingsource)
    {
        if (fundingsource == null)
        {
            setImageResource(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_error_red_24);
        } else
        {
            if (fundingsource.isPaymentCard() && cardDrawable != null)
            {
                cardDrawable.setCredential(fundingsource.getPaymentCard());
                setImageDrawable(cardDrawable);
            }
            if (fundingsource.isStoredValue())
            {
                setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_logo_wallet_color_88dp);
            }
            if (fundingsource.isBankAccount())
            {
                setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_bankaccount_dropdown_color_40dp);
                return;
            }
        }
    }
}
