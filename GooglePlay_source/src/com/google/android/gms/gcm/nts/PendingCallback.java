// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm.nts;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class PendingCallback
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new PendingCallback(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PendingCallback[i];
        }

    };
    final IBinder mBinder;

    public PendingCallback(Parcel parcel)
    {
        mBinder = parcel.readStrongBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(mBinder);
    }

}
