// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jt

public class ju
    implements android.os.Parcelable.Creator
{

    public ju()
    {
    }

    static void a(jt jt1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.a(parcel, 1, jt1.qU, false);
        b.c(parcel, 1000, jt1.xJ);
        b.G(parcel, i);
    }

    public jt by(Parcel parcel)
    {
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jt(i, s);
            }
        } while (true);
    }

    public jt[] cT(int i)
    {
        return new jt[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return by(parcel);
    }

    public Object[] newArray(int i)
    {
        return cT(i);
    }
}
