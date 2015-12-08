// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;

public final class ljz
    implements android.os.Parcelable.Creator
{

    public ljz()
    {
    }

    public static EnableTargetRequest a(Parcel parcel)
    {
        byte byte0 = 0;
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        String s = null;
        String s1 = null;
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
                    s1 = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder2 = b.j(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder1 = b.j(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = b.j(parcel, k);
                    break;

                case 6: // '\006'
                    byte0 = b.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EnableTargetRequest(i, s1, s, byte0, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public static void a(EnableTargetRequest enabletargetrequest, Parcel parcel)
    {
        Object obj = null;
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, enabletargetrequest.b, false);
        b.c(parcel, 1000, enabletargetrequest.a);
        b.a(parcel, 2, enabletargetrequest.c, false);
        android.os.IBinder ibinder;
        if (enabletargetrequest.d == null)
        {
            ibinder = null;
        } else
        {
            ibinder = enabletargetrequest.d.asBinder();
        }
        b.a(parcel, 3, ibinder, false);
        if (enabletargetrequest.e == null)
        {
            ibinder = null;
        } else
        {
            ibinder = enabletargetrequest.e.asBinder();
        }
        b.a(parcel, 4, ibinder, false);
        if (enabletargetrequest.f == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = enabletargetrequest.f.asBinder();
        }
        b.a(parcel, 5, ibinder, false);
        b.a(parcel, 6, enabletargetrequest.g);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new EnableTargetRequest[i];
    }
}
