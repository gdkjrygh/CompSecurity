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
//            kp, kn

public class kq
    implements android.os.Parcelable.Creator
{

    public kq()
    {
    }

    static void a(kp kp1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        Set set = kp1.kk();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, kp1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, kp1.getId(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, kp1.kB(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, kp1.getStartDate(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, kp1.kC(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, kp1.getType(), true);
        }
        b.G(parcel, j);
    }

    public kp bF(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        kn kn1 = null;
        String s1 = null;
        kn kn2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
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
                    kn2 = (kn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kn.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    kn1 = (kn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kn.CREATOR);
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
                return new kp(hashset, i, s2, kn2, s1, kn1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bF(parcel);
    }

    public kp[] dc(int i)
    {
        return new kp[i];
    }

    public Object[] newArray(int i)
    {
        return dc(i);
    }
}
