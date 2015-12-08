// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            UriData

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(UriData uridata, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, uridata.getVersionCode());
        b.a(parcel, 2, uridata.aRz, false);
        b.a(parcel, 3, uridata.description, false);
        b.J(parcel, i);
    }

    private static UriData iB(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UriData(i, s, s1);
            }
        } while (true);
    }

    private static UriData[] lB(int i)
    {
        return new UriData[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iB(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lB(i);
    }
}
