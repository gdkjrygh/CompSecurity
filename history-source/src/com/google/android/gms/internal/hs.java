// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hr, hf, hd

public class hs
    implements android.os.Parcelable.Creator
{

    public hs()
    {
    }

    static void a(hr hr1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, hr1.Dw, i, false);
        b.c(parcel, 1000, hr1.CK);
        b.a(parcel, 2, hr1.Dx);
        b.c(parcel, 3, hr1.Dy);
        b.a(parcel, 4, hr1.pc, false);
        b.a(parcel, 5, hr1.Dz, i, false);
        b.H(parcel, j);
    }

    public hr[] S(int i)
    {
        return new hr[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return s(parcel);
    }

    public Object[] newArray(int i)
    {
        return S(i);
    }

    public hr s(Parcel parcel)
    {
        int i = 0;
        hd hd1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        long l1 = 0L;
        String s1 = null;
        hf hf1 = null;
        int j = 0;
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
                    hf1 = (hf)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hf.CREATOR);
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
                    hd1 = (hd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hd.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new hr(j, hf1, l1, i, s1, hd1);
            }
        } while (true);
    }
}
