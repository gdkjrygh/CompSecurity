// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            pf, pd

public class pg
    implements android.os.Parcelable.Creator
{

    public pg()
    {
    }

    static void a(pf pf1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        Set set = pf1.aon;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, pf1.CK);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, pf1.CE, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, pf1.api, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, pf1.apa, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, pf1.apj, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, pf1.vc, true);
        }
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dy(parcel);
    }

    public pf dy(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        pd pd1 = null;
        String s1 = null;
        pd pd2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    pd2 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, pd.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    pd1 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, pd.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new pf(hashset, i, s2, pd2, s1, pd1, s);
            }
        } while (true);
    }

    public pf[] fw(int i)
    {
        return new pf[i];
    }

    public Object[] newArray(int i)
    {
        return fw(i);
    }
}
