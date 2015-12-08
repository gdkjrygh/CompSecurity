// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelable

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, bitmapdescriptorparcelable.a());
        zzb.a(parcel, 2, bitmapdescriptorparcelable.b());
        zzb.a(parcel, 3, bitmapdescriptorparcelable.c(), false);
        zzb.a(parcel, 4, bitmapdescriptorparcelable.d(), i, false);
        zzb.a(parcel, j);
    }

    public BitmapDescriptorParcelable a(Parcel parcel)
    {
        Bitmap bitmap = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.d(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.o(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.zza.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public BitmapDescriptorParcelable[] a(int i)
    {
        return new BitmapDescriptorParcelable[i];
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
