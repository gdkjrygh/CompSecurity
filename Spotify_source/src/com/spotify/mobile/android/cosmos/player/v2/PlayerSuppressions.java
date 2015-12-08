// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;
import java.util.Collections;
import java.util.Set;

public class PlayerSuppressions
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final PlayerSuppressions createFromParcel(Parcel parcel)
        {
            return new PlayerSuppressions(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlayerSuppressions[] newArray(int i)
        {
            return new PlayerSuppressions[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final Set mProviders;

    protected PlayerSuppressions(Parcel parcel)
    {
        mProviders = gen.b(parcel);
    }

    public PlayerSuppressions(Set set)
    {
        if (set.isEmpty())
        {
            mProviders = Collections.unmodifiableSet(Collections.emptySet());
            return;
        } else
        {
            mProviders = Collections.unmodifiableSet(set);
            return;
        }
    }

    public static PlayerSuppressions empty()
    {
        return new PlayerSuppressions(Collections.emptySet());
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
            obj = (PlayerSuppressions)obj;
            if (!mProviders.equals(((PlayerSuppressions) (obj)).mProviders))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return mProviders.hashCode();
    }

    public Set providers()
    {
        return mProviders;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, mProviders);
    }

}
