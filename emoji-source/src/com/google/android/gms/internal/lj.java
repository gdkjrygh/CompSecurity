// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            li

public class lj
    implements android.os.Parcelable.Creator
{

    public lj()
    {
    }

    static void a(li li1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, li1.getVersionCode());
        b.a(parcel, 2, li1.ake, false);
        b.a(parcel, 3, li1.akf, false);
        b.G(parcel, i);
    }

    public li cf(Parcel parcel)
    {
        String as[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        byte abyte0[][] = (byte[][])null;
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
                    as = com.google.android.gms.common.internal.safeparcel.a.A(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new li(i, as, abyte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cf(parcel);
    }

    public li[] dL(int i)
    {
        return new li[i];
    }

    public Object[] newArray(int i)
    {
        return dL(i);
    }
}
