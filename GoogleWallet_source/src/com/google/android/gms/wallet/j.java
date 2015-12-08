// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

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
        int k = b.bU(parcel);
        b.c(parcel, 1, loyaltywalletobject.getVersionCode());
        b.a(parcel, 2, loyaltywalletobject.fl, false);
        b.a(parcel, 3, loyaltywalletobject.accountId, false);
        b.a(parcel, 4, loyaltywalletobject.aTM, false);
        b.a(parcel, 5, loyaltywalletobject.aTN, false);
        b.a(parcel, 6, loyaltywalletobject.accountName, false);
        b.a(parcel, 7, loyaltywalletobject.aTO, false);
        b.a(parcel, 8, loyaltywalletobject.aTP, false);
        b.a(parcel, 9, loyaltywalletobject.aTQ, false);
        b.a(parcel, 10, loyaltywalletobject.aTR, false);
        b.a(parcel, 11, loyaltywalletobject.aTS, false);
        b.c(parcel, 12, loyaltywalletobject.state);
        b.d(parcel, 13, loyaltywalletobject.aTT, false);
        b.a(parcel, 14, loyaltywalletobject.aTU, i, false);
        b.d(parcel, 15, loyaltywalletobject.aTV, false);
        b.a(parcel, 17, loyaltywalletobject.aTX, false);
        b.a(parcel, 16, loyaltywalletobject.aTW, false);
        b.a(parcel, 19, loyaltywalletobject.aTZ);
        b.d(parcel, 18, loyaltywalletobject.aTY, false);
        b.d(parcel, 21, loyaltywalletobject.aUb, false);
        b.d(parcel, 20, loyaltywalletobject.aUa, false);
        b.a(parcel, 23, loyaltywalletobject.aUd, i, false);
        b.d(parcel, 22, loyaltywalletobject.aUc, false);
        b.J(parcel, k);
    }

    private static LoyaltyWalletObject _mthif(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
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
        LoyaltyPoints loyaltypoints = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, WalletObjectMessage.CREATOR);
                    break;

                case 14: // '\016'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, TimeInterval.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LabelValueRow.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, TextModuleData.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, UriData.CREATOR);
                    break;

                case 23: // '\027'
                    loyaltypoints = (LoyaltyPoints)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, LoyaltyPoints.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(k, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, timeinterval, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, loyaltypoints);
            }
        } while (true);
    }

    private static LoyaltyWalletObject[] la(int i)
    {
        return new LoyaltyWalletObject[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return _mthif(parcel);
    }

    public final Object[] newArray(int i)
    {
        return la(i);
    }
}
