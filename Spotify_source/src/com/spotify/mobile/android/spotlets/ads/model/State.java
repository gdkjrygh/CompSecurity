// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            AdBreakState

public class State
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new State(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new State[i];
        }

    };
    private final AdBreakState mAdBreakState;
    private final String mAdSlotId;
    private final boolean mAdsEnabled;

    private State(Parcel parcel)
    {
        mAdsEnabled = gen.a(parcel);
        mAdBreakState = AdBreakState.getByName(parcel.readString());
        mAdSlotId = parcel.readString();
    }


    public State(boolean flag, AdBreakState adbreakstate, String s)
    {
        mAdsEnabled = flag;
        mAdBreakState = adbreakstate;
        mAdSlotId = s;
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
            obj = (State)obj;
            if (mAdsEnabled != ((State) (obj)).mAdsEnabled)
            {
                return false;
            }
            if (mAdBreakState != ((State) (obj)).mAdBreakState)
            {
                return false;
            }
            if (mAdSlotId == null ? ((State) (obj)).mAdSlotId != null : !mAdSlotId.equals(((State) (obj)).mAdSlotId))
            {
                return false;
            }
        }
        return true;
    }

    public AdBreakState getAdBreakState()
    {
        return mAdBreakState;
    }

    public String getAdSlotId()
    {
        return mAdSlotId;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        if (mAdSlotId != null)
        {
            i = mAdSlotId.hashCode();
        } else
        {
            i = 0;
        }
        k = mAdBreakState.hashCode();
        if (mAdsEnabled)
        {
            j = 1;
        }
        return (i * 31 + k) * 31 + j;
    }

    public boolean isAdsEnabled()
    {
        return mAdsEnabled;
    }

    public String toString()
    {
        return (new StringBuilder("State{mAdsEnabled=")).append(mAdsEnabled).append(", mAdBreakState=").append(mAdBreakState).append(", mAdSlotId=").append(mAdSlotId).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mAdsEnabled);
        parcel.writeString(mAdBreakState.getName());
        parcel.writeString(mAdSlotId);
    }

}
