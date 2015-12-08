// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ns, nu

public class nt
    implements android.os.Parcelable.Creator
{

    public nt()
    {
    }

    static void a(ns ns1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, ns1.np());
        b.c(parcel, 1000, ns1.getVersionCode());
        b.c(parcel, 2, ns1.ns());
        b.a(parcel, 3, ns1.nt(), i, false);
        b.H(parcel, j);
    }

    public ns cP(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = -1;
        nu nu1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    nu1 = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, nu.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ns(i, j, k, nu1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cP(parcel);
    }

    public ns[] eL(int i)
    {
        return new ns[i];
    }

    public Object[] newArray(int i)
    {
        return eL(i);
    }
}
