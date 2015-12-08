// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

public final class lla
    implements android.os.Parcelable.Creator
{

    public lla()
    {
    }

    public static void a(UnsubscribeRequest unsubscriberequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, unsubscriberequest.a);
        android.os.IBinder ibinder;
        if (unsubscriberequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = unsubscriberequest.b.asBinder();
        }
        b.a(parcel, 2, ibinder, false);
        b.a(parcel, 3, unsubscriberequest.c.asBinder(), false);
        b.a(parcel, 4, unsubscriberequest.d, i, false);
        b.c(parcel, 5, unsubscriberequest.e);
        b.a(parcel, 6, unsubscriberequest.f, false);
        b.a(parcel, 7, unsubscriberequest.g, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = b.b(parcel);
        String s1 = null;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    ibinder1 = b.j(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = b.j(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)b.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    i = b.e(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = b.i(parcel, l);
                    break;

                case 7: // '\007'
                    s = b.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new UnsubscribeRequest(j, ibinder1, ibinder, pendingintent, i, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UnsubscribeRequest[i];
    }
}
