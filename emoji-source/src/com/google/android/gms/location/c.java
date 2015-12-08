// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            b

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(com.google.android.gms.location.b b1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, b1.Vq);
        b.c(parcel, 1000, b1.getVersionCode());
        b.c(parcel, 2, b1.Vr);
        b.a(parcel, 3, b1.Vs);
        b.G(parcel, i);
    }

    public com.google.android.gms.location.b bs(Parcel parcel)
    {
        int i = 1;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int k = 0;
        long l1 = 0L;
        int j = 1;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new com.google.android.gms.location.b(k, j, i, l1);
            }
        } while (true);
    }

    public com.google.android.gms.location.b[] cL(int i)
    {
        return new com.google.android.gms.location.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bs(parcel);
    }

    public Object[] newArray(int i)
    {
        return cL(i);
    }
}
