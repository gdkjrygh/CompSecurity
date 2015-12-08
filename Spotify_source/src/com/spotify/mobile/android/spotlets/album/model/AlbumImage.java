// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.album.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class AlbumImage
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumImage(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumImage[i];
        }

    };
    public final String uri;

    private AlbumImage(Parcel parcel)
    {
        uri = parcel.readString();
    }


    public AlbumImage(String s)
    {
        uri = (String)ctz.a(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
    }

}
