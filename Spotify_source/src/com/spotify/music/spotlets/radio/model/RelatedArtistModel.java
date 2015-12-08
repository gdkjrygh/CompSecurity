// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class RelatedArtistModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new RelatedArtistModel(parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new RelatedArtistModel[i];
        }

    };
    public final String artistName;
    public final String artistUri;

    public RelatedArtistModel(String s, String s1)
    {
        artistName = s;
        artistUri = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(artistName);
        parcel.writeString(artistUri);
    }

}
