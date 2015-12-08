// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            DrivePreferences

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(DrivePreferences drivepreferences, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, drivepreferences.CK);
        b.a(parcel, 2, drivepreferences.Ox);
        b.H(parcel, i);
    }

    public DrivePreferences T(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DrivePreferences(i, flag);
            }
        } while (true);
    }

    public DrivePreferences[] aZ(int i)
    {
        return new DrivePreferences[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return T(parcel);
    }

    public Object[] newArray(int i)
    {
        return aZ(i);
    }
}
