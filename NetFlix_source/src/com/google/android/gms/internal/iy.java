// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ix

public class iy
    implements android.os.Parcelable.Creator
{

    public iy()
    {
    }

    static void a(ix ix1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, ix1.getVersionCode());
        b.a(parcel, 2, ix1.act, false);
        b.a(parcel, 3, ix1.acu, false);
        b.F(parcel, i);
    }

    public ix bm(Parcel parcel)
    {
        String as[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        byte abyte0[][] = (byte[][])null;
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
                    as = com.google.android.gms.common.internal.safeparcel.a.z(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ix(i, as, abyte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bm(parcel);
    }

    public ix[] cy(int i)
    {
        return new ix[i];
    }

    public Object[] newArray(int i)
    {
        return cy(i);
    }
}
