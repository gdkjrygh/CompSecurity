// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

public final class lkx
    implements android.os.Parcelable.Creator
{

    public lkx()
    {
    }

    public static void a(PublishRequest publishrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, publishrequest.a);
        b.a(parcel, 2, publishrequest.b, i, false);
        b.a(parcel, 3, publishrequest.c, i, false);
        b.a(parcel, 4, publishrequest.d.asBinder(), false);
        b.a(parcel, 5, publishrequest.e, false);
        b.a(parcel, 6, publishrequest.f, false);
        b.a(parcel, 7, publishrequest.g);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = b.b(parcel);
        String s1 = null;
        android.os.IBinder ibinder = null;
        Strategy strategy = null;
        MessageWrapper messagewrapper = null;
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
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    messagewrapper = (MessageWrapper)b.a(parcel, k, MessageWrapper.CREATOR);
                    break;

                case 3: // '\003'
                    strategy = (Strategy)b.a(parcel, k, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder = b.j(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = b.i(parcel, k);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, k);
                    break;

                case 7: // '\007'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PublishRequest(i, messagewrapper, strategy, ibinder, s1, s, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PublishRequest[i];
    }
}
