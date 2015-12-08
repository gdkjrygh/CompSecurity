// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class PendingCallback
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PendingCallback eY(Parcel parcel)
        {
            return new PendingCallback(parcel);
        }

        private static PendingCallback[] hg(int i)
        {
            return new PendingCallback[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return eY(parcel);
        }

        public final Object[] newArray(int i)
        {
            return hg(i);
        }

    };
    final IBinder Wn;

    public PendingCallback(Parcel parcel)
    {
        Wn = parcel.readStrongBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public final IBinder getIBinder()
    {
        return Wn;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(Wn);
    }

}
