// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth:
//            TokenData

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(TokenData tokendata, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, tokendata.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, tokendata.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, tokendata.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, tokendata.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, tokendata.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, tokendata.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int j = zza.a(parcel);
        boolean flag1 = false;
        Long long1 = null;
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    long1 = zza.g(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = zza.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenData(i, s, long1, flag1, flag, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TokenData[i];
    }
}
