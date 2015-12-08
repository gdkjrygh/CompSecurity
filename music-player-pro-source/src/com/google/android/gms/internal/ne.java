// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            nd

public class ne
    implements android.os.Parcelable.Creator
{

    public ne()
    {
    }

    static void a(nd nd1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, nd1.uid);
        b.c(parcel, 1000, nd1.getVersionCode());
        b.a(parcel, 2, nd1.packageName, false);
        b.H(parcel, i);
    }

    public nd cL(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new nd(i, j, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cL(parcel);
    }

    public nd[] eF(int i)
    {
        return new nd[i];
    }

    public Object[] newArray(int i)
    {
        return eF(i);
    }
}
