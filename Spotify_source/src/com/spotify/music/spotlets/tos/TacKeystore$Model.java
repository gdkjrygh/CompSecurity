// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tos;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;

public class mExpirationTime
    implements Parcelable, JacksonModel
{

    public static final android.os. CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new TacKeystore.Model(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new TacKeystore.Model[i];
        }

    };
    private String mExpirationTime;

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
            obj = (mExpirationTime)obj;
            return TextUtils.equals(mExpirationTime, ((mExpirationTime) (obj)).mExpirationTime);
        }
    }

    public String getExpirationTime()
    {
        return mExpirationTime;
    }

    public Long getExpirationTimeAsLong()
    {
        if (TextUtils.isEmpty(mExpirationTime))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        long l = Long.parseLong(mExpirationTime);
        return Long.valueOf(l);
        NumberFormatException numberformatexception;
        numberformatexception;
        Assertion.a((new StringBuilder("Failed to convert ")).append(mExpirationTime).toString(), numberformatexception);
        return null;
    }

    public int hashCode()
    {
        if (mExpirationTime != null)
        {
            return mExpirationTime.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return (new StringBuilder("Model{mExpirationTime='")).append(mExpirationTime).append("'}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mExpirationTime);
    }


    public _cls1(Parcel parcel)
    {
        mExpirationTime = parcel.readString();
    }

    public mExpirationTime(String s)
    {
        mExpirationTime = s;
    }
}
