// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.zzd;
import com.google.android.gms.wallet.wobs.zzf;
import com.google.android.gms.wallet.wobs.zzj;
import com.google.android.gms.wallet.wobs.zzl;
import com.google.android.gms.wallet.wobs.zzn;
import com.google.android.gms.wallet.wobs.zzp;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public final class u
    implements android.os.Parcelable.Creator
{

    public u()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, loyaltywalletobject.a());
        c.a(parcel, 2, loyaltywalletobject.a);
        c.a(parcel, 3, loyaltywalletobject.b);
        c.a(parcel, 4, loyaltywalletobject.c);
        c.a(parcel, 5, loyaltywalletobject.d);
        c.a(parcel, 6, loyaltywalletobject.e);
        c.a(parcel, 7, loyaltywalletobject.f);
        c.a(parcel, 8, loyaltywalletobject.g);
        c.a(parcel, 9, loyaltywalletobject.h);
        c.a(parcel, 10, loyaltywalletobject.i);
        c.a(parcel, 11, loyaltywalletobject.j);
        c.a(parcel, 12, loyaltywalletobject.k);
        c.c(parcel, 13, loyaltywalletobject.l);
        c.a(parcel, 14, loyaltywalletobject.m, i);
        c.c(parcel, 15, loyaltywalletobject.n);
        c.a(parcel, 17, loyaltywalletobject.p);
        c.a(parcel, 16, loyaltywalletobject.o);
        c.a(parcel, 19, loyaltywalletobject.r);
        c.c(parcel, 18, loyaltywalletobject.q);
        c.c(parcel, 21, loyaltywalletobject.t);
        c.c(parcel, 20, loyaltywalletobject.s);
        c.a(parcel, 23, loyaltywalletobject.v, i);
        c.c(parcel, 22, loyaltywalletobject.u);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
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
        zzl zzl1 = null;
        ArrayList arraylist4 = new ArrayList();
        String s1 = null;
        String s = null;
        ArrayList arraylist3 = new ArrayList();
        boolean flag = false;
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        zzf zzf1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzp.CREATOR);
                    break;

                case 14: // '\016'
                    zzl1 = (zzl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzl.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzd.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzj.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzn.CREATOR);
                    break;

                case 23: // '\027'
                    zzf1 = (zzf)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzf.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzn.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(j, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, zzl1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, zzf1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LoyaltyWalletObject[i];
    }
}
