// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, ginapppurchasemanagerinfoparcel.versionCode);
        b.a(parcel, 3, ginapppurchasemanagerinfoparcel.zzfd(), false);
        b.a(parcel, 4, ginapppurchasemanagerinfoparcel.zzfe(), false);
        b.a(parcel, 5, ginapppurchasemanagerinfoparcel.zzff(), false);
        b.a(parcel, 6, ginapppurchasemanagerinfoparcel.zzfc(), false);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzx(i);
    }

    public GInAppPurchaseManagerInfoParcel zzi(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = a.b(parcel);
        int i = 0;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                case 2: // '\002'
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = a.h(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = a.h(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = a.h(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = a.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GInAppPurchaseManagerInfoParcel(i, ibinder3, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public GInAppPurchaseManagerInfoParcel[] zzx(int i)
    {
        return new GInAppPurchaseManagerInfoParcel[i];
    }
}
