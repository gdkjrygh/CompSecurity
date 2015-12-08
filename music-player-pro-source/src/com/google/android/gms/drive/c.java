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
        i = b.H(parcel);
        b.c(parcel, 1, driveid.CK);
        b.a(parcel, 2, driveid.Ot, false);
        b.a(parcel, 3, driveid.Ou);
        b.a(parcel, 4, driveid.Ov);
        b.H(parcel, i);
    }

    public DriveId S(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        long l1 = 0L;
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

    public DriveId[] aY(int i)
    {
        return new DriveId[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return S(parcel);
    }

    public Object[] newArray(int i)
    {
        return aY(i);
    }
}
