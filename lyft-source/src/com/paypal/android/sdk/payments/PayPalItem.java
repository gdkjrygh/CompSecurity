// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.R;
import com.paypal.android.sdk.bI;
import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ao

public final class PayPalItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ao();
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

    public PayPalItem(String s, Integer integer, BigDecimal bigdecimal, String s1, String s2)
    {
        a = s;
        b = integer;
        c = bigdecimal;
        d = s1;
        e = s2;
    }

    public static BigDecimal getItemTotal(PayPalItem apaypalitem[])
    {
        BigDecimal bigdecimal = new BigDecimal("0.00");
        int j = apaypalitem.length;
        for (int i = 0; i < j; i++)
        {
            PayPalItem paypalitem = apaypalitem[i];
            bigdecimal = bigdecimal.add(paypalitem.c.multiply(BigDecimal.valueOf(paypalitem.b.intValue())));
        }

        return bigdecimal;
    }

    public static JSONArray toJSONArray(PayPalItem apaypalitem[])
    {
        JSONArray jsonarray = new JSONArray();
        int j = apaypalitem.length;
        for (int i = 0; i < j; i++)
        {
            PayPalItem paypalitem = apaypalitem[i];
            JSONObject jsonobject = new JSONObject();
            jsonobject.accumulate("quantity", Integer.toString(paypalitem.b.intValue()));
            jsonobject.accumulate("name", paypalitem.a);
            jsonobject.accumulate("price", paypalitem.c.toString());
            jsonobject.accumulate("currency", paypalitem.d);
            if (paypalitem.e != null)
            {
                jsonobject.accumulate("sku", paypalitem.e);
            }
            jsonarray.put(jsonobject);
        }

        return jsonarray;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getCurrency()
    {
        return d;
    }

    public final String getName()
    {
        return a;
    }

    public final BigDecimal getPrice()
    {
        return c;
    }

    public final Integer getQuantity()
    {
        return b;
    }

    public final String getSku()
    {
        return e;
    }

    public final boolean isValid()
    {
        if (b.intValue() <= 0)
        {
            Log.e("paypal.sdk", "item.quantity must be a positive integer.");
            return false;
        }
        if (!bI.a(d))
        {
            Log.e("paypal.sdk", "item.currency field is required, and must be a supported currency.");
            return false;
        }
        if (R.b(a))
        {
            Log.e("paypal.sdk", "item.name field is required.");
            return false;
        }
        if (!bI.a(c, d, false))
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
