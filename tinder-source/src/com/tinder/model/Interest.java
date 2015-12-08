// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Interest
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Interest createFromParcel(Parcel parcel)
        {
            return new Interest(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Interest[] newArray(int i)
        {
            return new Interest[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String id;
    public String name;

    protected Interest(Parcel parcel)
    {
        id = parcel.readString();
        name = parcel.readString();
    }

    public Interest(String s, String s1)
    {
        id = s;
        name = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(name);
    }

}
