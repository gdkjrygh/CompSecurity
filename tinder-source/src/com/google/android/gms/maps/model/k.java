// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions, LatLng

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(PolylineOptions polylineoptions, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, polylineoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 2, polylineoptions.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, polylineoptions.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, polylineoptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, polylineoptions.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, polylineoptions.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, polylineoptions.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = zza.i(parcel, i1);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    f = zza.i(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PolylineOptions[i];
    }
}
