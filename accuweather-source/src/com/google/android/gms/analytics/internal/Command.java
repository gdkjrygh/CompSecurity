// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class Command
    implements Parcelable
{

    public static final String APPEND_CACHE_BUSTER = "appendCacheBuster";
    public static final String APPEND_QUEUE_TIME = "appendQueueTime";
    public static final String APPEND_VERSION = "appendVersion";
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Command createFromParcel(Parcel parcel)
        {
            return new Command(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Command[] newArray(int i)
        {
            return new Command[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String id;
    private String urlParam;
    private String value;

    public Command()
    {
    }

    Command(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public Command(String s, String s1, String s2)
    {
        id = s;
        urlParam = s1;
        value = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        id = parcel.readString();
        urlParam = parcel.readString();
        value = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return id;
    }

    public String getUrlParam()
    {
        return urlParam;
    }

    public String getValue()
    {
        return value;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(urlParam);
        parcel.writeString(value);
    }

}
