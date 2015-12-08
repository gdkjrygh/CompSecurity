// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

public final class lkc
    implements android.os.Parcelable.Creator
{

    public lkc()
    {
    }

    public static StopScanRequest a(Parcel parcel)
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
                return new StopScanRequest(i, ibinder);
            }
        } while (true);
    }

    public static void a(StopScanRequest stopscanrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        android.os.IBinder ibinder;
        if (stopscanrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = stopscanrequest.b.asBinder();
        }
        b.a(parcel, 1, ibinder, false);
        b.c(parcel, 1000, stopscanrequest.a);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new StopScanRequest[i];
    }
}
