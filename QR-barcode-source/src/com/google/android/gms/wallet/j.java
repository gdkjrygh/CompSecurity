// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.jr;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.d;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import com.google.android.gms.wallet.wobs.n;
import com.google.android.gms.wallet.wobs.p;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int k = b.D(parcel);
        b.c(parcel, 1, loyaltywalletobject.getVersionCode());
        b.a(parcel, 2, loyaltywalletobject.fl, false);
        b.a(parcel, 3, loyaltywalletobject.asT, false);
        b.a(parcel, 4, loyaltywalletobject.asU, false);
        b.a(parcel, 5, loyaltywalletobject.asV, false);
        b.a(parcel, 6, loyaltywalletobject.Dv, false);
        b.a(parcel, 7, loyaltywalletobject.asW, false);
        b.a(parcel, 8, loyaltywalletobject.asX, false);
        b.a(parcel, 9, loyaltywalletobject.asY, false);
        b.a(parcel, 10, loyaltywalletobject.asZ, false);
        b.a(parcel, 11, loyaltywalletobject.ata, false);
        b.c(parcel, 12, loyaltywalletobject.state);
        b.c(parcel, 13, loyaltywalletobject.atb, false);
        b.a(parcel, 14, loyaltywalletobject.atc, i, false);
        b.c(parcel, 15, loyaltywalletobject.atd, false);
        b.a(parcel, 17, loyaltywalletobject.atf, false);
        b.a(parcel, 16, loyaltywalletobject.ate, false);
        b.a(parcel, 19, loyaltywalletobject.ath);
        b.c(parcel, 18, loyaltywalletobject.atg, false);
        b.c(parcel, 21, loyaltywalletobject.atj, false);
        b.c(parcel, 20, loyaltywalletobject.ati, false);
        b.a(parcel, 23, loyaltywalletobject.atl, i, false);
        b.c(parcel, 22, loyaltywalletobject.atk, false);
        b.H(parcel, k);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dv(parcel);
    }

    public LoyaltyWalletObject dv(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int k = 0;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        int i = 0;
        java.util.ArrayList arraylist5 = jr.hz();
        l l1 = null;
        java.util.ArrayList arraylist4 = jr.hz();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = jr.hz();
        boolean flag = false;
        java.util.ArrayList arraylist2 = jr.hz();
        java.util.ArrayList arraylist1 = jr.hz();
        java.util.ArrayList arraylist = jr.hz();
        f f1 = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, p.CREATOR);
                    break;

                case 14: // '\016'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, l.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, d.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, com.google.android.gms.wallet.wobs.j.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;

                case 23: // '\027'
                    f1 = (f)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, f.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, n.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(k, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, l1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, f1);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] fw(int i)
    {
        return new LoyaltyWalletObject[i];
    }

    public Object[] newArray(int i)
    {
        return fw(i);
    }
}
