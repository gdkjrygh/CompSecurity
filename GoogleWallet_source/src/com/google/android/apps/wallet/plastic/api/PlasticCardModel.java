// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.plastic.api:
//            PlasticCard, PlasticCardCashWithdrawalDetails

public final class PlasticCardModel
{

    private final PlasticCard card;
    private final PlasticCardCashWithdrawalDetails withdrawalDetails;

    public PlasticCardModel(PlasticCard plasticcard, PlasticCardCashWithdrawalDetails plasticcardcashwithdrawaldetails)
    {
        card = plasticcard;
        withdrawalDetails = plasticcardcashwithdrawaldetails;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlasticCardModel))
            {
                return false;
            }
            obj = (PlasticCardModel)obj;
            if (!Objects.equal(card, ((PlasticCardModel) (obj)).card) || !Objects.equal(withdrawalDetails, ((PlasticCardModel) (obj)).withdrawalDetails))
            {
                return false;
            }
        }
        return true;
    }

    public final PlasticCard getCard()
    {
        return card;
    }

    public final PlasticCardCashWithdrawalDetails getWithdrawalDetails()
    {
        return withdrawalDetails;
    }

    public final boolean hasCard()
    {
        return card != null;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            card, withdrawalDetails
        });
    }
}
