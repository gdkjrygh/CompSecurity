// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package com.tinder.model:
//            Photo

public class InstagramPhoto extends Photo
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final InstagramPhoto createFromParcel(Parcel parcel)
        {
            return new InstagramPhoto(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final InstagramPhoto[] newArray(int i)
        {
            return new InstagramPhoto[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String mLink;
    public long mTimestamp;
    public String mUrlLarge;
    public String mUrlSmall;

    public InstagramPhoto()
    {
    }

    protected InstagramPhoto(Parcel parcel)
    {
        mTimestamp = parcel.readLong();
        mLink = parcel.readString();
        mUrlLarge = parcel.readString();
        mUrlSmall = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(mTimestamp);
        parcel.writeString(mLink);
        parcel.writeString(mUrlLarge);
        parcel.writeString(mUrlSmall);
    }

}
