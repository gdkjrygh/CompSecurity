// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(Scope scope, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, scope.mVersionCode);
        b.a(parcel, 2, scope.ik(), false);
        b.J(parcel, i);
    }

    private static Scope bM(Parcel parcel)
    {
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Scope(i, s);
            }
        } while (true);
    }

    private static Scope[] cO(int i)
    {
        return new Scope[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return bM(parcel);
    }

    public final Object[] newArray(int i)
    {
        return cO(i);
    }
}
