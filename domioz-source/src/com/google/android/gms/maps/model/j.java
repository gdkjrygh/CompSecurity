// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, CircleOptions

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    public static CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int k = 0;
        float f1 = 0.0F;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new CircleOptions(l, latlng, d, f1, k, i, f, flag);
            }
        } while (true);
    }

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, circleoptions.a());
        c.a(parcel, 2, circleoptions.b(), i);
        c.a(parcel, 3, circleoptions.c());
        c.a(parcel, 4, circleoptions.d());
        c.a(parcel, 5, circleoptions.e());
        c.a(parcel, 6, circleoptions.f());
        c.a(parcel, 7, circleoptions.g());
        c.a(parcel, 8, circleoptions.h());
        c.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new CircleOptions[i];
    }
}
