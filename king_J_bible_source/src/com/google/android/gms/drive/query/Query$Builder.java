// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder, Filter

public static class tor
{

    private String GB;
    private SortOrder GC;
    private final List GD = new ArrayList();

    public tor a(SortOrder sortorder)
    {
        GC = sortorder;
        return this;
    }

    public GC addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            GD.add(filter);
        }
        return this;
    }

    public Query build()
    {
        return new Query(new LogicalFilter(Operator.GZ, GD), GB, GC);
    }

    public GC setPageToken(String s)
    {
        GB = s;
        return this;
    }

    public tor()
    {
    }
}
