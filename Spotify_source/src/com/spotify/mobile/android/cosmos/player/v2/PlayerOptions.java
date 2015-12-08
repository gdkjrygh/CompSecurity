// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

public class PlayerOptions
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerOptions createFromParcel(Parcel parcel)
        {
            return new PlayerOptions(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerOptions[] newArray(int i)
        {
            return new PlayerOptions[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final boolean mRepeatingContext;
    private final boolean mRepeatingTrack;
    private final boolean mShufflingContext;

    protected PlayerOptions(Parcel parcel)
    {
        mShufflingContext = gen.a(parcel);
        mRepeatingContext = gen.a(parcel);
        mRepeatingTrack = gen.a(parcel);
    }

    public PlayerOptions(boolean flag, boolean flag1, boolean flag2)
    {
        mShufflingContext = flag;
        mRepeatingContext = flag1;
        mRepeatingTrack = flag2;
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
            obj = (PlayerOptions)obj;
            if (mRepeatingContext != ((PlayerOptions) (obj)).mRepeatingContext)
            {
                return false;
            }
            if (mRepeatingTrack != ((PlayerOptions) (obj)).mRepeatingTrack)
            {
                return false;
            }
            if (mShufflingContext != ((PlayerOptions) (obj)).mShufflingContext)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 1;
        int i;
        int j;
        if (mShufflingContext)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mRepeatingContext)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!mRepeatingTrack)
        {
            k = 0;
        }
        return (j + i * 31) * 31 + k;
    }

    public boolean repeatingContext()
    {
        return mRepeatingContext;
    }

    public boolean repeatingTrack()
    {
        return mRepeatingTrack;
    }

    public boolean shufflingContext()
    {
        return mShufflingContext;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mShufflingContext);
        gen.a(parcel, mRepeatingContext);
        gen.a(parcel, mRepeatingTrack);
    }

}
