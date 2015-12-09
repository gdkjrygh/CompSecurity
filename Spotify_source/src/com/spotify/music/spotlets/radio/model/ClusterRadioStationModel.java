// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import cty;
import gen;
import gpl;
import java.util.Arrays;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationModel, RadioStationTracksModel, RelatedArtistModel

public class ClusterRadioStationModel extends RadioStationModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            String as[] = parcel.createStringArray();
            Object aobj[] = parcel.readParcelableArray(com/spotify/music/spotlets/radio/model/RadioStationModel.getClassLoader());
            RelatedArtistModel arelatedartistmodel[] = new RelatedArtistModel[aobj.length];
            System.arraycopy(((Object) (aobj)), 0, arelatedartistmodel, 0, aobj.length);
            aobj = new PlayerTrack[parcel.readInt()];
            parcel.readTypedArray(aobj, PlayerTrack.CREATOR);
            return new ClusterRadioStationModel(s, s1, s2, s3, s4, s5, as, arelatedartistmodel, ((PlayerTrack []) (aobj)), parcel.readString(), gen.a(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new ClusterRadioStationModel[i];
        }

    };
    private static final String STATION = "station";
    public final String clusterType;
    public final String description;
    private boolean mIsSelectedForPlaying;
    public final String username;

    public ClusterRadioStationModel(ClusterRadioStationModel clusterradiostationmodel, RadioStationTracksModel radiostationtracksmodel)
    {
        super(clusterradiostationmodel, radiostationtracksmodel);
        username = clusterradiostationmodel.username;
        clusterType = clusterradiostationmodel.clusterType;
        description = clusterradiostationmodel.description;
    }

    public ClusterRadioStationModel(String s, String s1, String s2, String s3, String s4, String s5, String as[], 
            RelatedArtistModel arelatedartistmodel[], PlayerTrack aplayertrack[], String s6, boolean flag, String s7, String s8, String s9)
    {
        String s10;
        if (s.contains("station"))
        {
            s10 = s;
        } else
        {
            s10 = gpl.b(s);
        }
        if (as == null || as.length == 0)
        {
            as = new String[1];
            as[0] = s;
            s = as;
        } else
        {
            s = as;
        }
        super(s10, s1, s2, s3, s4, s5, s, arelatedartistmodel, aplayertrack, s6, flag);
        username = s7;
        clusterType = s8;
        description = s9;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ClusterRadioStationModel)
        {
            ClusterRadioStationModel clusterradiostationmodel = (ClusterRadioStationModel)obj;
            return super.equals(obj) && cty.a(username, clusterradiostationmodel.username) && cty.a(clusterType, clusterradiostationmodel.clusterType) && cty.a(description, clusterradiostationmodel.description);
        } else
        {
            return false;
        }
    }

    public boolean getPlaying()
    {
        return mIsSelectedForPlaying;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(super.hashCode()), username, description, clusterType
        });
    }

    public void setPlaying(boolean flag)
    {
        mIsSelectedForPlaying = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeString(title);
        parcel.writeString(titleUri);
        parcel.writeString(imageUri);
        parcel.writeString(subtitle);
        parcel.writeString(subtitleUri);
        parcel.writeStringArray(seeds);
        parcel.writeParcelableArray(relatedArtists, 0);
        parcel.writeInt(tracks.length);
        parcel.writeTypedArray(tracks, 0);
        parcel.writeString(nextPageUrl);
        gen.a(parcel, explicitSave);
        parcel.writeString(username);
        parcel.writeString(clusterType);
        parcel.writeString(description);
    }

}
