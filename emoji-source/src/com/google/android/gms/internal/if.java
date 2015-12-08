// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ie, ib

public class if
    implements android.os.Parcelable.Creator
{

    public if()
    {
    }

    static void a(ie ie1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, ie1.getVersionCode());
        b.a(parcel, 2, ie1.fY(), false);
        b.a(parcel, 3, ie1.fZ(), i, false);
        b.G(parcel, j);
    }

    public ie L(Parcel parcel)
    {
        ib ib1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        Parcel parcel1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 3: // '\003'
                    ib1 = (ib)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ib.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ie(i, parcel1, ib1);
            }
        } while (true);
    }

    public ie[] aA(int i)
    {
        return new ie[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return L(parcel);
    }

    public Object[] newArray(int i)
    {
        return aA(i);
    }
}
