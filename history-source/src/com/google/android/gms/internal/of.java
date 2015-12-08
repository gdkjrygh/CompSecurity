// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            oe

public class of
    implements android.os.Parcelable.Creator
{

    public of()
    {
    }

    static void a(oe oe1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, oe1.vc, false);
        b.c(parcel, 1000, oe1.CK);
        b.c(parcel, 2, oe1.ake);
        b.H(parcel, i);
    }

    public oe cV(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
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
                return new oe(i, s, j);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cV(parcel);
    }

    public oe[] eR(int i)
    {
        return new oe[i];
    }

    public Object[] newArray(int i)
    {
        return eR(i);
    }
}
