// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.MatchAllFilter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder, Filter

public static final class AllFilter
{

    public final List mFilters = new ArrayList();
    public SortOrder mSortOrder;

    public final AllFilter addFilter(Filter filter)
    {
        if (!(filter instanceof MatchAllFilter))
        {
            mFilters.add(filter);
        }
        return this;
    }

    public AllFilter()
    {
    }
}
