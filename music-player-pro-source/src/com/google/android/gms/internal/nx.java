// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            nw

public class nx
    implements android.os.Parcelable.Creator
{

    public nx()
    {
    }

    static void a(nw nw1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, nw1.CK);
        b.a(parcel, 2, nw1.nw(), false);
        b.a(parcel, 3, nw1.getTag(), false);
        b.a(parcel, 4, nw1.getSource(), false);
        b.H(parcel, i);
    }

    public nw cR(Parcel parcel)
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new nw(i, s, s1, s2);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cR(parcel);
    }

    public nw[] eN(int i)
    {
        return new nw[i];
    }

    public Object[] newArray(int i)
    {
        return eN(i);
    }
}
