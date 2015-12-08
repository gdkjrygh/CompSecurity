// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hh, hp

public class hi
    implements android.os.Parcelable.Creator
{

    public hi()
    {
    }

    static void a(hh hh1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, hh1.CX, false);
        b.c(parcel, 1000, hh1.CK);
        b.a(parcel, 3, hh1.CY, i, false);
        b.c(parcel, 4, hh1.CZ);
        b.a(parcel, 5, hh1.Da, false);
        b.H(parcel, j);
    }

    public hh[] L(int i)
    {
        return new hh[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return n(parcel);
    }

    public hh n(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        int i = -1;
        hp hp1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    hp1 = (hp)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, hp.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new hh(j, s, hp1, i, abyte0);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return L(i);
    }
}
