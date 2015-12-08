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
//            AbstractFilter, i, FilterHolder, f, 
//            Operator

public class LogicalFilter extends AbstractFilter
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int BR;
    private List QF;
    final Operator QK;
    final List QX;

    LogicalFilter(int j, Operator operator, List list)
    {
        BR = j;
        QK = operator;
        QX = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        BR = 1;
        QK = operator;
        QX = new ArrayList(afilter.length + 1);
        QX.add(new FilterHolder(filter));
        QF = new ArrayList(afilter.length + 1);
        QF.add(filter);
        int k = afilter.length;
        for (int j = 0; j < k; j++)
        {
            operator = afilter[j];
            QX.add(new FilterHolder(operator));
            QF.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        BR = 1;
        QK = operator;
        QF = new ArrayList();
        QX = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); QX.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            QF.add(iterable);
        }

    }

    public Object a(f f1)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = QX.iterator(); iterator.hasNext(); arraylist.add(((FilterHolder)iterator.next()).getFilter().a(f1))) { }
        return f1.b(QK, arraylist);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
