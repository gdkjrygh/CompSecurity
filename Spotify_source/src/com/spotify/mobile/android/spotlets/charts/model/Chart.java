// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import ctz;
import cuv;
import cuz;
import gdf;
import gdw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartEntry, ChartAlbum, ChartArtist

public class Chart
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Chart(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Chart[i];
        }

    };
    private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/spotlets/charts/model/Chart$RankType);
    public final String description;
    public final int duration;
    public final List entries;
    public final String imageUrl;
    public final Date lastUpdated;
    public final int newEntriesCount;
    public final Map playerMetadata;
    public final PlayerTrack playerTracks[];
    public final RankType rankType;
    public final String title;

    private Chart(Parcel parcel)
    {
        imageUrl = parcel.readString();
        rankType = RankType.values()[parcel.readInt()];
        title = parcel.readString();
        description = parcel.readString();
        long l = parcel.readLong();
        Date date;
        if (l == -1L)
        {
            date = null;
        } else
        {
            date = new Date(l);
        }
        lastUpdated = date;
        entries = parcel.createTypedArrayList(ChartEntry.CREATOR);
        newEntriesCount = parcel.readInt();
        duration = parcel.readInt();
        playerTracks = createPlayerTracks(entries);
        playerMetadata = createPlayerMetadata(title, imageUrl, description);
    }


    public Chart(String s, String s1, String s2, String s3, Date date, int i, List list, 
            int j)
    {
        imageUrl = (String)ctz.a(s);
        rankType = (RankType)TYPE_PARSER.b(s1).a(RankType.a);
        title = (String)ctz.a(s2);
        description = s3;
        lastUpdated = date;
        newEntriesCount = i;
        duration = j;
        entries = gdw.a(list);
        playerTracks = createPlayerTracks(entries);
        playerMetadata = createPlayerMetadata(title, imageUrl, description);
    }

    private Map createPlayerMetadata(String s, String s1, String s2)
    {
        java.util.HashMap hashmap = Maps.b();
        hashmap.put("context_description", s);
        hashmap.put("image_url", s1);
        if (s2 != null)
        {
            hashmap.put("context_long_description", s2);
        }
        return ImmutableMap.a(hashmap);
    }

    private PlayerTrack[] createPlayerTracks(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ChartEntry chartentry = (ChartEntry)list.next();
            if (chartentry.artists.size() > 0 && chartentry.albums.size() > 0)
            {
                arraylist.add(PlayerTrack.create(chartentry.uri, ((ChartAlbum)chartentry.albums.get(0)).uri, ((ChartArtist)chartentry.artists.get(0)).uri));
            }
        } while (true);
        list = cuv.b(arraylist);
        return (PlayerTrack[])list.toArray(cuz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerTrack, list.size()));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(imageUrl);
        parcel.writeInt(rankType.ordinal());
        parcel.writeString(title);
        parcel.writeString(description);
        long l;
        if (lastUpdated != null)
        {
            l = lastUpdated.getTime();
        } else
        {
            l = -1L;
        }
        parcel.writeLong(l);
        parcel.writeTypedList(entries);
        parcel.writeInt(newEntriesCount);
        parcel.writeInt(duration);
    }


    private class RankType extends Enum
    {

        public static final RankType a;
        public static final RankType b;
        private static RankType c;
        private static RankType d;
        private static final RankType e[];

        public static RankType valueOf(String s)
        {
            return (RankType)Enum.valueOf(com/spotify/mobile/android/spotlets/charts/model/Chart$RankType, s);
        }

        public static RankType[] values()
        {
            return (RankType[])e.clone();
        }

        static 
        {
            a = new RankType("UNKNOWN", 0);
            b = new RankType("PLAYS", 1);
            c = new RankType("VIRALITY", 2);
            d = new RankType("POPULARITY", 3);
            e = (new RankType[] {
                a, b, c, d
            });
        }

        private RankType(String s, int i)
        {
            super(s, i);
        }
    }

}
