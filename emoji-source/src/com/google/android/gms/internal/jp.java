// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jo

public class jp
    implements android.os.Parcelable.Creator
{

    public jp()
    {
    }

    static void a(jo jo1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, jo1.xM);
        b.a(parcel, 2, jo1.jj(), false);
        b.a(parcel, 3, jo1.getTag(), false);
        b.G(parcel, i);
    }

    public jo bw(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jo(i, s, s1);
            }
        } while (true);
    }

    public jo[] cR(int i)
    {
        return new jo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bw(parcel);
    }

    public Object[] newArray(int i)
    {
        return cR(i);
    }
}
