// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class Task
    implements Parcelable
{

    private final String adB = null;
    private final boolean adC = false;
    private final boolean adD = false;
    private final String mTag = null;

    Task()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public String getServiceName()
    {
        return adB;
    }

    public String getTag()
    {
        return mTag;
    }

    public boolean isPersisted()
    {
        return adD;
    }

    public boolean isUpdateCurrent()
    {
        return adC;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(adB);
        parcel.writeString(mTag);
        if (adC)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (adD)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
