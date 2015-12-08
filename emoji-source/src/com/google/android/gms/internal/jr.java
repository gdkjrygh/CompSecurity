// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jq, jm

public class jr
    implements android.os.Parcelable.Creator
{

    public jr()
    {
    }

    static void a(jq jq1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1000, jq1.xM);
        b.a(parcel, 2, jq1.jf(), i, false);
        b.a(parcel, 3, jq1.getInterval());
        b.c(parcel, 4, jq1.getPriority());
        b.G(parcel, j);
    }

    public jq bx(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        jm jm1 = null;
        long l1 = jq.Wm;
        int i = 102;
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

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    jm1 = (jm)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, jm.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new jq(j, jm1, l1, i);
            }
        } while (true);
    }

    public jq[] cS(int i)
    {
        return new jq[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bx(parcel);
    }

    public Object[] newArray(int i)
    {
        return cS(i);
    }
}
