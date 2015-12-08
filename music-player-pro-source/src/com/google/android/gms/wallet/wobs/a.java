// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.la;
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
        int k = b.H(parcel);
        b.c(parcel, 1, commonwalletobject.getVersionCode());
        b.a(parcel, 2, commonwalletobject.fl, false);
        b.a(parcel, 3, commonwalletobject.avk, false);
        b.a(parcel, 4, commonwalletobject.name, false);
        b.a(parcel, 5, commonwalletobject.ave, false);
        b.a(parcel, 6, commonwalletobject.avg, false);
        b.a(parcel, 7, commonwalletobject.avh, false);
        b.a(parcel, 8, commonwalletobject.avi, false);
        b.a(parcel, 9, commonwalletobject.avj, false);
        b.c(parcel, 10, commonwalletobject.state);
        b.c(parcel, 11, commonwalletobject.avl, false);
        b.a(parcel, 12, commonwalletobject.avm, i, false);
        b.c(parcel, 13, commonwalletobject.avn, false);
        b.a(parcel, 14, commonwalletobject.avo, false);
        b.a(parcel, 15, commonwalletobject.avp, false);
        b.a(parcel, 17, commonwalletobject.avr);
        b.c(parcel, 16, commonwalletobject.avq, false);
        b.c(parcel, 19, commonwalletobject.avt, false);
        b.c(parcel, 18, commonwalletobject.avs, false);
        b.c(parcel, 20, commonwalletobject.avu, false);
        b.H(parcel, k);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ec(parcel);
    }

    public CommonWalletObject ec(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
        java.util.ArrayList arraylist5 = la.ie();
        l l1 = null;
        java.util.ArrayList arraylist4 = la.ie();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = la.ie();
        boolean flag = false;
        java.util.ArrayList arraylist2 = la.ie();
        java.util.ArrayList arraylist1 = la.ie();
        java.util.ArrayList arraylist = la.ie();
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(j1))
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

    public CommonWalletObject[] gl(int i)
    {
        return new CommonWalletObject[i];
    }

    public Object[] newArray(int i)
    {
        return gl(i);
    }
}
