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
    private List KH;
    final Operator KL;
    final List KY;
    final int xM;

    LogicalFilter(int i, Operator operator, List list)
    {
        xM = i;
        KL = operator;
        KY = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        xM = 1;
        KL = operator;
        KY = new ArrayList(afilter.length + 1);
        KY.add(new FilterHolder(filter));
        KH = new ArrayList(afilter.length + 1);
        KH.add(filter);
        int j = afilter.length;
        for (int i = 0; i < j; i++)
        {
            operator = afilter[i];
            KY.add(new FilterHolder(operator));
            KH.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        xM = 1;
        KL = operator;
        KH = new ArrayList();
        KY = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); KY.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            KH.add(iterable);
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
