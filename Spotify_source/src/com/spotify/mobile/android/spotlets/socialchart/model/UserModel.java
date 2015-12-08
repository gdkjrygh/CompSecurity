// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctv;
import ctz;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.socialchart.model:
//            TrackModel

public class UserModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new UserModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new UserModel[i];
        }

    };
    private final Collection mInfluencers;
    private final String mLinkUri;
    private TrackModel mTrackModels[];
    private final List mTracksUriList;

    public UserModel(Parcel parcel)
    {
        mTrackModels = (TrackModel[])parcel.createTypedArray(TrackModel.CREATOR);
        mLinkUri = parcel.readString();
        ctz.a(mTrackModels);
        ctz.a(mLinkUri);
        mTracksUriList = buildTracksUriList();
        mInfluencers = buildInfluencersList();
    }

    public UserModel(TrackModel atrackmodel[], String s)
    {
        if (atrackmodel == null)
        {
            mTrackModels = new TrackModel[0];
        } else
        {
            mTrackModels = atrackmodel;
        }
        mLinkUri = s;
        mTracksUriList = buildTracksUriList();
        mInfluencers = buildInfluencersList();
    }

    private Collection buildInfluencersList()
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        TrackModel atrackmodel[] = mTrackModels;
        int j = atrackmodel.length;
        for (int i = 0; i < j; i++)
        {
            linkedhashset.addAll(Arrays.asList(atrackmodel[i].getInfluencers()));
        }

        return linkedhashset;
    }

    private List buildTracksUriList()
    {
        return Lists.a(Arrays.asList(mTrackModels), new ctv() {

            public final Object a(Object obj)
            {
                obj = (TrackModel)obj;
                if (obj != null)
                {
                    return ((TrackModel) (obj)).getTrackUri();
                } else
                {
                    return null;
                }
            }

        });
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
            obj = (UserModel)obj;
            if (!mLinkUri.equals(((UserModel) (obj)).mLinkUri))
            {
                return false;
            }
            if (!Arrays.equals(mTrackModels, ((UserModel) (obj)).mTrackModels))
            {
                return false;
            }
        }
        return true;
    }

    public Collection getInfluencers()
    {
        ctz.a(mTracksUriList);
        return mInfluencers;
    }

    public String getLinkUri()
    {
        return mLinkUri;
    }

    public TrackModel[] getTrackModels()
    {
        ctz.a(mTrackModels);
        return mTrackModels;
    }

    public List getTracksUriList()
    {
        ctz.a(mTracksUriList);
        return mTracksUriList;
    }

    public int hashCode()
    {
        return Arrays.hashCode(mTrackModels) * 31 + mLinkUri.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(mTrackModels, 0);
        parcel.writeString(mLinkUri);
    }

}
