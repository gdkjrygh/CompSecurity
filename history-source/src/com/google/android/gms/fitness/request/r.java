// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.request:
//            q

public class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(q q1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, q1.kg(), false);
        b.c(parcel, 1000, q1.getVersionCode());
        b.a(parcel, 2, q1.kb(), i, false);
        b.H(parcel, j);
    }

    public q bR(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new q(i, ibinder, pendingintent);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bR(parcel);
    }

    public q[] dm(int i)
    {
        return new q[i];
    }

    public Object[] newArray(int i)
    {
        return dm(i);
    }
}
