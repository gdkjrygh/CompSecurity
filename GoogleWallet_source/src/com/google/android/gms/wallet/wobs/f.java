// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            TextModuleData

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(TextModuleData textmoduledata, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, textmoduledata.getVersionCode());
        b.a(parcel, 2, textmoduledata.aVY, false);
        b.a(parcel, 3, textmoduledata.tU, false);
        b.J(parcel, i);
    }

    private static TextModuleData iz(Parcel parcel)
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
                return new TextModuleData(i, s, s1);
            }
        } while (true);
    }

    private static TextModuleData[] lz(int i)
    {
        return new TextModuleData[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iz(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lz(i);
    }
}
