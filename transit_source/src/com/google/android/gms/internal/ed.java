// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ec, dz

public class ed
    implements android.os.Parcelable.Creator
{

    public ed()
    {
    }

    static void a(ec ec1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, ec1.getVersionCode());
        b.a(parcel, 2, ec1.bH(), false);
        b.a(parcel, 3, ec1.bI(), i, false);
        b.C(parcel, j);
    }

    public ec[] G(int i)
    {
        return new ec[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return s(parcel);
    }

    public Object[] newArray(int i)
    {
        return G(i);
    }

    public ec s(Parcel parcel)
    {
        dz dz1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        Parcel parcel1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, k);
                    break;

                case 3: // '\003'
                    dz1 = (dz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, dz.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ec(i, parcel1, dz1);
            }
        } while (true);
    }
}
