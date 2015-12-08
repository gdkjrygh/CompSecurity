// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            am, m

public class an
    implements android.os.Parcelable.Creator
{

    public an()
    {
    }

    static void a(am am1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, am1.versionCode);
        b.c(parcel, 2, am1.statusCode);
        b.a(parcel, 3, am1.alO, i, false);
        b.G(parcel, j);
    }

    public am cH(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        m m1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    m1 = (m)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, m.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new am(i, j, m1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cH(parcel);
    }

    public am[] eq(int i)
    {
        return new am[i];
    }

    public Object[] newArray(int i)
    {
        return eq(i);
    }
}
