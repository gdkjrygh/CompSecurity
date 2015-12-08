// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            dr, dt

public class ds
    implements android.os.Parcelable.Creator
{

    public ds()
    {
    }

    static void a(dr dr1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, dr1.getVersionCode());
        b.a(parcel, 2, dr1.bk(), i, false);
        b.C(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public dr l(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        dt dt1 = null;
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
                    dt1 = (dt)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, dt.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new dr(i, dt1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return z(i);
    }

    public dr[] z(int i)
    {
        return new dr[i];
    }
}
