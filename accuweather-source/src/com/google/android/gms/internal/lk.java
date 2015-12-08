// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            lj

public class lk
    implements android.os.Parcelable.Creator
{

    public lk()
    {
    }

    static void a(lj lj1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, lj1.getVersionCode());
        b.a(parcel, 2, lj1.akb, false);
        b.a(parcel, 3, lj1.akc, false);
        b.G(parcel, i);
    }

    public lj cf(Parcel parcel)
    {
        String as[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        byte abyte0[][] = (byte[][])null;
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
                    as = com.google.android.gms.common.internal.safeparcel.a.A(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new lj(i, as, abyte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cf(parcel);
    }

    public lj[] dL(int i)
    {
        return new lj[i];
    }

    public Object[] newArray(int i)
    {
        return dL(i);
    }
}
