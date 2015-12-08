// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ih;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            CommonWalletObject, p, l, d, 
//            j, n

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(CommonWalletObject commonwalletobject, Parcel parcel, int i)
    {
        int k = b.C(parcel);
        b.c(parcel, 1, commonwalletobject.getVersionCode());
        b.a(parcel, 2, commonwalletobject.eC, false);
        b.a(parcel, 3, commonwalletobject.ajn, false);
        b.a(parcel, 4, commonwalletobject.name, false);
        b.a(parcel, 5, commonwalletobject.ajg, false);
        b.a(parcel, 6, commonwalletobject.ajj, false);
        b.a(parcel, 7, commonwalletobject.ajk, false);
        b.a(parcel, 8, commonwalletobject.ajl, false);
        b.a(parcel, 9, commonwalletobject.ajm, false);
        b.c(parcel, 10, commonwalletobject.state);
        b.b(parcel, 11, commonwalletobject.ajo, false);
        b.a(parcel, 12, commonwalletobject.ajp, i, false);
        b.b(parcel, 13, commonwalletobject.ajq, false);
        b.a(parcel, 14, commonwalletobject.ajr, false);
        b.a(parcel, 15, commonwalletobject.ajs, false);
        b.a(parcel, 17, commonwalletobject.aju);
        b.b(parcel, 16, commonwalletobject.ajt, false);
        b.b(parcel, 19, commonwalletobject.ajw, false);
        b.b(parcel, 18, commonwalletobject.ajv, false);
        b.b(parcel, 20, commonwalletobject.ajx, false);
        b.G(parcel, k);
    }

    public CommonWalletObject cj(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int k = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        int i = 0;
        java.util.ArrayList arraylist5 = ih.fV();
        l l1 = null;
        java.util.ArrayList arraylist4 = ih.fV();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = ih.fV();
        boolean flag = false;
        java.util.ArrayList arraylist2 = ih.fV();
        java.util.ArrayList arraylist1 = ih.fV();
        java.util.ArrayList arraylist = ih.fV();
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 7: // '\007'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 11: // '\013'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, p.CREATOR);
                    break;

                case 12: // '\f'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, l.CREATOR);
                    break;

                case 13: // '\r'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                    break;

                case 14: // '\016'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 16: // '\020'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, d.CREATOR);
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, j.CREATOR);
                    break;

                case 18: // '\022'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new CommonWalletObject(k, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, l1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cj(parcel);
    }

    public CommonWalletObject[] dR(int i)
    {
        return new CommonWalletObject[i];
    }

    public Object[] newArray(int i)
    {
        return dR(i);
    }
}
