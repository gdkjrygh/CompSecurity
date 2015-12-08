// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;

public final class job
    implements android.os.Parcelable.Creator
{

    public job()
    {
    }

    public static void a(SearchAdRequestParcel searchadrequestparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, searchadrequestparcel.a);
        b.c(parcel, 2, searchadrequestparcel.b);
        b.c(parcel, 3, searchadrequestparcel.c);
        b.c(parcel, 4, searchadrequestparcel.d);
        b.c(parcel, 5, searchadrequestparcel.e);
        b.c(parcel, 6, searchadrequestparcel.f);
        b.c(parcel, 7, searchadrequestparcel.g);
        b.c(parcel, 8, searchadrequestparcel.h);
        b.c(parcel, 9, searchadrequestparcel.i);
        b.a(parcel, 10, searchadrequestparcel.j, false);
        b.c(parcel, 11, searchadrequestparcel.k);
        b.a(parcel, 12, searchadrequestparcel.l, false);
        b.c(parcel, 13, searchadrequestparcel.m);
        b.c(parcel, 14, searchadrequestparcel.n);
        b.a(parcel, 15, searchadrequestparcel.o, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i3 = b.b(parcel);
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s2 = null;
        int k = 0;
        String s1 = null;
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i3)
            {
                int j3 = parcel.readInt();
                switch (0xffff & j3)
                {
                default:
                    b.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = b.e(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = b.e(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = b.e(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = b.e(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = b.e(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = b.e(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = b.e(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = b.e(parcel, j3);
                    break;

                case 9: // '\t'
                    l = b.e(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = b.i(parcel, j3);
                    break;

                case 11: // '\013'
                    k = b.e(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = b.i(parcel, j3);
                    break;

                case 13: // '\r'
                    j = b.e(parcel, j3);
                    break;

                case 14: // '\016'
                    i = b.e(parcel, j3);
                    break;

                case 15: // '\017'
                    s = b.i(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
            } else
            {
                return new SearchAdRequestParcel(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SearchAdRequestParcel[i];
    }
}
