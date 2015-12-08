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

        private String RZ;
        private SortOrder Sa;
        private List Sb;
        private final List Sc;

        public Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                Sc.add(filter);
            }
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.SB, Sc), RZ, Sa, Sb);
        }

        public Builder setPageToken(String s)
        {
            RZ = s;
            return this;
        }

        public Builder setSortOrder(SortOrder sortorder)
        {
            Sa = sortorder;
            return this;
        }

        public Builder()
        {
            Sc = new ArrayList();
        }

        public Builder(Query query)
        {
            Sc = new ArrayList();
            Sc.add(query.getFilter());
            RZ = query.getPageToken();
            Sa = query.getSortOrder();
            Sb = query.jb();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int CK;
    final LogicalFilter RY;
    final String RZ;
    final SortOrder Sa;
    final List Sb;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list)
    {
        CK = i;
        RY = logicalfilter;
        RZ = s;
        Sa = sortorder;
        Sb = list;
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
        return RY;
    }

    public String getPageToken()
    {
        return RZ;
    }

    public SortOrder getSortOrder()
    {
        return Sa;
    }

    public List jb()
    {
        return Sb;
    }

    public String toString()
    {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s]", new Object[] {
            RY, Sa, RZ
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
