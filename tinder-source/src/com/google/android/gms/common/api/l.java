// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.api:
//            Status

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(Status status, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, status.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, status.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, status.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, status.i, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
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
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, i1);
                    break;

                case 1000: 
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, i1);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)zza.a(parcel, i1, PendingIntent.CREATOR);
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
