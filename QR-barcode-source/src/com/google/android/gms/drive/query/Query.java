// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query:
//            a, SortOrder, Filter

public class Query
    implements SafeParcelable
{
    public static class Builder
    {

        private String QC;
        private SortOrder QD;
        private List QE;
        private final List QF;

        public Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                QF.add(filter);
            }
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.Re, QF), QC, QD, QE);
        }

        public Builder setPageToken(String s)
        {
            QC = s;
            return this;
        }

        public Builder setSortOrder(SortOrder sortorder)
        {
            QD = sortorder;
            return this;
        }

        public Builder()
        {
            QF = new ArrayList();
        }

        public Builder(Query query)
        {
            QF = new ArrayList();
            QF.add(query.getFilter());
            QC = query.getPageToken();
            QD = query.getSortOrder();
            QE = query.iq();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int BR;
    final LogicalFilter QB;
    final String QC;
    final SortOrder QD;
    final List QE;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list)
    {
        BR = i;
        QB = logicalfilter;
        QC = s;
        QD = sortorder;
        QE = list;
    }

    Query(LogicalFilter logicalfilter, String s, SortOrder sortorder, List list)
    {
        this(1, logicalfilter, s, sortorder, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return QB;
    }

    public String getPageToken()
    {
        return QC;
    }

    public SortOrder getSortOrder()
    {
        return QD;
    }

    public List iq()
    {
        return QE;
    }

    public String toString()
    {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s]", new Object[] {
            QB, QD, QC
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
