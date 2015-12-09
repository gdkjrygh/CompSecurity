// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jo, jp, ju

public class jr
    implements android.os.Parcelable.Creator
{

    public jr()
    {
    }

    static void a(jo jo1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, jo1.getVersionCode());
        b.a(parcel, 2, jo1.label, false);
        b.a(parcel, 3, jo1.adg, i, false);
        b.a(parcel, 4, jo1.type, false);
        b.a(parcel, 5, jo1.abJ, i, false);
        b.F(parcel, j);
    }

    public jo bt(Parcel parcel)
    {
        ju ju1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
        jp jp1 = null;
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
                    jp1 = (jp)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jp.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 5: // '\005'
                    ju1 = (ju)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ju.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jo(i, s1, jp1, s, ju1);
            }
        } while (true);
    }

    public jo[] cH(int i)
    {
        return new jo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bt(parcel);
    }

    public Object[] newArray(int i)
    {
        return cH(i);
    }
}
