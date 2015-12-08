// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.core.models.coupon.Coupon;

public class LoyaltyCoupon extends Coupon
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean baseCoupon;
    private String couponCode;
    private String limitPerOrder;
    private int pointValue;

    public LoyaltyCoupon()
    {
    }

    private LoyaltyCoupon(Parcel parcel)
    {
        boolean flag = true;
        super();
        setCouponCode(parcel.readString());
        setPointValue(parcel.readInt());
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        setBaseCoupon(flag);
        setLimitPerOrder(parcel.readString());
    }

    LoyaltyCoupon(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCouponCode()
    {
        return couponCode;
    }

    public String getLimitPerOrder()
    {
        return limitPerOrder;
    }

    public int getPointValue()
    {
        return pointValue;
    }

    public boolean isBaseCoupon()
    {
        return baseCoupon;
    }

    public void setBaseCoupon(boolean flag)
    {
        baseCoupon = flag;
    }

    public void setCouponCode(String s)
    {
        couponCode = s;
    }

    public void setLimitPerOrder(String s)
    {
        limitPerOrder = s;
    }

    public void setPointValue(int i)
    {
        pointValue = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(couponCode);
        parcel.writeInt(pointValue);
        if (baseCoupon)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(limitPerOrder);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LoyaltyCoupon createFromParcel(Parcel parcel)
        {
            return new LoyaltyCoupon(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LoyaltyCoupon[] newArray(int i)
        {
            return new LoyaltyCoupon[i];
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
