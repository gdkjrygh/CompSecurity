// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jo;
import com.google.android.gms.internal.js;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.jy;
import com.google.android.gms.maps.model.LatLng;

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
        int k = b.p(parcel);
        b.c(parcel, 1, loyaltywalletobject.getVersionCode());
        b.a(parcel, 2, loyaltywalletobject.eC, false);
        b.a(parcel, 3, loyaltywalletobject.abz, false);
        b.a(parcel, 4, loyaltywalletobject.abA, false);
        b.a(parcel, 5, loyaltywalletobject.abB, false);
        b.a(parcel, 6, loyaltywalletobject.abC, false);
        b.a(parcel, 7, loyaltywalletobject.abD, false);
        b.a(parcel, 8, loyaltywalletobject.abE, false);
        b.a(parcel, 9, loyaltywalletobject.abF, false);
        b.a(parcel, 10, loyaltywalletobject.abG, false);
        b.a(parcel, 11, loyaltywalletobject.abH, false);
        b.c(parcel, 12, loyaltywalletobject.state);
        b.b(parcel, 13, loyaltywalletobject.abI, false);
        b.a(parcel, 14, loyaltywalletobject.abJ, i, false);
        b.b(parcel, 15, loyaltywalletobject.abK, false);
        b.a(parcel, 17, loyaltywalletobject.abM, false);
        b.a(parcel, 16, loyaltywalletobject.abL, false);
        b.a(parcel, 19, loyaltywalletobject.abO);
        b.b(parcel, 18, loyaltywalletobject.abN, false);
        b.b(parcel, 21, loyaltywalletobject.abQ, false);
        b.b(parcel, 20, loyaltywalletobject.abP, false);
        b.a(parcel, 23, loyaltywalletobject.abS, i, false);
        b.b(parcel, 22, loyaltywalletobject.abR, false);
        b.F(parcel, k);
    }

    public LoyaltyWalletObject bf(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
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
        java.util.ArrayList arraylist5 = gi.fs();
        ju ju1 = null;
        java.util.ArrayList arraylist4 = gi.fs();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = gi.fs();
        boolean flag = false;
        java.util.ArrayList arraylist2 = gi.fs();
        java.util.ArrayList arraylist1 = gi.fs();
        java.util.ArrayList arraylist = gi.fs();
        jo jo1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jy.CREATOR);
                    break;

                case 14: // '\016'
                    ju1 = (ju)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ju.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jm.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, js.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jw.CREATOR);
                    break;

                case 23: // '\027'
                    jo1 = (jo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, jo.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jw.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(k, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, ju1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, jo1);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] cr(int i)
    {
        return new LoyaltyWalletObject[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bf(parcel);
    }

    public Object[] newArray(int i)
    {
        return cr(i);
    }
}
