// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            SearchAdRequestParcel

public class zzae
    implements android.os.Parcelable.Creator
{

    public zzae()
    {
    }

    static void a(SearchAdRequestParcel searchadrequestparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, searchadrequestparcel.versionCode);
        c.a(parcel, 2, searchadrequestparcel.zztP);
        c.a(parcel, 3, searchadrequestparcel.backgroundColor);
        c.a(parcel, 4, searchadrequestparcel.zztQ);
        c.a(parcel, 5, searchadrequestparcel.zztR);
        c.a(parcel, 6, searchadrequestparcel.zztS);
        c.a(parcel, 7, searchadrequestparcel.zztT);
        c.a(parcel, 8, searchadrequestparcel.zztU);
        c.a(parcel, 9, searchadrequestparcel.zztV);
        c.a(parcel, 10, searchadrequestparcel.zztW, false);
        c.a(parcel, 11, searchadrequestparcel.zztX);
        c.a(parcel, 12, searchadrequestparcel.zztY, false);
        c.a(parcel, 13, searchadrequestparcel.zztZ);
        c.a(parcel, 14, searchadrequestparcel.zzua);
        c.a(parcel, 15, searchadrequestparcel.zzub, false);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzn(i);
    }

    public SearchAdRequestParcel zzd(Parcel parcel)
    {
        int i3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j3);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j3);
                    break;

                case 13: // '\r'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
            } else
            {
                return new SearchAdRequestParcel(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public SearchAdRequestParcel[] zzn(int i)
    {
        return new SearchAdRequestParcel[i];
    }
}
