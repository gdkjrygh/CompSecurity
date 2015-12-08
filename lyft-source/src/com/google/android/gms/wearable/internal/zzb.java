// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddListenerRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(AddListenerRequest addlistenerrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, addlistenerrequest.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, addlistenerrequest.a(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, addlistenerrequest.c, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, addlistenerrequest.d, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, addlistenerrequest.e, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public AddListenerRequest a(Parcel parcel)
    {
        String s = null;
        int j = zza.b(parcel);
        int i = 0;
        String s1 = null;
        IntentFilter aintentfilter[] = null;
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

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])zza.b(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = zza.m(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AddListenerRequest(i, ibinder, aintentfilter, s1, s);
            }
        } while (true);
    }

    public AddListenerRequest[] a(int i)
    {
        return new AddListenerRequest[i];
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
