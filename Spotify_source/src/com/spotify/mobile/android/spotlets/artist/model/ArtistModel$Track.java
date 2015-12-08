// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

public class name
    implements Parcelable, JacksonModel
{

    public static final android.os. CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ArtistModel.Track(parcel, null);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ArtistModel.Track[i];
        }

    };
    public final boolean explicit;
    public final String name;
    public final int playcount;
    public final String uri;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeInt(playcount);
        gen.a(parcel, explicit);
        parcel.writeString(name);
    }


    private _cls1(Parcel parcel)
    {
        uri = parcel.readString();
        playcount = parcel.readInt();
        explicit = gen.a(parcel);
        name = parcel.readString();
    }

    name(Parcel parcel, name name1)
    {
        this(parcel);
    }

    public <init>(String s, int i, boolean flag, String s1)
    {
        uri = s;
        playcount = i;
        explicit = flag;
        name = s1;
    }
}
