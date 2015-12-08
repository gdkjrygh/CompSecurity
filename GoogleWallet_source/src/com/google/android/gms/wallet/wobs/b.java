// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LabelValue

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(LabelValue labelvalue, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, labelvalue.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, labelvalue.label, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, labelvalue.value, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    private static LabelValue iv(Parcel parcel)
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
                return new LabelValue(i, s, s1);
            }
        } while (true);
    }

    private static LabelValue[] lv(int i)
    {
        return new LabelValue[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iv(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lv(i);
    }
}
