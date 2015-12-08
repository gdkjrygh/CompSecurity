// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ThreeDSecureInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ThreeDSecureInfo createFromParcel(Parcel parcel)
        {
            return new ThreeDSecureInfo(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ThreeDSecureInfo[] newArray(int i)
        {
            return new ThreeDSecureInfo[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private boolean liabilityShiftPossible;
    private boolean liabilityShifted;

    public ThreeDSecureInfo()
    {
    }

    private ThreeDSecureInfo(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        liabilityShifted = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        liabilityShiftPossible = flag;
    }


    public int describeContents()
    {
        return 0;
    }

    public boolean isLiabilityShiftPossible()
    {
        return liabilityShiftPossible;
    }

    public boolean isLiabilityShifted()
    {
        return liabilityShifted;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (liabilityShifted)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (liabilityShiftPossible)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
