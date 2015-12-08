// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, LogicalFilterCreator, FilterHolder, FilterVisitor, 
//            Operator

public class LogicalFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new LogicalFilterCreator();
    final List mFilterHolders;
    private List mFilters;
    final Operator mOperator;
    final int mVersionCode;

    LogicalFilter(int i, Operator operator, List list)
    {
        mVersionCode = i;
        mOperator = operator;
        mFilterHolders = list;
    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        mVersionCode = 1;
        mOperator = operator;
        mFilters = new ArrayList();
        mFilterHolders = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); mFilterHolders.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            mFilters.add(iterable);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public final Object visit(FilterVisitor filtervisitor)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mFilterHolders.iterator(); iterator.hasNext(); arraylist.add(((FilterHolder)iterator.next()).mFilter.visit(filtervisitor))) { }
        return filtervisitor.logicalOp(mOperator, arraylist);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LogicalFilterCreator.writeToParcel(this, parcel, i);
    }

}
