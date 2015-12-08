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
    private final int CK;
    private final k VW;
    private final PendingIntent mPendingIntent;

    q(int i, IBinder ibinder, PendingIntent pendingintent)
    {
        CK = i;
        if (ibinder == null)
        {
            ibinder = null;
        } else
        {
            ibinder = com.google.android.gms.fitness.data.k.a.aq(ibinder);
        }
        VW = ibinder;
        mPendingIntent = pendingintent;
    }

    public q(k k1, PendingIntent pendingintent)
    {
        CK = 2;
        VW = k1;
        mPendingIntent = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    public PendingIntent kb()
    {
        return mPendingIntent;
    }

    IBinder kg()
    {
        if (VW == null)
        {
            return null;
        } else
        {
            return VW.asBinder();
        }
    }

    public String toString()
    {
        return String.format("SensorUnregistrationRequest{%s}", new Object[] {
            VW
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel, i);
    }

}
