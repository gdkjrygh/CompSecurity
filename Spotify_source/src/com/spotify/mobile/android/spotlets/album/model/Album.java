// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.album.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gdw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.album.model:
//            AlbumImage, AlbumRelated, AlbumDisc, AlbumArtist

public class Album
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Album(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Album[i];
        }

    };
    public final List artists;
    public final List copyrights;
    public final AlbumImage cover;
    public final int day;
    public final List discs;
    private List mAlbumTracks;
    public final int month;
    public final String name;
    public final AlbumRelated related;
    public final int trackCount;
    public final String type;
    public final String uri;
    public final int year;

    public Album(int i, int j, int k, int l, String s, String s1, String s2, 
            AlbumImage albumimage, AlbumRelated albumrelated, List list, List list1, List list2)
    {
        day = i;
        month = j;
        year = k;
        trackCount = l;
        type = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        uri = (String)ctz.a(s2);
        cover = (AlbumImage)ctz.a(albumimage);
        related = albumrelated;
        copyrights = gdw.a(list);
        discs = gdw.a(list1);
        artists = gdw.a(list2);
    }

    private Album(Parcel parcel)
    {
        day = parcel.readInt();
        month = parcel.readInt();
        year = parcel.readInt();
        trackCount = parcel.readInt();
        type = parcel.readString();
        name = parcel.readString();
        uri = parcel.readString();
        cover = (AlbumImage)parcel.readParcelable(com/spotify/mobile/android/spotlets/album/model/AlbumImage.getClassLoader());
        related = (AlbumRelated)parcel.readParcelable(com/spotify/mobile/android/spotlets/album/model/AlbumRelated.getClassLoader());
        copyrights = parcel.createStringArrayList();
        discs = parcel.createTypedArrayList(AlbumDisc.CREATOR);
        artists = parcel.createTypedArrayList(AlbumArtist.CREATOR);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getAlbumTracks()
    {
        if (mAlbumTracks == null)
        {
            mAlbumTracks = new ArrayList();
            AlbumDisc albumdisc;
            for (Iterator iterator = discs.iterator(); iterator.hasNext(); mAlbumTracks.addAll(albumdisc.tracks))
            {
                albumdisc = (AlbumDisc)iterator.next();
            }

        }
        return mAlbumTracks;
    }

    public String getFirstArtistName()
    {
        if (!artists.isEmpty())
        {
            return ((AlbumArtist)artists.get(0)).name;
        } else
        {
            return "";
        }
    }

    public String getFirstArtistUri()
    {
        if (!artists.isEmpty())
        {
            return ((AlbumArtist)artists.get(0)).uri;
        } else
        {
            return "";
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(day);
        parcel.writeInt(month);
        parcel.writeInt(year);
        parcel.writeInt(trackCount);
        parcel.writeString(type);
        parcel.writeString(name);
        parcel.writeString(uri);
        parcel.writeParcelable(cover, i);
        parcel.writeParcelable(related, i);
        parcel.writeStringList(copyrights);
        parcel.writeTypedList(discs);
        parcel.writeTypedList(artists);
    }

}
