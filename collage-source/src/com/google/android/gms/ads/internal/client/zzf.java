// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdRequestParcel, SearchAdRequestParcel

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(AdRequestParcel adrequestparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adrequestparcel.versionCode);
        b.a(parcel, 2, adrequestparcel.zzsq);
        b.a(parcel, 3, adrequestparcel.extras, false);
        b.a(parcel, 4, adrequestparcel.zzsr);
        b.a(parcel, 5, adrequestparcel.zzss, false);
        b.a(parcel, 6, adrequestparcel.zzst);
        b.a(parcel, 7, adrequestparcel.zzsu);
        b.a(parcel, 8, adrequestparcel.zzsv);
        b.a(parcel, 9, adrequestparcel.zzsw, false);
        b.a(parcel, 10, adrequestparcel.zzsx, i, false);
        b.a(parcel, 11, adrequestparcel.zzsy, i, false);
        b.a(parcel, 12, adrequestparcel.zzsz, false);
        b.a(parcel, 13, adrequestparcel.zzsA, false);
        b.a(parcel, 14, adrequestparcel.zzsB, false);
        b.a(parcel, 15, adrequestparcel.zzsC, false);
        b.a(parcel, 17, adrequestparcel.zzsE, false);
        b.a(parcel, 16, adrequestparcel.zzsD, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzb(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzk(i);
    }

    public AdRequestParcel zzb(Parcel parcel)
    {
        int l = a.b(parcel);
        int k = 0;
        long l1 = 0L;
        android.os.Bundle bundle2 = null;
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
        int i = 0;
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
            if (parcel.dataPosition() < l)
            {
                int i1 = a.a(parcel);
                switch (a.a(i1))
                {
                default:
                    a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = a.e(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle2 = a.i(parcel, i1);
                    break;

                case 4: // '\004'
                    j = a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist1 = a.m(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = a.d(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s3 = a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    searchadrequestparcel = (SearchAdRequestParcel)a.a(parcel, i1, SearchAdRequestParcel.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)a.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s2 = a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    bundle1 = a.i(parcel, i1);
                    break;

                case 14: // '\016'
                    bundle = a.i(parcel, i1);
                    break;

                case 15: // '\017'
                    arraylist = a.m(parcel, i1);
                    break;

                case 17: // '\021'
                    s = a.g(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new AdRequestParcel(k, l1, bundle2, j, arraylist1, flag1, i, flag, s3, searchadrequestparcel, location, s2, bundle1, bundle, arraylist, s1, s);
            }
        } while (true);
    }

    public AdRequestParcel[] zzk(int i)
    {
        return new AdRequestParcel[i];
    }
}
