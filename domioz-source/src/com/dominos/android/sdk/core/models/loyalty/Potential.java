// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            Earn, Burn

public class Potential
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private Burn burn;
    private Earn earn;
    private int pendingBalance;
    private int pointBalance;

    private Potential(Parcel parcel)
    {
        earn = (Earn)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Earn.getClassLoader());
        burn = (Burn)parcel.readParcelable(com/dominos/android/sdk/core/models/loyalty/Burn.getClassLoader());
        setPendingBalance(parcel.readInt());
        setPointBalance(parcel.readInt());
    }

    Potential(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
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

    public int getPendingBalance()
    {
        return pendingBalance;
    }

    public int getPointBalance()
    {
        return pointBalance;
    }

    public void setBurn(Burn burn1)
    {
        burn = burn1;
    }

    public void setEarn(Earn earn1)
    {
        earn = earn1;
    }

    public void setPendingBalance(int i)
    {
        pendingBalance = i;
    }

    public void setPointBalance(int i)
    {
        pointBalance = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(earn, i);
        parcel.writeParcelable(burn, i);
        parcel.writeInt(pendingBalance);
        parcel.writeInt(pointBalance);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Potential createFromParcel(Parcel parcel)
        {
            return new Potential(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Potential[] newArray(int i)
        {
            return new Potential[i];
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
