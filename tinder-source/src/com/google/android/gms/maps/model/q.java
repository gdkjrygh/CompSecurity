// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, tileoverlayoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, tileoverlayoptions.b.asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, tileoverlayoptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, tileoverlayoptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, tileoverlayoptions.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int j = zza.a(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = zza.i(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TileOverlayOptions[i];
    }
}
