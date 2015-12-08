// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void a(ParcelableGeofence parcelablegeofence, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, parcelablegeofence.a(), false);
        zzb.a(parcel, 1000, parcelablegeofence.b());
        zzb.a(parcel, 2, parcelablegeofence.g());
        zzb.a(parcel, 3, parcelablegeofence.c());
        zzb.a(parcel, 4, parcelablegeofence.d());
        zzb.a(parcel, 5, parcelablegeofence.e());
        zzb.a(parcel, 6, parcelablegeofence.f());
        zzb.a(parcel, 7, parcelablegeofence.h());
        zzb.a(parcel, 8, parcelablegeofence.i());
        zzb.a(parcel, 9, parcelablegeofence.j());
        zzb.a(parcel, i);
    }

    public ParcelableGeofence a(Parcel parcel)
    {
        int i1 = zza.b(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.a(parcel);
                switch (zza.a(j1))
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = zza.m(parcel, j1);
                    break;

                case 1000: 
                    l = zza.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = zza.h(parcel, j1);
                    break;

                case 3: // '\003'
                    word0 = zza.e(parcel, j1);
                    break;

                case 4: // '\004'
                    d1 = zza.k(parcel, j1);
                    break;

                case 5: // '\005'
                    d = zza.k(parcel, j1);
                    break;

                case 6: // '\006'
                    f = zza.j(parcel, j1);
                    break;

                case 7: // '\007'
                    k = zza.f(parcel, j1);
                    break;

                case 8: // '\b'
                    j = zza.f(parcel, j1);
                    break;

                case 9: // '\t'
                    i = zza.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public ParcelableGeofence[] a(int i)
    {
        return new ParcelableGeofence[i];
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
