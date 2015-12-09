// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bfh
    implements android.os.Parcelable.Creator
{

    public bfh()
    {
    }

    public static void a(SearchAdRequestParcel searchadrequestparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, searchadrequestparcel.a);
        brp.b(parcel, 2, searchadrequestparcel.b);
        brp.b(parcel, 3, searchadrequestparcel.c);
        brp.b(parcel, 4, searchadrequestparcel.d);
        brp.b(parcel, 5, searchadrequestparcel.e);
        brp.b(parcel, 6, searchadrequestparcel.f);
        brp.b(parcel, 7, searchadrequestparcel.g);
        brp.b(parcel, 8, searchadrequestparcel.h);
        brp.b(parcel, 9, searchadrequestparcel.i);
        brp.a(parcel, 10, searchadrequestparcel.j);
        brp.b(parcel, 11, searchadrequestparcel.k);
        brp.a(parcel, 12, searchadrequestparcel.l);
        brp.b(parcel, 13, searchadrequestparcel.m);
        brp.b(parcel, 14, searchadrequestparcel.n);
        brp.a(parcel, 15, searchadrequestparcel.o);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i3 = zza.a(parcel);
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
                    zza.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = zza.e(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = zza.e(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = zza.e(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = zza.e(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = zza.e(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = zza.e(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = zza.e(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = zza.e(parcel, j3);
                    break;

                case 9: // '\t'
                    l = zza.e(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = zza.h(parcel, j3);
                    break;

                case 11: // '\013'
                    k = zza.e(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = zza.h(parcel, j3);
                    break;

                case 13: // '\r'
                    j = zza.e(parcel, j3);
                    break;

                case 14: // '\016'
                    i = zza.e(parcel, j3);
                    break;

                case 15: // '\017'
                    s = zza.h(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
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
