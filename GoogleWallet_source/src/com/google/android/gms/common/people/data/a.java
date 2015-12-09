// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.people.data:
//            Audience, AudienceMember

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Audience audience, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.d(parcel, 1, audience.getAudienceMemberList(), false);
        b.c(parcel, 1000, audience.getVersionCode());
        b.c(parcel, 2, audience.getDomainRestricted());
        b.a(parcel, 3, audience.iY());
        b.a(parcel, 4, audience.isReadOnly());
        b.J(parcel, i);
    }

    public static Audience bV(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, AudienceMember.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Audience(j, arraylist, i, flag1, flag);
            }
        } while (true);
    }

    private static Audience[] dn(int i)
    {
        return new Audience[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return bV(parcel);
    }

    public final Object[] newArray(int i)
    {
        return dn(i);
    }
}
