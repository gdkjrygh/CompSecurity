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

public static class Sb
{

    private String RZ;
    private SortOrder Sa;
    private List Sb;
    private final List Sc;

    public Sb addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            Sc.add(filter);
        }
        return this;
    }

    public Query build()
    {
        return new Query(new LogicalFilter(Operator.SB, Sc), RZ, Sa, Sb);
    }

    public Sb setPageToken(String s)
    {
        RZ = s;
        return this;
    }

    public RZ setSortOrder(SortOrder sortorder)
    {
        Sa = sortorder;
        return this;
    }

    public tor()
    {
        Sc = new ArrayList();
    }

    public Sc(Query query)
    {
        Sc = new ArrayList();
        Sc.add(query.getFilter());
        RZ = query.getPageToken();
        Sa = query.getSortOrder();
        Sb = query.jb();
    }
}
