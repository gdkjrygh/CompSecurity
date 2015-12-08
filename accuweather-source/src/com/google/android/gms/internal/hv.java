// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hu, hw

public class hv
    implements android.os.Parcelable.Creator
{

    public hv()
    {
    }

    static void a(hu hu1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, hu1.getVersionCode());
        b.a(parcel, 2, hu1.fw(), i, false);
        b.G(parcel, j);
    }

    public hu E(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        hw hw1 = null;
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
                    hw1 = (hw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, hw.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new hu(i, hw1);
            }
        } while (true);
    }

    public hu[] at(int i)
    {
        return new hu[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return E(parcel);
    }

    public Object[] newArray(int i)
    {
        return at(i);
    }
}
