// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            UserDataType

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(UserDataType userdatatype, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, userdatatype.vc, false);
        b.c(parcel, 1000, userdatatype.mVersionCode);
        b.c(parcel, 2, userdatatype.awS);
        b.J(parcel, i);
    }

    public static UserDataType fU(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new UserDataType(i, s, j);
            }
        } while (true);
    }

    private static UserDataType[] ip(int i)
    {
        return new UserDataType[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fU(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ip(i);
    }
}
