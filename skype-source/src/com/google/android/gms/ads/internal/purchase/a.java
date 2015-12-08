// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.os.Parcel;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            GInAppPurchaseManagerInfoParcel

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, ginapppurchasemanagerinfoparcel.a);
        b.a(parcel, 3, d.a(ginapppurchasemanagerinfoparcel.b).asBinder());
        b.a(parcel, 4, d.a(ginapppurchasemanagerinfoparcel.c).asBinder());
        b.a(parcel, 5, d.a(ginapppurchasemanagerinfoparcel.d).asBinder());
        b.a(parcel, 6, d.a(ginapppurchasemanagerinfoparcel.e).asBinder());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GInAppPurchaseManagerInfoParcel(i, ibinder3, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GInAppPurchaseManagerInfoParcel[i];
    }
}
