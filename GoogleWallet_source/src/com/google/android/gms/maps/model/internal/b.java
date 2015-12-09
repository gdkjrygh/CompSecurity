// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            a

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.gms.maps.model.internal.a a1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, a1.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, a1.qv());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, a1.qw(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, a1.getBitmap(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, j);
    }

    public static com.google.android.gms.maps.model.internal.a gB(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        byte byte0 = 0;
        int i = 0;
        android.os.Bundle bundle = null;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.maps.model.internal.a(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    private static com.google.android.gms.maps.model.internal.a[] ja(int i)
    {
        return new com.google.android.gms.maps.model.internal.a[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gB(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ja(i);
    }
}
