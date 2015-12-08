// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ju

public class jv
    implements android.os.Parcelable.Creator
{

    public jv()
    {
    }

    static void a(ju ju1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, ju1.getVersionCode());
        b.a(parcel, 2, ju1.ado);
        b.a(parcel, 3, ju1.adp);
        b.F(parcel, i);
    }

    public ju bv(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        long l1 = 0L;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ju(i, l1, l);
            }
        } while (true);
    }

    public ju[] cJ(int i)
    {
        return new ju[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bv(parcel);
    }

    public Object[] newArray(int i)
    {
        return cJ(i);
    }
}
