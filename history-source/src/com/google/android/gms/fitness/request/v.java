// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.request:
//            u

public class v
    implements android.os.Parcelable.Creator
{

    public v()
    {
    }

    static void a(u u1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, u1.kb(), i, false);
        b.c(parcel, 1000, u1.getVersionCode());
        b.H(parcel, j);
    }

    public u bU(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        PendingIntent pendingintent = null;
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
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PendingIntent.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new u(i, pendingintent);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bU(parcel);
    }

    public u[] dp(int i)
    {
        return new u[i];
    }

    public Object[] newArray(int i)
    {
        return dp(i);
    }
}
