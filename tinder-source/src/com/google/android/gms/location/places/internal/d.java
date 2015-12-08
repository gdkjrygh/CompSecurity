// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(PlaceLocalization placelocalization, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, placelocalization.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placelocalization.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placelocalization.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placelocalization.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, placelocalization.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, placelocalization.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = zza.l(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = zza.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceLocalization(i, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceLocalization[i];
    }
}
