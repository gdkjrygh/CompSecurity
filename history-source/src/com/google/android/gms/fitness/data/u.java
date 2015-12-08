// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Value

public class u
    implements android.os.Parcelable.Creator
{

    public u()
    {
    }

    static void a(Value value, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, value.getFormat());
        b.c(parcel, 1000, value.getVersionCode());
        b.a(parcel, 2, value.isSet());
        b.a(parcel, 3, value.jL());
        b.H(parcel, i);
    }

    public Value bF(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        float f = 0.0F;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 3: // '\003'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Value(i, j, flag, f);
            }
        } while (true);
    }

    public Value[] cZ(int i)
    {
        return new Value[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bF(parcel);
    }

    public Object[] newArray(int i)
    {
        return cZ(i);
    }
}
