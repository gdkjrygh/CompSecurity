// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ChartAlbum
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ChartAlbum(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartAlbum[i];
        }

    };
    public String name;
    public String uri;

    private ChartAlbum(Parcel parcel)
    {
        name = parcel.readString();
        uri = parcel.readString();
    }


    public ChartAlbum(String s, String s1)
    {
        name = s;
        uri = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeString(uri);
    }

}
