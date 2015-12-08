// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Subscription;

// Referenced classes of package com.google.android.gms.fitness.request:
//            af

public class ag
    implements android.os.Parcelable.Creator
{

    public ag()
    {
    }

    static void a(af af1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, af1.kn(), i, false);
        b.c(parcel, 1000, af1.getVersionCode());
        b.a(parcel, 2, af1.ko());
        b.H(parcel, j);
    }

    public af ca(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        Subscription subscription = null;
        int i = 0;
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
                    subscription = (Subscription)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Subscription.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new af(i, subscription, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ca(parcel);
    }

    public af[] dv(int i)
    {
        return new af[i];
    }

    public Object[] newArray(int i)
    {
        return dv(i);
    }
}
