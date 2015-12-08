// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            d, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final ComparisonFilter GK;
    final FieldOnlyFilter GL;
    final LogicalFilter GM;
    final NotFilter GN;
    final InFilter GO;
    final MatchAllFilter GP;
    private final Filter GQ;
    final int xH;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter)
    {
        xH = i;
        GK = comparisonfilter;
        GL = fieldonlyfilter;
        GM = logicalfilter;
        GN = notfilter;
        GO = infilter;
        GP = matchallfilter;
        if (GK != null)
        {
            GQ = GK;
            return;
        }
        if (GL != null)
        {
            GQ = GL;
            return;
        }
        if (GM != null)
        {
            GQ = GM;
            return;
        }
        if (GN != null)
        {
            GQ = GN;
            return;
        }
        if (GO != null)
        {
            GQ = GO;
            return;
        }
        if (GP != null)
        {
            GQ = GP;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        xH = 1;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        GK = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        GL = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        GM = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        GN = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        GO = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        GP = ((MatchAllFilter) (obj));
        if (GK == null && GL == null && GM == null && GN == null && GO == null && GP == null)
        {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        } else
        {
            GQ = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
