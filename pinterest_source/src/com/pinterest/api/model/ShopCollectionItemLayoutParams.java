// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShopCollectionItemLayoutParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final int hasBorder;

    public ShopCollectionItemLayoutParams()
    {
        hasBorder = 0;
    }

    protected ShopCollectionItemLayoutParams(Parcel parcel)
    {
        hasBorder = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean hasBorder()
    {
        return hasBorder == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(hasBorder);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShopCollectionItemLayoutParams createFromParcel(Parcel parcel)
        {
            return new ShopCollectionItemLayoutParams(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShopCollectionItemLayoutParams[] newArray(int i)
        {
            return new ShopCollectionItemLayoutParams[i];
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
