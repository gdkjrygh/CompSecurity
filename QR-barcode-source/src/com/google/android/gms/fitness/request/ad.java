// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ae, l, BleScanCallback

public class ad
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    private final int BR;
    private final l UQ;

    ad(int i, IBinder ibinder)
    {
        BR = i;
        UQ = l.a.ay(ibinder);
    }

    public ad(BleScanCallback blescancallback)
    {
        BR = 1;
        UQ = a.a.je().b(blescancallback);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    public IBinder jC()
    {
        return UQ.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ae.a(this, parcel, i);
    }

}
