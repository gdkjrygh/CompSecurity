// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            iv

public class iw
    implements android.os.Parcelable.Creator
{

    public iw()
    {
    }

    static void a(iv iv1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, iv1.getVersionCode());
        b.a(parcel, 2, iv1.acs, false);
        b.F(parcel, i);
    }

    public iv bl(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        int ai[] = null;
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
                    ai = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new iv(i, ai);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bl(parcel);
    }

    public iv[] cx(int i)
    {
        return new iv[i];
    }

    public Object[] newArray(int i)
    {
        return cx(i);
    }
}
