// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            ComparisonFilter, Operator

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ComparisonFilter comparisonfilter, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1000, comparisonfilter.xM);
        b.a(parcel, 1, comparisonfilter.KL, i, false);
        b.a(parcel, 2, comparisonfilter.KM, i, false);
        b.G(parcel, j);
    }

    public ComparisonFilter aF(Parcel parcel)
    {
        MetadataBundle metadatabundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        Operator operator = null;
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

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 1: // '\001'
                    operator = (Operator)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Operator.CREATOR);
                    break;

                case 2: // '\002'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MetadataBundle.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ComparisonFilter(i, operator, metadatabundle);
            }
        } while (true);
    }

    public ComparisonFilter[] bB(int i)
    {
        return new ComparisonFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aF(parcel);
    }

    public Object[] newArray(int i)
    {
        return bB(i);
    }
}
