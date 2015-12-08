// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            mj, mp, mt

public class mk
    implements android.os.Parcelable.Creator
{

    public mk()
    {
    }

    static void a(mj mj1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, mj1.afr, false);
        b.c(parcel, 1000, mj1.BR);
        b.a(parcel, 2, mj1.mi(), false);
        b.a(parcel, 3, mj1.mj());
        b.c(parcel, 4, mj1.afu, false);
        b.b(parcel, 6, mj1.afv, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cz(parcel);
    }

    public mj cz(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, mp.CREATOR);
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
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, mt.CREATOR);
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
                return new mj(i, arraylist2, s, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    public mj[] ep(int i)
    {
        return new mj[i];
    }

    public Object[] newArray(int i)
    {
        return ep(i);
    }
}
