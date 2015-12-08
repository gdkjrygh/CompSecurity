// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, streetviewpanoramacamera.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, streetviewpanoramacamera.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, streetviewpanoramacamera.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, streetviewpanoramacamera.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = zza.a(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    f = zza.i(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = zza.i(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }
}
