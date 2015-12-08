// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;

public final class lkt
    implements android.os.Parcelable.Creator
{

    public lkt()
    {
    }

    public static MessageWrapper a(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        Message message = null;
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
                    message = (Message)b.a(parcel, k, Message.CREATOR);
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
                return new MessageWrapper(i, message);
            }
        } while (true);
    }

    public static void a(MessageWrapper messagewrapper, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, messagewrapper.b, i, false);
        b.c(parcel, 1000, messagewrapper.a);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new MessageWrapper[i];
    }
}
