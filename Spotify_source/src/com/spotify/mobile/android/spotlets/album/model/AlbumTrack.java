// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.album.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gdw;
import gen;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.album.model:
//            AlbumArtist

public class AlbumTrack
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumTrack(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumTrack[i];
        }

    };
    public final List artists;
    public final int duration;
    public final boolean explicit;
    public final String name;
    public final int number;
    public final int playCount;
    public final boolean playable;
    public final int popularity;
    public final String uri;

    private AlbumTrack(Parcel parcel)
    {
        playable = gen.a(parcel);
        explicit = gen.a(parcel);
        duration = parcel.readInt();
        playCount = parcel.readInt();
        number = parcel.readInt();
        popularity = parcel.readInt();
        uri = parcel.readString();
        name = parcel.readString();
        artists = parcel.createTypedArrayList(AlbumArtist.CREATOR);
    }


    public AlbumTrack(boolean flag, boolean flag1, int i, int j, int k, int l, String s, 
            String s1, List list)
    {
        playable = flag;
        explicit = flag1;
        duration = i;
        playCount = j;
        number = k;
        popularity = l;
        uri = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        artists = gdw.a(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, playable);
        gen.a(parcel, explicit);
        parcel.writeInt(duration);
        parcel.writeInt(playCount);
        parcel.writeInt(number);
        parcel.writeInt(popularity);
        parcel.writeString(uri);
        parcel.writeString(name);
        parcel.writeTypedList(artists);
    }

}
