// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.MessageType;

public final class lks
    implements android.os.Parcelable.Creator
{

    public lks()
    {
    }

    public static void a(MessageType messagetype, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, messagetype.b, false);
        b.c(parcel, 1000, messagetype.a);
        b.a(parcel, 2, messagetype.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
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
                    s1 = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MessageType(i, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MessageType[i];
    }
}
