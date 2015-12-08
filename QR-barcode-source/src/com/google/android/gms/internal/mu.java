// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            mt

public class mu
    implements android.os.Parcelable.Creator
{

    public mu()
    {
    }

    static void a(mt mt1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.a(parcel, 1, mt1.uO, false);
        b.c(parcel, 1000, mt1.BR);
        b.c(parcel, 2, mt1.aig);
        b.H(parcel, i);
    }

    public mt cE(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new mt(i, s, j);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cE(parcel);
    }

    public mt[] eu(int i)
    {
        return new mt[i];
    }

    public Object[] newArray(int i)
    {
        return eu(i);
    }
}
