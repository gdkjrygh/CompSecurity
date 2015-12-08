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
//            fs, fq

public class ft
    implements android.os.Parcelable.Creator
{

    public ft()
    {
    }

    static void a(fs fs1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        Set set = fs1.di();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, fs1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, fs1.getId(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, fs1.dz(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, fs1.getStartDate(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, fs1.dA(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, fs1.getType(), true);
        }
        b.C(parcel, j);
    }

    public fs C(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        fq fq1 = null;
        String s1 = null;
        fq fq2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    fq2 = (fq)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, fq.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    fq1 = (fq)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, fq.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new fs(hashset, i, s2, fq2, s1, fq1, s);
            }
        } while (true);
    }

    public fs[] ah(int i)
    {
        return new fs[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return C(parcel);
    }

    public Object[] newArray(int i)
    {
        return ah(i);
    }
}
