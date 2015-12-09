// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            gd

public class ge
    implements android.os.Parcelable.Creator
{

    public ge()
    {
    }

    static void a(gd gd1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, gd1.getVersionCode());
        b.b(parcel, 2, gd1.fn(), false);
        b.a(parcel, 3, gd1.fo(), false);
        b.F(parcel, i);
    }

    public gd[] X(int i)
    {
        return new gd[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return v(parcel);
    }

    public Object[] newArray(int i)
    {
        return X(i);
    }

    public gd v(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, gd.a.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new gd(i, arraylist, s);
            }
        } while (true);
    }
}
