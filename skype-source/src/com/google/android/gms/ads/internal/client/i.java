// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            SearchAdRequestParcel, AdRequestParcel

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static AdRequestParcel a(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        long l1 = 0L;
        android.os.Bundle bundle2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
        int j = 0;
        boolean flag = false;
        String s3 = null;
        SearchAdRequestParcel searchadrequestparcel = null;
        Location location = null;
        String s2 = null;
        android.os.Bundle bundle1 = null;
        android.os.Bundle bundle = null;
        java.util.ArrayList arraylist = null;
        String s1 = null;
        String s = null;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 10: // '\n'
                    searchadrequestparcel = (SearchAdRequestParcel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, SearchAdRequestParcel.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 13: // '\r'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 14: // '\016'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 15: // '\017'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AdRequestParcel(l, l1, bundle2, k, arraylist1, flag1, j, flag, s3, searchadrequestparcel, location, s2, bundle1, bundle, arraylist, s1, s);
            }
        } while (true);
    }

    static void a(AdRequestParcel adrequestparcel, Parcel parcel, int j)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, adrequestparcel.a);
        b.a(parcel, 2, adrequestparcel.b);
        b.a(parcel, 3, adrequestparcel.c);
        b.a(parcel, 4, adrequestparcel.d);
        b.b(parcel, 5, adrequestparcel.e);
        b.a(parcel, 6, adrequestparcel.f);
        b.a(parcel, 7, adrequestparcel.g);
        b.a(parcel, 8, adrequestparcel.h);
        b.a(parcel, 9, adrequestparcel.i);
        b.a(parcel, 10, adrequestparcel.j, j);
        b.a(parcel, 11, adrequestparcel.k, j);
        b.a(parcel, 12, adrequestparcel.l);
        b.a(parcel, 13, adrequestparcel.m);
        b.a(parcel, 14, adrequestparcel.n);
        b.b(parcel, 15, adrequestparcel.o);
        b.a(parcel, 17, adrequestparcel.q);
        b.a(parcel, 16, adrequestparcel.p);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new AdRequestParcel[j];
    }
}
