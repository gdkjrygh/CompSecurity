// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class PlayerContextIndex
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerContextIndex createFromParcel(Parcel parcel)
        {
            return new PlayerContextIndex(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerContextIndex[] newArray(int i)
        {
            return new PlayerContextIndex[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final int mPage;
    private final int mTrack;

    public PlayerContextIndex(int i, int j)
    {
        mPage = i;
        mTrack = j;
    }

    protected PlayerContextIndex(Parcel parcel)
    {
        mPage = parcel.readInt();
        mTrack = parcel.readInt();
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
            obj = (PlayerContextIndex)obj;
            if (mPage != ((PlayerContextIndex) (obj)).mPage)
            {
                return false;
            }
            if (mTrack != ((PlayerContextIndex) (obj)).mTrack)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return mPage * 31 + mTrack;
    }

    public int page()
    {
        return mPage;
    }

    public int track()
    {
        return mTrack;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mPage);
        parcel.writeInt(mTrack);
    }

}
