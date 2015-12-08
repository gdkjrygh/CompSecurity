// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jr, jn

public class js
    implements android.os.Parcelable.Creator
{

    public js()
    {
    }

    static void a(jr jr1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1000, jr1.xJ);
        b.a(parcel, 2, jr1.ja(), i, false);
        b.a(parcel, 3, jr1.getInterval());
        b.c(parcel, 4, jr1.getPriority());
        b.G(parcel, j);
    }

    public jr bx(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        jn jn1 = null;
        long l1 = jr.Wj;
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
                    jn1 = (jn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, jn.CREATOR);
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
                return new jr(j, jn1, l1, i);
            }
        } while (true);
    }

    public jr[] cS(int i)
    {
        return new jr[i];
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
