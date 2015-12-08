// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.jj;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.jr;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.jv;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, loyaltywalletobject.a());
        c.a(parcel, 2, loyaltywalletobject.a, false);
        c.a(parcel, 3, loyaltywalletobject.b, false);
        c.a(parcel, 4, loyaltywalletobject.c, false);
        c.a(parcel, 5, loyaltywalletobject.d, false);
        c.a(parcel, 6, loyaltywalletobject.e, false);
        c.a(parcel, 7, loyaltywalletobject.f, false);
        c.a(parcel, 8, loyaltywalletobject.g, false);
        c.a(parcel, 9, loyaltywalletobject.h, false);
        c.a(parcel, 10, loyaltywalletobject.i, false);
        c.a(parcel, 11, loyaltywalletobject.j, false);
        c.a(parcel, 12, loyaltywalletobject.k);
        c.b(parcel, 13, loyaltywalletobject.l, false);
        c.a(parcel, 14, loyaltywalletobject.m, i, false);
        c.b(parcel, 15, loyaltywalletobject.n, false);
        c.a(parcel, 17, loyaltywalletobject.p, false);
        c.a(parcel, 16, loyaltywalletobject.o, false);
        c.a(parcel, 19, loyaltywalletobject.r);
        c.b(parcel, 18, loyaltywalletobject.q, false);
        c.b(parcel, 21, loyaltywalletobject.t, false);
        c.b(parcel, 20, loyaltywalletobject.s, false);
        c.a(parcel, 23, loyaltywalletobject.v, i, false);
        c.b(parcel, 22, loyaltywalletobject.u, false);
        c.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
        ArrayList arraylist5 = new ArrayList();
        jr jr1 = null;
        ArrayList arraylist4 = new ArrayList();
        String s1 = null;
        String s = null;
        ArrayList arraylist3 = new ArrayList();
        boolean flag = false;
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        jl jl1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jv.CREATOR);
                    break;

                case 14: // '\016'
                    jr1 = (jr)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, jr.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.a);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jj.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jp.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jt.CREATOR);
                    break;

                case 23: // '\027'
                    jl1 = (jl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, jl.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, jt.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(k, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, jr1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, jl1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LoyaltyWalletObject[i];
    }
}
