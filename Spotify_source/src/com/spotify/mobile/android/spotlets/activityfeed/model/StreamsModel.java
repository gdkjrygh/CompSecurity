// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed.model:
//            UserModel

public class StreamsModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new StreamsModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new StreamsModel[i];
        }

    };
    private int mCount;
    private boolean mIncludeRequestingUser;
    private UserModel mStreamers[];

    public StreamsModel(int i, boolean flag, UserModel ausermodel[])
    {
        mCount = i;
        mIncludeRequestingUser = flag;
        UserModel ausermodel1[] = ausermodel;
        if (ausermodel == null)
        {
            ausermodel1 = new UserModel[0];
        }
        mStreamers = ausermodel1;
    }

    private StreamsModel(Parcel parcel)
    {
        mCount = parcel.readInt();
        mIncludeRequestingUser = gen.a(parcel);
        mStreamers = new UserModel[parcel.readInt()];
        parcel.readTypedArray(mStreamers, UserModel.CREATOR);
    }


    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreamsModel))
            {
                return false;
            }
            obj = (StreamsModel)obj;
            if (mCount != ((StreamsModel) (obj)).mCount)
            {
                return false;
            }
            if (mIncludeRequestingUser != ((StreamsModel) (obj)).mIncludeRequestingUser)
            {
                return false;
            }
            if (!Arrays.equals(mStreamers, ((StreamsModel) (obj)).mStreamers))
            {
                return false;
            }
        }
        return true;
    }

    public int getCount()
    {
        int j = mCount;
        int i;
        if (getIncludeRequestingUser())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public boolean getIncludeRequestingUser()
    {
        return mIncludeRequestingUser;
    }

    public UserModel[] getStreamers()
    {
        return mStreamers;
    }

    public int hashCode()
    {
        int j = mCount;
        int i;
        if (mIncludeRequestingUser)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (i + j * 31) * 31 + Arrays.hashCode(mStreamers);
    }

    public int listCount()
    {
        int j = mStreamers.length;
        int i;
        if (getIncludeRequestingUser())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public void setIncludeRequestingUser(boolean flag)
    {
        mIncludeRequestingUser = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mCount);
        gen.a(parcel, mIncludeRequestingUser);
        parcel.writeInt(mStreamers.length);
        parcel.writeTypedArray(mStreamers, 0);
    }

}
