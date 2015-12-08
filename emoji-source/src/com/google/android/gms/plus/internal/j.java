// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.plus.internal:
//            h, PlusCommonExtras

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(h h1, Parcel parcel, int i)
    {
        int k = b.C(parcel);
        b.a(parcel, 1, h1.getAccountName(), false);
        b.c(parcel, 1000, h1.getVersionCode());
        b.a(parcel, 2, h1.jZ(), false);
        b.a(parcel, 3, h1.ka(), false);
        b.a(parcel, 4, h1.kb(), false);
        b.a(parcel, 5, h1.kc(), false);
        b.a(parcel, 6, h1.kd(), false);
        b.a(parcel, 7, h1.ke(), false);
        b.a(parcel, 8, h1.kf(), false);
        b.a(parcel, 9, h1.kg(), i, false);
        b.G(parcel, k);
    }

    public h bD(Parcel parcel)
    {
        PlusCommonExtras pluscommonextras = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
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
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
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
                return new h(i, s4, as2, as1, as, s3, s2, s1, s, pluscommonextras);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bD(parcel);
    }

    public h[] da(int i)
    {
        return new h[i];
    }

    public Object[] newArray(int i)
    {
        return da(i);
    }
}
