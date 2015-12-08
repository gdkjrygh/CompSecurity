// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;

public class Earn
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private int basePoints;
    private int bonusPoints;
    private int pendingPoints;
    private int totalPoints;

    private Earn(Parcel parcel)
    {
        setBonusPoints(parcel.readInt());
        setBasePoints(parcel.readInt());
        setTotalPoints(parcel.readInt());
        setPendingPoints(parcel.readInt());
    }

    Earn(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBasePoints()
    {
        return basePoints;
    }

    public int getBonusPoints()
    {
        return bonusPoints;
    }

    public int getPendingPoints()
    {
        return pendingPoints;
    }

    public int getTotalPoints()
    {
        return totalPoints;
    }

    public void setBasePoints(int i)
    {
        basePoints = i;
    }

    public void setBonusPoints(int i)
    {
        bonusPoints = i;
    }

    public void setPendingPoints(int i)
    {
        pendingPoints = i;
    }

    public void setTotalPoints(int i)
    {
        totalPoints = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(bonusPoints);
        parcel.writeInt(basePoints);
        parcel.writeInt(totalPoints);
        parcel.writeInt(pendingPoints);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Earn createFromParcel(Parcel parcel)
        {
            return new Earn(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Earn[] newArray(int i)
        {
            return new Earn[i];
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
