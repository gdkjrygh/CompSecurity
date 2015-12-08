// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ak, an

public class Price
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ak();
    final Currency a;
    final BigDecimal b;
    final BigDecimal c;
    final String d;

    private Price(Parcel parcel)
    {
        a = Currency.getInstance(parcel.readString());
        b = new BigDecimal(parcel.readString());
        c = new BigDecimal(parcel.readString());
        d = parcel.readString();
    }

    Price(Parcel parcel, ak ak1)
    {
        this(parcel);
    }

    Price(Currency currency, BigDecimal bigdecimal, BigDecimal bigdecimal1, String s)
    {
        an.a(currency, "currency");
        an.a(bigdecimal, "minValue");
        an.a(bigdecimal1, "maxValue");
        an.a(s, "formattedString");
        a = currency;
        b = bigdecimal;
        c = bigdecimal1;
        d = s;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("currency", a.toString());
            jsonobject.put("minValue", b.doubleValue());
            jsonobject.put("maxValue", c.doubleValue());
            jsonobject.put("formattedPrice", d);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public int describeContents()
    {
        return hashCode();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Price) || (!a.equals(((Price) (obj = (Price)obj)).a) || !b.equals(((Price) (obj)).b) || !c.equals(((Price) (obj)).c) || !d.equals(((Price) (obj)).d)))
            {
                return false;
            }
        }
        return true;
    }

    public Currency getCurrency()
    {
        return a;
    }

    public String getFormattedString()
    {
        return d;
    }

    public BigDecimal getMaxValue()
    {
        return c;
    }

    public BigDecimal getMinValue()
    {
        return b;
    }

    public boolean isRange()
    {
        return b != c;
    }

    public String toString()
    {
        return getFormattedString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(new String[] {
            a.toString(), b.toString(), c.toString(), d
        });
    }


    // Unreferenced inner class com/amazon/device/associates/ak
    static final class ak
        implements android.os.Parcelable.Creator
    {

        public Price a(Parcel parcel)
        {
            return new Price(parcel, null);
        }

        public Price[] a(int i)
        {
            return new Price[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            ak()
            {
            }
    }

}
