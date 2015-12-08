// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.plus.internal:
//            h, PlusCommonExtras

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(h h1, Parcel parcel, int j)
    {
        int k = b.H(parcel);
        b.a(parcel, 1, h1.getAccountName(), false);
        b.c(parcel, 1000, h1.getVersionCode());
        b.a(parcel, 2, h1.oz(), false);
        b.a(parcel, 3, h1.oA(), false);
        b.a(parcel, 4, h1.oB(), false);
        b.a(parcel, 5, h1.oC(), false);
        b.a(parcel, 6, h1.oD(), false);
        b.a(parcel, 7, h1.oE(), false);
        b.a(parcel, 8, h1.oF(), false);
        b.a(parcel, 9, h1.oG(), j, false);
        b.H(parcel, k);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dw(parcel);
    }

    public h dw(Parcel parcel)
    {
        PlusCommonExtras pluscommonextras = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String as[] = null;
        String as1[] = null;
        String as2[] = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    as2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, l);
                    break;

                case 3: // '\003'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, l);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.a.A(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 9: // '\t'
                    pluscommonextras = (PlusCommonExtras)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PlusCommonExtras.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new h(j, s4, as2, as1, as, s3, s2, s1, s, pluscommonextras);
            }
        } while (true);
    }

    public h[] fu(int j)
    {
        return new h[j];
    }

    public Object[] newArray(int j)
    {
        return fu(j);
    }
}
