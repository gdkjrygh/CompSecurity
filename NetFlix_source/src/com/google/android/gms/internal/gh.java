// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            gg, gd

public class gh
    implements android.os.Parcelable.Creator
{

    public gh()
    {
    }

    static void a(gg gg1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, gg1.getVersionCode());
        b.a(parcel, 2, gg1.fq(), false);
        b.a(parcel, 3, gg1.fr(), i, false);
        b.F(parcel, j);
    }

    public gg[] Z(int i)
    {
        return new gg[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return x(parcel);
    }

    public Object[] newArray(int i)
    {
        return Z(i);
    }

    public gg x(Parcel parcel)
    {
        gd gd1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;

                case 3: // '\003'
                    gd1 = (gd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, gd.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new gg(i, parcel1, gd1);
            }
        } while (true);
    }
}
