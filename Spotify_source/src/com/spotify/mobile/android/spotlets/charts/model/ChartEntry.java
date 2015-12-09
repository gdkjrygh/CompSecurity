// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gdf;
import gdw;
import gen;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartArtist, ChartAlbum

public class ChartEntry
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ChartEntry(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartEntry[i];
        }

    };
    private static final gdf STATUS_PARSER = gdf.a(com/spotify/mobile/android/spotlets/charts/model/ChartEntry$Status);
    public final List albums;
    public final List artists;
    public final double currentPos;
    public final boolean explicit;
    public final String name;
    public final boolean playable;
    public final double previousPos;
    public final int rank;
    public final Status status;
    public final String uri;

    private ChartEntry(Parcel parcel)
    {
        status = Status.values()[parcel.readInt()];
        uri = parcel.readString();
        name = parcel.readString();
        artists = parcel.createTypedArrayList(ChartArtist.CREATOR);
        albums = parcel.createTypedArrayList(ChartAlbum.CREATOR);
        rank = parcel.readInt();
        currentPos = parcel.readDouble();
        previousPos = parcel.readDouble();
        playable = gen.a(parcel);
        explicit = gen.a(parcel);
    }


    public ChartEntry(String s, String s1, String s2, boolean flag, boolean flag1, int i, double d, double d1, List list, List list1)
    {
        uri = (String)ctz.a(s);
        name = (String)ctz.a(s1);
        status = (Status)STATUS_PARSER.b(s2).a(Status.a);
        playable = flag;
        explicit = flag1;
        rank = i;
        artists = gdw.a(list);
        albums = gdw.a(list1);
        currentPos = d1;
        previousPos = d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(status.ordinal());
        parcel.writeString(uri);
        parcel.writeString(name);
        parcel.writeTypedList(artists);
        parcel.writeTypedList(albums);
        parcel.writeInt(rank);
        parcel.writeDouble(currentPos);
        parcel.writeDouble(previousPos);
        gen.a(parcel, playable);
        gen.a(parcel, explicit);
    }


    private class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        public static final Status d;
        private static Status e;
        private static final Status f[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/spotify/mobile/android/spotlets/charts/model/ChartEntry$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])f.clone();
        }

        static 
        {
            a = new Status("UNKNOWN", 0);
            b = new Status("UP", 1);
            c = new Status("DOWN", 2);
            d = new Status("NEW", 3);
            e = new Status("EQUAL", 4);
            f = (new Status[] {
                a, b, c, d, e
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

}
