// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            RemoveListenerRequest

public class zzbc
    implements android.os.Parcelable.Creator
{

    public zzbc()
    {
    }

    static void a(RemoveListenerRequest removelistenerrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, removelistenerrequest.a);
        zzb.a(parcel, 2, removelistenerrequest.a(), false);
        zzb.a(parcel, i);
    }

    public RemoveListenerRequest a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = zza.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new RemoveListenerRequest(i, ibinder);
            }
        } while (true);
    }

    public RemoveListenerRequest[] a(int i)
    {
        return new RemoveListenerRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
