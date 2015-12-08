// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jd

public class jk
    implements android.os.Parcelable.Creator
{

    public jk()
    {
    }

    static void a(ji.a a1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, a1.getVersionCode());
        b.c(parcel, 2, a1.hd());
        b.a(parcel, 3, a1.hj());
        b.c(parcel, 4, a1.he());
        b.a(parcel, 5, a1.hk());
        b.a(parcel, 6, a1.hl(), false);
        b.c(parcel, 7, a1.hm());
        b.a(parcel, 8, a1.ho(), false);
        b.a(parcel, 9, a1.hq(), i, false);
        b.H(parcel, j);
    }

    public ji.a I(Parcel parcel)
    {
        jd jd1 = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
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
                int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(j1))
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
                    jd1 = (jd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, jd.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ji.a(l, k, flag1, j, flag, s1, i, s, jd1);
            }
        } while (true);
    }

    public ji.a[] aI(int i)
    {
        return new ji.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return I(parcel);
    }

    public Object[] newArray(int i)
    {
        return aI(i);
    }
}
