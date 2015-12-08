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

public class AlbumArtist
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumArtist(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumArtist[i];
        }

    };
    public final AlbumImage image;
    public final String name;
    public final String uri;

    private AlbumArtist(Parcel parcel)
    {
        image = (AlbumImage)parcel.readParcelable(com/spotify/mobile/android/spotlets/album/model/AlbumImage.getClassLoader());
        uri = parcel.readString();
        name = parcel.readString();
    }


    public AlbumArtist(AlbumImage albumimage, String s, String s1)
    {
        image = albumimage;
        uri = (String)ctz.a(s);
        name = (String)ctz.a(s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(image, i);
        parcel.writeString(uri);
        parcel.writeString(name);
    }

}
