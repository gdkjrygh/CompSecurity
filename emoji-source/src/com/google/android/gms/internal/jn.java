// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jm, js, jw

public class jn
    implements android.os.Parcelable.Creator
{

    public jn()
    {
    }

    static void a(jm jm1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.b(parcel, 1, jm1.Wc, false);
        b.c(parcel, 1000, jm1.xM);
        b.a(parcel, 2, jm1.jg(), false);
        b.a(parcel, 3, jm1.jh());
        b.b(parcel, 4, jm1.Wf, false);
        b.a(parcel, 5, jm1.ji(), false);
        b.a(parcel, 6, jm1.Wh, false);
        b.G(parcel, i);
    }

    public jm bv(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, js.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, jw.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jm(i, arraylist2, s1, flag, arraylist1, s, arraylist);
            }
        } while (true);
    }

    public jm[] cQ(int i)
    {
        return new jm[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bv(parcel);
    }

    public Object[] newArray(int i)
    {
        return cQ(i);
    }
}
