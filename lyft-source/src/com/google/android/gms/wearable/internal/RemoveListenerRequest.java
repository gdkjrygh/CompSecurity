// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbc, zzas

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbc();
    final int a;
    public final zzas b;

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = zzas.zza.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public RemoveListenerRequest(zzas zzas1)
    {
        a = 1;
        b = zzas1;
    }

    IBinder a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbc.a(this, parcel, i);
    }

}
