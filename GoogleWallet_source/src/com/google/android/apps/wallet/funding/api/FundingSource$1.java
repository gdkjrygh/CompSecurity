// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import android.os.Parcel;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.funding.api:
//            FundingSource

final class 
    implements android.os.or
{

    private static FundingSource createFromParcel(Parcel parcel)
    {
        BankAccount bankaccount = (BankAccount)parcel.readParcelable(com/google/android/apps/wallet/bankaccount/api/BankAccount.getClassLoader());
        PaymentCard paymentcard = (PaymentCard)parcel.readParcelable(com/google/android/apps/wallet/paymentcard/api/PaymentCard.getClassLoader());
        parcel = parcel.createByteArray();
        if (bankaccount != null)
        {
            return new FundingSource(bankaccount);
        }
        if (paymentcard != null)
        {
            return new FundingSource(paymentcard);
        }
        try
        {
            parcel = new FundingSource((com.google.wallet.proto.es.StoredValue)MessageNano.mergeFrom(new com.google.wallet.proto.es.StoredValue(), parcel));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException(parcel);
        }
        return parcel;
    }

    private static FundingSource[] newArray(int i)
    {
        return new FundingSource[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
