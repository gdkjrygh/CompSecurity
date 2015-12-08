// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;

public final class lky
    implements android.os.Parcelable.Creator
{

    public lky()
    {
    }

    public static void a(SubscribeRequest subscriberequest, Parcel parcel, int i)
    {
        Object obj = null;
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, subscriberequest.a);
        android.os.IBinder ibinder;
        if (subscriberequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = subscriberequest.b.asBinder();
        }
        b.a(parcel, 2, ibinder, false);
        b.a(parcel, 3, subscriberequest.c, i, false);
        if (subscriberequest.d == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = subscriberequest.d.asBinder();
        }
        b.a(parcel, 4, ibinder, false);
        b.a(parcel, 5, subscriberequest.e, i, false);
        b.a(parcel, 6, subscriberequest.f, i, false);
        b.c(parcel, 7, subscriberequest.g);
        b.a(parcel, 8, subscriberequest.h, false);
        b.a(parcel, 9, subscriberequest.i, false);
        b.a(parcel, 10, subscriberequest.j, false);
        b.a(parcel, 11, subscriberequest.k);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        byte abyte0[] = null;
        int k = b.b(parcel);
        String s = null;
        String s1 = null;
        int i = 0;
        PendingIntent pendingintent = null;
        MessageFilter messagefilter = null;
        android.os.IBinder ibinder = null;
        Strategy strategy = null;
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
                    strategy = (Strategy)b.a(parcel, l, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder = b.j(parcel, l);
                    break;

                case 5: // '\005'
                    messagefilter = (MessageFilter)b.a(parcel, l, MessageFilter.CREATOR);
                    break;

                case 6: // '\006'
                    pendingintent = (PendingIntent)b.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 7: // '\007'
                    i = b.e(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = b.i(parcel, l);
                    break;

                case 9: // '\t'
                    s = b.i(parcel, l);
                    break;

                case 10: // '\n'
                    abyte0 = b.l(parcel, l);
                    break;

                case 11: // '\013'
                    flag = b.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new SubscribeRequest(j, ibinder1, strategy, ibinder, messagefilter, pendingintent, i, s1, s, abyte0, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SubscribeRequest[i];
    }
}
