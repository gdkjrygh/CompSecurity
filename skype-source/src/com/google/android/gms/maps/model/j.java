// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, MarkerOptions

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    public static MarkerOptions a(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    f5 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 8: // '\b'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 10: // '\n'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 11: // '\013'
                    f3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 12: // '\f'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 13: // '\r'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 14: // '\016'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, markeroptions.a());
        b.a(parcel, 2, markeroptions.c(), i);
        b.a(parcel, 3, markeroptions.d());
        b.a(parcel, 4, markeroptions.e());
        b.a(parcel, 5, markeroptions.b());
        b.a(parcel, 6, markeroptions.f());
        b.a(parcel, 7, markeroptions.g());
        b.a(parcel, 8, markeroptions.h());
        b.a(parcel, 9, markeroptions.i());
        b.a(parcel, 10, markeroptions.j());
        b.a(parcel, 11, markeroptions.k());
        b.a(parcel, 12, markeroptions.l());
        b.a(parcel, 13, markeroptions.m());
        b.a(parcel, 14, markeroptions.n());
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new MarkerOptions[i];
    }
}
