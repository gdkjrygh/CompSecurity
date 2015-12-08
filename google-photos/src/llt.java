// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.ReceiveContentRequest;

public final class llt
    implements android.os.Parcelable.Creator
{

    public llt()
    {
    }

    public static void a(ReceiveContentRequest receivecontentrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, receivecontentrequest.a);
        b.a(parcel, 2, receivecontentrequest.b, false);
        android.os.IBinder ibinder;
        if (receivecontentrequest.c == null)
        {
            ibinder = null;
        } else
        {
            ibinder = receivecontentrequest.c.asBinder();
        }
        b.a(parcel, 3, ibinder, false);
        b.a(parcel, 4, receivecontentrequest.d, false);
        b.a(parcel, 5, receivecontentrequest.e.asBinder(), false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        int i = 0;
        String s = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
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
                    ibinder2 = b.j(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder1 = b.j(parcel, k);
                    break;

                case 4: // '\004'
                    s = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ReceiveContentRequest(i, ibinder2, ibinder1, s, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ReceiveContentRequest[i];
    }
}
