// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class SectionBackground
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SectionBackground(parcel.readInt(), parcel.readInt());
        }

        public final volatile Object[] newArray(int i)
        {
            return new SectionBackground[i];
        }

    };
    private static final String KEY_COUNT = "count";
    private static final String KEY_START = "start";
    private final int mCount;
    private final int mStart;

    SectionBackground(int i, int j)
    {
        mStart = i;
        mCount = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCount()
    {
        return mCount;
    }

    public int getStart()
    {
        return mStart;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mStart);
        parcel.writeInt(mCount);
    }

}
