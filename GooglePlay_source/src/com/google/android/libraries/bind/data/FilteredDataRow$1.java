// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.data:
//            FilteredDataRow, Data, DataList, Filter

final class ilterRefreshTask extends ilterRefreshTask
{

    final FilteredDataRow this$0;
    final Data val$rowData;

    protected final List getSourceData()
    {
        if (val$rowData == null)
        {
            return null;
        } else
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(val$rowData);
            return arraylist;
        }
    }

    ilterRefreshTask(Executor executor, Filter filter, DataList datalist1, Data data)
    {
        this$0 = final_filtereddatarow;
        val$rowData = data;
        super(DataList.this, executor, filter, datalist1);
    }
}
