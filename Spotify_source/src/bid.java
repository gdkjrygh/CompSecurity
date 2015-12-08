// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bid
    implements android.os.Parcelable.Creator
{

    public bid()
    {
    }

    public static void a(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, ginapppurchasemanagerinfoparcel.a);
        brp.a(parcel, 3, bye.a(ginapppurchasemanagerinfoparcel.b).asBinder());
        brp.a(parcel, 4, bye.a(ginapppurchasemanagerinfoparcel.c).asBinder());
        brp.a(parcel, 5, bye.a(ginapppurchasemanagerinfoparcel.d).asBinder());
        brp.a(parcel, 6, bye.a(ginapppurchasemanagerinfoparcel.e).asBinder());
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = zza.i(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = zza.i(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = zza.i(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
