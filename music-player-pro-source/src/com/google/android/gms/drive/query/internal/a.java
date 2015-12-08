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
        int j = b.H(parcel);
        b.c(parcel, 1000, comparisonfilter.CK);
        b.a(parcel, 1, comparisonfilter.Sh, i, false);
        b.a(parcel, 2, comparisonfilter.Si, i, false);
        b.H(parcel, j);
    }

    public ComparisonFilter aS(Parcel parcel)
    {
        MetadataBundle metadatabundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        Operator operator = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
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

    public ComparisonFilter[] ch(int i)
    {
        return new ComparisonFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aS(parcel);
    }

    public Object[] newArray(int i)
    {
        return ch(i);
    }
}
