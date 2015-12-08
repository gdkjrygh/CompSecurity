// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import cty;
import cur;
import drz;
import dsa;
import gen;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.subitem:
//            PorcelainJsonLoggableEntity

public class PorcelainJsonPlayable extends PorcelainJsonLoggableEntity
    implements Parcelable, drz
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PorcelainJsonPlayable(parcel.readString(), parcel.readString(), (PorcelainJsonEntityInfo)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable$PorcelainJsonEntityInfo.getClassLoader()), parcel.readString(), gen.e(parcel));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonPlayable[i];
        }

    };
    private static final String KEY_CONTEXT = "context";
    private static final String KEY_ENTITY_INFO = "playerTrack";
    private static final String KEY_GROUP = "group";
    private static final String KEY_URI = "uri";
    private final String mContext;
    private final PorcelainJsonEntityInfo mEntityInfo;
    private final String mGroup;
    private final String mUri;

    public PorcelainJsonPlayable(String s, String s1, PorcelainJsonEntityInfo porcelainjsonentityinfo, String s2, JsonNode jsonnode)
    {
        super(s1, jsonnode);
        mGroup = s2;
        mContext = s;
        mEntityInfo = porcelainjsonentityinfo;
        mUri = s1;
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
            obj = (PorcelainJsonPlayable)obj;
            if (!cty.a(mContext, ((PorcelainJsonPlayable) (obj)).mContext) || !cty.a(mUri, ((PorcelainJsonPlayable) (obj)).mUri) || !cty.a(mEntityInfo, ((PorcelainJsonPlayable) (obj)).mEntityInfo) || !cty.a(mGroup, ((PorcelainJsonPlayable) (obj)).mGroup))
            {
                return false;
            }
        }
        return true;
    }

    public final String getContext()
    {
        return mContext;
    }

    public final PorcelainJsonEntityInfo getEntityInfo()
    {
        return mEntityInfo;
    }

    public volatile dsa getEntityInfo()
    {
        return getEntityInfo();
    }

    public final String getGroup()
    {
        return mGroup;
    }

    public final String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mContext != null)
        {
            i = mContext.hashCode();
        } else
        {
            i = 0;
        }
        if (mUri != null)
        {
            j = mUri.hashCode();
        } else
        {
            j = 0;
        }
        if (mEntityInfo != null)
        {
            k = mEntityInfo.hashCode();
        } else
        {
            k = 0;
        }
        if (mGroup != null)
        {
            l = mGroup.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public final boolean isPlayable()
    {
        return mUri != null && mEntityInfo != null;
    }

    public PlayerTrack toPlayerTrack()
    {
        if (isPlayable())
        {
            PorcelainJsonEntityInfo porcelainjsonentityinfo = getEntityInfo();
            String s = getUri();
            cur cur1 = ImmutableMap.i();
            cur1.a("media.type", "audio").a("artist_name", porcelainjsonentityinfo.getArtistName()).a("album_title", porcelainjsonentityinfo.getAlbumName()).a("title", porcelainjsonentityinfo.getTrackName());
            if (porcelainjsonentityinfo.getAlbumImageUri() != null)
            {
                cur1.a("image_url", porcelainjsonentityinfo.getAlbumImageUri());
            }
            return PlayerTrack.create(s, porcelainjsonentityinfo.getAlbumUri(), porcelainjsonentityinfo.getArtistUri(), cur1.a());
        } else
        {
            throw new AssertionError("Playable cannot be played!");
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mContext);
        parcel.writeString(mUri);
        parcel.writeParcelable(mEntityInfo, i);
        parcel.writeString(mGroup);
        writeExtraDataToParcel(parcel);
    }


    private class PorcelainJsonEntityInfo
        implements Parcelable, JacksonModel, dsa
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new PorcelainJsonEntityInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final volatile Object[] newArray(int i)
            {
                return new PorcelainJsonEntityInfo[i];
            }

        };
        private static final String KEY_ALBUM_IMAGE = "albumImageUri";
        private static final String KEY_ALBUM_NAME = "albumName";
        private static final String KEY_ALBUM_URI = "albumUri";
        private static final String KEY_ARTIST_NAME = "artistName";
        private static final String KEY_ARTIST_URI = "artistUri";
        private static final String KEY_TRACK_NAME = "trackName";
        private final String mAlbumImageUri;
        private final String mAlbumName;
        private final String mAlbumUri;
        private final String mArtistName;
        private final String mArtistUri;
        private final String mTrackName;

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
                obj = (PorcelainJsonEntityInfo)obj;
                if (!cty.a(mAlbumUri, ((PorcelainJsonEntityInfo) (obj)).mAlbumUri) || !cty.a(mAlbumName, ((PorcelainJsonEntityInfo) (obj)).mAlbumName) || !cty.a(mArtistUri, ((PorcelainJsonEntityInfo) (obj)).mArtistUri) || !cty.a(mArtistName, ((PorcelainJsonEntityInfo) (obj)).mArtistName) || !cty.a(mTrackName, ((PorcelainJsonEntityInfo) (obj)).mTrackName) || !cty.a(mAlbumImageUri, ((PorcelainJsonEntityInfo) (obj)).mAlbumImageUri))
                {
                    return false;
                }
            }
            return true;
        }

        public String getAlbumImageUri()
        {
            return mAlbumImageUri;
        }

        public String getAlbumName()
        {
            return mAlbumName;
        }

        public String getAlbumUri()
        {
            return mAlbumUri;
        }

        public String getArtistName()
        {
            return mArtistName;
        }

        public String getArtistUri()
        {
            return mArtistUri;
        }

        public String getTrackName()
        {
            return mTrackName;
        }

        public int hashCode()
        {
            int j = mAlbumUri.hashCode();
            int k = mAlbumName.hashCode();
            int l = mArtistUri.hashCode();
            int i1 = mArtistName.hashCode();
            int j1 = mTrackName.hashCode();
            int i;
            if (mAlbumImageUri != null)
            {
                i = mAlbumImageUri.hashCode();
            } else
            {
                i = 0;
            }
            return i + ((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mAlbumUri);
            parcel.writeString(mAlbumName);
            parcel.writeString(mArtistUri);
            parcel.writeString(mArtistName);
            parcel.writeString(mTrackName);
            parcel.writeString(mAlbumImageUri);
        }


        public PorcelainJsonEntityInfo(String s, String s1, String s2, String s3, String s4, String s5)
        {
            mAlbumUri = (String)ctz.a(s);
            mAlbumName = (String)ctz.a(s1);
            mArtistUri = (String)ctz.a(s2);
            mArtistName = (String)ctz.a(s3);
            mTrackName = (String)ctz.a(s4);
            mAlbumImageUri = s5;
        }
    }

}
