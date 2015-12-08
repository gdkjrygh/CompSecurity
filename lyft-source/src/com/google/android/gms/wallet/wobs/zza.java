// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            CommonWalletObject, WalletObjectMessage, TimeInterval, LabelValueRow, 
//            TextModuleData, UriData

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(CommonWalletObject commonwalletobject, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, commonwalletobject.b());
        zzb.a(parcel, 2, commonwalletobject.a, false);
        zzb.a(parcel, 3, commonwalletobject.b, false);
        zzb.a(parcel, 4, commonwalletobject.c, false);
        zzb.a(parcel, 5, commonwalletobject.d, false);
        zzb.a(parcel, 6, commonwalletobject.e, false);
        zzb.a(parcel, 7, commonwalletobject.f, false);
        zzb.a(parcel, 8, commonwalletobject.g, false);
        zzb.a(parcel, 9, commonwalletobject.h, false);
        zzb.a(parcel, 10, commonwalletobject.i);
        zzb.c(parcel, 11, commonwalletobject.j, false);
        zzb.a(parcel, 12, commonwalletobject.k, i, false);
        zzb.c(parcel, 13, commonwalletobject.l, false);
        zzb.a(parcel, 14, commonwalletobject.m, false);
        zzb.a(parcel, 15, commonwalletobject.n, false);
        zzb.a(parcel, 17, commonwalletobject.p);
        zzb.c(parcel, 16, commonwalletobject.o, false);
        zzb.c(parcel, 19, commonwalletobject.r, false);
        zzb.c(parcel, 18, commonwalletobject.q, false);
        zzb.c(parcel, 20, commonwalletobject.s, false);
        zzb.a(parcel, j);
    }

    public CommonWalletObject a(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
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
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 7: // '\007'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;

                case 11: // '\013'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, WalletObjectMessage.CREATOR);
                    break;

                case 12: // '\f'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.a(parcel, l, TimeInterval.CREATOR);
                    break;

                case 13: // '\r'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, LatLng.CREATOR);
                    break;

                case 14: // '\016'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l);
                    break;

                case 16: // '\020'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, LabelValueRow.CREATOR);
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, TextModuleData.CREATOR);
                    break;

                case 18: // '\022'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, UriData.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CommonWalletObject(j, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, timeinterval, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public CommonWalletObject[] a(int i)
    {
        return new CommonWalletObject[i];
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
