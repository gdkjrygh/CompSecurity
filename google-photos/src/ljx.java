// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;

public final class ljx
    implements android.os.Parcelable.Creator
{

    public ljx()
    {
    }

    public static DisableTargetRequest a(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    ibinder = b.j(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DisableTargetRequest(i, ibinder);
            }
        } while (true);
    }

    public static void a(DisableTargetRequest disabletargetrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        android.os.IBinder ibinder;
        if (disabletargetrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = disabletargetrequest.b.asBinder();
        }
        b.a(parcel, 1, ibinder, false);
        b.c(parcel, 1000, disabletargetrequest.a);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new DisableTargetRequest[i];
    }
}
