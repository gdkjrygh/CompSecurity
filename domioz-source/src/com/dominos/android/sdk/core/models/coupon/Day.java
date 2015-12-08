// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import android.os.Parcel;
import android.os.Parcelable;

public class Day
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String name;

    protected Day(Parcel parcel)
    {
        name = parcel.readString();
    }

    public Day(String s)
    {
        name = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Day createFromParcel(Parcel parcel)
        {
            return new Day(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Day[] newArray(int i)
        {
            return new Day[i];
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
