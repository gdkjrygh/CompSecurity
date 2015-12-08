// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jy, ju, jw

public class jz
    implements android.os.Parcelable.Creator
{

    public jz()
    {
    }

    static void a(jy jy1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, jy1.getVersionCode());
        b.a(parcel, 2, jy1.adn, false);
        b.a(parcel, 3, jy1.pm, false);
        b.a(parcel, 4, jy1.adr, i, false);
        b.a(parcel, 5, jy1.ads, i, false);
        b.a(parcel, 6, jy1.adt, i, false);
        b.F(parcel, j);
    }

    public jy bx(Parcel parcel)
    {
        jw jw1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        jw jw2 = null;
        ju ju1 = null;
        String s = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 4: // '\004'
                    ju1 = (ju)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ju.CREATOR);
                    break;

                case 5: // '\005'
                    jw2 = (jw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jw.CREATOR);
                    break;

                case 6: // '\006'
                    jw1 = (jw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jw.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jy(i, s1, s, ju1, jw2, jw1);
            }
        } while (true);
    }

    public jy[] cL(int i)
    {
        return new jy[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bx(parcel);
    }

    public Object[] newArray(int i)
    {
        return cL(i);
    }
}
