// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.k;

// Referenced classes of package com.google.android.gms.fitness.request:
//            r

public class q
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    private final int BR;
    private final k UA;
    private final PendingIntent mPendingIntent;

    q(int i, IBinder ibinder, PendingIntent pendingintent)
    {
        BR = i;
        if (ibinder == null)
        {
            ibinder = null;
        } else
        {
            ibinder = com.google.android.gms.fitness.data.k.a.an(ibinder);
        }
        UA = ibinder;
        mPendingIntent = pendingintent;
    }

    public q(k k1, PendingIntent pendingintent)
    {
        BR = 2;
        UA = k1;
        mPendingIntent = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    public PendingIntent jr()
    {
        return mPendingIntent;
    }

    IBinder jw()
    {
        if (UA == null)
        {
            return null;
        } else
        {
            return UA.asBinder();
        }
    }

    public String toString()
    {
        return String.format("SensorUnregistrationRequest{%s}", new Object[] {
            UA
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel, i);
    }

}
