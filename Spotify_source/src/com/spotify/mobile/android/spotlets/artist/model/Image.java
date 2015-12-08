// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import dto;

public class Image
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Image(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Image[i];
        }

    };
    public final int height;
    public final String uri;
    public final int width;

    private Image(Parcel parcel)
    {
        uri = parcel.readString();
        width = parcel.readInt();
        height = parcel.readInt();
    }


    public Image(String s, int i, int j)
    {
        uri = (String)ctz.a(s);
        width = i;
        height = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri getUri()
    {
        return dto.a(uri);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeInt(width);
        parcel.writeInt(height);
    }

}
