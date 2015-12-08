// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ny, nu

public class nz
    implements android.os.Parcelable.Creator
{

    public nz()
    {
    }

    static void a(ny ny1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1000, ny1.CK);
        b.a(parcel, 2, ny1.nt(), i, false);
        b.a(parcel, 3, ny1.getInterval());
        b.c(parcel, 4, ny1.getPriority());
        b.H(parcel, j);
    }

    public ny cS(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        nu nu1 = null;
        long l1 = ny.ahz;
        int i = 102;
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

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    nu1 = (nu)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, nu.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ny(j, nu1, l1, i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cS(parcel);
    }

    public ny[] eO(int i)
    {
        return new ny[i];
    }

    public Object[] newArray(int i)
    {
        return eO(i);
    }
}
