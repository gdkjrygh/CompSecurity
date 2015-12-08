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
    final ComparisonFilter KM;
    final FieldOnlyFilter KN;
    final LogicalFilter KO;
    final NotFilter KP;
    final InFilter KQ;
    final MatchAllFilter KR;
    final HasFilter KS;
    private final Filter KT;
    final int xJ;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter)
    {
        xJ = i;
        KM = comparisonfilter;
        KN = fieldonlyfilter;
        KO = logicalfilter;
        KP = notfilter;
        KQ = infilter;
        KR = matchallfilter;
        KS = hasfilter;
        if (KM != null)
        {
            KT = KM;
            return;
        }
        if (KN != null)
        {
            KT = KN;
            return;
        }
        if (KO != null)
        {
            KT = KO;
            return;
        }
        if (KP != null)
        {
            KT = KP;
            return;
        }
        if (KQ != null)
        {
            KT = KQ;
            return;
        }
        if (KR != null)
        {
            KT = KR;
            return;
        }
        if (KS != null)
        {
            KT = KS;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        xJ = 2;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        KM = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        KN = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        KO = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        KP = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        KQ = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        KR = ((MatchAllFilter) (obj));
        if (filter instanceof HasFilter)
        {
            obj = (HasFilter)filter;
        } else
        {
            obj = null;
        }
        KS = ((HasFilter) (obj));
        if (KM == null && KN == null && KO == null && KP == null && KQ == null && KR == null && KS == null)
        {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        } else
        {
            KT = filter;
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
