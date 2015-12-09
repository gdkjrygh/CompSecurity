// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Strings;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;

public final class PlasticCard
    implements Parcelable
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status ACTIVATED;
        public static final Status CANCELED;
        public static final Status LOCKED;
        public static final Status NOT_REQUESTED;
        public static final Status REQUESTED;
        public static final Status SUSPENDED;
        public static final Status UNKNOWN;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/apps/wallet/plastic/api/PlasticCard$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new Status("UNKNOWN", 0);
            NOT_REQUESTED = new Status("NOT_REQUESTED", 1);
            REQUESTED = new Status("REQUESTED", 2);
            ACTIVATED = new Status("ACTIVATED", 3);
            LOCKED = new Status("LOCKED", 4);
            CANCELED = new Status("CANCELED", 5);
            SUSPENDED = new Status("SUSPENDED", 6);
            $VALUES = (new Status[] {
                UNKNOWN, NOT_REQUESTED, REQUESTED, ACTIVATED, LOCKED, CANCELED, SUSPENDED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PlasticCard createFromParcel(Parcel parcel)
        {
            try
            {
                parcel = new PlasticCard((com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails(), parcel.createByteArray()), Status.valueOf(parcel.readString()));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Attempted to restore PlasticProxyCardDetails from parcel but failed.");
            }
            return parcel;
        }

        private static PlasticCard[] newArray(int i)
        {
            return new PlasticCard[i];
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
    private final com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticProxyCardDetails;
    private final Status status;

    public PlasticCard(com.google.wallet.proto.NanoWalletEntities.PlasticProxyCardDetails plasticproxycarddetails, Status status1)
    {
        plasticProxyCardDetails = plasticproxycarddetails;
        status = status1;
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
        if (!(obj instanceof PlasticCard))
        {
            return false;
        } else
        {
            obj = (PlasticCard)obj;
            return MessageNano.messageNanoEquals(plasticProxyCardDetails, ((PlasticCard) (obj)).plasticProxyCardDetails);
        }
    }

    public final long getCancellationTimeMillis()
    {
        return plasticProxyCardDetails.proxyCard.cancellationTimestampMillis.longValue();
    }

    public final Long getLockTimestamp()
    {
        if (plasticProxyCardDetails.proxyCard == null || plasticProxyCardDetails.proxyCard.lockingInfo == null)
        {
            return null;
        } else
        {
            return plasticProxyCardDetails.proxyCard.lockingInfo.lockingTimestampMillis;
        }
    }

    public final int getMaxEstimatedDeliveryDays()
    {
        return plasticProxyCardDetails.shippingInfo.maxCardEtaDays.intValue();
    }

    public final int getMinEstimatedDeliveryDays()
    {
        return plasticProxyCardDetails.shippingInfo.minCardEtaDays.intValue();
    }

    public final com.google.wallet.proto.NanoWalletEntities.CdpIdData getProxyCardId()
    {
        return plasticProxyCardDetails.proxyCard.cdpProxyId;
    }

    public final com.google.wallet.proto.NanoWalletEntities.Address getShippingAddress()
    {
        return plasticProxyCardDetails.shippingInfo.shippingAddress;
    }

    public final long getShippingTimeMillis()
    {
        return plasticProxyCardDetails.shippingInfo.shippingTimestampMillis.longValue();
    }

    public final Status getStatus()
    {
        return status;
    }

    public final String getTrailingDigits()
    {
        return plasticProxyCardDetails.proxyCard.cardNumberLast4;
    }

    public final boolean hasCancellationTimeMillis()
    {
        return plasticProxyCardDetails.proxyCard != null && plasticProxyCardDetails.proxyCard.cancellationTimestampMillis != null && plasticProxyCardDetails.proxyCard.cancellationTimestampMillis.longValue() != 0L;
    }

    public final boolean hasEstimatedDeliveryDays()
    {
        return plasticProxyCardDetails.shippingInfo != null && plasticProxyCardDetails.shippingInfo.minCardEtaDays != null && plasticProxyCardDetails.shippingInfo.maxCardEtaDays != null;
    }

    public final boolean hasShippingAddress()
    {
        com.google.wallet.proto.NanoWalletEntities.Address address;
        if (plasticProxyCardDetails.shippingInfo != null && plasticProxyCardDetails.shippingInfo.shippingAddress != null)
        {
            if (!Strings.isNullOrEmpty((address = plasticProxyCardDetails.shippingInfo.shippingAddress).line1) || !Strings.isNullOrEmpty(address.line2) || !Strings.isNullOrEmpty(address.city) || !Strings.isNullOrEmpty(address.state) || !Strings.isNullOrEmpty(address.postalCode))
            {
                return true;
            }
        }
        return false;
    }

    public final boolean hasShippingTimeMillis()
    {
        return plasticProxyCardDetails.shippingInfo != null && plasticProxyCardDetails.shippingInfo.shippingTimestampMillis != null;
    }

    public final boolean hasTrailingDigits()
    {
        return plasticProxyCardDetails.proxyCard != null && plasticProxyCardDetails.proxyCard.cardNumberLast4 != null && !TextUtils.isEmpty(plasticProxyCardDetails.proxyCard.cardNumberLast4);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(MessageNano.toByteArray(plasticProxyCardDetails));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(MessageNano.toByteArray(plasticProxyCardDetails));
        parcel.writeString(status.name());
    }

}
