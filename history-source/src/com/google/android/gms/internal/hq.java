// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hp, hj

public class hq
    implements android.os.Parcelable.Creator
{

    public hq()
    {
    }

    static void a(hp hp1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, hp1.name, false);
        b.c(parcel, 1000, hp1.CK);
        b.a(parcel, 2, hp1.Dh, false);
        b.a(parcel, 3, hp1.Di);
        b.c(parcel, 4, hp1.weight);
        b.a(parcel, 5, hp1.Dj);
        b.a(parcel, 6, hp1.Dk, false);
        b.a(parcel, 7, hp1.Dl, i, false);
        b.a(parcel, 8, hp1.Dm, false);
        b.a(parcel, 11, hp1.Dn, false);
        b.H(parcel, j);
    }

    public hp[] R(int i)
    {
        return new hp[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return r(parcel);
    }

    public Object[] newArray(int i)
    {
        return R(i);
    }

    public hp r(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 1;
        int ai[] = null;
        hj ahj[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    ahj = (hj[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, hj.CREATOR);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.u(parcel, l);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new hp(j, s3, s2, flag1, i, flag, s1, ahj, ai, s);
            }
        } while (true);
    }
}
