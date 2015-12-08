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
    final int BR;
    final ComparisonFilter QO;
    final FieldOnlyFilter QP;
    final LogicalFilter QQ;
    final NotFilter QR;
    final InFilter QS;
    final MatchAllFilter QT;
    final HasFilter QU;
    private final Filter QV;

    FilterHolder(int i, ComparisonFilter comparisonfilter, FieldOnlyFilter fieldonlyfilter, LogicalFilter logicalfilter, NotFilter notfilter, InFilter infilter, MatchAllFilter matchallfilter, 
            HasFilter hasfilter)
    {
        BR = i;
        QO = comparisonfilter;
        QP = fieldonlyfilter;
        QQ = logicalfilter;
        QR = notfilter;
        QS = infilter;
        QT = matchallfilter;
        QU = hasfilter;
        if (QO != null)
        {
            QV = QO;
            return;
        }
        if (QP != null)
        {
            QV = QP;
            return;
        }
        if (QQ != null)
        {
            QV = QQ;
            return;
        }
        if (QR != null)
        {
            QV = QR;
            return;
        }
        if (QS != null)
        {
            QV = QS;
            return;
        }
        if (QT != null)
        {
            QV = QT;
            return;
        }
        if (QU != null)
        {
            QV = QU;
            return;
        } else
        {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter)
    {
        BR = 2;
        Object obj;
        if (filter instanceof ComparisonFilter)
        {
            obj = (ComparisonFilter)filter;
        } else
        {
            obj = null;
        }
        QO = ((ComparisonFilter) (obj));
        if (filter instanceof FieldOnlyFilter)
        {
            obj = (FieldOnlyFilter)filter;
        } else
        {
            obj = null;
        }
        QP = ((FieldOnlyFilter) (obj));
        if (filter instanceof LogicalFilter)
        {
            obj = (LogicalFilter)filter;
        } else
        {
            obj = null;
        }
        QQ = ((LogicalFilter) (obj));
        if (filter instanceof NotFilter)
        {
            obj = (NotFilter)filter;
        } else
        {
            obj = null;
        }
        QR = ((NotFilter) (obj));
        if (filter instanceof InFilter)
        {
            obj = (InFilter)filter;
        } else
        {
            obj = null;
        }
        QS = ((InFilter) (obj));
        if (filter instanceof MatchAllFilter)
        {
            obj = (MatchAllFilter)filter;
        } else
        {
            obj = null;
        }
        QT = ((MatchAllFilter) (obj));
        if (filter instanceof HasFilter)
        {
            obj = (HasFilter)filter;
        } else
        {
            obj = null;
        }
        QU = ((HasFilter) (obj));
        if (QO == null && QP == null && QQ == null && QR == null && QS == null && QT == null && QU == null)
        {
            throw new IllegalArgumentException("Invalid filter type or null filter.");
        } else
        {
            QV = filter;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Filter getFilter()
    {
        return QV;
    }

    public String toString()
    {
        return String.format("FilterHolder[%s]", new Object[] {
            QV
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
