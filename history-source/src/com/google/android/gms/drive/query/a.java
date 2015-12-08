// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Query query, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1000, query.CK);
        b.a(parcel, 1, query.RY, i, false);
        b.a(parcel, 3, query.RZ, false);
        b.a(parcel, 4, query.Sa, i, false);
        b.b(parcel, 5, query.Sb, false);
        b.H(parcel, j);
    }

    public Query aQ(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        SortOrder sortorder = null;
        String s = null;
        LogicalFilter logicalfilter = null;
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
                    logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LogicalFilter.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    sortorder = (SortOrder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, SortOrder.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Query(i, logicalfilter, s, sortorder, arraylist);
            }
        } while (true);
    }

    public Query[] cf(int i)
    {
        return new Query[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aQ(parcel);
    }

    public Object[] newArray(int i)
    {
        return cf(i);
    }
}
