// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

public final class lka
    implements android.os.Parcelable.Creator
{

    public lka()
    {
    }

    public static SendDataRequest a(Parcel parcel)
    {
        int j = b.b(parcel);
        byte abyte0[] = null;
        Device device = null;
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
                    device = (Device)b.a(parcel, k, Device.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    abyte0 = b.l(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SendDataRequest(i, device, abyte0, ibinder);
            }
        } while (true);
    }

    public static void a(SendDataRequest senddatarequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, senddatarequest.b, i, false);
        b.c(parcel, 1000, senddatarequest.a);
        b.a(parcel, 2, senddatarequest.c, false);
        if (senddatarequest.d == null)
        {
            senddatarequest = null;
        } else
        {
            senddatarequest = senddatarequest.d.asBinder();
        }
        b.a(parcel, 3, senddatarequest, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new SendDataRequest[i];
    }
}
