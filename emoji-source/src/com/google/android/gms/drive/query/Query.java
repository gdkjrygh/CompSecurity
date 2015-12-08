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

// Referenced classes of package com.google.android.gms.drive.query:
//            a, SortOrder, Filter

public class Query
    implements SafeParcelable
{
    public static class Builder
    {

        private String KF;
        private SortOrder KG;
        private final List KH = new ArrayList();

        public Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                KH.add(filter);
            }
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.Lf, KH), KF, KG);
        }

        public Builder setPageToken(String s)
        {
            KF = s;
            return this;
        }

        public Builder setSortOrder(SortOrder sortorder)
        {
            KG = sortorder;
            return this;
        }

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final LogicalFilter KE;
    final String KF;
    final SortOrder KG;
    final int xM;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder)
    {
        xM = i;
        KE = logicalfilter;
        KF = s;
        KG = sortorder;
    }

    Query(LogicalFilter logicalfilter, String s, SortOrder sortorder)
    {
        this(1, logicalfilter, s, sortorder);
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return KE;
    }

    public String getPageToken()
    {
        return KF;
    }

    public SortOrder getSortOrder()
    {
        return KG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
