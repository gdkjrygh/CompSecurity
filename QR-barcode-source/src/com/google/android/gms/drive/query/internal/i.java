// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            LogicalFilter, Operator, FilterHolder

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(LogicalFilter logicalfilter, Parcel parcel, int j)
    {
        int k = b.D(parcel);
        b.c(parcel, 1000, logicalfilter.BR);
        b.a(parcel, 1, logicalfilter.QK, j, false);
        b.c(parcel, 2, logicalfilter.QX, false);
        b.H(parcel, k);
    }

    public LogicalFilter aQ(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        Operator operator = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1: // '\001'
                    operator = (Operator)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Operator.CREATOR);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, FilterHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LogicalFilter(j, operator, arraylist);
            }
        } while (true);
    }

    public LogicalFilter[] cc(int j)
    {
        return new LogicalFilter[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aQ(parcel);
    }

    public Object[] newArray(int j)
    {
        return cc(j);
    }
}
