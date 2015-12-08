// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk.payments:
//            cv, PayPalPayment, ProofOfPayment

public final class PaymentConfirmation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cv();
    private static final String a = com/paypal/android/sdk/payments/PaymentConfirmation.getSimpleName();
    private String b;
    private PayPalPayment c;
    private ProofOfPayment d;

    private PaymentConfirmation(Parcel parcel)
    {
        b = parcel.readString();
        c = (PayPalPayment)parcel.readParcelable(com/paypal/android/sdk/payments/PayPalPayment.getClassLoader());
        d = (ProofOfPayment)parcel.readParcelable(com/paypal/android/sdk/payments/ProofOfPayment.getClassLoader());
    }

    PaymentConfirmation(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    PaymentConfirmation(String s, PayPalPayment paypalpayment, ProofOfPayment proofofpayment)
    {
        b = s;
        c = paypalpayment;
        d = proofofpayment;
    }

    public final ProofOfPayment a()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeParcelable(c, 0);
        parcel.writeParcelable(d, 0);
    }

}
