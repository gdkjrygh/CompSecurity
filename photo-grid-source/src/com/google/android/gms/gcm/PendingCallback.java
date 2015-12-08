// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gms.gcm:
//            d

public class PendingCallback
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final IBinder a;

    public PendingCallback(Parcel parcel)
    {
        a = parcel.readStrongBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(a);
    }

}
