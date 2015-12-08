// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            CommonWalletObject, zzp, zzl, zzd, 
//            zzj, zzn

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CommonWalletObject commonwalletobject, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, commonwalletobject.b());
        c.a(parcel, 2, commonwalletobject.a);
        c.a(parcel, 3, commonwalletobject.b);
        c.a(parcel, 4, commonwalletobject.c);
        c.a(parcel, 5, commonwalletobject.d);
        c.a(parcel, 6, commonwalletobject.e);
        c.a(parcel, 7, commonwalletobject.f);
        c.a(parcel, 8, commonwalletobject.g);
        c.a(parcel, 9, commonwalletobject.h);
        c.a(parcel, 10, commonwalletobject.i);
        c.c(parcel, 11, commonwalletobject.j);
        c.a(parcel, 12, commonwalletobject.k, i);
        c.c(parcel, 13, commonwalletobject.l);
        c.a(parcel, 14, commonwalletobject.m);
        c.a(parcel, 15, commonwalletobject.n);
        c.a(parcel, 17, commonwalletobject.p);
        c.c(parcel, 16, commonwalletobject.o);
        c.c(parcel, 19, commonwalletobject.r);
        c.c(parcel, 18, commonwalletobject.q);
        c.c(parcel, 20, commonwalletobject.s);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
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
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 11: // '\013'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzp.CREATOR);
                    break;

                case 12: // '\f'
                    zzl1 = (zzl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzl.CREATOR);
                    break;

                case 13: // '\r'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, LatLng.CREATOR);
                    break;

                case 14: // '\016'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 16: // '\020'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzd.CREATOR);
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzj.CREATOR);
                    break;

                case 18: // '\022'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzn.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzn.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CommonWalletObject(j, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, zzl1, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CommonWalletObject[i];
    }
}
