// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            State

public class AdState
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AdState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AdState[i];
        }

    };
    private final State mAdState;

    private AdState(Parcel parcel)
    {
        mAdState = (State)parcel.readParcelable(getClass().getClassLoader());
    }


    public AdState(State state)
    {
        mAdState = state;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (AdState)obj;
            return mAdState.equals(((AdState) (obj)).mAdState);
        }
    }

    public State getState()
    {
        return mAdState;
    }

    public int hashCode()
    {
        return mAdState.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("AdState{mAdState=")).append(mAdState.toString()).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mAdState, 0);
    }

}
