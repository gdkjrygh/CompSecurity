// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            a

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.gms.maps.model.internal.a a1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, a1.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, a1.oh());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, a1.oi(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, a1.getBitmap(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dp(parcel);
    }

    public com.google.android.gms.maps.model.internal.a dp(Parcel parcel)
    {
        Bitmap bitmap = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.maps.model.internal.a(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public com.google.android.gms.maps.model.internal.a[] fl(int i)
    {
        return new com.google.android.gms.maps.model.internal.a[i];
    }

    public Object[] newArray(int i)
    {
        return fl(i);
    }
}
