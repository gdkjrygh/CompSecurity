// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jk, jm

public class jl
    implements android.os.Parcelable.Creator
{

    public jl()
    {
    }

    static void a(jk jk1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, jk1.jc());
        b.c(parcel, 1000, jk1.getVersionCode());
        b.c(parcel, 2, jk1.je());
        b.a(parcel, 3, jk1.jf(), i, false);
        b.G(parcel, j);
    }

    public jk bu(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int k = -1;
        jm jm1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    jm1 = (jm)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, jm.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new jk(i, j, k, jm1);
            }
        } while (true);
    }

    public jk[] cP(int i)
    {
        return new jk[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bu(parcel);
    }

    public Object[] newArray(int i)
    {
        return cP(i);
    }
}
