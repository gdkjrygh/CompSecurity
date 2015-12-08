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
//            nw, nu

public class nx
    implements android.os.Parcelable.Creator
{

    public nx()
    {
    }

    static void a(nw nw1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        Set set = nw1.amc;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, nw1.BR);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, nw1.BL, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, nw1.amX, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, nw1.amP, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, nw1.amY, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, nw1.uO, true);
        }
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dc(parcel);
    }

    public nw dc(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        nu nu1 = null;
        String s1 = null;
        nu nu2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
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
                    nu2 = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, nu.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    nu1 = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, nu.CREATOR);
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
                return new nw(hashset, i, s2, nu2, s1, nu1, s);
            }
        } while (true);
    }

    public nw[] eU(int i)
    {
        return new nw[i];
    }

    public Object[] newArray(int i)
    {
        return eU(i);
    }
}
