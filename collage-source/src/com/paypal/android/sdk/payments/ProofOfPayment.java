// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.paypal.android.sdk.gd;

// Referenced classes of package com.paypal.android.sdk.payments:
//            dg

public final class ProofOfPayment
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dg();
    private static final String a = com/paypal/android/sdk/payments/ProofOfPayment.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    private ProofOfPayment(Parcel parcel)
    {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    ProofOfPayment(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    ProofOfPayment(String s, String s1, String s2, String s3, String s4)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        (new StringBuilder("ProofOfPayment created: ")).append(toString());
    }

    public final String a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s;
        if (gd.d(f))
        {
            s = f;
        } else
        {
            s = "no transactionId";
        }
        return (new StringBuilder("{")).append(e).append(": ").append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}
