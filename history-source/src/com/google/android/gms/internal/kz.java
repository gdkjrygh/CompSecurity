// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ky, kv

public class kz
    implements android.os.Parcelable.Creator
{

    public kz()
    {
    }

    static void a(ky ky1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, ky1.getVersionCode());
        b.a(parcel, 2, ky1.ic(), false);
        b.a(parcel, 3, ky1.id(), i, false);
        b.H(parcel, j);
    }

    public ky Q(Parcel parcel)
    {
        kv kv1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.D(parcel, k);
                    break;

                case 3: // '\003'
                    kv1 = (kv)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kv.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ky(i, parcel1, kv1);
            }
        } while (true);
    }

    public ky[] aR(int i)
    {
        return new ky[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Q(parcel);
    }

    public Object[] newArray(int i)
    {
        return aR(i);
    }
}
