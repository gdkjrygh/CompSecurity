// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;

public final class jod
    implements android.os.Parcelable.Creator
{

    public jod()
    {
    }

    public static AdRequestParcel a(Parcel parcel)
    {
        int l = b.b(parcel);
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
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = b.f(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle2 = b.k(parcel, i1);
                    break;

                case 4: // '\004'
                    j = b.e(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist1 = b.p(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = b.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = b.e(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = b.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s3 = b.i(parcel, i1);
                    break;

                case 10: // '\n'
                    searchadrequestparcel = (SearchAdRequestParcel)b.a(parcel, i1, SearchAdRequestParcel.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)b.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s2 = b.i(parcel, i1);
                    break;

                case 13: // '\r'
                    bundle1 = b.k(parcel, i1);
                    break;

                case 14: // '\016'
                    bundle = b.k(parcel, i1);
                    break;

                case 15: // '\017'
                    arraylist = b.p(parcel, i1);
                    break;

                case 17: // '\021'
                    s = b.i(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = b.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AdRequestParcel(k, l1, bundle2, j, arraylist1, flag1, i, flag, s3, searchadrequestparcel, location, s2, bundle1, bundle, arraylist, s1, s);
            }
        } while (true);
    }

    public static void a(AdRequestParcel adrequestparcel, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, adrequestparcel.a);
        b.a(parcel, 2, adrequestparcel.b);
        b.a(parcel, 3, adrequestparcel.c, false);
        b.c(parcel, 4, adrequestparcel.d);
        b.b(parcel, 5, adrequestparcel.e, false);
        b.a(parcel, 6, adrequestparcel.f);
        b.c(parcel, 7, adrequestparcel.g);
        b.a(parcel, 8, adrequestparcel.h);
        b.a(parcel, 9, adrequestparcel.i, false);
        b.a(parcel, 10, adrequestparcel.j, i, false);
        b.a(parcel, 11, adrequestparcel.k, i, false);
        b.a(parcel, 12, adrequestparcel.l, false);
        b.a(parcel, 13, adrequestparcel.m, false);
        b.a(parcel, 14, adrequestparcel.n, false);
        b.b(parcel, 15, adrequestparcel.o, false);
        b.a(parcel, 17, adrequestparcel.q, false);
        b.a(parcel, 16, adrequestparcel.p, false);
        b.r(parcel, j);
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
