// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.coupon:
//            Day

public class CouponTags
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String LoyaltyPoints;
    private boolean baseRedeemCoupon;
    private String combine;
    private Day days[];
    private String effectiveOn;
    private boolean hidden;
    private String limitPerOrder;
    private String mMinimumOrderAmount;
    private String mPromotion;
    private boolean multiSame;
    private boolean noEntry;
    private String serviceMethod;
    private String usageLimit;

    public CouponTags()
    {
    }

    protected CouponTags(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        combine = parcel.readString();
        effectiveOn = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hidden = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        multiSame = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        noEntry = flag;
        usageLimit = parcel.readString();
        mMinimumOrderAmount = parcel.readString();
        mPromotion = parcel.readString();
        serviceMethod = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCombine()
    {
        return combine;
    }

    public List getDays()
    {
        if (days != null)
        {
            return new LinkedList(Arrays.asList(days));
        } else
        {
            return null;
        }
    }

    public String getEffectiveOn()
    {
        return effectiveOn;
    }

    public String getLimitPerOrder()
    {
        return limitPerOrder;
    }

    public String getLoyaltyPoints()
    {
        return LoyaltyPoints;
    }

    public String getMinimumOrderAmount()
    {
        return mMinimumOrderAmount;
    }

    public String getPromotion()
    {
        return mPromotion;
    }

    public String getServiceMethod()
    {
        return serviceMethod;
    }

    public String getUsageLimit()
    {
        return usageLimit;
    }

    public String getmPromotion()
    {
        return mPromotion;
    }

    public boolean isBaseRedeemCoupon()
    {
        return baseRedeemCoupon;
    }

    public boolean isHidden()
    {
        return hidden;
    }

    public boolean isMultiSame()
    {
        return multiSame;
    }

    public boolean isNoEntry()
    {
        return noEntry;
    }

    public void setBaseRedeemCoupon(boolean flag)
    {
        baseRedeemCoupon = flag;
    }

    public void setCombine(String s)
    {
        combine = s;
    }

    public void setDays(Day aday[])
    {
        days = aday;
    }

    public void setEffectiveOn(String s)
    {
        effectiveOn = s;
    }

    public void setHidden(boolean flag)
    {
        hidden = flag;
    }

    public void setLimitPerOrder(String s)
    {
        limitPerOrder = s;
    }

    public void setLoyaltyPoints(String s)
    {
        LoyaltyPoints = s;
    }

    public void setMinimumOrderAmount(String s)
    {
        mMinimumOrderAmount = s;
    }

    public void setMultiSame(boolean flag)
    {
        multiSame = flag;
    }

    public void setNoEntry(boolean flag)
    {
        noEntry = flag;
    }

    public void setPromotion(String s)
    {
        mPromotion = s;
    }

    public void setServiceMethod(String s)
    {
        serviceMethod = s;
    }

    public void setUsageLimit(String s)
    {
        usageLimit = s;
    }

    public void setmPromotion(String s)
    {
        mPromotion = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(combine);
        parcel.writeString(effectiveOn);
        byte byte0;
        if (hidden)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (multiSame)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (noEntry)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(usageLimit);
        parcel.writeString(mMinimumOrderAmount);
        parcel.writeString(mPromotion);
        parcel.writeParcelableArray(days, i);
        parcel.writeString(serviceMethod);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CouponTags createFromParcel(Parcel parcel)
        {
            return new CouponTags(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CouponTags[] newArray(int i)
        {
            return new CouponTags[i];
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
