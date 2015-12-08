// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jn, jt, jx

public class jo
    implements android.os.Parcelable.Creator
{

    public jo()
    {
    }

    static void a(jn jn1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.b(parcel, 1, jn1.VZ, false);
        b.c(parcel, 1000, jn1.xJ);
        b.a(parcel, 2, jn1.jb(), false);
        b.a(parcel, 3, jn1.jc());
        b.b(parcel, 4, jn1.Wc, false);
        b.a(parcel, 5, jn1.jd(), false);
        b.a(parcel, 6, jn1.We, false);
        b.G(parcel, i);
    }

    public jn bv(Parcel parcel)
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, jt.CREATOR);
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
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, jx.CREATOR);
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
                return new jn(i, arraylist2, s1, flag, arraylist1, s, arraylist);
            }
        } while (true);
    }

    public jn[] cQ(int i)
    {
        return new jn[i];
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
