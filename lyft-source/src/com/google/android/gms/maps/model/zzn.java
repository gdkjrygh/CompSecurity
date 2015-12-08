// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, tileoverlayoptions.a());
        zzb.a(parcel, 2, tileoverlayoptions.b(), false);
        zzb.a(parcel, 3, tileoverlayoptions.d());
        zzb.a(parcel, 4, tileoverlayoptions.c());
        zzb.a(parcel, 5, tileoverlayoptions.e());
        zzb.a(parcel, i);
    }

    public TileOverlayOptions a(Parcel parcel)
    {
        boolean flag1 = false;
        int j = zza.b(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
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
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = zza.j(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public TileOverlayOptions[] a(int i)
    {
        return new TileOverlayOptions[i];
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
