// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class kaj
    implements android.os.Parcelable.Creator
{

    public kaj()
    {
    }

    public static void a(Status status, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, status.g);
        b.c(parcel, 1000, status.f);
        b.a(parcel, 2, status.h, false);
        b.a(parcel, 3, status.i, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int k = b.b(parcel);
        int j = 0;
        int i = 0;
        String s = null;
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

                case 1000: 
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)b.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Status(i, j, s, pendingintent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Status[i];
    }
}
