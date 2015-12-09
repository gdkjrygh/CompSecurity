// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            zzc, PlaceFilter

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(zzc zzc1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzc1.b());
        c.a(parcel, 1000, zzc1.a());
        c.a(parcel, 2, zzc1.c());
        c.a(parcel, 3, zzc1.d(), i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = -1;
        PlaceFilter placefilter = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlaceFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzc(i, j, k, placefilter);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzc[i];
    }
}
