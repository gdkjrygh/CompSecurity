// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gen;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.spotlets.socialchart.model:
//            InfluencerModel, ArtistModel, AlbumModel

public class TrackModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new TrackModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new TrackModel[i];
        }

    };
    private final AlbumModel mAlbum;
    private final ArtistModel mArtists[];
    private String mArtistsString;
    private final boolean mInCollection;
    private final InfluencerModel mInfluencers[];
    private final boolean mIsUnavailable;
    private final String mName;
    private final int mRank;
    private final String mUri;

    public TrackModel(Parcel parcel)
    {
        mUri = parcel.readString();
        mName = parcel.readString();
        mInfluencers = (InfluencerModel[])parcel.createTypedArray(InfluencerModel.CREATOR);
        mArtists = (ArtistModel[])parcel.createTypedArray(ArtistModel.CREATOR);
        mAlbum = (AlbumModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/socialchart/model/AlbumModel.getClassLoader());
        mInCollection = gen.a(parcel);
        mRank = parcel.readInt();
        mIsUnavailable = gen.a(parcel);
        mArtistsString = buildArtistsString();
    }

    public TrackModel(String s, String s1, InfluencerModel ainfluencermodel[], ArtistModel aartistmodel[], AlbumModel albummodel, boolean flag, int i, 
            boolean flag1)
    {
        mUri = s;
        mName = s1;
        s = ainfluencermodel;
        if (ainfluencermodel == null)
        {
            s = new InfluencerModel[0];
        }
        mInfluencers = s;
        s = aartistmodel;
        if (aartistmodel == null)
        {
            s = new ArtistModel[0];
        }
        mArtists = s;
        mAlbum = albummodel;
        mInCollection = flag;
        mRank = i;
        mIsUnavailable = flag1;
        mArtistsString = buildArtistsString();
        ctz.a(mInfluencers);
        ctz.a(mArtists);
        ctz.a(mArtistsString);
    }

    private String buildArtistsString()
    {
        String as[] = new String[mArtists.length];
        for (int i = 0; i < mArtists.length; i++)
        {
            as[i] = mArtists[i].getName();
        }

        return TextUtils.join(", ", as);
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
            obj = (TrackModel)obj;
            if (mInCollection != ((TrackModel) (obj)).mInCollection)
            {
                return false;
            }
            if (mIsUnavailable != ((TrackModel) (obj)).mIsUnavailable)
            {
                return false;
            }
            if (mRank != ((TrackModel) (obj)).mRank)
            {
                return false;
            }
            if (mAlbum == null ? ((TrackModel) (obj)).mAlbum != null : !mAlbum.equals(((TrackModel) (obj)).mAlbum))
            {
                return false;
            }
            if (!Arrays.equals(mArtists, ((TrackModel) (obj)).mArtists))
            {
                return false;
            }
            if (!Arrays.equals(mInfluencers, ((TrackModel) (obj)).mInfluencers))
            {
                return false;
            }
            if (mName == null ? ((TrackModel) (obj)).mName != null : !mName.equals(((TrackModel) (obj)).mName))
            {
                return false;
            }
            if (mUri == null ? ((TrackModel) (obj)).mUri != null : !mUri.equals(((TrackModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public AlbumModel getAlbum()
    {
        return mAlbum;
    }

    public ArtistModel[] getArtists()
    {
        ctz.a(mArtists);
        return mArtists;
    }

    public String getArtistsString()
    {
        ctz.a(mArtistsString);
        return mArtistsString;
    }

    public boolean getInCollection()
    {
        return mInCollection;
    }

    public InfluencerModel[] getInfluencers()
    {
        ctz.a(mInfluencers);
        return mInfluencers;
    }

    public int getRank()
    {
        return mRank;
    }

    public String getTrackName()
    {
        return mName;
    }

    public String getTrackUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int j1 = 1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        if (mUri != null)
        {
            i = mUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mName != null)
        {
            j = mName.hashCode();
        } else
        {
            j = 0;
        }
        k1 = Arrays.hashCode(mInfluencers);
        if (mArtists != null)
        {
            k = Arrays.hashCode(mArtists);
        } else
        {
            k = 0;
        }
        if (mAlbum != null)
        {
            l = mAlbum.hashCode();
        } else
        {
            l = 0;
        }
        if (mInCollection)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l1 = mRank;
        if (!mIsUnavailable)
        {
            j1 = 0;
        }
        return ((i1 + (l + (k + ((j + i * 31) * 31 + k1) * 31) * 31) * 31) * 31 + l1) * 31 + j1;
    }

    public boolean isUnavailable()
    {
        return mIsUnavailable;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mName);
        parcel.writeTypedArray(mInfluencers, 0);
        parcel.writeTypedArray(mArtists, 0);
        parcel.writeParcelable(mAlbum, 0);
        gen.a(parcel, mInCollection);
        parcel.writeInt(mRank);
        gen.a(parcel, mIsUnavailable);
    }

}
