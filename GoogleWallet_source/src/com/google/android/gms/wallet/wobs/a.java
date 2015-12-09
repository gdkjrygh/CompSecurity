// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            CommonWalletObject, WalletObjectMessage, TimeInterval, LabelValueRow, 
//            TextModuleData, UriData

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(CommonWalletObject commonwalletobject, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, commonwalletobject.getVersionCode());
        b.a(parcel, 2, commonwalletobject.fl, false);
        b.a(parcel, 3, commonwalletobject.aTS, false);
        b.a(parcel, 4, commonwalletobject.name, false);
        b.a(parcel, 5, commonwalletobject.aTM, false);
        b.a(parcel, 6, commonwalletobject.aTO, false);
        b.a(parcel, 7, commonwalletobject.aTP, false);
        b.a(parcel, 8, commonwalletobject.aTQ, false);
        b.a(parcel, 9, commonwalletobject.aTR, false);
        b.c(parcel, 10, commonwalletobject.state);
        b.d(parcel, 11, commonwalletobject.aTT, false);
        b.a(parcel, 12, commonwalletobject.aTU, i, false);
        b.d(parcel, 13, commonwalletobject.aTV, false);
        b.a(parcel, 14, commonwalletobject.aTW, false);
        b.a(parcel, 15, commonwalletobject.aTX, false);
        b.a(parcel, 17, commonwalletobject.aTZ);
        b.d(parcel, 16, commonwalletobject.aTY, false);
        b.d(parcel, 19, commonwalletobject.aUb, false);
        b.d(parcel, 18, commonwalletobject.aUa, false);
        b.d(parcel, 20, commonwalletobject.aUc, false);
        b.J(parcel, j);
    }

    private static CommonWalletObject iu(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
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
        java.util.ArrayList arraylist5 = com.google.android.gms.common.util.a.ji();
        TimeInterval timeinterval = null;
        java.util.ArrayList arraylist4 = com.google.android.gms.common.util.a.ji();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = com.google.android.gms.common.util.a.ji();
        boolean flag = false;
        java.util.ArrayList arraylist2 = com.google.android.gms.common.util.a.ji();
        java.util.ArrayList arraylist1 = com.google.android.gms.common.util.a.ji();
        java.util.ArrayList arraylist = com.google.android.gms.common.util.a.ji();
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 7: // '\007'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 11: // '\013'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, WalletObjectMessage.CREATOR);
                    break;

                case 12: // '\f'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, TimeInterval.CREATOR);
                    break;

                case 13: // '\r'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, LatLng.CREATOR);
                    break;

                case 14: // '\016'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 16: // '\020'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, LabelValueRow.CREATOR);
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, TextModuleData.CREATOR);
                    break;

                case 18: // '\022'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, UriData.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CommonWalletObject(j, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, timeinterval, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    private static CommonWalletObject[] lu(int i)
    {
        return new CommonWalletObject[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iu(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lu(i);
    }
}
