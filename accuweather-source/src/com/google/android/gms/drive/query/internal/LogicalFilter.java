// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            h, FilterHolder, Operator

public class LogicalFilter
    implements SafeParcelable, Filter
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private List KE;
    final Operator KI;
    final List KV;
    final int xJ;

    LogicalFilter(int i, Operator operator, List list)
    {
        xJ = i;
        KI = operator;
        KV = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        xJ = 1;
        KI = operator;
        KV = new ArrayList(afilter.length + 1);
        KV.add(new FilterHolder(filter));
        KE = new ArrayList(afilter.length + 1);
        KE.add(filter);
        int j = afilter.length;
        for (int i = 0; i < j; i++)
        {
            operator = afilter[i];
            KV.add(new FilterHolder(operator));
            KE.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        xJ = 1;
        KI = operator;
        KE = new ArrayList();
        KV = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); KV.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            KE.add(iterable);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
