// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.StopProvidingContentRequest;

public final class llw
    implements android.os.Parcelable.Creator
{

    public llw()
    {
    }

    public static void a(StopProvidingContentRequest stopprovidingcontentrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, stopprovidingcontentrequest.a);
        b.a(parcel, 2, stopprovidingcontentrequest.b);
        b.a(parcel, 3, stopprovidingcontentrequest.c.asBinder(), false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        long l = 0L;
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
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    l = b.f(parcel, k);
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
                return new StopProvidingContentRequest(i, l, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StopProvidingContentRequest[i];
    }
}
