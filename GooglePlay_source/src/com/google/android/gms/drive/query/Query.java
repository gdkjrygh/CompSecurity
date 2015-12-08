// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.query:
//            QueryCreator, SortOrder, Filter

public class Query
    implements SafeParcelable
{
    public static final class Builder
    {

        public final List mFilters = new ArrayList();
        public SortOrder mSortOrder;

        public final Builder addFilter(Filter filter)
        {
            if (!(filter instanceof MatchAllFilter))
            {
                mFilters.add(filter);
            }
            return this;
        }

        public Builder()
        {
        }
    }

    public static interface SyncMoreResult
        extends Result
    {
    }


    public static final android.os.Parcelable.Creator CREATOR = new QueryCreator();
    public final LogicalFilter mFilter;
    final boolean mIncludeParents;
    final boolean mIncludeUnsubscribed;
    final String mPageToken;
    final List mRequestedMetadataFields;
    final SortOrder mSortOrder;
    private final Set mSpaces;
    final List mSpacesList;
    final int mVersionCode;

    private Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1, 
            Set set, boolean flag1)
    {
        mVersionCode = i;
        mFilter = logicalfilter;
        mPageToken = s;
        mSortOrder = sortorder;
        mRequestedMetadataFields = list;
        mIncludeParents = flag;
        mSpacesList = list1;
        mSpaces = set;
        mIncludeUnsubscribed = flag1;
    }

    Query(int i, LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, List list1, 
            boolean flag1)
    {
        Object obj;
        if (list1 == null)
        {
            obj = null;
        } else
        {
            obj = new HashSet(list1);
        }
        this(i, logicalfilter, s, sortorder, list, flag, list1, ((Set) (obj)), flag1);
    }

    private Query(LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, Set set, boolean flag1)
    {
        Object obj;
        if (set == null)
        {
            obj = null;
        } else
        {
            obj = new ArrayList(set);
        }
        this(1, logicalfilter, s, sortorder, list, flag, ((List) (obj)), set, flag1);
    }

    public Query(LogicalFilter logicalfilter, String s, SortOrder sortorder, List list, boolean flag, Set set, boolean flag1, 
            byte byte0)
    {
        this(logicalfilter, null, sortorder, null, false, null, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] {
            mFilter, mSortOrder, mPageToken, mSpacesList
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        QueryCreator.writeToParcel(this, parcel, i);
    }

}
