// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.openaccess.model:
//            Track

public class Tracks
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Tracks(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Tracks[i];
        }

    };
    private final Track mItems[];

    protected Tracks(Parcel parcel)
    {
        mItems = new Track[0];
        parcel.readTypedArray(mItems, Track.CREATOR);
    }

    private Tracks(Track atrack[])
    {
        mItems = atrack;
    }

    public int describeContents()
    {
        return 0;
    }

    public Track[] getItems()
    {
        return mItems;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeArray(mItems);
    }

}
