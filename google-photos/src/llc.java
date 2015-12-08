// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;

public final class llc
    implements android.os.Parcelable.Creator
{

    public llc()
    {
    }

    public static void a(MessageFilter messagefilter, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, messagefilter.b, false);
        b.c(parcel, 1000, messagefilter.a);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = b.c(parcel, k, MessageType.CREATOR);
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
                return new MessageFilter(i, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MessageFilter[i];
    }
}
