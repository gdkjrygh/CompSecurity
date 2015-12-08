// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class CallPagerAdapterState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final CallPagerAdapterState createFromParcel(Parcel parcel)
        {
            return new CallPagerAdapterState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CallPagerAdapterState[] newArray(int i)
        {
            return new CallPagerAdapterState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private List tags;

    public CallPagerAdapterState(Parcel parcel)
    {
        tags = new ArrayList();
        parcel.readStringList(tags);
    }

    public CallPagerAdapterState(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("tags can't be null");
        }
        tags = new ArrayList();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            tags.add(s);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public String[] getTags()
    {
        return (String[])tags.toArray(new String[tags.size()]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringList(tags);
    }

}
