// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions, a, LatLng

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, markeroptions.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, markeroptions.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, markeroptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, markeroptions.d);
        android.os.IBinder ibinder;
        if (markeroptions.e == null)
        {
            ibinder = null;
        } else
        {
            ibinder = markeroptions.e.a.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, ibinder);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, markeroptions.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, markeroptions.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, markeroptions.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, markeroptions.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, markeroptions.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, markeroptions.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, markeroptions.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, markeroptions.m);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 14, markeroptions.n);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = zza.m(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = zza.i(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = zza.i(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = zza.c(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = zza.c(parcel, k);
                    break;

                case 10: // '\n'
                    flag = zza.c(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = zza.i(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = zza.i(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = zza.i(parcel, k);
                    break;

                case 14: // '\016'
                    f = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MarkerOptions[i];
    }
}
