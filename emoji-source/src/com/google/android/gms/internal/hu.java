// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ht, hv

public class hu
    implements android.os.Parcelable.Creator
{

    public hu()
    {
    }

    static void a(ht ht1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, ht1.getVersionCode());
        b.a(parcel, 2, ht1.fB(), i, false);
        b.G(parcel, j);
    }

    public ht E(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        hv hv1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    hv1 = (hv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, hv.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ht(i, hv1);
            }
        } while (true);
    }

    public ht[] at(int i)
    {
        return new ht[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return E(parcel);
    }

    public Object[] newArray(int i)
    {
        return at(i);
    }
}
