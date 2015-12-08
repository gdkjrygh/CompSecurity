// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, loyaltywalletobject.a());
        zzb.a(parcel, 2, loyaltywalletobject.a, false);
        zzb.a(parcel, 3, loyaltywalletobject.b, false);
        zzb.a(parcel, 4, loyaltywalletobject.c, false);
        zzb.a(parcel, 5, loyaltywalletobject.d, false);
        zzb.a(parcel, 6, loyaltywalletobject.e, false);
        zzb.a(parcel, 7, loyaltywalletobject.f, false);
        zzb.a(parcel, 8, loyaltywalletobject.g, false);
        zzb.a(parcel, 9, loyaltywalletobject.h, false);
        zzb.a(parcel, 10, loyaltywalletobject.i, false);
        zzb.a(parcel, 11, loyaltywalletobject.j, false);
        zzb.a(parcel, 12, loyaltywalletobject.k);
        zzb.c(parcel, 13, loyaltywalletobject.l, false);
        zzb.a(parcel, 14, loyaltywalletobject.m, i, false);
        zzb.c(parcel, 15, loyaltywalletobject.n, false);
        zzb.a(parcel, 17, loyaltywalletobject.p, false);
        zzb.a(parcel, 16, loyaltywalletobject.o, false);
        zzb.a(parcel, 19, loyaltywalletobject.r);
        zzb.c(parcel, 18, loyaltywalletobject.q, false);
        zzb.c(parcel, 21, loyaltywalletobject.t, false);
        zzb.c(parcel, 20, loyaltywalletobject.s, false);
        zzb.a(parcel, 23, loyaltywalletobject.v, i, false);
        zzb.c(parcel, 22, loyaltywalletobject.u, false);
        zzb.a(parcel, j);
    }

    public LoyaltyWalletObject a(Parcel parcel)
    {
        int k = zza.b(parcel);
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
        java.util.ArrayList arraylist5 = zzkx.a();
        TimeInterval timeinterval = null;
        java.util.ArrayList arraylist4 = zzkx.a();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = zzkx.a();
        boolean flag = false;
        java.util.ArrayList arraylist2 = zzkx.a();
        java.util.ArrayList arraylist1 = zzkx.a();
        java.util.ArrayList arraylist = zzkx.a();
        LoyaltyPoints loyaltypoints = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s11 = zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    s10 = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    s9 = zza.m(parcel, l);
                    break;

                case 5: // '\005'
                    s8 = zza.m(parcel, l);
                    break;

                case 6: // '\006'
                    s7 = zza.m(parcel, l);
                    break;

                case 7: // '\007'
                    s6 = zza.m(parcel, l);
                    break;

                case 8: // '\b'
                    s5 = zza.m(parcel, l);
                    break;

                case 9: // '\t'
                    s4 = zza.m(parcel, l);
                    break;

                case 10: // '\n'
                    s3 = zza.m(parcel, l);
                    break;

                case 11: // '\013'
                    s2 = zza.m(parcel, l);
                    break;

                case 12: // '\f'
                    i = zza.f(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist5 = zza.c(parcel, l, WalletObjectMessage.CREATOR);
                    break;

                case 14: // '\016'
                    timeinterval = (TimeInterval)zza.a(parcel, l, TimeInterval.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = zza.c(parcel, l, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = zza.m(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = zza.m(parcel, l);
                    break;

                case 19: // '\023'
                    flag = zza.c(parcel, l);
                    break;

                case 18: // '\022'
                    arraylist3 = zza.c(parcel, l, LabelValueRow.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = zza.c(parcel, l, TextModuleData.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = zza.c(parcel, l, UriData.CREATOR);
                    break;

                case 23: // '\027'
                    loyaltypoints = (LoyaltyPoints)zza.a(parcel, l, LoyaltyPoints.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = zza.c(parcel, l, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(j, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, timeinterval, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, loyaltypoints);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] a(int i)
    {
        return new LoyaltyWalletObject[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
