// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

// Referenced classes of package com.spotify.mobile.android.spotlets.artist.model:
//            Image

public class Release
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Release(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Release[i];
        }

    };
    public final Image cover;
    public final int day;
    public final int month;
    public final String name;
    public final int trackCount;
    public final String uri;
    public final int year;

    private Release(Parcel parcel)
    {
        uri = parcel.readString();
        name = parcel.readString();
        cover = (Image)parcel.readParcelable(com/spotify/mobile/android/spotlets/artist/model/Image.getClassLoader());
        year = parcel.readInt();
        month = parcel.readInt();
        day = parcel.readInt();
        trackCount = parcel.readInt();
    }


    public Release(String s, String s1, Image image, int i, int j, int k, int l)
    {
        uri = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        cover = image;
        year = i;
        month = j;
        day = k;
        trackCount = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeString(name);
        parcel.writeParcelable(cover, 0);
        parcel.writeInt(year);
        parcel.writeInt(month);
        parcel.writeInt(day);
        parcel.writeInt(trackCount);
    }

}
