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
    final int CK;
    private List Sc;
    final Operator Sh;
    final List Su;

    LogicalFilter(int j, Operator operator, List list)
    {
        CK = j;
        Sh = operator;
        Su = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        CK = 1;
        Sh = operator;
        Su = new ArrayList(afilter.length + 1);
        Su.add(new FilterHolder(filter));
        Sc = new ArrayList(afilter.length + 1);
        Sc.add(filter);
        int k = afilter.length;
        for (int j = 0; j < k; j++)
        {
            operator = afilter[j];
            Su.add(new FilterHolder(operator));
            Sc.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        CK = 1;
        Sh = operator;
        Sc = new ArrayList();
        Su = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); Su.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            Sc.add(iterable);
        }

    }

    public Object a(f f1)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = Su.iterator(); iterator.hasNext(); arraylist.add(((FilterHolder)iterator.next()).getFilter().a(f1))) { }
        return f1.b(Sh, arraylist);
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
