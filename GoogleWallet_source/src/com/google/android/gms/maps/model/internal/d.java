// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            c

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(c c1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, c1.getVersionCode());
        b.c(parcel, 2, c1.getType());
        b.a(parcel, 3, c1.qw(), false);
        b.J(parcel, i);
    }

    public static c gC(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new c(i, j, bundle);
            }
        } while (true);
    }

    private static c[] jb(int i)
    {
        return new c[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gC(parcel);
    }

    public final Object[] newArray(int i)
    {
        return jb(i);
    }
}
