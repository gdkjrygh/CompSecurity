// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.os.Parcel;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, ginapppurchasemanagerinfoparcel.versionCode);
        c.a(parcel, 3, d.a(ginapppurchasemanagerinfoparcel.zzqE).asBinder());
        c.a(parcel, 4, d.a(ginapppurchasemanagerinfoparcel.zzCw).asBinder());
        c.a(parcel, 5, d.a(ginapppurchasemanagerinfoparcel.zzCx).asBinder());
        c.a(parcel, 6, d.a(ginapppurchasemanagerinfoparcel.zzCy).asBinder());
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzx(i);
    }

    public GInAppPurchaseManagerInfoParcel zzh(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.k(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
