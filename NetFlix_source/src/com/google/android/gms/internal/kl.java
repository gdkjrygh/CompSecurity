// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            kk

public class kl
    implements android.os.Parcelable.Creator
{

    public kl()
    {
    }

    static void a(kk kk1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, kk1.xH);
        b.a(parcel, 2, kk1.getId(), false);
        b.a(parcel, 3, kk1.getDisplayName(), false);
        b.F(parcel, i);
    }

    public kk bz(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new kk(i, s, s1);
            }
        } while (true);
    }

    public kk[] cO(int i)
    {
        return new kk[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bz(parcel);
    }

    public Object[] newArray(int i)
    {
        return cO(i);
    }
}
