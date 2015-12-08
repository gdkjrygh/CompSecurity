// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bty
    implements android.os.Parcelable.Creator
{

    public bty()
    {
    }

    public static void a(ConnectionResult connectionresult, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, connectionresult.b);
        brp.b(parcel, 2, connectionresult.c);
        brp.a(parcel, 3, connectionresult.d, i);
        brp.a(parcel, 4, connectionresult.e);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        PendingIntent pendingintent = null;
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.h(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ConnectionResult(i, j, pendingintent, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionResult[i];
    }
}
