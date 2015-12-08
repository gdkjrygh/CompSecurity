// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            SearchAdRequestParcel

public class zzae
    implements android.os.Parcelable.Creator
{

    public zzae()
    {
    }

    static void zza(SearchAdRequestParcel searchadrequestparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, searchadrequestparcel.versionCode);
        b.a(parcel, 2, searchadrequestparcel.zztA);
        b.a(parcel, 3, searchadrequestparcel.backgroundColor);
        b.a(parcel, 4, searchadrequestparcel.zztB);
        b.a(parcel, 5, searchadrequestparcel.zztC);
        b.a(parcel, 6, searchadrequestparcel.zztD);
        b.a(parcel, 7, searchadrequestparcel.zztE);
        b.a(parcel, 8, searchadrequestparcel.zztF);
        b.a(parcel, 9, searchadrequestparcel.zztG);
        b.a(parcel, 10, searchadrequestparcel.zztH, false);
        b.a(parcel, 11, searchadrequestparcel.zztI);
        b.a(parcel, 12, searchadrequestparcel.zztJ, false);
        b.a(parcel, 13, searchadrequestparcel.zztK);
        b.a(parcel, 14, searchadrequestparcel.zztL);
        b.a(parcel, 15, searchadrequestparcel.zztM, false);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zze(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzo(i);
    }

    public SearchAdRequestParcel zze(Parcel parcel)
    {
        int i3 = a.b(parcel);
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
                int j3 = a.a(parcel);
                switch (a.a(j3))
                {
                default:
                    a.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = a.d(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = a.d(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = a.d(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = a.d(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = a.d(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = a.d(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = a.d(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = a.d(parcel, j3);
                    break;

                case 9: // '\t'
                    l = a.d(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = a.g(parcel, j3);
                    break;

                case 11: // '\013'
                    k = a.d(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = a.g(parcel, j3);
                    break;

                case 13: // '\r'
                    j = a.d(parcel, j3);
                    break;

                case 14: // '\016'
                    i = a.d(parcel, j3);
                    break;

                case 15: // '\017'
                    s = a.g(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i3).toString(), parcel);
            } else
            {
                return new SearchAdRequestParcel(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public SearchAdRequestParcel[] zzo(int i)
    {
        return new SearchAdRequestParcel[i];
    }
}
