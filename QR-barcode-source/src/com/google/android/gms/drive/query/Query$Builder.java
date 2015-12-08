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

public static class QE
{

    private String QC;
    private SortOrder QD;
    private List QE;
    private final List QF;

    public QE addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            QF.add(filter);
        }
        return this;
    }

    public Query build()
    {
        return new Query(new LogicalFilter(Operator.Re, QF), QC, QD, QE);
    }

    public QE setPageToken(String s)
    {
        QC = s;
        return this;
    }

    public QC setSortOrder(SortOrder sortorder)
    {
        QD = sortorder;
        return this;
    }

    public tor()
    {
        QF = new ArrayList();
    }

    public QF(Query query)
    {
        QF = new ArrayList();
        QF.add(query.getFilter());
        QC = query.getPageToken();
        QD = query.getSortOrder();
        QE = query.iq();
    }
}
