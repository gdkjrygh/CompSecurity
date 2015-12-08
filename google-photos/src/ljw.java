// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;

public final class ljw
    implements android.os.Parcelable.Creator
{

    public ljw()
    {
    }

    public static ContinueConnectRequest a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        int i = 0;
        String s = null;
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
                    s = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ContinueConnectRequest(i, s, ibinder);
            }
        } while (true);
    }

    public static void a(ContinueConnectRequest continueconnectrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, continueconnectrequest.b, false);
        b.c(parcel, 1000, continueconnectrequest.a);
        if (continueconnectrequest.c == null)
        {
            continueconnectrequest = null;
        } else
        {
            continueconnectrequest = continueconnectrequest.c.asBinder();
        }
        b.a(parcel, 2, continueconnectrequest, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ContinueConnectRequest[i];
    }
}
