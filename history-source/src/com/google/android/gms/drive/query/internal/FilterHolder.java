// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            d, ComparisonFilter, FieldOnlyFilter, LogicalFilter, 
//            NotFilter, InFilter, MatchAllFilter, HasFilter

public class FilterHolder
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int CK;
    final ComparisonFilter Sl;
    final FieldOnlyFilter Sm;
    final LogicalFilter Sn;
    final NotFilter So;
    final InFilter Sp;
    final MatchAllFilter Sq;
    final HasFilter Sr;
    private final Filter Ss;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter)
    {
        CK = i;
        Sl = comparisonfilter;
        Sm = fieldonlyfilter;
        Sn = logicalfilter;
        So = notfilter;
        Sp = infilter;
        Sq = matchallfilter;
        Sr = hasfilter;
        if (Sl != null)
        {
            Ss = Sl;
            return;
        }
        if (Sm != null)
        {
            Ss = Sm;
            return;
        }
        if (Sn != null)
        {
            Ss = Sn;
            return;
        }
        if (So != null)
        {
            Ss = So;
            return;
        }
        if (Sp != null)
        {
            Ss = Sp;
            return;
        }
        if (Sq != null)
        {
            Ss = Sq;
            return;
        }
        if (Sr != null)
        {
            Ss = Sr;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        CK = 2;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        Sl = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        Sm = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        Sn = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        So = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        Sp = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        Sq = ((MatchAllFilter) (obj));
        if (filter instanceof HasFilter)
        {
            obj = (HasFilter)filter;
        } else
        {
            obj = null;
        }
        Sr = ((HasFilter) (obj));
        if (Sl == null && Sm == null && Sn == null && So == null && Sp == null && Sq == null && Sr == null)
        {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        } else
        {
            Ss = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return Ss;
    }

    public String toString()
    {
        return String.format("FilterHolder[%s]", new Object[] {
            Ss
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
