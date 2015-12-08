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

        private String GB;
        private SortOrder GC;
        private final List GD = new ArrayList();

        public Builder a(SortOrder sortorder)
        {
            GC = sortorder;
            return this;
        }

        public Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                GD.add(filter);
            }
            return this;
        }

        public Query build()
        {
            return new Query(new LogicalFilter(Operator.GZ, GD), GB, GC);
        }

        public Builder setPageToken(String s)
        {
            GB = s;
            return this;
        }

        public Builder()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final LogicalFilter GA;
    final String GB;
    final SortOrder GC;
    final int xH;

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder)
    {
        xH = i;
        GA = logicalfilter;
        GB = s;
        GC = sortorder;
    }

    Query(LogicalFilter logicalfilter, String s, SortOrder sortorder)
    {
        this(1, logicalfilter, s, sortorder);
    }

    public int describeContents()
    {
        return 0;
    }

    public SortOrder fV()
    {
        return GC;
    }

    public Filter getFilter()
    {
        return GA;
    }

    public String getPageToken()
    {
        return GB;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
