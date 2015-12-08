// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng, MarkerOptions, a

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static MarkerOptions a(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
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
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    s = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, l);
                    break;

                case 6: // '\006'
                    f5 = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 8: // '\b'
                    flag2 = com.google.android.m4b.maps.k.a.c(parcel, l);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, l);
                    break;

                case 10: // '\n'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, l);
                    break;

                case 11: // '\013'
                    f3 = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 12: // '\f'
                    f2 = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 13: // '\r'
                    f1 = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 14: // '\016'
                    f = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, markeroptions.a);
        b.a(parcel, 2, markeroptions.b, i);
        b.a(parcel, 3, markeroptions.c);
        b.a(parcel, 4, markeroptions.d);
        android.os.IBinder ibinder;
        if (markeroptions.e == null)
        {
            ibinder = null;
        } else
        {
            ibinder = markeroptions.e.a.asBinder();
        }
        b.a(parcel, 5, ibinder);
        b.a(parcel, 6, markeroptions.f);
        b.a(parcel, 7, markeroptions.g);
        b.a(parcel, 8, markeroptions.h);
        b.a(parcel, 9, markeroptions.i);
        b.a(parcel, 10, markeroptions.j);
        b.a(parcel, 11, markeroptions.k);
        b.a(parcel, 12, markeroptions.l);
        b.a(parcel, 13, markeroptions.m);
        b.a(parcel, 14, markeroptions.n);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MarkerOptions[i];
    }
}
