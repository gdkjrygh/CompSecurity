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
//            g, FilterHolder, Operator

public class LogicalFilter
    implements SafeParcelable, Filter
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private List GD;
    final Operator GG;
    final List GS;
    final int xH;

    LogicalFilter(int i, Operator operator, List list)
    {
        xH = i;
        GG = operator;
        GS = list;
    }

    public transient LogicalFilter(Operator operator, Filter filter, Filter afilter[])
    {
        xH = 1;
        GG = operator;
        GS = new ArrayList(afilter.length + 1);
        GS.add(new FilterHolder(filter));
        GD = new ArrayList(afilter.length + 1);
        GD.add(filter);
        int j = afilter.length;
        for (int i = 0; i < j; i++)
        {
            operator = afilter[i];
            GS.add(new FilterHolder(operator));
            GD.add(operator);
        }

    }

    public LogicalFilter(Operator operator, Iterable iterable)
    {
        xH = 1;
        GG = operator;
        GD = new ArrayList();
        GS = new ArrayList();
        for (operator = iterable.iterator(); operator.hasNext(); GS.add(new FilterHolder(iterable)))
        {
            iterable = (Filter)operator.next();
            GD.add(iterable);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
