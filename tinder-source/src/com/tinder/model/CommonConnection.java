// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class CommonConnection
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final CommonConnection createFromParcel(Parcel parcel)
        {
            return new CommonConnection(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CommonConnection[] newArray(int i)
        {
            return new CommonConnection[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public int degree;
    public String id;
    public String imageLarge;
    public String imageMedium;
    public String imageSmall;
    public String name;

    protected CommonConnection(Parcel parcel)
    {
        id = parcel.readString();
        degree = parcel.readInt();
        name = parcel.readString();
        imageSmall = parcel.readString();
        imageMedium = parcel.readString();
        imageLarge = parcel.readString();
    }

    public CommonConnection(String s, int i, String s1, String s2, String s3, String s4)
    {
        id = s;
        degree = i;
        name = s1;
        imageSmall = s2;
        imageMedium = s3;
        imageLarge = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getImageForDensity(float f)
    {
        if ((double)f <= 0.75D)
        {
            return imageSmall;
        }
        if (f <= 1.0F)
        {
            return imageSmall;
        }
        if ((double)f <= 1.5D)
        {
            return imageMedium;
        }
        if ((double)f <= 2D)
        {
            return imageMedium;
        }
        if ((double)f <= 3D)
        {
            return imageLarge;
        } else
        {
            return imageLarge;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeInt(degree);
        parcel.writeString(name);
        parcel.writeString(imageSmall);
        parcel.writeString(imageMedium);
        parcel.writeString(imageLarge);
    }

}
