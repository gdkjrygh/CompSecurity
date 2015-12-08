// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceReport

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(PlaceReport placereport, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, placereport.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placereport.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placereport.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, placereport.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = zza.a(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceReport(i, s, s1, s2);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceReport[i];
    }
}
