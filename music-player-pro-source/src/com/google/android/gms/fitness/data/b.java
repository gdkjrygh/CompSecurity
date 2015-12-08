// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.fitness.data:
//            a

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.gms.fitness.data.a a1, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, a1.getPackageName(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, a1.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, a1.getVersion(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, a1.jk(), false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public com.google.android.gms.fitness.data.a bq(Parcel parcel)
    {
        String s2 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s1 = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.fitness.data.a(i, s, s1, s2);
            }
        } while (true);
    }

    public com.google.android.gms.fitness.data.a[] cH(int i)
    {
        return new com.google.android.gms.fitness.data.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bq(parcel);
    }

    public Object[] newArray(int i)
    {
        return cH(i);
    }
}
