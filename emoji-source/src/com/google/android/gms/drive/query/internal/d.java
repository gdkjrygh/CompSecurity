// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterHolder, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(FilterHolder filterholder, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, filterholder.KP, i, false);
        b.c(parcel, 1000, filterholder.xM);
        b.a(parcel, 2, filterholder.KQ, i, false);
        b.a(parcel, 3, filterholder.KR, i, false);
        b.a(parcel, 4, filterholder.KS, i, false);
        b.a(parcel, 5, filterholder.KT, i, false);
        b.a(parcel, 6, filterholder.KU, i, false);
        b.a(parcel, 7, filterholder.KV, i, false);
        b.G(parcel, j);
    }

    public FilterHolder aI(Parcel parcel)
    {
        HasFilter hasfilter = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        MatchAllFilter matchallfilter = null;
        InFilter infilter = null;
        NotFilter notfilter = null;
        LogicalFilter logicalfilter = null;
        FieldOnlyFilter fieldonlyfilter = null;
        ComparisonFilter comparisonfilter = null;
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

                case 1: // '\001'
                    comparisonfilter = (ComparisonFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ComparisonFilter.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    fieldonlyfilter = (FieldOnlyFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FieldOnlyFilter.CREATOR);
                    break;

                case 3: // '\003'
                    logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 4: // '\004'
                    notfilter = (NotFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, NotFilter.CREATOR);
                    break;

                case 5: // '\005'
                    infilter = (InFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, InFilter.CREATOR);
                    break;

                case 6: // '\006'
                    matchallfilter = (MatchAllFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MatchAllFilter.CREATOR);
                    break;

                case 7: // '\007'
                    hasfilter = (HasFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, HasFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FilterHolder(i, comparisonfilter, fieldonlyfilter, logicalfilter, notfilter, infilter, matchallfilter, hasfilter);
            }
        } while (true);
    }

    public FilterHolder[] bE(int i)
    {
        return new FilterHolder[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aI(parcel);
    }

    public Object[] newArray(int i)
    {
        return bE(i);
    }
}
