// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            or

public class ot
    implements android.os.Parcelable.Creator
{

    public ot()
    {
    }

    static void a(or or1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, or1.versionCode);
        b.a(parcel, 2, or1.amW);
        b.a(parcel, 3, or1.tag, false);
        b.a(parcel, 4, or1.amX, false);
        b.a(parcel, 5, or1.amY, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dt(parcel);
    }

    public or dt(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        long l = 0L;
        byte abyte0[] = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new or(i, l, s, abyte0, bundle);
            }
        } while (true);
    }

    public or[] fq(int i)
    {
        return new or[i];
    }

    public Object[] newArray(int i)
    {
        return fq(i);
    }
}
