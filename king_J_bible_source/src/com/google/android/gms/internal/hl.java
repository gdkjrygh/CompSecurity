// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hk, hg

public class hl
    implements android.os.Parcelable.Creator
{

    public hl()
    {
    }

    static void a(hk hk1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1000, hk1.xH);
        b.a(parcel, 2, hk1.hZ(), i, false);
        b.a(parcel, 3, hk1.getInterval());
        b.c(parcel, 4, hk1.getPriority());
        b.F(parcel, j);
    }

    public hk aF(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int j = 0;
        hg hg1 = null;
        long l1 = hk.OF;
        int i = 102;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    hg1 = (hg)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hg.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new hk(j, hg1, l1, i);
            }
        } while (true);
    }

    public hk[] bG(int i)
    {
        return new hk[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aF(parcel);
    }

    public Object[] newArray(int i)
    {
        return bG(i);
    }
}
