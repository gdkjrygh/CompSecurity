// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zza, zze

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    public static zze a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        zza zza1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    zza1 = (zza)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, zza.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zze(i, zza1);
            }
        } while (true);
    }

    static void a(zze zze1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zze1.a());
        c.a(parcel, 2, zze1.b(), i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zze[i];
    }
}
