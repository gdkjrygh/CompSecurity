// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.dd;
import com.paypal.android.sdk.gd;
import java.math.BigDecimal;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ca

public final class PayPalItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ca();
    private String a;
    private Integer b;
    private BigDecimal c;
    private String d;
    private String e;

    private PayPalItem(Parcel parcel)
    {
        a = parcel.readString();
        b = Integer.valueOf(parcel.readInt());
        try
        {
            c = new BigDecimal(parcel.readString());
        }
        catch (NumberFormatException numberformatexception) { }
        d = parcel.readString();
        e = parcel.readString();
    }

    PayPalItem(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final String a()
    {
        return a;
    }

    public final Integer b()
    {
        return b;
    }

    public final BigDecimal c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return e;
    }

    public final boolean f()
    {
        if (b.intValue() <= 0)
        {
            Log.e("paypal.sdk", "item.quantity must be a positive integer.");
            return false;
        }
        if (!dd.a(d))
        {
            Log.e("paypal.sdk", "item.currency field is required, and must be a supported currency.");
            return false;
        }
        if (gd.c(a))
        {
            Log.e("paypal.sdk", "item.name field is required.");
            return false;
        }
        if (!dd.a(c, d, false))
        {
            Log.e("paypal.sdk", "item.price field is required.");
            return false;
        } else
        {
            return true;
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b.intValue());
        parcel.writeString(c.toString());
        parcel.writeString(d);
        parcel.writeString(e);
    }

    static 
    {
        com/paypal/android/sdk/payments/PayPalItem.getSimpleName();
    }
}
