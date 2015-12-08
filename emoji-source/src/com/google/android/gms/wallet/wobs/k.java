// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            j

public class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(j j1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, j1.getVersionCode());
        b.a(parcel, 2, j1.akZ, false);
        b.a(parcel, 3, j1.qe, false);
        b.G(parcel, i);
    }

    public j co(Parcel parcel)
    {
        String s1 = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new j(i, s, s1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return co(parcel);
    }

    public j[] dW(int i)
    {
        return new j[i];
    }

    public Object[] newArray(int i)
    {
        return dW(i);
    }
}
