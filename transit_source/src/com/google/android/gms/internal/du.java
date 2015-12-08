// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            dt

public class du
    implements android.os.Parcelable.Creator
{

    public du()
    {
    }

    static void a(dt dt1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, dt1.getVersionCode());
        b.b(parcel, 2, dt1.bm(), false);
        b.C(parcel, i);
    }

    public dt[] A(int i)
    {
        return new dt[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return m(parcel);
    }

    public dt m(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, dt.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new dt(i, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return A(i);
    }
}
