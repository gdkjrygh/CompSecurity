// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            kv

public class kw
    implements android.os.Parcelable.Creator
{

    public kw()
    {
    }

    static void a(kv kv1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, kv1.getVersionCode());
        b.c(parcel, 2, kv1.hZ(), false);
        b.a(parcel, 3, kv1.ia(), false);
        b.H(parcel, i);
    }

    public kv O(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, kv.a.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new kv(i, arraylist, s);
            }
        } while (true);
    }

    public kv[] aP(int i)
    {
        return new kv[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return O(parcel);
    }

    public Object[] newArray(int i)
    {
        return aP(i);
    }
}
