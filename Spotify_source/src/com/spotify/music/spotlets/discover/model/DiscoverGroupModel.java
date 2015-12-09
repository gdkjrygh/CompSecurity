// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.discover.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.music.spotlets.discover.model:
//            DiscoverReasonModel, DiscoverStoryModel

public class DiscoverGroupModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            Parcelable aparcelable[] = parcel.readParcelableArray(com/spotify/music/spotlets/discover/model/DiscoverGroupModel.getClassLoader());
            DiscoverStoryModel adiscoverstorymodel[] = new DiscoverStoryModel[aparcelable.length];
            System.arraycopy(aparcelable, 0, adiscoverstorymodel, 0, aparcelable.length);
            return new DiscoverGroupModel(adiscoverstorymodel, (DiscoverReasonModel)parcel.readParcelable(com/spotify/music/spotlets/discover/model/DiscoverReasonModel.getClassLoader()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new DiscoverGroupModel[i];
        }

    };
    public final DiscoverReasonModel discoverReasonModel;
    public final DiscoverStoryModel stories[];

    public DiscoverGroupModel(DiscoverStoryModel adiscoverstorymodel[], DiscoverReasonModel discoverreasonmodel)
    {
        discoverReasonModel = discoverreasonmodel;
        stories = adiscoverstorymodel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray(stories, 0);
        parcel.writeParcelable(discoverReasonModel, 0);
    }

}
