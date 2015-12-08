// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            bj

public class bk
    implements android.os.Parcelable.Creator
{

    public bk()
    {
    }

    static void a(bj bj1, Parcel parcel, int j)
    {
        j = b.H(parcel);
        b.c(parcel, 1, bj1.versionCode);
        b.c(parcel, 2, bj1.oQ);
        b.c(parcel, 3, bj1.backgroundColor);
        b.c(parcel, 4, bj1.oR);
        b.c(parcel, 5, bj1.oS);
        b.c(parcel, 6, bj1.oT);
        b.c(parcel, 7, bj1.oU);
        b.c(parcel, 8, bj1.oV);
        b.c(parcel, 9, bj1.oW);
        b.a(parcel, 10, bj1.oX, false);
        b.c(parcel, 11, bj1.oY);
        b.a(parcel, 12, bj1.oZ, false);
        b.c(parcel, 13, bj1.pa);
        b.c(parcel, 14, bj1.pb);
        b.a(parcel, 15, bj1.pc, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return d(parcel);
    }

    public bj d(Parcel parcel)
    {
        int j3 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i3 = 0;
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        String s2 = null;
        int l = 0;
        String s1 = null;
        int k = 0;
        int j = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j3)
            {
                int k3 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k3))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k3);
                    break;

                case 1: // '\001'
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 3: // '\003'
                    k2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 4: // '\004'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 5: // '\005'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 7: // '\007'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 8: // '\b'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 9: // '\t'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k3);
                    break;

                case 11: // '\013'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k3);
                    break;

                case 13: // '\r'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 14: // '\016'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k3);
                    break;
                }
            } else
            if (parcel.dataPosition() != j3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j3).toString(), parcel);
            } else
            {
                return new bj(i3, l2, k2, j2, i2, l1, k1, j1, i1, s2, l, s1, k, j, s);
            }
        } while (true);
    }

    public bj[] i(int j)
    {
        return new bj[j];
    }

    public Object[] newArray(int j)
    {
        return i(j);
    }
}
