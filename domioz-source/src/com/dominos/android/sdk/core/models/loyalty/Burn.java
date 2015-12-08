// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;

public class Burn
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private int redemptionPoints;

    private Burn(Parcel parcel)
    {
        setRedemptionPoints(parcel.readInt());
    }

    Burn(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getRedemptionPoints()
    {
        return redemptionPoints;
    }

    public void setRedemptionPoints(int i)
    {
        redemptionPoints = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(redemptionPoints);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Burn createFromParcel(Parcel parcel)
        {
            return new Burn(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Burn[] newArray(int i)
        {
            return new Burn[i];
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
