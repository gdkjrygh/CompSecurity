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
//            ie, ic

public class if
    implements android.os.Parcelable.Creator
{

    public if()
    {
    }

    static void a(ie ie1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        Set set = ie1.ja();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, ie1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, ie1.getId(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, ie1.jr(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, ie1.getStartDate(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, ie1.js(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, ie1.getType(), true);
        }
        b.F(parcel, j);
    }

    public ie aM(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        ic ic1 = null;
        String s1 = null;
        ic ic2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    ic2 = (ic)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ic.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    ic1 = (ic)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ic.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ie(hashset, i, s2, ic2, s1, ic1, s);
            }
        } while (true);
    }

    public ie[] bP(int i)
    {
        return new ie[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aM(parcel);
    }

    public Object[] newArray(int i)
    {
        return bP(i);
    }
}
