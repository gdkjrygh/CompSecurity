// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            nu, oa, oe

public class nv
    implements android.os.Parcelable.Creator
{

    public nv()
    {
    }

    static void a(nu nu1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, nu1.ahn, false);
        b.c(parcel, 1000, nu1.CK);
        b.a(parcel, 2, nu1.nu(), false);
        b.a(parcel, 3, nu1.nv());
        b.c(parcel, 4, nu1.aht, false);
        b.b(parcel, 6, nu1.ahu, false);
        b.H(parcel, i);
    }

    public nu cQ(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, oa.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, oe.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new nu(i, arraylist2, s, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cQ(parcel);
    }

    public nu[] eM(int i)
    {
        return new nu[i];
    }

    public Object[] newArray(int i)
    {
        return eM(i);
    }
}
