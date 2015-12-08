// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

public final class ljv
    implements android.os.Parcelable.Creator
{

    public ljv()
    {
    }

    public static ConnectRequest a(Parcel parcel)
    {
        byte byte0 = 0;
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        long l = 0L;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        String s = null;
        byte byte1 = 0;
        String s1 = null;
        String s2 = null;
        Device device = null;
        int i = 0;
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
                    s2 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = b.i(parcel, k);
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

                case 7: // '\007'
                    byte1 = b.d(parcel, k);
                    break;

                case 8: // '\b'
                    l = b.f(parcel, k);
                    break;

                case 9: // '\t'
                    s = b.i(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = b.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConnectRequest(i, device, s2, s1, byte1, l, s, byte0, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public static void a(ConnectRequest connectrequest, Parcel parcel, int i)
    {
        Object obj = null;
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, connectrequest.b, i, false);
        b.c(parcel, 1000, connectrequest.a);
        b.a(parcel, 2, connectrequest.c, false);
        b.a(parcel, 3, connectrequest.d, false);
        android.os.IBinder ibinder;
        if (connectrequest.e == null)
        {
            ibinder = null;
        } else
        {
            ibinder = connectrequest.e.asBinder();
        }
        b.a(parcel, 4, ibinder, false);
        if (connectrequest.f == null)
        {
            ibinder = null;
        } else
        {
            ibinder = connectrequest.f.asBinder();
        }
        b.a(parcel, 5, ibinder, false);
        if (connectrequest.g == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = connectrequest.g.asBinder();
        }
        b.a(parcel, 6, ibinder, false);
        b.a(parcel, 7, connectrequest.h);
        b.a(parcel, 8, connectrequest.i);
        b.a(parcel, 9, connectrequest.j, false);
        b.a(parcel, 10, connectrequest.k);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectRequest[i];
    }
}
