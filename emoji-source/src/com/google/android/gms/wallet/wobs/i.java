// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            f, g, l

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(f f1, Parcel parcel, int j)
    {
        int k = b.C(parcel);
        b.c(parcel, 1, f1.getVersionCode());
        b.a(parcel, 2, f1.label, false);
        b.a(parcel, 3, f1.akS, j, false);
        b.a(parcel, 4, f1.type, false);
        b.a(parcel, 5, f1.ajs, j, false);
        b.G(parcel, k);
    }

    public f cn(Parcel parcel)
    {
        l l1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s = null;
        g g1 = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    g1 = (g)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, g.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = (l)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, l.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new f(j, s1, g1, s, l1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cn(parcel);
    }

    public f[] dV(int j)
    {
        return new f[j];
    }

    public Object[] newArray(int j)
    {
        return dV(j);
    }
}
