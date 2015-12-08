// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import cur;
import gen;
import ggi;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class PlayerTrack
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerTrack createFromParcel(Parcel parcel)
        {
            return new PlayerTrack(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerTrack[] newArray(int i)
        {
            return new PlayerTrack[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String TRACK_THUMB_STATE_DOWN = "down";
    public static final String TRACK_THUMB_STATE_UP = "up";
    private final ImmutableMap mMetadata;
    private final String mProvider;
    private final String mUid;
    private final String mUri;

    private PlayerTrack(Parcel parcel)
    {
        mUri = parcel.readString();
        mUid = parcel.readString();
        mProvider = gen.d(parcel);
        mMetadata = gen.c(parcel);
    }


    public PlayerTrack(String s, String s1, String s2, String s3, String s4, Map map)
    {
        mUri = s;
        mUid = s1;
        mProvider = s4;
        s = ImmutableMap.i();
        if (map != null && !map.isEmpty())
        {
            s.a(map);
        }
        if (s2 != null && (map == null || !map.containsKey("album_uri")))
        {
            s.a("album_uri", s2);
        }
        if (s3 != null && (map == null || !map.containsKey("artist_uri")))
        {
            s.a("artist_uri", s3);
        }
        mMetadata = s.a();
    }

    public static PlayerTrack create(String s)
    {
        return new PlayerTrack(s, "", null, null, null, Collections.EMPTY_MAP);
    }

    public static PlayerTrack create(String s, String s1, String s2)
    {
        return new PlayerTrack(s, "", s1, s2, null, Collections.EMPTY_MAP);
    }

    public static PlayerTrack create(String s, String s1, String s2, String s3, String s4, Map map)
    {
        return new PlayerTrack(s, s1, s2, s3, s4, map);
    }

    public static PlayerTrack create(String s, String s1, String s2, String s3, Map map)
    {
        return new PlayerTrack(s, "", s1, s2, null, map);
    }

    public static PlayerTrack create(String s, String s1, String s2, Map map)
    {
        return new PlayerTrack(s, "", s1, s2, null, map);
    }

    public static PlayerTrack create(String s, Map map)
    {
        return new PlayerTrack(s, "", null, null, null, map);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PlayerTrack)obj;
            if (!cty.a(mProvider, ((PlayerTrack) (obj)).mProvider))
            {
                return false;
            }
            if (!cty.a(mUri, ((PlayerTrack) (obj)).mUri))
            {
                return false;
            }
            if (!cty.a(mUid, ((PlayerTrack) (obj)).mUid))
            {
                return false;
            }
            if (!ggi.a(mMetadata, ((PlayerTrack) (obj)).mMetadata))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mUri, mUid, mProvider, Integer.valueOf(ggi.a(mMetadata))
        });
    }

    public Map metadata()
    {
        return mMetadata;
    }

    public String provider()
    {
        return mProvider;
    }

    public String uid()
    {
        return mUid;
    }

    public String uri()
    {
        return mUri;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mUid);
        gen.a(parcel, mProvider);
        gen.b(parcel, mMetadata);
    }

}
