// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import gen;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MomentPlayerSnapshotCache
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentPlayerSnapshotCache(gen.a(parcel, Entry.CREATOR));
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentPlayerSnapshotCache[i];
        }

    };
    private static final String JSON_KEY_MAP = "snapshotCache";
    private static final int MAX_ITEMS_IN_CACHE = 30;
    private final LruCache mSnapshotCache;

    public MomentPlayerSnapshotCache()
    {
        mSnapshotCache = new LruCache(30);
    }

    public MomentPlayerSnapshotCache(Map map)
    {
        mSnapshotCache = new LruCache(30);
        if (map != null)
        {
            putFromMap(map);
        }
    }

    private void putFromMap(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); mSnapshotCache.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public void clear()
    {
        mSnapshotCache.evictAll();
    }

    public int describeContents()
    {
        return 0;
    }

    public Entry get(String s)
    {
        return (Entry)mSnapshotCache.get(s);
    }

    Map getSnapshot()
    {
        return mSnapshotCache.snapshot();
    }

    public Entry put(String s, PlayerTrack playertrack, PlayerContextIndex playercontextindex, long l, String s1)
    {
        return (Entry)mSnapshotCache.put(s, new Entry(s1, playertrack, playercontextindex, l));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mSnapshotCache.snapshot());
    }


    private class Entry
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new Entry(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Entry[i];
            }

        };
        private static final String JSON_KEY_INDEX = "index";
        private static final String JSON_KEY_SNAPSHOT = "snapshot";
        private static final String JSON_KEY_TIME = "timestamp";
        private static final String JSON_KEY_TRACK = "track";
        public final PlayerContextIndex index;
        public final String snapshot;
        public final long timestamp;
        public final PlayerTrack track;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (!cty.a(Long.valueOf(timestamp), Long.valueOf(((Entry) (obj)).timestamp)) || !cty.a(snapshot, ((Entry) (obj)).snapshot) || !cty.a(track, ((Entry) (obj)).track) || !cty.a(index, ((Entry) (obj)).index))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                snapshot, track, index, Long.valueOf(timestamp)
            });
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(snapshot);
            parcel.writeParcelable(track, 0);
            parcel.writeParcelable(index, 0);
            parcel.writeLong(timestamp);
        }


        private Entry(Parcel parcel)
        {
            snapshot = parcel.readString();
            track = (PlayerTrack)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerTrack.getClassLoader());
            index = (PlayerContextIndex)parcel.readParcelable(com/spotify/mobile/android/cosmos/player/v2/PlayerContextIndex.getClassLoader());
            timestamp = parcel.readLong();
        }


        public Entry(String s, PlayerTrack playertrack, PlayerContextIndex playercontextindex, long l)
        {
            snapshot = s;
            track = (PlayerTrack)ctz.a(playertrack);
            index = playercontextindex;
            timestamp = l;
        }
    }

}
