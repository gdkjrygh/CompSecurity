// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            Potential, Earn, Burn

public class PricePlaceLoyalty
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private Burn burn;
    private Earn earn;
    private boolean loyaltyCustomer;
    private Potential potential;
    private String status;

    public PricePlaceLoyalty()
    {
    }

    protected PricePlaceLoyalty(Parcel parcel)
    {
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loyaltyCustomer = flag;
        status = parcel.readString();
        potential = (Potential)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Potential.getClassLoader());
        earn = (Earn)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Earn.getClassLoader());
        burn = (Burn)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Burn.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public Burn getBurn()
    {
        return burn;
    }

    public Earn getEarn()
    {
        return earn;
    }

    public Potential getPotential()
    {
        return potential;
    }

    public String getStatus()
    {
        return status;
    }

    public boolean isLoyaltyCustomer()
    {
        return loyaltyCustomer;
    }

    public void setBurn(Burn burn1)
    {
        burn = burn1;
    }

    public void setEarn(Earn earn1)
    {
        earn = earn1;
    }

    public void setLoyaltyCustomer(boolean flag)
    {
        loyaltyCustomer = flag;
    }

    public void setPotential(Potential potential1)
    {
        potential = potential1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte byte0;
        if (loyaltyCustomer)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(status);
        parcel.writeParcelable(potential, 0);
        parcel.writeParcelable(earn, 0);
        parcel.writeParcelable(burn, 0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PricePlaceLoyalty createFromParcel(Parcel parcel)
        {
            return new PricePlaceLoyalty(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PricePlaceLoyalty[] newArray(int i)
        {
            return new PricePlaceLoyalty[i];
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
