// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hu

public class ia
    implements android.os.Parcelable.Creator
{

    public ia()
    {
    }

    static void a(hz.a a1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, a1.getVersionCode());
        b.c(parcel, 2, a1.fz());
        b.a(parcel, 3, a1.fF());
        b.c(parcel, 4, a1.fA());
        b.a(parcel, 5, a1.fG());
        b.a(parcel, 6, a1.fH(), false);
        b.c(parcel, 7, a1.fI());
        b.a(parcel, 8, a1.fK(), false);
        b.a(parcel, 9, a1.fM(), i, false);
        b.G(parcel, j);
    }

    public hz.a H(Parcel parcel)
    {
        hu hu1 = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 9: // '\t'
                    hu1 = (hu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, hu.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new hz.a(l, k, flag1, j, flag, s1, i, s, hu1);
            }
        } while (true);
    }

    public hz.a[] aw(int i)
    {
        return new hz.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return H(parcel);
    }

    public Object[] newArray(int i)
    {
        return aw(i);
    }
}
