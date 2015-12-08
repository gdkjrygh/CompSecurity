// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            mp

public class mq
    implements android.os.Parcelable.Creator
{

    public mq()
    {
    }

    static void a(mp mp1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.a(parcel, 1, mp1.uO, false);
        b.c(parcel, 1000, mp1.BR);
        b.H(parcel, i);
    }

    public mp cC(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new mp(i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cC(parcel);
    }

    public mp[] es(int i)
    {
        return new mp[i];
    }

    public Object[] newArray(int i)
    {
        return es(i);
    }
}
