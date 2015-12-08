// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jp, jm

public class jq
    implements android.os.Parcelable.Creator
{

    public jq()
    {
    }

    static void a(jp jp1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, jp1.getVersionCode());
        b.a(parcel, 2, jp1.hx(), false);
        b.a(parcel, 3, jp1.hy(), i, false);
        b.H(parcel, j);
    }

    public jp M(Parcel parcel)
    {
        jm jm1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 0;
        Parcel parcel1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
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
                    jm1 = (jm)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jm.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jp(i, parcel1, jm1);
            }
        } while (true);
    }

    public jp[] aM(int i)
    {
        return new jp[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return M(parcel);
    }

    public Object[] newArray(int i)
    {
        return aM(i);
    }
}
