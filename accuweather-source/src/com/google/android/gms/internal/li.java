// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            lh

public class li
    implements android.os.Parcelable.Creator
{

    public li()
    {
    }

    static void a(lh lh1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, lh1.getVersionCode());
        b.a(parcel, 2, lh1.aka, false);
        b.G(parcel, i);
    }

    public lh ce(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        int ai[] = null;
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
                    ai = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new lh(i, ai);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ce(parcel);
    }

    public lh[] dK(int i)
    {
        return new lh[i];
    }

    public Object[] newArray(int i)
    {
        return dK(i);
    }
}
