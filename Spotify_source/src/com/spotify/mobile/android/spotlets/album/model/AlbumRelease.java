// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.album.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

// Referenced classes of package com.spotify.mobile.android.spotlets.album.model:
//            AlbumImage

public class AlbumRelease
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumRelease(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumRelease[i];
        }

    };
    public final AlbumImage cover;
    public final int day;
    public final int month;
    public final String name;
    public final int trackCount;
    public final String uri;
    public final int year;

    public AlbumRelease(int i, int j, int k, int l, AlbumImage albumimage, String s, String s1)
    {
        day = i;
        month = j;
        year = k;
        trackCount = l;
        uri = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        cover = (AlbumImage)ctz.a(albumimage);
    }

    private AlbumRelease(Parcel parcel)
    {
        day = parcel.readInt();
        month = parcel.readInt();
        year = parcel.readInt();
        trackCount = parcel.readInt();
        name = parcel.readString();
        uri = parcel.readString();
        cover = (AlbumImage)parcel.readParcelable(com/spotify/mobile/android/spotlets/album/model/AlbumImage.getClassLoader());
    }


    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(day);
        parcel.writeInt(month);
        parcel.writeInt(year);
        parcel.writeInt(trackCount);
        parcel.writeString(name);
        parcel.writeString(uri);
        parcel.writeParcelable(cover, i);
    }

}
