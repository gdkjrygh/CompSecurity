// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            l

public class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(l l1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, l1.getVersionCode());
        b.a(parcel, 2, l1.awU);
        b.a(parcel, 3, l1.awV);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ei(parcel);
    }

    public l ei(Parcel parcel)
    {
        long l1 = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        long l2 = 0L;
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
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new l(i, l2, l1);
            }
        } while (true);
    }

    public l[] gr(int i)
    {
        return new l[i];
    }

    public Object[] newArray(int i)
    {
        return gr(i);
    }
}
