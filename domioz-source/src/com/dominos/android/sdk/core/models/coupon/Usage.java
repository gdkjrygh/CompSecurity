// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import android.os.Parcel;
import android.os.Parcelable;

public class Usage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private int usageCount;

    public Usage()
    {
    }

    protected Usage(Parcel parcel)
    {
        usageCount = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public int getUsageCount()
    {
        return usageCount;
    }

    public void setUsageCount(int i)
    {
        usageCount = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(usageCount);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Usage createFromParcel(Parcel parcel)
        {
            return new Usage(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Usage[] newArray(int i)
        {
            return new Usage[i];
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
