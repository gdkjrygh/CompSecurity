// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

public final class kdo
    implements android.os.Parcelable.Creator
{

    public kdo()
    {
    }

    public static void a(ConnectionResult connectionresult, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, connectionresult.b);
        b.c(parcel, 2, connectionresult.c);
        b.a(parcel, 3, connectionresult.d, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
        PendingIntent pendingintent = null;
        int i = 0;
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
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, l);
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
                return new ConnectionResult(i, j, pendingintent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionResult[i];
    }
}
