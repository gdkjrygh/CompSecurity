// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public class LocationRequestCreator
    implements android.os.Parcelable.Creator
{

    public LocationRequestCreator()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, locationrequest.a);
        zzb.a(parcel, 1000, locationrequest.b());
        zzb.a(parcel, 2, locationrequest.b);
        zzb.a(parcel, 3, locationrequest.c);
        zzb.a(parcel, 4, locationrequest.d);
        zzb.a(parcel, 5, locationrequest.e);
        zzb.a(parcel, 6, locationrequest.f);
        zzb.a(parcel, 7, locationrequest.g);
        zzb.a(parcel, 8, locationrequest.h);
        zzb.a(parcel, i);
    }

    public LocationRequest a(Parcel parcel)
    {
        int l = zza.b(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, i1);
                    break;

                case 1000: 
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = zza.h(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = zza.h(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = zza.h(parcel, i1);
                    break;

                case 6: // '\006'
                    i = zza.f(parcel, i1);
                    break;

                case 7: // '\007'
                    f = zza.j(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = zza.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public LocationRequest[] a(int i)
    {
        return new LocationRequest[i];
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
