// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            qy

public final class qz
    implements android.os.Parcelable.Creator
{

    public qz()
    {
    }

    static void a(qy qy1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, qy1.aCk);
        b.c(parcel, 1000, qy1.getVersionCode());
        b.a(parcel, 2, qy1.aCl);
        b.a(parcel, 3, qy1.aCm, false);
        b.a(parcel, 4, qy1.aCn);
        b.a(parcel, 5, qy1.aCo, false);
        b.J(parcel, i);
    }

    public static qy gI(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new qy(i, flag2, flag1, flag, s, bundle);
            }
        } while (true);
    }

    private static qy[] jj(int i)
    {
        return new qy[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gI(parcel);
    }

    public final Object[] newArray(int i)
    {
        return jj(i);
    }
}
