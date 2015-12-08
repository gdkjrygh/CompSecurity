// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import cty;
import gen;
import gjm;
import gpl;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationTracksModel, RelatedArtistModel

public class RadioStationModel
    implements Parcelable, JacksonModel
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
            return new RadioStationModel(s, s1, s2, s3, s4, s5, as, arelatedartistmodel, ((PlayerTrack []) (aobj)), parcel.readString(), gen.a(parcel));
        }

        public final volatile Object[] newArray(int i)
        {
            return new RadioStationModel[i];
        }

    };
    public final boolean explicitSave;
    public final String imageUri;
    public final String nextPageUrl;
    public final RelatedArtistModel relatedArtists[];
    public final String seeds[];
    public final Verified stationUri;
    public final String subtitle;
    public final String subtitleUri;
    public final String title;
    public final String titleUri;
    public final PlayerTrack tracks[];
    public final String uri;

    public RadioStationModel(RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel)
    {
        uri = radiostationmodel.uri;
        stationUri = radiostationmodel.stationUri;
        title = radiostationmodel.title;
        titleUri = radiostationmodel.titleUri;
        imageUri = radiostationmodel.imageUri;
        subtitle = radiostationmodel.subtitle;
        subtitleUri = radiostationmodel.subtitleUri;
        seeds = radiostationmodel.seeds;
        relatedArtists = radiostationmodel.relatedArtists;
        tracks = radiostationtracksmodel.tracks;
        nextPageUrl = radiostationtracksmodel.nextPageUrl;
        explicitSave = radiostationmodel.explicitSave;
    }

    public RadioStationModel(String s, String s1, String s2, String s3, String s4, String s5, String as[], 
            RelatedArtistModel arelatedartistmodel[], PlayerTrack aplayertrack[], String s6, boolean flag)
    {
        String s7 = s;
        if (s == null)
        {
            s7 = (new StringBuilder("spotify:station:")).append(as[0].substring(8)).toString();
        }
        uri = s7;
        stationUri = ViewUri.V.a(uri);
        title = s1;
        titleUri = s2;
        imageUri = s3;
        subtitle = s4;
        subtitleUri = s5;
        seeds = as;
        s = arelatedartistmodel;
        if (arelatedartistmodel == null)
        {
            s = new RelatedArtistModel[0];
        }
        relatedArtists = s;
        s = aplayertrack;
        if (aplayertrack == null)
        {
            s = new PlayerTrack[0];
        }
        tracks = s;
        nextPageUrl = s6;
        explicitSave = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RadioStationModel)
        {
            obj = (RadioStationModel)obj;
            flag = flag1;
            if (cty.a(uri, ((RadioStationModel) (obj)).uri))
            {
                flag = flag1;
                if (cty.a(title, ((RadioStationModel) (obj)).title))
                {
                    flag = flag1;
                    if (cty.a(titleUri, ((RadioStationModel) (obj)).titleUri))
                    {
                        flag = flag1;
                        if (cty.a(imageUri, ((RadioStationModel) (obj)).imageUri))
                        {
                            flag = flag1;
                            if (cty.a(subtitle, ((RadioStationModel) (obj)).subtitle))
                            {
                                flag = flag1;
                                if (cty.a(subtitleUri, ((RadioStationModel) (obj)).subtitleUri))
                                {
                                    flag = flag1;
                                    if (Arrays.equals(seeds, ((RadioStationModel) (obj)).seeds))
                                    {
                                        flag = flag1;
                                        if (Arrays.equals(tracks, ((RadioStationModel) (obj)).tracks))
                                        {
                                            flag = flag1;
                                            if (cty.a(nextPageUrl, ((RadioStationModel) (obj)).nextPageUrl))
                                            {
                                                flag = flag1;
                                                if (cty.a(Boolean.valueOf(explicitSave), Boolean.valueOf(((RadioStationModel) (obj)).explicitSave)))
                                                {
                                                    flag = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public Uri getPlayableUri()
    {
        return gpl.a(getStationSeed());
    }

    public String getPlayerContextUri()
    {
        return gpl.b(getStationSeed());
    }

    public String getStationSeed()
    {
        return seeds[0];
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            uri, title, titleUri, imageUri, subtitle, subtitleUri, Integer.valueOf(Arrays.hashCode(seeds)), Integer.valueOf(Arrays.hashCode(tracks)), nextPageUrl, Boolean.valueOf(explicitSave)
        });
    }

    public boolean isMyContext(String s)
    {
        while (TextUtils.isEmpty(s) || !cty.a(s, getPlayerContextUri()) && !Arrays.asList(seeds).contains(s)) 
        {
            return false;
        }
        return true;
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
    }

}
