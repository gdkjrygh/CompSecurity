// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ls

public class lt
    implements android.os.Parcelable.Creator
{

    public lt()
    {
    }

    static void a(ls ls1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, ls1.uid);
        b.c(parcel, 1000, ls1.getVersionCode());
        b.a(parcel, 2, ls1.packageName, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cu(parcel);
    }

    public ls cu(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
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
                return new ls(i, j, s);
            }
        } while (true);
    }

    public ls[] ei(int i)
    {
        return new ls[i];
    }

    public Object[] newArray(int i)
    {
        return ei(i);
    }
}
