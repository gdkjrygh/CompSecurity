// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common:
//            ConnectionResult

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(ConnectionResult connectionresult, Parcel parcel, int j)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, connectionresult.b);
        b.a(parcel, 2, connectionresult.c());
        b.a(parcel, 3, connectionresult.d(), j);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        PendingIntent pendingintent = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ConnectionResult(j, k, pendingintent);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new ConnectionResult[j];
    }
}
