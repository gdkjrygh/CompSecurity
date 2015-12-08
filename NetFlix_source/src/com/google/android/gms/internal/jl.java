// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jk

public class jl
    implements android.os.Parcelable.Creator
{

    public jl()
    {
    }

    static void a(jk jk1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, jk1.getVersionCode());
        b.a(parcel, 2, jk1.label, false);
        b.a(parcel, 3, jk1.value, false);
        b.F(parcel, i);
    }

    public jk bq(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jk(i, s, s1);
            }
        } while (true);
    }

    public jk[] cE(int i)
    {
        return new jk[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bq(parcel);
    }

    public Object[] newArray(int i)
    {
        return cE(i);
    }
}
