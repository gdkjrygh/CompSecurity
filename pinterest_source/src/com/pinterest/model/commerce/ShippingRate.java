// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import android.os.Parcel;
import android.os.Parcelable;

public class ShippingRate
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String displayPrice;
    private final String id;
    private final String price;
    private final String title;

    public ShippingRate()
    {
        displayPrice = null;
        price = null;
        id = null;
        title = null;
    }

    protected ShippingRate(Parcel parcel)
    {
        displayPrice = parcel.readString();
        price = parcel.readString();
        id = parcel.readString();
        title = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (ShippingRate)obj;
            return id.equals(((ShippingRate) (obj)).id);
        }
    }

    public String getDisplayPrice()
    {
        return displayPrice;
    }

    public String getId()
    {
        return id;
    }

    public String getPrice()
    {
        return price;
    }

    public String getTitle()
    {
        return title;
    }

    public int hashCode()
    {
        return id.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(displayPrice);
        parcel.writeString(price);
        parcel.writeString(id);
        parcel.writeString(title);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShippingRate createFromParcel(Parcel parcel)
        {
            return new ShippingRate(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShippingRate[] newArray(int i)
        {
            return new ShippingRate[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
