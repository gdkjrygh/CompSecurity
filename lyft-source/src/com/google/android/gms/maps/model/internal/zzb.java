// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            CameraUpdateParcelable

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(CameraUpdateParcelable cameraupdateparcelable, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, cameraupdateparcelable.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, cameraupdateparcelable.b());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, cameraupdateparcelable.c(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public CameraUpdateParcelable a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    bundle = zza.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CameraUpdateParcelable(i, j, bundle);
            }
        } while (true);
    }

    public CameraUpdateParcelable[] a(int i)
    {
        return new CameraUpdateParcelable[i];
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
