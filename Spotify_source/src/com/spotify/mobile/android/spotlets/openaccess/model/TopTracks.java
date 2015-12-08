// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.openaccess.model:
//            Track

public class TopTracks
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new TopTracks(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new TopTracks[i];
        }

    };
    private final Track mTracks[];

    protected TopTracks(Parcel parcel)
    {
        mTracks = (Track[])parcel.createTypedArray(Track.CREATOR);
    }

    public TopTracks(Track atrack[])
    {
        mTracks = atrack;
    }

    public int describeContents()
    {
        return 0;
    }

    public Track[] getTracks()
    {
        return mTracks;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(mTracks, 0);
    }

}
