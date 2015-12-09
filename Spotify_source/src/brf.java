// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class brf
    implements android.os.Parcelable.Creator
{

    public brf()
    {
    }

    public static void a(Status status, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, status.f);
        brp.b(parcel, 1000, status.e);
        brp.a(parcel, 2, status.g);
        brp.a(parcel, 3, status.h, i);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int k = zza.a(parcel);
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
                    j = zza.e(parcel, l);
                    break;

                case 1000: 
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = zza.h(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
