// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(DriveId driveid, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, driveid.xM);
        b.a(parcel, 2, driveid.HN, false);
        b.a(parcel, 3, driveid.HO);
        b.a(parcel, 4, driveid.HP);
        b.G(parcel, i);
    }

    public DriveId N(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        String s = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DriveId(i, s, l1, l);
            }
        } while (true);
    }

    public DriveId[] aH(int i)
    {
        return new DriveId[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return N(parcel);
    }

    public Object[] newArray(int i)
    {
        return aH(i);
    }
}
