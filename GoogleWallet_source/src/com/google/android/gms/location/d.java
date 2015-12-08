// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationStatus

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LocationStatus locationstatus, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, locationstatus.atE);
        b.c(parcel, 1000, locationstatus.getVersionCode());
        b.c(parcel, 2, locationstatus.atF);
        b.a(parcel, 3, locationstatus.atG);
        b.J(parcel, i);
    }

    public static LocationStatus fk(Parcel parcel)
    {
        int i = 1;
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int k = 0;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationStatus(k, j, i, l1);
            }
        } while (true);
    }

    private static LocationStatus[] hz(int i)
    {
        return new LocationStatus[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fk(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hz(i);
    }
}
