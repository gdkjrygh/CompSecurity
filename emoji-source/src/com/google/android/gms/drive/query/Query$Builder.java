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

    private String KF;
    private SortOrder KG;
    private final List KH = new ArrayList();

    public tor addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            KH.add(filter);
        }
        return this;
    }

    public Query build()
    {
        return new Query(new LogicalFilter(Operator.Lf, KH), KF, KG);
    }

    public KG setPageToken(String s)
    {
        KF = s;
        return this;
    }

    public KF setSortOrder(SortOrder sortorder)
    {
        KG = sortorder;
        return this;
    }

    public tor()
    {
    }
}
