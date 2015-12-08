// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hs, hg, he

public class ht
    implements android.os.Parcelable.Creator
{

    public ht()
    {
    }

    static void a(hs hs1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.a(parcel, 1, hs1.CD, i, false);
        b.c(parcel, 1000, hs1.BR);
        b.a(parcel, 2, hs1.CE);
        b.c(parcel, 3, hs1.CF);
        b.a(parcel, 4, hs1.oT, false);
        b.a(parcel, 5, hs1.CG, i, false);
        b.H(parcel, j);
    }

    public hs[] R(int i)
    {
        return new hs[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return s(parcel);
    }

    public Object[] newArray(int i)
    {
        return R(i);
    }

    public hs s(Parcel parcel)
    {
        int i = 0;
        he he1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        long l1 = 0L;
        String s1 = null;
        hg hg1 = null;
        int j = 0;
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
                    hg1 = (hg)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hg.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 5: // '\005'
                    he1 = (he)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, he.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new hs(j, hg1, l1, i, s1, he1);
            }
        } while (true);
    }
}
