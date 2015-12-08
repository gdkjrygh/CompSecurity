// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;

public final class jpi
    implements android.os.Parcelable.Creator
{

    public jpi()
    {
    }

    public static void a(GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, ginapppurchasemanagerinfoparcel.a);
        b.a(parcel, 3, kon.a(ginapppurchasemanagerinfoparcel.b).asBinder(), false);
        b.a(parcel, 4, kon.a(ginapppurchasemanagerinfoparcel.c).asBinder(), false);
        b.a(parcel, 5, kon.a(ginapppurchasemanagerinfoparcel.d).asBinder(), false);
        b.a(parcel, 6, kon.a(ginapppurchasemanagerinfoparcel.e).asBinder(), false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder3 = b.j(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = b.j(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = b.j(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
