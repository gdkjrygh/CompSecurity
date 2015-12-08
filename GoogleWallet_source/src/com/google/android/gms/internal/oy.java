// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ox

public final class oy
    implements android.os.Parcelable.Creator
{

    public oy()
    {
    }

    static void a(ox ox1, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, ox1.uid);
        b.c(parcel, 1000, ox1.getVersionCode());
        b.a(parcel, 2, ox1.packageName, false);
        b.J(parcel, i);
    }

    private static ox fH(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ox(i, j, s);
            }
        } while (true);
    }

    private static ox[] hY(int i)
    {
        return new ox[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fH(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hY(i);
    }
}
