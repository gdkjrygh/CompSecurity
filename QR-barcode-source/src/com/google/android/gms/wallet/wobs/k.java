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
        i = b.D(parcel);
        b.c(parcel, 1, j1.getVersionCode());
        b.a(parcel, 2, j1.auJ, false);
        b.a(parcel, 3, j1.tG, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dL(parcel);
    }

    public j dL(Parcel parcel)
    {
        String s1 = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
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

    public j[] fO(int i)
    {
        return new j[i];
    }

    public Object[] newArray(int i)
    {
        return fO(i);
    }
}
