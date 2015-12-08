// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;

public final class PlasticCardCashWithdrawalDetails
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PlasticCardCashWithdrawalDetails createFromParcel(Parcel parcel)
        {
            try
            {
                parcel = new PlasticCardCashWithdrawalDetails((com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails(), parcel.createByteArray()));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Attempted to restore CashWithdrawalDetails from parcel but failed.");
            }
            return parcel;
        }

        private static PlasticCardCashWithdrawalDetails[] newArray(int i)
        {
            return new PlasticCardCashWithdrawalDetails[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails cashWithdrawalDetails;

    public PlasticCardCashWithdrawalDetails(com.google.wallet.proto.NanoWalletEntities.CashWithdrawalDetails cashwithdrawaldetails)
    {
        Preconditions.checkNotNull(cashwithdrawaldetails);
        cashWithdrawalDetails = cashwithdrawaldetails;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PlasticCardCashWithdrawalDetails))
        {
            return false;
        } else
        {
            obj = (PlasticCardCashWithdrawalDetails)obj;
            return Arrays.equals(MessageNano.toByteArray(cashWithdrawalDetails), MessageNano.toByteArray(((PlasticCardCashWithdrawalDetails) (obj)).cashWithdrawalDetails));
        }
    }

    public final String getAtmFeeDescription()
    {
        return cashWithdrawalDetails.googleAtmFeeDescription;
    }

    public final String getCashWithdrawalLimit()
    {
        return cashWithdrawalDetails.cashWithdrawalLimitDescription;
    }

    public final boolean hasAtmFeeDescription()
    {
        return cashWithdrawalDetails.googleAtmFeeDescription != null;
    }

    public final boolean hasCashWithdrawalLimit()
    {
        return cashWithdrawalDetails.cashWithdrawalLimitDescription != null;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(MessageNano.toByteArray(cashWithdrawalDetails));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(MessageNano.toByteArray(cashWithdrawalDetails));
    }

}
