// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tinder.enums.UserPhotoSize;
import java.io.Serializable;

public class ProcessedPhoto
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final ProcessedPhoto createFromParcel(Parcel parcel)
        {
            return new ProcessedPhoto(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ProcessedPhoto[] newArray(int i)
        {
            return new ProcessedPhoto[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public final int height;
    public String id;
    public final String imageUrl;
    public String ownerUserId;
    public final UserPhotoSize photoSize;
    public final int width;

    protected ProcessedPhoto(Parcel parcel)
    {
        imageUrl = parcel.readString();
        width = parcel.readInt();
        height = parcel.readInt();
        photoSize = (UserPhotoSize)parcel.readValue(com/tinder/enums/UserPhotoSize.getClassLoader());
        id = parcel.readString();
        ownerUserId = parcel.readString();
    }

    public ProcessedPhoto(String s, String s1, String s2, int i, int j)
    {
        id = s;
        ownerUserId = s1;
        imageUrl = s2;
        width = i;
        height = j;
        if (width <= 84)
        {
            photoSize = UserPhotoSize.XSMALL;
            return;
        }
        if (width <= 172)
        {
            photoSize = UserPhotoSize.SMALL;
            return;
        }
        if (width <= 320)
        {
            photoSize = UserPhotoSize.MED;
            return;
        }
        if (width <= 640)
        {
            photoSize = UserPhotoSize.LARGE;
            return;
        } else
        {
            photoSize = UserPhotoSize.XLARGE;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(imageUrl);
        parcel.writeInt(width);
        parcel.writeInt(height);
        parcel.writeValue(photoSize);
        parcel.writeString(id);
        parcel.writeString(ownerUserId);
    }

}
