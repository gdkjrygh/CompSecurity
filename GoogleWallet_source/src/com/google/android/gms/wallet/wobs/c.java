// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LabelValueRow, LabelValue

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(LabelValueRow labelvaluerow, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, labelvaluerow.getVersionCode());
        b.a(parcel, 2, labelvaluerow.aVL, false);
        b.a(parcel, 3, labelvaluerow.aVM, false);
        b.d(parcel, 4, labelvaluerow.aVN, false);
        b.J(parcel, i);
    }

    private static LabelValueRow iw(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        java.util.ArrayList arraylist = com.google.android.gms.common.util.a.ji();
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

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, LabelValue.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LabelValueRow(i, s, s1, arraylist);
            }
        } while (true);
    }

    private static LabelValueRow[] lw(int i)
    {
        return new LabelValueRow[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iw(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lw(i);
    }
}
