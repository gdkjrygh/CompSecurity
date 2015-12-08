// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.internal:
//            hx, hz, ht

public final class jf
    implements android.os.Parcelable.Creator
{

    public jf()
    {
    }

    static void a(hx hx1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, hx1.a(), false);
        c.a(parcel, 2, hx1.k());
        c.a(parcel, 3, hx1.l(), i, false);
        c.a(parcel, 4, hx1.c(), i, false);
        c.a(parcel, 5, hx1.d());
        c.a(parcel, 6, hx1.e(), i, false);
        c.a(parcel, 7, hx1.m(), false);
        c.a(parcel, 8, hx1.f(), i, false);
        c.a(parcel, 9, hx1.g());
        c.a(parcel, 10, hx1.h());
        c.a(parcel, 11, hx1.i());
        c.a(parcel, 12, hx1.j());
        c.b(parcel, 13, hx1.b(), false);
        c.a(parcel, 1000, hx1.b);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        android.os.Bundle bundle = null;
        hz hz1 = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 3: // '\003'
                    hz1 = (hz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, com.google.android.gms.internal.hz.a);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.a);
                    break;

                case 5: // '\005'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLngBounds.a);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 10: // '\n'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 11: // '\013'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ht.bv);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new hx(j, s1, arraylist, bundle, hz1, latlng, f1, latlngbounds, s, uri, flag, f, i, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new hx[i];
    }
}
