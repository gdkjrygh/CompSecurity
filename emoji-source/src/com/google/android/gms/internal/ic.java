// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ib

public class ic
    implements android.os.Parcelable.Creator
{

    public ic()
    {
    }

    static void a(ib ib1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, ib1.getVersionCode());
        b.b(parcel, 2, ib1.fV(), false);
        b.a(parcel, 3, ib1.fW(), false);
        b.G(parcel, i);
    }

    public ib J(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, ib.a.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ib(i, arraylist, s);
            }
        } while (true);
    }

    public ib[] ay(int i)
    {
        return new ib[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return J(parcel);
    }

    public Object[] newArray(int i)
    {
        return ay(i);
    }
}
