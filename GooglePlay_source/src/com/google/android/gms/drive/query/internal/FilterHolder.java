// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            FilterHolderCreator, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter, 
//            FullTextSearchFilter, OwnedByMeFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FilterHolderCreator();
    final ComparisonFilter mComparisionFilter;
    final InFilter mContainsFilter;
    final FieldOnlyFilter mFieldOnlyFilter;
    final Filter mFilter;
    final FullTextSearchFilter mFullTextSearchFilter;
    final HasFilter mHasFilter;
    final LogicalFilter mLogicalFilter;
    final MatchAllFilter mMatchAllFilter;
    final NotFilter mNotFilter;
    final OwnedByMeFilter mOwnedByMeFilter;
    final int mVersionCode;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter, FullTextSearchFilter fulltextsearchfilter, OwnedByMeFilter ownedbymefilter)
    {
        mVersionCode = i;
        mComparisionFilter = comparisonfilter;
        mFieldOnlyFilter = fieldonlyfilter;
        mLogicalFilter = logicalfilter;
        mNotFilter = notfilter;
        mContainsFilter = infilter;
        mMatchAllFilter = matchallfilter;
        mHasFilter = hasfilter;
        mFullTextSearchFilter = fulltextsearchfilter;
        mOwnedByMeFilter = ownedbymefilter;
        if (mComparisionFilter != null)
        {
            mFilter = mComparisionFilter;
            return;
        }
        if (mFieldOnlyFilter != null)
        {
            mFilter = mFieldOnlyFilter;
            return;
        }
        if (mLogicalFilter != null)
        {
            mFilter = mLogicalFilter;
            return;
        }
        if (mNotFilter != null)
        {
            mFilter = mNotFilter;
            return;
        }
        if (mContainsFilter != null)
        {
            mFilter = mContainsFilter;
            return;
        }
        if (mMatchAllFilter != null)
        {
            mFilter = mMatchAllFilter;
            return;
        }
        if (mHasFilter != null)
        {
            mFilter = mHasFilter;
            return;
        }
        if (mFullTextSearchFilter != null)
        {
            mFilter = mFullTextSearchFilter;
            return;
        }
        if (mOwnedByMeFilter != null)
        {
            mFilter = mOwnedByMeFilter;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        Preconditions.checkNotNull(filter, "Null filter.");
        mVersionCode = 2;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        mComparisionFilter = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        mFieldOnlyFilter = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        mLogicalFilter = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        mNotFilter = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        mContainsFilter = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        mMatchAllFilter = ((MatchAllFilter) (obj));
        if (filter instanceof HasFilter)
        {
            obj = (HasFilter)filter;
        } else
        {
            obj = null;
        }
        mHasFilter = ((HasFilter) (obj));
        if (filter instanceof FullTextSearchFilter)
        {
            obj = (FullTextSearchFilter)filter;
        } else
        {
            obj = null;
        }
        mFullTextSearchFilter = ((FullTextSearchFilter) (obj));
        if (filter instanceof OwnedByMeFilter)
        {
            obj = (OwnedByMeFilter)filter;
        } else
        {
            obj = null;
        }
        mOwnedByMeFilter = ((OwnedByMeFilter) (obj));
        if (mComparisionFilter == null && mFieldOnlyFilter == null && mLogicalFilter == null && mNotFilter == null && mContainsFilter == null && mMatchAllFilter == null && mHasFilter == null && mFullTextSearchFilter == null && mOwnedByMeFilter == null)
        {
            throw new IllegalArgumentException("Invalid filter type.");
        } else
        {
            mFilter = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("FilterHolder[%s]", new Object[] {
            mFilter
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FilterHolderCreator.writeToParcel(this, parcel, i);
    }

}
