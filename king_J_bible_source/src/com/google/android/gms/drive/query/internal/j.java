// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            Operator

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(Operator operator, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1000, operator.xH);
        b.a(parcel, 1, operator.mTag, false);
        b.F(parcel, i);
    }

    public Operator[] aQ(int i)
    {
        return new Operator[i];
    }

    public Operator am(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Operator(i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return am(parcel);
    }

    public Object[] newArray(int i)
    {
        return aQ(i);
    }
}
