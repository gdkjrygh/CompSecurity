// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth:
//            TokenData

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(TokenData tokendata, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, tokendata.a);
        c.a(parcel, 2, tokendata.a(), false);
        c.a(parcel, tokendata.b());
        c.a(parcel, 4, tokendata.c());
        c.a(parcel, 5, tokendata.d());
        c.a(parcel, 6, tokendata.e(), false);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist = null;
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, k);
                    if (k == 0)
                    {
                        long1 = null;
                    } else
                    {
                        if (k != 8)
                        {
                            throw new b((new StringBuilder("Expected size 8 got ")).append(k).append(" (0x").append(Integer.toHexString(k)).append(")").toString(), parcel);
                        }
                        long1 = Long.valueOf(parcel.readLong());
                    }
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
