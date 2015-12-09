// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bfn
    implements android.os.Parcelable.Creator
{

    public bfn()
    {
    }

    public static AdRequestParcel a(Parcel parcel)
    {
        int l = zza.a(parcel);
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
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle2 = zza.j(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist1 = zza.l(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = zza.e(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = zza.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s3 = zza.h(parcel, i1);
                    break;

                case 10: // '\n'
                    searchadrequestparcel = (SearchAdRequestParcel)zza.a(parcel, i1, SearchAdRequestParcel.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)zza.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s2 = zza.h(parcel, i1);
                    break;

                case 13: // '\r'
                    bundle1 = zza.j(parcel, i1);
                    break;

                case 14: // '\016'
                    bundle = zza.j(parcel, i1);
                    break;

                case 15: // '\017'
                    arraylist = zza.l(parcel, i1);
                    break;

                case 17: // '\021'
                    s = zza.h(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = zza.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AdRequestParcel(k, l1, bundle2, j, arraylist1, flag1, i, flag, s3, searchadrequestparcel, location, s2, bundle1, bundle, arraylist, s1, s);
            }
        } while (true);
    }

    public static void a(AdRequestParcel adrequestparcel, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, adrequestparcel.a);
        brp.a(parcel, 2, adrequestparcel.b);
        brp.a(parcel, 3, adrequestparcel.c);
        brp.b(parcel, 4, adrequestparcel.d);
        brp.a(parcel, 5, adrequestparcel.e);
        brp.a(parcel, 6, adrequestparcel.f);
        brp.b(parcel, 7, adrequestparcel.g);
        brp.a(parcel, 8, adrequestparcel.h);
        brp.a(parcel, 9, adrequestparcel.i);
        brp.a(parcel, 10, adrequestparcel.j, i);
        brp.a(parcel, 11, adrequestparcel.k, i);
        brp.a(parcel, 12, adrequestparcel.l);
        brp.a(parcel, 13, adrequestparcel.m);
        brp.a(parcel, 14, adrequestparcel.n);
        brp.a(parcel, 15, adrequestparcel.o);
        brp.a(parcel, 17, adrequestparcel.q);
        brp.a(parcel, 16, adrequestparcel.p);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AdRequestParcel[i];
    }
}
